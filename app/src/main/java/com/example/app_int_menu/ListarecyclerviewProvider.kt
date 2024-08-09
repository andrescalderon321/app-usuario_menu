package com.example.app_int_menu

class ListarecyclerviewProvider {
    companion object{
        val lista = listOf<Listar>(
            Listar("arepa con carne ","arepa rellena carne","arepa con doble carne desmechada ","https://comercio.marinilla.city/img/comercios/80/productos/444.jpg"),
            Listar("arepa asada ","arepa asada al carbon  ","contenido3","https://elestimulo.com/wp-content/uploads/2018/09/Arepa.-1100x618-1100x572.jpg"),
            Listar("arepa ","arepa rellena pollo ","contenido4","https://www.elespectador.com/resizer/v2/ZVT27NKSWFGLDCRYQ4KVQ2ZHMU.jpg?auth=1f81268d9a4e32dc802267a6209a8466e36de75f24485bb7aa85692d73f69527&width=1110&height=739&smart=true&quality=60"),
            Listar("arepa de huevo ","arepa de huevo costeña"," Arepa frita rellena de huevo ","https://steemitimages.com/DQmc4gZjLdfvLuLN1aSytQB1W9pDEvpsM1NhYjEZ1qBWr88/Recetas_SitePANIntl_Colombia_Destacada_arepa-de-huevo.jpg"),
            Listar("arepa con pollo","arepa_rellena de pollo con las salsas de la casa ","contenido3","https://www.lamayorista.com.co/recursos/images/recetas/35ba2-1511194117-arepa-rellena-venezolana-616.jpg"),
            Listar("arepa con huevo de codorniz  ","arepa rellena de maizitos,huevos de codorniz y pollo ","contenido4","https://speedy.uenicdn.com/338635af-2322-44e8-a134-fcefd0c69bff/c512_a/image/upload/v1594587503/business/98039939-2ec5-4bb0-9a20-cf33285e0388.jpg"),
            Listar("arepa con pollo y aguacate","arepa rellena de pollo y aguacate con salsas de la casa ","contenido5","https://nuval.com.co/wp-content/uploads/2022/02/Arepas-rellenas-con-pollo-y-aguacate.jpg"),

        )
        val listacafe = listOf<Listar>(
            Listar("capuccino ","arepa rellena queso","contenido2","data:image/jpeg;base64,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"),
            Listar("Cafe helado","cafe con una bola de helado de vainilla ","contenido3","https://www.recetasnestle.com.ar/sites/default/files/styles/recipe_detail_desktop/public/srh_recipes/510e1ffb455196ba91fa3670eba06bdc.webp?itok=dPVMANg_"),
            Listar("Cafe tinto ","vaso pequeño de cafe  ","contenido4","https://img.freepik.com/fotos-premium/cafe-tinto_561392-26.jpg?w=740"),
            Listar("Cafe con leche ","vaso de cafe con leche ","contenido2","https://static.wikia.nocookie.net/cafeteria/images/a/a1/Cafe-con-leche.jpg/revision/latest?cb=20120528001419&path-prefix=es"),
            Listar("Cafe expreso ","cafe expreso  ","contenido4","https://img.freepik.com/fotos-premium/cafe-expreso-aislado-ilustracion-ai-generativexa_118124-26247.jpg?w=740"),
            Listar("Granizado de cafe","granizado de cafe con crema de leche  ","contenido5","https://cdn.pixabay.com/photo/2023/07/03/18/33/ai-generated-8104791_1280.jpg"),
        )

        val listahelado = listOf<Listar>(
            Listar("Helado de cafe  ","helado de cafe en vaso ","contenido2","https://www.cocinatis.com/archivos/202207/CTIS0587-receta-helado-de-cafe_desktop_horizontal_full_width.jpg"),
            Listar("Helado de maracuya","helado de maracuya en vaso  ","contenido3","https://img.freepik.com/fotos-premium/helado-maracuya-splash-maracuya_747552-5979.jpg?w=360"),
            Listar("Helado de chicle ","helado de chicle en vaso  ","contenido4","https://www.eis-perfecto.de/wp-content/uploads/2024/06/Bubble-GumTwist-Eis-848x477.jpg"),
            Listar("Helado de ron con pasas ","helado de ron con pasas en vaso","contenido2","https://www.laylita.com/recetas/wp-content/uploads/2022/08/Receta-del-helado-de-ron-con-pasas.jpg"),
            Listar("Helado de fresa","helado de fresa en vaso ","contenido3","https://www.comedera.com/wp-content/uploads/2022/04/Helado-de-fresas-casero-shutterstock_1477385882.jpg"),
            Listar("Helado de chocolate ","helado de chocolate en vaso ","contenido4","https://www.comedera.com/wp-content/uploads/2022/04/Helado-de-chocolate-sin-azucar-casero-shutterstock_1418765711.jpg"),
            Listar("Helado de vainilla ","helado de vainilla en vaso ","contenido5","https://www.comedera.com/wp-content/uploads/2022/05/Helado-de-vainilla-sin-azucar.jpg"),

        )

        val listaperro = listOf<Listar>(
            Listar("choriperro  ","arepa rellena queso","contenido2","htttp/holamundo.com"),
            Listar("te","arepa_rellena res ","contenido3","htttp/holamundo.com"),
            Listar("cafe extra negro ","arepa rellena pollo ","contenido4","htttp/holamundo.com"),
            Listar("cafe con leche ","arepa rellena queso","contenido2","htttp/holamundo.com"),
            Listar("arepa con carne","arepa_rellena res ","contenido3","htttp/holamundo.com"),
            Listar("arepa de pollo ","arepa rellena pollo ","contenido4","htttp/holamundo.com"),
            Listar("arepa mixta","arepa rellena pollo y carne ","contenido5","htttp/holamundo.com"),
            Listar("arepa mixta","arepa rellena pollo y carne ","contenido5","htttp/holamundo.com"),
        )
    }
}