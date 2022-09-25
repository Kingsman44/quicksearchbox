package com.google.android.apps.search.assistant.platform.wholehome.shared.jni;

import com.google.android.apps.search.assistant.libraries.p8975g.C119385a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.jni.c */
/* compiled from: PG */
public final /* synthetic */ class C124351c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124354f f343251a;

    public /* synthetic */ C124351c(C124354f fVar) {
        this.f343251a = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124354f fVar = this.f343251a;
        if (fVar.f343254b.mo104323a().contains("whole_home_native_feature_module")) {
            ((C58970a) ((C58970a) C124354f.f343253a.mo56224b()).mo56372aa(36188)).mo56386p("Whole home feature module is available.");
            fVar.f343257e = null;
            return C60866ct.f164955a;
        }
        return C47633f.m84733g(fVar.f343254b.mo104324b(C58485gu.m89846n(new C119385a()), new C124353e())).mo51516i(new C124349a(fVar), fVar.f343255c).mo51514f(Throwable.class, new C124350b(fVar), fVar.f343255c);
    }
}
