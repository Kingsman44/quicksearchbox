package androidx.media3.exoplayer.p142e;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.exoplayer.e.af */
/* compiled from: PG */
public final class C2970af {

    /* renamed from: a */
    public static final /* synthetic */ int f8527a = 0;

    /* renamed from: b */
    private static final Pattern f8528b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap f8529c = new HashMap();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x039d, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03a1, code lost:
        if (r5 != r0) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03a3, code lost:
        androidx.media3.common.p136b.C2633u.m7050e("MediaCodecUtil", "Unknown AV1 level: " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x05c6, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:?, code lost:
        return new android.util.Pair(java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0150, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02bb A[Catch:{ NumberFormatException -> 0x02cb }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair m8385a(androidx.media3.common.C2680x r19) {
        /*
            r0 = r19
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            java.lang.String r2 = r0.f7493k
            r3 = 0
            if (r2 != 0) goto L_0x000a
            return r3
        L_0x000a:
            java.lang.String r4 = "\\."
            java.lang.String[] r2 = r2.split(r4)
            java.lang.String r4 = "video/dolby-vision"
            java.lang.String r5 = r0.f7496n
            boolean r4 = r4.equals(r5)
            r8 = 512(0x200, float:7.175E-43)
            r9 = 256(0x100, float:3.59E-43)
            r10 = 128(0x80, float:1.794E-43)
            r12 = 64
            r13 = 32
            r6 = 16
            r3 = 8
            r11 = 3
            r14 = 4
            r5 = 2
            java.lang.String r7 = "MediaCodecUtil"
            r15 = 1
            if (r4 == 0) goto L_0x01f0
            java.lang.String r0 = r0.f7493k
            int r1 = r2.length
            if (r1 >= r11) goto L_0x0043
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
        L_0x0040:
            r3 = 0
            goto L_0x01ef
        L_0x0043:
            java.util.regex.Pattern r1 = f8528b
            r4 = r2[r15]
            java.util.regex.Matcher r1 = r1.matcher(r4)
            boolean r4 = r1.matches()
            if (r4 != 0) goto L_0x005f
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x0040
        L_0x005f:
            java.lang.String r0 = r1.group(r15)
            if (r0 != 0) goto L_0x0068
        L_0x0065:
            r1 = 0
            goto L_0x010d
        L_0x0068:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1536: goto L_0x00cd;
                case 1537: goto L_0x00c3;
                case 1538: goto L_0x00b9;
                case 1539: goto L_0x00af;
                case 1540: goto L_0x00a5;
                case 1541: goto L_0x009b;
                case 1542: goto L_0x0091;
                case 1543: goto L_0x0087;
                case 1544: goto L_0x007c;
                case 1545: goto L_0x0071;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x00d7
        L_0x0071:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            r1 = 9
            goto L_0x00d8
        L_0x007c:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            r1 = 8
            goto L_0x00d8
        L_0x0087:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            r1 = 7
            goto L_0x00d8
        L_0x0091:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            r1 = 6
            goto L_0x00d8
        L_0x009b:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            r1 = 5
            goto L_0x00d8
        L_0x00a5:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            r1 = 4
            goto L_0x00d8
        L_0x00af:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            r1 = 3
            goto L_0x00d8
        L_0x00b9:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            r1 = 2
            goto L_0x00d8
        L_0x00c3:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            r1 = 1
            goto L_0x00d8
        L_0x00cd:
            java.lang.String r1 = "00"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            r1 = 0
            goto L_0x00d8
        L_0x00d7:
            r1 = -1
        L_0x00d8:
            switch(r1) {
                case 0: goto L_0x0109;
                case 1: goto L_0x0104;
                case 2: goto L_0x00ff;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00f5;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00eb;
                case 7: goto L_0x00e6;
                case 8: goto L_0x00e1;
                case 9: goto L_0x00dc;
                default: goto L_0x00db;
            }
        L_0x00db:
            goto L_0x0065
        L_0x00dc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x010d
        L_0x00e1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x010d
        L_0x00e6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x010d
        L_0x00eb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            goto L_0x010d
        L_0x00f0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L_0x010d
        L_0x00f5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L_0x010d
        L_0x00fa:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            goto L_0x010d
        L_0x00ff:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x010d
        L_0x0104:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x010d
        L_0x0109:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
        L_0x010d:
            if (r1 != 0) goto L_0x011e
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x0040
        L_0x011e:
            r0 = r2[r5]
            if (r0 != 0) goto L_0x0125
        L_0x0122:
            r2 = 0
            goto L_0x01d9
        L_0x0125:
            int r2 = r0.hashCode()
            switch(r2) {
                case 1537: goto L_0x01cd;
                case 1538: goto L_0x01c0;
                case 1539: goto L_0x01b3;
                case 1540: goto L_0x01a6;
                case 1541: goto L_0x0199;
                case 1542: goto L_0x018c;
                case 1543: goto L_0x017f;
                case 1544: goto L_0x0172;
                case 1545: goto L_0x0164;
                default: goto L_0x012c;
            }
        L_0x012c:
            switch(r2) {
                case 1567: goto L_0x0156;
                case 1568: goto L_0x0146;
                case 1569: goto L_0x013b;
                case 1570: goto L_0x0130;
                default: goto L_0x012f;
            }
        L_0x012f:
            goto L_0x0122
        L_0x0130:
            java.lang.String r2 = "13"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x0150
        L_0x013b:
            java.lang.String r2 = "12"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0150
        L_0x0146:
            java.lang.String r2 = "11"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0150:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x01d9
        L_0x0156:
            java.lang.String r2 = "10"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x01d9
        L_0x0164:
            java.lang.String r2 = "09"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x01d9
        L_0x0172:
            java.lang.String r2 = "08"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x01d9
        L_0x017f:
            java.lang.String r2 = "07"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x01d9
        L_0x018c:
            java.lang.String r2 = "06"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x01d9
        L_0x0199:
            java.lang.String r2 = "05"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x01d9
        L_0x01a6:
            java.lang.String r2 = "04"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x01d9
        L_0x01b3:
            java.lang.String r2 = "03"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x01d9
        L_0x01c0:
            java.lang.String r2 = "02"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x01d9
        L_0x01cd:
            java.lang.String r2 = "01"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
        L_0x01d9:
            if (r2 != 0) goto L_0x01ea
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x0040
        L_0x01ea:
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r2)
        L_0x01ef:
            return r3
        L_0x01f0:
            r4 = 0
            r12 = r2[r4]
            int r4 = r12.hashCode()
            switch(r4) {
                case 3004662: goto L_0x0237;
                case 3006243: goto L_0x022d;
                case 3006244: goto L_0x0223;
                case 3199032: goto L_0x0219;
                case 3214780: goto L_0x020f;
                case 3356560: goto L_0x0205;
                case 3624515: goto L_0x01fb;
                default: goto L_0x01fa;
            }
        L_0x01fa:
            goto L_0x0241
        L_0x01fb:
            java.lang.String r4 = "vp09"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L_0x0241
            r4 = 2
            goto L_0x0242
        L_0x0205:
            java.lang.String r4 = "mp4a"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L_0x0241
            r4 = 6
            goto L_0x0242
        L_0x020f:
            java.lang.String r4 = "hvc1"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L_0x0241
            r4 = 4
            goto L_0x0242
        L_0x0219:
            java.lang.String r4 = "hev1"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L_0x0241
            r4 = 3
            goto L_0x0242
        L_0x0223:
            java.lang.String r4 = "avc2"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L_0x0241
            r4 = 1
            goto L_0x0242
        L_0x022d:
            java.lang.String r4 = "avc1"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L_0x0241
            r4 = 0
            goto L_0x0242
        L_0x0237:
            java.lang.String r4 = "av01"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L_0x0241
            r4 = 5
            goto L_0x0242
        L_0x0241:
            r4 = -1
        L_0x0242:
            r12 = 8192(0x2000, float:1.14794E-41)
            r9 = 20
            switch(r4) {
                case 0: goto L_0x06dd;
                case 1: goto L_0x06dd;
                case 2: goto L_0x05ff;
                case 3: goto L_0x03d4;
                case 4: goto L_0x03d4;
                case 5: goto L_0x02da;
                case 6: goto L_0x024b;
                default: goto L_0x0249;
            }
        L_0x0249:
            r0 = 0
            return r0
        L_0x024b:
            java.lang.String r0 = r0.f7493k
            int r1 = r2.length
            if (r1 == r11) goto L_0x0260
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
        L_0x025d:
            r3 = 0
            goto L_0x02d9
        L_0x0260:
            java.lang.String r1 = "audio/mp4a-latm"
            r3 = r2[r15]     // Catch:{ NumberFormatException -> 0x02cb }
            int r3 = java.lang.Integer.parseInt(r3, r6)     // Catch:{ NumberFormatException -> 0x02cb }
            java.lang.String r3 = androidx.media3.common.C2598ay.m6808g(r3)     // Catch:{ NumberFormatException -> 0x02cb }
            boolean r1 = r1.equals(r3)     // Catch:{ NumberFormatException -> 0x02cb }
            if (r1 == 0) goto L_0x025d
            r1 = r2[r5]     // Catch:{ NumberFormatException -> 0x02cb }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02cb }
            r2 = 17
            if (r1 == r2) goto L_0x02b6
            if (r1 == r9) goto L_0x02b2
            r2 = 23
            if (r1 == r2) goto L_0x02af
            r2 = 29
            if (r1 == r2) goto L_0x02ac
            r2 = 39
            if (r1 == r2) goto L_0x02a9
            r2 = 42
            if (r1 == r2) goto L_0x02a6
            switch(r1) {
                case 1: goto L_0x02a3;
                case 2: goto L_0x02a0;
                case 3: goto L_0x029d;
                case 4: goto L_0x029a;
                case 5: goto L_0x0297;
                case 6: goto L_0x0294;
                default: goto L_0x0291;
            }     // Catch:{ NumberFormatException -> 0x02cb }
        L_0x0291:
            r1 = -1
            r6 = -1
            goto L_0x02b9
        L_0x0294:
            r1 = -1
            r6 = 6
            goto L_0x02b9
        L_0x0297:
            r1 = -1
            r6 = 5
            goto L_0x02b9
        L_0x029a:
            r1 = -1
            r6 = 4
            goto L_0x02b9
        L_0x029d:
            r1 = -1
            r6 = 3
            goto L_0x02b9
        L_0x02a0:
            r1 = -1
            r6 = 2
            goto L_0x02b9
        L_0x02a3:
            r1 = -1
            r6 = 1
            goto L_0x02b9
        L_0x02a6:
            r6 = 42
            goto L_0x02b8
        L_0x02a9:
            r6 = 39
            goto L_0x02b8
        L_0x02ac:
            r6 = 29
            goto L_0x02b8
        L_0x02af:
            r6 = 23
            goto L_0x02b8
        L_0x02b2:
            r1 = -1
            r6 = 20
            goto L_0x02b9
        L_0x02b6:
            r6 = 17
        L_0x02b8:
            r1 = -1
        L_0x02b9:
            if (r6 == r1) goto L_0x025d
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x02cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x02cb }
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x02cb }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x02cb }
            r3 = r1
            goto L_0x02d9
        L_0x02cb:
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x025d
        L_0x02d9:
            return r3
        L_0x02da:
            java.lang.String r1 = r0.f7493k
            androidx.media3.common.n r0 = r0.f7508z
            int r4 = r2.length
            if (r4 >= r14) goto L_0x02f1
            java.lang.String r0 = "Ignoring malformed AV1 codec string: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
        L_0x02ee:
            r3 = 0
            goto L_0x03d3
        L_0x02f1:
            r4 = r2[r15]     // Catch:{ NumberFormatException -> 0x03c4 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x03c4 }
            r9 = r2[r5]     // Catch:{ NumberFormatException -> 0x03c4 }
            r6 = 0
            java.lang.String r6 = r9.substring(r6, r5)     // Catch:{ NumberFormatException -> 0x03c4 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x03c4 }
            r2 = r2[r11]     // Catch:{ NumberFormatException -> 0x03c4 }
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x03c4 }
            if (r4 == 0) goto L_0x031c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown AV1 profile: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x02ee
        L_0x031c:
            if (r1 == r3) goto L_0x0347
            r2 = 10
            if (r1 == r2) goto L_0x0334
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AV1 bit depth: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x02ee
        L_0x0334:
            if (r0 == 0) goto L_0x0345
            byte[] r1 = r0.f7436d
            if (r1 != 0) goto L_0x0342
            int r0 = r0.f7435c
            r1 = 7
            if (r0 == r1) goto L_0x0342
            r1 = 6
            if (r0 != r1) goto L_0x0345
        L_0x0342:
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x0348
        L_0x0345:
            r2 = 2
            goto L_0x0348
        L_0x0347:
            r2 = 1
        L_0x0348:
            switch(r6) {
                case 0: goto L_0x039f;
                case 1: goto L_0x039d;
                case 2: goto L_0x039a;
                case 3: goto L_0x0396;
                case 4: goto L_0x0392;
                case 5: goto L_0x038e;
                case 6: goto L_0x038a;
                case 7: goto L_0x0386;
                case 8: goto L_0x0382;
                case 9: goto L_0x037e;
                case 10: goto L_0x037a;
                case 11: goto L_0x0376;
                case 12: goto L_0x0372;
                case 13: goto L_0x036e;
                case 14: goto L_0x036b;
                case 15: goto L_0x0367;
                case 16: goto L_0x0364;
                case 17: goto L_0x0361;
                case 18: goto L_0x035e;
                case 19: goto L_0x035b;
                case 20: goto L_0x0358;
                case 21: goto L_0x0355;
                case 22: goto L_0x0352;
                case 23: goto L_0x034f;
                default: goto L_0x034b;
            }
        L_0x034b:
            r0 = -1
            r5 = -1
            goto L_0x03a1
        L_0x034f:
            r5 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x039d
        L_0x0352:
            r5 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x039d
        L_0x0355:
            r5 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x039d
        L_0x0358:
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x039d
        L_0x035b:
            r5 = 524288(0x80000, float:7.34684E-40)
            goto L_0x039d
        L_0x035e:
            r5 = 262144(0x40000, float:3.67342E-40)
            goto L_0x039d
        L_0x0361:
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x039d
        L_0x0364:
            r5 = 65536(0x10000, float:9.18355E-41)
            goto L_0x039d
        L_0x0367:
            r5 = 32768(0x8000, float:4.5918E-41)
            goto L_0x039d
        L_0x036b:
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x039d
        L_0x036e:
            r0 = -1
            r5 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03a1
        L_0x0372:
            r0 = -1
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x03a1
        L_0x0376:
            r0 = -1
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x03a1
        L_0x037a:
            r0 = -1
            r5 = 1024(0x400, float:1.435E-42)
            goto L_0x03a1
        L_0x037e:
            r0 = -1
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x03a1
        L_0x0382:
            r0 = -1
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x03a1
        L_0x0386:
            r0 = -1
            r5 = 128(0x80, float:1.794E-43)
            goto L_0x03a1
        L_0x038a:
            r0 = -1
            r5 = 64
            goto L_0x03a1
        L_0x038e:
            r0 = -1
            r5 = 32
            goto L_0x03a1
        L_0x0392:
            r0 = -1
            r5 = 16
            goto L_0x03a1
        L_0x0396:
            r0 = -1
            r5 = 8
            goto L_0x03a1
        L_0x039a:
            r0 = -1
            r5 = 4
            goto L_0x03a1
        L_0x039d:
            r0 = -1
            goto L_0x03a1
        L_0x039f:
            r0 = -1
            r5 = 1
        L_0x03a1:
            if (r5 != r0) goto L_0x03b6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown AV1 level: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x02ee
        L_0x03b6:
            android.util.Pair r3 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r3.<init>(r0, r1)
            goto L_0x03d3
        L_0x03c4:
            java.lang.String r0 = "Ignoring malformed AV1 codec string: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x02ee
        L_0x03d3:
            return r3
        L_0x03d4:
            java.lang.String r0 = r0.f7493k
            int r1 = r2.length
            if (r1 >= r14) goto L_0x03e9
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
        L_0x03e6:
            r3 = 0
            goto L_0x05fe
        L_0x03e9:
            java.util.regex.Pattern r1 = f8528b
            r4 = r2[r15]
            java.util.regex.Matcher r1 = r1.matcher(r4)
            boolean r4 = r1.matches()
            if (r4 != 0) goto L_0x0405
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x03e6
        L_0x0405:
            java.lang.String r0 = r1.group(r15)
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0413
            r0 = 1
            goto L_0x041c
        L_0x0413:
            java.lang.String r1 = "2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x05ef
            r0 = 2
        L_0x041c:
            r1 = r2[r11]
            if (r1 != 0) goto L_0x0423
        L_0x0420:
            r2 = 0
            goto L_0x05d4
        L_0x0423:
            int r2 = r1.hashCode()
            switch(r2) {
                case 70821: goto L_0x0547;
                case 70914: goto L_0x053c;
                case 70917: goto L_0x0531;
                case 71007: goto L_0x0526;
                case 71010: goto L_0x051b;
                case 74665: goto L_0x0511;
                case 74758: goto L_0x0507;
                case 74761: goto L_0x04fd;
                case 74851: goto L_0x04f3;
                case 74854: goto L_0x04e9;
                case 2193639: goto L_0x04dd;
                case 2193642: goto L_0x04d1;
                case 2193732: goto L_0x04c5;
                case 2193735: goto L_0x04b9;
                case 2193738: goto L_0x04ad;
                case 2193825: goto L_0x04a1;
                case 2193828: goto L_0x0495;
                case 2193831: goto L_0x0489;
                case 2312803: goto L_0x047e;
                case 2312806: goto L_0x0473;
                case 2312896: goto L_0x0468;
                case 2312899: goto L_0x045c;
                case 2312902: goto L_0x0450;
                case 2312989: goto L_0x0444;
                case 2312992: goto L_0x0438;
                case 2312995: goto L_0x042c;
                default: goto L_0x042a;
            }
        L_0x042a:
            goto L_0x0552
        L_0x042c:
            java.lang.String r2 = "L186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 12
            goto L_0x0553
        L_0x0438:
            java.lang.String r2 = "L183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 11
            goto L_0x0553
        L_0x0444:
            java.lang.String r2 = "L180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 10
            goto L_0x0553
        L_0x0450:
            java.lang.String r2 = "L156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 9
            goto L_0x0553
        L_0x045c:
            java.lang.String r2 = "L153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 8
            goto L_0x0553
        L_0x0468:
            java.lang.String r2 = "L150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 7
            goto L_0x0553
        L_0x0473:
            java.lang.String r2 = "L123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 6
            goto L_0x0553
        L_0x047e:
            java.lang.String r2 = "L120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 5
            goto L_0x0553
        L_0x0489:
            java.lang.String r2 = "H186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 25
            goto L_0x0553
        L_0x0495:
            java.lang.String r2 = "H183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 24
            goto L_0x0553
        L_0x04a1:
            java.lang.String r2 = "H180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 23
            goto L_0x0553
        L_0x04ad:
            java.lang.String r2 = "H156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 22
            goto L_0x0553
        L_0x04b9:
            java.lang.String r2 = "H153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 21
            goto L_0x0553
        L_0x04c5:
            java.lang.String r2 = "H150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 20
            goto L_0x0553
        L_0x04d1:
            java.lang.String r2 = "H123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 19
            goto L_0x0553
        L_0x04dd:
            java.lang.String r2 = "H120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 18
            goto L_0x0553
        L_0x04e9:
            java.lang.String r2 = "L93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 4
            goto L_0x0553
        L_0x04f3:
            java.lang.String r2 = "L90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 3
            goto L_0x0553
        L_0x04fd:
            java.lang.String r2 = "L63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 2
            goto L_0x0553
        L_0x0507:
            java.lang.String r2 = "L60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 1
            goto L_0x0553
        L_0x0511:
            java.lang.String r2 = "L30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 0
            goto L_0x0553
        L_0x051b:
            java.lang.String r2 = "H93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 17
            goto L_0x0553
        L_0x0526:
            java.lang.String r2 = "H90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 16
            goto L_0x0553
        L_0x0531:
            java.lang.String r2 = "H63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 15
            goto L_0x0553
        L_0x053c:
            java.lang.String r2 = "H60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 14
            goto L_0x0553
        L_0x0547:
            java.lang.String r2 = "H30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0552
            r6 = 13
            goto L_0x0553
        L_0x0552:
            r6 = -1
        L_0x0553:
            switch(r6) {
                case 0: goto L_0x05d0;
                case 1: goto L_0x05cb;
                case 2: goto L_0x05c4;
                case 3: goto L_0x05bd;
                case 4: goto L_0x05b6;
                case 5: goto L_0x05af;
                case 6: goto L_0x05a8;
                case 7: goto L_0x05a5;
                case 8: goto L_0x05a2;
                case 9: goto L_0x059f;
                case 10: goto L_0x059c;
                case 11: goto L_0x0599;
                case 12: goto L_0x0596;
                case 13: goto L_0x0591;
                case 14: goto L_0x058c;
                case 15: goto L_0x0587;
                case 16: goto L_0x0582;
                case 17: goto L_0x057d;
                case 18: goto L_0x0576;
                case 19: goto L_0x0570;
                case 20: goto L_0x056c;
                case 21: goto L_0x0568;
                case 22: goto L_0x0564;
                case 23: goto L_0x0560;
                case 24: goto L_0x055c;
                case 25: goto L_0x0558;
                default: goto L_0x0556;
            }
        L_0x0556:
            goto L_0x0420
        L_0x0558:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x05c6
        L_0x055c:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x05c6
        L_0x0560:
            r2 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x05c6
        L_0x0564:
            r2 = 524288(0x80000, float:7.34684E-40)
            goto L_0x05c6
        L_0x0568:
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x05c6
        L_0x056c:
            r2 = 32768(0x8000, float:4.5918E-41)
            goto L_0x05c6
        L_0x0570:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x05d4
        L_0x0576:
            r4 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x05d4
        L_0x057d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x05d4
        L_0x0582:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x05d4
        L_0x0587:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x05d4
        L_0x058c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x05d4
        L_0x0591:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x05d4
        L_0x0596:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            goto L_0x05c6
        L_0x0599:
            r2 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x05c6
        L_0x059c:
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x05c6
        L_0x059f:
            r2 = 262144(0x40000, float:3.67342E-40)
            goto L_0x05c6
        L_0x05a2:
            r2 = 65536(0x10000, float:9.18355E-41)
            goto L_0x05c6
        L_0x05a5:
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x05c6
        L_0x05a8:
            r6 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x05d4
        L_0x05af:
            r9 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x05d4
        L_0x05b6:
            r16 = 256(0x100, float:3.59E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            goto L_0x05d4
        L_0x05bd:
            r17 = 64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            goto L_0x05d4
        L_0x05c4:
            r2 = 16
        L_0x05c6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05d4
        L_0x05cb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x05d4
        L_0x05d0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
        L_0x05d4:
            if (r2 != 0) goto L_0x05e5
            java.lang.String r0 = "Unknown HEVC level string: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x03e6
        L_0x05e5:
            android.util.Pair r3 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.<init>(r0, r2)
            goto L_0x05fe
        L_0x05ef:
            java.lang.String r1 = "Unknown HEVC profile string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x03e6
        L_0x05fe:
            return r3
        L_0x05ff:
            r4 = 2048(0x800, float:2.87E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            r16 = 256(0x100, float:3.59E-43)
            r17 = 64
            java.lang.String r0 = r0.f7493k
            int r1 = r2.length
            if (r1 >= r11) goto L_0x061c
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
        L_0x0619:
            r3 = 0
            goto L_0x06dc
        L_0x061c:
            r1 = r2[r15]     // Catch:{ NumberFormatException -> 0x06cd }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x06cd }
            r2 = r2[r5]     // Catch:{ NumberFormatException -> 0x06cd }
            int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x06cd }
            if (r1 == 0) goto L_0x0639
            if (r1 == r15) goto L_0x0637
            if (r1 == r5) goto L_0x0635
            if (r1 == r11) goto L_0x0632
            r2 = -1
            goto L_0x063a
        L_0x0632:
            r2 = 8
            goto L_0x063a
        L_0x0635:
            r2 = 4
            goto L_0x063a
        L_0x0637:
            r2 = 2
            goto L_0x063a
        L_0x0639:
            r2 = 1
        L_0x063a:
            r11 = -1
            if (r2 != r11) goto L_0x064f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown VP9 profile: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x0619
        L_0x064f:
            r1 = 10
            if (r0 == r1) goto L_0x06a7
            r1 = 11
            if (r0 == r1) goto L_0x06a4
            if (r0 == r9) goto L_0x06a1
            r1 = 21
            if (r0 == r1) goto L_0x069f
            r1 = 30
            if (r0 == r1) goto L_0x069b
            r1 = 31
            if (r0 == r1) goto L_0x0697
            r1 = 40
            if (r0 == r1) goto L_0x0693
            r1 = 41
            if (r0 == r1) goto L_0x068f
            r1 = 50
            if (r0 == r1) goto L_0x068b
            r1 = 51
            if (r0 == r1) goto L_0x0687
            switch(r0) {
                case 60: goto L_0x0683;
                case 61: goto L_0x067f;
                case 62: goto L_0x067b;
                default: goto L_0x0678;
            }
        L_0x0678:
            r1 = -1
            r3 = -1
            goto L_0x06a9
        L_0x067b:
            r1 = -1
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x06a9
        L_0x067f:
            r1 = -1
            r3 = 4096(0x1000, float:5.74E-42)
            goto L_0x06a9
        L_0x0683:
            r1 = -1
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x06a9
        L_0x0687:
            r1 = -1
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x06a9
        L_0x068b:
            r1 = -1
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x06a9
        L_0x068f:
            r1 = -1
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x06a9
        L_0x0693:
            r1 = -1
            r3 = 64
            goto L_0x06a9
        L_0x0697:
            r1 = -1
            r3 = 32
            goto L_0x06a9
        L_0x069b:
            r1 = -1
            r3 = 16
            goto L_0x06a9
        L_0x069f:
            r1 = -1
            goto L_0x06a9
        L_0x06a1:
            r1 = -1
            r3 = 4
            goto L_0x06a9
        L_0x06a4:
            r1 = -1
            r3 = 2
            goto L_0x06a9
        L_0x06a7:
            r1 = -1
            r3 = 1
        L_0x06a9:
            if (r3 != r1) goto L_0x06be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown VP9 level: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x0619
        L_0x06be:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.<init>(r1, r2)
            r3 = r0
            goto L_0x06dc
        L_0x06cd:
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x0619
        L_0x06dc:
            return r3
        L_0x06dd:
            r4 = 2048(0x800, float:2.87E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            r9 = 1024(0x400, float:1.435E-42)
            r16 = 256(0x100, float:3.59E-43)
            r17 = 64
            java.lang.String r0 = r0.f7493k
            int r3 = r2.length
            if (r3 >= r5) goto L_0x06fc
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
        L_0x06f9:
            r3 = 0
            goto L_0x07fa
        L_0x06fc:
            r18 = r2[r15]     // Catch:{ NumberFormatException -> 0x07eb }
            int r4 = r18.length()     // Catch:{ NumberFormatException -> 0x07eb }
            r6 = 6
            if (r4 != r6) goto L_0x071d
            r1 = r2[r15]     // Catch:{ NumberFormatException -> 0x07eb }
            r3 = 0
            java.lang.String r1 = r1.substring(r3, r5)     // Catch:{ NumberFormatException -> 0x07eb }
            r4 = 16
            int r1 = java.lang.Integer.parseInt(r1, r4)     // Catch:{ NumberFormatException -> 0x07eb }
            r2 = r2[r15]     // Catch:{ NumberFormatException -> 0x07eb }
            java.lang.String r2 = r2.substring(r14)     // Catch:{ NumberFormatException -> 0x07eb }
            int r0 = java.lang.Integer.parseInt(r2, r4)     // Catch:{ NumberFormatException -> 0x07eb }
            goto L_0x072d
        L_0x071d:
            r4 = 16
            if (r3 < r11) goto L_0x07da
            r1 = r2[r15]     // Catch:{ NumberFormatException -> 0x07eb }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x07eb }
            r2 = r2[r5]     // Catch:{ NumberFormatException -> 0x07eb }
            int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x07eb }
        L_0x072d:
            r2 = 66
            if (r1 == r2) goto L_0x0761
            r2 = 77
            if (r1 == r2) goto L_0x075f
            r2 = 88
            if (r1 == r2) goto L_0x075c
            r2 = 100
            if (r1 == r2) goto L_0x0758
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x0754
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L_0x0750
            r2 = 244(0xf4, float:3.42E-43)
            if (r1 == r2) goto L_0x074c
            r2 = -1
            r5 = -1
            goto L_0x0763
        L_0x074c:
            r2 = -1
            r5 = 64
            goto L_0x0763
        L_0x0750:
            r2 = -1
            r5 = 32
            goto L_0x0763
        L_0x0754:
            r2 = -1
            r5 = 16
            goto L_0x0763
        L_0x0758:
            r2 = -1
            r5 = 8
            goto L_0x0763
        L_0x075c:
            r2 = -1
            r5 = 4
            goto L_0x0763
        L_0x075f:
            r2 = -1
            goto L_0x0763
        L_0x0761:
            r2 = -1
            r5 = 1
        L_0x0763:
            if (r5 != r2) goto L_0x0777
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AVC profile: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x06f9
        L_0x0777:
            switch(r0) {
                case 10: goto L_0x07b5;
                case 11: goto L_0x07b3;
                case 12: goto L_0x07b0;
                case 13: goto L_0x07ad;
                default: goto L_0x077a;
            }
        L_0x077a:
            switch(r0) {
                case 20: goto L_0x07aa;
                case 21: goto L_0x07a7;
                case 22: goto L_0x07a4;
                default: goto L_0x077d;
            }
        L_0x077d:
            switch(r0) {
                case 30: goto L_0x07a1;
                case 31: goto L_0x079e;
                case 32: goto L_0x079b;
                default: goto L_0x0780;
            }
        L_0x0780:
            switch(r0) {
                case 40: goto L_0x0798;
                case 41: goto L_0x0795;
                case 42: goto L_0x0792;
                default: goto L_0x0783;
            }
        L_0x0783:
            switch(r0) {
                case 50: goto L_0x078f;
                case 51: goto L_0x078b;
                case 52: goto L_0x0788;
                default: goto L_0x0786;
            }
        L_0x0786:
            r1 = -1
            goto L_0x07b6
        L_0x0788:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x07b6
        L_0x078b:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x07b6
        L_0x078f:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x07b6
        L_0x0792:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x07b6
        L_0x0795:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x07b6
        L_0x0798:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x07b6
        L_0x079b:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x07b6
        L_0x079e:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x07b6
        L_0x07a1:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x07b6
        L_0x07a4:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x07b6
        L_0x07a7:
            r1 = 64
            goto L_0x07b6
        L_0x07aa:
            r1 = 32
            goto L_0x07b6
        L_0x07ad:
            r1 = 16
            goto L_0x07b6
        L_0x07b0:
            r1 = 8
            goto L_0x07b6
        L_0x07b3:
            r1 = 4
            goto L_0x07b6
        L_0x07b5:
            r1 = 1
        L_0x07b6:
            r2 = -1
            if (r1 != r2) goto L_0x07cc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AVC level: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x06f9
        L_0x07cc:
            android.util.Pair r3 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.<init>(r0, r1)
            goto L_0x07fa
        L_0x07da:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x07eb }
            r2.<init>(r1)     // Catch:{ NumberFormatException -> 0x07eb }
            r2.append(r0)     // Catch:{ NumberFormatException -> 0x07eb }
            java.lang.String r1 = r2.toString()     // Catch:{ NumberFormatException -> 0x07eb }
            androidx.media3.common.p136b.C2633u.m7050e(r7, r1)     // Catch:{ NumberFormatException -> 0x07eb }
            goto L_0x06f9
        L_0x07eb:
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
            goto L_0x06f9
        L_0x07fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p142e.C2970af.m8385a(androidx.media3.common.x):android.util.Pair");
    }

    /* renamed from: b */
    public static C2989s m8386b() {
        List d = m8388d("audio/raw", false, false);
        if (d.isEmpty()) {
            return null;
        }
        return (C2989s) d.get(0);
    }

    /* renamed from: c */
    public static String m8387c(C2680x xVar) {
        Pair a;
        if ("audio/eac3-joc".equals(xVar.f7496n)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(xVar.f7496n) || (a = m8385a(xVar)) == null) {
            return null;
        }
        int intValue = ((Integer) a.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* renamed from: d */
    public static synchronized List m8388d(String str, boolean z, boolean z2) {
        C2966ab abVar;
        String str2;
        C2968ad adVar;
        int i;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        boolean z3 = z;
        boolean z4 = z2;
        synchronized (C2970af.class) {
            C2966ab abVar2 = new C2966ab(str6, z3, z4);
            List list = (List) f8529c.get(abVar2);
            if (list != null) {
                return list;
            }
            int i3 = C2612ak.f7249a;
            C2968ad adVar2 = new C2968ad(z3, z4);
            try {
                ArrayList arrayList = new ArrayList();
                String str7 = abVar2.f8522a;
                adVar2.mo6867a();
                int length = adVar2.f8525a.length;
                int i4 = 0;
                while (i4 < length) {
                    adVar2.mo6867a();
                    MediaCodecInfo mediaCodecInfo = adVar2.f8525a[i4];
                    if (!mediaCodecInfo.isAlias()) {
                        String name = mediaCodecInfo.getName();
                        if (!mediaCodecInfo.isEncoder()) {
                            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                            int length2 = supportedTypes.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 < length2) {
                                    str3 = supportedTypes[i5];
                                    if (str3.equalsIgnoreCase(str7)) {
                                        break;
                                    }
                                    i5++;
                                } else {
                                    str3 = null;
                                    if (str7.equals("video/dolby-vision")) {
                                        if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                            str3 = "video/hevcdv";
                                        } else if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                            str3 = "video/dv_hevc";
                                        }
                                    } else if (str7.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                        str3 = "audio/x-lg-alac";
                                    } else if (str7.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                        str3 = "audio/x-lg-flac";
                                    } else if (str7.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                        str3 = "audio/lg-ac3";
                                    }
                                }
                            }
                            if (str3 != null) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str3);
                                    boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                                    boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                                    if (!abVar2.f8524c) {
                                        if (!isFeatureRequired) {
                                        }
                                    } else if (!isFeatureSupported) {
                                    }
                                    boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                    boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                    if (!abVar2.f8523b) {
                                        if (!isFeatureRequired2) {
                                        }
                                    } else if (isFeatureSupported2) {
                                        isFeatureSupported2 = true;
                                    }
                                    boolean isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                    mediaCodecInfo.isSoftwareOnly();
                                    mediaCodecInfo.isVendor();
                                    if (abVar2.f8523b == isFeatureSupported2) {
                                        boolean z5 = capabilitiesForType != null && capabilitiesForType.isFeatureSupported("adaptive-playback");
                                        if (capabilitiesForType != null) {
                                            capabilitiesForType.isFeatureSupported("tunneled-playback");
                                        }
                                        String str8 = name;
                                        String str9 = str7;
                                        adVar = adVar2;
                                        C2989s sVar = r6;
                                        str2 = str7;
                                        str5 = name;
                                        boolean z6 = isHardwareAccelerated;
                                        i2 = i4;
                                        boolean z7 = z5;
                                        abVar = abVar2;
                                        i = length;
                                        str4 = str3;
                                        try {
                                            C2989s sVar2 = new C2989s(str8, str9, str3, capabilitiesForType, z6, z7, capabilitiesForType != null && capabilitiesForType.isFeatureSupported("secure-playback"));
                                            arrayList.add(sVar);
                                            i4 = i2 + 1;
                                            length = i;
                                            adVar2 = adVar;
                                            str7 = str2;
                                            abVar2 = abVar;
                                        } catch (Exception e) {
                                            e = e;
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    str5 = name;
                                    str4 = str3;
                                    C2633u.m7048c("MediaCodecUtil", "Failed to query codec " + str5 + " (" + str4 + ")");
                                    throw e;
                                }
                            }
                        }
                    }
                    abVar = abVar2;
                    adVar = adVar2;
                    i2 = i4;
                    str2 = str7;
                    i = length;
                    i4 = i2 + 1;
                    length = i;
                    adVar2 = adVar;
                    str7 = str2;
                    abVar2 = abVar;
                }
                C2966ab abVar3 = abVar2;
                if (z3) {
                    arrayList.isEmpty();
                }
                if ("audio/raw".equals(str6)) {
                    m8390f(arrayList, C2965aa.f8521a);
                }
                if (C2612ak.f7249a < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C2989s) arrayList.get(0)).f8587a)) {
                    arrayList.add((C2989s) arrayList.remove(0));
                }
                C58485gu j = C58485gu.m89842j(arrayList);
                f8529c.put(abVar3, j);
                return j;
            } catch (Exception e3) {
                throw new C2967ac(e3);
            }
        }
    }

    /* renamed from: e */
    public static List m8389e(List list, C2680x xVar) {
        ArrayList arrayList = new ArrayList(list);
        m8390f(arrayList, new C2995y(xVar));
        return arrayList;
    }

    /* renamed from: f */
    private static void m8390f(List list, C2969ae aeVar) {
        Collections.sort(list, new C2996z(aeVar));
    }
}
