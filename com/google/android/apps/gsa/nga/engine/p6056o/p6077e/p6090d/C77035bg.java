package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.am.h.bb;
import com.google.android.apps.gsa.nga.engine.am.h.bc;
import com.google.android.apps.gsa.nga.engine.am.h.ct;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bg */
/* compiled from: PG */
public final /* synthetic */ class C77035bg implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C77089dg f212622a;

    /* renamed from: b */
    public final /* synthetic */ long f212623b;

    /* renamed from: c */
    public final /* synthetic */ df f212624c;

    /* renamed from: d */
    public final /* synthetic */ af f212625d;

    /* renamed from: e */
    public final /* synthetic */ C77140u f212626e;

    /* renamed from: f */
    public final /* synthetic */ C80303ay f212627f;

    /* renamed from: g */
    public final /* synthetic */ C80913i f212628g;

    public /* synthetic */ C77035bg(C77089dg dgVar, long j, df dfVar, af afVar, C77140u uVar, C80303ay ayVar, C80913i iVar) {
        this.f212622a = dgVar;
        this.f212623b = j;
        this.f212624c = dfVar;
        this.f212625d = afVar;
        this.f212626e = uVar;
        this.f212627f = ayVar;
        this.f212628g = iVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C77089dg dgVar = this.f212622a;
        long j = this.f212623b;
        df dfVar = this.f212624c;
        af afVar = this.f212625d;
        C77140u uVar = this.f212626e;
        C80303ay ayVar = this.f212627f;
        ct ctVar = dgVar.f212751e;
        bb bbVar = bb.c;
        bc b = afVar.b();
        C83320io h = uVar.mo72412h();
        return C80913i.m128774c(ctVar.e(bbVar, dfVar, j, b, (C58485gu) Collection.EL.stream((C58485gu) obj).filter(new C77048bt((Set) Collection.EL.stream((C58485gu) this.f212628g.mo74714i()).map(C77047bs.f212657a).collect(C58370cn.f155947b))).collect(C58370cn.f155946a), h, ayVar));
    }
}
