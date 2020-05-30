$(document).ready(() => {
    var localStorage = window.localStorage;
    $(".postCreator").on("submit", e => {
        e.preventDefault();
        
        axios.post("/api/createNewPost", {
            username: localStorage.getItem("username"),
            url: $("#postImage").val(), 
            caption: $("#caption").val()
        }).then(response => {
            window.location.href = "/profile"
        })
    })
})