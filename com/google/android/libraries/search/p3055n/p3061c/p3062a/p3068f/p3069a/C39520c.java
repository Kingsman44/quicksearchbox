package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62940bt;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71023bw;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71041cn;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71042co;

/* renamed from: com.google.android.libraries.search.n.c.a.f.a.c */
/* compiled from: PG */
public final /* synthetic */ class C39520c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39526i f104060a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f104061b;

    /* renamed from: c */
    public final /* synthetic */ C37259h f104062c;

    /* renamed from: d */
    public final /* synthetic */ int f104063d;

    public /* synthetic */ C39520c(C39526i iVar, C37259h hVar, C58833ax axVar, int i) {
        this.f104060a = iVar;
        this.f104062c = hVar;
        this.f104061b = axVar;
        this.f104063d = i;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39526i iVar = this.f104060a;
        C37259h hVar = this.f104062c;
        C58833ax axVar = this.f104061b;
        int i = this.f104063d;
        if (iVar.f104083e == null) {
            ((C59052c) ((C59052c) C39526i.f104079a.mo56226d()).mo56372aa(53686)).mo56386p("#logDspHotwordVerificationEndEvent. AppFlowLogger is not initialized! Ignore logging request!");
            return C60866ct.f164955a;
        }
        if (axVar.mo56113h()) {
            C62940bt btVar = C71042co.f189464e;
            C71041cn cnVar = (C71041cn) C71042co.f189463d.createBuilder();
            C71023bw bwVar = (C71023bw) axVar.mo56107c();
            cnVar.copyOnWrite();
            C71042co coVar = (C71042co) cnVar.instance;
            bwVar.getClass();
            coVar.f189468c = bwVar;
            coVar.f189466a |= 2;
            ((C37253b) hVar.f99012a).mo40792p(btVar, (C71042co) cnVar.build());
        }
        C37215b bVar = iVar.f104083e;
        bVar.getClass();
        return bVar.mo19974a(hVar.mo40780d(i - 2, "hdm_dsp_hotword_verification"));
    }
}
