#!/bin/bash

# Adding all files to git scope
git add .

# Stashing all changes
git stash

# Checking out GitHub pages branch
git checkout gh-pages

# Grabbing new docs from the stash, and putting them in the 'docs' folder
git checkout stash@{0} -- src/

# Changing directories
cd src

# Running javadoc
javadoc -d ../docs me.rukmal.commandme CommandMe

# Deleting source files
cd .. && rm -r src

# Committing changes to git
git commit -am "Update docs"

# Updating the remote
git push origin gh-pages

# Checking out master
git checkout master

# Re-applying changes
git stash apply

# Removing docs folder
rm -r docs

# Dropping old stash
git stash --drop
