mvn clean
mvn flyway:migrate
mvn package
mvn dependency:copy-dependencies
echo 'Successfully executed the required commands'

echo 'your App is running now'

 java -cp .:target/*: TempRun



#java $JAVA_OPTS -cp target/classes:target/dependency/* portfolio.Web
