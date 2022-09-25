package com.google.android.libraries.search.video.thirdparty;

import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.video.thirdparty.o */
/* compiled from: PG */
public final class C41613o {

    /* renamed from: a */
    public static final C59071e f108773a = C59071e.m91332i("com.google.android.libraries.search.video.thirdparty.o");

    /* renamed from: b */
    public Duration f108774b = Duration.ofMillis(-1);

    /* renamed from: c */
    public Duration[] f108775c = new Duration[0];

    /* renamed from: b */
    public static boolean m72964b(int i, int... iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo44180a(Duration duration) {
        this.f108775c = new Duration[]{duration};
        this.f108774b = duration;
    }
}
