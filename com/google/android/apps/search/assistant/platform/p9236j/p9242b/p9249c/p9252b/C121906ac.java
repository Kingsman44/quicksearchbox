package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.ac */
/* compiled from: PG */
public final class C121906ac implements C46675m {

    /* renamed from: e */
    private static final C59071e f338286e = C59071e.m91331h();

    /* renamed from: a */
    public final C60950i f338287a;

    /* renamed from: b */
    public final ReentrantLock f338288b = new ReentrantLock();

    /* renamed from: c */
    public C121904aa f338289c;

    /* renamed from: d */
    public final C58425eo f338290d = new C58425eo(10);

    /* renamed from: f */
    private final C71422aw f338291f;

    public C121906ac(C60950i iVar, C71422aw awVar) {
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f338287a = iVar;
        this.f338291f = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        C69664n.m101061g(oVar, "request");
        return C71663i.m104692e(this.f338291f, (C71424ay) null, new C121905ab(oVar, this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final void mo105431b(long j, String str) {
        ReentrantLock reentrantLock = this.f338288b;
        reentrantLock.lock();
        try {
            C121904aa aaVar = this.f338289c;
            if (aaVar != null) {
                long j2 = aaVar.f338278a;
                if (j2 == j) {
                    C59052c cVar = (C59052c) f338286e.mo56224b();
                    cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer");
                    cVar.mo56379ah(new C59094n(36045));
                    cVar.mo56351D("AssistLayerSession(%s) ended with reason: %s", j, str);
                    Instant a = this.f338287a.mo57444a();
                    long j3 = aaVar.f338278a;
                    long j4 = aaVar.f338279b;
                    String str2 = aaVar.f338280c;
                    Instant instant = aaVar.f338281d;
                    C69664n.m101061g(str2, "fragmentFromClient");
                    C69664n.m101061g(instant, "createdAt");
                    this.f338290d.add(new C121904aa(j3, j4, str2, instant, a, str));
                    this.f338289c = null;
                    return;
                }
                throw new IllegalStateException("AssistLayerSession(" + j + ") ended, but the tracked AssistLayerSession had id=" + j2);
            }
            throw new IllegalStateException("AssistLayerSession(" + j + ") ended, but there was no tracked AssistLayerSession");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final void mo105432c(long j, long j2, C34037b bVar) {
        C69664n.m101061g(bVar, "fragmentFromClient");
        ReentrantLock reentrantLock = this.f338288b;
        reentrantLock.lock();
        try {
            C121904aa aaVar = this.f338289c;
            if (aaVar == null) {
                C59052c cVar = (C59052c) f338286e.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer");
                Long valueOf = Long.valueOf(j);
                Long valueOf2 = Long.valueOf(j2);
                String name = bVar.name();
                cVar.mo56379ah(new C59094n(36046));
                cVar.mo56359L("AssistLayerSession(%s) created with window(%s) and fragment from client: %s", valueOf, valueOf2, name);
                String name2 = bVar.name();
                Instant a = this.f338287a.mo57444a();
                C69664n.m101060f(a, "timeSource.now()");
                this.f338289c = new C121904aa(j, j2, name2, a, (Instant) null, (String) null);
                return;
            }
            long j3 = aaVar.f338278a;
            throw new IllegalStateException("AssistLayerSession(" + j + ") starts, but the previous AssistLayerSession(" + j3 + ") didn't end");
        } finally {
            reentrantLock.unlock();
        }
    }
}
