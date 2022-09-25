package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bo */
/* compiled from: PG */
public final /* synthetic */ class C92911bo implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C92915bs f259203a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f259204b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f259205c;

    /* renamed from: d */
    public final /* synthetic */ String f259206d;

    public /* synthetic */ C92911bo(C92915bs bsVar, C60870cx cxVar, C60870cx cxVar2, String str) {
        this.f259203a = bsVar;
        this.f259204b = cxVar;
        this.f259205c = cxVar2;
        this.f259206d = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C92915bs bsVar = this.f259203a;
        C60870cx cxVar = this.f259204b;
        C60870cx cxVar2 = this.f259205c;
        String str = this.f259206d;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar2);
        C60870cx L = ((C86232bo) axVar.mo56107c()).mo79876L();
        C60870cx D = ((C86232bo) axVar.mo56107c()).mo79868D();
        return C47636i.m84744c(L, D).mo51519b(new C92904bh(bsVar, (AccountId) C60856cj.m92909r(cxVar), L, D, str), bsVar.f259223j);
    }
}
