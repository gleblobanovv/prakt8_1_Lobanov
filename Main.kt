fun main() {
    var plane=Plane(
        "boing",
        "Екатеринбург",
        "Москва",
        "20-02-2024",
        "20:00",
        "2 часа",
        "эконом",
        "эконом",
        "прямой")

    plane.Input(plane)
    plane.Give_Info(plane)
    plane.Buy_Ticket(plane)
    plane.Discount_Ticket(plane)
    plane.Type_Of_Reys(plane)
}