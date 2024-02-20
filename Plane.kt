class Plane (var marka: String,
             var place_otpr: String,
             var place_nazn: String,
             var date_otpr: String,
             var time_otpr: String,
             var time_way: String,
             var class_plane:String,
             var classs_p: String,
             var type_of_way: String
    ){
    fun Input(a:Plane){
        a.marka= readLine().toString()
        a.place_otpr= readLine().toString()
        a.place_nazn= readLine().toString()
        a.date_otpr= readLine().toString()
        a.time_otpr= readLine().toString()
        a.time_way= readLine().toString()
        a.class_plane= readLine().toString()
        println("Подтвердите класс, введя его еще раз")
        a.classs_p= readLine().toString()
        if(a.class_plane!=a.classs_p) {
            println("Заполните форму заново")
            Input(a)
        }
    }

    fun Give_Info(a: Plane){
        println("Марка: "+a.marka)
        println("Место отправления: "+a.place_otpr)
        println("Место назначения: "+a.place_nazn)
        println("Дата отправления: "+a.date_otpr)
        println("Время отправления: "+a.time_otpr)
        println("Время в пути: "+a.time_way)
    }

    fun Buy_Ticket(a:Plane): Int {
        return when (class_plane) {
            "эконом" -> 12000
            "бизнес" -> 50000
            "первый" -> 140000
            else -> {
                println("Неверно указан класс билета")
                1
            }
        }
    }
    fun Discount_Ticket(a:Plane) {
        when (classs_p) {
            "эконом" -> {
                val price = 12000
                val discount = 0.03
                var final_price = price - (price * discount)
                println("Цена билета со скидкой: $final_price")
            }

            "бизнес" -> {
                val price = 50000
                val discount = 0.05
                var final_price = price - (price * discount)
                println("Цена билета со скидкой: $final_price")
            }

            "первый" -> {
                val price = 140000
                val discount = 0.10
                var final_price = price - (price * discount)
                println("Цена билета со скидкой: $final_price")
            }
            else -> println("Неверно указан класс билета")
        }
    }

    fun Type_Of_Reys(a: Plane) {
        when (type_of_way) {
            "прямой", "с пересадкой" -> {
                when (type_of_way) {
                    "прямой" -> println("Цена билета без пересадок: ${Buy_Ticket(a)}")
                    "с пересадкой" -> println("Цена билета с пересадкой: ${Buy_Ticket(a)/2}")
                }
            }
            else -> {
                println("Неверно указан тип рейса")
                Input(a)
            }
        }
    }
}