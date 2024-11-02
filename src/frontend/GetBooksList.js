fetch('http://localhost:8080/api/books/saved')
    .then(response => {
        if (!response.ok) {
            throw new Error('Failed to fetch books');
        }
        return response.json();
    })
    .then(savedBooks => {
        const booksListElement2 = document.getElementById('savedList');

        // const data = [books];

        savedBooks.forEach(saves => {
            const li = document.createElement('li');
            
            // const authorsNames = (data.authors && Array.isArray(data.authors)) 
            //     ? data.authors.map(author => author.name).join(', ') 
            //     : 'No authors listed';


                // const authorsNames = (book.authors && Array.isArray(book.authors)) 
                // ? book.authors.map(author => author.name).join(', ') 
                // : 'No authors listed';


                // const authorsNames = book.authors; //this works too




            li.textContent = `Name: ${saves.name}`;
            booksListElement2.appendChild(li);
        });
    })
    .catch(error => {
        console.error('Error fetching books:', error);
    });