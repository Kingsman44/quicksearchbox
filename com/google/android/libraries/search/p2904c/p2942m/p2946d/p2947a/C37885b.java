package com.google.android.libraries.search.p2904c.p2942m.p2946d.p2947a;

import com.google.android.libraries.search.p2904c.p2908b.p2909a.C37365b;
import com.google.android.libraries.search.p2904c.p2942m.p2946d.C37883a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.m.d.a.b */
/* compiled from: PG */
public final class C37885b implements C37883a {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f100457a = C59071e.m91331h();

    /* renamed from: b */
    public final Object f100458b = new Object();

    /* renamed from: c */
    public final HashMap f100459c = new HashMap();

    /* renamed from: d */
    private final C71422aw f100460d;

    public C37885b(C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f100460d = awVar;
    }

    /* renamed from: a */
    public final void mo41122a(String str) {
        C59052c cVar = (C59052c) f100457a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.TimeoutTracker");
        cVar.mo56379ah(new C59094n(52851));
        cVar.mo56389s("#audio# cancel timeout(token(%s))", str);
        synchronized (this.f100458b) {
            C71643cp cpVar = (C71643cp) this.f100459c.remove(str);
            if (cpVar != null) {
                cpVar.mo62723u((CancellationException) null);
            }
        }
    }

    /* renamed from: b */
    public final void mo41123b(String str, Duration duration, C37365b bVar) {
        C69664n.m101061g(duration, "duration");
        C59052c cVar = (C59052c) f100457a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.TimeoutTracker");
        cVar.mo56379ah(new C59094n(52852));
        cVar.mo56354G("#audio# schedule timeout(token(%s), duration(%s))", str, duration);
        synchronized (this.f100458b) {
            C71643cp cpVar = (C71643cp) this.f100459c.put(str, C71803m.m105043d(this.f100460d, (C69585o) null, (C71424ay) null, new C37884a(duration, str, bVar, this, (C69577g) null), 3));
            if (cpVar != null) {
                cpVar.mo62723u((CancellationException) null);
            }
        }
    }
}
