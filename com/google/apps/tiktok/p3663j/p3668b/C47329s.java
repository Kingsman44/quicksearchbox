package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.concurrent.C46415ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.tiktok.j.b.s */
/* compiled from: PG */
public final /* synthetic */ class C47329s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C47333w f123010a;

    public /* synthetic */ C47329s(C47333w wVar) {
        this.f123010a = wVar;
    }

    public final C60870cx apply(Object obj) {
        C47333w wVar = this.f123010a;
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return C60856cj.m92900i(Collections.emptySet());
        }
        C47298af afVar = wVar.f123020d;
        C60870cx b = afVar.f122957c.mo19399b(new C47335y(afVar, map.keySet()));
        C60870cx g = wVar.mo51204g(b);
        Callable r = C47810es.m84978r(new C47330t(wVar, b, map));
        Objects.requireNonNull(r);
        C60870cx b2 = C46415ab.m82768b(g, new C47331u(r), wVar.f123018b);
        C46459k kVar = wVar.f123019c;
        Objects.requireNonNull(map);
        C60870cx a = C46415ab.m82767a(b2, C47810es.m84978r(new C47332v(map)), wVar.f123018b);
        kVar.mo50456d(a, C47831fm.m85015j());
        return a;
    }
}
