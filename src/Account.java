class Account {
    private final int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Invalid operation, you don't have enough money on this account");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

/*
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100.0);
        }

        while (true) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            if (id < 0 || id >= accounts.length) {
                System.out.println("Invalid ID. Please enter a correct ID.");
                continue;
            }

            Account account = accounts[id];

            while (true) {
                System.out.println("Main menu");
                System.out.println("1: Check balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1 -> System.out.println("The balance is " + account.getBalance());
                    case 2 -> {
                        System.out.print("Enter an amount to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        account.withdraw(withdrawAmount);
                    }
                    case 3 -> {
                        System.out.print("Enter an amount to deposit: ");
                        double depositAmount = input.nextDouble();
                        account.deposit(depositAmount);
                    }
                    case 4 -> {
                    }
                    default -> System.out.println("Invalid choice. Please enter a valid choice.");
                }

                if (choice == 4) {
                    break;
                }
            }
        }
 */