fetch('/products').then(function(response) {
    return response.json();
}).then(function(data) {

    console.log(data);
    printTable(data);


}).catch(function() {

    console.log("Error!");

});

function printTable(data)
{
    let table = document.getElementById('products');
    for (let j = 0; j <= data.length; j++)
    {
        let row = document.createElement("tr");
        let cell = document.createElement("td");

        cell.innerText = data[j].name;
        row.appendChild(cell);

        cell = document.createElement("td");

        cell.innerText = data[j].price;
        row.appendChild(cell);

        cell = document.createElement("td");
        let img = document.createElement('img');
        img.src = data[j].img_url == null ? "empty.jpg" : data[j].img_url;

        cell.append(img);
        row.appendChild(cell);

        cell = document.createElement("td");
        let button = document.createElement("button");
        button.innerText = 'Add';
        button.value = data[j].id;

        button.addEventListener(`click`, (e) => {
            alert("id = " + e.target.value);
        });
        cell.appendChild(button);
        row.appendChild(cell);
        table.appendChild(row);
    }
}