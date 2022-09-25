package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.libraries.gsa.p1876k.C22868d;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.ar */
/* compiled from: PG */
final class C76489ar implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C76490as f211678a;

    public C76489ar(C76490as asVar) {
        this.f211678a = asVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            Collection.EL.stream(this.f211678a.f211681c).forEach(new C76487ap());
        } else {
            Collection.EL.stream(this.f211678a.f211681c).forEach(new C76488aq((C77426t) optional.get()));
        }
    }
}
