def call(Map Dircect =[:]){
//def call(String dirc){
  echo "$Dircect.dirc"
  dir(Dircect.dirc){
    echo 'hello'
    sh './gwb compile' 
  }
}
