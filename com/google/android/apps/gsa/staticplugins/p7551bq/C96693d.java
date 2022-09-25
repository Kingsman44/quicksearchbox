package com.google.android.apps.gsa.staticplugins.p7551bq;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.proactive.p6475b.C84164g;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6519al.p6578bb.C84813a;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bq.d */
/* compiled from: PG */
public final class C96693d extends C86734a implements C84813a {

    /* renamed from: a */
    public static final C59071e f270511a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bq.d");

    /* renamed from: b */
    public final C86054o f270512b;

    /* renamed from: c */
    public final C69464a f270513c;

    /* renamed from: f */
    public final C86319j f270514f;

    /* renamed from: g */
    public final C85651bb f270515g;

    /* renamed from: h */
    public final C84474e f270516h;

    /* renamed from: i */
    public final C84164g f270517i;

    /* renamed from: j */
    private final C22871g f270518j;

    /* renamed from: k */
    private final C84486a f270519k;

    public C96693d(C84486a aVar, C86054o oVar, C69464a aVar2, C86319j jVar, C85651bb bbVar, C22871g gVar, C84474e eVar, C84164g gVar2) {
        super(C118575h.WORKER_LEGACY_NOW_SYNC, "legacy_now_sync");
        this.f270519k = aVar;
        this.f270512b = oVar;
        this.f270513c = aVar2;
        this.f270514f = jVar;
        this.f270515g = bbVar;
        this.f270518j = gVar;
        this.f270516h = eVar;
        this.f270517i = gVar2;
    }

    /* renamed from: a */
    public final C60870cx mo78508a() {
        if (!this.f270519k.mo78201h()) {
            return C118826c.f331423b;
        }
        return this.f270518j.mo28202b("legacynowsync", new C96692c(this));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
