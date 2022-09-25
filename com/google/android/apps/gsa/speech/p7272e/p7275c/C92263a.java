package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59337t;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.speech.e.c.a */
/* compiled from: PG */
public final class C92263a {

    /* renamed from: b */
    private static final C59071e f257253b = C59071e.m91332i("com.google.android.apps.gsa.speech.e.c.a");

    /* renamed from: a */
    final C92286w f257254a;

    /* renamed from: c */
    private final C92271h f257255c;

    /* renamed from: d */
    private final C92265b f257256d;

    /* renamed from: e */
    private final C92276m f257257e;

    /* renamed from: f */
    private final C89859i f257258f;

    /* renamed from: g */
    private C92277n f257259g;

    /* renamed from: h */
    private final C92281r f257260h;

    /* renamed from: i */
    private final C86124t f257261i;

    /* renamed from: j */
    private InputStream f257262j;

    /* renamed from: k */
    private final C91123v f257263k;

    public C92263a(C92271h hVar, C92265b bVar, C92276m mVar, C89859i iVar, C92281r rVar, C86124t tVar, C92286w wVar, C91123v vVar) {
        this.f257255c = hVar;
        this.f257256d = bVar;
        this.f257257e = mVar;
        this.f257258f = iVar;
        this.f257260h = rVar;
        this.f257261i = tVar;
        this.f257254a = wVar;
        this.f257263k = vVar;
    }

    /* renamed from: a */
    public final synchronized void mo86943a() {
        C58976aa aaVar = C58975e.f156826a;
        C92277n nVar = this.f257259g;
        if (nVar != null) {
            nVar.mo86959b();
        }
        InputStream inputStream = this.f257262j;
        if (inputStream != null) {
            C59337t.m92221a(inputStream);
            this.f257262j = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.google.android.apps.gsa.speech.e.c.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.google.android.apps.gsa.speech.e.c.i} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r10v6, types: [com.google.android.apps.gsa.speech.e.c.n] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo86944b(com.google.android.apps.gsa.p8889z.p8893c.p8896c.C118872a r22, java.lang.String r23, long r24, com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n r26, com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k r27, com.google.speech.recognizer.p5233a.C67453av r28) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            r11 = r28
            monitor-enter(r21)
            com.google.android.apps.gsa.shared.util.v r2 = r1.f257263k     // Catch:{ all -> 0x017c }
            boolean r2 = r2.mo85390b()     // Catch:{ all -> 0x017c }
            r3 = 0
            if (r2 == 0) goto L_0x001e
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f257261i     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250509g     // Catch:{ all -> 0x017c }
            boolean r2 = r2.mo79746e(r4)     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x001e
            r2 = 1
            r20 = 1
            goto L_0x0020
        L_0x001e:
            r20 = 0
        L_0x0020:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f257261i     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249917ag     // Catch:{ all -> 0x017c }
            boolean r2 = r2.mo79746e(r4)     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x003e
            com.google.android.apps.gsa.speech.e.c.w r2 = r1.f257254a     // Catch:{ all -> 0x017c }
            com.google.common.base.ax r2 = r2.mo86965a(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r4 = ""
            java.lang.Object r2 = r2.mo56109e(r4)     // Catch:{ all -> 0x017c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x017c }
            boolean r2 = com.google.android.libraries.assistant.soda.C19245ah.m36705m(r2)     // Catch:{ all -> 0x017c }
            if (r2 != 0) goto L_0x005c
        L_0x003e:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f257261i     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249933aw     // Catch:{ all -> 0x017c }
            boolean r2 = r2.mo79746e(r4)     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x0070
            com.google.android.apps.gsa.speech.e.c.w r2 = r1.f257254a     // Catch:{ all -> 0x017c }
            com.google.common.base.ax r2 = r2.mo86965a(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r4 = ""
            java.lang.Object r2 = r2.mo56109e(r4)     // Catch:{ all -> 0x017c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x017c }
            boolean r2 = com.google.android.libraries.assistant.soda.C19245ah.m36704l(r2)     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x0070
        L_0x005c:
            com.google.android.apps.gsa.speech.e.c.t r10 = new com.google.android.apps.gsa.speech.e.c.t     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.r r3 = r1.f257260h     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.b r4 = r1.f257256d     // Catch:{ all -> 0x017c }
            int r8 = r11.f183332i     // Catch:{ all -> 0x017c }
            r2 = r10
            r5 = r23
            r6 = r24
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r8, r9)     // Catch:{ all -> 0x017c }
            goto L_0x011e
        L_0x0070:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f257261i     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249917ag     // Catch:{ all -> 0x017c }
            boolean r2 = r2.mo79746e(r4)     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x0103
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f257261i     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250040cx     // Catch:{ all -> 0x017c }
            boolean r2 = r2.mo79746e(r4)     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x0103
            java.lang.String r2 = "en-"
            boolean r2 = r0.startsWith(r2)     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x0103
            java.lang.String r2 = "en-US"
            java.lang.String r4 = "en-GB"
            java.lang.String r5 = "en-IN"
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89848p(r2, r4, r5)     // Catch:{ all -> 0x017c }
            r4 = r2
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4     // Catch:{ all -> 0x017c }
            int r4 = r4.f156474d     // Catch:{ all -> 0x017c }
        L_0x009b:
            if (r3 >= r4) goto L_0x00e8
            java.lang.Object r5 = r2.get(r3)     // Catch:{ all -> 0x017c }
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x017c }
            boolean r5 = r0.equals(r15)     // Catch:{ all -> 0x017c }
            if (r5 != 0) goto L_0x00e5
            com.google.android.apps.gsa.speech.e.c.w r5 = r1.f257254a     // Catch:{ all -> 0x017c }
            com.google.common.base.ax r5 = r5.mo86965a(r15)     // Catch:{ all -> 0x017c }
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.mo56109e(r6)     // Catch:{ all -> 0x017c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x017c }
            boolean r5 = com.google.android.libraries.assistant.soda.C19245ah.m36705m(r5)     // Catch:{ all -> 0x017c }
            if (r5 == 0) goto L_0x00d5
            com.google.android.apps.gsa.speech.e.c.t r5 = new com.google.android.apps.gsa.speech.e.c.t     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.r r13 = r1.f257260h     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.b r14 = r1.f257256d     // Catch:{ all -> 0x017c }
            int r6 = r11.f183332i     // Catch:{ all -> 0x017c }
            r12 = r5
            r16 = r24
            r18 = r6
            r19 = r20
            r12.<init>(r13, r14, r15, r16, r18, r19)     // Catch:{ all -> 0x017c }
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r5)     // Catch:{ all -> 0x017c }
            goto L_0x00d7
        L_0x00d5:
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x017c }
        L_0x00d7:
            boolean r6 = r5.mo56113h()     // Catch:{ all -> 0x017c }
            if (r6 == 0) goto L_0x00e5
            java.lang.Object r0 = r5.mo56107c()     // Catch:{ all -> 0x017c }
            r10 = r0
            com.google.android.apps.gsa.speech.e.c.n r10 = (com.google.android.apps.gsa.speech.p7272e.p7275c.C92277n) r10     // Catch:{ all -> 0x017c }
            goto L_0x011e
        L_0x00e5:
            int r3 = r3 + 1
            goto L_0x009b
        L_0x00e8:
            com.google.android.apps.gsa.speech.e.c.i r14 = new com.google.android.apps.gsa.speech.e.c.i     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.h r3 = r1.f257255c     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.b r4 = r1.f257256d     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.m r5 = r1.f257257e     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.shared.logger.b.i r12 = r1.f257258f     // Catch:{ all -> 0x017c }
            r2 = r14
            r6 = r23
            r7 = r24
            r9 = r26
            r10 = r27
            r11 = r28
            r13 = r20
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x017c }
            goto L_0x011d
        L_0x0103:
            com.google.android.apps.gsa.speech.e.c.i r14 = new com.google.android.apps.gsa.speech.e.c.i     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.h r3 = r1.f257255c     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.b r4 = r1.f257256d     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.m r5 = r1.f257257e     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.shared.logger.b.i r12 = r1.f257258f     // Catch:{ all -> 0x017c }
            r2 = r14
            r6 = r23
            r7 = r24
            r9 = r26
            r10 = r27
            r11 = r28
            r13 = r20
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x017c }
        L_0x011d:
            r10 = r14
        L_0x011e:
            r1.f257259g = r10     // Catch:{ all -> 0x017c }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.n r0 = r1.f257259g     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x0143
            boolean r0 = r0.mo86961d()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x012d
            goto L_0x0143
        L_0x012d:
            com.google.common.f.e r0 = f257253b     // Catch:{ all -> 0x017c }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x017c }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x017c }
            java.lang.String r3 = "VoiceActionsRec"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x017c }
            java.lang.String r2 = "Recognizer failed to initialize!"
            r3 = 12341(0x3035, float:1.7293E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x017c }
            monitor-exit(r21)
            return
        L_0x0143:
            java.io.InputStream r0 = r22.mo91302a()     // Catch:{ IOException -> 0x0154 }
            r1.f257262j = r0     // Catch:{ IOException -> 0x0154 }
            com.google.android.apps.gsa.speech.e.c.n r2 = r1.f257259g     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x0152
            r2.mo86960c(r0)     // Catch:{ all -> 0x017c }
            monitor-exit(r21)
            return
        L_0x0152:
            monitor-exit(r21)
            return
        L_0x0154:
            r0 = move-exception
            com.google.android.apps.gsa.shared.speech.a.f r2 = new com.google.android.apps.gsa.shared.speech.a.f     // Catch:{ all -> 0x017c }
            r3 = 458759(0x70007, float:6.42858E-40)
            r2.<init>((java.lang.Throwable) r0, (int) r3)     // Catch:{ all -> 0x017c }
            com.google.android.apps.gsa.speech.e.c.n r0 = r1.f257259g     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x0175
            boolean r0 = r0 instanceof com.google.android.apps.gsa.speech.p7272e.p7275c.C92283t     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x0168
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_OFFLINE_INITIALIZATION_FAILED     // Catch:{ all -> 0x017c }
            goto L_0x016a
        L_0x0168:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.GRECO3_INITIALIZATION_FAILED     // Catch:{ all -> 0x017c }
        L_0x016a:
            com.google.android.apps.gsa.speech.e.c.n r3 = r1.f257259g     // Catch:{ all -> 0x017c }
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r2)     // Catch:{ all -> 0x017c }
            r5 = r24
            r3.mo86958a(r4, r0, r5)     // Catch:{ all -> 0x017c }
        L_0x0175:
            com.google.android.apps.gsa.speech.e.c.b r0 = r1.f257256d     // Catch:{ all -> 0x017c }
            r0.mo86946b(r2)     // Catch:{ all -> 0x017c }
            monitor-exit(r21)
            return
        L_0x017c:
            r0 = move-exception
            monitor-exit(r21)
            goto L_0x0180
        L_0x017f:
            throw r0
        L_0x0180:
            goto L_0x017f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7275c.C92263a.mo86944b(com.google.android.apps.gsa.z.c.c.a, java.lang.String, long, com.google.android.apps.gsa.speech.e.b.n, com.google.android.apps.gsa.speech.e.b.k, com.google.speech.recognizer.a.av):void");
    }
}
