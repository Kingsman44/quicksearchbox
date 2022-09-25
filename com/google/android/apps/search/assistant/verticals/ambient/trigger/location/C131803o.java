package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.o */
/* compiled from: PG */
public final /* synthetic */ class C131803o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C131763ad f359995a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f359996b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f359997c;

    public /* synthetic */ C131803o(C131763ad adVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f359995a = adVar;
        this.f359996b = cxVar;
        this.f359997c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C131763ad adVar = this.f359995a;
        C60870cx cxVar = this.f359996b;
        C60870cx cxVar2 = this.f359997c;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        C58838bb.m90869d(optional.isPresent(), "Should have pendingIntent");
        return C47633f.m84733g(adVar.mo110303e((AccountId) C60856cj.m92909r(cxVar2))).mo51516i(new C131811w(optional), adVar.f359938e).mo51516i(new C131812x(adVar), adVar.f359938e);
    }
}
