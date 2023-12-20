def
  cicd.ConDownload(repo)
         git "https://github.com/Madhavaraochalla/${repo}.git"

def
  cicd.ConBuild()
{
  sh 'mvn package'
}
