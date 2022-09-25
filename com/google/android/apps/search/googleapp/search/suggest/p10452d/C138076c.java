package com.google.android.apps.search.googleapp.search.suggest.p10452d;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.d.c */
/* compiled from: PG */
public final class C138076c {

    /* renamed from: a */
    public final Object f375671a = new Object();

    /* renamed from: b */
    public final C21370a f375672b;

    /* renamed from: c */
    public final C60887da f375673c;

    /* renamed from: d */
    public final C60887da f375674d;

    /* renamed from: e */
    public Duration f375675e = Duration.ZERO;

    /* renamed from: f */
    public int f375676f;

    /* renamed from: g */
    public String f375677g;

    /* renamed from: h */
    public C60870cx f375678h;

    public C138076c(C21370a aVar, C60887da daVar, C60887da daVar2) {
        this.f375672b = aVar;
        this.f375673c = daVar;
        this.f375674d = daVar2;
    }

    /* renamed from: a */
    public final boolean mo114123a(long j) {
        return !this.f375675e.isNegative() && j >= this.f375675e.toMillis();
    }
}
