package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1186a.p1187a;

import com.google.android.gms.contextmanager.C144029c;
import com.google.android.gms.contextmanager.C144030d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C15844e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15854o f47085a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f47086b;

    public /* synthetic */ C15844e(C15854o oVar, C58485gu guVar) {
        this.f47085a = oVar;
        this.f47086b = guVar;
    }

    public final C60870cx apply(Object obj) {
        C15854o oVar = this.f47085a;
        oVar.f47103h = this.f47086b;
        if (((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(true);
        }
        C59104x b = C15854o.f47096a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AwarenessListener");
        ((C59052c) ((C59052c) b).mo56372aa(46450)).mo56386p("Register Awareness listener.");
        oVar.f47102g = Optional.m71637of(new C15849j(oVar));
        C144029c cVar = new C144029c();
        cVar.mo119542b(67);
        C60870cx c = oVar.f47100e.mo20980c(oVar.f47101f);
        C15840a aVar = new C15840a(oVar, cVar.mo119541a(), (C144030d) oVar.f47102g.get());
        return C60922j.m93045h(c, C47810es.m84966f(aVar), oVar.f47098c);
    }
}
