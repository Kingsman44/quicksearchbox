package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.metadata.C3585b;
import androidx.media3.extractor.metadata.C3586c;
import com.evernote.android.state.BuildConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: androidx.media3.extractor.metadata.id3.i */
/* compiled from: PG */
public final class C3605i extends C3586c {

    /* renamed from: a */
    public static final C3603g f11500a = C3603g.f11496a;

    /* renamed from: b */
    private final C3603g f11501b;

    public C3605i() {
        this.f11501b = null;
    }

    public C3605i(C3603g gVar) {
        this.f11501b = gVar;
    }

    /* renamed from: d */
    private static int m10412d(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: e */
    private static int m10413e(byte[] bArr, int i, int i2) {
        int f = m10414f(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return f;
        }
        while (true) {
            int length = bArr.length;
            if (f >= length - 1) {
                return length;
            }
            if ((f - i) % 2 == 0 && bArr[f + 1] == 0) {
                return f;
            }
            f = m10414f(bArr, f + 1);
        }
    }

    /* renamed from: f */
    private static int m10414f(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: g */
    private static int m10415g(C2604ac acVar, int i) {
        byte[] bArr = acVar.f7234a;
        int i2 = acVar.f7235b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* renamed from: h */
    private static String m10416h(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? BuildConfig.FLAVOR : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: i */
    private static String m10417i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: j */
    private static String m10418j(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if ((r10 & 128) != 0) goto L_0x0089;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m10419k(androidx.media3.common.p136b.C2604ac r19, int r20, int r21, boolean r22) {
        /*
            r1 = r19
            r0 = r20
            int r2 = r1.f7235b
        L_0x0006:
            int r3 = r1.f7236c     // Catch:{ all -> 0x00af }
            int r4 = r1.f7235b     // Catch:{ all -> 0x00af }
            int r3 = r3 - r4
            r4 = 1
            r5 = r21
            if (r3 < r5) goto L_0x00ab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0021
            int r7 = r19.mo6134b()     // Catch:{ all -> 0x00af }
            long r8 = r19.mo6146n()     // Catch:{ all -> 0x00af }
            int r10 = r19.mo6142j()     // Catch:{ all -> 0x00af }
            goto L_0x002b
        L_0x0021:
            int r7 = r19.mo6140h()     // Catch:{ all -> 0x00af }
            int r8 = r19.mo6140h()     // Catch:{ all -> 0x00af }
            long r8 = (long) r8
            r10 = 0
        L_0x002b:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 == 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            r1.mo6131A(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x0069
            if (r22 != 0) goto L_0x0069
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.mo6131A(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r11 = r11 & r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 24
            long r8 = r8 >> r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L_0x0069:
            if (r0 != r7) goto L_0x0079
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            r3 = r10 & 1
            r18 = r4
            r4 = r3
            r3 = r18
            goto L_0x0089
        L_0x0079:
            if (r0 != r3) goto L_0x0087
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0081
            r3 = 1
            goto L_0x0082
        L_0x0081:
            r3 = 0
        L_0x0082:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0087:
            r3 = 0
        L_0x0088:
            r4 = 0
        L_0x0089:
            if (r4 == 0) goto L_0x008d
            int r3 = r3 + 4
        L_0x008d:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x00a7
            int r3 = r1.f7236c     // Catch:{ all -> 0x00af }
            int r4 = r1.f7235b     // Catch:{ all -> 0x00af }
            int r3 = r3 - r4
            long r10 = (long) r3
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a0
            r1.mo6131A(r2)
            return r6
        L_0x00a0:
            int r3 = (int) r8
            int r4 = r4 + r3
            r1.mo6131A(r4)     // Catch:{ all -> 0x00af }
            goto L_0x0006
        L_0x00a7:
            r1.mo6131A(r2)
            return r6
        L_0x00ab:
            r1.mo6131A(r2)
            return r4
        L_0x00af:
            r0 = move-exception
            r1.mo6131A(r2)
            goto L_0x00b5
        L_0x00b4:
            throw r0
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.C3605i.m10419k(androidx.media3.common.b.ac, int, int, boolean):boolean");
    }

    /* renamed from: l */
    private static byte[] m10420l(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return C2612ak.f7254f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX WARNING: type inference failed for: r3v16, types: [androidx.media3.extractor.metadata.id3.CommentFrame] */
    /* JADX WARNING: type inference failed for: r3v19, types: [androidx.media3.extractor.metadata.id3.ApicFrame] */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0275, code lost:
        if (r9 == 67) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0516, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0517, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x051a, code lost:
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0525, code lost:
        r14 = r21;
        r2 = r22;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:123:0x0221, B:151:0x02d8] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0359 A[Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03c3 A[Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0516 A[ExcHandler: all (th java.lang.Throwable), PHI: r21 
      PHI: (r21v1 int) = (r21v2 int), (r21v2 int), (r21v2 int), (r21v4 int), (r21v7 int) binds: [B:230:0x04f3, B:233:0x0512, B:234:?, B:151:0x02d8, B:123:0x0221] A[DONT_GENERATE, DONT_INLINE], Splitter:B:123:0x0221] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.media3.extractor.metadata.id3.Id3Frame m10421m(int r34, androidx.media3.common.p136b.C2604ac r35, boolean r36, int r37, androidx.media3.extractor.metadata.id3.C3603g r38) {
        /*
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            int r4 = r35.mo6139g()
            int r5 = r35.mo6139g()
            int r6 = r35.mo6139g()
            r8 = 3
            if (r0 < r8) goto L_0x001c
            int r9 = r35.mo6139g()
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            r10 = 4
            if (r0 != r10) goto L_0x003c
            int r11 = r35.mo6141i()
            if (r2 != 0) goto L_0x0047
            r12 = r11 & 255(0xff, float:3.57E-43)
            int r13 = r11 >> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 7
            r12 = r12 | r13
            int r13 = r11 >> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 14
            r12 = r12 | r13
            int r11 = r11 >> 24
            int r11 = r11 << 21
            r11 = r11 | r12
            goto L_0x0047
        L_0x003c:
            if (r0 != r8) goto L_0x0043
            int r11 = r35.mo6141i()
            goto L_0x0047
        L_0x0043:
            int r11 = r35.mo6140h()
        L_0x0047:
            if (r0 < r8) goto L_0x004e
            int r12 = r35.mo6142j()
            goto L_0x004f
        L_0x004e:
            r12 = 0
        L_0x004f:
            r13 = 0
            if (r4 != 0) goto L_0x0063
            if (r5 != 0) goto L_0x0063
            if (r6 != 0) goto L_0x0063
            if (r9 != 0) goto L_0x0063
            if (r11 != 0) goto L_0x0063
            if (r12 == 0) goto L_0x005d
            goto L_0x0063
        L_0x005d:
            int r0 = r1.f7236c
            r1.mo6131A(r0)
            return r13
        L_0x0063:
            int r14 = r1.f7235b
            int r15 = r14 + r11
            int r7 = r1.f7236c
            java.lang.String r10 = "Id3Decoder"
            if (r15 <= r7) goto L_0x0078
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            androidx.media3.common.p136b.C2633u.m7050e(r10, r0)
            int r0 = r1.f7236c
            r1.mo6131A(r0)
            return r13
        L_0x0078:
            if (r38 != 0) goto L_0x0544
            r7 = 1
            if (r0 != r8) goto L_0x009b
            r8 = r12 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0083
            r8 = 1
            goto L_0x0084
        L_0x0083:
            r8 = 0
        L_0x0084:
            r18 = r12 & 64
            if (r18 == 0) goto L_0x008b
            r18 = 1
            goto L_0x008d
        L_0x008b:
            r18 = 0
        L_0x008d:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x0093
            r12 = 1
            goto L_0x0094
        L_0x0093:
            r12 = 0
        L_0x0094:
            r19 = r18
            r20 = 0
            r18 = r8
            goto L_0x00cf
        L_0x009b:
            r8 = 4
            if (r0 != r8) goto L_0x00c7
            r8 = r12 & 64
            if (r8 == 0) goto L_0x00a4
            r8 = 1
            goto L_0x00a5
        L_0x00a4:
            r8 = 0
        L_0x00a5:
            r18 = r12 & 8
            if (r18 == 0) goto L_0x00ac
            r18 = 1
            goto L_0x00ae
        L_0x00ac:
            r18 = 0
        L_0x00ae:
            r19 = r12 & 4
            if (r19 == 0) goto L_0x00b5
            r19 = 1
            goto L_0x00b7
        L_0x00b5:
            r19 = 0
        L_0x00b7:
            r20 = r12 & 2
            if (r20 == 0) goto L_0x00be
            r20 = 1
            goto L_0x00c0
        L_0x00be:
            r20 = 0
        L_0x00c0:
            r12 = r12 & r7
            r33 = r12
            r12 = r8
            r8 = r33
            goto L_0x00cf
        L_0x00c7:
            r8 = 0
            r12 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x00cf:
            if (r18 != 0) goto L_0x0538
            if (r19 == 0) goto L_0x00d5
            goto L_0x0538
        L_0x00d5:
            if (r12 == 0) goto L_0x00dd
            int r11 = r11 + -1
            int r14 = r14 + r7
            r1.mo6131A(r14)
        L_0x00dd:
            if (r8 == 0) goto L_0x00e8
            int r11 = r11 + -4
            int r8 = r1.f7235b
            r12 = 4
            int r8 = r8 + r12
            r1.mo6131A(r8)
        L_0x00e8:
            if (r20 == 0) goto L_0x00ee
            int r11 = m10415g(r1, r11)
        L_0x00ee:
            r8 = 84
            r12 = 88
            r14 = 2
            if (r4 != r8) goto L_0x012e
            if (r5 != r12) goto L_0x012e
            if (r6 != r12) goto L_0x012e
            if (r0 == r14) goto L_0x00fd
            if (r9 != r12) goto L_0x012e
        L_0x00fd:
            if (r11 > 0) goto L_0x0100
            goto L_0x0136
        L_0x0100:
            int r2 = r35.mo6139g()     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r3 = m10417i(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r7 = r11 + -1
            byte[] r8 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r12 = 0
            r1.mo6155w(r8, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r7 = m10413e(r8, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r14.<init>(r8, r12, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r12 = m10412d(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r7 = r7 + r12
            int r2 = m10413e(r8, r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r2 = m10416h(r8, r7, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            androidx.media3.extractor.metadata.id3.TextInformationFrame r3 = new androidx.media3.extractor.metadata.id3.TextInformationFrame     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r7 = "TXXX"
            r3.<init>(r7, r14, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            goto L_0x015f
        L_0x012e:
            if (r4 != r8) goto L_0x0169
            java.lang.String r2 = m10418j(r0, r8, r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            if (r11 > 0) goto L_0x0141
        L_0x0136:
            r23 = r4
            r3 = r5
            r4 = r6
            r7 = r9
            r22 = r10
            r21 = r15
            goto L_0x04ef
        L_0x0141:
            int r3 = r35.mo6139g()     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r7 = m10417i(r3)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r8 = r11 + -1
            byte[] r12 = new byte[r8]     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r14 = 0
            r1.mo6155w(r12, r14, r8)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r3 = m10413e(r12, r14, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r8.<init>(r12, r14, r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            androidx.media3.extractor.metadata.id3.TextInformationFrame r3 = new androidx.media3.extractor.metadata.id3.TextInformationFrame     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r3.<init>(r2, r13, r8)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
        L_0x015f:
            r13 = r3
            goto L_0x0136
        L_0x0161:
            r0 = move-exception
            r14 = r15
            goto L_0x0534
        L_0x0165:
            r2 = r10
            r14 = r15
            goto L_0x0529
        L_0x0169:
            r8 = 87
            java.lang.String r7 = "ISO-8859-1"
            if (r4 != r8) goto L_0x01ab
            if (r5 != r12) goto L_0x01a8
            if (r6 != r12) goto L_0x01a8
            if (r0 == r14) goto L_0x0177
            if (r9 != r12) goto L_0x01a8
        L_0x0177:
            if (r11 > 0) goto L_0x017a
            goto L_0x0136
        L_0x017a:
            int r2 = r35.mo6139g()     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r3 = m10417i(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r8 = r11 + -1
            byte[] r12 = new byte[r8]     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r14 = 0
            r1.mo6155w(r12, r14, r8)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r8 = m10413e(r12, r14, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r13.<init>(r12, r14, r8, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r2 = m10412d(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r8 = r8 + r2
            int r2 = m10414f(r12, r8)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r2 = m10416h(r12, r8, r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            androidx.media3.extractor.metadata.id3.UrlLinkFrame r3 = new androidx.media3.extractor.metadata.id3.UrlLinkFrame     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r7 = "WXXX"
            r3.<init>(r7, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            goto L_0x015f
        L_0x01a8:
            r12 = 87
            goto L_0x01ac
        L_0x01ab:
            r12 = r4
        L_0x01ac:
            if (r12 != r8) goto L_0x01c8
            java.lang.String r2 = m10418j(r0, r8, r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            byte[] r3 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r8 = 0
            r1.mo6155w(r3, r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r12 = m10414f(r3, r8)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r13.<init>(r3, r8, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            androidx.media3.extractor.metadata.id3.UrlLinkFrame r3 = new androidx.media3.extractor.metadata.id3.UrlLinkFrame     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r7 = 0
            r3.<init>(r2, r7, r13)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            goto L_0x015f
        L_0x01c8:
            r8 = 73
            r13 = 80
            if (r12 != r13) goto L_0x01f6
            r12 = 82
            if (r5 != r12) goto L_0x01f4
            if (r6 != r8) goto L_0x01f4
            r12 = 86
            if (r9 != r12) goto L_0x01f4
            byte[] r2 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r3 = 0
            r1.mo6155w(r2, r3, r11)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r8 = m10414f(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r12.<init>(r2, r3, r8, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r3 = 1
            int r8 = r8 + r3
            byte[] r2 = m10420l(r2, r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            androidx.media3.extractor.metadata.id3.PrivFrame r3 = new androidx.media3.extractor.metadata.id3.PrivFrame     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r3.<init>(r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            goto L_0x015f
        L_0x01f4:
            r12 = 80
        L_0x01f6:
            r8 = 79
            r13 = 71
            if (r12 != r13) goto L_0x0258
            r12 = 69
            if (r5 != r12) goto L_0x0253
            if (r6 != r8) goto L_0x0253
            r12 = 66
            if (r9 == r12) goto L_0x0208
            if (r0 != r14) goto L_0x0253
        L_0x0208:
            int r2 = r35.mo6139g()     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r3 = m10417i(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r8 = r11 + -1
            byte[] r12 = new byte[r8]     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r13 = 0
            r1.mo6155w(r12, r13, r8)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            int r14 = m10414f(r12, r13)     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165, all -> 0x0161 }
            r21 = r15
            r15 = 0
            r13.<init>(r12, r15, r14, r7)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r7 = 1
            int r14 = r14 + r7
            int r7 = m10413e(r12, r14, r2)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            java.lang.String r14 = m10416h(r12, r14, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            int r15 = m10412d(r2)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            int r7 = r7 + r15
            int r15 = m10413e(r12, r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            java.lang.String r3 = m10416h(r12, r7, r15, r3)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            int r2 = m10412d(r2)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            int r15 = r15 + r2
            byte[] r2 = m10420l(r12, r15, r8)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            androidx.media3.extractor.metadata.id3.GeobFrame r7 = new androidx.media3.extractor.metadata.id3.GeobFrame     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r7.<init>(r13, r14, r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r23 = r4
            r3 = r5
            r4 = r6
            r13 = r7
            r7 = r9
            r22 = r10
            goto L_0x04ef
        L_0x0253:
            r21 = r15
            r12 = 71
            goto L_0x025a
        L_0x0258:
            r21 = r15
        L_0x025a:
            r13 = 67
            if (r0 != r14) goto L_0x0269
            r15 = 80
            if (r12 != r15) goto L_0x02f3
            r8 = 73
            if (r5 != r8) goto L_0x02f3
            if (r6 != r13) goto L_0x02f3
            goto L_0x0277
        L_0x0269:
            r8 = 73
            r15 = 80
            r14 = 65
            if (r12 != r14) goto L_0x02f3
            if (r5 != r15) goto L_0x02f3
            if (r6 != r8) goto L_0x02f3
            if (r9 != r13) goto L_0x02f3
        L_0x0277:
            int r2 = r35.mo6139g()     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            java.lang.String r3 = m10417i(r2)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            int r8 = r11 + -1
            byte[] r12 = new byte[r8]     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r13 = 0
            r1.mo6155w(r12, r13, r8)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r14 = 2
            if (r0 != r14) goto L_0x02aa
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r15 = 3
            r14.<init>(r12, r13, r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            java.lang.String r7 = "image/"
            java.lang.String r13 = com.google.common.base.C58890d.m90988c(r14)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            java.lang.String r7 = r7.concat(r13)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            java.lang.String r13 = "image/jpg"
            boolean r13 = r13.equals(r7)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            if (r13 == 0) goto L_0x02a8
            java.lang.String r7 = "image/jpeg"
        L_0x02a8:
            r14 = 2
            goto L_0x02ca
        L_0x02aa:
            int r14 = m10414f(r12, r13)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r15.<init>(r12, r13, r14, r7)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            java.lang.String r7 = com.google.common.base.C58890d.m90988c(r15)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r13 = 47
            int r13 = r7.indexOf(r13)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r15 = -1
            if (r13 != r15) goto L_0x02ca
            java.lang.String r13 = "image/"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            java.lang.String r7 = r13.concat(r7)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
        L_0x02ca:
            int r13 = r14 + 1
            byte r13 = r12[r13]     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r13 = r13 & 255(0xff, float:3.57E-43)
            r15 = 2
            int r14 = r14 + r15
            int r15 = m10413e(r12, r14, r2)     // Catch:{ UnsupportedEncodingException -> 0x02f0, all -> 0x0516 }
            r22 = r10
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r23 = r4
            int r4 = r15 - r14
            r10.<init>(r12, r14, r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r2 = m10412d(r2)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r15 = r15 + r2
            byte[] r2 = m10420l(r12, r15, r8)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            androidx.media3.extractor.metadata.id3.ApicFrame r3 = new androidx.media3.extractor.metadata.id3.ApicFrame     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r3.<init>(r7, r10, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            goto L_0x0345
        L_0x02f0:
            r2 = r10
            goto L_0x051c
        L_0x02f3:
            r23 = r4
            r22 = r10
            r4 = 77
            if (r12 != r13) goto L_0x034b
            r8 = 79
            if (r5 != r8) goto L_0x034b
            if (r6 != r4) goto L_0x034b
            if (r9 == r4) goto L_0x0306
            r8 = 2
            if (r0 != r8) goto L_0x034b
        L_0x0306:
            r2 = 4
            if (r11 >= r2) goto L_0x030f
            r3 = r5
            r4 = r6
            r7 = r9
            r13 = 0
            goto L_0x04ef
        L_0x030f:
            int r2 = r35.mo6139g()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            java.lang.String r3 = m10417i(r2)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r4 = 3
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r8 = 0
            r1.mo6155w(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r10.<init>(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r4 = r11 + -4
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r1.mo6155w(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r4 = m10413e(r7, r8, r2)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r12.<init>(r7, r8, r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r8 = m10412d(r2)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r4 = r4 + r8
            int r2 = m10413e(r7, r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            java.lang.String r2 = m10416h(r7, r4, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            androidx.media3.extractor.metadata.id3.CommentFrame r3 = new androidx.media3.extractor.metadata.id3.CommentFrame     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r3.<init>(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
        L_0x0345:
            r13 = r3
            r3 = r5
            r4 = r6
            r7 = r9
            goto L_0x04ef
        L_0x034b:
            if (r12 != r13) goto L_0x03c3
            r8 = 72
            if (r5 != r8) goto L_0x03c3
            r8 = 65
            if (r6 != r8) goto L_0x03c3
            r8 = 80
            if (r9 != r8) goto L_0x03c3
            int r4 = r1.f7235b     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            byte[] r8 = r1.f7234a     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r8 = m10414f(r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            byte[] r12 = r1.f7234a     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r13 = r8 - r4
            r10.<init>(r12, r4, r13, r7)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r7 = 1
            int r8 = r8 + r7
            r1.mo6131A(r8)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r26 = r35.mo6134b()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r27 = r35.mo6134b()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            long r7 = r35.mo6146n()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0386
            r7 = -1
        L_0x0386:
            r28 = r7
            long r7 = r35.mo6146n()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0397
            r7 = -1
        L_0x0397:
            r30 = r7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r7.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r4 = r4 + r11
        L_0x039f:
            int r8 = r1.f7235b     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            if (r8 >= r4) goto L_0x03ae
            r8 = 0
            androidx.media3.extractor.metadata.id3.Id3Frame r12 = m10421m(r0, r1, r2, r3, r8)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            if (r12 == 0) goto L_0x039f
            r7.add(r12)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            goto L_0x039f
        L_0x03ae:
            r2 = 0
            androidx.media3.extractor.metadata.id3.Id3Frame[] r2 = new androidx.media3.extractor.metadata.id3.Id3Frame[r2]     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            java.lang.Object[] r2 = r7.toArray(r2)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r32 = r2
            androidx.media3.extractor.metadata.id3.Id3Frame[] r32 = (androidx.media3.extractor.metadata.id3.Id3Frame[]) r32     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            androidx.media3.extractor.metadata.id3.ChapterFrame r3 = new androidx.media3.extractor.metadata.id3.ChapterFrame     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r24 = r3
            r25 = r10
            r24.<init>(r25, r26, r27, r28, r30, r32)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            goto L_0x0345
        L_0x03c3:
            if (r12 != r13) goto L_0x0469
            r8 = 84
            if (r5 != r8) goto L_0x0469
            r8 = 79
            if (r6 != r8) goto L_0x0469
            if (r9 != r13) goto L_0x0469
            int r4 = r1.f7235b     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            byte[] r8 = r1.f7234a     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r8 = m10414f(r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            byte[] r12 = r1.f7234a     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r13 = r8 - r4
            r10.<init>(r12, r4, r13, r7)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r12 = 1
            int r8 = r8 + r12
            r1.mo6131A(r8)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r8 = r35.mo6139g()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r13 = r8 & 2
            if (r13 == 0) goto L_0x03f0
            r26 = 1
            goto L_0x03f2
        L_0x03f0:
            r26 = 0
        L_0x03f2:
            r8 = r8 & r12
            int r12 = r35.mo6139g()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r14 = 0
        L_0x03fa:
            if (r14 >= r12) goto L_0x0427
            int r15 = r1.f7235b     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r38 = r12
            byte[] r12 = r1.f7234a     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r12 = m10414f(r12, r15)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r16 = r9
            java.lang.String r9 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r17 = r6
            byte[] r6 = r1.f7234a     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r20 = r5
            int r5 = r12 - r15
            r9.<init>(r6, r15, r5, r7)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r13[r14] = r9     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r12 = r12 + 1
            r1.mo6131A(r12)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r14 = r14 + 1
            r12 = r38
            r9 = r16
            r6 = r17
            r5 = r20
            goto L_0x03fa
        L_0x0427:
            r20 = r5
            r17 = r6
            r16 = r9
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r5.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r4 = r4 + r11
        L_0x0433:
            int r6 = r1.f7235b     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            if (r6 >= r4) goto L_0x0442
            r6 = 0
            androidx.media3.extractor.metadata.id3.Id3Frame r7 = m10421m(r0, r1, r2, r3, r6)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            if (r7 == 0) goto L_0x0433
            r5.add(r7)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            goto L_0x0433
        L_0x0442:
            r2 = 0
            androidx.media3.extractor.metadata.id3.Id3Frame[] r3 = new androidx.media3.extractor.metadata.id3.Id3Frame[r2]     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            java.lang.Object[] r2 = r5.toArray(r3)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r29 = r2
            androidx.media3.extractor.metadata.id3.Id3Frame[] r29 = (androidx.media3.extractor.metadata.id3.Id3Frame[]) r29     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            androidx.media3.extractor.metadata.id3.ChapterTocFrame r3 = new androidx.media3.extractor.metadata.id3.ChapterTocFrame     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r2 = 1
            if (r2 == r8) goto L_0x0455
            r27 = 0
            goto L_0x0457
        L_0x0455:
            r27 = 1
        L_0x0457:
            r24 = r3
            r25 = r10
            r28 = r13
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r13 = r3
            r7 = r16
            r4 = r17
            r3 = r20
            goto L_0x04ef
        L_0x0469:
            r20 = r5
            r17 = r6
            r16 = r9
            if (r12 != r4) goto L_0x04d9
            r2 = 76
            r3 = r20
            if (r3 != r2) goto L_0x04d4
            r2 = 76
            r4 = r17
            r7 = r16
            if (r4 != r2) goto L_0x04df
            r2 = 84
            if (r7 != r2) goto L_0x04df
            int r25 = r35.mo6142j()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r26 = r35.mo6140h()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r27 = r35.mo6140h()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r2 = r35.mo6139g()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r5 = r35.mo6139g()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            androidx.media3.common.b.ab r6 = new androidx.media3.common.b.ab     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            byte[] r8 = r1.f7234a     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r9 = r1.f7236c     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r6.mo6123h(r8, r9)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r8 = r1.f7235b     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r8 = r8 * 8
            r6.mo6124i(r8)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r8 = r11 + -10
            int r8 = r8 * 8
            int r9 = r2 + r5
            int r8 = r8 / r9
            int[] r9 = new int[r8]     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int[] r10 = new int[r8]     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r12 = 0
        L_0x04b6:
            if (r12 >= r8) goto L_0x04c7
            int r13 = r6.mo6119d(r2)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r14 = r6.mo6119d(r5)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r9[r12] = r13     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r10[r12] = r14     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            int r12 = r12 + 1
            goto L_0x04b6
        L_0x04c7:
            androidx.media3.extractor.metadata.id3.MlltFrame r2 = new androidx.media3.extractor.metadata.id3.MlltFrame     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r24 = r2
            r28 = r9
            r29 = r10
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r13 = r2
            goto L_0x04ef
        L_0x04d4:
            r7 = r16
            r4 = r17
            goto L_0x04df
        L_0x04d9:
            r7 = r16
            r4 = r17
            r3 = r20
        L_0x04df:
            java.lang.String r2 = m10418j(r0, r12, r3, r4, r7)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            byte[] r5 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r6 = 0
            r1.mo6155w(r5, r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            androidx.media3.extractor.metadata.id3.BinaryFrame r6 = new androidx.media3.extractor.metadata.id3.BinaryFrame     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r6.<init>(r2, r5)     // Catch:{ UnsupportedEncodingException -> 0x0525, all -> 0x0516 }
            r13 = r6
        L_0x04ef:
            if (r13 != 0) goto L_0x051f
            r2 = r23
            java.lang.String r0 = m10418j(r0, r2, r3, r4, r7)     // Catch:{ UnsupportedEncodingException -> 0x051a, all -> 0x0516 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x051a, all -> 0x0516 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x051a, all -> 0x0516 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x051a, all -> 0x0516 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x051a, all -> 0x0516 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x051a, all -> 0x0516 }
            r2.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x051a, all -> 0x0516 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x051a, all -> 0x0516 }
            r2 = r22
            androidx.media3.common.p136b.C2633u.m7050e(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x051c, all -> 0x0516 }
            goto L_0x051f
        L_0x0516:
            r0 = move-exception
            r14 = r21
            goto L_0x0534
        L_0x051a:
            r2 = r22
        L_0x051c:
            r14 = r21
            goto L_0x0529
        L_0x051f:
            r14 = r21
            r1.mo6131A(r14)
            return r13
        L_0x0525:
            r14 = r21
            r2 = r22
        L_0x0529:
            java.lang.String r0 = "Unsupported character encoding"
            androidx.media3.common.p136b.C2633u.m7050e(r2, r0)     // Catch:{ all -> 0x0533 }
            r1.mo6131A(r14)
            r0 = 0
            return r0
        L_0x0533:
            r0 = move-exception
        L_0x0534:
            r1.mo6131A(r14)
            throw r0
        L_0x0538:
            r2 = r10
            r0 = r13
            r14 = r15
            java.lang.String r3 = "Skipping unsupported compressed or encrypted frame"
            androidx.media3.common.p136b.C2633u.m7050e(r2, r3)
            r1.mo6131A(r14)
            return r0
        L_0x0544:
            r0 = r13
            r14 = r15
            r1.mo6131A(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.C3605i.m10421m(int, androidx.media3.common.b.ac, boolean, int, androidx.media3.extractor.metadata.id3.g):androidx.media3.extractor.metadata.id3.Id3Frame");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Metadata mo7492b(C3585b bVar, ByteBuffer byteBuffer) {
        return mo7581c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.common.Metadata mo7581c(byte[] r14, int r15) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.media3.common.b.ac r1 = new androidx.media3.common.b.ac
            r1.<init>(r14, r15)
            int r14 = r1.f7236c
            int r15 = r1.f7235b
            int r14 = r14 - r15
            r15 = 2
            r2 = 4
            r3 = 0
            r4 = 1
            java.lang.String r5 = "Id3Decoder"
            r6 = 0
            r7 = 10
            if (r14 >= r7) goto L_0x0022
            java.lang.String r14 = "Data too short to be an ID3 tag"
            androidx.media3.common.p136b.C2633u.m7050e(r5, r14)
        L_0x001f:
            r10 = r6
            goto L_0x00b4
        L_0x0022:
            int r14 = r1.mo6140h()
            r8 = 4801587(0x494433, float:6.728456E-39)
            if (r14 == r8) goto L_0x0047
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r8[r3] = r14
            java.lang.String r14 = "%06X"
            java.lang.String r14 = java.lang.String.format(r14, r8)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r8 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.String r14 = r8.concat(r14)
            androidx.media3.common.p136b.C2633u.m7050e(r5, r14)
            goto L_0x001f
        L_0x0047:
            int r14 = r1.mo6139g()
            int r8 = r1.f7235b
            int r8 = r8 + r4
            r1.mo6131A(r8)
            int r8 = r1.mo6139g()
            int r9 = r1.mo6138f()
            if (r14 != r15) goto L_0x0065
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0092
            java.lang.String r14 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            androidx.media3.common.p136b.C2633u.m7050e(r5, r14)
            goto L_0x001f
        L_0x0065:
            r10 = 3
            if (r14 != r10) goto L_0x0079
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0092
            int r10 = r1.mo6134b()
            int r11 = r1.f7235b
            int r11 = r11 + r10
            r1.mo6131A(r11)
            int r10 = r10 + r2
            int r9 = r9 - r10
            goto L_0x0092
        L_0x0079:
            if (r14 != r2) goto L_0x00a1
            r10 = r8 & 64
            if (r10 == 0) goto L_0x008c
            int r10 = r1.mo6138f()
            int r11 = r1.f7235b
            int r12 = r10 + -4
            int r11 = r11 + r12
            r1.mo6131A(r11)
            int r9 = r9 - r10
        L_0x008c:
            r10 = r8 & 16
            if (r10 == 0) goto L_0x0092
            int r9 = r9 + -10
        L_0x0092:
            if (r14 >= r2) goto L_0x009a
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x009a
            r8 = 1
            goto L_0x009b
        L_0x009a:
            r8 = 0
        L_0x009b:
            androidx.media3.extractor.metadata.id3.h r10 = new androidx.media3.extractor.metadata.id3.h
            r10.<init>(r14, r8, r9)
            goto L_0x00b4
        L_0x00a1:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Skipped ID3 tag with unsupported majorVersion="
            r8.<init>(r9)
            r8.append(r14)
            java.lang.String r14 = r8.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r5, r14)
            goto L_0x001f
        L_0x00b4:
            if (r10 != 0) goto L_0x00b7
            return r6
        L_0x00b7:
            int r14 = r1.f7235b
            int r8 = r10.f11497a
            if (r8 != r15) goto L_0x00be
            r7 = 6
        L_0x00be:
            int r15 = r10.f11499c
            boolean r8 = r10.f11498b
            if (r8 == 0) goto L_0x00c8
            int r15 = m10415g(r1, r15)
        L_0x00c8:
            int r14 = r14 + r15
            r1.mo6158z(r14)
            int r14 = r10.f11497a
            boolean r14 = m10419k(r1, r14, r7, r3)
            if (r14 != 0) goto L_0x00f4
            int r14 = r10.f11497a
            if (r14 != r2) goto L_0x00e0
            boolean r14 = m10419k(r1, r2, r7, r4)
            if (r14 == 0) goto L_0x00e0
            r3 = 1
            goto L_0x00f4
        L_0x00e0:
            int r14 = r10.f11497a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            r15.<init>(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r5, r14)
            return r6
        L_0x00f4:
            int r14 = r1.f7236c
            int r15 = r1.f7235b
            int r14 = r14 - r15
            if (r14 < r7) goto L_0x0109
            int r14 = r10.f11497a
            androidx.media3.extractor.metadata.id3.g r15 = r13.f11501b
            androidx.media3.extractor.metadata.id3.Id3Frame r14 = m10421m(r14, r1, r3, r7, r15)
            if (r14 == 0) goto L_0x00f4
            r0.add(r14)
            goto L_0x00f4
        L_0x0109:
            androidx.media3.common.Metadata r14 = new androidx.media3.common.Metadata
            r14.<init>((java.util.List) r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.C3605i.mo7581c(byte[], int):androidx.media3.common.Metadata");
    }
}
