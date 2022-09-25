package com.google.android.libraries.search.assistant.fluidactions.p2540c.p2541a;

import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32954a;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32972e;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32973f;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32974g;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32975h;
import com.google.apps.tiktok.dataservice.C46783d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58743qi;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.c.a.e */
/* compiled from: PG */
public final class C32959e implements C32975h {

    /* renamed from: a */
    private static final C59071e f88303a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.c.a.e");

    /* renamed from: b */
    private final Object f88304b = new Object();

    /* renamed from: c */
    private final C58743qi f88305c = new C58459fv();

    /* renamed from: d */
    private final ConcurrentMap f88306d = new ConcurrentHashMap();

    /* renamed from: e */
    private final C32968n f88307e;

    /* renamed from: f */
    private final C60887da f88308f;

    /* renamed from: g */
    private final C32966l f88309g;

    /* renamed from: h */
    private final C32957c f88310h;

    /* renamed from: i */
    private C32965k f88311i;

    /* renamed from: j */
    private C32956b f88312j;

    public C32959e(C32966l lVar, C32957c cVar, C32968n nVar, C60887da daVar) {
        this.f88309g = lVar;
        this.f88310h = cVar;
        this.f88307e = nVar;
        this.f88308f = daVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0148, code lost:
        return p3186j$.util.Optional.m71637of(r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo38405a(com.google.android.libraries.search.assistant.fluidactions.p2540c.C32971d r11, com.google.android.libraries.search.assistant.fluidactions.p2540c.C32974g r12) {
        /*
            r10 = this;
            java.lang.String r0 = r11.toString()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.search.assistant.fluidactions.c.a.n r1 = r10.f88307e
            java.util.concurrent.atomic.AtomicLong r1 = r1.f88336a
            long r1 = r1.incrementAndGet()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = "+"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.libraries.search.assistant.fluidactions.c.b r2 = new com.google.android.libraries.search.assistant.fluidactions.c.b
            r2.<init>(r1)
            java.lang.Object r1 = r10.f88304b
            monitor-enter(r1)
            com.google.common.b.qi r3 = r10.f88305c     // Catch:{ all -> 0x0149 }
            r3.mo54920x(r0, r2)     // Catch:{ all -> 0x0149 }
            java.util.concurrent.ConcurrentMap r3 = r10.f88306d     // Catch:{ all -> 0x0149 }
            r3.put(r2, r12)     // Catch:{ all -> 0x0149 }
            r12 = r11
            com.google.android.libraries.search.assistant.fluidactions.c.a r12 = (com.google.android.libraries.search.assistant.fluidactions.p2540c.C32954a) r12     // Catch:{ all -> 0x0149 }
            java.lang.String r12 = r12.f88287a     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = "BRIGHTNESS_LEVEL"
            boolean r12 = r12.equals(r3)     // Catch:{ all -> 0x0149 }
            r3 = 0
            if (r12 == 0) goto L_0x0095
            com.google.android.libraries.search.assistant.fluidactions.c.a.b r12 = r10.f88312j     // Catch:{ all -> 0x0149 }
            if (r12 != 0) goto L_0x0143
            com.google.android.libraries.search.assistant.fluidactions.c.a.c r12 = r10.f88310h     // Catch:{ all -> 0x0149 }
            com.google.android.libraries.search.assistant.fluidactions.c.a.b r0 = new com.google.android.libraries.search.assistant.fluidactions.c.a.b     // Catch:{ all -> 0x0149 }
            g.a.a r4 = r12.f88297a     // Catch:{ all -> 0x0149 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0149 }
            r5 = r4
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ all -> 0x0149 }
            r5.getClass()     // Catch:{ all -> 0x0149 }
            g.a.a r4 = r12.f88298b     // Catch:{ all -> 0x0149 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0149 }
            r6 = r4
            com.google.apps.tiktok.dataservice.q r6 = (com.google.apps.tiktok.dataservice.C46877q) r6     // Catch:{ all -> 0x0149 }
            r6.getClass()     // Catch:{ all -> 0x0149 }
            g.a.a r4 = r12.f88299c     // Catch:{ all -> 0x0149 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0149 }
            r7 = r4
            com.google.apps.tiktok.tracing.dh r7 = (com.google.apps.tiktok.tracing.C47770dh) r7     // Catch:{ all -> 0x0149 }
            r7.getClass()     // Catch:{ all -> 0x0149 }
            g.a.a r12 = r12.f88300d     // Catch:{ all -> 0x0149 }
            java.lang.Object r12 = r12.mo17428b()     // Catch:{ all -> 0x0149 }
            r8 = r12
            com.google.common.util.concurrent.da r8 = (com.google.common.util.concurrent.C60887da) r8     // Catch:{ all -> 0x0149 }
            r8.getClass()     // Catch:{ all -> 0x0149 }
            r4 = r0
            r9 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0149 }
            r10.f88312j = r0     // Catch:{ all -> 0x0149 }
            r0.f88292c = r11     // Catch:{ all -> 0x0149 }
            com.google.apps.tiktok.dataservice.q r11 = r0.f88290a     // Catch:{ all -> 0x0149 }
            java.lang.String r12 = "screen_brightness"
            android.net.Uri r12 = android.provider.Settings.System.getUriFor(r12)     // Catch:{ all -> 0x0149 }
            com.google.apps.tiktok.dataservice.d r4 = r0.f88291b     // Catch:{ all -> 0x0149 }
            r11.mo50875e(r12, r3, r4)     // Catch:{ all -> 0x0149 }
            r0.mo38403a()     // Catch:{ all -> 0x0149 }
            goto L_0x0143
        L_0x0095:
            r12 = r11
            com.google.android.libraries.search.assistant.fluidactions.c.a r12 = (com.google.android.libraries.search.assistant.fluidactions.p2540c.C32954a) r12     // Catch:{ all -> 0x0149 }
            j$.util.Optional r12 = r12.f88288b     // Catch:{ all -> 0x0149 }
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x0149 }
            if (r12 == 0) goto L_0x00d1
            com.google.common.f.e r12 = f88303a     // Catch:{ all -> 0x0149 }
            com.google.common.f.x r12 = r12.mo56226d()     // Catch:{ all -> 0x0149 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0149 }
            java.lang.String r4 = "DeviceSettingMonitor"
            r12.mo56378ag(r3, r4)     // Catch:{ all -> 0x0149 }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x0149 }
            r3 = 50669(0xc5ed, float:7.1002E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r3)     // Catch:{ all -> 0x0149 }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = "Setting %s not support by Slice api."
            com.google.android.libraries.search.assistant.fluidactions.c.a r11 = (com.google.android.libraries.search.assistant.fluidactions.p2540c.C32954a) r11     // Catch:{ all -> 0x0149 }
            java.lang.String r11 = r11.f88287a     // Catch:{ all -> 0x0149 }
            r12.mo56389s(r3, r11)     // Catch:{ all -> 0x0149 }
            com.google.common.b.qi r11 = r10.f88305c     // Catch:{ all -> 0x0149 }
            r11.mo54956I(r0, r2)     // Catch:{ all -> 0x0149 }
            java.util.concurrent.ConcurrentMap r11 = r10.f88306d     // Catch:{ all -> 0x0149 }
            r11.remove(r2)     // Catch:{ all -> 0x0149 }
            j$.util.Optional r11 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0149 }
            monitor-exit(r1)     // Catch:{ all -> 0x0149 }
            return r11
        L_0x00d1:
            com.google.android.libraries.search.assistant.fluidactions.c.a.k r12 = r10.f88311i     // Catch:{ all -> 0x0149 }
            if (r12 != 0) goto L_0x00ff
            com.google.android.libraries.search.assistant.fluidactions.c.a.l r12 = r10.f88309g     // Catch:{ all -> 0x0149 }
            com.google.android.libraries.search.assistant.fluidactions.c.a.k r0 = new com.google.android.libraries.search.assistant.fluidactions.c.a.k     // Catch:{ all -> 0x0149 }
            g.a.a r4 = r12.f88333a     // Catch:{ all -> 0x0149 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0149 }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ all -> 0x0149 }
            r4.getClass()     // Catch:{ all -> 0x0149 }
            g.a.a r5 = r12.f88334b     // Catch:{ all -> 0x0149 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ all -> 0x0149 }
            com.google.common.util.concurrent.db r5 = (com.google.common.util.concurrent.C60888db) r5     // Catch:{ all -> 0x0149 }
            r5.getClass()     // Catch:{ all -> 0x0149 }
            g.a.a r12 = r12.f88335c     // Catch:{ all -> 0x0149 }
            java.lang.Object r12 = r12.mo17428b()     // Catch:{ all -> 0x0149 }
            androidx.slice.m r12 = (androidx.slice.C4114m) r12     // Catch:{ all -> 0x0149 }
            r12.getClass()     // Catch:{ all -> 0x0149 }
            r0.<init>(r4, r5, r12, r10)     // Catch:{ all -> 0x0149 }
            r10.f88311i = r0     // Catch:{ all -> 0x0149 }
        L_0x00ff:
            com.google.android.libraries.search.assistant.fluidactions.c.a.k r12 = r10.f88311i     // Catch:{ all -> 0x0149 }
            java.util.concurrent.ConcurrentMap r0 = r12.f88330f     // Catch:{ all -> 0x0149 }
            java.lang.String r4 = r11.toString()     // Catch:{ all -> 0x0149 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0129
            java.util.concurrent.ConcurrentMap r0 = r12.f88329e     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = r11.toString()     // Catch:{ all -> 0x0149 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0143
            java.util.concurrent.ConcurrentMap r0 = r12.f88329e     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = r11.toString()     // Catch:{ all -> 0x0149 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0149 }
            androidx.slice.Slice r0 = (androidx.slice.Slice) r0     // Catch:{ all -> 0x0149 }
            r12.mo38410b(r11, r0)     // Catch:{ all -> 0x0149 }
            goto L_0x0143
        L_0x0129:
            com.google.common.util.concurrent.cx r0 = r12.mo38413e(r11, r3)     // Catch:{ all -> 0x0149 }
            com.google.android.libraries.search.assistant.fluidactions.c.a.f r4 = new com.google.android.libraries.search.assistant.fluidactions.c.a.f     // Catch:{ all -> 0x0149 }
            r4.<init>(r12, r11)     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r11 = r12.f88328d     // Catch:{ all -> 0x0149 }
            com.google.common.base.ah r12 = com.google.apps.tiktok.tracing.C47810es.m84963c(r4)     // Catch:{ all -> 0x0149 }
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60922j.m93044g(r0, r12, r11)     // Catch:{ all -> 0x0149 }
            java.lang.String r12 = "Failed to resolve loadInitialSlice Future."
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x0149 }
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r11, r12, r0)     // Catch:{ all -> 0x0149 }
        L_0x0143:
            monitor-exit(r1)     // Catch:{ all -> 0x0149 }
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r2)
            return r11
        L_0x0149:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0149 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2540c.p2541a.C32959e.mo38405a(com.google.android.libraries.search.assistant.fluidactions.c.d, com.google.android.libraries.search.assistant.fluidactions.c.g):j$.util.Optional");
    }

    /* renamed from: b */
    public final void mo38406b(String str, C32973f fVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f88304b) {
            for (C32972e eVar : this.f88305c.mo54986h(str)) {
                if (this.f88306d.containsKey(eVar)) {
                    arrayList.add((C32974g) this.f88306d.get(eVar));
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f88308f.execute(C47810es.m84977q(new C32958d((C32974g) arrayList.get(i), fVar)));
        }
    }

    /* renamed from: c */
    public final void mo38407c(C32972e eVar) {
        String str = (String) C58557jl.m90128i(C58869cf.m90936b(new C58903m('+')).mo56153g(eVar.mo38414a()), 0);
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f88304b) {
            this.f88305c.mo54956I(str, eVar);
            if (!this.f88305c.mo54919w(str)) {
                String str2 = (String) C58557jl.m90128i(C58869cf.m90936b(new C58903m(',')).mo56153g(str), 0);
                if (str2.equals("BRIGHTNESS_LEVEL")) {
                    C32956b bVar = this.f88312j;
                    if (bVar != null) {
                        new C32954a(str2, Optional.empty());
                        C46783d dVar = bVar.f88291b;
                        if (dVar != null) {
                            bVar.f88290a.mo50876f(dVar);
                        }
                        this.f88312j = null;
                    }
                } else {
                    String str3 = (String) C58557jl.m90128i(C58869cf.m90936b(new C58903m(',')).mo56153g(str), 1);
                    if (str3.isEmpty()) {
                        C59104x b = f88303a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "DeviceSettingMonitor");
                        ((C59052c) ((C59052c) b).mo56372aa(50663)).mo56386p("Slice setting uri is empty, skip stopSettingMonitoring.");
                    } else {
                        C32965k kVar = this.f88311i;
                        if (kVar != null) {
                            kVar.mo38411c(new C32954a(str2, Optional.m71637of(str3)));
                            this.f88311i = null;
                        }
                    }
                }
            }
        }
        this.f88306d.remove(eVar);
    }
}
