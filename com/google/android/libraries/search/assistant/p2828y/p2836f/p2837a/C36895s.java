package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import com.google.android.libraries.assistant.assistantactions.p621c.p622a.C11059d;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.s */
/* compiled from: PG */
public final /* synthetic */ class C36895s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36899w f96068a;

    /* renamed from: b */
    public final /* synthetic */ C36906e f96069b;

    public /* synthetic */ C36895s(C36899w wVar, C36906e eVar) {
        this.f96068a = wVar;
        this.f96069b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C36899w wVar = this.f96068a;
        C36906e eVar = this.f96069b;
        C36885i iVar = (C36885i) obj;
        if (eVar.mo40455d() || wVar.f96081e.isEmpty()) {
            cxVar = wVar.mo40448e(wVar.f96082f.mo40495a());
        } else {
            cxVar = wVar.mo40448e(((C11059d) wVar.f96081e.get()).mo19528b("fluid_actions_alarm_preferred_app_package_name"));
        }
        C60870cx cxVar3 = cxVar;
        if (eVar.mo40455d() || wVar.f96081e.isEmpty()) {
            cxVar2 = wVar.mo40448e(wVar.f96082f.mo40496b());
        } else {
            cxVar2 = wVar.mo40448e(((C11059d) wVar.f96081e.get()).mo19528b("fluid_actions_timer_preferred_app_package_name"));
        }
        C60870cx cxVar4 = cxVar2;
        return C47638k.m84753d(cxVar3, cxVar4).mo51520a(new C36892p(wVar, iVar, cxVar3, cxVar4, eVar), wVar.f96079c);
    }
}
