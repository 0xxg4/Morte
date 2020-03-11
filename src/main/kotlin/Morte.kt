class Morte {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("\n" +
                        " ███▄ ▄███▓ ▒█████   ██▀███  ▄▄▄█████▓▓█████ \n" +
                        "▓██▒▀█▀ ██▒▒██▒  ██▒▓██ ▒ ██▒▓  ██▒ ▓▒▓█   ▀ \n" +
                        "▓██    ▓██░▒██░  ██▒▓██ ░▄█ ▒▒ ▓██░ ▒░▒███   \n" +
                        "▒██    ▒██ ▒██   ██░▒██▀▀█▄  ░ ▓██▓ ░ ▒▓█  ▄ \n" +
                        "▒██▒   ░██▒░ ████▓▒░░██▓ ▒██▒  ▒██▒ ░ ░▒████▒\n" +
                        "░ ▒░   ░  ░░ ▒░▒░▒░ ░ ▒▓ ░▒▓░  ▒ ░░   ░░ ▒░ ░\n" +
                        "░  ░      ░  ░ ▒ ▒░   ░▒ ░ ▒░    ░     ░ ░  ░\n" +
                        "░      ░   ░ ░ ░ ▒    ░░   ░   ░         ░   \n" +
                        "       ░       ░ ░     ░                 ░  ░\n" +
                        "                                             \n" +
                        "-------------------by 0xxg4------------------\n"
            )

            println("- How old are you?")

            val inp = Integer.valueOf(readLine())

            val res = 27375 - 365 * inp

            println("\nYou still have $res days left!!!\n")
        }
    }
}