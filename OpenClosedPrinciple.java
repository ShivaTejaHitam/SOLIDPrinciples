class Phone{
  public void makeCall(){
  }
  
  public void sendMessage(){
  }
}

class SmartPhone extends Phone{
  
  @override
  public void makeCall(){
    // with conference call feature
  }
  
  public void videoCall(){
    // make a video call
  }
  
  @override
  public void sendMessage(){
    // send emoji
  }
    
}
