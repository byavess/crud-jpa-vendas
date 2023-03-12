package io.github.byaves;

import io.github.byaves.domain.Cliente;
import io.github.byaves.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
        return args -> {

            System.out.println("Salvando clientes");
            clientes.salvar(new Cliente("Fabrício"));
            clientes.salvar(new Cliente("outro Cliente : Arthur"));

            List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);//:: methodo de referencia

            System.out.println("atualizando clientes");
            todosClientes.forEach(c -> {
                c.setNome(c.getNome() + "atualizado.");
                clientes.atualizar(c);
            });
            todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            System.out.println("Buscanado clientes");
            clientes.buscarPorNome("Cli").forEach(System.out::println);


//            System.out.println("Deletando os clientes");
//            clientes.obterTodos().forEach(c ->{
//                clientes.deletar(c);
//            });
//            todosClientes = clientes.obterTodos();
//            if(todosClientes.isEmpty()){
//                System.out.println("nenhum clente encontrado");
//            }else{
//                todosClientes.forEach(System.out::println);
//            }
        };
    }
            public static void main (String[]args){
                SpringApplication.run(VendasApplication.class, args);
            }
        }
