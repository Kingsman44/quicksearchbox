package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.at;
import com.google.android.apps.gsa.nga.api.a.bj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cp */
/* compiled from: PG */
public final /* synthetic */ class C126078cp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347455a;

    /* renamed from: b */
    public final /* synthetic */ bj f347456b;

    /* renamed from: c */
    public final /* synthetic */ at f347457c;

    /* renamed from: d */
    public final /* synthetic */ C126056bu f347458d;

    public /* synthetic */ C126078cp(C126081cs csVar, bj bjVar, at atVar, C126056bu buVar) {
        this.f347455a = csVar;
        this.f347456b = bjVar;
        this.f347457c = atVar;
        this.f347458d = buVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01df, code lost:
        if (p3186j$.util.Objects.equals(r8, com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm.CURSOR_CHANGE) != false) goto L_0x0207;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cs r0 = r11.f347455a
            com.google.android.apps.gsa.nga.api.a.bj r1 = r11.f347456b
            com.google.android.apps.gsa.nga.api.a.at r2 = r11.f347457c
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.bu r3 = r11.f347458d
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dy r4 = r0.f347474l
            r4.mo107366j(r3)
            r0.mo107316v()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r3 = r0.f347469g
            com.google.android.apps.search.assistant.surfaces.dictation.a.at r3 = r3.mo107336a()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r4 = r0.f347469g
            java.util.concurrent.atomic.AtomicReference r4 = r4.f347530a
            java.lang.Object r4 = r4.get()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cy r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126087cy) r4
            boolean r4 = r4.f347492c
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r5 = r0.f347469g
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cu r5 = r5.mo107337b()
            boolean r5 = r5.f347482c
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r6 = r0.f347469g
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cu r6 = r6.mo107337b()
            boolean r6 = r6.f347481b
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r7 = r0.f347469g
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cu r7 = r7.mo107337b()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cz r7 = r7.f347483d
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r8 = r0.f347469g
            java.util.concurrent.atomic.AtomicReference r8 = r8.f347530a
            java.lang.Object r8 = r8.get()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cy r8 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126087cy) r8
            com.google.android.apps.search.assistant.surfaces.dictation.a.cm r8 = r8.f347494e
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r9 = r0.f347469g
            java.lang.String r10 = "orationContext"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r10)
            java.lang.String r10 = "mutableContext"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r10)
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dk r10 = new com.google.android.apps.search.assistant.surfaces.dictation.service.n.dk
            r10.<init>(r1, r2)
            r9.mo107340e(r10)
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r2 = r0.f347469g
            java.util.concurrent.atomic.AtomicReference r2 = r2.f347530a
            java.lang.Object r2 = r2.get()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cy r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126087cy) r2
            int r2 = r2.f347495f
            r9 = 1
            if (r2 > r9) goto L_0x0128
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r2 = r0.f347469g
            java.util.concurrent.atomic.AtomicReference r2 = r2.f347530a
            java.lang.Object r2 = r2.get()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cy r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126087cy) r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.aa r2 = r2.f347490a
            j$.util.Optional r2 = p3186j$.util.Optional.ofNullable(r2)
            java.lang.String r3 = "ofNullable(state.get().dictationParams)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r3 = r0.f347469g
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.da r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126090da.f347508a
            r3.mo107340e(r4)
            r0.mo107319y()
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x0123
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dy r3 = r0.f347474l
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.bc r4 = r0.f347470h
            java.lang.Object r2 = r2.get()
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.aa r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa) r2
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            r4.mo107265f(r5)
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.x r6 = r4.f347366l
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.q r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126153q.f347622a
            com.google.common.util.concurrent.cx r6 = r6.mo107388f(r7)
            r5.mo55395g(r6)
            com.google.android.apps.search.assistant.libraries.dictation.b.u r6 = r2.mo107510c()
            com.google.android.apps.search.assistant.libraries.dictation.b.u r7 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u.STICKY
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00d1
            com.google.android.apps.search.assistant.libraries.dictation.b.s r6 = r2.mo107509b()
            com.google.android.apps.search.assistant.libraries.dictation.b.s r7 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s.REQUESTER_KEYBOARD_MIC_BUTTON
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00d1
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.x r6 = r4.f347365k
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.q r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126153q.f347622a
            com.google.common.util.concurrent.cx r6 = r6.mo107388f(r7)
            r5.mo55395g(r6)
        L_0x00d1:
            com.google.android.apps.search.assistant.libraries.dictation.b.s r6 = r2.mo107509b()
            com.google.android.apps.search.assistant.libraries.dictation.b.s r7 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s.REQUESTER_ASSISTANT_UNKNOWN
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00e9
            com.google.android.apps.search.assistant.libraries.dictation.b.s r6 = r2.mo107509b()
            com.google.android.apps.search.assistant.libraries.dictation.b.s r7 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s.REQUESTER_ASSISTANT_CLIENT_OP
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00f4
        L_0x00e9:
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.x r6 = r4.f347367m
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.q r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126153q.f347622a
            com.google.common.util.concurrent.cx r6 = r6.mo107388f(r7)
            r5.mo55395g(r6)
        L_0x00f4:
            com.google.android.apps.search.assistant.libraries.dictation.b.s r2 = r2.mo107509b()
            com.google.android.apps.search.assistant.libraries.dictation.b.s r6 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s.REQUESTER_KEYBOARD_MIC_BUTTON
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0109
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.x r2 = r4.f347365k
            com.google.common.util.concurrent.cx r2 = r2.mo107385c()
            r5.mo55395g(r2)
        L_0x0109:
            com.google.common.b.gu r2 = r5.mo55394f()
            com.google.common.util.concurrent.cx r2 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar.m206525d(r2)
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.aw r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.n.aw
            r5.<init>(r4)
            java.util.concurrent.Executor r4 = r4.f347360f
            com.google.common.util.concurrent.s r5 = com.google.apps.tiktok.tracing.C47810es.m84966f(r5)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93045h(r2, r5, r4)
            r3.mo107358b(r2)
        L_0x0123:
            r0.mo107315u()
            goto L_0x0207
        L_0x0128:
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r2 = r0.f347469g
            java.util.concurrent.atomic.AtomicReference r2 = r2.f347530a
            java.lang.Object r2 = r2.get()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cy r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126087cy) r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cv r2 = r2.f347493d
            boolean r2 = r2.f347486c
            if (r2 == 0) goto L_0x017c
            com.google.android.apps.gsa.nga.api.a.af r2 = r1.a
            if (r2 != 0) goto L_0x013e
            com.google.android.apps.gsa.nga.api.a.af r2 = com.google.android.apps.gsa.nga.api.a.af.w
        L_0x013e:
            boolean r2 = r2.q
            if (r2 != 0) goto L_0x017c
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dy r2 = r0.f347474l
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.n r3 = r0.f347467e
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r4 = r0.f347469g
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cy r4 = r4.mo107338c()
            com.google.android.apps.search.assistant.libraries.dictation.b.u r5 = r4.mo107326a()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.b.g r6 = r3.f347616f
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dx r7 = r3.f347611a
            com.google.assistant.f.c.f r8 = com.google.assistant.p3931f.p3939c.C52829f.f138611c
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.k r4 = r7.mo107356a(r4, r8)
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.b r6 = r6.f347243a
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.a.c r6 = r6.f347258a
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dr r6 = r6.f347255b
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e) r4
            java.util.Locale r4 = r4.f347344e
            r7 = 2132083885(0x7f1504ad, float:1.9807925E38)
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.h r4 = r6.mo107347f(r4, r7)
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89846n(r4)
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92900i(r4)
            com.google.common.util.concurrent.cx r3 = r3.mo107382c(r5, r4)
            r2.mo107364h(r3)
            goto L_0x0207
        L_0x017c:
            if (r6 == 0) goto L_0x0188
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r2 = r0.f347469g
            r2.mo107339d(r9, r5, r7, r3)
            r0.mo107318x()
            goto L_0x0207
        L_0x0188:
            if (r4 == 0) goto L_0x0192
            r0.mo107317w()
            r0.mo107315u()
            goto L_0x0207
        L_0x0192:
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r2 = r0.f347469g
            boolean r2 = r2.mo107341f()
            if (r2 != 0) goto L_0x0204
            com.google.android.apps.search.assistant.surfaces.dictation.a.cm r2 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm.CANDIDATE_SELECTED
            boolean r2 = p3186j$.util.Objects.equals(r8, r2)
            if (r2 != 0) goto L_0x0204
            com.google.android.apps.search.assistant.surfaces.dictation.a.cm r2 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm.APPLICATION_CONSUMED_CONTENT
            boolean r2 = p3186j$.util.Objects.equals(r8, r2)
            if (r2 != 0) goto L_0x0204
            com.google.android.apps.search.assistant.surfaces.dictation.a.cm r2 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm.FIELD_CHANGE
            boolean r2 = p3186j$.util.Objects.equals(r8, r2)
            if (r2 == 0) goto L_0x01b3
            goto L_0x0204
        L_0x01b3:
            com.google.android.apps.gsa.nga.engine.dictation.e r2 = r1.d
            if (r2 != 0) goto L_0x01b9
            com.google.android.apps.gsa.nga.engine.dictation.e r2 = com.google.android.apps.gsa.nga.engine.dictation.e.b
        L_0x01b9:
            int r2 = r2.a
            int r2 = com.google.android.apps.gsa.nga.engine.dictation.C75366d.m121807a(r2)
            if (r2 != 0) goto L_0x01c2
            goto L_0x01e2
        L_0x01c2:
            r3 = 3
            if (r2 != r3) goto L_0x01e2
            com.google.android.apps.gsa.nga.engine.dictation.e r2 = r1.e
            if (r2 != 0) goto L_0x01cb
            com.google.android.apps.gsa.nga.engine.dictation.e r2 = com.google.android.apps.gsa.nga.engine.dictation.e.b
        L_0x01cb:
            int r2 = r2.a
            int r2 = com.google.android.apps.gsa.nga.engine.dictation.C75366d.m121807a(r2)
            if (r2 == 0) goto L_0x01e2
            if (r2 != r3) goto L_0x01e2
            int r2 = r1.c
            if (r2 != 0) goto L_0x01e2
            com.google.android.apps.search.assistant.surfaces.dictation.a.cm r2 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm.CURSOR_CHANGE
            boolean r2 = p3186j$.util.Objects.equals(r8, r2)
            if (r2 == 0) goto L_0x01e2
            goto L_0x0207
        L_0x01e2:
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dy r2 = r0.f347474l
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.n r3 = r0.f347467e
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq r4 = r0.f347469g
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cy r4 = r4.mo107338c()
            com.google.android.apps.search.assistant.libraries.dictation.b.u r4 = r4.mo107326a()
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            com.google.common.util.concurrent.cx r3 = r3.mo107382c(r4, r5)
            java.lang.String r4 = "typing"
            j$.time.Duration r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126081cs.f347464b
            r2.mo107362f(r3, r4, r5)
            goto L_0x0207
        L_0x0204:
            r0.mo107317w()
        L_0x0207:
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.dy r2 = r0.f347474l
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.bc r0 = r0.f347470h
            int r1 = r1.c
            if (r1 <= 0) goto L_0x0210
            goto L_0x0211
        L_0x0210:
            r9 = 0
        L_0x0211:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f347378x
            r1.set(r9)
            if (r9 == 0) goto L_0x022e
            com.google.android.libraries.storage.protostore.ab r1 = r0.f347362h
            com.google.common.util.concurrent.cx r1 = r1.mo46042d()
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.af r3 = new com.google.android.apps.search.assistant.surfaces.dictation.service.n.af
            r3.<init>(r0)
            java.util.concurrent.Executor r0 = r0.f347360f
            com.google.common.util.concurrent.s r3 = com.google.apps.tiktok.tracing.C47810es.m84966f(r3)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r1, r3, r0)
            goto L_0x0236
        L_0x022e:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0236:
            r2.mo107358b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126078cp.run():void");
    }
}
