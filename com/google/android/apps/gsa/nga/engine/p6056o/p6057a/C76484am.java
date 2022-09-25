package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77388am;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77402o;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4522b.C58480gp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.am */
/* compiled from: PG */
final class C76484am implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C58480gp f211667a;

    /* renamed from: b */
    final /* synthetic */ C74965n f211668b;

    /* renamed from: c */
    final /* synthetic */ C77402o f211669c;

    /* renamed from: d */
    final /* synthetic */ C77388am f211670d;

    /* renamed from: e */
    final /* synthetic */ C76490as f211671e;

    public C76484am(C76490as asVar, C58480gp gpVar, C74965n nVar, C77402o oVar, C77388am amVar) {
        this.f211671e = asVar;
        this.f211667a = gpVar;
        this.f211668b = nVar;
        this.f211669c = oVar;
        this.f211670d = amVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            this.f211671e.mo72212b(this.f211667a.mo55394f(), Optional.empty(), C80401n.f220656k, this.f211668b);
            return;
        }
        C80386p a = this.f211669c.mo72540a((C77426t) optional.get());
        this.f211671e.mo72212b(this.f211667a.mo55394f(), Optional.m71637of(new C76478ag((C77426t) optional.get(), a, this.f211670d.mo72539c(a))), ((C77426t) optional.get()).mo72528e(), this.f211668b);
    }
}
