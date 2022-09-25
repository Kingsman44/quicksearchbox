package androidx.media3.exoplayer.p145h.p146a;

/* renamed from: androidx.media3.exoplayer.h.a.b */
/* compiled from: PG */
public final /* synthetic */ class C3007b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3016k f8713a;

    /* renamed from: b */
    public final /* synthetic */ C3015j f8714b;

    public /* synthetic */ C3007b(C3016k kVar, C3015j jVar) {
        this.f8713a = kVar;
        this.f8714b = jVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.media3.exoplayer.d.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            androidx.media3.exoplayer.h.a.k r0 = r11.f8713a
            androidx.media3.exoplayer.h.a.j r1 = r11.f8714b
            androidx.media3.exoplayer.h.a.a r2 = r0.f8735a
            androidx.media3.b.n r6 = r0.f8736b
            java.lang.Object r9 = r0.f8737c
            com.google.android.libraries.search.video.thirdparty.c r3 = r0.f8742h
            androidx.media3.exoplayer.d.g r2 = (androidx.media3.exoplayer.p140d.C2905g) r2
            boolean r4 = r2.f8256f
            java.lang.String r5 = "Set player using adsLoader.setPlayer before preparing the player."
            androidx.media3.common.p136b.C2601a.m6833e(r4, r5)
            java.util.HashMap r4 = r2.f8255e
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x002b
            androidx.media3.common.bh r4 = r2.f8257g
            r2.f8259i = r4
            androidx.media3.common.bh r4 = r2.f8259i
            if (r4 != 0) goto L_0x0026
            return
        L_0x0026:
            androidx.media3.exoplayer.d.f r5 = r2.f8253c
            r4.mo6016w(r5)
        L_0x002b:
            java.util.HashMap r4 = r2.f8254d
            java.lang.Object r4 = r4.get(r9)
            androidx.media3.exoplayer.d.e r4 = (androidx.media3.exoplayer.p140d.C2903e) r4
            if (r4 != 0) goto L_0x0058
            android.view.ViewGroup r8 = r3.f108754a
            java.util.HashMap r3 = r2.f8254d
            boolean r3 = r3.containsKey(r9)
            if (r3 != 0) goto L_0x004f
            androidx.media3.exoplayer.d.e r10 = new androidx.media3.exoplayer.d.e
            android.content.Context r4 = r2.f8252b
            java.util.List r5 = r2.f8258h
            r3 = r10
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.HashMap r3 = r2.f8254d
            r3.put(r9, r10)
        L_0x004f:
            java.util.HashMap r3 = r2.f8254d
            java.lang.Object r3 = r3.get(r9)
            r4 = r3
            androidx.media3.exoplayer.d.e r4 = (androidx.media3.exoplayer.p140d.C2903e) r4
        L_0x0058:
            java.util.HashMap r3 = r2.f8255e
            r4.getClass()
            r3.put(r0, r4)
            java.util.List r0 = r4.f8227d
            boolean r0 = r0.isEmpty()
            java.util.List r3 = r4.f8227d
            r3.add(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007f
            androidx.media3.common.c r0 = androidx.media3.common.C2659c.f7412a
            androidx.media3.common.c r3 = r4.f8241r
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00de
            androidx.media3.common.c r0 = r4.f8241r
            r1.mo6961b(r0)
            goto L_0x00de
        L_0x007f:
            r0 = 0
            r4.f8236m = r0
            com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate r3 = com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate.VIDEO_TIME_NOT_READY
            r4.f8235l = r3
            r4.f8234k = r3
            r4.mo6735P()
            androidx.media3.common.c r3 = androidx.media3.common.C2659c.f7412a
            androidx.media3.common.c r5 = r4.f8241r
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x009b
            androidx.media3.common.c r3 = r4.f8241r
            r1.mo6961b(r3)
            goto L_0x00b3
        L_0x009b:
            com.google.ads.interactivemedia.v3.api.AdsManager r1 = r4.f8237n
            if (r1 == 0) goto L_0x00b3
            androidx.media3.common.c r3 = new androidx.media3.common.c
            java.lang.Object r5 = r4.f8224a
            java.util.List r1 = r1.getAdCuePoints()
            long[] r1 = androidx.media3.exoplayer.p140d.C2907i.m8180a(r1)
            r3.<init>(r5, r1)
            r4.f8241r = r3
            r4.mo6737R()
        L_0x00b3:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.b.sm r0 = r1.listIterator(r0)
        L_0x00bb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00de
            java.lang.Object r1 = r0.next()
            androidx.media3.common.a r1 = (androidx.media3.common.C2564a) r1
            com.google.ads.interactivemedia.v3.api.AdDisplayContainer r3 = r4.f8230g
            android.view.View r5 = r1.f7061a
            int r5 = r1.f7062b
            com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose r5 = com.google.ads.interactivemedia.p367v3.api.FriendlyObstructionPurpose.OTHER
            java.lang.String r1 = r1.f7063c
            com.google.ads.interactivemedia.v3.api.ImaSdkFactory r1 = com.google.ads.interactivemedia.p367v3.api.ImaSdkFactory.getInstance()
            r6 = 0
            com.google.ads.interactivemedia.v3.api.FriendlyObstruction r1 = r1.createFriendlyObstruction(r6, r5, r6)
            r3.registerFriendlyObstruction(r1)
            goto L_0x00bb
        L_0x00de:
            r2.mo6741b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.p146a.C3007b.run():void");
    }
}
