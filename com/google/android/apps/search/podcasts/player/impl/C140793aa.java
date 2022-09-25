package com.google.android.apps.search.podcasts.player.impl;

import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.player.C140784d;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.aa */
/* compiled from: PG */
final class C140793aa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382301a;

    /* renamed from: b */
    final /* synthetic */ C140641b f382302b;

    /* renamed from: c */
    final /* synthetic */ boolean f382303c;

    /* renamed from: d */
    final /* synthetic */ C140509u f382304d;

    /* renamed from: e */
    final /* synthetic */ C140784d f382305e;

    /* renamed from: f */
    final /* synthetic */ long f382306f;

    public C140793aa(C140806an anVar, C140641b bVar, boolean z, C140509u uVar, C140784d dVar, long j) {
        this.f382301a = anVar;
        this.f382302b = bVar;
        this.f382303c = z;
        this.f382304d = uVar;
        this.f382305e = dVar;
        this.f382306f = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.google.android.apps.search.podcasts.player.impl.an r0 = r11.f382301a
            com.google.android.apps.search.podcasts.m.a.b r0 = r0.f382388z
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0012
            com.google.android.apps.search.podcasts.m.a.b r3 = r11.f382302b
            boolean r0 = com.google.android.apps.search.podcasts.p10601r.C140976e.m228931d(r0, r3)
            if (r0 != r2) goto L_0x0012
            r0 = 0
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            boolean r3 = r11.f382303c
            if (r3 != 0) goto L_0x0019
            if (r0 == 0) goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.podcasts.player.impl.an r4 = r11.f382301a
            r4.mo115913C(r3)
        L_0x001e:
            com.google.android.apps.search.podcasts.player.impl.an r3 = r11.f382301a
            com.google.android.apps.search.podcasts.j.b r4 = r3.f382339N
            if (r4 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0065
        L_0x0026:
            androidx.media3.common.bh r3 = r3.f382385w
            if (r3 == 0) goto L_0x0034
            if (r4 == 0) goto L_0x0034
            r5 = 3
            long r6 = r3.mo6004k()
            r4.mo115659a(r5, r6)
        L_0x0034:
            com.google.android.apps.search.podcasts.player.impl.an r3 = r11.f382301a
            com.google.android.apps.search.podcasts.j.c r4 = r3.f382378p
            com.google.android.apps.search.podcasts.m.a.b r5 = r11.f382302b
            com.google.android.apps.search.podcasts.j.b r6 = new com.google.android.apps.search.podcasts.j.b
            g.a.a r7 = r4.f381430a
            java.lang.Object r7 = r7.mo17428b()
            com.google.android.libraries.search.logging.a.q r7 = (com.google.android.libraries.search.logging.p3034a.C38768q) r7
            r7.getClass()
            g.a.a r8 = r4.f381431b
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.f.a r8 = (com.google.android.libraries.p1730f.C21370a) r8
            r8.getClass()
            g.a.a r4 = r4.f381432c
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.apps.search.podcasts.p.o r4 = (com.google.android.apps.search.podcasts.p10591p.C140749o) r4
            r4.getClass()
            r5.getClass()
            r6.<init>(r7, r8, r4, r5)
            r3.f382339N = r6
        L_0x0065:
            com.google.android.apps.search.podcasts.player.impl.an r3 = r11.f382301a
            com.google.android.apps.search.podcasts.l.u r4 = r11.f382304d
            r3.f382327B = r4
            r3.f382326A = r1
            com.google.android.apps.search.podcasts.m.a.b r1 = r11.f382302b
            r3.f382388z = r1
            com.google.android.apps.search.podcasts.player.d r1 = r11.f382305e
            r3.f382328C = r1
            androidx.media3.common.bh r1 = r3.f382385w
            if (r1 != 0) goto L_0x007c
            r3.mo115912B()
        L_0x007c:
            com.google.android.apps.search.podcasts.player.impl.an r1 = r11.f382301a
            com.google.android.apps.search.podcasts.player.impl.bc r3 = r1.f382387y
            if (r3 == 0) goto L_0x0089
            java.lang.String r1 = r1.mo115916u()
            r3.mo115929b(r1)
        L_0x0089:
            androidx.media3.common.ac r1 = new androidx.media3.common.ac
            r1.<init>()
            com.google.android.apps.search.podcasts.player.impl.an r3 = r11.f382301a
            com.google.android.apps.search.podcasts.m.a.b r4 = r11.f382302b
            boolean r3 = r3.f382329D
            if (r3 != 0) goto L_0x00c9
            com.google.android.apps.gsa.staticplugins.cl.b.d r3 = r4.f381987n
            if (r3 != 0) goto L_0x009c
            com.google.android.apps.gsa.staticplugins.cl.b.d r3 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d.f273393j
        L_0x009c:
            int r3 = r3.f273396b
            com.google.android.apps.gsa.staticplugins.cl.b.c r3 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c.m162190a(r3)
            if (r3 != 0) goto L_0x00a6
            com.google.android.apps.gsa.staticplugins.cl.b.c r3 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c.UNKNOWN
        L_0x00a6:
            com.google.android.apps.gsa.staticplugins.cl.b.c r5 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c.DOWNLOADED
            if (r3 != r5) goto L_0x00c9
            com.google.android.apps.gsa.staticplugins.cl.b.d r3 = r4.f381987n
            if (r3 != 0) goto L_0x00b0
            com.google.android.apps.gsa.staticplugins.cl.b.d r3 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d.f273393j
        L_0x00b0:
            java.lang.String r3 = r3.f273400f
            java.lang.String r5 = "episode.downloadEpisode.fileUri"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00c9
            com.google.android.apps.gsa.staticplugins.cl.b.d r3 = r4.f381987n
            if (r3 != 0) goto L_0x00c3
            com.google.android.apps.gsa.staticplugins.cl.b.d r3 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d.f273393j
        L_0x00c3:
            java.lang.String r3 = r3.f273400f
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            goto L_0x00d0
        L_0x00c9:
            java.lang.String r3 = r4.f381978e
            java.lang.String r4 = "episode.mediaUrl"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
        L_0x00d0:
            r1.mo6083b(r3)
            com.google.android.apps.search.podcasts.m.a.b r3 = r11.f382302b
            r1.f7107e = r3
            androidx.media3.common.aq r1 = r1.mo6082a()
            com.google.android.apps.search.podcasts.player.impl.an r3 = r11.f382301a
            androidx.media3.common.bh r4 = r3.f382385w
            if (r4 == 0) goto L_0x013c
            com.google.android.apps.search.podcasts.player.d r5 = r11.f382305e
            long r6 = r11.f382306f
            float r8 = r5.f382275a
            r4.mo6269ao(r8)
            androidx.media3.common.bh r8 = r3.f382385w
            boolean r9 = r8 instanceof androidx.media3.exoplayer.C2759ad
            r10 = 0
            if (r9 == 0) goto L_0x00f4
            androidx.media3.exoplayer.ad r8 = (androidx.media3.exoplayer.C2759ad) r8
            goto L_0x00f5
        L_0x00f4:
            r8 = r10
        L_0x00f5:
            if (r8 == 0) goto L_0x00fb
            androidx.media3.exoplayer.p r10 = r8.mo6461L()
        L_0x00fb:
            if (r10 == 0) goto L_0x0102
            boolean r5 = r5.f382276b
            r10.mo6470q(r5)
        L_0x0102:
            boolean r5 = r3.f382334I
            if (r5 != 0) goto L_0x0119
            boolean r5 = r3.mo115915E()
            if (r5 != 0) goto L_0x010e
            if (r0 == 0) goto L_0x0119
        L_0x010e:
            r3.f382334I = r2
            long r2 = r3.f382333H
            long r6 = r6 - r2
            r2 = 0
            long r6 = java.lang.Math.max(r2, r6)
        L_0x0119:
            r4.mo6268an(r1, r6)
            com.google.android.apps.search.podcasts.player.impl.an r0 = r11.f382301a
            com.google.android.apps.search.podcasts.l.au r0 = r0.f382376n
            com.google.android.apps.search.podcasts.m.a.b r1 = r11.f382302b
            com.google.protos.ac.a.j r1 = com.google.android.apps.search.podcasts.p10601r.C140976e.m228929b(r1)
            com.google.android.apps.search.podcasts.player.impl.an r2 = r11.f382301a
            com.google.android.apps.search.podcasts.l.u r2 = r2.f382327B
            r0.mo115693r(r1, r2)
            com.google.android.apps.search.podcasts.player.impl.an r0 = r11.f382301a
            com.google.android.apps.search.podcasts.b.g.ai r0 = r0.f382377o
            com.google.android.apps.search.podcasts.m.a.b r1 = r11.f382302b
            r0.mo115477h(r1)
            com.google.android.apps.search.podcasts.player.impl.an r0 = r11.f382301a
            r0.mo115898t()
            return
        L_0x013c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Player is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.player.impl.C140793aa.run():void");
    }
}
