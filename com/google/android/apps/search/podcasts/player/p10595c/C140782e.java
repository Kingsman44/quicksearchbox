package com.google.android.apps.search.podcasts.player.p10595c;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.C2585al;
import androidx.media3.common.C2650bl;
import androidx.media3.exoplayer.p137a.C2711b;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.podcasts.player.c.e */
/* compiled from: PG */
final class C140782e extends C146579j {

    /* renamed from: b */
    private final boolean f382270b;

    public C140782e(boolean z) {
        this.f382270b = z;
    }

    /* renamed from: u */
    private static String m228592u(String str) {
        return Uri.encode(Base64.encodeToString(str.getBytes(), 11));
    }

    /* renamed from: a */
    public final void mo95067a(C2711b bVar) {
        String str;
        this.f395862a.mo123373c("cat", Uri.encode("PODCAST", ",:"));
        C2585al alVar = bVar.f7528b.mo6024e(bVar.f7529c, new C2650bl(), 0).f7338c.f7155d;
        alVar.getClass();
        Object obj = alVar.f7138h;
        if (obj instanceof C140641b) {
            C140641b bVar2 = (C140641b) obj;
            C146580k kVar = this.f395862a;
            String encode = Uri.encode("feed_url");
            C140646b bVar3 = bVar2.f381974a;
            if (bVar3 == null) {
                bVar3 = C140646b.f381993r;
            }
            String u = m228592u(bVar3.f381995a);
            kVar.mo123373c("ctmp", encode + ":" + u);
            C146580k kVar2 = this.f395862a;
            String encode2 = Uri.encode("episode_guid");
            String u2 = m228592u(bVar2.f381975b);
            kVar2.mo123373c("ctmp", encode2 + ":" + u2);
            this.f395862a.mo123373c("ctmp", String.valueOf(Uri.encode("is_tng")).concat(":1"));
            C146580k kVar3 = this.f395862a;
            String encode3 = Uri.encode("is_beta");
            String encode4 = Uri.encode(true != this.f382270b ? "0" : "1");
            kVar3.mo123373c("ctmp", encode3 + ":" + encode4);
            C146580k kVar4 = this.f395862a;
            String encode5 = Uri.encode("download_type");
            C97914d dVar = bVar2.f381987n;
            if (dVar == null) {
                dVar = C97914d.f273393j;
            }
            C97913c a = C97913c.m162190a(dVar.f273396b);
            if (a == null) {
                a = C97913c.UNKNOWN;
            }
            if (a != C97913c.DOWNLOADED) {
                str = C59002s.f156871a;
            } else {
                C97914d dVar2 = bVar2.f381987n;
                if (dVar2 == null) {
                    dVar2 = C97914d.f273393j;
                }
                C97918h hVar = dVar2.f273397c;
                if (hVar == null) {
                    hVar = C97918h.f273412m;
                }
                str = hVar.f273424k ? "a" : "m";
            }
            String encode6 = Uri.encode(str);
            kVar4.mo123373c("ctmp", encode5 + ":" + encode6);
            C146580k kVar5 = this.f395862a;
            String encode7 = Uri.encode("publication_time_millis");
            long millis = Duration.ofSeconds(bVar2.f381980g).toMillis();
            kVar5.mo123373c("ctmp", encode7 + ":" + millis);
            C146580k kVar6 = this.f395862a;
            String encode8 = Uri.encode("start_download_time_millis");
            C97914d dVar3 = bVar2.f381987n;
            if (dVar3 == null) {
                dVar3 = C97914d.f273393j;
            }
            long j = dVar3.f273403i;
            kVar6.mo123373c("ctmp", encode8 + ":" + j);
            C146580k kVar7 = this.f395862a;
            String encode9 = Uri.encode("end_download_time_millis");
            C97914d dVar4 = bVar2.f381987n;
            if (dVar4 == null) {
                dVar4 = C97914d.f273393j;
            }
            long j2 = dVar4.f273402h;
            kVar7.mo123373c("ctmp", encode9 + ":" + j2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        r0 = r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95068b(androidx.media3.exoplayer.p137a.C2711b r6, androidx.media3.common.C2657bs r7, boolean r8) {
        /*
            r5 = this;
            if (r8 == 0) goto L_0x0095
            com.google.common.b.gu r6 = r7.f7407b
            int r7 = r6.size()
            r8 = 0
            r0 = 0
        L_0x000a:
            if (r0 >= r7) goto L_0x0095
            java.lang.Object r1 = r6.get(r0)
            androidx.media3.common.br r1 = (androidx.media3.common.C2656br) r1
            r2 = 0
        L_0x0013:
            int r3 = r0 + 1
            int r4 = r1.f7401a
            if (r2 >= r4) goto L_0x0092
            boolean[] r3 = r1.f7403c
            boolean r3 = r3[r2]
            if (r3 == 0) goto L_0x008f
            androidx.media3.common.bn r6 = r1.f7402b
            androidx.media3.common.x[] r6 = r6.f7357d
            r6 = r6[r2]
            java.lang.String r7 = r6.f7496n
            java.lang.String r8 = ",:"
            java.lang.String r0 = "ctmp"
            if (r7 == 0) goto L_0x003c
            com.google.android.h.a.b.k r1 = r5.f395862a
            java.lang.String r2 = "mime:"
            java.lang.String r7 = r2.concat(r7)
            java.lang.String r7 = android.net.Uri.encode(r7, r8)
            r1.mo123373c(r0, r7)
        L_0x003c:
            int r7 = r6.f7492j
            r1 = -1
            if (r7 == r1) goto L_0x0058
            com.google.android.h.a.b.k r2 = r5.f395862a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "bitrate:"
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            java.lang.String r7 = android.net.Uri.encode(r7, r8)
            r2.mo123373c(r0, r7)
        L_0x0058:
            int r7 = r6.f7477A
            if (r7 == r1) goto L_0x0073
            com.google.android.h.a.b.k r2 = r5.f395862a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "channel:"
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            java.lang.String r7 = android.net.Uri.encode(r7, r8)
            r2.mo123373c(r0, r7)
        L_0x0073:
            int r6 = r6.f7478B
            if (r6 == r1) goto L_0x008e
            com.google.android.h.a.b.k r7 = r5.f395862a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "rate:"
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r6 = android.net.Uri.encode(r6, r8)
            r7.mo123373c(r0, r6)
        L_0x008e:
            return
        L_0x008f:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0092:
            r0 = r3
            goto L_0x000a
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.player.p10595c.C140782e.mo95068b(androidx.media3.exoplayer.a.b, androidx.media3.common.bs, boolean):void");
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("ctmp");
    }
}
