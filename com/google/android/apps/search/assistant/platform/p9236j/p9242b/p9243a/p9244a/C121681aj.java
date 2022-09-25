package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.apps.gsa.binaries.satin.app.aqi;
import com.google.android.libraries.search.assistant.invocation.p2641k.p2644c.C33925a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34421k;
import com.google.common.p4522b.C58425eo;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5463a.C69497an;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.aj */
/* compiled from: PG */
public final class C121681aj implements C33925a, C34421k {

    /* renamed from: a */
    public final C121673ab f337576a;

    /* renamed from: b */
    public final C71422aw f337577b;

    /* renamed from: c */
    public final ReentrantLock f337578c = new ReentrantLock();

    /* renamed from: d */
    public Map f337579d = C69497an.f185919a;

    /* renamed from: e */
    public final C58425eo f337580e = new C58425eo(10);

    /* renamed from: f */
    public final aqi f337581f;

    /* renamed from: g */
    private final String f337582g = "Invocations";

    public C121681aj(C121673ab abVar, C71422aw awVar, aqi aqi) {
        C69664n.m101061g(abVar, "invocationStore");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aqi, "invocationDebugDataTrackerFactory");
        this.f337576a = abVar;
        this.f337577b = awVar;
        this.f337581f = aqi;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0184, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0188, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39134a(p5462h.p5466c.C69577g r12) {
        /*
            r11 = this;
            java.util.concurrent.locks.ReentrantLock r12 = r11.f337578c
            r12.lock()
            java.util.Map r0 = r11.f337579d     // Catch:{ all -> 0x0191 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0191 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.ac r1 = new com.google.android.apps.search.assistant.platform.j.b.a.a.ac     // Catch:{ all -> 0x0191 }
            r1.<init>()     // Catch:{ all -> 0x0191 }
            java.util.List r0 = p5462h.p5463a.C69540x.m100837S(r0, r1)     // Catch:{ all -> 0x0191 }
            com.google.common.b.eo r1 = r11.f337580e     // Catch:{ all -> 0x0191 }
            java.util.List r0 = p5462h.p5463a.C69540x.m100831M(r0, r1)     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r1.<init>()     // Catch:{ all -> 0x0191 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0191 }
        L_0x0023:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0191 }
            if (r2 == 0) goto L_0x0189
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0191 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.e r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121698e) r2     // Catch:{ all -> 0x0191 }
            java.util.concurrent.locks.ReentrantLock r3 = r2.f337646c     // Catch:{ all -> 0x0191 }
            r3.lock()     // Catch:{ all -> 0x0191 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.a r2 = r2.f337647d     // Catch:{ all -> 0x0184 }
            boolean r4 = r2.f337560e     // Catch:{ all -> 0x0184 }
            java.lang.String r5 = "[-]"
            java.lang.String r6 = "[+]"
            r7 = 1
            if (r7 == r4) goto L_0x0040
            r5 = r6
        L_0x0040:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r4.<init>()     // Catch:{ all -> 0x0184 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r6 = r2.f337556a     // Catch:{ all -> 0x0184 }
            com.google.frameworks.client.a.a.b r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r6)     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r7.<init>()     // Catch:{ all -> 0x0184 }
            r7.append(r5)     // Catch:{ all -> 0x0184 }
            java.lang.String r5 = " token = "
            r7.append(r5)     // Catch:{ all -> 0x0184 }
            r7.append(r6)     // Catch:{ all -> 0x0184 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0184 }
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            r5 = 10
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            com.google.android.libraries.search.assistant.invocation.f.b.b r6 = r2.f337557b     // Catch:{ all -> 0x0184 }
            com.google.android.libraries.search.assistant.invocation.o.c.a r6 = r6.f90080a     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r7.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = "  client = "
            r7.append(r8)     // Catch:{ all -> 0x0184 }
            r7.append(r6)     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0184 }
            r4.append(r6)     // Catch:{ all -> 0x0184 }
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            com.google.android.libraries.search.assistant.invocation.f.b.b r6 = r2.f337557b     // Catch:{ all -> 0x0184 }
            com.google.android.libraries.search.assistant.invocation.o.a.bf r6 = r6.f90081b     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = r6.name()     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r7.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = "  source = "
            r7.append(r8)     // Catch:{ all -> 0x0184 }
            r7.append(r6)     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0184 }
            r4.append(r6)     // Catch:{ all -> 0x0184 }
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r6 = r2.f337558c     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r7.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = "  sessionId = "
            r7.append(r8)     // Catch:{ all -> 0x0184 }
            r7.append(r6)     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0184 }
            r4.append(r6)     // Catch:{ all -> 0x0184 }
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            j$.time.Instant r6 = r2.f337559d     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r7.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = "  createdAt = "
            r7.append(r8)     // Catch:{ all -> 0x0184 }
            r7.append(r6)     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0184 }
            r4.append(r6)     // Catch:{ all -> 0x0184 }
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = "  Status changes:"
            r4.append(r6)     // Catch:{ all -> 0x0184 }
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            java.util.List r6 = r2.f337561f     // Catch:{ all -> 0x0184 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0184 }
        L_0x00e1:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0184 }
            if (r7 == 0) goto L_0x0111
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0184 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.b r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121695b) r7     // Catch:{ all -> 0x0184 }
            j$.time.Instant r8 = r7.f337639a     // Catch:{ all -> 0x0184 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.g r7 = r7.f337640b     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r9.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r10 = "    @"
            r9.append(r10)     // Catch:{ all -> 0x0184 }
            r9.append(r8)     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = ": "
            r9.append(r8)     // Catch:{ all -> 0x0184 }
            r9.append(r7)     // Catch:{ all -> 0x0184 }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0184 }
            r4.append(r7)     // Catch:{ all -> 0x0184 }
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            goto L_0x00e1
        L_0x0111:
            java.lang.String r6 = "  Resources:"
            r4.append(r6)     // Catch:{ all -> 0x0184 }
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            java.util.Map r6 = r2.f337562g     // Catch:{ all -> 0x0184 }
            java.util.Collection r6 = r6.values()     // Catch:{ all -> 0x0184 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0184 }
        L_0x0123:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = "    "
            java.lang.String r9 = "\n"
            if (r7 == 0) goto L_0x0146
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0184 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.at r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121691at) r7     // Catch:{ all -> 0x0184 }
            java.lang.String r7 = r7.mo105301a()     // Catch:{ all -> 0x0184 }
            java.lang.String r7 = p5462h.p5483m.C69764m.m101199s(r7, r9)     // Catch:{ all -> 0x0184 }
            java.lang.String r7 = p5462h.p5483m.C69764m.m101222b(r7, r8)     // Catch:{ all -> 0x0184 }
            r4.append(r7)     // Catch:{ all -> 0x0184 }
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            goto L_0x0123
        L_0x0146:
            java.util.List r2 = r2.f337563h     // Catch:{ all -> 0x0184 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0184 }
        L_0x014c:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0184 }
            if (r6 == 0) goto L_0x016b
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0184 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.at r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121691at) r6     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = r6.mo105301a()     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = p5462h.p5483m.C69764m.m101199s(r6, r9)     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = p5462h.p5483m.C69764m.m101222b(r6, r8)     // Catch:{ all -> 0x0184 }
            r4.append(r6)     // Catch:{ all -> 0x0184 }
            r4.append(r5)     // Catch:{ all -> 0x0184 }
            goto L_0x014c
        L_0x016b:
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0184 }
            r3.unlock()     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = p5462h.p5483m.C69764m.m101199s(r2, r9)     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = "  "
            java.lang.String r2 = p5462h.p5483m.C69764m.m101222b(r2, r3)     // Catch:{ all -> 0x0191 }
            r1.append(r2)     // Catch:{ all -> 0x0191 }
            r1.append(r5)     // Catch:{ all -> 0x0191 }
            goto L_0x0023
        L_0x0184:
            r0 = move-exception
            r3.unlock()     // Catch:{ all -> 0x0191 }
            throw r0     // Catch:{ all -> 0x0191 }
        L_0x0189:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0191 }
            r12.unlock()
            return r0
        L_0x0191:
            r0 = move-exception
            r12.unlock()
            goto L_0x0197
        L_0x0196:
            throw r0
        L_0x0197:
            goto L_0x0196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121681aj.mo39134a(h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final String mo39135b() {
        return this.f337582g;
    }

    /* renamed from: c */
    public final C60870cx mo39256c() {
        return C71663i.m104692e(this.f337577b, (C71424ay) null, new C121680ai(this, (C69577g) null), 3);
    }
}
