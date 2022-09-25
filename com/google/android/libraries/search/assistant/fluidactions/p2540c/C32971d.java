package com.google.android.libraries.search.assistant.fluidactions.p2540c;

import com.evernote.android.state.BuildConfig;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.c.d */
/* compiled from: PG */
public abstract class C32971d {
    /* renamed from: a */
    public abstract Optional mo38399a();

    /* renamed from: b */
    public abstract String mo38400b();

    public final String toString() {
        String b = mo38400b();
        return b + "," + ((String) mo38399a().orElse(BuildConfig.FLAVOR));
    }
}
