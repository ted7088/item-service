package hello.itemservice.domain.item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest {

    ItemRepository itemRepository = new ItemRepository();

    @AfterEach
    void afterEach(){
        itemRepository.clearStore();
    }

    @Test
    void save(){
        //given
        Item item = new Item("itemA",10000,10);


        //when

        //then
    }

    @Test
    void findAll(){
        //given

        //when

        //then
    }

    @Test
    void updateItem(){
        //given

        //when

        //then
    }


}