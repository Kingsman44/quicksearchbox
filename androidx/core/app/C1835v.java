package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* renamed from: androidx.core.app.v */
/* compiled from: PG */
final class C1835v {
    /* renamed from: a */
    static void m5020a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    /* renamed from: b */
    static void m5021b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription((CharSequence) null);
    }

    /* renamed from: c */
    static void m5022c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }
}
