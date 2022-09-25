package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9175b;

import android.databinding.C0118a;
import com.google.android.libraries.assistant.p1594s.p1597b.C19170bd;
import com.google.android.libraries.assistant.p1594s.p1597b.C19171be;
import com.google.assistant.p3781ad.p3789d.p3791b.C48684as;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Collection;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.b.e */
/* compiled from: PG */
final class C121199e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f336706a;

    /* renamed from: b */
    final /* synthetic */ long f336707b;

    /* renamed from: c */
    final /* synthetic */ C121201g f336708c;

    public C121199e(C121201g gVar, C70862aj ajVar, long j) {
        this.f336708c = gVar;
        this.f336706a = ajVar;
        this.f336707b = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C0118a.m110r(C121201g.f336710a.mo56226d(), "Failed to retrieve suggestions", 35736, th, C58979ad.FULL);
        this.f336706a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C48684as asVar = (C48684as) obj;
        if (asVar == null) {
            ((C59052c) ((C59052c) C121201g.f336710a.mo56225c()).mo56372aa(35737)).mo56386p("Suggestions null, returning empty response!");
            this.f336706a.mo20123c(C19171be.f53699b);
            this.f336706a.mo20121a();
            return;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(asVar.f125955a).map(new C121197c(this)).flatMap(C121198d.f336705a).collect(C58370cn.f155946a);
        this.f336708c.f336712c.mo105076d(this.f336707b, guVar);
        C70862aj ajVar = this.f336706a;
        C19170bd bdVar = (C19170bd) C19171be.f53699b.createBuilder();
        bdVar.mo24304a(guVar);
        ajVar.mo20123c((C19171be) bdVar.build());
        this.f336706a.mo20121a();
    }
}
