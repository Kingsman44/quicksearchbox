package com.google.android.libraries.assistant.contexttrigger.p1466j;

import com.google.android.libraries.assistant.contexttrigger.p1462f.C17718j;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.j.k */
/* compiled from: PG */
public final /* synthetic */ class C17795k implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C17797m f51071a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f51072b;

    /* renamed from: c */
    public final /* synthetic */ C58480gp f51073c;

    /* renamed from: d */
    public final /* synthetic */ C58480gp f51074d;

    /* renamed from: e */
    public final /* synthetic */ C58480gp f51075e;

    public /* synthetic */ C17795k(C17797m mVar, C60870cx cxVar, C58480gp gpVar, C58480gp gpVar2, C58480gp gpVar3) {
        this.f51071a = mVar;
        this.f51072b = cxVar;
        this.f51073c = gpVar;
        this.f51074d = gpVar2;
        this.f51075e = gpVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C17797m mVar = this.f51071a;
        C60870cx cxVar = this.f51072b;
        C58480gp gpVar = this.f51073c;
        C58480gp gpVar2 = this.f51074d;
        C58480gp gpVar3 = this.f51075e;
        C58480gp e = C58485gu.m89837e();
        for (AccountId accountId : (Set) C60856cj.m92909r(cxVar)) {
            e.mo55395g(mVar.f51080d.mo23465a(C17718j.m35001b(mVar.f51079c, accountId), C17718j.m35000a(mVar.f51079c, accountId), gpVar.mo55394f(), gpVar2.mo55394f(), gpVar3.mo55394f()));
        }
        return C60856cj.m92896e(e.mo55394f());
    }
}
