# 🎨 Interfaces en Java Swing  

👤 Autor: **Ángel Japón Castañeda**  

Este repositorio contiene ejemplos de **interfaces gráficas en Java Swing**, mostrando distintos tipos de ventanas de inicio de sesión y una versión creativa inspirada en Pokémon.  

---

## 🚪 Ventana inicial básica  
Elementos incluidos:  
- 🏷️ **JLabel** → Texto (Username, Pass) y logo de la empresa.  
- ✏️ **JTextField** → Usuario y contraseña.  
- 🔒 **JPasswordField** → Contraseña oculta con `*`.  
- 🔘 **JRadioButton** → Aceptar términos y condiciones.  
- ☑️ **JCheckBox** → Aceptar recibir emails.  
- 🔲 **JButton** → Botón de acceso.  

🔧 Propiedades modificadas: `setText`, `setFont`, `setForeground`, `setBackground`, `setIcon`, `setHorizontalAlignment`, `setToolTipText`, `setEnabled`, `setEditable`.

---

## 🚪 Ventana inicial extendida  
Elementos añadidos:  
- 🏷️ **JLabel** → Username, Pass, Language.  
- 🌐 **JComboBox** → Selección de idioma.  
- 🖼️ **JLabel** con banners e iconos.  
- ✏️ **JTextField**, 🔒 **JPasswordField**, 🔘 **JRadioButton**, ☑️ **JCheckBox**, 🔲 **JButton**.  

🔧 Propiedades: mismas que la básica, con diseño adaptado (ej. estilo Ferrari, fuente Calibri en negrita).  

---

## 🎮 Ventana inicial creativa  

### 🐉 Team Tab  
- 🏷️ **JLabel** → Nombre, estadísticas, LVL y HP de cada Pokémon.  
- 🖼️ **JLabel** → Iconos de Pokémon.  
- ☑️ **JCheckBox** → Selección de Pokémon para eliminar/transferir.  
- 🔲 **JButton** → Sign in.  
- 📑 **JTabbedPane** → Organización en pestañas (Team, Objects, Eggs).  
- 📊 **JProgressBar** → % de vida de cada Pokémon.  
- 🔢 **JSpinner** → Nivel de los Pokémon.  

### 🎒 Objects Tab  
- 🏷️ **JLabel** → Nombre, descripción y precio de objetos.  
- 🖼️ **JLabel** → Iconos de objetos.  
- 🔢 **JSpinner** → Cantidad de cada objeto.  

### 🥚 Eggs Tab  
- 🏷️ **JLabel** → Lugar donde se encontró el huevo y pasos recorridos.  
- 🖼️ **JLabel** → Iconos de huevos Pokémon.  
- 🎚️ **JSlider** → Progreso de incubación de los huevos.  

🔧 Propiedades personalizadas: colores de fondo, iconos, alineación centrada, tooltips, activación y edición de componentes.  

---

## 🛠️ Tecnologías usadas  
- ☕ **Java**  
- 🖼️ **Swing (JLabel, JButton, JTextField, JPasswordField, JRadioButton, JCheckBox, JComboBox, JTabbedPane, JProgressBar, JSpinner, JSlider)**  

---

## 📸 Screenshots  
📌 La presentación incluye ejemplos con personalización de estilo, colores e iconos (Aston Martin, Ferrari y versión creativa de Pokémon).  

---

## 🚀 Objetivo  
Este proyecto muestra cómo crear **interfaces gráficas en Java** con distintos niveles de personalización y cómo integrar múltiples componentes visuales en aplicaciones de escritorio.
