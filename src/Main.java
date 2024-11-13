import br.com.alura.screenmatch.calculator.Classifiable;
import br.com.alura.screenmatch.calculator.RecommendationFilter;
import br.com.alura.screenmatch.calculator.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

//        Movie nasceUmaEstrela = new Movie();
//        nasceUmaEstrela.setDirector("Anderson");
//
//        Movie avatar = new Movie();
//        avatar.setDirector("João");


        myMovie.setName("The Godfather");
        myMovie.setYearOfRelease(1970);
        myMovie.setMovieLength(180);

        myMovie.showTechnicalSheet();
        myMovie.evaluation(8);
        myMovie.evaluation(5);
        myMovie.evaluation(10);
        System.out.println("average rating of the movie: " + myMovie.getTotalReviews());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setYearOfRelease(2018);
        lost.showTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("duration to binge-watch Lost. " + lost.getMovieLength());

        Movie anotherMovie = new Movie();
        myMovie.setName("A Star Is Born");
        myMovie.setYearOfRelease(2023);
        myMovie.setMovieLength(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(anotherMovie);
        calculator.includes(lost);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(String.valueOf(lost));
        episode.setTotalViews(300);
        filter.filter(episode);

    }
}
