package lsc.web;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String bookname;
    public boolean isdeal;
    public boolean SBtype;
    public int bookID;
    public double oriprice;
    public double curprice;
    public String link;
    public String intro;
    public String category;
    public String picURL;

    public Book() {}

    public static boolean salebook(JdbcTemplate sql, int bookID, String bookname, String category, double oriprice, double curprice, String link, String intro) {
        try{
            sql.update("insert into book (bookID, bookname, isdeal, SBtype, oriprice, curprice, link, intro, category) values(?,?,?,?,?,?,?,?,?)",new Object[] {bookID, bookname, false, true, oriprice, curprice, link, intro, category});
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean buybook(JdbcTemplate sql, int bookID, String bookname, String category, double curprice, String link, String intro) {
        try{
            sql.update("insert into book (bookID, bookname, isdeal, SBtype, curprice, link, intro, category) values(?,?,?,?,?,?,?,?)",new Object[] {bookID, bookname, false, false, curprice, link, intro, category});
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static List<Book> search(String info) {
        List<Book> books = new ArrayList<Book>();
        return books;
    }
}
