class User extends Account {
  constructor(name, document, email, password) {
    super(name, document, email, password);
  }

  PrintDataUser = () => {
    console.log("Nombre:" + this.name);
    console.log("Documento:" + this.document);
    console.log("Email:" + this.email);
    console.log("Password:" + this.password);
  };
}
