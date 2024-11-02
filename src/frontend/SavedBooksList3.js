

 onclick = function Post3() {fetch('http://localhost:8080/api/books/saved', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({ name: 'Gray After Dark: A Thriller' }) // replace with actual data
})
.then(response => response.json())
.then(data => {
    console.log('Success:', data);
})
.catch(error => {
    console.error('Error:', error);
});

 }