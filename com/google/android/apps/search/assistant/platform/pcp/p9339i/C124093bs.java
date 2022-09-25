package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bs */
/* compiled from: PG */
public final /* synthetic */ class C124093bs implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124099by f342738a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f342739b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f342740c;

    /* renamed from: d */
    public final /* synthetic */ C58480gp f342741d;

    public /* synthetic */ C124093bs(C124099by byVar, C60870cx cxVar, C60870cx cxVar2, C58480gp gpVar) {
        this.f342738a = byVar;
        this.f342739b = cxVar;
        this.f342740c = cxVar2;
        this.f342741d = gpVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124099by byVar = this.f342738a;
        C60870cx cxVar = this.f342739b;
        C60870cx cxVar2 = this.f342740c;
        C58480gp gpVar = this.f342741d;
        C46459k.m82829b(cxVar, "Failed to write GCM Flight message", new Object[0]);
        C46459k.m82829b(cxVar2, "Failed to write ZeroState Flight message", new Object[0]);
        C58485gu f = gpVar.mo55394f();
        if (f.isEmpty() || !byVar.f342757b.isPresent()) {
            return C60866ct.f164955a;
        }
        return ((C124167p) byVar.f342757b.get()).mo106310d(f);
    }
}
