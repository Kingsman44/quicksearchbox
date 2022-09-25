package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import com.google.android.apps.gsa.nga.engine.am.h.bb;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.p5913am.p5921h.C74903cs;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.v */
/* compiled from: PG */
public final /* synthetic */ class C77364v implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f213361a;

    /* renamed from: b */
    public final /* synthetic */ df f213362b;

    /* renamed from: c */
    public final /* synthetic */ long f213363c;

    /* renamed from: d */
    public final /* synthetic */ y f213364d;

    /* renamed from: e */
    public final /* synthetic */ C83320io f213365e;

    /* renamed from: f */
    public final /* synthetic */ C80303ay f213366f;

    public /* synthetic */ C77364v(C76795ay ayVar, df dfVar, long j, y yVar, C83320io ioVar, C80303ay ayVar2) {
        this.f213361a = ayVar;
        this.f213362b = dfVar;
        this.f213363c = j;
        this.f213364d = yVar;
        this.f213365e = ioVar;
        this.f213366f = ayVar2;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C76795ay ayVar = this.f213361a;
        df dfVar = this.f213362b;
        long j = this.f213363c;
        y yVar = this.f213364d;
        C83320io ioVar = this.f213365e;
        C80303ay ayVar2 = this.f213366f;
        C74903cs csVar = (C74903cs) obj;
        if (csVar.mo71288c()) {
            ((C58970a) ((C58970a) C76795ay.f212177a.mo56224b()).mo56372aa(3657)).mo56386p("AUM failed to resolve phone label.");
            ayVar.f212190l.mo76648a(ioVar, C82835ce.AUM_PHONE_LABEL_NOT_RESOLVED, C83044e.f226656a);
            return C80913i.m128773b(Optional.empty());
        }
        return C80913i.m128774c(ayVar.f212188j.d(bb.b, dfVar, j, yVar.b(), (String) csVar.mo71287b().get(), csVar.mo71286a(), ioVar, ayVar2));
    }
}
