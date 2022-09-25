package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112686ax;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b.C112175a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bo */
/* compiled from: PG */
public final class C111877bo {

    /* renamed from: a */
    public static final C121537f f310873a = C121537f.m200840b("Tapas/TapasMixer", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f310874b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bo");

    /* renamed from: c */
    public final C86124t f310875c;

    /* renamed from: d */
    public final C112686ax f310876d;

    /* renamed from: e */
    public final C21370a f310877e;

    /* renamed from: f */
    public final C22871g f310878f;

    /* renamed from: g */
    private final C112175a f310879g;

    public C111877bo(C86124t tVar, C112175a aVar, C112686ax axVar, C21370a aVar2, C22871g gVar) {
        this.f310875c = tVar;
        this.f310879g = aVar;
        this.f310876d = axVar;
        this.f310877e = aVar2;
        this.f310878f = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5 = com.google.common.p4552o.p4553a.C59450aa.f157704d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo99270a(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep r32, java.util.List r33) {
        /*
            r31 = this;
            r10 = r31
            com.google.android.apps.search.assistant.platform.i.e.a.f r0 = f310873a
            java.lang.String r1 = "rankEntries"
            java.lang.String r2 = r32.mo100186s()
            java.lang.String r1 = r1.concat(r2)
            com.google.android.apps.search.assistant.platform.i.e.a.b r11 = r0.mo105233a(r1)
            java.lang.String r1 = "issueRanking"
            java.lang.String r2 = r32.mo100186s()
            java.lang.String r1 = r1.concat(r2)
            com.google.android.apps.search.assistant.platform.i.e.a.b.q r12 = r0.mo105243l(r1)
            java.lang.String r15 = "asyncRanking"
            com.google.android.libraries.f.a r1 = r10.f310877e     // Catch:{ all -> 0x01e1 }
            long r6 = r1.mo26871c()     // Catch:{ all -> 0x01e1 }
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r33)     // Catch:{ all -> 0x01e1 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.be r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111867be.f310856a     // Catch:{ all -> 0x01e1 }
            j$.util.stream.Stream r1 = r1.map(r2)     // Catch:{ all -> 0x01e1 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bg r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111869bg.f310864a     // Catch:{ all -> 0x01e1 }
            j$.util.stream.Stream r1 = r1.filter(r2)     // Catch:{ all -> 0x01e1 }
            j$.util.Optional r9 = r1.findFirst()     // Catch:{ all -> 0x01e1 }
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r33)     // Catch:{ all -> 0x01e1 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bd r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111866bd.f310855a     // Catch:{ all -> 0x01e1 }
            j$.util.stream.Stream r1 = r1.map(r2)     // Catch:{ all -> 0x01e1 }
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ all -> 0x01e1 }
            java.lang.Object r1 = r1.collect(r2)     // Catch:{ all -> 0x01e1 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x01e1 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x01e1 }
        L_0x0052:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x01e1 }
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0080 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r3 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es) r3     // Catch:{ all -> 0x0080 }
            j$.util.Optional r4 = r3.mo100125g()     // Catch:{ all -> 0x0080 }
            boolean r4 = r4.isPresent()     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0052
            j$.util.Optional r3 = r3.mo100125g()     // Catch:{ all -> 0x0080 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0080 }
            com.google.common.o.a.aa r3 = (com.google.common.p4552o.p4553a.C59450aa) r3     // Catch:{ all -> 0x0080 }
            boolean r4 = r3.f157706a     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x007e
            boolean r4 = r3.f157707b     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x007e
            boolean r4 = r3.f157708c     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0052
        L_0x007e:
            r5 = r3
            goto L_0x0089
        L_0x0080:
            r0 = move-exception
            r1 = r0
            r22 = r12
            goto L_0x01e5
        L_0x0086:
            com.google.common.o.a.aa r2 = com.google.common.p4552o.p4553a.C59450aa.f157704d     // Catch:{ all -> 0x01e1 }
            r5 = r2
        L_0x0089:
            com.google.bp.f.c.a.j r2 = com.google.p4242bp.p4257f.p4262c.p4263a.C56339j.f150165b     // Catch:{ all -> 0x01e1 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x01e1 }
        L_0x008f:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01e1 }
            if (r4 == 0) goto L_0x00af
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0080 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r4 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es) r4     // Catch:{ all -> 0x0080 }
            j$.util.Optional r8 = r4.mo100126h()     // Catch:{ all -> 0x0080 }
            boolean r8 = r8.isPresent()     // Catch:{ all -> 0x0080 }
            if (r8 == 0) goto L_0x008f
            j$.util.Optional r2 = r4.mo100126h()     // Catch:{ all -> 0x0080 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0080 }
            com.google.bp.f.c.a.j r2 = (com.google.p4242bp.p4257f.p4262c.p4263a.C56339j) r2     // Catch:{ all -> 0x0080 }
        L_0x00af:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x01e1 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x01e1 }
        L_0x00b7:
            boolean r8 = r4.hasNext()     // Catch:{ all -> 0x01e1 }
            if (r8 == 0) goto L_0x00d1
            java.lang.Object r8 = r4.next()     // Catch:{ all -> 0x0080 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r8 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es) r8     // Catch:{ all -> 0x0080 }
            j$.util.Optional r16 = r8.mo100130k()     // Catch:{ all -> 0x0080 }
            boolean r16 = r16.isPresent()     // Catch:{ all -> 0x0080 }
            if (r16 == 0) goto L_0x00b7
            j$.util.Optional r3 = r8.mo100130k()     // Catch:{ all -> 0x0080 }
        L_0x00d1:
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.eo r4 = r32.mo100020e()     // Catch:{ all -> 0x01e1 }
            r4.mo100003c(r2)     // Catch:{ all -> 0x01e1 }
            r4.mo100009i(r3)     // Catch:{ all -> 0x01e1 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r4 = r4.mo100001a()     // Catch:{ all -> 0x01e1 }
            java.util.Map r3 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj.m187497e(r1)     // Catch:{ all -> 0x01e1 }
            r3.isEmpty()     // Catch:{ all -> 0x01e1 }
            com.google.android.libraries.gsa.k.g r8 = r10.f310878f     // Catch:{ all -> 0x01e1 }
            com.google.android.apps.search.assistant.platform.i.e.a.f r1 = f310873a     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = r32.mo100186s()     // Catch:{ all -> 0x01e1 }
            java.lang.String r14 = "adjustSuggestions"
            java.lang.String r2 = r14.concat(r2)     // Catch:{ all -> 0x01e1 }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x01e1 }
            r14.<init>()     // Catch:{ all -> 0x01e1 }
            com.google.common.util.concurrent.cx r16 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x01e1 }
            com.google.common.util.concurrent.bs r16 = com.google.common.util.concurrent.C60838bs.m92859i(r16)     // Catch:{ all -> 0x01e1 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.a r13 = r10.f310879g     // Catch:{ all -> 0x01e1 }
            com.google.common.b.gu r13 = r13.mo99460a(r4)     // Catch:{ all -> 0x01e1 }
            r33 = r8
            int r8 = r13.size()     // Catch:{ all -> 0x01e1 }
            r23 = r11
            r22 = r12
            r12 = r16
            r11 = 0
        L_0x0112:
            if (r11 >= r8) goto L_0x0199
            java.lang.Object r16 = r13.get(r11)     // Catch:{ all -> 0x01df }
            r24 = r8
            r8 = r16
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.l r8 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112145l) r8     // Catch:{ all -> 0x01df }
            r25 = r13
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ay r13 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ay     // Catch:{ all -> 0x01df }
            r13.<init>()     // Catch:{ all -> 0x01df }
            r26 = r0
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x01df }
            com.google.common.util.concurrent.cx r20 = com.google.common.util.concurrent.C60922j.m93045h(r12, r13, r0)     // Catch:{ all -> 0x01df }
            com.google.android.apps.search.assistant.platform.i.e.a.f r0 = f310873a     // Catch:{ all -> 0x01df }
            com.google.assistant.ad.d.b.ab r13 = r8.mo99422a()     // Catch:{ all -> 0x01df }
            java.lang.String r13 = r13.name()     // Catch:{ all -> 0x01df }
            r27 = r15
            java.lang.String r15 = r4.mo100186s()     // Catch:{ all -> 0x01df }
            r28 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r9.<init>()     // Catch:{ all -> 0x01df }
            r29 = r6
            java.lang.String r6 = "adjust_"
            r9.append(r6)     // Catch:{ all -> 0x01df }
            r9.append(r13)     // Catch:{ all -> 0x01df }
            r9.append(r15)     // Catch:{ all -> 0x01df }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x01df }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.az r7 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.az     // Catch:{ all -> 0x01df }
            r7.<init>(r10, r8, r4, r3)     // Catch:{ all -> 0x01df }
            com.google.common.util.concurrent.bg r9 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x01df }
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93045h(r12, r7, r9)     // Catch:{ all -> 0x01df }
            r0.mo105244m(r6, r7)     // Catch:{ all -> 0x01df }
            r0 = 2
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r0]     // Catch:{ all -> 0x01df }
            r6 = 0
            r0[r6] = r20     // Catch:{ all -> 0x01df }
            r6 = 1
            r0[r6] = r7     // Catch:{ all -> 0x01df }
            com.google.common.util.concurrent.cf r0 = com.google.common.util.concurrent.C60856cj.m92893b(r0)     // Catch:{ all -> 0x01df }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ba r6 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ba     // Catch:{ all -> 0x01df }
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r3
            r21 = r14
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01df }
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x01df }
            com.google.common.util.concurrent.cx r0 = r0.mo57335b(r6, r7)     // Catch:{ all -> 0x01df }
            com.google.common.util.concurrent.bs r12 = com.google.common.util.concurrent.C60838bs.m92859i(r0)     // Catch:{ all -> 0x01df }
            int r11 = r11 + 1
            r8 = r24
            r13 = r25
            r0 = r26
            r15 = r27
            r9 = r28
            r6 = r29
            goto L_0x0112
        L_0x0199:
            r26 = r0
            r29 = r6
            r28 = r9
            r27 = r15
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bb r0 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bb     // Catch:{ all -> 0x01df }
            r0.<init>(r14)     // Catch:{ all -> 0x01df }
            com.google.common.util.concurrent.bg r6 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x01df }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r12, r0, r6)     // Catch:{ all -> 0x01df }
            r1.mo105244m(r2, r0)     // Catch:{ all -> 0x01df }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bf r11 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bf     // Catch:{ all -> 0x01df }
            r1 = r11
            r2 = r31
            r6 = r29
            r12 = r33
            r8 = r32
            r9 = r28
            r1.<init>(r2, r3, r4, r5, r6, r8, r9)     // Catch:{ all -> 0x01df }
            java.lang.String r1 = "adjustSuggestion"
            com.google.common.util.concurrent.cx r0 = r12.mo28209i(r0, r1, r11)     // Catch:{ all -> 0x01df }
            r1 = r26
            r2 = r27
            r1.mo105244m(r2, r0)     // Catch:{ all -> 0x01df }
            p3186j$.util.Objects.requireNonNull(r23)     // Catch:{ all -> 0x01df }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bc r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bc     // Catch:{ all -> 0x01df }
            r2 = r23
            r1.<init>(r2)     // Catch:{ all -> 0x01df }
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x01df }
            r0.mo4106b(r1, r2)     // Catch:{ all -> 0x01df }
            r22.close()
            return r0
        L_0x01df:
            r0 = move-exception
            goto L_0x01e4
        L_0x01e1:
            r0 = move-exception
            r22 = r12
        L_0x01e4:
            r1 = r0
        L_0x01e5:
            r22.close()     // Catch:{ all -> 0x01e9 }
            goto L_0x0203
        L_0x01e9:
            r0 = move-exception
            r2 = r0
            r3 = 1
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0203 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r0[r4] = r3     // Catch:{ Exception -> 0x0203 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r5, r0)     // Catch:{ Exception -> 0x0203 }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0203 }
            r3[r4] = r2     // Catch:{ Exception -> 0x0203 }
            r0.invoke(r1, r3)     // Catch:{ Exception -> 0x0203 }
        L_0x0203:
            goto L_0x0205
        L_0x0204:
            throw r1
        L_0x0205:
            goto L_0x0204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111877bo.mo99270a(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep, java.util.List):com.google.common.util.concurrent.cx");
    }
}
