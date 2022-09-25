package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.j */
/* compiled from: PG */
public final /* synthetic */ class C122283j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C122290q f339073a;

    /* renamed from: b */
    public final /* synthetic */ Instant f339074b;

    /* renamed from: c */
    public final /* synthetic */ C122289p f339075c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f339076d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f339077e;

    /* renamed from: f */
    public final /* synthetic */ Optional f339078f;

    /* renamed from: g */
    public final /* synthetic */ Duration f339079g;

    public /* synthetic */ C122283j(C122290q qVar, Instant instant, C122289p pVar, C60870cx cxVar, C60870cx cxVar2, Optional optional, Duration duration) {
        this.f339073a = qVar;
        this.f339074b = instant;
        this.f339075c = pVar;
        this.f339076d = cxVar;
        this.f339077e = cxVar2;
        this.f339078f = optional;
        this.f339079g = duration;
    }

    public final Object call() {
        C122290q qVar = this.f339073a;
        Instant instant = this.f339074b;
        this.f339075c.mo105589a(this.f339076d, this.f339077e, Duration.between(instant, qVar.f339108e.mo57444a()), this.f339078f, this.f339079g);
        return null;
    }
}
