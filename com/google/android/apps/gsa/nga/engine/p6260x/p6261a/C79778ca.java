package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.logging.C28260b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.ahy;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4500cm.p4518d.C58192i;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.ca */
/* compiled from: PG */
final class C79778ca implements C22868d {

    /* renamed from: a */
    final /* synthetic */ ahy f218716a;

    /* renamed from: b */
    final /* synthetic */ C79783cf f218717b;

    public C79778ca(C79783cf cfVar, ahy ahy) {
        this.f218717b = cfVar;
        this.f218716a = ahy;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C79783cf.f218738a.mo56226d()).mo56382g(th)).mo56372aa(3990)).mo56386p("Log event creation failed.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C143657j d = ((C143658k) this.f218717b.f218741d.mo27525b()).mo118999d((C58192i) obj);
        C60320od odVar = (C60320od) C60321oe.f163224i.createBuilder();
        C60218r a = C28260b.m52825a();
        odVar.copyOnWrite();
        C60321oe oeVar = (C60321oe) odVar.instance;
        a.getClass();
        oeVar.f163227b = a;
        oeVar.f163226a |= 1;
        C60218r rVar = this.f218716a.f158789a;
        if (rVar == null) {
            rVar = C60218r.f162925d;
        }
        odVar.copyOnWrite();
        C60321oe oeVar2 = (C60321oe) odVar.instance;
        rVar.getClass();
        oeVar2.f163229d = rVar;
        oeVar2.f163226a |= 2;
        d.f389463e = (C60321oe) odVar.build();
        Optional d2 = this.f218717b.f218745h.mo72021b().mo72038d();
        Objects.requireNonNull(d);
        d2.ifPresent(new C79776bz(d));
        d.mo118992a();
    }
}
