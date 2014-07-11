#!/bin/bash

# Exit on error
set -e

# Stashing curent changes
git stash

# Switching branches to GitHub pages
git checkout gh-pages

# Checking out the latest docs from master
git checkout master -- docs/*

# Committing changes to git
git commit -am "Update documentation"

# Updating origin remote
git push origin gh-pages

# Switching back to branch master
git checkout master

# Reapplying changes
git stash apply