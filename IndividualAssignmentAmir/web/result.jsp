<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile Submitted</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

    <main class="page-container">
        <section class="result-card">
            <div class="icon">✅</div>

            <h1>Profile Submitted</h1>
            <p class="subtitle">Your submitted information is shown below.</p>

            <div class="profile-details">
                <div class="detail-row">
                    <span class="detail-label">Full Name</span>
                    <span class="detail-value">${name}</span>
                </div>

                <div class="detail-row">
                    <span class="detail-label">Student ID</span>
                    <span class="detail-value">${studentId}</span>
                </div>

                <div class="detail-row">
                    <span class="detail-label">Program</span>
                    <span class="detail-value">${program}</span>
                </div>

                <div class="detail-row">
                    <span class="detail-label">Email</span>
                    <span class="detail-value">${email}</span>
                </div>

                <div class="detail-row">
                    <span class="detail-label">Hobbies</span>
                    <span class="detail-value">${hobbies}</span>
                </div>

                <div class="detail-row introduction-row">
                    <span class="detail-label">Self-Introduction</span>
                    <span class="detail-value introduction-text">${introduction}</span>
                </div>
            </div>

            <a class="back-button" href="${pageContext.request.contextPath}/index.html">
                Back to Form
            </a>
        </section>
    </main>

</body>
</html>
