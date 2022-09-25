package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.apps.gsa.binaries.satin.app.aqk;
import com.google.android.apps.gsa.binaries.satin.app.aql;
import com.google.android.apps.gsa.binaries.satin.app.aqm;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121727d;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121758ag;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121792h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33733c;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33753e;
import com.google.android.libraries.search.assistant.invocation.p2631g.C33882a;
import com.google.android.libraries.search.assistant.invocation.p2646l.p2648b.C33937d;
import com.google.android.libraries.search.assistant.invocation.p2646l.p2648b.C33939f;
import com.google.common.p4580v.C60950i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.at */
/* compiled from: PG */
public final class C121691at {

    /* renamed from: a */
    private final C71422aw f337608a;

    /* renamed from: b */
    private final C60950i f337609b;

    /* renamed from: c */
    private final ReentrantLock f337610c = new ReentrantLock();

    /* renamed from: d */
    private final C33882a f337611d;

    /* renamed from: e */
    private C121690as f337612e;

    /* renamed from: f */
    private final aqk f337613f;

    /* renamed from: g */
    private final aql f337614g;

    public C121691at(C33733c cVar, C71422aw awVar, C60950i iVar, aqk aqk, aql aql, aqm aqm) {
        C33882a aVar;
        C69664n.m101061g(cVar, "resource");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(aqk, "assistDataTrackerFactory");
        C69664n.m101061g(aql, "audioInputTrackerFactory");
        C69664n.m101061g(aqm, "mediaContextTrackerFactory");
        this.f337608a = awVar;
        this.f337609b = iVar;
        this.f337613f = aqk;
        this.f337614g = aql;
        if (cVar instanceof C121738o) {
            aVar = new C121727d((C121738o) cVar, awVar, (C60950i) aqk.f199885a.a.bC.mo17428b());
        } else if (cVar instanceof C121758ag) {
            aVar = new C121792h((C121758ag) cVar, awVar, (C21370a) aql.f199886a.a.i.mo17428b());
        } else {
            aVar = cVar instanceof C33753e ? new C33937d((C33939f) cVar) : null;
        }
        this.f337611d = aVar;
        String d = cVar.mo39056d();
        Instant a = iVar.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        this.f337612e = new C121690as(d, a, (Instant) null);
    }

    /* renamed from: a */
    public final String mo105301a() {
        ReentrantLock reentrantLock = this.f337610c;
        reentrantLock.lock();
        C121690as asVar = this.f337612e;
        String str = asVar.f337607c == null ? "[+]" : "[-]";
        try {
            StringBuilder sb = new StringBuilder();
            String str2 = asVar.f337605a;
            sb.append(str + " type = " + str2);
            sb.append(10);
            Instant instant = asVar.f337606b;
            sb.append("  addedAt = " + instant);
            sb.append(10);
            Object obj = asVar.f337607c;
            if (obj == null) {
                obj = "N/A";
            }
            sb.append("  removedAt = " + obj);
            sb.append(10);
            C33882a aVar = this.f337611d;
            if (aVar != null) {
                sb.append(C69764m.m101222b(C69764m.m101199s(aVar.mo39109a(), "\n"), "  "));
                sb.append(10);
            }
            return sb.toString();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final void mo105302b() {
        C71423ax.m104198c(this.f337608a, (CancellationException) null);
        ReentrantLock reentrantLock = this.f337610c;
        reentrantLock.lock();
        try {
            C121690as asVar = this.f337612e;
            Instant a = this.f337609b.mo57444a();
            String str = asVar.f337605a;
            Instant instant = asVar.f337606b;
            C69664n.m101061g(str, "resourceType");
            C69664n.m101061g(instant, "addedAt");
            this.f337612e = new C121690as(str, instant, a);
        } finally {
            reentrantLock.unlock();
        }
    }
}
