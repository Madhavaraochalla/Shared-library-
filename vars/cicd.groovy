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
     deploy adapters: [tomcat9(credentialsId: '0fd54dbb-706f-4ddc-b969-${jobname}', path: '', url: 'http://${ip}:8080')], contextPath: '${appname}', war: '**/*.war'
}
