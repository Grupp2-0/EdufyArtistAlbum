package com.edufy.edufyartistalbum.controller;

import com.edufy.edufyartistalbum.model.Album;
import com.edufy.edufyartistalbum.model.AlbumArtist;
import com.edufy.edufyartistalbum.model.Artist;
import com.edufy.edufyartistalbum.service.AlbumService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest/*(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)*/
@AutoConfigureMockMvc
@WebMvcTest
public class AlbumControllerTest {

    @Autowired
    private AlbumController albumController;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @LocalServerPort
    private int port;

    @Test
    void contextLoads() {
        assertThat(albumController).isNotNull();
    }

    @MockBean
    private AlbumService albumService;

    private List<Album> albumList;

    @BeforeEach
    void setUp() {
        this.albumList = new ArrayList<>();
        this.albumList.add(new Album(1, "Satan i gatan"));
        this.albumList.add(new Album(2, "DAMN"));
        this.albumList.add(new Album(3, "good kid, m.A.A.d city"));
    }

    @Test
    void findAlbumById() throws Exception {
        mockMvc.perform(get("/artistAlbum"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$.id", is(1)));
    }

    @Test
    public void testGetArtistAlbumById() throws Exception {
        final int albumId = 1;
        final Album album = new Album(1, "good kid, m.A.A.d city");

        when(albumService.getAlbumById(albumId)).thenReturn(albumList);
        given(albumService.getAlbumById(albumId)).willReturn((albumList));

        mockMvc.perform(get("/artistAlbum{id}", albumId))
            .andExpect(status().isOk())
            .andExpect((ResultMatcher) jsonPath("$.id", is(album.getId())));

        }


}
