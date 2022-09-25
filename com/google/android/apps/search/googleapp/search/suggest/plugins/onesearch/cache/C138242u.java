package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62884c;
import java.util.Collections;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.u */
/* compiled from: PG */
public final class C138242u {

    /* renamed from: a */
    public final C138236o f376125a;

    public C138242u(C138236o oVar) {
        this.f376125a = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C138240s mo114214a() {
        C62942bv build = this.f376125a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C138240s) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo114215b() {
        C138236o oVar = this.f376125a;
        oVar.copyOnWrite();
        C138240s sVar = C138240s.f376117f;
        ((C138240s) oVar.instance).mo114211a().clear();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo114216c(Map map) {
        C69664n.m101061g(map, "map");
        C138236o oVar = this.f376125a;
        oVar.copyOnWrite();
        C138240s sVar = C138240s.f376117f;
        ((C138240s) oVar.instance).mo114212b().putAll(map);
    }

    /* renamed from: d */
    public final void mo114217d(String str, C138263n nVar) {
        C69664n.m101061g(str, "key");
        C69664n.m101061g(nVar, "value");
        C138236o oVar = this.f376125a;
        str.getClass();
        nVar.getClass();
        oVar.copyOnWrite();
        C138240s sVar = C138240s.f376117f;
        ((C138240s) oVar.instance).mo114211a().put(str, nVar);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo114218e() {
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C138240s) this.f376125a.instance).f376121c));
        C69664n.m101060f(unmodifiableMap, "_builder.getInternalSuggestionsMap()");
        new C62884c(unmodifiableMap);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo114219f() {
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C138240s) this.f376125a.instance).f376120b));
        C69664n.m101060f(unmodifiableMap, "_builder.getRequestsMap()");
        new C62884c(unmodifiableMap);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo114220g() {
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C138240s) this.f376125a.instance).f376122d));
        C69664n.m101060f(unmodifiableMap, "_builder.getResponseParametersMap()");
        new C62884c(unmodifiableMap);
    }
}
