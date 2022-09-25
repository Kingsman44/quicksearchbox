package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6176b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.b.d */
/* compiled from: PG */
public final /* synthetic */ class C78342d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C78347i f215686a;

    /* renamed from: b */
    public final /* synthetic */ Locale f215687b;

    /* renamed from: c */
    public final /* synthetic */ e f215688c;

    /* renamed from: d */
    public final /* synthetic */ long f215689d;

    /* renamed from: e */
    public final /* synthetic */ int f215690e;

    public /* synthetic */ C78342d(C78347i iVar, Locale locale, e eVar, int i, long j) {
        this.f215686a = iVar;
        this.f215687b = locale;
        this.f215688c = eVar;
        this.f215690e = i;
        this.f215689d = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0112, code lost:
        if (r3.contains(r2) != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0126, code lost:
        if (((long) r10.f210108k.mo74894j()) < r10.f210106i.mo85399d(com.google.android.apps.gsa.shared.p7066m.C90053de.f248934A)) goto L_0x0128;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r14 = this;
            com.google.android.apps.gsa.nga.engine.ui.e.h.a.b.i r0 = r14.f215686a
            java.util.Locale r7 = r14.f215687b
            com.google.android.apps.gsa.assistant.shared.l.e r8 = r14.f215688c
            int r9 = r14.f215690e
            long r4 = r14.f215689d
            com.google.android.apps.gsa.nga.engine.education.am r10 = r0.f215697c
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.nga.engine.x.k r1 = r10.f210103f
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_SHOW_QUERY_SUGGESTION_FETCH_REQUESTED
            r1.mo74271b(r2)
            com.google.common.b.ij r1 = com.google.android.apps.gsa.nga.engine.education.C75688am.f210099b
            boolean r1 = r1.contains(r8)
            if (r1 == 0) goto L_0x005b
            dagger.a r1 = r10.f210105h
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.nga.engine.av.a r1 = (com.google.android.apps.gsa.nga.engine.p5964av.C75050a) r1
            com.google.android.apps.gsa.nga.engine.av.bo r1 = r1.mo71417a()
            com.google.android.apps.gsa.nga.shared.v.d.ew r1 = r1.mo71461e()
            int r2 = r1.f226162a
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x003f
            int r1 = r1.f226171j
            int r1 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82977hl.m132442a(r1)
            if (r1 != 0) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            r2 = 2
            if (r1 == r2) goto L_0x005b
        L_0x003f:
            com.google.android.apps.gsa.shared.util.v.g r1 = r10.f210106i
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248426aG
            boolean r1 = r1.mo85405j(r2)
            if (r1 == 0) goto L_0x004a
            goto L_0x005b
        L_0x004a:
            android.util.Pair r1 = new android.util.Pair
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.android.apps.gsa.nga.engine.education.c r3 = com.google.android.apps.gsa.nga.engine.education.C75746c.OTHER
            r1.<init>(r2, r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0314
        L_0x005b:
            com.google.android.apps.gsa.nga.engine.education.f r1 = r10.f210114q
            java.lang.Boolean r1 = r1.mo71869a()
            boolean r1 = r1.booleanValue()
            com.google.android.apps.gsa.nga.shared.v.i r2 = r10.f210116s
            com.google.android.apps.gsa.nga.shared.v.c.au r3 = new com.google.android.apps.gsa.nga.shared.v.c.au
            java.lang.String r6 = "NETWORK_CONNECTIVITY_ON_INPUT_PLATE"
            r3.<init>(r6, r1)
            r2.mo75579d(r3)
            if (r1 != 0) goto L_0x007a
            com.google.android.apps.gsa.nga.engine.x.k r2 = r10.f210103f
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_NO_NETWORK_CONNECTION
            r2.mo74271b(r3)
        L_0x007a:
            com.google.android.apps.gsa.shared.util.v.g r2 = r10.f210106i
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248397E
            boolean r2 = r2.mo85405j(r3)
            if (r2 == 0) goto L_0x0097
            if (r1 != 0) goto L_0x0097
            android.util.Pair r1 = new android.util.Pair
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.android.apps.gsa.nga.engine.education.c r3 = com.google.android.apps.gsa.nga.engine.education.C75746c.OTHER
            r1.<init>(r2, r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0314
        L_0x0097:
            com.google.android.apps.gsa.nga.shared.h.k r1 = r10.f210108k
            com.google.common.util.concurrent.cx r1 = r1.mo74854B()
            com.google.android.apps.gsa.nga.engine.education.v r2 = com.google.android.apps.gsa.nga.engine.education.C75976v.f210782a
            com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at.m128763g(r1, r2)
            com.google.android.apps.gsa.nga.shared.h.k r1 = r10.f210108k
            com.google.common.v.g r2 = com.google.common.p4580v.C60948g.f165068a
            j$.time.Instant r2 = p3186j$.time.Instant.now()
            com.google.common.util.concurrent.cx r1 = r1.mo74908x(r2)
            com.google.android.apps.gsa.nga.engine.education.s r2 = com.google.android.apps.gsa.nga.engine.education.C75973s.f210777a
            com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at.m128763g(r1, r2)
            j$.util.Optional r1 = r10.mo71831g(r8)
            com.google.android.apps.gsa.shared.util.v.g r2 = r10.f210106i
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248974g
            boolean r2 = r2.mo85405j(r3)
            if (r2 == 0) goto L_0x00ca
            com.google.android.apps.gsa.assistant.shared.l.e r2 = com.google.android.apps.gsa.assistant.shared.l.e.bv
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00ca
            goto L_0x00dc
        L_0x00ca:
            com.google.android.apps.gsa.shared.util.v.g r2 = r10.f210106i
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248975h
            boolean r2 = r2.mo85405j(r3)
            if (r2 == 0) goto L_0x0193
            com.google.android.apps.gsa.assistant.shared.l.e r2 = com.google.android.apps.gsa.assistant.shared.l.e.br
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0193
        L_0x00dc:
            com.google.android.apps.gsa.shared.util.v.g r2 = r10.f210106i
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248989v
            java.lang.String r2 = r2.mo85403h(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0115
            java.util.ArrayList r3 = new java.util.ArrayList
            java.lang.String r6 = ","
            java.lang.String[] r2 = r2.split(r6)
            java.util.List r2 = java.util.Arrays.asList(r2)
            r3.<init>(r2)
            com.google.android.apps.gsa.nga.shared.h.k r2 = r10.f210108k
            int r2 = r2.mo74893i()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.google.android.apps.gsa.nga.shared.h.k r6 = r10.f210108k
            com.google.common.util.concurrent.cx r6 = r6.mo74859G()
            com.google.android.apps.gsa.nga.engine.education.z r11 = com.google.android.apps.gsa.nga.engine.education.C75980z.f210789a
            com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at.m128763g(r6, r11)
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0193
            goto L_0x0128
        L_0x0115:
            com.google.android.apps.gsa.nga.shared.h.k r2 = r10.f210108k
            int r2 = r2.mo74894j()
            long r2 = (long) r2
            com.google.android.apps.gsa.shared.util.v.g r6 = r10.f210106i
            com.google.android.apps.gsa.shared.m.f r11 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248934A
            long r11 = r6.mo85399d(r11)
            int r6 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0193
        L_0x0128:
            android.util.Pair r1 = new android.util.Pair
            com.google.android.apps.gsa.nga.engine.education.b.ac r2 = r10.f210104g
            com.google.assistant.ac.d.h r2 = r2.mo71857e()
            r10.mo71833i(r2)
            com.google.assistant.ac.d.h r3 = com.google.assistant.p3775ac.p3779d.C48468h.UNKNOWN_MODE
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0184
            com.google.android.apps.gsa.nga.engine.education.b.ac r3 = r10.f210104g
            dagger.a r3 = r3.f210152c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.nga.engine.education.a.y r3 = (com.google.android.apps.gsa.nga.engine.education.p6016a.C75674y) r3
            com.google.common.b.gu r3 = r3.f210045b
            r4 = r3
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4
            int r4 = r4.f156474d
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.apps.gsa.nga.engine.education.a.x r4 = new com.google.android.apps.gsa.nga.engine.education.a.x
            r4.<init>(r7)
            j$.util.stream.Stream r3 = r3.filter(r4)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r3 = r3.collect(r4)
            com.google.common.b.gu r3 = (com.google.common.p4522b.C58485gu) r3
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)
            j$.util.Optional r3 = r3.findFirst()
            boolean r4 = r3.isPresent()
            if (r4 == 0) goto L_0x017a
            com.google.android.apps.gsa.nga.shared.h.k r4 = r10.f210108k
            com.google.common.util.concurrent.cx r4 = r4.mo74861I()
            com.google.android.apps.gsa.nga.engine.education.l r5 = com.google.android.apps.gsa.nga.engine.education.C75757l.f210243a
            com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at.m128763g(r4, r5)
        L_0x017a:
            com.google.android.apps.gsa.nga.engine.education.m r4 = new com.google.android.apps.gsa.nga.engine.education.m
            r4.<init>(r10, r7, r2)
            j$.util.Optional r2 = r3.map(r4)
            goto L_0x0188
        L_0x0184:
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
        L_0x0188:
            com.google.android.apps.gsa.nga.engine.education.c r3 = com.google.android.apps.gsa.nga.engine.education.C75746c.LONGPRESSPOWER
            r1.<init>(r2, r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0314
        L_0x0193:
            com.google.android.apps.gsa.nga.engine.ag.bc r2 = r10.f210109l
            android.app.KeyguardManager r2 = r2.f208979b
            boolean r2 = r2.isKeyguardLocked()
            r3 = 0
            if (r2 == 0) goto L_0x0268
            com.google.android.apps.gsa.shared.util.v.g r1 = r10.f210106i
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90040cs.f248637D
            boolean r1 = r1.mo85405j(r2)
            if (r1 == 0) goto L_0x0257
            android.util.Pair r1 = new android.util.Pair
            com.google.android.apps.gsa.nga.engine.education.b.ac r2 = r10.f210104g
            com.google.assistant.ac.d.h r2 = r2.mo71856d()
            r10.mo71833i(r2)
            com.google.assistant.ac.d.h r4 = com.google.assistant.p3775ac.p3779d.C48468h.UNKNOWN_MODE
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0248
            com.google.android.apps.gsa.nga.engine.education.b.ac r4 = r10.f210104g
            dagger.a r5 = r4.f210152c
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.nga.engine.education.a.y r5 = (com.google.android.apps.gsa.nga.engine.education.p6016a.C75674y) r5
            java.util.concurrent.atomic.AtomicReference r6 = r5.f210048e
            java.lang.Object r6 = r6.get()
            com.google.common.b.gu r6 = (com.google.common.p4522b.C58485gu) r6
            r6.size()
            java.util.concurrent.atomic.AtomicReference r6 = r5.f210048e
            java.lang.Object r6 = r6.get()
            com.google.common.b.gu r6 = (com.google.common.p4522b.C58485gu) r6
            com.google.android.apps.gsa.nga.engine.education.a.af[] r3 = new com.google.android.apps.gsa.nga.engine.education.p6016a.C75647af[r3]
            com.google.common.b.gu r3 = r5.mo71820e(r6, r7, r3)
            r3.size()
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.apps.gsa.nga.engine.education.b.w r6 = new com.google.android.apps.gsa.nga.engine.education.b.w
            r6.<init>(r4)
            j$.util.stream.Stream r5 = r5.filter(r6)
            j$.util.stream.Collector r6 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r5 = r5.collect(r6)
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
            r5.size()
            r3.size()
            com.google.android.apps.gsa.shared.util.v.g r6 = r4.f210154e
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90040cs.f248687z
            boolean r6 = r6.mo85405j(r11)
            if (r6 == 0) goto L_0x021b
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x021b
            com.google.android.apps.gsa.nga.shared.h.k r4 = r4.f210153d
            com.google.common.util.concurrent.cx r4 = r4.mo74874V()
            com.google.android.apps.gsa.nga.engine.education.b.q r5 = com.google.android.apps.gsa.nga.engine.education.p6017b.C75731q.f210200a
            com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at.m128763g(r4, r5)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89842j(r3)
        L_0x021b:
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r5)
            j$.util.Optional r3 = r3.findFirst()
            boolean r4 = r3.isPresent()
            if (r4 == 0) goto L_0x023e
            com.google.android.apps.gsa.nga.shared.h.k r4 = r10.f210108k
            java.lang.Object r5 = r3.get()
            com.google.android.apps.gsa.nga.engine.education.a.ai r5 = (com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai) r5
            java.lang.String r5 = r5.mo71806j()
            com.google.common.util.concurrent.cx r4 = r4.mo74856D(r5)
            com.google.android.apps.gsa.nga.engine.education.i r5 = com.google.android.apps.gsa.nga.engine.education.C75754i.f210238a
            com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at.m128763g(r4, r5)
        L_0x023e:
            com.google.android.apps.gsa.nga.engine.education.j r4 = new com.google.android.apps.gsa.nga.engine.education.j
            r4.<init>(r10, r7, r2)
            j$.util.Optional r2 = r3.map(r4)
            goto L_0x024c
        L_0x0248:
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
        L_0x024c:
            com.google.android.apps.gsa.nga.engine.education.c r3 = com.google.android.apps.gsa.nga.engine.education.C75746c.LOCKSCREEN
            r1.<init>(r2, r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0314
        L_0x0257:
            android.util.Pair r1 = new android.util.Pair
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.android.apps.gsa.nga.engine.education.c r3 = com.google.android.apps.gsa.nga.engine.education.C75746c.OTHER
            r1.<init>(r2, r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0314
        L_0x0268:
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto L_0x027b
            android.util.Pair r2 = new android.util.Pair
            com.google.android.apps.gsa.nga.engine.education.c r3 = com.google.android.apps.gsa.nga.engine.education.C75746c.OTHER
            r2.<init>(r1, r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            goto L_0x0314
        L_0x027b:
            j$.util.Optional r1 = r10.f210102e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0288
            com.google.android.apps.gsa.nga.engine.education.ak r1 = com.google.android.apps.gsa.nga.engine.education.C75686ak.f210094e
        L_0x0285:
            r6 = r1
            goto L_0x0302
        L_0x0288:
            com.google.android.apps.gsa.nga.engine.education.b.ac r1 = r10.f210104g
            com.google.assistant.ac.d.h r1 = r1.mo71853a()
            r10.mo71833i(r1)
            com.google.assistant.ac.d.h r2 = com.google.assistant.p3775ac.p3779d.C48468h.UNKNOWN_MODE
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x029c
            com.google.android.apps.gsa.nga.engine.education.ak r1 = com.google.android.apps.gsa.nga.engine.education.C75686ak.f210094e
            goto L_0x0285
        L_0x029c:
            com.google.android.apps.gsa.nga.engine.education.b.ac r2 = r10.f210104g
            dagger.a r6 = r2.f210152c
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.nga.engine.education.a.y r6 = (com.google.android.apps.gsa.nga.engine.education.p6016a.C75674y) r6
            r11 = 1
            com.google.android.apps.gsa.nga.engine.education.a.af[] r11 = new com.google.android.apps.gsa.nga.engine.education.p6016a.C75647af[r11]
            com.google.android.apps.gsa.nga.engine.education.a.af r12 = com.google.android.apps.gsa.nga.engine.education.p6016a.C75647af.HANDS_FREE
            r11[r3] = r12
            com.google.common.b.gu r3 = r6.mo71819d(r7, r11)
            com.google.common.v.i r6 = r2.f210151b
            j$.time.Instant r6 = r6.mo57444a()
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.apps.gsa.nga.engine.education.b.s r11 = new com.google.android.apps.gsa.nga.engine.education.b.s
            r11.<init>(r2, r6)
            j$.util.stream.Stream r2 = r3.filter(r11)
            j$.util.stream.Collector r3 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r3)
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x02d5
            com.google.android.apps.gsa.nga.engine.education.ak r1 = com.google.android.apps.gsa.nga.engine.education.C75686ak.f210094e
            goto L_0x0285
        L_0x02d5:
            com.google.android.apps.gsa.nga.engine.education.bc r3 = r10.f210101d
            com.google.assistant.y.a.bf r6 = com.google.assistant.p4008y.p4009a.C53573bf.CONTEXT_KEY_HANDS_FREE
            com.google.android.apps.gsa.nga.engine.education.n r11 = new com.google.android.apps.gsa.nga.engine.education.n
            r11.<init>(r10)
            com.google.assistant.y.a.bf r12 = com.google.assistant.p4008y.p4009a.C53573bf.CONTEXT_KEY_FOREGROUND_APPLICATION
            com.google.android.apps.gsa.nga.engine.education.o r13 = new com.google.android.apps.gsa.nga.engine.education.o
            r13.<init>(r10)
            com.google.common.b.hd r6 = com.google.common.p4522b.C58495hd.m89901o(r6, r11, r12, r13)
            com.google.android.apps.gsa.nga.engine.education.aw r11 = new com.google.android.apps.gsa.nga.engine.education.aw
            r11.<init>(r3, r6)
            com.google.common.util.concurrent.cx r2 = com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at.m128762f(r2, r11)
            com.google.android.libraries.gsa.k.g r3 = r3.f210221b
            com.google.android.apps.gsa.nga.engine.education.ax r6 = com.google.android.apps.gsa.nga.engine.education.C75699ax.f210130a
            java.lang.String r11 = "[NGA] Find one suggestion of highest priority"
            com.google.common.util.concurrent.cx r2 = r3.mo28209i(r2, r11, r6)
            com.google.android.apps.gsa.nga.engine.education.ah r3 = new com.google.android.apps.gsa.nga.engine.education.ah
            r3.<init>(r10, r2, r7, r1)
            r6 = r3
        L_0x0302:
            com.google.common.util.concurrent.cx r11 = r6.mo71823a()
            com.google.android.apps.gsa.nga.engine.education.ab r12 = new com.google.android.apps.gsa.nga.engine.education.ab
            r1 = r12
            r2 = r10
            r3 = r7
            r1.<init>(r2, r3, r4, r6)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r11, r12, r1)
        L_0x0314:
            com.google.android.apps.gsa.nga.engine.education.ad r2 = new com.google.android.apps.gsa.nga.engine.education.ad
            r2.<init>(r10, r7, r8, r9)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r3)
            com.google.android.libraries.gsa.k.g r0 = r0.f215696b
            java.lang.String r2 = "[NGA] FreQuerySuggestionProvider.buildFreSuggestion"
            com.google.android.apps.gsa.nga.engine.ui.e.h.a.b.g r3 = com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6176b.C78345g.f215693a
            com.google.common.util.concurrent.cx r0 = r0.mo28209i(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6176b.C78342d.mo17947a():java.lang.Object");
    }
}
