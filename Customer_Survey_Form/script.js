
function submitForm() {
    // Get form values
    var firstName = document.getElementById('firstName').value;
    var lastName = document.getElementById('lastName').value;
    var dateOfBirth = document.getElementById('dateOfBirth').value;
    var country = document.getElementById('country').value;

    var gender = Array.from(document.querySelectorAll('input[name="gender"]:checked')).map(e => e.value).join(', ');
    var profession = document.getElementById('profession').value;
    var email = document.getElementById('email').value;
    var mobileNumber = document.getElementById('mobileNumber').value;

    // Check if all fields are filled
    if (firstName && lastName && dateOfBirth && country && gender && profession && email && mobileNumber) {
        // Display popup with form values
        var popupContent = `
            <p><strong>First Name:</strong> ${firstName}</p>
            <p><strong>Last Name:</strong> ${lastName}</p>
            <p><strong>Date of Birth:</strong> ${dateOfBirth}</p>
            <p><strong>Country:</strong> ${country}</p>
            <p><strong>Gender:</strong> ${gender}</p>
            <p><strong>Profession:</strong> ${profession}</p>
            <p><strong>Email:</strong> ${email}</p>
            <p><strong>Mobile Number:</strong> ${mobileNumber}</p>
        `;
        document.getElementById('popup').innerHTML = popupContent;
        document.getElementById('popup').style.display = 'block';

        window.onclick = null;
        // Reset the form
        resetForm();
    } else {
        alert('Please fill in all fields before submitting.');
    }
}

function resetForm() {
    document.getElementById('surveyForm').reset();
}

//Close the popup on click outside
// window.onclick = function(event) {
//     var popup = document.getElementById('popup');
//     if (event.target == popup) {
//         popup.style.display = 'none';
//     }

// }







