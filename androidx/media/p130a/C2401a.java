package androidx.media.p130a;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.p031v4.media.session.MediaSessionCompat;

/* renamed from: androidx.media.a.a */
/* compiled from: PG */
final class C2401a {
    /* renamed from: a */
    static Notification.MediaStyle m6429a() {
        return new Notification.MediaStyle();
    }

    /* renamed from: b */
    static Notification.MediaStyle m6430b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
        if (iArr != null) {
            m6433e(mediaStyle, iArr);
        }
        if (token != null) {
            m6431c(mediaStyle, (MediaSession.Token) token.getToken());
        }
        return mediaStyle;
    }

    /* renamed from: c */
    static void m6431c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* renamed from: d */
    static void m6432d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* renamed from: e */
    static void m6433e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
