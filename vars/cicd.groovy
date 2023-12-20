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
     deploy adapters: [tomcat9(credentialsId: '0fd54dbb-706f-4ddc-b969-d046bd1a486b', path: '', url: 'http://172.31.4.118:8080')], contextPath: 'testapp', war: '**/*.war'
}
