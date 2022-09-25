package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1391d;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.e.a.d.e */
/* compiled from: PG */
public final /* synthetic */ class C17263e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17264f f50041a;

    public /* synthetic */ C17263e(C17264f fVar) {
        this.f50041a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C17264f fVar = this.f50041a;
        C46108a aVar = (C46108a) obj;
        if ("pseudonymous".equals(aVar.mo50210b().f121165j) || C46180e.m82417b(aVar)) {
            ((C59052c) ((C59052c) C17264f.f50042a.mo56226d()).mo56372aa(42649)).mo56386p("AuthToken could not be included in request. Expected for logged-out and incognito users.");
            return C60856cj.m92900i(fVar.mo23254b(Optional.empty()));
        }
        if (fVar.f50047f) {
            cxVar = fVar.f50045d.mo51024a(fVar.f50044c);
        } else {
            cxVar = fVar.f50045d.mo51025b(fVar.f50044c);
        }
        return C47633f.m84733g(C60856cj.m92908q(cxVar, fVar.f50048g.longValue(), TimeUnit.MILLISECONDS, fVar.f50043b)).mo51515h(new C17259a(fVar), fVar.f50043b);
    }
}
