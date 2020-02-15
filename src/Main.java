public class Main {

    public static void main(String args[]){
        Libro libro1 = new Libro("El Resplandor", "Stephen King", "IFNG0NS", 800);
        Libro libro2 = new Libro("Juego de Tronos", "George R.R Martin", "JFGJEOJ", 1000);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        if (libro1.getNumPaginas()>libro2.getNumPaginas()){
            System.out.println("El libro "+libro1.getTitulo()+" tiene más páginas.");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()){
            System.out.println("El libro "+libro2.getTitulo()+" tiene más páginas.");
        } else if (libro1.getNumPaginas() == libro2.getNumPaginas()){
            System.out.println("El libro "+libro1.getNumPaginas()+" y el libro "+libro2.getNumPaginas()+
                    " tienen la misma cantidad de páginas.");
        }
    }
}
