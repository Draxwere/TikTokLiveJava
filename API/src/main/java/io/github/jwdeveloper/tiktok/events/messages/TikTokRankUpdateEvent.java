package io.github.jwdeveloper.tiktok.events.messages;

import io.github.jwdeveloper.tiktok.events.TikTokEvent;
import io.github.jwdeveloper.tiktok.messages.WebcastHourlyRankMessage;
import io.github.jwdeveloper.tiktok.messages.WebcastRankUpdateMessage;
import lombok.Getter;

@Getter
public class TikTokRankUpdateEvent extends TikTokEvent {
  private final String eventType;

  private final String label;

  private final String rank;

  private final String color;

  public TikTokRankUpdateEvent(WebcastHourlyRankMessage msg) {
    super(msg.getHeader());
    var rankData = msg.getData().getRankings();
    eventType = rankData.getType();
    label = rankData.getLabel();
    if(rankData.getDetailsList().isEmpty())
    {
      rank = "";
    }
    else
    {
      rank = rankData.getDetails(0).getLabel();
    }
    color = rankData.getColor().getColor();
  }

  public TikTokRankUpdateEvent(WebcastRankUpdateMessage msg) {
    super(msg.getHeader());
    var rankData = msg.getData().getRankData();
    eventType = rankData.getType();
    label = rankData.getLabel();
    if(rankData.getDetailsList().isEmpty())
    {
      rank = "";
    }
    else
    {
      rank = rankData.getDetails(0).getLabel();
    }
    color = rankData.getColor().getColor();
  }

}
