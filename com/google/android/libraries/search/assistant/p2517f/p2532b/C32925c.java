package com.google.android.libraries.search.assistant.p2517f.p2532b;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34824d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34825e;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34827g;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import java.util.Set;
import p5462h.p5463a.C69531o;

/* renamed from: com.google.android.libraries.search.assistant.f.b.c */
/* compiled from: PG */
public final class C32925c {

    /* renamed from: a */
    public static final Set f88249a = C69531o.m100939p(new C34819a[]{C34819a.m63580c(C34825e.f92384a, C34824d.CANCELLED), C34819a.m63580c(C34825e.f92385b, C34827g.CANCELLATION_EXCEPTION)});

    /* renamed from: b */
    public static final Set f88250b = C69531o.m100939p(new C34819a[]{C34819a.m63580c(C34825e.f92384a, C34824d.DEADLINE_EXCEEDED), C34819a.m63580c(C34825e.f92385b, C34827g.TIMEOUT_EXCEPTION)});

    /* renamed from: a */
    public static final C34819a m60930a(Throwable th) {
        C34834b bVar = C34830d.m63595b(th).f92362c;
        if (bVar == null) {
            bVar = C34834b.f92401c;
        }
        return C34819a.m63579b(bVar);
    }
}
