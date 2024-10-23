const delivery = document.getElementById('delivery');
const recojo = document.getElementById('recojo');

const d_option = document.getElementById('delivery-option');
const r_option = document.getElementById('recojo-option');

recojo.addEventListener('click', () => {
    recojo.classList.remove('bg-gris-oscuro');
    recojo.classList.add('bg-amarillo');

    delivery.classList.remove('bg-amarillo');
    delivery.classList.add('bg-gris-oscuro');

    r_option.style.display = 'block';
    d_option.style.display = 'none';
});

delivery.addEventListener('click', () => {
    delivery.classList.remove('bg-gris-oscuro');
    delivery.classList.add('bg-amarillo');

    recojo.classList.remove('bg-amarillo');
    recojo.classList.add('bg-gris-oscuro');

    d_option.style.display = 'block';
    r_option.style.display = 'none';
});