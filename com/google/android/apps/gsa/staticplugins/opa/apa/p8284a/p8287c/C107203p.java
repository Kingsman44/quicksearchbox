package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c;

import com.google.android.apps.gsa.assistant.shared.C73800ac;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8285a.C107162f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.c.p */
/* compiled from: PG */
public final class C107203p {

    /* renamed from: a */
    public static final Duration f298381a = Duration.ofDays(1);

    /* renamed from: b */
    public final C73800ac f298382b;

    /* renamed from: c */
    public final C107162f f298383c;

    /* renamed from: d */
    public final Query f298384d;

    /* renamed from: e */
    public final C21370a f298385e;

    /* renamed from: f */
    public final C22871g f298386f;

    /* renamed from: g */
    public C60870cx f298387g;

    public C107203p(C73800ac acVar, C107162f fVar, Query query, C21370a aVar, C90821bm bmVar) {
        this.f298382b = acVar;
        this.f298383c = fVar;
        this.f298384d = query.mo84259V().mo84244G(true).mo84302an("android.opa.extra.HANDOVER_FROM_APA", true);
        this.f298385e = aVar;
        this.f298386f = bmVar.mo85163a(C107202o.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo95828a() {
        return C60922j.m93045h(this.f298383c.f298291a.mo46042d(), new C107199l(this), C60826bg.f164896a);
    }
}
