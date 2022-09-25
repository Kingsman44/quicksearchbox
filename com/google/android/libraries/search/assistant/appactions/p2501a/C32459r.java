package com.google.android.libraries.search.assistant.appactions.p2501a;

import com.google.android.apps.gsa.binaries.satin.app.ash;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.appactions.a.r */
/* compiled from: PG */
public final class C32459r {

    /* renamed from: a */
    public final ConcurrentHashMap f86990a = new ConcurrentHashMap();

    /* renamed from: b */
    private final ash f86991b;

    public C32459r(ash ash) {
        C69664n.m101061g(ash, "sessionFactory");
        this.f86991b = ash;
    }

    /* renamed from: a */
    public final C32433a mo38078a(String str, C71422aw awVar) {
        C69664n.m101061g(str, "key");
        C69664n.m101061g(awVar, "coroutineScope");
        ash ash = this.f86991b;
        C32458q qVar = new C32458q(str, awVar, (C69585o) ash.f201456a.a.G.mo17428b(), ash.f201456a.a.b.mo67345cC());
        this.f86990a.put(str, qVar);
        return qVar;
    }
}
