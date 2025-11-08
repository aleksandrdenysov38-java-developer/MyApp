package lesson14;

public class ConsolePrinter implements Printer {


    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }


    @Override
    public void print(Message message) {
        if ((message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty())) {


            Printer emptyMessageHandler = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Прорабатывается пустое сообщение от анонимного пользователя...");
                }
            };
            emptyMessageHandler.print(message);

        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонимный пользователь отправил сообщение: " + message.getText());
        } else {
            System.out.println("Пользователь " + message.getSender() + " отправил сообщение: " + message.getText());
        }
    }


    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();

        Message msg1 = new Message("Hello!", "Alex");
        Message msg2 = new Message("How are you?", null);
        Message msg3 = new Message(null, null);

        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }
}
