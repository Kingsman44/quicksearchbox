package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;

/* renamed from: androidx.core.app.au */
/* compiled from: PG */
public final class C1804au {
    /* renamed from: a */
    public static PendingIntent m4958a(RemoteAction remoteAction) {
        return remoteAction.getActionIntent();
    }

    /* renamed from: b */
    static RemoteAction m4959b(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
    }

    /* renamed from: c */
    public static Icon m4960c(RemoteAction remoteAction) {
        return remoteAction.getIcon();
    }

    /* renamed from: d */
    public static CharSequence m4961d(RemoteAction remoteAction) {
        return remoteAction.getContentDescription();
    }

    /* renamed from: e */
    public static CharSequence m4962e(RemoteAction remoteAction) {
        return remoteAction.getTitle();
    }

    /* renamed from: f */
    static void m4963f(RemoteAction remoteAction, boolean z) {
        remoteAction.setEnabled(z);
    }

    /* renamed from: g */
    public static boolean m4964g(RemoteAction remoteAction) {
        return remoteAction.isEnabled();
    }
}
