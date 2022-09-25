package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39411b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62940bt;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71041cn;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71042co;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71082ea;

/* renamed from: com.google.android.libraries.search.n.c.a.f.a.f */
/* compiled from: PG */
public final /* synthetic */ class C39523f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39526i f104069a;

    /* renamed from: b */
    public final /* synthetic */ C39411b f104070b;

    /* renamed from: c */
    public final /* synthetic */ C71082ea f104071c;

    /* renamed from: d */
    public final /* synthetic */ C37259h f104072d;

    /* renamed from: e */
    public final /* synthetic */ int f104073e;

    public /* synthetic */ C39523f(C39526i iVar, C37259h hVar, C39411b bVar, int i, C71082ea eaVar) {
        this.f104069a = iVar;
        this.f104072d = hVar;
        this.f104070b = bVar;
        this.f104073e = i;
        this.f104071c = eaVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39526i iVar = this.f104069a;
        C37259h hVar = this.f104072d;
        C39411b bVar = this.f104070b;
        int i = this.f104073e;
        C71082ea eaVar = this.f104071c;
        C37215b bVar2 = iVar.f104083e;
        if (bVar2 == null) {
            ((C59052c) ((C59052c) C39526i.f104079a.mo56226d()).mo56372aa(53688)).mo56386p("#logRequestHandlingEndEvent. AppFlowLogger is not initialized! Ignore logging request!");
            return C60866ct.f164955a;
        }
        ((C37253b) hVar.f99012a).mo40795s(C39526i.m68948b(bVar.mo41820a()), bVar.mo41821b());
        C37252a d = hVar.mo40780d(i - 2, "hdm_request_handling");
        C62940bt btVar = C71042co.f189464e;
        C71041cn cnVar = (C71041cn) C71042co.f189463d.createBuilder();
        cnVar.copyOnWrite();
        C71042co coVar = (C71042co) cnVar.instance;
        eaVar.getClass();
        coVar.f189467b = eaVar;
        coVar.f189466a |= 1;
        ((C37253b) d).mo40792p(btVar, (C71042co) cnVar.build());
        return bVar2.mo19974a(d);
    }
}
