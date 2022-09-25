package com.google.android.libraries.assistant.p1363c.p1398g.p1437l.p1438a;

import com.google.android.libraries.assistant.p1363c.p1398g.C17331a;
import com.google.android.libraries.assistant.p1363c.p1398g.C17360b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1404c.C17369g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1406e.p1407a.C17379a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1432i.C17447b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.l.a.c */
/* compiled from: PG */
public final class C17526c implements C17360b {

    /* renamed from: a */
    public static final C59071e f50545a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.l.a.c");

    /* renamed from: b */
    public static final Duration f50546b = Duration.ofMinutes(10);

    /* renamed from: c */
    public final C17447b f50547c;

    /* renamed from: d */
    public final Optional f50548d;

    /* renamed from: e */
    private final C17508k f50549e;

    /* renamed from: f */
    private final C17477am f50550f;

    /* renamed from: g */
    private final C60870cx f50551g;

    /* renamed from: h */
    private final C17369g f50552h;

    /* renamed from: i */
    private final Future f50553i;

    public C17526c(C17508k kVar, C17477am amVar, C17447b bVar, Optional optional, C60870cx cxVar, C17369g gVar, C17379a aVar, C60888db dbVar) {
        this.f50549e = kVar;
        this.f50550f = amVar;
        this.f50547c = bVar;
        this.f50548d = optional;
        this.f50551g = cxVar;
        this.f50552h = gVar;
        this.f50553i = dbVar.mo29164d(C47810es.m84977q(new C17524a(this, kVar, amVar, aVar)), f50546b.toMillis(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final C17331a mo23302a() {
        return new C17525b(this);
    }

    /* renamed from: b */
    public final C17331a mo23303b() {
        this.f50552h.mo23323f(this.f50549e, this.f50550f, this.f50547c);
        return new C17525b(this);
    }

    /* renamed from: c */
    public final C60870cx mo23304c() {
        return this.f50551g;
    }

    public final void close() {
        this.f50552h.mo23321d(this.f50549e, this.f50550f, this.f50547c, this.f50548d);
        this.f50553i.cancel(false);
    }
}
