package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.a */
/* compiled from: PG */
final class C77582a {

    /* renamed from: a */
    public final C83320io f213728a;

    /* renamed from: b */
    public final Duration f213729b;

    /* renamed from: c */
    public final Duration f213730c;

    /* renamed from: d */
    public Duration f213731d;

    /* renamed from: e */
    public Duration f213732e;

    /* renamed from: f */
    public Duration f213733f;

    /* renamed from: g */
    public Duration f213734g = Duration.ZERO;

    /* renamed from: h */
    public Duration f213735h;

    /* renamed from: i */
    public boolean f213736i = false;

    /* renamed from: j */
    final /* synthetic */ C77583b f213737j;

    public C77582a(C77583b bVar, C83320io ioVar, Duration duration) {
        this.f213737j = bVar;
        this.f213729b = Duration.ofSeconds(bVar.f213741c.mo85399d(C90126fx.f251756on));
        this.f213730c = Duration.ofSeconds(bVar.f213741c.mo85399d(C90126fx.f251755om));
        this.f213731d = Duration.ofNanos(bVar.f213740b.mo26872d());
        this.f213728a = ioVar;
        this.f213735h = duration;
    }
}
