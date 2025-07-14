def call(String ProjectName, String ImageTag, String DockerHubUser){
        echo "This is Building the code"
  bat "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
