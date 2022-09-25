package com.google.android.apps.gsa.shared.monet;

/* renamed from: com.google.android.apps.gsa.shared.monet.l */
/* compiled from: PG */
public final /* synthetic */ class C90341l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C90347r f252293a;

    public /* synthetic */ C90341l(C90347r rVar) {
        this.f252293a = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dd, code lost:
        if (r1 == false) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.google.android.apps.gsa.shared.monet.r r0 = r12.f252293a
            com.google.android.apps.gsa.shared.monet.y r1 = r0.f252309c
            boolean r2 = r1.f252345d
            r3 = 1
            if (r2 != 0) goto L_0x0013
            com.google.android.libraries.f.a r2 = r1.f252343b
            long r4 = r2.mo26872d()
            r1.f252346e = r4
            r1.f252345d = r3
        L_0x0013:
            dagger.a r1 = r0.f252314h
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.libraries.gsa.monet.internal.a.u r1 = (com.google.android.libraries.gsa.monet.internal.p1887a.C22997u) r1
            r1.mo28394a(r3)
            boolean r1 = r0.f252326t
            r2 = 3
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0035
        L_0x0025:
            boolean r1 = r0.f252312f
            r4 = 2
            if (r1 == 0) goto L_0x0034
            com.google.common.base.ax r1 = r0.f252324r
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0034
            r1 = 3
            goto L_0x0035
        L_0x0034:
            r1 = 2
        L_0x0035:
            r0.mo84045p(r1)
            r4 = 0
            r0.f252326t = r4
            dagger.a r4 = r0.f252319m
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.monet.g r4 = (com.google.android.apps.gsa.shared.monet.C90329g) r4
            java.util.Queue r5 = r4.f252263c
            java.util.Iterator r5 = r5.iterator()
        L_0x0049:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x005b
            java.lang.Object r6 = r5.next()
            com.google.android.apps.gsa.search.shared.service.ClientEventData r6 = (com.google.android.apps.gsa.search.shared.service.ClientEventData) r6
            com.google.android.apps.gsa.search.shared.service.ah r7 = r4.f252262b
            r7.mo81961c(r6)
            goto L_0x0049
        L_0x005b:
            r4.f252265e = r3
            if (r1 != r2) goto L_0x00df
            dagger.a r1 = r0.f252313g
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.libraries.gsa.monet.a.p r1 = (com.google.android.libraries.gsa.monet.p1886a.C22951p) r1
            com.google.common.base.ax r4 = r0.f252324r
            java.lang.Object r4 = r4.mo56107c()
            android.os.Bundle r4 = (android.os.Bundle) r4
            com.google.android.libraries.gsa.monet.shared.InitializationData r5 = r0.f252322p
            com.google.android.libraries.gsa.monet.shared.y r6 = r5.f63418a
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r5 = r5.f63419b
            boolean r1 = r1.mo28324b(r4, r6, r5)
            com.google.android.apps.gsa.shared.monet.y r4 = r0.f252309c
            com.google.android.apps.gsa.search.shared.service.ah r5 = r4.f252342a
            com.google.android.apps.gsa.search.shared.service.j r6 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.MONET_CLIENT_EVENT
            r6.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r7)
            com.google.protobuf.bt r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C87987kz.f237952a
            com.google.android.apps.gsa.search.shared.service.b.lx r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx.f238010e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.lc r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87991lc) r8
            com.google.android.apps.gsa.search.shared.service.b.lw r9 = com.google.android.apps.gsa.search.shared.service.p6935b.C88011lw.f238004e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.lv r9 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88010lv) r9
            com.google.android.apps.gsa.u.h r4 = r4.f252344c
            int r4 = r4.f330812sk
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.apps.gsa.search.shared.service.b.lw r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88011lw) r10
            int r11 = r10.f238006a
            r3 = r3 | r11
            r10.f238006a = r3
            r10.f238009d = r4
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.android.apps.gsa.search.shared.service.b.lw r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88011lw) r3
            r3.f238007b = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r3.f238008c = r2
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.android.apps.gsa.search.shared.service.b.lx r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx) r2
            com.google.protobuf.bv r3 = r9.build()
            com.google.android.apps.gsa.search.shared.service.b.lw r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88011lw) r3
            r3.getClass()
            r2.f238014c = r3
            r3 = 8
            r2.f238013b = r3
            com.google.protobuf.bv r2 = r8.build()
            com.google.android.apps.gsa.search.shared.service.b.lx r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx) r2
            r6.mo82014b(r7, r2)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r2 = r6.mo82013a()
            r5.mo81961c(r2)
            if (r1 != 0) goto L_0x00ea
        L_0x00df:
            com.google.android.libraries.gsa.monet.a.b r1 = r0.f252307a
            com.google.android.libraries.gsa.monet.shared.InitializationData r2 = r0.f252322p
            com.google.android.libraries.gsa.monet.shared.y r3 = r2.f63418a
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r2 = r2.f63419b
            r1.mo28286b(r3, r2)
        L_0x00ea:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            r0.f252324r = r1
            com.google.android.apps.gsa.shared.monet.f.f r1 = r0.f252310d
            r1.mo84016h()
            com.google.android.apps.gsa.shared.monet.q r1 = com.google.android.apps.gsa.shared.monet.C90346q.STARTED
            r0.f252325s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.monet.C90341l.run():void");
    }
}
