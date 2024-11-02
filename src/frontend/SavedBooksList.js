
// onclick = function Post3() {fetch('http://localhost:8080/api/books/saved', {
// onclick = function Post3() {fetch('http://localhost:8080/api/books/saved', {
 // doing the code like this will make it run  ONLY whatever the last function
 //was for the onclick function//

 
 
 function Post() {fetch('http://localhost:8080/api/books/saved', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({ name: 'The Academy' }) // replace with actual data

})
.then(response => response.json())
.then(data => {
    console.log('Success:', data);
})


.catch(error => {
    console.error('Error:', error);
});

alert("This book was saved!");

}


 

 function Post2() {fetch('http://localhost:8080/api/books/saved', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({ name: 'Highest Bidder' }) // replace with actual data
})
.then(response => response.json())
.then(data => {
    console.log('Success:', data);
})
.catch(error => {
    console.error('Error:', error);
});

alert("This book was saved!");

}


 function Post3() {fetch('http://localhost:8080/api/books/saved', {
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

alert("This book was saved!");


}