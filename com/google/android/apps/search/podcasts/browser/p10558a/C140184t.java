package com.google.android.apps.search.podcasts.browser.p10558a;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.browser.a.t */
/* compiled from: PG */
final class C140184t extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140177n f380875a;

    /* renamed from: b */
    final /* synthetic */ String f380876b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140184t(C140177n nVar, String str) {
        super(1);
        this.f380875a = nVar;
        this.f380876b = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo5761a(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            com.google.apps.tiktok.account.AccountId r1 = (com.google.apps.tiktok.account.AccountId) r1
            java.lang.String r2 = "it"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            com.google.android.apps.search.podcasts.browser.a.n r2 = r0.f380875a
            android.content.Context r2 = r2.f380859a
            com.google.android.apps.search.podcasts.browser.a.n$a r1 = com.google.android.apps.search.podcasts.browser.p10558a.C140177n.m227831e(r2, r1)
            com.google.android.apps.search.podcasts.browser.a.l r1 = r1.mo115492cW()
            java.lang.String r2 = r0.f380876b
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 3
            r6 = 0
            r7 = 1
            switch(r3) {
                case -1729815381: goto L_0x01f6;
                case -614372632: goto L_0x01dc;
                case -613034174: goto L_0x01c1;
                case 27910251: goto L_0x0142;
                case 257002536: goto L_0x0114;
                case 329069226: goto L_0x00e6;
                case 1711232461: goto L_0x00c9;
                case 1804426450: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0210
        L_0x0026:
            java.lang.String r3 = "media_id_library"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0210
            android.support.v4.media.MediaBrowserCompat$MediaItem r2 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            android.content.Context r3 = r1.f380845a
            r8 = 2132091521(0x7f152281, float:1.9823413E38)
            java.lang.String r11 = r3.getString(r8)
            r3 = 2131234469(0x7f080ea5, float:1.8085105E38)
            android.net.Uri r15 = r1.mo115483a(r3)
            android.support.v4.media.MediaDescriptionCompat r3 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r10 = "media_id_subscriptions"
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r2.<init>(r3, r7)
            android.support.v4.media.MediaBrowserCompat$MediaItem r3 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            android.content.Context r8 = r1.f380845a
            r9 = 2132091463(0x7f152247, float:1.9823295E38)
            java.lang.String r12 = r8.getString(r9)
            r8 = 2131234359(0x7f080e37, float:1.8084882E38)
            android.net.Uri r16 = r1.mo115483a(r8)
            android.support.v4.media.MediaDescriptionCompat r8 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r11 = "media_id_queue"
            r15 = 0
            r18 = 0
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r3.<init>(r8, r7)
            android.support.v4.media.MediaBrowserCompat$MediaItem r8 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            android.content.Context r9 = r1.f380845a
            r10 = 2132091379(0x7f1521f3, float:1.9823125E38)
            java.lang.String r13 = r9.getString(r10)
            r9 = 2131233783(0x7f080bf7, float:1.8083713E38)
            android.net.Uri r17 = r1.mo115483a(r9)
            android.support.v4.media.MediaDescriptionCompat r9 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r12 = "media_id_downloads"
            r16 = 0
            r19 = 0
            r11 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r8.<init>(r9, r7)
            android.support.v4.media.MediaBrowserCompat$MediaItem r9 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            android.content.Context r10 = r1.f380845a
            r11 = 2132091410(0x7f152212, float:1.9823187E38)
            java.lang.String r14 = r10.getString(r11)
            r10 = 2131234223(0x7f080daf, float:1.8084606E38)
            android.net.Uri r18 = r1.mo115483a(r10)
            android.support.v4.media.MediaDescriptionCompat r1 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r13 = "media_id_history"
            r17 = 0
            r20 = 0
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r9.<init>(r1, r7)
            r1 = 4
            android.support.v4.media.MediaBrowserCompat$MediaItem[] r1 = new android.support.p031v4.media.MediaBrowserCompat.MediaItem[r1]
            r1[r6] = r2
            r1[r7] = r3
            r1[r4] = r8
            r1[r5] = r9
            java.util.List r1 = p5462h.p5463a.C69540x.m100947e(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0268
        L_0x00c9:
            java.lang.String r3 = "media_id_subscriptions"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0210
            com.google.android.apps.search.podcasts.n.au r2 = r1.f380848d
            com.google.android.apps.search.podcasts.n.ap r3 = com.google.android.apps.search.podcasts.p10588n.C140667ap.ALPHABETICAL
            com.google.common.util.concurrent.cx r2 = r2.mo115824a(r3)
            java.util.concurrent.Executor r1 = r1.f380852h
            com.google.android.apps.search.podcasts.browser.a.k r3 = new com.google.android.apps.search.podcasts.browser.a.k
            r3.<init>()
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228946d(r2, r1, r3)
            goto L_0x0268
        L_0x00e6:
            java.lang.String r3 = "media_id_explore"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0210
            com.google.android.apps.search.podcasts.n.s r2 = r1.f380846b
            com.google.common.util.concurrent.cx r2 = r2.mo115831d()
            java.util.concurrent.Executor r3 = r1.f380852h
            com.google.android.apps.search.podcasts.browser.a.d r4 = new com.google.android.apps.search.podcasts.browser.a.d
            r4.<init>(r1)
            com.google.common.util.concurrent.cx r2 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228947e(r2, r3, r4)
            com.google.common.util.concurrent.cx[] r3 = new com.google.common.util.concurrent.C60870cx[r7]
            r3[r6] = r2
            com.google.apps.tiktok.tracing.contrib.b.j r2 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r3)
            com.google.android.apps.search.podcasts.browser.a.c r3 = new com.google.android.apps.search.podcasts.browser.a.c
            r3.<init>(r1)
            java.util.concurrent.Executor r1 = r1.f380852h
            com.google.common.util.concurrent.cx r1 = r2.mo51521b(r3, r1)
            goto L_0x0268
        L_0x0114:
            java.lang.String r3 = "media_id_home"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0210
            com.google.android.apps.search.podcasts.n.s r2 = r1.f380846b
            com.google.common.util.concurrent.cx r2 = r2.mo115832e()
            java.util.concurrent.Executor r3 = r1.f380852h
            com.google.android.apps.search.podcasts.browser.a.h r4 = new com.google.android.apps.search.podcasts.browser.a.h
            r4.<init>(r1)
            com.google.common.util.concurrent.cx r2 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228947e(r2, r3, r4)
            com.google.common.util.concurrent.cx[] r3 = new com.google.common.util.concurrent.C60870cx[r7]
            r3[r6] = r2
            com.google.apps.tiktok.tracing.contrib.b.j r2 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r3)
            com.google.android.apps.search.podcasts.browser.a.g r3 = new com.google.android.apps.search.podcasts.browser.a.g
            r3.<init>(r1)
            java.util.concurrent.Executor r1 = r1.f380852h
            com.google.common.util.concurrent.cx r1 = r2.mo51521b(r3, r1)
            goto L_0x0268
        L_0x0142:
            java.lang.String r3 = "podcast_browser_media_root_id"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0210
            android.support.v4.media.MediaBrowserCompat$MediaItem r2 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            android.content.Context r3 = r1.f380845a
            r8 = 2132091415(0x7f152217, float:1.9823198E38)
            java.lang.String r11 = r3.getString(r8)
            r3 = 2131234227(0x7f080db3, float:1.8084614E38)
            android.net.Uri r15 = r1.mo115483a(r3)
            android.support.v4.media.MediaDescriptionCompat r3 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r10 = "media_id_home"
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r2.<init>(r3, r7)
            android.support.v4.media.MediaBrowserCompat$MediaItem r3 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            android.content.Context r8 = r1.f380845a
            r9 = 2132091398(0x7f152206, float:1.9823163E38)
            java.lang.String r12 = r8.getString(r9)
            r8 = 2131234416(0x7f080e70, float:1.8084997E38)
            android.net.Uri r16 = r1.mo115483a(r8)
            android.support.v4.media.MediaDescriptionCompat r8 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r11 = "media_id_explore"
            r15 = 0
            r18 = 0
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r3.<init>(r8, r7)
            android.support.v4.media.MediaBrowserCompat$MediaItem r8 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            android.content.Context r9 = r1.f380845a
            r10 = 2132091430(0x7f152226, float:1.9823228E38)
            java.lang.String r13 = r9.getString(r10)
            r9 = 2131234514(0x7f080ed2, float:1.8085196E38)
            android.net.Uri r17 = r1.mo115483a(r9)
            android.support.v4.media.MediaDescriptionCompat r1 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r12 = "media_id_library"
            r16 = 0
            r19 = 0
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r8.<init>(r1, r7)
            android.support.v4.media.MediaBrowserCompat$MediaItem[] r1 = new android.support.p031v4.media.MediaBrowserCompat.MediaItem[r5]
            r1[r6] = r2
            r1[r7] = r3
            r1[r4] = r8
            java.util.List r1 = p5462h.p5463a.C69540x.m100947e(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0268
        L_0x01c1:
            java.lang.String r3 = "media_id_downloads"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0210
            com.google.android.apps.search.podcasts.n.a r2 = r1.f380850f
            com.google.common.util.concurrent.cx r2 = r2.mo115814a()
            java.util.concurrent.Executor r3 = r1.f380852h
            com.google.android.apps.search.podcasts.browser.a.a r4 = new com.google.android.apps.search.podcasts.browser.a.a
            r4.<init>(r1)
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228946d(r2, r3, r4)
            goto L_0x0268
        L_0x01dc:
            java.lang.String r3 = "media_id_queue"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0210
            com.google.android.apps.search.podcasts.n.ah r2 = r1.f380847c
            com.google.common.util.concurrent.cx r2 = r2.mo115816a()
            java.util.concurrent.Executor r3 = r1.f380852h
            com.google.android.apps.search.podcasts.browser.a.i r4 = new com.google.android.apps.search.podcasts.browser.a.i
            r4.<init>(r1)
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228946d(r2, r3, r4)
            goto L_0x0268
        L_0x01f6:
            java.lang.String r3 = "media_id_history"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0210
            com.google.android.apps.search.podcasts.n.z r2 = r1.f380851g
            com.google.common.util.concurrent.cx r2 = r2.mo115834a(r7)
            java.util.concurrent.Executor r3 = r1.f380852h
            com.google.android.apps.search.podcasts.browser.a.e r4 = new com.google.android.apps.search.podcasts.browser.a.e
            r4.<init>(r1)
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228946d(r2, r3, r4)
            goto L_0x0268
        L_0x0210:
            java.lang.String r3 = "mediaId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            java.lang.String r4 = "show:"
            boolean r5 = p5462h.p5483m.C69764m.m101234m(r2, r4)
            if (r5 == 0) goto L_0x0262
            java.lang.String r5 = "showMediaId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            com.google.android.apps.search.podcasts.n.an r5 = r1.f380849e
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            boolean r3 = p5462h.p5483m.C69764m.m101234m(r2, r4)
            if (r3 == 0) goto L_0x0252
            r3 = 5
            java.lang.String r2 = r2.substring(r3)
            java.lang.String r3 = "this as java.lang.String).substring(startIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            java.lang.String r2 = com.google.android.apps.search.podcasts.player.p10597d.C140786b.m228596a(r2)
            com.google.android.apps.search.podcasts.n.a.c r3 = com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c.f382022c
            java.lang.String r4 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.common.util.concurrent.cx r2 = r5.mo115818a(r2, r3)
            java.util.concurrent.Executor r3 = r1.f380852h
            com.google.android.apps.search.podcasts.browser.a.j r4 = new com.google.android.apps.search.podcasts.browser.a.j
            r4.<init>(r1)
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228946d(r2, r3, r4)
            goto L_0x0268
        L_0x0252:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = " has invalid show media id prefix"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L_0x0262:
            h.a.am r1 = p5462h.p5463a.C69496am.f185918a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x0268:
            com.google.android.apps.search.podcasts.browser.a.s r2 = com.google.android.apps.search.podcasts.browser.p10558a.C140183s.f380874a
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228948f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.browser.p10558a.C140184t.mo5761a(java.lang.Object):java.lang.Object");
    }
}
