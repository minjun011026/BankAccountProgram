package com.unit_3.bankaccountprogram

fun main(){
    val SarahBankAccount = BankAccount("Sarah",0.0)
    SarahBankAccount.deposit(100.0)
    SarahBankAccount.withdraw(10.0)
    SarahBankAccount.deposit(300.0)
    SarahBankAccount.displayTransactionHistory()
    SarahBankAccount.acctBalance()
}