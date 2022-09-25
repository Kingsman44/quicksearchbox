package com.google.android.apps.search.assistant.surfaces.voice.p9689l;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.common.base.C58851bo;
import com.google.common.p4575r.C60761r;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.l.a */
/* compiled from: PG */
public final class C128239a {
    /* renamed from: a */
    public static final String m209321a() {
        return C60761r.m92760f(C58851bo.f156649a.nextLong()).toString();
    }

    /* renamed from: b */
    public static final void m209322b(C37215b bVar, C37254c cVar, String str) {
        C69664n.m101061g(bVar, "<this>");
        C69664n.m101061g(cVar, "event");
        C69664n.m101061g(str, "requestId");
        C37252a c = cVar.mo40779c();
        c.mo40795s("interaction", str);
        bVar.mo19974a(c);
    }

    /* renamed from: c */
    public static final long m209323c(Duration duration) {
        C69664n.m101061g(duration, "<this>");
        return duration.toNanos();
    }

    /* renamed from: d */
    public static final void m209324d(C37215b bVar, C37254c cVar, C119834cb cbVar) {
        C69664n.m101061g(bVar, "<this>");
        C69664n.m101061g(cbVar, "interactionId");
        String str = cbVar.f333767a;
        C69664n.m101060f(str, "interactionId.id");
        m209322b(bVar, cVar, str);
    }
}
