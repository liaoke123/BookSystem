package com.booksystem.entity;
/*图书实体*/
public class Book {
    private Long bid; //图书编号
    private String bname; //图书名称
    private String bauthor; //图书作者

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                '}';
    }


    //无惨构造方法
    public Book(){}

    //有参构造方法
    public Book(Long bid, String bname, String bauthor) {
        this.bid = bid;
        this.bname = bname;
        this.bauthor = bauthor;
    }
}
