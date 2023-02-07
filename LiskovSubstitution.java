
class Polygon{
  public int findArea(int dimension){
    // some logic to find area
  }
}

class Square extends Polygon{
  public int findArea(int dimension){
    return dimension * dimension;
  }
}

class WrongSquare extends Polygon{
  public int findArea(int dimension){
    return dimension;
  }
}
