# API Java simples usando MongoDB

### Instruções

- Você deve criar uma database mongo chamada *apimongo* e uma collection chamada *animals*

- Você pode inserir dados *pelo mongo* da seguinte forma:

```
db.animals.insert([
    {
        name: "Snow",
        breed: "Shih-tzu",
        owner: "Bárbara Becker",
        dateOfBirth: new Date("2018-09-11"),
        typeOfAnimal: "dog",
        color: "white and brown"        
    }]);
```

- Após, acesse o diretório do projeto.

- Dentro do diretório, digite os comandos:

```gradle wrapper``` 

```./gradlew clean build```

- Rode a aplicação com o comando:

```gradle bootRun```

- Você poderá abrir o [Postman](https://www.getpostman.com/) para inserir, deletar, adicionar dados ou o browser de sua preferência.

### Endpoints disponíveis

*GET*

- Listar todos os animais: ```http://localhost:8080/apimongo/```

- Procurar o animal pelo número do chip: ```http://localhost:8080/apimongo/{nroChip}```

*PUT*

- Atualizar os dados de algum animal pelo número do chip: ```http://localhost:8080/apimongo/{nroChip}```

*POST*

- Adicionar um animal: ```http://localhost:8080/apimongo/```

- Você deverá inserir os dados do animal em formato JSON pelo postman:

```
    {
        "name": "nome do animal",
        "breed": "raça",
        "owner": "dono",
        "dateOfBirth": "year-mm-dd",
        "typeOfAnimal": "dog",
        "color": "cor do animal"
    }
```
    
- O número do chip não precisa ser informado pois é gerado automaticamente.

*DELETE*

- Deletar um animal pelo número do chip: ```http://localhost:8080/apimongo/{nroChip}```
