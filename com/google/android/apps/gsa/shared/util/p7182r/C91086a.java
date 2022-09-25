package com.google.android.apps.gsa.shared.util.p7182r;

import android.content.Context;
import android.provider.Settings;

/* renamed from: com.google.android.apps.gsa.shared.util.r.a */
/* compiled from: PG */
public final class C91086a {
    /* renamed from: a */
    public static boolean m148806a(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", 0) != 0;
    }
}
