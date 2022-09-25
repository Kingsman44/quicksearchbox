package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import com.google.android.libraries.assistant.assistantactions.p621c.p622a.C11059d;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.t */
/* compiled from: PG */
public final /* synthetic */ class C36896t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36899w f96070a;

    /* renamed from: b */
    public final /* synthetic */ C36906e f96071b;

    public /* synthetic */ C36896t(C36899w wVar, C36906e eVar) {
        this.f96070a = wVar;
        this.f96071b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C36899w wVar = this.f96070a;
        C36906e eVar = this.f96071b;
        C51593nl nlVar = (C51593nl) ((C36885i) obj).mo40437c().toBuilder();
        if (eVar.mo40455d() || wVar.f96081e.isEmpty()) {
            cxVar = wVar.mo40448e(wVar.f96082f.mo40496b());
        } else {
            cxVar = wVar.mo40448e(((C11059d) wVar.f96081e.get()).mo19528b("fluid_actions_timer_preferred_app_package_name"));
        }
        return C47633f.m84733g(cxVar).mo51515h(new C36889m(wVar, nlVar, eVar), wVar.f96079c);
    }
}
