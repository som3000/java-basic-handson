class Money {
  final int value;
  Money(int value){
    this.value = value;
  }

  public Money add(Money money){
    return new Money(this.value+money.value);
  }

  public Money minus(Money money){
    return new Money(this.value-money.value);
  }
}