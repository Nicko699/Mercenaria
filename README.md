# 🛒 Sistema de Compras Mercenaria

> Sistema simple de cálculo de costos de compra con descuentos y envío

## 📋 Descripción

Aplicación de consola en Java que calcula el costo total de una compra aplicando descuentos por monto y tarifas de envío según la cantidad de productos.

## 🎯 Funcionalidades

- ✅ Validación de entrada de datos
- 💰 Cálculo de descuentos por monto:
  - 5% para compras entre $100 y $300
  - 10% para compras mayores a $300
- 📦 Cálculo de costo de envío:
  - $10 USD para 5-15 productos
  - Gratis para más de 15 productos
- 🚫 Restricción de compra mínima de 5 productos

## 📊 Tabla de Descuentos

| Monto de compra | Descuento |
|-----------------|-----------|
| < $100 | Sin descuento |
| $100 - $300 | 5% |
| > $300 | 10% |

## 📦 Tabla de Envío

| Cantidad de productos | Costo de envío |
|-----------------------|----------------|
| < 5 | No permitido |
| 5 - 15 | $10 USD |
| > 15 | Gratis |

## 🚀 Cómo usar

### Requisitos
- Java JDK 8 o superior

### Ejecución

```bash
# Compilar
javac mercenaria/Mercenaria.java

# Ejecutar
java mercenaria.Mercenaria
```

### Ejemplo de uso

```
Ingrese la cantidad de productos
> 10

Ingrese el costo total
> 250

El costo del envío es de $10USD
Usted posee un descuento del 5% sobre el total. El nuevo monto a pagar es de: $247.0USD
```

## 🛠️ Tecnologías

- Java SE
- Scanner para entrada de datos
- Manejo de excepciones

## 👤 Autor

**Nicko699**
- GitHub: [@Nicko699](https://github.com/Nicko699)

---

💡 **Proyecto educativo para practicar condicionales y manejo de entrada/salida en Java**
