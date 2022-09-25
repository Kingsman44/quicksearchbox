package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.r */
/* compiled from: PG */
public final /* synthetic */ class C123995r implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124003z f342467a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f342468b;

    public /* synthetic */ C123995r(C124003z zVar, C58480gp gpVar) {
        this.f342467a = zVar;
        this.f342468b = gpVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124003z zVar = this.f342467a;
        C58485gu f = this.f342468b.mo55394f();
        if (!zVar.f342496b.isPresent() || f.isEmpty()) {
            return C60866ct.f164955a;
        }
        return ((C124167p) zVar.f342496b.get()).mo106310d(f);
    }
}
