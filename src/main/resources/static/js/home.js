$(document).ready(() => {
    axios.get("/api/getAllPosts")
        .then(response => {
            console.log(response.data);
            response.data.forEach(e => {
                $("#mainPosts").append(`<div id="post"><p>${e.user}</p><br><img src="${e.url}" id="image"></img><br><p>${e.caption}</p><br></div>`)
            });
        })
})