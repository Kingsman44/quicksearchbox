package com.google.android.libraries.home.p1940a.p1941a;

import com.google.android.libraries.home.p1940a.p1943c.C23475bc;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64285ad;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64291aj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.a.d */
/* compiled from: PG */
public final class C23347d {

    /* renamed from: a */
    public final C23475bc f63881a;

    /* renamed from: b */
    public final C23475bc f63882b;

    public C23347d(C23475bc bcVar, C23475bc bcVar2) {
        this.f63881a = bcVar;
        this.f63882b = bcVar2;
    }

    /* renamed from: a */
    public final Map mo28842a(Collection collection, Map map) {
        C69664n.m101061g(collection, "frontendObjectResponses");
        C69664n.m101061g(map, "existingDevices");
        Map r = C69505av.m100876r(map);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C64291aj ajVar = (C64291aj) it.next();
            C64285ad adVar = ajVar.f173835a;
            if (adVar == null) {
                adVar = C64285ad.f173815c;
            }
            Map.EL.computeIfPresent(r, adVar.f173818b, new C23346c(this, ajVar));
        }
        return r;
    }
}
