package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.libraries.geller.portable.Geller;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.ag */
/* compiled from: PG */
public final /* synthetic */ class C100895ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100898aj f281896a;

    /* renamed from: b */
    public final /* synthetic */ String f281897b;

    public /* synthetic */ C100895ag(C100898aj ajVar, String str) {
        this.f281896a = ajVar;
        this.f281897b = str;
    }

    public final C60870cx apply(Object obj) {
        C100898aj ajVar = this.f281896a;
        String str = this.f281897b;
        Geller geller = (Geller) obj;
        C60870cx s = geller.mo27208s(str, C65753ak.ASSISTANT_HISTORY, 10000, C63662ac.f172144a);
        C60870cx s2 = geller.mo27208s(str, C65753ak.WEB_SEARCH, 10000, C63662ac.f172144a);
        return C47638k.m84753d(s, s2).mo51520a(new C100897ai(s, s2), ajVar.f281908b);
    }
}
