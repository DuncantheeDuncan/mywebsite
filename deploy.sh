#  to remove the existing app uncomment below line
# git remote rm heroku 
# git init #  run once
git add .
git commit -m "herouku commit" # not needed for heruku only for git
# heroku create # run once 
mvn clean heroku:deploy