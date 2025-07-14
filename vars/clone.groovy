def call(String url,String branch){
    echo "This is cloning the Code"
    git url: "${url}",branch:"${branch}"
    echo "Code Cloning Successfull"
}
