/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./*.xhtml", "./js/**/*.js"],
  theme: {
    extend: {
      colors: {
        amarillo: "#e3962e",
        "amarillo-pastel": "#ffcb84",
        "rojo-opaco": "#bb6350",
        guinda: "#5c2323",
        "guinda-pastel": "#845555",
        "gris-oscuro": "#828282",
        ubicacion: "#9a6d6d",
      },
      fontFamily: {
        poppins: ["Poppins", "sans-serif"],
      },
      backgroundImage: {
        "comida-black": "url('/img/comida_black.jpg')",
        "footer-texture": "url('/img/footer-texture.png')",
      },
    },
  },
  plugins: [],
};
