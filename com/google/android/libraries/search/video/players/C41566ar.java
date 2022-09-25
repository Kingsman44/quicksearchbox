package com.google.android.libraries.search.video.players;

import com.evernote.android.state.BuildConfig;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.players.ar */
/* compiled from: PG */
abstract class C41566ar {

    /* renamed from: e */
    public static final C41566ar f108662e = new C41568c(BuildConfig.FLAVOR, Duration.ZERO, true, Optional.empty());

    /* renamed from: e */
    static C41566ar m72705e(String str, Duration duration, boolean z, Optional optional) {
        return new C41568c(str, duration, z, optional);
    }

    /* renamed from: a */
    public abstract Duration mo44108a();

    /* renamed from: b */
    public abstract Optional mo44109b();

    /* renamed from: c */
    public abstract String mo44110c();

    /* renamed from: d */
    public abstract boolean mo44111d();
}
