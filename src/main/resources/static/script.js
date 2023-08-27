const fileInput = document.getElementById('fileInput');
const uploadButton = document.getElementById('uploadButton');
const resultDiv = document.getElementById('result');

// Function to display structured file information
function displayFileInformation(data) {
    const fileInfo = data.split(', ');

    const html = `
        <div class="file-info">
            <p>${fileInfo[0]}</p>
            <p>${fileInfo[1]}</p>
            <p>${fileInfo[2]}</p>
        </div>
    `;

    resultDiv.innerHTML = html;
}

uploadButton.addEventListener('click', () => {
    const file = fileInput.files[0];
    if (file) {
        const formData = new FormData();
        formData.append('file', file);

        fetch('/file/uploads', {
            method: 'POST',
            body: formData
        })
        .then(response => response.text())
        .then(data => {
            displayFileInformation(data);
        })
        .catch(error => {
            resultDiv.innerHTML = 'Error uploading file';
            console.error(error);
        });
    }
});
