package androidx.core.app;

import android.app.RemoteInput;

/* renamed from: androidx.core.app.ay */
/* compiled from: PG */
final class C1808ay {
    /* renamed from: a */
    static int m4974a(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    /* renamed from: b */
    static RemoteInput.Builder m4975b(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
