import groovy.xml.MarkupBuilder

MarkupBuilder markupBuilder = new MarkupBuilder()

def listBooks = [
        [isbn: "978-1935182443", title: "Groovy in Action 2nd Edition", author: "Dierk Koenig", price: 50.58],
        [isbn: "978-1935182948", title: "Making Java Groovy", author: "Ken Kousen", price: 33.96],
        [isbn: "978-1937785307", title: "Programming Groovy 2: Dynamic Productivity for the Java Developer", author: "Venkat Subramaniam", price: 28.92]
]

markupBuilder.doubleQuotes = true

markupBuilder.books {
    listBooks.each { bookElem ->
        book(isbn: bookElem.isbn) {
            title bookElem.title
            author bookElem.author
            price bookElem.price
        }
    }
}

FileWriter fileWriter = new FileWriter('html/books.html')
MarkupBuilder markupBuilderHtml = new MarkupBuilder(fileWriter)
markupBuilder.doubleQuotes = true

markupBuilderHtml.html {
    head {
        title 'list of books'
    }
    body {
        h1 'List of books'
        section {
            h2 ''
            table {
                tr {
                    th 'isbn'
                    th 'title'
                    th 'author'
                    th 'price'
                }
                listBooks.each { bookElem ->
                    tr {
                        td bookElem.isbn
                        td bookElem.title
                        td bookElem.author
                        td bookElem.price
                    }
                }
            }
        }
    }
}