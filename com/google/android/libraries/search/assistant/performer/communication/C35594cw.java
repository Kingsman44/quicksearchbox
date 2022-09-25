package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cw */
/* compiled from: PG */
public final /* synthetic */ class C35594cw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35666da f93429a;

    /* renamed from: b */
    public final /* synthetic */ C35597cz f93430b;

    public /* synthetic */ C35594cw(C35666da daVar, C35597cz czVar) {
        this.f93429a = daVar;
        this.f93430b = czVar;
    }

    public final C60870cx apply(Object obj) {
        C35666da daVar = this.f93429a;
        C35597cz czVar = this.f93430b;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.PERMISSION_DENIED, "Permission requesting background location denied"));
        }
        C60870cx a = czVar.mo39727a().mo21007a();
        C35595cx cxVar = C35595cx.f93431a;
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(cxVar), daVar.f93546b);
        C35593cv cvVar = C35593cv.f93428a;
        return C60846c.m92878g(g, Throwable.class, C47810es.m84963c(cvVar), daVar.f93546b);
    }
}
