public class TeamTest {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //create soccer team
        //Team liverpool = new Team("Liverpool");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");


        //liverpool.addPlayer(joe);   not soccer player
        //liverpool.addPlayer(pat);   not soccer player
        liverpool.addPlayer(beckham);

        System.out.println(liverpool.numPlayers());

        //Team<String> brokenTeam = new Team<>("this wont work");
    }
}
