public class LogLevels {

        public static String message(String logLine) {
            //":" hariç sonrasını alır. "trim" ile baştaki ve sondaki boşlukları kaldırır."
            return logLine.substring(logLine.indexOf(":") + 1).trim();
        }

        public static String logLevel(String logLine) {
            //"[" hariç sonrasını al ta ki "]" buraya kadar, sonra küçük harfe çevir.
            return logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]")). toLowerCase();
        }

        public static String reformat(String logLine) {
            //önce message fonksiyonunu kullanır, araya boşluk ve parantez açar, sonra logLevel foksiyonunu kullanır ve ardından parantezi kapatır)
            return message(logLine) + " (" + logLevel(logLine) + ")";
        }
    }
