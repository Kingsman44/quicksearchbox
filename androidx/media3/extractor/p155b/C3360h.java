package androidx.media3.extractor.p155b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: androidx.media3.extractor.b.h */
/* compiled from: PG */
final class C3360h implements C3353a {

    /* renamed from: a */
    public final C58485gu f10167a;

    /* renamed from: b */
    public final int f10168b;

    private C3360h(int i, C58485gu guVar) {
        this.f10168b = i;
        this.f10167a = guVar;
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [androidx.media3.extractor.b.i] */
    /* JADX WARNING: type inference failed for: r6v11, types: [androidx.media3.extractor.b.i] */
    /* JADX WARNING: type inference failed for: r11v8, types: [androidx.media3.extractor.b.e] */
    /* JADX WARNING: type inference failed for: r5v21, types: [androidx.media3.extractor.b.j] */
    /* JADX WARNING: type inference failed for: r5v24, types: [androidx.media3.extractor.b.h] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.extractor.p155b.C3360h m9732c(int r17, androidx.media3.common.p136b.C2604ac r18) {
        /*
            r0 = r18
            com.google.common.b.gp r1 = new com.google.common.b.gp
            r2 = 4
            r1.<init>(r2)
            int r3 = r0.f7236c
            r4 = -2
        L_0x000b:
            int r5 = r0.f7236c
            int r6 = r0.f7235b
            int r5 = r5 - r6
            r6 = 8
            if (r5 <= r6) goto L_0x01e6
            int r5 = r18.mo6135c()
            int r7 = r18.mo6135c()
            int r8 = r0.f7235b
            int r8 = r8 + r7
            r0.mo6158z(r8)
            r7 = 1414744396(0x5453494c, float:3.62987127E12)
            r9 = 2
            r10 = 1
            if (r5 != r7) goto L_0x0033
            int r5 = r18.mo6135c()
            androidx.media3.extractor.b.h r5 = m9732c(r5, r0)
            goto L_0x01a1
        L_0x0033:
            r7 = 0
            switch(r5) {
                case 1718776947: goto L_0x00a8;
                case 1751742049: goto L_0x007e;
                case 1752331379: goto L_0x004c;
                case 1852994675: goto L_0x003a;
                default: goto L_0x0037;
            }
        L_0x0037:
            r5 = r7
            goto L_0x01a1
        L_0x003a:
            androidx.media3.extractor.b.j r5 = new androidx.media3.extractor.b.j
            int r6 = r0.f7236c
            int r7 = r0.f7235b
            int r6 = r6 - r7
            java.nio.charset.Charset r7 = com.google.common.base.C58913w.f156754c
            java.lang.String r6 = r0.mo6151s(r6, r7)
            r5.<init>(r6)
            goto L_0x01a1
        L_0x004c:
            int r12 = r18.mo6135c()
            int r5 = r0.f7235b
            int r5 = r5 + 12
            r0.mo6131A(r5)
            r18.mo6135c()
            int r13 = r18.mo6135c()
            int r14 = r18.mo6135c()
            int r5 = r0.f7235b
            int r5 = r5 + r2
            r0.mo6131A(r5)
            int r15 = r18.mo6135c()
            int r16 = r18.mo6135c()
            int r5 = r0.f7235b
            int r5 = r5 + r6
            r0.mo6131A(r5)
            androidx.media3.extractor.b.f r5 = new androidx.media3.extractor.b.f
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x01a1
        L_0x007e:
            int r5 = r18.mo6135c()
            int r7 = r0.f7235b
            int r7 = r7 + r6
            r0.mo6131A(r7)
            int r6 = r18.mo6135c()
            int r7 = r18.mo6135c()
            int r11 = r0.f7235b
            int r11 = r11 + r2
            r0.mo6131A(r11)
            r18.mo6135c()
            int r11 = r0.f7235b
            int r11 = r11 + 12
            r0.mo6131A(r11)
            androidx.media3.extractor.b.e r11 = new androidx.media3.extractor.b.e
            r11.<init>(r5, r6, r7)
            r5 = r11
            goto L_0x01a1
        L_0x00a8:
            java.lang.String r5 = "StreamFormatChunk"
            if (r4 != r9) goto L_0x0104
            int r6 = r0.f7235b
            int r6 = r6 + r2
            r0.mo6131A(r6)
            int r6 = r18.mo6135c()
            int r11 = r18.mo6135c()
            int r12 = r0.f7235b
            int r12 = r12 + r2
            r0.mo6131A(r12)
            int r12 = r18.mo6135c()
            switch(r12) {
                case 808802372: goto L_0x00d5;
                case 826496577: goto L_0x00d2;
                case 828601953: goto L_0x00d2;
                case 842289229: goto L_0x00cf;
                case 859066445: goto L_0x00cc;
                case 875967048: goto L_0x00d2;
                case 877677894: goto L_0x00d5;
                case 1145656883: goto L_0x00d5;
                case 1145656920: goto L_0x00d5;
                case 1196444237: goto L_0x00c9;
                case 1482049860: goto L_0x00d5;
                case 1684633208: goto L_0x00d5;
                case 1735420525: goto L_0x00c9;
                case 2021026148: goto L_0x00d5;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            r13 = r7
            goto L_0x00d7
        L_0x00c9:
            java.lang.String r13 = "video/mjpeg"
            goto L_0x00d7
        L_0x00cc:
            java.lang.String r13 = "video/mp43"
            goto L_0x00d7
        L_0x00cf:
            java.lang.String r13 = "video/mp42"
            goto L_0x00d7
        L_0x00d2:
            java.lang.String r13 = "video/avc"
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r13 = "video/mp4v-es"
        L_0x00d7:
            if (r13 != 0) goto L_0x00ec
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r11 = "Ignoring track with unsupported compression "
            r6.<init>(r11)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r5, r6)
            goto L_0x0037
        L_0x00ec:
            androidx.media3.common.w r5 = new androidx.media3.common.w
            r5.<init>()
            r5.f7464p = r6
            r5.f7465q = r11
            r5.f7459k = r13
            androidx.media3.extractor.b.i r6 = new androidx.media3.extractor.b.i
            androidx.media3.common.x r7 = new androidx.media3.common.x
            r7.<init>(r5)
            r6.<init>(r7)
            r5 = r6
            goto L_0x01a1
        L_0x0104:
            if (r4 != r10) goto L_0x0192
            int r6 = r18.mo6137e()
            java.lang.String r11 = "audio/mp4a-latm"
            java.lang.String r12 = "audio/raw"
            if (r6 == r10) goto L_0x012d
            r13 = 85
            if (r6 == r13) goto L_0x012a
            r13 = 255(0xff, float:3.57E-43)
            if (r6 == r13) goto L_0x0128
            r13 = 8192(0x2000, float:1.14794E-41)
            if (r6 == r13) goto L_0x0125
            r13 = 8193(0x2001, float:1.1481E-41)
            if (r6 == r13) goto L_0x0122
            r13 = r7
            goto L_0x012e
        L_0x0122:
            java.lang.String r13 = "audio/vnd.dts"
            goto L_0x012e
        L_0x0125:
            java.lang.String r13 = "audio/ac3"
            goto L_0x012e
        L_0x0128:
            r13 = r11
            goto L_0x012e
        L_0x012a:
            java.lang.String r13 = "audio/mpeg"
            goto L_0x012e
        L_0x012d:
            r13 = r12
        L_0x012e:
            if (r13 != 0) goto L_0x0143
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Ignoring track with unsupported format tag "
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r5, r6)
            goto L_0x0037
        L_0x0143:
            int r5 = r18.mo6137e()
            int r6 = r18.mo6135c()
            int r7 = r0.f7235b
            int r7 = r7 + 6
            r0.mo6131A(r7)
            int r7 = r18.mo6142j()
            int r7 = androidx.media3.common.p136b.C2612ak.m6988m(r7)
            int r14 = r18.mo6137e()
            byte[] r15 = new byte[r14]
            r2 = 0
            r0.mo6155w(r15, r2, r14)
            androidx.media3.common.w r2 = new androidx.media3.common.w
            r2.<init>()
            r2.f7459k = r13
            r2.f7472x = r5
            r2.f7473y = r6
            boolean r5 = r12.equals(r13)
            if (r5 == 0) goto L_0x0179
            if (r7 == 0) goto L_0x0179
            r2.f7474z = r7
        L_0x0179:
            boolean r5 = r11.equals(r13)
            if (r5 == 0) goto L_0x0187
            if (r14 <= 0) goto L_0x0187
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r15)
            r2.f7461m = r5
        L_0x0187:
            androidx.media3.extractor.b.i r5 = new androidx.media3.extractor.b.i
            androidx.media3.common.x r6 = new androidx.media3.common.x
            r6.<init>(r2)
            r5.<init>(r6)
            goto L_0x01a1
        L_0x0192:
            java.lang.String r2 = "Ignoring strf box for unsupported track type: "
            java.lang.String r6 = androidx.media3.common.p136b.C2612ak.m6936S(r4)
            java.lang.String r2 = r2.concat(r6)
            androidx.media3.common.p136b.C2633u.m7050e(r5, r2)
            goto L_0x0037
        L_0x01a1:
            if (r5 == 0) goto L_0x01dd
            int r2 = r5.mo7348a()
            r6 = 1752331379(0x68727473, float:4.5798432E24)
            if (r2 != r6) goto L_0x01da
            r2 = r5
            androidx.media3.extractor.b.f r2 = (androidx.media3.extractor.p155b.C3358f) r2
            int r2 = r2.f10150a
            r4 = 1935960438(0x73646976, float:1.809666E31)
            if (r2 == r4) goto L_0x01d9
            r4 = 1935963489(0x73647561, float:1.8100348E31)
            if (r2 == r4) goto L_0x01d7
            r4 = 1937012852(0x73747874, float:1.936895E31)
            if (r2 == r4) goto L_0x01d5
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Found unsupported streamType fourCC: "
            java.lang.String r2 = r4.concat(r2)
            java.lang.String r4 = "AviStreamHeaderChunk"
            androidx.media3.common.p136b.C2633u.m7050e(r4, r2)
            r4 = -1
            goto L_0x01da
        L_0x01d5:
            r4 = 3
            goto L_0x01da
        L_0x01d7:
            r4 = 1
            goto L_0x01da
        L_0x01d9:
            r4 = 2
        L_0x01da:
            r1.mo55395g(r5)
        L_0x01dd:
            r0.mo6131A(r8)
            r0.mo6158z(r3)
            r2 = 4
            goto L_0x000b
        L_0x01e6:
            androidx.media3.extractor.b.h r0 = new androidx.media3.extractor.b.h
            com.google.common.b.gu r1 = r1.mo55394f()
            r2 = r17
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p155b.C3360h.m9732c(int, androidx.media3.common.b.ac):androidx.media3.extractor.b.h");
    }

    /* renamed from: a */
    public final int mo7348a() {
        return this.f10168b;
    }

    /* renamed from: b */
    public final C3353a mo7352b(Class cls) {
        C58485gu guVar = this.f10167a;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            C3353a aVar = (C3353a) guVar.get(i2);
            i2++;
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }
}
