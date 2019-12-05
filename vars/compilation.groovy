def call(Map Dircect =[:]){
//def call(String dirc){
 
  echo "$Dircect.Dirc"
  dir(Dircect.Dirc){
    echo 'hello'
    sh './gwb compile' 
  }
}
