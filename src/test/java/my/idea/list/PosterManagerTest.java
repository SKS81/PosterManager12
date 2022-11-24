package my.idea.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PosterManagerTest {

    PosterManager poster = new PosterManager();

    private Poster item1 = new Poster(1, "Бладшот", "боевик");
    private Poster item2 = new Poster(2, "Вперед", "мультфильм");
    private Poster item3 = new Poster(3, "Отель", "комедия");
    private Poster item4 = new Poster(4, "Джентльмены", "боевик");
    private Poster item5 = new Poster(5, "Невидимка", "ужасы");
    private Poster item6 = new Poster(6, "Тролли", "мультфильм");
    private Poster item7 = new Poster(7, "Один", "комедия");
    private Poster item8 = new Poster(8, "Вселенная", "документальный");
    private Poster item9 = new Poster(9, "Матрица", "фантастика");
    private Poster item10 = new Poster(10, "Русалочка", "мультфильм");
    private Poster item11 = new Poster(11, "Гравитация", "документальный");
    private Poster item12 = new Poster(7, "Грань", "фантастика");
    private Poster item13 = new Poster(8, "Воля", "боевик");
    private Poster item14 = new Poster(9, "Дом", "ужасы");
    private Poster item15 = new Poster(10, "Трансформеры", "мультфильм");

    @Test
    public void shouldAllPosters() {
        poster.addNewPoster(item1);
        poster.addNewPoster(item2);
        poster.addNewPoster(item3);
        poster.addNewPoster(item4);
        poster.addNewPoster(item5);
        poster.addNewPoster(item6);
        poster.addNewPoster(item7);
        poster.addNewPoster(item8);
        poster.addNewPoster(item9);
        poster.addNewPoster(item10);
        poster.addNewPoster(item11);
        poster.addNewPoster(item12);
        poster.addNewPoster(item13);
        poster.addNewPoster(item14);
        poster.addNewPoster(item15);

        Poster[] expected = { item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14, item15 };
        Poster[] actual = poster.getAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllLastAdd() {
        poster.addNewPoster(item1);
        poster.addNewPoster(item2);
        poster.addNewPoster(item3);
        poster.addNewPoster(item4);
        poster.addNewPoster(item5);
        poster.addNewPoster(item6);
        poster.addNewPoster(item7);
        poster.addNewPoster(item8);
        poster.addNewPoster(item9);
        poster.addNewPoster(item10);
        poster.addNewPoster(item11);
        poster.addNewPoster(item12);
        poster.addNewPoster(item13);
        poster.addNewPoster(item14);
        poster.addNewPoster(item15);

        Poster[] expected = { item15, item14, item13, item12, item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1 };
        Poster[] actual = poster.getLastAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFourLastAdd() {
        poster.addNewPoster(item12);
        poster.addNewPoster(item13);
        poster.addNewPoster(item14);
        poster.addNewPoster(item15);

        Poster[] expected = { item15, item14, item13, item12 };
        Poster[] actual = poster.getLastAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void delSelectPosterById() {
        poster.addNewPoster(item1);
        poster.addNewPoster(item2);
        poster.addNewPoster(item3);
        poster.addNewPoster(item4);
        poster.addNewPoster(item5);
        poster.addNewPoster(item6);
        poster.addNewPoster(item7);
        poster.addNewPoster(item8);
        poster.addNewPoster(item9);
        poster.addNewPoster(item10);
        poster.addNewPoster(item11);
        poster.addNewPoster(item12);
        poster.addNewPoster(item13);
        poster.addNewPoster(item14);
        poster.addNewPoster(item15);

        poster.removePosterById(1);

        Poster[] expected = { item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14, item15 };
        Poster[] actual = poster.getAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}