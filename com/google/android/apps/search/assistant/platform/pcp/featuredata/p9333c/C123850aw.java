package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.aw */
/* compiled from: PG */
public final /* synthetic */ class C123850aw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123853az f342124a;

    public /* synthetic */ C123850aw(C123853az azVar) {
        this.f342124a = azVar;
    }

    public final C60870cx apply(Object obj) {
        C123853az azVar = this.f342124a;
        if (!((Boolean) obj).booleanValue()) {
            azVar.f342133d.f342762a.mo41704s("PCP_CALENDAR_REFRESH_TASK_MISSING");
            azVar.f342130a.mo106151a();
            C60856cj.m92911t(azVar.mo106147d("Local_Calendar_Update_Worker_KEY_ONE"), C47810es.m84974n(new C123851ax(azVar)), C60826bg.f164896a);
        } else {
            ((C58970a) ((C58970a) azVar.f342134e.mo56224b()).mo56372aa(35291)).mo56386p("Calendar refresh worker found. Do not schedule new one.");
        }
        return C60866ct.f164955a;
    }
}
