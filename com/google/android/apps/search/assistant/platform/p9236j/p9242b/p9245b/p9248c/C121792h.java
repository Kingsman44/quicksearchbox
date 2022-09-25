package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.p2631g.C33882a;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.h */
/* compiled from: PG */
public final class C121792h implements C33882a {

    /* renamed from: a */
    public final C21370a f337989a;

    /* renamed from: b */
    public final ReentrantLock f337990b = new ReentrantLock();

    /* renamed from: c */
    public final C121789e f337991c = new C121789e((byte[]) null);

    /* renamed from: d */
    private final C71422aw f337992d;

    public C121792h(C121758ag agVar, C71422aw awVar, C21370a aVar) {
        C69664n.m101061g(agVar, "resource");
        C69664n.m101061g(aVar, "clock");
        this.f337992d = awVar;
        this.f337989a = aVar;
        C71594u.m104517d(C71536cm.m104384b(agVar.f337892d, new C121787c(this, (C69577g) null)), awVar);
    }

    /* renamed from: b */
    public static final Instant m201213b(C21370a aVar) {
        return Instant.ofEpochMilli(aVar.mo26870b());
    }

    /* renamed from: a */
    public final String mo39109a() {
        ReentrantLock reentrantLock = this.f337990b;
        reentrantLock.lock();
        try {
            StringBuilder sb = new StringBuilder();
            Instant instant = this.f337991c.f337969a;
            sb.append("createdAt = " + instant);
            sb.append(10);
            Instant instant2 = this.f337991c.f337970b;
            sb.append("releaseStartedAt = " + instant2);
            sb.append(10);
            Instant instant3 = this.f337991c.f337971c;
            sb.append("releaseCompletedAt = " + instant3);
            sb.append(10);
            Instant instant4 = this.f337991c.f337972d;
            sb.append("acquisitionLostStartedAt = " + instant4);
            sb.append(10);
            Instant instant5 = this.f337991c.f337973e;
            sb.append("acquisitionLostCompletedAt = " + instant5);
            sb.append(10);
            sb.append("audioRouteUpdate:");
            sb.append(10);
            for (C121788d dVar : this.f337991c.f337974f) {
                sb.append("  " + dVar);
                sb.append(10);
            }
            sb.append("ListeningSessions:");
            sb.append(10);
            for (C121790f fVar : this.f337991c.f337975g.values()) {
                sb.append("  " + fVar);
                sb.append(10);
            }
            sb.append("FailedListeningSessions:");
            sb.append(10);
            for (C121791g gVar : this.f337991c.f337976h) {
                sb.append("  " + gVar);
                sb.append(10);
            }
            return sb.toString();
        } finally {
            reentrantLock.unlock();
        }
    }
}
