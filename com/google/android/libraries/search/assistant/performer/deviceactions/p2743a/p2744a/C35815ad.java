package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C35815ad implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f93835a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f93836b;

    public /* synthetic */ C35815ad(C60870cx cxVar, C58485gu guVar) {
        this.f93835a = cxVar;
        this.f93836b = guVar;
    }

    public final Object call() {
        C60870cx cxVar = this.f93835a;
        C58485gu guVar = this.f93836b;
        try {
            return (C58485gu) C60856cj.m92909r(cxVar);
        } catch (Exception e) {
            C59104x c = C35817af.f93839a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GetSettingPhoneBuddy");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(51920)).mo56386p("Failed to retrieve settingIds that failed use Phone Buddy flow.");
            return guVar;
        }
    }
}
