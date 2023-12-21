def ConDownload(repo)
     {
           git "https://github.com/Madhavaraochalla/${repo}.git"
     }
         
def ConBuild()
{
 sh 'mvn package'
}

def ConDeploy(jobname,ip,appname)
{
    sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
