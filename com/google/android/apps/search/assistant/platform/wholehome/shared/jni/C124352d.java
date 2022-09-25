package com.google.android.apps.search.assistant.platform.wholehome.shared.jni;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.jni.d */
/* compiled from: PG */
public final /* synthetic */ class C124352d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124354f f343252a;

    public /* synthetic */ C124352d(C124354f fVar) {
        this.f343252a = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124354f fVar = this.f343252a;
        if (fVar.f343257e != null) {
            ((C58970a) ((C58970a) C124354f.f343253a.mo56226d()).mo56372aa(36189)).mo56386p("Ongoing whole home feature module install request.");
            C60870cx cxVar = fVar.f343257e;
            cxVar.getClass();
            return cxVar;
        }
        C124351c cVar = new C124351c(fVar);
        fVar.f343257e = C60856cj.m92905n(C47810es.m84965e(cVar), fVar.f343255c);
        return fVar.f343257e;
    }
}
