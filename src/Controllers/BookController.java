package Controllers;
import Models.Book;
public class BookController {





public Book searchByName(Book[] libros, String name) {
int izquierda = 0;
int derecha = libros.length -1;

while ( izquierda <= derecha){
    int medio = izquierda -( derecha - izquierda)/2;
    if ( izquierda == derecha){
        return libros[medio];
    }
    if ( izquierda < derecha){
        izquierda = medio + 1;     
    }else{
        derecha = medio -1;        
    }
}
return null;
}


}


