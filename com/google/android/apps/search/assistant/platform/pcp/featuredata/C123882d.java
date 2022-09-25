package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d */
/* compiled from: PG */
public final /* synthetic */ class C123882d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123910h f342198a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f342199b;

    public /* synthetic */ C123882d(C123910h hVar, C58480gp gpVar) {
        this.f342198a = hVar;
        this.f342199b = gpVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C123910h hVar = this.f342198a;
        C58485gu f = this.f342199b.mo55394f();
        if (f.isEmpty() || !hVar.f342260c.isPresent()) {
            return C60866ct.f164955a;
        }
        return ((C124167p) hVar.f342260c.get()).mo106310d(f);
    }
}
