class Book{

    String title;
    String author;
    double price;
    int option;

    //constructor
    Book(String title, String author, double newPrice){
        title = title;
        author = author;
        price = newPrice;

    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getOption(){
        return option;
    }

  public void setPrice(int option, double price, double newPrice){
        if (option == 1){
            price = 20.00;
            newPrice = price;
        }
        else if (option == 2){
            price = 15.00;
            newPrice = price;
        }
        else if (option == 3){
            price = 23.90;
            newPrice = price;
        }
        else if (option == 4){
            price = 27.30;
            newPrice = price;
        }
        else if (option == 5){
            price = 50.00;
            newPrice = price;
        }
        else if (option == 6){
            price = 13.50;
            newPrice = price;
        }
    }
    public void setOption(int newOption){
        option = newOption;
    }
}
