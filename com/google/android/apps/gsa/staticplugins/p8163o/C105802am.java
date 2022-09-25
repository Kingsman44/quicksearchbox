package com.google.android.apps.gsa.staticplugins.p8163o;

import android.net.Uri;
import androidx.media3.exoplayer.p137a.C2711b;
import com.google.android.p10890h.p10891a.p10893b.C146579j;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.am */
/* compiled from: PG */
final class C105802am extends C146579j {

    /* renamed from: b */
    private final String f295160b;

    public C105802am(String str) {
        this.f295160b = str;
    }

    /* renamed from: a */
    public final void mo95067a(C2711b bVar) {
        String str = this.f295160b;
        if (str != null) {
            this.f395862a.mo123373c("cat", Uri.encode(str, ",:"));
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8163o.C105802am.mo95068b(androidx.media3.exoplayer.a.b, androidx.media3.common.bs, boolean):void");
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("ctmp");
    }
}
