package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;

/* renamed from: com.google.android.material.progressindicator.a */
/* compiled from: PG */
public final class C44836a {
    /* renamed from: a */
    public static final float m79572a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
