package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.cj */
/* compiled from: PG */
public final class C22118cj {

    /* renamed from: a */
    public static final C58974d f60947a = C58974d.m91136j();

    /* renamed from: b */
    public final C68214a f60948b;

    /* renamed from: c */
    public final C22871g f60949c;

    /* renamed from: d */
    public final C86054o f60950d;

    /* renamed from: e */
    public final u f60951e;

    /* renamed from: f */
    public final C86124t f60952f;

    /* renamed from: g */
    public final C22119ck f60953g;

    /* renamed from: h */
    private final C22080bj f60954h = new C22110cb();

    /* renamed from: i */
    private final Optional f60955i;

    public C22118cj(C22871g gVar, Optional optional, C68214a aVar, C86054o oVar, u uVar, C22119ck ckVar, C86124t tVar) {
        this.f60949c = gVar;
        this.f60955i = optional;
        this.f60948b = aVar;
        this.f60950d = oVar;
        this.f60951e = uVar;
        this.f60953g = ckVar;
        this.f60952f = tVar;
    }

    /* renamed from: a */
    public final C22080bj mo27361a() {
        return this.f60955i.isPresent() ? (C22080bj) this.f60955i.get() : this.f60954h;
    }
}
