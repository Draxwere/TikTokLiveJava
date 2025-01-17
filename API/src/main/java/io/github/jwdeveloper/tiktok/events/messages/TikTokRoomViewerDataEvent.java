package io.github.jwdeveloper.tiktok.events.messages;

import io.github.jwdeveloper.tiktok.events.TikTokEvent;
import io.github.jwdeveloper.tiktok.events.objects.TopViewer;
import io.github.jwdeveloper.tiktok.messages.WebcastRoomUserSeqMessage;
import lombok.Getter;

import java.util.List;

@Getter
public class TikTokRoomViewerDataEvent extends TikTokEvent {
  private final Integer viewerCount;
  private final List<TopViewer> topViewers;

  public TikTokRoomViewerDataEvent(WebcastRoomUserSeqMessage msg) {
    super(msg.getHeader());

    //TODO sorting by rank       TopViewers = msg?.TopViewers?.Select(t => new Objects.TopViewer(t))?.OrderBy(t => t.Rank)?
    viewerCount = msg.getViewerCount();
    topViewers = msg.getTopViewersList().stream().map(TopViewer::new).toList();
  }

}
