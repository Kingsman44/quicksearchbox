package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.am */
/* compiled from: PG */
public final /* synthetic */ class C124058am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124059an f342645a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f342646b;

    public /* synthetic */ C124058am(C124059an anVar, C58480gp gpVar) {
        this.f342645a = anVar;
        this.f342646b = gpVar;
    }

    public final C60870cx apply(Object obj) {
        C124059an anVar = this.f342645a;
        Void voidR = (Void) obj;
        C58485gu f = this.f342646b.mo55394f();
        if (!anVar.f342650d.isPresent() || f.isEmpty()) {
            return C60866ct.f164955a;
        }
        return ((C124167p) anVar.f342650d.get()).mo106310d(f);
    }
}
