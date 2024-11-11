package com.example.quiz_1;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UserRepository mockRepo;
    private UserService service;

    @Before
    public void setUp() {
        service = new UserService(mockRepo);
    }

    @Test
    public void testGetFormattedUsername() {
        when(mockRepo.getUserById(1)).thenReturn("Jubaer");
        when(mockRepo.getUserById(2)).thenReturn("Emon");
        String name = service.getFormattedString(2);

        assertEquals("Name: Emon", name);
    }
}