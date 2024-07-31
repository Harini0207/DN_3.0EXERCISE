public class Linear {
    public static Book linear(Book[] books, String bookName){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(bookName)){
                return book;
            }
        }
        return null;
    }
}
