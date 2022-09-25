package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.am.c.ay;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74886bd;
import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75113bn;
import com.google.android.apps.gsa.nga.engine.p6029g.C76087c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.q */
/* compiled from: PG */
public abstract class C79708q implements C79688bq {

    /* renamed from: a */
    protected final ay f218599a;

    /* renamed from: b */
    protected final C74886bd f218600b;

    /* renamed from: c */
    public final C79646ab f218601c;

    /* renamed from: d */
    public final C75113bn f218602d;

    /* renamed from: e */
    private final C76087c f218603e;

    protected C79708q(C79646ab abVar, C75113bn bnVar, ay ayVar, C74886bd bdVar, C76087c cVar) {
        this.f218601c = abVar;
        this.f218602d = bnVar;
        this.f218599a = ayVar;
        this.f218600b = bdVar;
        this.f218603e = cVar;
    }

    /* renamed from: d */
    protected static final C80399l m127802d() {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(3);
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Optional mo74188a(C79690bs bsVar);

    /* renamed from: b */
    public final /* synthetic */ boolean mo74176b(C79690bs bsVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo74211c() {
        return this.f218603e.mo72032d() && this.f218600b.mo71263b();
    }

    /* renamed from: h */
    public final C60870cx mo74177h(C79690bs bsVar) {
        bsVar.mo74199g();
        return (C60870cx) mo74188a(bsVar).map(new C79706o(this, bsVar)).orElseGet(C79707p.f218598a);
    }
}
