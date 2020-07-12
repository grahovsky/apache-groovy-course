class Account {

    BigDecimal balance

    Account plus(other) {
        def result
        print other.class
        if (other instanceof Account) {
            result = new Account( balance: this.balance + other.balance )
        } else {
            try {
                result = new Account( balance: this.balance + other)
            } catch(Exception e) {
                result = new Account( balance: this.balance)
            }
        }
        return result
    }
    
    String toString(){
        "Account Balance: $balance"
    }

}

Account savings = new Account(balance:100.00)
Account checking = new Account(balance:500.00)

println savings
println checking

println savings + checking
println savings + 200



//def sumAccounts = savings + checking
//sumAccounts.class
//class Account