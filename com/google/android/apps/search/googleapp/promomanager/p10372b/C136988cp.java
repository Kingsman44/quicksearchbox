package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63919bf;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.cp */
/* compiled from: PG */
public final /* synthetic */ class C136988cp implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137003dd f372805a;

    /* renamed from: b */
    public final /* synthetic */ C63919bf f372806b;

    /* renamed from: c */
    public final /* synthetic */ C63042fg f372807c;

    /* renamed from: d */
    public final /* synthetic */ C137007dh f372808d;

    public /* synthetic */ C136988cp(C137003dd ddVar, C63919bf bfVar, C63042fg fgVar, C137007dh dhVar) {
        this.f372805a = ddVar;
        this.f372806b = bfVar;
        this.f372807c = fgVar;
        this.f372808d = dhVar;
    }

    public final Object apply(Object obj) {
        C137003dd ddVar = this.f372805a;
        C63919bf bfVar = this.f372806b;
        C63042fg fgVar = this.f372807c;
        C137007dh dhVar = this.f372808d;
        if (!((Boolean) obj).booleanValue()) {
            C37259h d = C37182a.f98166ha.mo40806d();
            C137005df dfVar = (C137005df) C137007dh.f372869h.createBuilder();
            C63909aw awVar = bfVar.f172848b;
            if (awVar == null) {
                awVar = C63909aw.f172816e;
            }
            dfVar.copyOnWrite();
            C137007dh dhVar2 = (C137007dh) dfVar.instance;
            awVar.getClass();
            dhVar2.f372875e = awVar;
            dhVar2.f372871a |= 8;
            ddVar.mo113477x(d, (C137007dh) dfVar.build(), fgVar);
            return C137007dh.f372869h;
        }
        ddVar.mo113477x(C37182a.f97891cQ.mo40806d(), dhVar, fgVar);
        return dhVar;
    }
}
