package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import java.util.Collections;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.g */
/* compiled from: PG */
public final class C138228g implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C138263n f376094a;

    /* renamed from: b */
    final /* synthetic */ C138240s f376095b;

    public C138228g(C138263n nVar, C138240s sVar) {
        this.f376094a = nVar;
        this.f376095b = sVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C138240s sVar = (C138240s) obj;
        C69664n.m101060f(sVar, "it");
        C138263n nVar = this.f376094a;
        C138240s sVar2 = this.f376095b;
        C62934bn builder = sVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C138242u a = C69664n.m101061g((C138236o) builder, "builder");
        String str = nVar.f376172b;
        C69664n.m101060f(str, "getSuggestionsRequest.query");
        boolean z = false;
        if (str.length() == 0 && !nVar.f376174d) {
            z = true;
        }
        if (z && sVar.f376123e) {
            a.mo114219f();
            a.mo114215b();
            a.mo114218e();
            C138236o oVar = a.f376125a;
            oVar.copyOnWrite();
            ((C138240s) oVar.instance).mo114212b().clear();
            a.mo114220g();
            C138236o oVar2 = a.f376125a;
            oVar2.copyOnWrite();
            ((C138240s) oVar2.instance).mo114213c().clear();
        }
        a.mo114219f();
        Map unmodifiableMap = Collections.unmodifiableMap(sVar2.f376120b);
        C69664n.m101060f(unmodifiableMap, "newCacheEntry.requestsMap");
        C69664n.m101061g(unmodifiableMap, "map");
        C138236o oVar3 = a.f376125a;
        oVar3.copyOnWrite();
        ((C138240s) oVar3.instance).mo114211a().putAll(unmodifiableMap);
        a.mo114218e();
        Map unmodifiableMap2 = Collections.unmodifiableMap(sVar2.f376121c);
        C69664n.m101060f(unmodifiableMap2, "newCacheEntry.internalSuggestionsMap");
        a.mo114216c(unmodifiableMap2);
        a.mo114220g();
        Map unmodifiableMap3 = Collections.unmodifiableMap(sVar2.f376122d);
        C69664n.m101060f(unmodifiableMap3, "newCacheEntry.responseParametersMap");
        C69664n.m101061g(unmodifiableMap3, "map");
        C138236o oVar4 = a.f376125a;
        oVar4.copyOnWrite();
        ((C138240s) oVar4.instance).mo114213c().putAll(unmodifiableMap3);
        C138236o oVar5 = a.f376125a;
        oVar5.copyOnWrite();
        C138240s sVar3 = (C138240s) oVar5.instance;
        sVar3.f376119a |= 1;
        sVar3.f376123e = z;
        return a.mo114214a();
    }
}
