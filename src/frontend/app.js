// Fetch books from the API and display them


fetch('http://localhost:8080/api/books')
    .then(response => {
        if (!response.ok) {
            throw new Error('Failed to fetch books');
        }
        return response.json();
    })
    .then(books => {
        const booksListElement = document.getElementById('booksList');

        // const data = [books];

        books.forEach(book => {
            const li = document.createElement('li');
            
            // const authorsNames = (data.authors && Array.isArray(data.authors)) 
            //     ? data.authors.map(author => author.name).join(', ') 
            //     : 'No authors listed';


                // const authorsNames = (book.authors && Array.isArray(book.authors)) 
                // ? book.authors.map(author => author.name).join(', ') 
                // : 'No authors listed';


                // const authorsNames = book.authors; //this works too




            li.textContent = `Title: ${book.title}, Authors: ${book.authorName}`;
            booksListElement.appendChild(li);
        });
    })
    .catch(error => {
        console.error('Error fetching books:', error);
    });
