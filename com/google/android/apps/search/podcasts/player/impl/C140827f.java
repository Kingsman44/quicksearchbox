package com.google.android.apps.search.podcasts.player.impl;

import android.graphics.Bitmap;
import androidx.media3.common.C2646bh;
import androidx.media3.p174ui.C3647k;
import androidx.media3.p174ui.C3649m;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.f */
/* compiled from: PG */
public final class C140827f implements C3649m {

    /* renamed from: a */
    final /* synthetic */ C140806an f382451a;

    public C140827f(C140806an anVar) {
        this.f382451a = anVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r2 != null) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.PendingIntent mo7691a(androidx.media3.common.C2646bh r5) {
        /*
            r4 = this;
            java.lang.String r0 = "player"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            com.google.android.apps.search.podcasts.player.impl.an r5 = r4.f382451a
            android.content.Context r5 = r5.f382364b
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            com.google.android.apps.search.podcasts.player.impl.an r1 = r4.f382451a
            android.content.Context r1 = r1.f382364b
            java.lang.String r2 = "com.google.android.apps.search.podcasts.deeplink.PodcastsDeeplink"
            android.content.Intent r0 = r0.setClassName(r1, r2)
            com.google.bm.c.b r1 = com.google.p4225bm.p4229c.C56113b.NOTIFICATION
            com.google.android.apps.search.podcasts.player.impl.an r2 = r4.f382451a
            com.google.android.apps.search.podcasts.m.a.b r2 = r2.f382388z
            if (r2 == 0) goto L_0x002e
            com.google.android.apps.search.podcasts.m.b.b r2 = r2.f381974a
            if (r2 != 0) goto L_0x0028
            com.google.android.apps.search.podcasts.m.b.b r2 = com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b.f381993r
        L_0x0028:
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = r2.f381995a
            if (r2 != 0) goto L_0x0030
        L_0x002e:
            java.lang.String r2 = ""
        L_0x0030:
            com.google.android.apps.search.podcasts.player.impl.an r3 = r4.f382451a
            com.google.android.apps.search.podcasts.m.a.b r3 = r3.f382388z
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.f381975b
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            android.net.Uri r1 = com.google.android.apps.search.podcasts.p10601r.p10607e.C140977a.m228932a(r1, r2, r3)
            android.content.Intent r0 = r0.setData(r1)
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            r2 = 0
            android.content.Intent r0 = com.google.android.libraries.p11029ao.p11030a.C147798a.m240896b(r0, r1, r2)
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r5, r2, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.player.impl.C140827f.mo7691a(androidx.media3.common.bh):android.app.PendingIntent");
    }

    /* renamed from: b */
    public final Bitmap mo7692b(C2646bh bhVar, C3647k kVar) {
        C69664n.m101061g(bhVar, "player");
        C140806an anVar = this.f382451a;
        C140822bc bcVar = anVar.f382387y;
        if (bcVar == null) {
            return null;
        }
        String u = anVar.mo115916u();
        Bitmap a = bcVar.mo115928a(u);
        if (a != null || u == null) {
            return a;
        }
        bcVar.mo115929b(u);
        bcVar.f382441e = kVar;
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ CharSequence mo7693c(C2646bh bhVar) {
        C69664n.m101061g(bhVar, "player");
        C140641b bVar = this.f382451a.f382388z;
        if (bVar == null) {
            return null;
        }
        C140646b bVar2 = bVar.f381974a;
        if (bVar2 == null) {
            bVar2 = C140646b.f381993r;
        }
        if (bVar2 != null) {
            return bVar2.f381997c;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.f381976c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.CharSequence mo7694d(androidx.media3.common.C2646bh r2) {
        /*
            r1 = this;
            java.lang.String r0 = "player"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r0)
            com.google.android.apps.search.podcasts.player.impl.an r2 = r1.f382451a
            com.google.android.apps.search.podcasts.m.a.b r2 = r2.f382388z
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = r2.f381976c
            if (r2 != 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            return r2
        L_0x0011:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.player.impl.C140827f.mo7694d(androidx.media3.common.bh):java.lang.CharSequence");
    }

    /* renamed from: e */
    public final /* synthetic */ CharSequence mo7695e() {
        return null;
    }
}
