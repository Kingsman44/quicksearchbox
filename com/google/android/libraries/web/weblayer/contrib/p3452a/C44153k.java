package com.google.android.libraries.web.weblayer.contrib.p3452a;

import com.google.android.libraries.web.profile.Profile;
import com.google.apps.tiktok.account.data.C46165aq;
import com.google.apps.tiktok.account.data.C46217l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.a.k */
/* compiled from: PG */
public final /* synthetic */ class C44153k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C44161s f114892a;

    /* renamed from: b */
    public final /* synthetic */ C46217l f114893b;

    public /* synthetic */ C44153k(C44161s sVar, C46217l lVar) {
        this.f114892a = sVar;
        this.f114893b = lVar;
    }

    public final C60870cx apply(Object obj) {
        C44161s sVar = this.f114892a;
        C46217l lVar = this.f114893b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C46165aq aqVar = (C46165aq) lVar;
        Profile b = sVar.mo47106b(aqVar.f121090a, aqVar.f121091b);
        if (!booleanValue) {
            return sVar.mo47108d(b.f114483a);
        }
        C44147e eVar = new C44147e(sVar, b);
        return C60856cj.m92905n(C47810es.m84965e(eVar), sVar.f114906c);
    }
}
