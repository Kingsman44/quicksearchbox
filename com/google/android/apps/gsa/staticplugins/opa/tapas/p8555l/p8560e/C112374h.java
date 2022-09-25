package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.h */
/* compiled from: PG */
public final /* synthetic */ class C112374h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112312ag f311803a;

    /* renamed from: b */
    public final /* synthetic */ C112344bl f311804b;

    public /* synthetic */ C112374h(C112312ag agVar, C112344bl blVar) {
        this.f311803a = agVar;
        this.f311804b = blVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e5, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17870a(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ag r0 = r7.f311803a
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bl r1 = r7.f311804b
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00e9
            com.google.android.apps.gsa.search.core.i.t r8 = r0.f311675g
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247740mp
            boolean r8 = r8.mo79746e(r2)
            if (r8 == 0) goto L_0x00e9
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.k r8 = r0.f311685q
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.r r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r.REFLECTION_LOG
            java.lang.String r3 = "Loading Tapas models and buffers from disk."
            r8.mo99076a(r2, r3)
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            monitor-enter(r0)
            com.google.android.apps.gsa.search.core.google.gaia.o r8 = r0.f311679k     // Catch:{ all -> 0x00e6 }
            java.lang.String r8 = r8.mo79659F()     // Catch:{ all -> 0x00e6 }
            if (r8 != 0) goto L_0x002c
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            return
        L_0x002c:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f311675g     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249292al     // Catch:{ all -> 0x00e6 }
            boolean r2 = r2.mo79746e(r3)     // Catch:{ all -> 0x00e6 }
            if (r2 != 0) goto L_0x0081
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.az r2 = r0.f311676h     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.search.core.i.t r3 = r2.f311709f     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249331bX     // Catch:{ all -> 0x00e6 }
            boolean r3 = r3.mo79746e(r4)     // Catch:{ all -> 0x00e6 }
            if (r3 == 0) goto L_0x005f
            com.google.android.apps.search.assistant.platform.i.e.a.f r3 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112331az.f311704a     // Catch:{ all -> 0x00e6 }
            com.google.android.libraries.gsa.k.g r4 = r2.f311706c     // Catch:{ all -> 0x00e6 }
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.TAPAS_REFLECTION_TRAINING_BUFFERS     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.assistant.shared.l.m r6 = com.google.android.apps.gsa.assistant.shared.l.m.b     // Catch:{ all -> 0x00e6 }
            com.google.common.util.concurrent.cx r5 = r2.mo99502f(r8, r5, r6)     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ai r6 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ai     // Catch:{ all -> 0x00e6 }
            r6.<init>(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "get TapasTrainingBuffers from geller"
            com.google.common.util.concurrent.cx r2 = r4.mo28210j(r5, r2, r6)     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "loadEventBufferGeller"
            r3.mo105244m(r4, r2)     // Catch:{ all -> 0x00e6 }
            goto L_0x006a
        L_0x005f:
            com.google.android.apps.search.assistant.platform.i.e.a.f r3 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112331az.f311704a     // Catch:{ all -> 0x00e6 }
            com.google.common.util.concurrent.cx r2 = r2.mo99500d()     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "loadEventBufferFromOpaStore"
            r3.mo105244m(r4, r2)     // Catch:{ all -> 0x00e6 }
        L_0x006a:
            r0.f311683o = r2     // Catch:{ all -> 0x00e6 }
            com.google.common.util.concurrent.cx r2 = r0.f311683o     // Catch:{ all -> 0x00e6 }
            com.google.android.libraries.gsa.k.g r3 = r0.f311673e     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "reflectionDataManager.loadEventBuffer"
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ab r5 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ab     // Catch:{ all -> 0x00e6 }
            r5.<init>(r0)     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.shared.util.c.ag r6 = new com.google.android.apps.gsa.shared.util.c.ag     // Catch:{ all -> 0x00e6 }
            r6.<init>(r2, r3, r4, r5)     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ac r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112308ac.f311663a     // Catch:{ all -> 0x00e6 }
            r6.mo85223a(r2)     // Catch:{ all -> 0x00e6 }
        L_0x0081:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f311675g     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249294an     // Catch:{ all -> 0x00e6 }
            boolean r2 = r2.mo79746e(r3)     // Catch:{ all -> 0x00e6 }
            if (r2 == 0) goto L_0x008f
            r0.mo99496e(r1)     // Catch:{ all -> 0x00e6 }
            goto L_0x00e4
        L_0x008f:
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.az r2 = r0.f311676h     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.search.core.i.t r3 = r2.f311709f     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249331bX     // Catch:{ all -> 0x00e6 }
            boolean r3 = r3.mo79746e(r4)     // Catch:{ all -> 0x00e6 }
            if (r3 == 0) goto L_0x00b8
            com.google.android.apps.search.assistant.platform.i.e.a.f r3 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112331az.f311704a     // Catch:{ all -> 0x00e6 }
            com.google.android.libraries.gsa.k.g r4 = r2.f311706c     // Catch:{ all -> 0x00e6 }
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.TAPAS_REFLECTION_MODELS     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.assistant.shared.l.i r6 = com.google.android.apps.gsa.assistant.shared.l.i.b     // Catch:{ all -> 0x00e6 }
            com.google.common.util.concurrent.cx r8 = r2.mo99502f(r8, r5, r6)     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.aw r5 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.aw     // Catch:{ all -> 0x00e6 }
            r5.<init>(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "get TapasModels from geller"
            com.google.common.util.concurrent.cx r8 = r4.mo28210j(r8, r2, r5)     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "loadModelsFromGeller"
            r3.mo105244m(r2, r8)     // Catch:{ all -> 0x00e6 }
            goto L_0x00c4
        L_0x00b8:
            com.google.android.apps.search.assistant.platform.i.e.a.f r8 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112331az.f311704a     // Catch:{ all -> 0x00e6 }
            com.google.common.util.concurrent.cx r2 = r2.mo99501e()     // Catch:{ all -> 0x00e6 }
            java.lang.String r3 = "loadModelFromOpaStore"
            r8.mo105244m(r3, r2)     // Catch:{ all -> 0x00e6 }
            r8 = r2
        L_0x00c4:
            com.google.android.libraries.gsa.k.g r2 = r0.f311673e     // Catch:{ all -> 0x00e6 }
            java.lang.String r3 = "reflectionDataManager.loadModel"
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.v r4 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.v     // Catch:{ all -> 0x00e6 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.shared.util.c.ag r5 = new com.google.android.apps.gsa.shared.util.c.ag     // Catch:{ all -> 0x00e6 }
            r5.<init>(r8, r2, r3, r4)     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.w r8 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.w     // Catch:{ all -> 0x00e6 }
            r8.<init>(r0, r1)     // Catch:{ all -> 0x00e6 }
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ay> r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112330ay.class
            r5.mo85225c(r2, r8)     // Catch:{ all -> 0x00e6 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.x r8 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.x     // Catch:{ all -> 0x00e6 }
            r8.<init>(r0, r1)     // Catch:{ all -> 0x00e6 }
            r5.mo85223a(r8)     // Catch:{ all -> 0x00e6 }
        L_0x00e4:
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            return
        L_0x00e6:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            throw r8
        L_0x00e9:
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.k r8 = r0.f311685q
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.r r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r.REFLECTION_LOG
            java.lang.String r1 = "Reflection disabled."
            r8.mo99076a(r0, r1)
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112374h.mo17870a(java.lang.Object):void");
    }
}
