package de.riagade.bot.task.feedback;

import de.riagade.bot.FabiAlertDiscordBot;
import de.riagade.bot.util.ResourcesHelper;
import de.riagade.genericDiscordBot.A_FeedbackTask;

public class RacoonReminder extends A_FeedbackTask {
    private FabiAlertDiscordBot bot;

    public RacoonReminder(FabiAlertDiscordBot bot){
        setBot(bot);
    }

    /**
     * @return the current {@link FabiAlertDiscordBot}
     */
    public FabiAlertDiscordBot getBot() {
        return bot;
    }

    private void setBot(FabiAlertDiscordBot bot) {
        this.bot = bot;
    }

    @Override
    public void runLogic() {
        getBot().sendMessage(ResourcesHelper.getResourceFileContent(getClass().getClassLoader(),
                "racoonMessage.txt"));
    }
}
