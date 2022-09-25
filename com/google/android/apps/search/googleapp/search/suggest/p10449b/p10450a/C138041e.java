package com.google.android.apps.search.googleapp.search.suggest.p10449b.p10450a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.a.e */
/* compiled from: PG */
final class C138041e implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C138042f f375601a;

    public C138041e(C138042f fVar) {
        this.f375601a = fVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m224343a(C61363ae aeVar, C60870cx cxVar, C60870cx cxVar2) {
        aeVar.mo57932a(C61362ad.m93870b("User-Agent"), (String) C60856cj.m92909r(cxVar));
        try {
            ((Optional) C60856cj.m92909r(cxVar2)).ifPresent(new C138038b(aeVar));
        } catch (CancellationException | ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) C138042f.f375602a.mo56226d()).mo56382g(e)).mo56372aa(41119)).mo56386p("Failed to fetch auth header");
        }
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C60870cx a = this.f375601a.f375604c.mo111320a();
        C47633f h = C47633f.m84733g(this.f375601a.f375605d.mo17428b()).mo51515h(C138039c.f375597a, this.f375601a.f375607f);
        return C47638k.m84751b(a, h).mo51520a(C47810es.m84978r(new C138040d((C61363ae) obj, a, h)), this.f375601a.f375607f);
    }
}
