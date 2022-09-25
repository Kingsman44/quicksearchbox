package com.google.android.apps.search.googleapp.incognito.p10327f;

import com.google.android.apps.search.googleapp.incognito.p10327f.p10328a.C136274b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.incognito.f.e */
/* compiled from: PG */
public final /* synthetic */ class C136278e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C136281h f371098a;

    public /* synthetic */ C136278e(C136281h hVar) {
        this.f371098a = hVar;
    }

    public final C60870cx apply(Object obj) {
        C136281h hVar = this.f371098a;
        C136274b bVar = (C136274b) obj;
        if (!bVar.f371089b.isEmpty()) {
            return C60856cj.m92900i(Optional.m71637of(bVar.f371089b));
        }
        C61363ae aeVar = new C61363ae();
        aeVar.mo57933b("GET");
        aeVar.f165930a = "https://www.google.com/gen_204";
        aeVar.mo57932a(C61362ad.m93870b("Cache-Control"), "no-cache, no-store");
        C60870cx a = hVar.f371102b.mo42484a(new C61365ag(aeVar));
        C136279f fVar = new C136279f(hVar);
        return C60922j.m93045h(a, C47810es.m84966f(fVar), hVar.f371101a);
    }
}
