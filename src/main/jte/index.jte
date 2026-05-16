@param java.util.List<io.github.chubbyhippo.demo.Person> people
@param int nextPage

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Infinite Scroll with JTE</title>

    <script src="/webjars/htmx.org/2.0.10/dist/htmx.min.js"></script>

    <style>
        body {
            font-family: system-ui, sans-serif;
            max-width: 800px;
            margin: 40px auto;
            background: #f7f7f7;
        }

        h1 {
            margin-bottom: 24px;
        }

        .person {
            background: white;
            padding: 16px;
            margin-bottom: 12px;
            border-radius: 12px;
            box-shadow: 0 1px 4px rgba(0, 0, 0, 0.08);
        }

        .person strong {
            display: block;
            font-size: 18px;
        }

        .person span {
            display: block;
            color: #666;
            margin-top: 4px;
        }

        .loader {
            padding: 24px;
            text-align: center;
            color: #666;
        }
    </style>
</head>
<body>

<h1>People</h1>

<div id="people">
    @template.people(people = people, nextPage = nextPage)
</div>

</body>
</html>