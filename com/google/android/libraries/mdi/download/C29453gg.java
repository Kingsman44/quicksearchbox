package com.google.android.libraries.mdi.download;

import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.gg */
/* compiled from: PG */
public final /* synthetic */ class C29453gg implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79849a;

    /* renamed from: b */
    public final /* synthetic */ C28740br f79850b;

    public /* synthetic */ C29453gg(C29647hr hrVar, C28740br brVar) {
        this.f79849a = hrVar;
        this.f79850b = brVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x010a, code lost:
        if (r14 == 0) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r14) {
        /*
            r13 = this;
            com.google.android.libraries.mdi.download.hr r8 = r13.f79849a
            com.google.android.libraries.mdi.download.br r9 = r13.f79850b
            com.google.android.libraries.mdi.download.d.h r14 = (com.google.android.libraries.mdi.download.p2236d.C29166h) r14
            int r0 = r14.mo34503b()
            int r1 = r0 + -1
            r2 = 0
            if (r0 == 0) goto L_0x0214
            r0 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r3) goto L_0x003a
            if (r1 != r0) goto L_0x0021
            com.google.android.libraries.mdi.f r14 = r14.mo34502a()
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)
            goto L_0x0213
        L_0x0021:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r14 = r14.mo34503b()
            java.lang.String r14 = com.google.android.libraries.mdi.download.p2236d.C29086f.m53976a(r14)
            r2 = 0
            r1[r2] = r14
            java.lang.String r14 = "received unsupported DownloadGroupState kind %s"
            java.lang.String r14 = java.lang.String.format(r14, r1)
            r0.<init>(r14)
            throw r0
        L_0x003a:
            com.google.common.util.concurrent.cx r14 = r14.mo34516c()
            goto L_0x0213
        L_0x0040:
            com.google.android.libraries.mdi.download.dr r14 = r14.mo34528d()
            android.content.Context r1 = r8.f80295a
            com.google.android.libraries.mdi.download.foreground.C29423c.m54386i(r1)
            java.lang.String r1 = r9.mo34350i()
            com.google.android.libraries.mdi.download.ep r4 = com.google.android.libraries.mdi.download.C29392ep.f79679g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.mdi.download.eo r4 = (com.google.android.libraries.mdi.download.C29391eo) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.mdi.download.ep r5 = (com.google.android.libraries.mdi.download.C29392ep) r5
            r1.getClass()
            int r6 = r5.f79681a
            r6 = r6 | r3
            r5.f79681a = r6
            r5.f79682b = r1
            android.content.Context r5 = r8.f80295a
            java.lang.String r5 = r5.getPackageName()
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.mdi.download.ep r6 = (com.google.android.libraries.mdi.download.C29392ep) r6
            r5.getClass()
            int r7 = r6.f79681a
            r7 = r7 | r0
            r6.f79681a = r7
            r6.f79683c = r5
            com.google.common.base.ax r5 = r9.mo34344c()
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x00a4
            com.google.common.base.ax r5 = r9.mo34344c()
            java.lang.Object r5 = r5.mo56107c()
            android.accounts.Account r5 = (android.accounts.Account) r5
            java.lang.String r5 = com.google.android.libraries.mdi.download.p2228a.C28694b.m53577b(r5)
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.mdi.download.ep r6 = (com.google.android.libraries.mdi.download.C29392ep) r6
            int r7 = r6.f79681a
            r7 = r7 | 4
            r6.f79681a = r7
            r6.f79684d = r5
        L_0x00a4:
            com.google.common.base.ax r5 = r9.mo34349h()
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x00ca
            com.google.common.base.ax r5 = r9.mo34349h()
            java.lang.Object r5 = r5.mo56107c()
            java.lang.String r5 = (java.lang.String) r5
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.mdi.download.ep r6 = (com.google.android.libraries.mdi.download.C29392ep) r6
            r5.getClass()
            int r7 = r6.f79681a
            r7 = r7 | 16
            r6.f79681a = r7
            r6.f79686f = r5
        L_0x00ca:
            com.google.protobuf.bv r4 = r4.build()
            r10 = r4
            com.google.android.libraries.mdi.download.ep r10 = (com.google.android.libraries.mdi.download.C29392ep) r10
            com.google.common.base.ax r4 = r9.mo34344c()
            com.google.common.base.ax r5 = r9.mo34349h()
            com.google.android.libraries.mdi.download.foreground.b r11 = com.google.android.libraries.mdi.download.foreground.C29422b.m54374c(r1, r4, r5)
            com.google.android.libraries.mdi.download.ed r14 = r14.f79510l
            if (r14 != 0) goto L_0x00e3
            com.google.android.libraries.mdi.download.ed r14 = com.google.android.libraries.mdi.download.C29380ed.f79641f
        L_0x00e3:
            int r14 = r14.f79645c
            int r14 = com.google.android.libraries.mdi.download.C29377ea.m54303a(r14)
            if (r14 != 0) goto L_0x00ec
            r14 = 1
        L_0x00ec:
            com.google.common.base.ax r1 = r9.mo34347f()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x010d
            com.google.common.base.ax r1 = r9.mo34347f()     // Catch:{ ct -> 0x010d }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ ct -> 0x010d }
            com.google.android.libraries.mdi.download.av r1 = (com.google.android.libraries.mdi.download.C28716av) r1     // Catch:{ ct -> 0x010d }
            com.google.android.libraries.mdi.download.ed r1 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29103q.m54024a(r1)     // Catch:{ ct -> 0x010d }
            int r1 = r1.f79645c     // Catch:{ ct -> 0x010d }
            int r14 = com.google.android.libraries.mdi.download.C29377ea.m54303a(r1)     // Catch:{ ct -> 0x010d }
            if (r14 != 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r3 = r14
        L_0x010e:
            int r3 = r3 + -1
            if (r3 == 0) goto L_0x011b
            if (r3 == r0) goto L_0x011b
            android.content.Context r14 = r8.f80295a
            java.lang.String r14 = com.google.android.libraries.mdi.download.foreground.C29423c.m54381d(r14)
            goto L_0x0121
        L_0x011b:
            android.content.Context r14 = r8.f80295a
            java.lang.String r14 = com.google.android.libraries.mdi.download.foreground.C29423c.m54382e(r14)
        L_0x0121:
            r7 = r14
            android.content.Context r14 = r8.f80295a
            androidx.core.app.aq r5 = new androidx.core.app.aq
            r5.<init>(r14)
            java.lang.String r14 = r9.mo34350i()
            com.google.common.base.ax r1 = r9.mo34344c()
            com.google.common.base.ax r3 = r9.mo34349h()
            com.google.android.libraries.mdi.download.foreground.b r14 = com.google.android.libraries.mdi.download.foreground.C29422b.m54374c(r14, r1, r3)
            android.content.Context r1 = r8.f80295a
            int r3 = r9.mo34342a()
            com.google.common.base.ax r4 = r9.mo34346e()
            java.lang.String r6 = r9.mo34350i()
            java.lang.Object r4 = r4.mo56109e(r6)
            java.lang.String r4 = (java.lang.String) r4
            com.google.common.base.ax r6 = r9.mo34345d()
            java.lang.String r12 = r9.mo34350i()
            java.lang.Object r6 = r6.mo56109e(r12)
            java.lang.String r6 = (java.lang.String) r6
            androidx.core.app.z r4 = com.google.android.libraries.mdi.download.foreground.C29423c.m54379b(r1, r3, r4, r6)
            java.lang.String r1 = r9.mo34350i()
            int r6 = r1.hashCode()
            int r1 = r9.mo34353l()
            if (r1 != r0) goto L_0x0186
            android.content.Context r0 = r8.f80295a
            com.google.common.base.ax r1 = r8.f80303i
            java.lang.Object r1 = r1.mo56107c()
            java.lang.Class r1 = (java.lang.Class) r1
            r3 = r14
            com.google.android.libraries.mdi.download.foreground.a r3 = (com.google.android.libraries.mdi.download.foreground.C29421a) r3
            java.lang.String r3 = r3.f79765a
            com.google.android.libraries.mdi.download.foreground.C29423c.m54385h(r0, r1, r3, r4, r6)
            android.app.Notification r0 = r4.mo5013a()
            r5.mo5003b(r2, r6, r0)
        L_0x0186:
            com.google.android.libraries.mdi.download.hp r12 = new com.google.android.libraries.mdi.download.hp
            r0 = r12
            r1 = r8
            r2 = r14
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.common.base.ax r14 = r8.f80302h
            java.lang.Object r14 = r14.mo56107c()
            com.google.android.libraries.mdi.download.g.e r14 = (com.google.android.libraries.mdi.download.p2247g.C29441e) r14
            java.lang.String r0 = r9.mo34350i()
            r14.mo34739i(r0, r12)
            com.google.common.base.ax r14 = r9.mo34347f()     // Catch:{ ct -> 0x020e }
            boolean r14 = r14.mo56113h()     // Catch:{ ct -> 0x020e }
            if (r14 == 0) goto L_0x01bb
            com.google.common.base.ax r14 = r9.mo34347f()     // Catch:{ ct -> 0x020e }
            java.lang.Object r14 = r14.mo56107c()     // Catch:{ ct -> 0x020e }
            com.google.android.libraries.mdi.download.av r14 = (com.google.android.libraries.mdi.download.C28716av) r14     // Catch:{ ct -> 0x020e }
            com.google.android.libraries.mdi.download.ed r14 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29103q.m54024a(r14)     // Catch:{ ct -> 0x020e }
            com.google.common.base.ax r14 = com.google.common.base.C58833ax.m90834k(r14)     // Catch:{ ct -> 0x020e }
            goto L_0x01bd
        L_0x01bb:
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x020e }
        L_0x01bd:
            com.google.android.libraries.mdi.download.gl r0 = com.google.android.libraries.mdi.download.C29458gl.f79858a
            com.google.common.util.concurrent.cy r1 = new com.google.common.util.concurrent.cy
            r1.<init>((java.util.concurrent.Callable) r0)
            com.google.android.libraries.mdi.download.l.b r0 = com.google.android.libraries.mdi.download.p2257l.C29670b.m54719g(r1)
            com.google.android.libraries.mdi.download.gm r2 = new com.google.android.libraries.mdi.download.gm
            r2.<init>(r8, r10, r14)
            java.util.concurrent.Executor r14 = r8.f80301g
            com.google.android.libraries.mdi.download.l.b r14 = r0.mo34822i(r2, r14)
            com.google.android.libraries.mdi.download.gn r0 = new com.google.android.libraries.mdi.download.gn
            r0.<init>(r8, r9)
            java.util.concurrent.Executor r2 = r8.f80301g
            com.google.android.libraries.mdi.download.l.b r14 = r14.mo34822i(r0, r2)
            com.google.android.libraries.mdi.download.go r0 = com.google.android.libraries.mdi.download.C29461go.f79864a
            java.util.concurrent.Executor r2 = r8.f80301g
            com.google.android.libraries.mdi.download.l.b r14 = r14.mo34821h(r0, r2)
            com.google.android.libraries.mdi.download.d.f.k r0 = r8.f80299e
            com.google.android.libraries.mdi.download.foreground.a r11 = (com.google.android.libraries.mdi.download.foreground.C29421a) r11
            java.lang.String r2 = r11.f79765a
            com.google.common.util.concurrent.cx r0 = r0.mo34565b(r2, r14)
            com.google.android.libraries.mdi.download.gp r2 = new com.google.android.libraries.mdi.download.gp
            r2.<init>(r1, r14)
            java.util.concurrent.Executor r14 = r8.f80301g
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r2)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60922j.m93045h(r0, r1, r14)
            com.google.android.libraries.mdi.download.hj r0 = new com.google.android.libraries.mdi.download.hj
            r0.<init>(r12)
            java.util.concurrent.Executor r1 = r8.f80301g
            com.google.common.util.concurrent.bz r0 = com.google.apps.tiktok.tracing.C47810es.m84974n(r0)
            com.google.common.util.concurrent.C60856cj.m92911t(r14, r0, r1)
            goto L_0x0213
        L_0x020e:
            r14 = move-exception
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92899h(r14)
        L_0x0213:
            return r14
        L_0x0214:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.C29453gg.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
