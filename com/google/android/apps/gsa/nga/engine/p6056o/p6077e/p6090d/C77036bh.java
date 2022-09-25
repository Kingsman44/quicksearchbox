package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.am.h.bb;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.p5913am.p5921h.C74903cs;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bh */
/* compiled from: PG */
public final /* synthetic */ class C77036bh implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C77089dg f212629a;

    /* renamed from: b */
    public final /* synthetic */ long f212630b;

    /* renamed from: c */
    public final /* synthetic */ df f212631c;

    /* renamed from: d */
    public final /* synthetic */ af f212632d;

    /* renamed from: e */
    public final /* synthetic */ C77140u f212633e;

    /* renamed from: f */
    public final /* synthetic */ C80303ay f212634f;

    public /* synthetic */ C77036bh(C77089dg dgVar, long j, df dfVar, af afVar, C77140u uVar, C80303ay ayVar) {
        this.f212629a = dgVar;
        this.f212630b = j;
        this.f212631c = dfVar;
        this.f212632d = afVar;
        this.f212633e = uVar;
        this.f212634f = ayVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C77089dg dgVar = this.f212629a;
        long j = this.f212630b;
        df dfVar = this.f212631c;
        af afVar = this.f212632d;
        C77140u uVar = this.f212633e;
        C80303ay ayVar = this.f212634f;
        C74903cs csVar = (C74903cs) obj;
        if (csVar.mo71288c()) {
            ((C58970a) ((C58970a) C77089dg.f212747a.mo56224b()).mo56372aa(3809)).mo56386p("AUM failed to disambiguate phone labels");
            C77089dg.m123752h(uVar, C82835ce.AUM_PHONE_LABEL_NOT_RESOLVED);
            return C80913i.m128773b(Optional.empty());
        }
        return C80913i.m128774c(dgVar.f212751e.d(bb.c, dfVar, j, afVar.b(), (String) csVar.mo71287b().get(), csVar.mo71286a(), uVar.mo72412h(), ayVar));
    }
}
