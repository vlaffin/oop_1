package oop_1.hw3;

public interface Game {
    void start(Integer sizeWord,Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}