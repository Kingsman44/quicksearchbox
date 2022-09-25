package androidx.p186q.p187a;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: androidx.q.a.f */
/* compiled from: PG */
public final class C4051f {
    /* renamed from: a */
    public static final C4052g m11601a(Context context, String str, C4050e eVar, boolean z, boolean z2) {
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        } else if (!z || !TextUtils.isEmpty(str)) {
            return new C4052g(context, str, eVar, z, z2);
        } else {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
    }
}
