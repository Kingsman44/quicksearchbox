package androidx.core.content.p090a;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: androidx.core.content.a.b */
/* compiled from: PG */
public final class C1847b {
    /* renamed from: a */
    public static final C1848c m5065a(C1848c cVar) {
        if (TextUtils.isEmpty(cVar.f5714d)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        } else if (cVar.f5713c != null) {
            return cVar;
        } else {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
    }

    /* renamed from: b */
    public static final void m5066b(Intent intent, C1848c cVar) {
        cVar.f5713c = new Intent[]{intent};
    }
}
