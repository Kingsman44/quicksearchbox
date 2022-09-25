package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.nga.engine.education.pie.C75906g;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75786o;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75788q;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.x */
/* compiled from: PG */
public final class C75857x implements C75786o, C90919bp {

    /* renamed from: a */
    private final C75906g f210487a;

    /* renamed from: b */
    private Optional f210488b = Optional.empty();

    public C75857x(C75906g gVar) {
        this.f210487a = gVar;
    }

    /* renamed from: c */
    private final synchronized void m122278c() {
        this.f210487a.mo71922a().mo76659e(this);
        this.f210488b = Optional.empty();
    }

    /* renamed from: b */
    public final synchronized void mo17870a(C80201av avVar) {
        if (avVar != C80201av.PIE_ELIGIBLE) {
            this.f210488b.ifPresent(C75856w.f210486a);
            m122278c();
        }
    }

    /* renamed from: d */
    public final void mo71889d(C75788q qVar, int i, C80265t tVar) {
        m122278c();
    }

    /* renamed from: e */
    public final synchronized void mo71890e(C75788q qVar, int i, C75891l lVar) {
        if (i == 0) {
            this.f210488b = Optional.m71637of(qVar);
            this.f210487a.mo71922a().mo76658d(this);
        }
    }

    /* renamed from: f */
    public final void mo71891f(C75788q qVar) {
        m122278c();
    }
}
