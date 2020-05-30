$(document).ready(() => {
    axios.get("/api/getAllPosts")
        .then(response => {
            console.log(response.data);
            response.data.forEach(e => {
                $("#mainPosts").append(`<div><p>${e.user}</p><br><img src="${e.url}"></img><br><p>${e.caption}</p><br></div>`)
            });
        })
})