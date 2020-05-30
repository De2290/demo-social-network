$(document).ready(() => {
    $(".registerform").on("submit", (e) => {
        e.preventDefault();
        axios.post("/api/register", {username: $("#username").val(), password: $("#password").val()})
            .then(response => {
                console.log(response.data);
                window.location.href = "/login";
            })
    });
});