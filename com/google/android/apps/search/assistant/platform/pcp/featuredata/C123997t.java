package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.t */
/* compiled from: PG */
public final /* synthetic */ class C123997t implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124003z f342478a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f342479b;

    public /* synthetic */ C123997t(C124003z zVar, C58480gp gpVar) {
        this.f342478a = zVar;
        this.f342479b = gpVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124003z zVar = this.f342478a;
        C58485gu f = this.f342479b.mo55394f();
        if (!zVar.f342496b.isPresent() || f.isEmpty()) {
            return C60866ct.f164955a;
        }
        ((C58970a) ((C58970a) zVar.f342497c.mo56224b()).mo56372aa(35211)).mo56386p("#processCommuteTimeNotification() to processValidityUpdateForEntities");
        return ((C124167p) zVar.f342496b.get()).mo106310d(f);
    }
}
