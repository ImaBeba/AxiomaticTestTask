<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Заявки</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value="/res/bootstrap/bootstrap.min.css"/>" rel="stylesheet">
</head>
<body>
<div class="container py-4">
    <header class="d-flex justify-content-center py-3">
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="/" class="nav-link active" aria-current="page">Главная</a></li>
            <li class="nav-item"><a href="/loan-processing/step-1" class="nav-link">Оформить заявку</a></li>
            <li class="nav-item"><a href="/clients" class="nav-link">Список клиентов</a></li>
            <li class="nav-item"><a href="/loanApplications" class="nav-link">Список заявок</a></li>
            <li class="nav-item"><a href="/loanContracts" class="nav-link">Список договоров</a></li>
        </ul>
    </header>

    <main>
        <div class="py-5 text-center">
            <h2>Список заявок на кредит</h2>
        </div>

        <div class="table-responsive">
            <table class="table text-center">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Клиент</th>
                    <th scope="col">Желаемая сумма кредита</th>
                    <th scope="col">Статус одобрения</th>
                    <th scope="col">Действие</th>
                </tr>
                </thead>
                <tbody class="table-group-divider">
                <c:forEach var="loanApplication" items="${loanApplicationsList}">
                    <tr>
                        <th scope="row">${loanApplication.id}</th>
                        <td>
                            <a href="/clients/${loanApplication.client.id}">
                                ${loanApplication.client}
                            </a>
                        </td>
                        <td>${loanApplication.desiredLoanAmount}</td>
                        <td>
                            <c:if test="${loanApplication.approvedLoanDecision != null}">Одобрен</c:if>
                            <c:if test="${loanApplication.approvedLoanDecision == null}">Не одобрен</c:if>
                        </td>
                        <td>
                            <a href="/loanApplications/${loanApplication.id}">Подробнее</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </main>

    <footer class="my-5 pt-5 text-muted text-center text-small">
        <p class="mb-1">&copy; 2022 Ryauzov Pavel</p>
    </footer>
</div>
</body>
</html>
