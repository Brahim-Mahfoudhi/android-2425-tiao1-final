package rise.tiao1.buut.utils

enum class StreetType(val streetName: String) {
    AFRIKALAAN("Afrikalaan"),
    BATAVIABRUG("Bataviabrug"),
    DECKERSTRAAT("Deckerstraat"),
    DOKNOORD("Dok Noord"),
    DOORNZELESTRAAT("Doornzelestraat"),
    FINLANDSTRAAT("Finlandstraat"),
    GASMETERLAAN("Gasmeterlaan"),
    GOUDBLOEMSTRAAT("Goudbloemstraat"),
    GROENDREEF("Groendreef"),
    GROTEMUIDE("Grote Muide"),
    HALVEMAANSTRAAT("Halvemaanstraat"),
    HAM("Ham"),
    HAMERSTRAAT("Hamerstraat"),
    INDUSTRIEWEG("Industrieweg"),
    KARELANTHEUNISSTRAAT("Karel Antheunisstraat"),
    KIEKENBOSSTRAAT("Kiekenbosstraat"),
    KOOPVAARDIJLAAN("Koopvaardijlaan"),
    LANGERBRUGGEKAAI("Langerbruggekaai"),
    MEULESTEDEBRUG("Meulestredebrug"),
    MEULESTEDEDIJK("Meulestededijk"),
    MEULESTEDEHOF("Meulestedehof"),
    MEULESTEDEKAAI("Meulestedekaai"),
    MEULESTEEDSESTEENWEG("Meulesteedsesteenweg"),
    MUIDEHOFSTRAAT("Muidehofstraat"),
    MUIDEKAAI("Muidekaai"),
    MUIDELAAN("Muidelaan"),
    MUIDEPOORT("Muidepoort"),
    NEERMEERSKAAI("Neermeerskaai"),
    NIEUWEVAART("Nieuwe Vaart"),
    OKTROOIPLEIN("Oktrooiplein"),
    SCHELDEKAAI("Scheldekaai"),
    SCHOONSCHIPSTRAAT("Schoonschipstraat"),
    SPANJAARDSTRAAT("Spanjaardstraat"),
    STAPELPLEIN("Stapelplein"),
    VOORHAVENKAAI("Voorhavenkaai"),
    ZEESCHIPSTRAAT("Zeeschipstraat"),
    ZEESCHIPSTRAATJE("Zeeschipstraatje"),
    ZONGELAAN("Zongelaan");

    companion object {
        fun fromString(streetName: String): StreetType? {
            return entries.find { it.streetName.equals(streetName, ignoreCase = true) }
        }
    }
}