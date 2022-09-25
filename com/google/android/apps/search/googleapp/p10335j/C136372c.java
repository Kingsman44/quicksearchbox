package com.google.android.apps.search.googleapp.p10335j;

import android.os.Build;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.search.googleapp.j.c */
/* compiled from: PG */
public final class C136372c implements C68220f {
    /* renamed from: a */
    public static Boolean m221594a() {
        boolean z = false;
        if (Build.TAGS != null && (Build.TAGS.contains("test-keys") || Build.TAGS.contains("robolectric"))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
