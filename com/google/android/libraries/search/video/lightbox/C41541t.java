package com.google.android.libraries.search.video.lightbox;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.search.video.p3191a.C41451j;
import com.google.android.libraries.search.video.p3191a.C41452k;
import com.google.android.libraries.search.video.p3193c.C41471a;
import com.google.android.libraries.search.video.p3194d.C41491b;
import com.google.android.libraries.search.video.p3195e.C41504c;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.libraries.search.video.lightbox.t */
/* compiled from: PG */
public final class C41541t implements C41540s {

    /* renamed from: a */
    final C41451j f108571a;

    /* renamed from: b */
    private final Fragment f108572b;

    /* renamed from: c */
    private final AccountId f108573c;

    /* renamed from: d */
    private final C41471a f108574d;

    /* renamed from: e */
    private final C41452k f108575e;

    /* renamed from: f */
    private final C41504c f108576f;

    /* renamed from: g */
    private final C41491b f108577g;

    public C41541t(Fragment fragment, AccountId accountId, C41471a aVar, C41504c cVar, C41452k kVar, C41451j jVar, C41491b bVar) {
        this.f108572b = fragment;
        this.f108573c = accountId;
        this.f108574d = aVar;
        this.f108576f = cVar;
        this.f108575e = kVar;
        this.f108577g = bVar;
        this.f108571a = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0136  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44063a(com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57177h r9, p3186j$.util.Optional r10) {
        /*
            r8 = this;
            int r0 = r9.f152647a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0146
            com.google.android.libraries.search.video.c.a r0 = r8.f108574d
            com.google.bv.e.b.b.c.a.y r2 = r9.f152648b
            if (r2 != 0) goto L_0x000e
            com.google.bv.e.b.b.c.a.y r2 = com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y.f152692i
        L_0x000e:
            boolean r0 = r0.mo43992b(r2)
            if (r0 == 0) goto L_0x0146
            java.util.UUID r0 = java.util.UUID.randomUUID()
            com.google.android.libraries.search.video.a.j r2 = r8.f108571a
            com.google.android.libraries.search.video.a.k r3 = r8.f108575e
            com.google.android.libraries.search.video.a.i r3 = r3.mo43981a()
            java.util.Map r2 = r2.f108262a
            r2.put(r0, r3)
            com.google.android.libraries.search.video.e.c r2 = r8.f108576f
            boolean r3 = r10.isPresent()
            if (r3 == 0) goto L_0x006e
            java.util.Map r3 = r2.f108431a
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0037:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r3.next()
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r5 = r10.get()
            android.view.View r5 = (android.view.View) r5
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L_0x0050
            goto L_0x0061
        L_0x0050:
            android.view.ViewParent r6 = r4.getParent()
        L_0x0054:
            if (r6 == 0) goto L_0x0037
            boolean r7 = r6.equals(r5)
            if (r7 != 0) goto L_0x0061
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0054
        L_0x0061:
            java.util.Map r10 = r2.f108431a
            java.lang.Object r10 = r10.get(r4)
            com.google.android.libraries.search.video.e.b r10 = (com.google.android.libraries.search.video.p3195e.C41503b) r10
            com.google.android.libraries.search.video.e.e r10 = r10.mo43990s()
            goto L_0x007c
        L_0x006e:
            j$.util.Optional r10 = p3186j$.util.Optional.empty()
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.android.libraries.search.video.e.a r3 = new com.google.android.libraries.search.video.e.a
            r3.<init>(r10, r2)
            r10 = r3
        L_0x007c:
            android.content.Intent r2 = new android.content.Intent
            android.support.v4.app.Fragment r3 = r8.f108572b
            android.content.Context r3 = r3.getContext()
            java.lang.Class<com.google.android.libraries.search.video.lightbox.VideoLightboxActivity> r4 = com.google.android.libraries.search.video.lightbox.VideoLightboxActivity.class
            r2.<init>(r3, r4)
            com.google.apps.tiktok.account.AccountId r3 = r8.f108573c
            com.google.apps.tiktok.account.api.controller.C45963aa.m82131a(r2, r3)
            j$.util.Optional r10 = r10.mo44027b()
            boolean r3 = r10.isPresent()
            if (r3 == 0) goto L_0x00e0
            com.google.protobuf.bn r3 = r9.toBuilder()
            com.google.bv.e.b.b.c.a.g r3 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57176g) r3
            com.google.bv.e.b.b.c.a.y r9 = r9.f152648b
            if (r9 != 0) goto L_0x00a4
            com.google.bv.e.b.b.c.a.y r9 = com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y.f152692i
        L_0x00a4:
            com.google.protobuf.bn r9 = r9.toBuilder()
            com.google.bv.e.b.b.c.a.m r9 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57182m) r9
            java.lang.Object r10 = r10.get()
            j$.time.Duration r10 = (p3186j$.time.Duration) r10
            long r4 = r10.toMillis()
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.bv.e.b.b.c.a.y r10 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y) r10
            int r6 = r10.f152694a
            r6 = r6 | 32
            r10.f152694a = r6
            r10.f152698e = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.bv.e.b.b.c.a.h r10 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57177h) r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.bv.e.b.b.c.a.y r9 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y) r9
            r9.getClass()
            r10.f152648b = r9
            int r9 = r10.f152647a
            r9 = r9 | r1
            r10.f152647a = r9
            com.google.protobuf.bv r9 = r3.build()
            com.google.bv.e.b.b.c.a.h r9 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57177h) r9
        L_0x00e0:
            r10 = 75497472(0x4800000, float:3.0092655E-36)
            r2.addFlags(r10)
            com.google.protos.j.a.a.b.a.b.a.b r10 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5119b.p5120a.C65584b.f178257d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.protos.j.a.a.b.a.b.a.a r10 = (com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5119b.p5120a.C65583a) r10
            java.lang.String r0 = r0.toString()
            r10.copyOnWrite()
            com.google.protobuf.bv r3 = r10.instance
            com.google.protos.j.a.a.b.a.b.a.b r3 = (com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5119b.p5120a.C65584b) r3
            r0.getClass()
            int r4 = r3.f178259a
            r4 = r4 | 2
            r3.f178259a = r4
            r3.f178261c = r0
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.protos.j.a.a.b.a.b.a.b r0 = (com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5119b.p5120a.C65584b) r0
            r9.getClass()
            r0.f178260b = r9
            int r3 = r0.f178259a
            r3 = r3 | r1
            r0.f178259a = r3
            java.lang.String r0 = "lightbox_fragment_args_proto"
            com.google.protobuf.bv r10 = r10.build()
            com.google.protobuf.contrib.android.ProtoParsers.m95531n(r2, r0, r10)
            android.support.v4.app.Fragment r10 = r8.f108572b
            com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i.m84861a(r10, r2)
            com.google.bv.e.b.b.b.b r10 = r9.f152656j
            if (r10 != 0) goto L_0x0128
            com.google.bv.e.b.b.b.b r10 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b.f152527m
        L_0x0128:
            com.google.bv.e.b.b.b.f r10 = r10.f152540k
            if (r10 != 0) goto L_0x012e
            com.google.bv.e.b.b.b.f r10 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57149f.f152565f
        L_0x012e:
            java.lang.String r10 = r10.f152567a
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0145
            com.google.android.libraries.search.video.d.b r10 = r8.f108577g
            com.google.bv.e.b.b.b.b r9 = r9.f152656j
            if (r9 != 0) goto L_0x013e
            com.google.bv.e.b.b.b.b r9 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b.f152527m
        L_0x013e:
            com.google.android.libraries.search.video.d.a r9 = r10.mo44012a(r9)
            r9.mo44011a()
        L_0x0145:
            return r1
        L_0x0146:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.video.lightbox.C41541t.mo44063a(com.google.bv.e.b.b.c.a.h, j$.util.Optional):boolean");
    }
}
