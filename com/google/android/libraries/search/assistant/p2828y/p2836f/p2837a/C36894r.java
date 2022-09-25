package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import com.google.android.libraries.assistant.assistantactions.p621c.p622a.C11059d;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3917i.p3918a.C51500k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.r */
/* compiled from: PG */
public final /* synthetic */ class C36894r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36899w f96066a;

    /* renamed from: b */
    public final /* synthetic */ C36906e f96067b;

    public /* synthetic */ C36894r(C36899w wVar, C36906e eVar) {
        this.f96066a = wVar;
        this.f96067b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C36899w wVar = this.f96066a;
        C36906e eVar = this.f96067b;
        C51500k kVar = (C51500k) ((C36885i) obj).mo40435a().toBuilder();
        if (eVar.mo40455d() || wVar.f96081e.isEmpty()) {
            cxVar = wVar.mo40448e(wVar.f96082f.mo40495a());
        } else {
            cxVar = wVar.mo40448e(((C11059d) wVar.f96081e.get()).mo19528b("fluid_actions_alarm_preferred_app_package_name"));
        }
        return C47633f.m84733g(cxVar).mo51515h(new C36887k(wVar, kVar, eVar), wVar.f96079c);
    }
}
