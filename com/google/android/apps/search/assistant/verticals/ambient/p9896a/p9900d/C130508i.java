package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d;

import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131392b;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131393c;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.assistant.p3886c.C50701am;
import com.google.common.p4580v.C60950i;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.d.i */
/* compiled from: PG */
public final class C130508i {

    /* renamed from: a */
    public static final Duration f357505a = Duration.ofSeconds(1);

    /* renamed from: b */
    public final C60950i f357506b;

    /* renamed from: c */
    public final AtomicReference f357507c = new AtomicReference((Object) null);

    /* renamed from: d */
    public final AtomicReference f357508d = new AtomicReference(Instant.EPOCH);

    public C130508i(C60950i iVar) {
        C69664n.m101061g(iVar, "timeSource");
        this.f357506b = iVar;
    }

    /* renamed from: a */
    public final boolean mo109714a(C17692f fVar) {
        C69664n.m101061g(fVar, "headsetState");
        C50701am amVar = C131393c.f359185a;
        return C69664n.m101066l(C131392b.m213858a(fVar.f50864e), this.f357507c.get());
    }
}
