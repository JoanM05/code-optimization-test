# Documentacion:

1. **AgeValidation**:

   - Se importo la libreria Scanner para agragar interactividad.
   - Se remmplazo el magic number "18" por una constante.
   - Se agrego interactividad con el usuariop permitiendole ingresar la variable edad por tecldo.
   - Se remmplazo el if redundante por un else ya que al no cumplirse la primera condicion (age >= 18) el usuario no tendra la edad suficiente.
   - Se hace un test con varias edades para comprobar el correcto funcionamiento.

2. **Store**:

   - Declarar constantes para eliminar los valores magicos.
   - Hicimos un array para almacenar los valores de los precios y las cantidades de los productos.
   - Se declara y inicializa la variable 'totalSales': Variable que acumula el total de impuestos calculados.
   - Despues creamos un bucle for para iterra los arreglos y realizar las operaciones y asi obtener la cantidad de ventas.

3. **TaxCalculation**: 

   - Constantes:
      - PRODUCT_PRICES: Arreglo que almacena los precios de los productos que se están vendiendo.
      - TAX_RATES: Arreglo que contiene las tasas de impuesto aplicables a cada producto en el mismo índice que PRECIOS_PRODUCTOS.
      - TAX_THRESHOLD: Valor que determina el umbral para clasificar el total de impuestos como alto o bajo.
   - Se declara y inicializa la variable 'totalTex': Variable que acumula el total de impuestos calculados.
   - Se usa un bucle for para iterar sobre los precios de los productos y sus tasas de impuestos correspondientes. En cada iteración, se calcula el impuesto para ese producto y se suma al total.


