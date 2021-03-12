# Calculator on Macbook
Step 1:
         Run jenkins server on 8080. 
         cmd:   brew services start jenkins-lts
Step2:
         Run Rundeck server on 4440.(path: ~/rundeck)(This folder containes jar file)
         change host to http://localhost:4440 in /Users/sai/rundeck/server/config/rundeck-config.properties
         cmd:   java -Xmx1024m "-Dserver.hostname=localhost" "-Dserver.http.port=4440" -jar rundeck-3.3.10-20210301.war -d
         
Step3:
       Use ngrok to tunnel you localhost:8080(jenkins server to public ip). and paste this IP in github webhooks.
       
Now for any change in github----> Jenkins ----> dockerbuild ----> dockerhub. 
       Github (webhooks) 
       Jenkins (build maven , test, build docker, push docker, and invoke Rundeck).
       Rundeck (when job invoked it pulls image from github and run the instance in local machine).
       
