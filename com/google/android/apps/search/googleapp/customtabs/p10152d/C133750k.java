package com.google.android.apps.search.googleapp.customtabs.p10152d;

import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.k */
/* compiled from: PG */
public final /* synthetic */ class C133750k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133756q f364296a;

    public /* synthetic */ C133750k(C133756q qVar) {
        this.f364296a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C133756q qVar = this.f364296a;
        String str = (String) obj;
        if (str == null) {
            ((C59052c) ((C59052c) C133756q.f364302a.mo56226d()).mo56372aa(40092)).mo56386p("Unable to bind to Custom Tabs Service because no eligible browser is available");
            return C60856cj.m92899h(new C133705a("No Custom Tabs Browser available"));
        }
        C133745f fVar = qVar.f364303b;
        Duration duration = C133746g.f364283a;
        C60870cx q = C60856cj.m92908q(C2169h.m6027a(new C133744e(fVar, str)), C133746g.f364283a.toMillis(), TimeUnit.MILLISECONDS, fVar.f364281b);
        C133753n nVar = new C133753n(qVar);
        return C60922j.m93044g(q, C47810es.m84963c(nVar), qVar.f364304c);
    }
}
