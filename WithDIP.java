public interface Mouse{
}

public interface Keyboard{
}

class Computer{
  
  private Keyboard keyboard;
  private Mouse mouse;
  
  Computer(Keyboard keyboard,Mouse mouse){
    this.keyboard = keyboard;
    this.mouse = mouse;
  }
}

class AcerKeyboard implements Keyboard{
}
class SamsungKeyboard implements Keyboard{
}

class DellMouse implements Mouse{
}


class Main{
  Keyboard keyboard = new SamsungKeyboard();
  Mouse mouse = new DellMouse();
  Computer  computer  = new Computer(keyboard,mouse);
}

