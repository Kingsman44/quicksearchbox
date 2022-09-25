package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.p4500cm.p4518d.C58192i;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.cc */
/* compiled from: PG */
final class C79780cc implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C60321oe f218719a;

    /* renamed from: b */
    final /* synthetic */ C79783cf f218720b;

    public C79780cc(C79783cf cfVar, C60321oe oeVar) {
        this.f218720b = cfVar;
        this.f218719a = oeVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C79783cf.f218738a.mo56226d()).mo56382g(th)).mo56372aa(3991)).mo56386p("Log event creation failed.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C143657j d = ((C143658k) this.f218720b.f218741d.mo27525b()).mo118999d((C58192i) obj);
        C60321oe oeVar = this.f218719a;
        if (oeVar != null) {
            d.f389463e = oeVar;
        }
        Optional d2 = this.f218720b.f218745h.mo72021b().mo72038d();
        Objects.requireNonNull(d);
        d2.ifPresent(new C79779cb(d));
        d.mo118992a();
    }
}
