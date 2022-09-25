package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.an */
/* compiled from: PG */
public final /* synthetic */ class C114564an implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114575ay f317697a;

    public /* synthetic */ C114564an(C114575ay ayVar) {
        this.f317697a = ayVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17870a(java.lang.Object r14) {
        /*
            r13 = this;
            com.google.android.apps.gsa.staticplugins.opa.zerostate.ay r0 = r13.f317697a
            java.util.List r14 = (java.util.List) r14
            r1 = 0
            java.lang.Object r2 = r14.get(r1)
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            r3 = 1
            java.lang.Object r14 = r14.get(r3)
            com.google.android.apps.gsa.search.shared.f.b r14 = (com.google.android.apps.gsa.search.shared.p6928f.C87546b) r14
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r3 = r0.f317752l
            java.lang.String r3 = r3.f318451d
            com.google.assistant.s.a.ih r3 = com.google.android.apps.gsa.search.shared.p6930h.C87571n.m142340d(r3)
            if (r3 == 0) goto L_0x0083
            int r4 = r3.f139702h
            int r4 = com.google.assistant.p3994s.p3995a.C53282ic.m86805a(r4)
            if (r4 != 0) goto L_0x0025
            goto L_0x0028
        L_0x0025:
            r5 = 5
            if (r4 == r5) goto L_0x0083
        L_0x0028:
            int r4 = r3.f139696b
            r5 = 3
            if (r4 != r5) goto L_0x0083
            int r4 = r2.size()
            r5 = 0
        L_0x0032:
            if (r5 >= r4) goto L_0x0071
            java.lang.Object r6 = r2.get(r5)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.l r6 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l) r6
            boolean r7 = r6 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115017bu
            if (r7 == 0) goto L_0x006e
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bu r6 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115017bu) r6
            com.google.common.b.gu r6 = r6.mo101819d()
            int r7 = r6.size()
            r8 = 0
        L_0x0049:
            if (r8 >= r7) goto L_0x006e
            java.lang.Object r9 = r6.get(r8)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.e r9 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114751e) r9
            java.lang.String r10 = r3.f139701g
            com.google.assistant.s.a.lf r9 = r9.mo101573a()
            int r11 = r9.f140037b
            r12 = 4
            if (r11 != r12) goto L_0x0061
            java.lang.Object r9 = r9.f140038c
            com.google.assistant.s.a.nf r9 = (com.google.assistant.p3994s.p3995a.C53420nf) r9
            goto L_0x0063
        L_0x0061:
            com.google.assistant.s.a.nf r9 = com.google.assistant.p3994s.p3995a.C53420nf.f140165o
        L_0x0063:
            int r8 = r8 + 1
            java.lang.String r9 = r9.f140175i
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0049
            goto L_0x0083
        L_0x006e:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x0071:
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.y r14 = r0.f317719H
            r14.mo101688a(r3)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r14 = r0.f317752l
            r1 = 0
            r14.f318451d = r1
            android.app.Activity r14 = r0.f317742b
            r14.finish()
            return
        L_0x0083:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.ci r3 = r0.f317743c
            com.google.android.apps.gsa.staticplugins.opa.zerostate.bw r3 = r3.f318285f
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f317857r
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x009d
            dagger.a r3 = r0.f317751k
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r3 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r3
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_NETWORK_ERROR
            r3.mo83702b(r4)
            goto L_0x00dc
        L_0x009d:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.ci r3 = r0.f317743c
            com.google.android.apps.gsa.staticplugins.opa.zerostate.bw r3 = r3.f318285f
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f317856q
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x00cf
            com.google.android.apps.gsa.staticplugins.opa.zerostate.ci r3 = r0.f317743c
            com.google.android.apps.gsa.staticplugins.opa.zerostate.bw r3 = r3.f318285f
            boolean r3 = r3.mo101447i()
            if (r3 == 0) goto L_0x00c1
            dagger.a r3 = r0.f317751k
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r3 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r3
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FRESH_CACHE_LOADED
            r3.mo83702b(r4)
            goto L_0x00dc
        L_0x00c1:
            dagger.a r3 = r0.f317751k
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r3 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r3
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_STALE_CACHE_LOADED
            r3.mo83702b(r4)
            goto L_0x00dc
        L_0x00cf:
            dagger.a r3 = r0.f317751k
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r3 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r3
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_NEW_RESPONSE_LOADED
            r3.mo83702b(r4)
        L_0x00dc:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.ci r3 = r0.f317743c
            com.google.android.apps.gsa.staticplugins.opa.zerostate.bw r3 = r3.f318285f
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f317856q
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x0102
            com.google.android.apps.gsa.staticplugins.opa.zerostate.ci r3 = r0.f317743c
            com.google.android.apps.gsa.staticplugins.opa.zerostate.bw r3 = r3.f318285f
            boolean r3 = r3.mo101447i()
            if (r3 != 0) goto L_0x0102
            boolean r3 = r0.mo101434x()
            if (r3 != 0) goto L_0x0102
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.dh r3 = r0.f317747g
            com.google.android.apps.gsa.staticplugins.opa.zerostate.as r4 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.as
            r4.<init>(r0)
            r3.mo101662a(r4)
        L_0x0102:
            r0.mo101414d(r2, r14, r1)
            android.view.ViewGroup r14 = r0.f317765y
            r14.getClass()
            r14.clearAnimation()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ci r14 = r0.f317750j
            android.view.ViewGroup r1 = r0.f317765y
            r1.getClass()
            android.support.v7.widget.RecyclerView r2 = r0.f317714C
            r2.getClass()
            com.google.assistant.s.a.j r3 = com.google.assistant.p3994s.p3995a.C53306j.MAIN_APP
            android.animation.AnimatorSet r14 = r14.mo101651d(r1, r2, r3)
            r14.start()
            android.view.View r14 = r0.f317716E
            r14.getClass()
            r0 = 8
            r14.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.C114564an.mo17870a(java.lang.Object):void");
    }
}
