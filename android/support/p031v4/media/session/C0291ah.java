package android.support.p031v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* renamed from: android.support.v4.media.session.ah */
/* compiled from: PG */
final class C0291ah {
    /* renamed from: a */
    static long m739a(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }

    /* renamed from: b */
    static MediaDescription m740b(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    /* renamed from: c */
    static MediaSession.QueueItem m741c(MediaDescription mediaDescription, long j) {
        return new MediaSession.QueueItem(mediaDescription, j);
    }
}
