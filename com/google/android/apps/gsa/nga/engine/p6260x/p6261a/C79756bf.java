package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bf */
/* compiled from: PG */
public final /* synthetic */ class C79756bf implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C79783cf f218683a;

    /* renamed from: b */
    public final /* synthetic */ Optional f218684b;

    /* renamed from: c */
    public final /* synthetic */ C60321oe f218685c;

    public /* synthetic */ C79756bf(C79783cf cfVar, Optional optional, C60321oe oeVar) {
        this.f218683a = cfVar;
        this.f218684b = optional;
        this.f218685c = oeVar;
    }

    public final void run() {
        C79783cf cfVar = this.f218683a;
        Optional optional = this.f218684b;
        C60321oe oeVar = this.f218685c;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 472;
        C48420g b = cfVar.f218753p.mo75573b();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164237co = b;
        ufVar2.f164255j |= 32;
        Objects.requireNonNull(tzVar);
        optional.ifPresent(new C79773bw(tzVar));
        cfVar.mo74232o((C60555uf) tzVar.build(), oeVar);
    }
}
