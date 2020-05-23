#  to remove the existing app uncomment below line
# git remote rm heroku 
git init
git add .
git commit -m "herouku commit"
heroku create
mvn clean heroku:deploy