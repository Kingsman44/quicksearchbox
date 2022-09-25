package com.google.android.libraries.search.assistant.p2828y.p2838g.p2844d;

import com.google.common.base.C58838bb;
import com.google.common.p4580v.C60944c;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.assistant.y.g.d.c */
/* compiled from: PG */
public final class C36950c {

    /* renamed from: a */
    public final C60950i f96218a;

    /* renamed from: b */
    public final Duration f96219b;

    /* renamed from: c */
    public final C60888db f96220c;

    /* renamed from: d */
    public final Object f96221d = new Object();

    /* renamed from: e */
    public Instant f96222e;

    /* renamed from: f */
    public C36949b f96223f;

    public C36950c(C60950i iVar, C60888db dbVar, Duration duration) {
        C58838bb.m90873h(C60944c.m93094g(duration), "duration (%s) must be positive", duration);
        this.f96218a = iVar;
        this.f96220c = dbVar;
        this.f96219b = duration;
        this.f96222e = Instant.EPOCH;
    }
}
