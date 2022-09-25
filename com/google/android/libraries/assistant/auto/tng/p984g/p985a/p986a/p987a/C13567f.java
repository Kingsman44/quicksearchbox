package com.google.android.libraries.assistant.auto.tng.p984g.p985a.p986a.p987a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p984g.p985a.C13560a;
import com.google.android.libraries.assistant.auto.tng.p984g.p985a.p986a.C13569c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.g.a.a.a.f */
/* compiled from: PG */
public final class C13567f implements C13560a {

    /* renamed from: a */
    private static final C59071e f41555a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.g.a.a.a.f");

    /* renamed from: b */
    private final Executor f41556b;

    /* renamed from: c */
    private final Map f41557c;

    /* renamed from: d */
    private final C13565d f41558d;

    public C13567f(Executor executor, C13565d dVar, Map map) {
        this.f41556b = executor;
        this.f41558d = dVar;
        this.f41557c = map;
    }

    /* renamed from: a */
    public final C60870cx mo21169a(C12991i iVar) {
        Map map = this.f41557c;
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (!map.containsKey(a)) {
            C59104x c = f41555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "UserAgentHelperImpl");
            C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(44900);
            C12989g a2 = C12989g.m29225a(iVar.f40385d);
            if (a2 == null) {
                a2 = C12989g.UNKNOWN;
            }
            cVar.mo56389s("UserAgentSuffixHelper not provided for EntrySurface: %s", a2.name());
            return C60856cj.m92900i("Invalid");
        }
        Map map2 = this.f41557c;
        C12989g a3 = C12989g.m29225a(iVar.f40385d);
        if (a3 == null) {
            a3 = C12989g.UNKNOWN;
        }
        C13565d dVar = this.f41558d;
        C60870cx d = dVar.f41552b.mo46042d();
        C13564c cVar2 = C13564c.f41550a;
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(cVar2), dVar.f41551a);
        C13566e eVar = new C13566e((C13569c) map2.get(a3), iVar);
        return C60922j.m93044g(g, C47810es.m84963c(eVar), this.f41556b);
    }
}
