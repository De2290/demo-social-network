$(document).ready(() => {


    axios.post("/api/loginbyUUID", {uuid: localStorage.getItem("uuid")})
        .then(response => {
            if (response.data) {
                $("#status").html("Login Successful!");
            } else {
                $("#status").html("Login Unsuccessful!");                
            }
        })
})