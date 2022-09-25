package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39411b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.n.c.a.f.a.e */
/* compiled from: PG */
public final /* synthetic */ class C39522e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39526i f104066a;

    /* renamed from: b */
    public final /* synthetic */ C37252a f104067b;

    /* renamed from: c */
    public final /* synthetic */ C39411b f104068c;

    public /* synthetic */ C39522e(C39526i iVar, C37252a aVar, C39411b bVar) {
        this.f104066a = iVar;
        this.f104067b = aVar;
        this.f104068c = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39526i iVar = this.f104066a;
        C37252a aVar = this.f104067b;
        C39411b bVar = this.f104068c;
        C37215b bVar2 = iVar.f104083e;
        if (bVar2 == null) {
            ((C59052c) ((C59052c) C39526i.f104079a.mo56226d()).mo56372aa(53690)).mo56386p("#logRequestHandlingStartEvent. AppFlowLogger is not initialized! Ignore logging request!");
            return C60866ct.f164955a;
        }
        ((C37253b) aVar).mo40795s(C39526i.m68948b(bVar.mo41820a()), bVar.mo41821b());
        return bVar2.mo19974a(aVar);
    }
}
