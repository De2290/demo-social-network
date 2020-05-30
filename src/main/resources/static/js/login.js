$(document).ready(() => {
    var localStorage = window.localStorage;
    $(".loginform").on("submit", (e) => {
        e.preventDefault();
        axios.post("/api/login", {username: $("#username").val(), password: $("#password").val()})
            .then(response => {
                if (response.data) {
                    localStorage.setItem("uuid", response.data.uuid);
                    localStorage.setItem("username", response.data.username);
                    window.location.href = "/profile"
                }
            })
    })
})