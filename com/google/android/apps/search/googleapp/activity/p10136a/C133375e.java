package com.google.android.apps.search.googleapp.activity.p10136a;

import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.metrics.p2410e.C31435u;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.activity.a.e */
/* compiled from: PG */
public final class C133375e {

    /* renamed from: a */
    static final /* synthetic */ C133375e f363439a = new C133375e();

    private C133375e() {
    }

    /* renamed from: a */
    public static final C137416e m216485a(C139767h hVar) {
        C69664n.m101061g(hVar, "eventData");
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        C69664n.m101060f(eVar, "newBuilder()");
        String str = hVar.f379876f;
        C69664n.m101060f(str, "eventData.searchQuery");
        if (str.length() > 0) {
            eVar.copyOnWrite();
            C137418g gVar = (C137418g) eVar.instance;
            str.getClass();
            gVar.f373769a |= 1;
            gVar.f373770b = str;
        }
        boolean z = hVar.f379879i;
        eVar.copyOnWrite();
        C137418g gVar2 = (C137418g) eVar.instance;
        gVar2.f373769a |= 32;
        gVar2.f373776h = z;
        for (Map.Entry entry : Collections.unmodifiableMap(hVar.f379875e).entrySet()) {
            eVar.mo113714b((String) entry.getKey(), (String) entry.getValue());
        }
        if ((hVar.f379871a & 128) != 0) {
            String str2 = hVar.f379880j;
            eVar.copyOnWrite();
            C137418g gVar3 = (C137418g) eVar.instance;
            str2.getClass();
            gVar3.f373769a |= 256;
            gVar3.f373778j = str2;
        }
        return eVar;
    }

    /* renamed from: b */
    public static final void m216486b(boolean z, C31435u uVar) {
        C69664n.m101061g(uVar, "memoryMetricService");
        if (z) {
            uVar.mo37110f(C31164au.m58092b("AGATopLevelDestinationNavigationHasOccurred"));
        }
    }

    /* renamed from: c */
    public static final C137418g m216487c(C139767h hVar) {
        C69664n.m101061g(hVar, "eventData");
        C137416e a = m216485a(hVar);
        if (!hVar.f379874d) {
            C62942bv build = a.build();
            C69664n.m101060f(build, "queryOptions.build()");
            return (C137418g) build;
        }
        a.mo113714b("oi", "ddle");
        if (hVar.f379875e.containsKey("ct")) {
            C62995dn dnVar = hVar.f379875e;
            if (dnVar.containsKey("ct")) {
                a.mo113714b("ct", (String) dnVar.get("ct"));
            } else {
                throw new IllegalArgumentException();
            }
        }
        C62942bv build2 = a.build();
        C69664n.m101060f(build2, "queryOptions.build()");
        return (C137418g) build2;
    }
}
