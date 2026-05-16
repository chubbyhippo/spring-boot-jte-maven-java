@param java.util.List<io.github.chubbyhippo.demo.Person> people
@param int nextPage

@for(var person : people)
    <div class="person">
        <strong>${person.name()}</strong>
        <span>${person.email()}</span>
        <span>${person.jobTitle()}</span>
        <span>${person.city()}</span>
    </div>
@endfor

<div
        class="loader"
        hx-get="/people?page=${nextPage}"
        hx-trigger="revealed"
        hx-swap="outerHTML"
>
    Loading more people...
</div>