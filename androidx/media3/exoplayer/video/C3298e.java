package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.C2598ay;
import androidx.media3.common.C2658bt;
import androidx.media3.common.C2670n;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.common.p136b.C2635w;
import androidx.media3.exoplayer.C2845bo;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.C3004h;
import androidx.media3.exoplayer.C3187i;
import androidx.media3.exoplayer.p142e.C2970af;
import androidx.media3.exoplayer.p142e.C2985o;
import androidx.media3.exoplayer.p142e.C2986p;
import androidx.media3.exoplayer.p142e.C2987q;
import androidx.media3.exoplayer.p142e.C2988r;
import androidx.media3.exoplayer.p142e.C2989s;
import androidx.media3.exoplayer.p142e.C2992v;
import androidx.media3.exoplayer.p142e.C2994x;
import androidx.media3.p134c.C2529g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.video.e */
/* compiled from: PG */
public final class C3298e extends C2992v {

    /* renamed from: f */
    private static final int[] f9932f = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: g */
    private static boolean f9933g;

    /* renamed from: h */
    private static boolean f9934h;

    /* renamed from: A */
    private boolean f9935A;

    /* renamed from: B */
    private int f9936B = 1;

    /* renamed from: C */
    private boolean f9937C;

    /* renamed from: D */
    private boolean f9938D;

    /* renamed from: E */
    private boolean f9939E;

    /* renamed from: F */
    private long f9940F;

    /* renamed from: G */
    private long f9941G = -9223372036854775807L;

    /* renamed from: H */
    private long f9942H;

    /* renamed from: I */
    private int f9943I;

    /* renamed from: J */
    private int f9944J;

    /* renamed from: K */
    private int f9945K;

    /* renamed from: L */
    private long f9946L;

    /* renamed from: M */
    private long f9947M;

    /* renamed from: N */
    private long f9948N;

    /* renamed from: O */
    private int f9949O;

    /* renamed from: P */
    private int f9950P = -1;

    /* renamed from: Q */
    private int f9951Q = -1;

    /* renamed from: R */
    private float f9952R = -1.0f;

    /* renamed from: S */
    private C2658bt f9953S = null;

    /* renamed from: T */
    private int f9954T = 0;

    /* renamed from: U */
    private C3301h f9955U;

    /* renamed from: r */
    private final Context f9956r;

    /* renamed from: s */
    private final C3308o f9957s;

    /* renamed from: t */
    private final C3319z f9958t;

    /* renamed from: u */
    private final boolean f9959u = "NVIDIA".equals(C2612ak.f7251c);

    /* renamed from: v */
    private C3297d f9960v;

    /* renamed from: w */
    private boolean f9961w;

    /* renamed from: x */
    private boolean f9962x;

    /* renamed from: y */
    private Surface f9963y;

    /* renamed from: z */
    private PlaceholderSurface f9964z;

    public C3298e(Context context, C2986p pVar, C2994x xVar, Handler handler, C2845bo boVar) {
        super(2, xVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f9956r = applicationContext;
        this.f9957s = new C3308o(applicationContext);
        this.f9958t = new C3319z(handler, boVar);
    }

    /* renamed from: aA */
    private static List m9548aA(C2680x xVar, boolean z, boolean z2) {
        String str = xVar.f7496n;
        if (str == null) {
            return C58485gu.m89845m();
        }
        List d = C2970af.m8388d(str, z, z2);
        String c = C2970af.m8387c(xVar);
        if (c == null) {
            return C58485gu.m89842j(d);
        }
        List d2 = C2970af.m8388d(c, z, z2);
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(d);
        e.mo55396h(d2);
        return e.mo55394f();
    }

    /* renamed from: aB */
    private static final boolean m9549aB(C2989s sVar) {
        int i = C2612ak.f7249a;
        if (!m9552ar(sVar.f8587a)) {
            return !sVar.f8592f || PlaceholderSurface.m9514a();
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r3.equals("video/av01") != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r11 = ((java.lang.Integer) r11.first).intValue();
     */
    /* renamed from: an */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m9550an(androidx.media3.exoplayer.p142e.C2989s r10, androidx.media3.common.C2680x r11) {
        /*
            int r0 = r11.f7501s
            int r1 = r11.f7502t
            r2 = -1
            if (r0 == r2) goto L_0x00db
            if (r1 != r2) goto L_0x000b
            goto L_0x00db
        L_0x000b:
            java.lang.String r3 = r11.f7496n
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            r5 = 2
            r6 = 1
            java.lang.String r7 = "video/avc"
            java.lang.String r8 = "video/hevc"
            if (r4 == 0) goto L_0x0034
            android.util.Pair r11 = androidx.media3.exoplayer.p142e.C2970af.m8385a(r11)
            if (r11 == 0) goto L_0x0033
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r11 == r3) goto L_0x0031
            if (r11 == r6) goto L_0x0031
            if (r11 != r5) goto L_0x0033
        L_0x0031:
            r3 = r7
            goto L_0x0034
        L_0x0033:
            r3 = r8
        L_0x0034:
            int r11 = r3.hashCode()
            r4 = 3
            r9 = 4
            switch(r11) {
                case -1664118616: goto L_0x0075;
                case -1662735862: goto L_0x006c;
                case -1662541442: goto L_0x0064;
                case 1187890754: goto L_0x005a;
                case 1331836730: goto L_0x0052;
                case 1599127256: goto L_0x0048;
                case 1599127257: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x007f
        L_0x003e:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 6
            goto L_0x0080
        L_0x0048:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 3
            goto L_0x0080
        L_0x0052:
            boolean r11 = r3.equals(r7)
            if (r11 == 0) goto L_0x007f
            r5 = 5
            goto L_0x0080
        L_0x005a:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 1
            goto L_0x0080
        L_0x0064:
            boolean r11 = r3.equals(r8)
            if (r11 == 0) goto L_0x007f
            r5 = 4
            goto L_0x0080
        L_0x006c:
            java.lang.String r11 = "video/av01"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            goto L_0x0080
        L_0x0075:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 0
            goto L_0x0080
        L_0x007f:
            r5 = -1
        L_0x0080:
            switch(r5) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x00d5;
                case 2: goto L_0x00d5;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00c9;
                case 5: goto L_0x008b;
                case 6: goto L_0x0084;
                default: goto L_0x0083;
            }
        L_0x0083:
            return r2
        L_0x0084:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / 8
            return r0
        L_0x008b:
            java.lang.String r11 = "BRAVIA 4K 2015"
            java.lang.String r3 = androidx.media3.common.p136b.C2612ak.f7252d
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x00c8
            java.lang.String r11 = "Amazon"
            java.lang.String r3 = androidx.media3.common.p136b.C2612ak.f7251c
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x00b8
            java.lang.String r11 = "KFSOWI"
            java.lang.String r3 = androidx.media3.common.p136b.C2612ak.f7252d
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x00c8
            java.lang.String r11 = "AFTS"
            java.lang.String r3 = androidx.media3.common.p136b.C2612ak.f7252d
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x00b8
            boolean r10 = r10.f8592f
            if (r10 == 0) goto L_0x00b8
            goto L_0x00c8
        L_0x00b8:
            r10 = 16
            int r11 = androidx.media3.common.p136b.C2612ak.m6979d(r0, r10)
            int r10 = androidx.media3.common.p136b.C2612ak.m6979d(r1, r10)
            int r11 = r11 * r10
            int r11 = r11 * 768
            int r11 = r11 / r9
            return r11
        L_0x00c8:
            return r2
        L_0x00c9:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r9
            r10 = 2097152(0x200000, float:2.938736E-39)
            int r10 = java.lang.Math.max(r10, r0)
            return r10
        L_0x00d5:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r9
            return r0
        L_0x00db:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.C3298e.m9550an(androidx.media3.exoplayer.e.s, androidx.media3.common.x):int");
    }

    /* renamed from: ao */
    protected static int m9551ao(C2989s sVar, C2680x xVar) {
        if (xVar.f7497o == -1) {
            return m9550an(sVar, xVar);
        }
        int size = xVar.f7498p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) xVar.f7498p.get(i2)).length;
        }
        return xVar.f7497o + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: ar */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean m9552ar(java.lang.String r4) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r4 = r4.startsWith(r0)
            r0 = 0
            if (r4 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<androidx.media3.exoplayer.video.e> r4 = androidx.media3.exoplayer.video.C3298e.class
            monitor-enter(r4)
            boolean r1 = f9933g     // Catch:{ all -> 0x0087 }
            if (r1 != 0) goto L_0x0083
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = androidx.media3.common.p136b.C2612ak.f7252d     // Catch:{ all -> 0x0087 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0087 }
            r3 = 1
            switch(r2) {
                case -349662828: goto L_0x006f;
                case -321033677: goto L_0x0065;
                case 2006354: goto L_0x005b;
                case 2006367: goto L_0x0051;
                case 2006371: goto L_0x0047;
                case 1785421873: goto L_0x003d;
                case 1785421876: goto L_0x0033;
                case 1798172390: goto L_0x0028;
                case 2119412532: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0079
        L_0x001e:
            java.lang.String r2 = "AFTEUFF014"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
            r1 = 5
            goto L_0x007a
        L_0x0028:
            java.lang.String r2 = "AFTSO001"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
            r1 = 8
            goto L_0x007a
        L_0x0033:
            java.lang.String r2 = "AFTEU014"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
            r1 = 4
            goto L_0x007a
        L_0x003d:
            java.lang.String r2 = "AFTEU011"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
            r1 = 3
            goto L_0x007a
        L_0x0047:
            java.lang.String r2 = "AFTR"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
            r1 = 2
            goto L_0x007a
        L_0x0051:
            java.lang.String r2 = "AFTN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
            r1 = 1
            goto L_0x007a
        L_0x005b:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
            r1 = 0
            goto L_0x007a
        L_0x0065:
            java.lang.String r2 = "AFTKMST12"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
            r1 = 7
            goto L_0x007a
        L_0x006f:
            java.lang.String r2 = "AFTJMST12"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
            r1 = 6
            goto L_0x007a
        L_0x0079:
            r1 = -1
        L_0x007a:
            switch(r1) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                case 8: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x007f
        L_0x007e:
            r0 = 1
        L_0x007f:
            f9934h = r0     // Catch:{ all -> 0x0087 }
            f9933g = r3     // Catch:{ all -> 0x0087 }
        L_0x0083:
            monitor-exit(r4)     // Catch:{ all -> 0x0087 }
            boolean r4 = f9934h
            return r4
        L_0x0087:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0087 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.C3298e.m9552ar(java.lang.String):boolean");
    }

    /* renamed from: au */
    private final void m9553au() {
        if (this.f9943I > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f9942H;
            C3319z zVar = this.f9958t;
            int i = this.f9943I;
            Handler handler = zVar.f10024a;
            if (handler != null) {
                handler.post(new C3309p(zVar, i, j));
            }
            this.f9943I = 0;
            this.f9942H = elapsedRealtime;
        }
    }

    /* renamed from: av */
    private final void m9554av() {
        C2658bt btVar = this.f9953S;
        if (btVar != null) {
            this.f9958t.mo7310c(btVar);
        }
    }

    /* renamed from: aw */
    private final void m9555aw(long j, long j2, C2680x xVar) {
        C3301h hVar = this.f9955U;
        if (hVar != null) {
            hVar.mo6582c(j, j2, xVar, this.f8641k);
        }
    }

    /* renamed from: ax */
    private final void m9556ax() {
        Surface surface = this.f9963y;
        PlaceholderSurface placeholderSurface = this.f9964z;
        if (surface == placeholderSurface) {
            this.f9963y = null;
        }
        placeholderSurface.release();
        this.f9964z = null;
    }

    /* renamed from: ay */
    private final void m9557ay() {
        this.f9941G = SystemClock.elapsedRealtime() + 5000;
    }

    /* renamed from: az */
    private static boolean m9558az(long j) {
        return j < -30000;
    }

    /* renamed from: B */
    public final void mo6681B(float f, float f2) {
        super.mo6681B(f, f2);
        C3308o oVar = this.f9957s;
        oVar.f9987g = f;
        oVar.mo7294b();
        oVar.mo7297e(false);
    }

    /* renamed from: H */
    public final String mo6504H() {
        return "MediaCodecVideoRenderer";
    }

    /* renamed from: K */
    public final boolean mo6506K() {
        PlaceholderSurface placeholderSurface;
        if (super.mo6506K() && (this.f9937C || (((placeholderSurface = this.f9964z) != null && this.f9963y == placeholderSurface) || this.f8640j == null))) {
            this.f9941G = -9223372036854775807L;
            return true;
        } else if (this.f9941G == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f9941G) {
                return true;
            }
            this.f9941G = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final C3187i mo6507M(C2989s sVar, C2680x xVar, C2680x xVar2) {
        int i;
        int i2;
        C3187i b = sVar.mo6903b(xVar, xVar2);
        int i3 = b.f9538e;
        int i4 = xVar2.f7501s;
        C3297d dVar = this.f9960v;
        if (i4 > dVar.f9929a || xVar2.f7502t > dVar.f9930b) {
            i3 |= 256;
        }
        if (m9551ao(sVar, xVar2) > this.f9960v.f9931c) {
            i3 |= 64;
        }
        String str = sVar.f8587a;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = b.f9537d;
            i = 0;
        }
        return new C3187i(str, xVar, xVar2, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final C3187i mo6508N(C2874cc ccVar) {
        C3187i N = super.mo6508N(ccVar);
        C3319z zVar = this.f9958t;
        C2680x xVar = ccVar.f8096a;
        Handler handler = zVar.f10024a;
        if (handler != null) {
            handler.post(new C3316w(zVar, xVar, N));
        }
        return N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final C2985o mo6509O(C2989s sVar, C2680x xVar, MediaCrypto mediaCrypto, float f) {
        C3297d dVar;
        Pair a;
        Point point;
        int i;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int an;
        C2989s sVar2 = sVar;
        C2680x xVar2 = xVar;
        float f2 = f;
        PlaceholderSurface placeholderSurface = this.f9964z;
        if (!(placeholderSurface == null || placeholderSurface.f9827a == sVar2.f8592f)) {
            m9556ax();
        }
        String str = sVar2.f8589c;
        C2680x[] G = mo6931G();
        int i3 = xVar2.f7501s;
        int i4 = xVar2.f7502t;
        int ao = m9551ao(sVar, xVar);
        int length = G.length;
        if (length == 1) {
            if (!(ao == -1 || (an = m9550an(sVar, xVar)) == -1)) {
                ao = Math.min((int) (((float) ao) * 1.5f), an);
            }
            dVar = new C3297d(i3, i4, ao);
        } else {
            boolean z = false;
            for (int i5 = 0; i5 < length; i5++) {
                C2680x xVar3 = G[i5];
                C2670n nVar = xVar2.f7508z;
                if (nVar != null && xVar3.f7508z == null) {
                    C2679w wVar = new C2679w(xVar3);
                    wVar.f7471w = nVar;
                    xVar3 = new C2680x(wVar);
                }
                if (sVar2.mo6903b(xVar2, xVar3).f9537d != 0) {
                    int i6 = xVar3.f7501s;
                    z |= i6 == -1 || xVar3.f7502t == -1;
                    i3 = Math.max(i3, i6);
                    i4 = Math.max(i4, xVar3.f7502t);
                    ao = Math.max(ao, m9551ao(sVar2, xVar3));
                }
            }
            if (z) {
                C2633u.m7050e("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i3 + "x" + i4);
                int i7 = xVar2.f7502t;
                int i8 = xVar2.f7501s;
                boolean z2 = i7 > i8;
                int i9 = z2 ? i7 : i8;
                if (true == z2) {
                    i7 = i8;
                }
                float f3 = ((float) i7) / ((float) i9);
                int[] iArr = f9932f;
                int i10 = 0;
                while (true) {
                    if (i10 >= 9) {
                        break;
                    }
                    int i11 = iArr[i10];
                    int[] iArr2 = iArr;
                    int i12 = (int) (((float) i11) * f3);
                    if (i11 <= i9 || i12 <= i7) {
                        break;
                    }
                    int i13 = i11;
                    if (true != z2) {
                        i = i7;
                        i2 = i13;
                    } else {
                        i = i7;
                        i2 = i12;
                    }
                    int i14 = true != z2 ? i12 : i13;
                    int i15 = C2612ak.f7249a;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = sVar2.f8590d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        point = null;
                    } else {
                        point = C2989s.m8460a(videoCapabilities, i2, i14);
                    }
                    float f4 = f3;
                    boolean z3 = z2;
                    int i16 = i9;
                    if (sVar2.mo6906e(point.x, point.y, (double) xVar2.f7503u)) {
                        break;
                    }
                    i10++;
                    iArr = iArr2;
                    f3 = f4;
                    i7 = i;
                    z2 = z3;
                    i9 = i16;
                }
                point = null;
                if (point != null) {
                    i3 = Math.max(i3, point.x);
                    i4 = Math.max(i4, point.y);
                    C2679w wVar2 = new C2679w(xVar2);
                    wVar2.f7464p = i3;
                    wVar2.f7465q = i4;
                    ao = Math.max(ao, m9550an(sVar2, new C2680x(wVar2)));
                    C2633u.m7050e("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i3 + "x" + i4);
                }
            }
            dVar = new C3297d(i3, i4, ao);
        }
        this.f9960v = dVar;
        boolean z4 = this.f9959u;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", xVar2.f7501s);
        mediaFormat.setInteger("height", xVar2.f7502t);
        C2635w.m7054b(mediaFormat, xVar2.f7498p);
        float f5 = xVar2.f7503u;
        if (f5 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f5);
        }
        C2635w.m7053a(mediaFormat, "rotation-degrees", xVar2.f7504v);
        C2670n nVar2 = xVar2.f7508z;
        if (nVar2 != null) {
            C2635w.m7053a(mediaFormat, "color-transfer", nVar2.f7435c);
            C2635w.m7053a(mediaFormat, "color-standard", nVar2.f7433a);
            C2635w.m7053a(mediaFormat, "color-range", nVar2.f7434b);
            byte[] bArr = nVar2.f7436d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(xVar2.f7496n) && (a = C2970af.m8385a(xVar)) != null) {
            C2635w.m7053a(mediaFormat, "profile", ((Integer) a.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.f9929a);
        mediaFormat.setInteger("max-height", dVar.f9930b);
        C2635w.m7053a(mediaFormat, "max-input-size", dVar.f9931c);
        int i17 = C2612ak.f7249a;
        mediaFormat.setInteger("priority", 0);
        float f6 = f;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f6);
        }
        if (z4) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.f9963y == null) {
            if (m9549aB(sVar)) {
                if (this.f9964z == null) {
                    this.f9964z = PlaceholderSurface.m9515b(sVar2.f8592f);
                }
                this.f9963y = this.f9964z;
            } else {
                throw new IllegalStateException();
            }
        }
        return new C2985o(sVar, mediaFormat, xVar, this.f9963y, (MediaCrypto) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void mo6510P(Exception exc) {
        C2633u.m7048c("MediaCodecVideoRenderer", C2633u.m7046a("Video codec error", exc));
        C3319z zVar = this.f9958t;
        Handler handler = zVar.f10024a;
        if (handler != null) {
            handler.post(new C3311r(zVar, exc));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final void mo6511Q(String str) {
        C3319z zVar = this.f9958t;
        Handler handler = zVar.f10024a;
        if (handler != null) {
            handler.post(new C3318y(zVar, str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo6512R(C2680x xVar, MediaFormat mediaFormat) {
        int i;
        int i2;
        C2987q qVar = this.f8640j;
        if (qVar != null) {
            qVar.mo6878l(this.f9936B);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f9950P = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f9951Q = i2;
        this.f9952R = xVar.f7505w;
        int i3 = C2612ak.f7249a;
        int i4 = xVar.f7504v;
        if (i4 == 90 || i4 == 270) {
            int i5 = this.f9950P;
            this.f9950P = this.f9951Q;
            this.f9951Q = i5;
            this.f9952R = 1.0f / this.f9952R;
        }
        C3308o oVar = this.f9957s;
        oVar.f9986f = xVar.f7503u;
        C3295b bVar = oVar.f9981a;
        bVar.f9924a.mo7262c();
        bVar.f9925b.mo7262c();
        bVar.f9926c = false;
        bVar.f9927d = -9223372036854775807L;
        bVar.f9928e = 0;
        oVar.mo7296d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo6513S() {
        this.f9937C = false;
        int i = C2612ak.f7249a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo6514T(C2529g gVar) {
        this.f9945K++;
        int i = C2612ak.f7249a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final float mo6518X(float f, C2680x[] xVarArr) {
        float f2 = -1.0f;
        for (C2680x xVar : xVarArr) {
            float f3 = xVar.f7503u;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo6519Y(String str, long j, long j2) {
        C3319z zVar = this.f9958t;
        Handler handler = zVar.f10024a;
        if (handler != null) {
            handler.post(new C3315v(zVar, str, j, j2));
        }
        this.f9961w = m9552ar(str);
        C2989s sVar = this.f8642l;
        sVar.getClass();
        int i = C2612ak.f7249a;
        boolean z = false;
        if ("video/x-vnd.on2.vp9".equals(sVar.f8588b)) {
            MediaCodecInfo.CodecProfileLevel[] f = sVar.mo6907f();
            int length = f.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (f[i2].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f9962x = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final List mo6520Z(C2680x xVar, boolean z) {
        return C2970af.m8389e(m9548aA(xVar, false, false), xVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final int mo6522aa(C2680x xVar) {
        boolean z;
        int i = 128;
        if (!C2598ay.m6817p(xVar.f7496n)) {
            return 128;
        }
        int i2 = 0;
        boolean z2 = xVar.f7499q != null;
        List aA = m9548aA(xVar, z2, false);
        if (z2 && aA.isEmpty()) {
            aA = m9548aA(xVar, false, false);
        }
        if (aA.isEmpty()) {
            return 129;
        }
        if (!m8470al(xVar)) {
            return 130;
        }
        C2989s sVar = (C2989s) aA.get(0);
        boolean c = sVar.mo6904c(xVar);
        if (!c) {
            int i3 = 1;
            while (true) {
                if (i3 >= aA.size()) {
                    break;
                }
                C2989s sVar2 = (C2989s) aA.get(i3);
                if (sVar2.mo6904c(xVar)) {
                    sVar = sVar2;
                    z = false;
                    c = true;
                    break;
                }
                i3++;
            }
        }
        z = true;
        int i4 = true != c ? 3 : 4;
        int i5 = true != sVar.mo6905d(xVar) ? 8 : 16;
        int i6 = true != sVar.f8593g ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        if (c) {
            List aA2 = m9548aA(xVar, z2, true);
            if (!aA2.isEmpty()) {
                C2989s sVar3 = (C2989s) C2970af.m8389e(aA2, xVar).get(0);
                if (sVar3.mo6904c(xVar) && sVar3.mo6905d(xVar)) {
                    i2 = 32;
                }
            }
        }
        return i4 | i5 | i2 | i6 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public final C2988r mo6909ab(Throwable th, C2989s sVar) {
        return new C3296c(th, sVar, this.f9963y);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo6910ac(C2529g gVar) {
        if (this.f9962x) {
            ByteBuffer byteBuffer = gVar.f6958f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b != -75 || s != 60 || s2 != 1 || b2 != 4) {
                    return;
                }
                if (b3 == 0 || b3 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    C2987q qVar = this.f8640j;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    qVar.mo6877k(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public final void mo6912ae(long j) {
        super.mo6912ae(j);
        this.f9945K--;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ag */
    public final void mo6914ag() {
        super.mo6914ag();
        this.f9945K = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aj */
    public final boolean mo6917aj() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ak */
    public final boolean mo6918ak(C2989s sVar) {
        return this.f9963y != null || m9549aB(sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ap */
    public final void mo7281ap(int i, int i2) {
        C3004h hVar = this.f8646p;
        hVar.f8701h += i;
        int i3 = i + i2;
        hVar.f8700g += i3;
        this.f9943I += i3;
        int i4 = this.f9944J + i3;
        this.f9944J = i4;
        hVar.f8702i = Math.max(i4, hVar.f8702i);
        if (this.f9943I >= 50) {
            m9553au();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aq */
    public final void mo7282aq(long j) {
        C3004h hVar = this.f8646p;
        hVar.f8704k += j;
        hVar.f8705l++;
        this.f9948N += j;
        this.f9949O++;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: as */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7283as(androidx.media3.exoplayer.p142e.C2987q r5, int r6, long r7) {
        /*
            r4 = this;
            int r0 = r4.f9950P
            r1 = -1
            if (r0 != r1) goto L_0x000a
            int r0 = r4.f9951Q
            if (r0 == r1) goto L_0x0030
            r0 = -1
        L_0x000a:
            androidx.media3.common.bt r1 = r4.f9953S
            if (r1 == 0) goto L_0x0020
            int r2 = r1.f7408a
            if (r2 != r0) goto L_0x0020
            int r2 = r1.f7409b
            int r3 = r4.f9951Q
            if (r2 != r3) goto L_0x0020
            float r1 = r1.f7411d
            float r2 = r4.f9952R
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0030
        L_0x0020:
            androidx.media3.common.bt r1 = new androidx.media3.common.bt
            int r2 = r4.f9951Q
            float r3 = r4.f9952R
            r1.<init>(r0, r2, r3)
            r4.f9953S = r1
            androidx.media3.exoplayer.video.z r0 = r4.f9958t
            r0.mo7310c(r1)
        L_0x0030:
            int r0 = androidx.media3.common.p136b.C2612ak.f7249a
            java.lang.String r0 = "releaseOutputBuffer"
            android.os.Trace.beginSection(r0)
            r5.mo6875i(r6, r7)
            android.os.Trace.endSection()
            long r5 = android.os.SystemClock.elapsedRealtime()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r4.f9947M = r5
            androidx.media3.exoplayer.h r5 = r4.f8646p
            int r6 = r5.f8698e
            r7 = 1
            int r6 = r6 + r7
            r5.f8698e = r6
            r5 = 0
            r4.f9944J = r5
            r4.f9939E = r7
            boolean r5 = r4.f9937C
            if (r5 != 0) goto L_0x0063
            r4.f9937C = r7
            androidx.media3.exoplayer.video.z r5 = r4.f9958t
            android.view.Surface r6 = r4.f9963y
            r5.mo7309b(r6)
            r4.f9935A = r7
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.C3298e.mo7283as(androidx.media3.exoplayer.e.q, int, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public final void mo7284at(C2987q qVar, int i) {
        int i2 = C2612ak.f7249a;
        Trace.beginSection("skipVideoBuffer");
        qVar.mo6882p(i);
        Trace.endSection();
        this.f8646p.f8699f++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo6527q() {
        this.f9953S = null;
        this.f9937C = false;
        int i = C2612ak.f7249a;
        this.f9935A = false;
        try {
            super.mo6527q();
        } finally {
            this.f9958t.mo7308a(this.f8646p);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo6528r(boolean z, boolean z2) {
        super.mo6528r(z, z2);
        this.f8680a.getClass();
        C3319z zVar = this.f9958t;
        C3004h hVar = this.f8646p;
        Handler handler = zVar.f10024a;
        if (handler != null) {
            handler.post(new C3313t(zVar, hVar));
        }
        this.f9938D = z2;
        this.f9939E = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo6529s(long j, boolean z) {
        super.mo6529s(j, z);
        this.f9937C = false;
        int i = C2612ak.f7249a;
        this.f9957s.mo7294b();
        this.f9946L = -9223372036854775807L;
        this.f9940F = -9223372036854775807L;
        this.f9944J = 0;
        if (z) {
            m9557ay();
        } else {
            this.f9941G = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo6530t() {
        try {
            super.mo6530t();
            if (this.f9964z != null) {
                m9556ax();
            }
        } catch (Throwable th) {
            if (this.f9964z != null) {
                m9556ax();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo6531u() {
        this.f9943I = 0;
        this.f9942H = SystemClock.elapsedRealtime();
        this.f9947M = SystemClock.elapsedRealtime() * 1000;
        this.f9948N = 0;
        this.f9949O = 0;
        C3308o oVar = this.f9957s;
        oVar.f9984d = true;
        oVar.mo7294b();
        if (oVar.f9982b != null) {
            C3307n nVar = oVar.f9983c;
            nVar.getClass();
            nVar.f9977c.sendEmptyMessage(1);
            oVar.f9982b.mo7287b(new C3302i(oVar));
        }
        oVar.mo7297e(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo6532v() {
        this.f9941G = -9223372036854775807L;
        m9553au();
        int i = this.f9949O;
        if (i != 0) {
            C3319z zVar = this.f9958t;
            long j = this.f9948N;
            Handler handler = zVar.f10024a;
            if (handler != null) {
                handler.post(new C3312s(zVar, j, i));
            }
            this.f9948N = 0;
            this.f9949O = 0;
        }
        C3308o oVar = this.f9957s;
        oVar.f9984d = false;
        C3304k kVar = oVar.f9982b;
        if (kVar != null) {
            kVar.mo7286a();
            C3307n nVar = oVar.f9983c;
            nVar.getClass();
            nVar.f9977c.sendEmptyMessage(2);
        }
        oVar.mo7293a();
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6526n(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L_0x0046
            r1 = 7
            if (r5 == r1) goto L_0x0041
            r1 = 10
            if (r5 == r1) goto L_0x0034
            r1 = 4
            if (r5 == r1) goto L_0x0024
            r1 = 5
            if (r5 == r1) goto L_0x0012
            goto L_0x00ce
        L_0x0012:
            androidx.media3.exoplayer.video.o r5 = r4.f9957s
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r1 = r5.f9988h
            if (r1 == r6) goto L_0x00ce
            r5.f9988h = r6
            r5.mo7297e(r0)
            return
        L_0x0024:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            r4.f9936B = r5
            androidx.media3.exoplayer.e.q r6 = r4.f8640j
            if (r6 == 0) goto L_0x00ce
            r6.mo6878l(r5)
            return
        L_0x0034:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            int r6 = r4.f9954T
            if (r6 == r5) goto L_0x00ce
            r4.f9954T = r5
            return
        L_0x0041:
            androidx.media3.exoplayer.video.h r6 = (androidx.media3.exoplayer.video.C3301h) r6
            r4.f9955U = r6
            return
        L_0x0046:
            boolean r5 = r6 instanceof android.view.Surface
            r1 = 0
            if (r5 == 0) goto L_0x004e
            android.view.Surface r6 = (android.view.Surface) r6
            goto L_0x004f
        L_0x004e:
            r6 = r1
        L_0x004f:
            if (r6 != 0) goto L_0x0069
            androidx.media3.exoplayer.video.PlaceholderSurface r5 = r4.f9964z
            if (r5 == 0) goto L_0x0057
            r6 = r5
            goto L_0x0069
        L_0x0057:
            androidx.media3.exoplayer.e.s r5 = r4.f8642l
            if (r5 == 0) goto L_0x0069
            boolean r2 = m9549aB(r5)
            if (r2 == 0) goto L_0x0069
            boolean r5 = r5.f8592f
            androidx.media3.exoplayer.video.PlaceholderSurface r6 = androidx.media3.exoplayer.video.PlaceholderSurface.m9515b(r5)
            r4.f9964z = r6
        L_0x0069:
            android.view.Surface r5 = r4.f9963y
            if (r5 == r6) goto L_0x00ba
            r4.f9963y = r6
            androidx.media3.exoplayer.video.o r5 = r4.f9957s
            boolean r2 = r6 instanceof androidx.media3.exoplayer.video.PlaceholderSurface
            if (r0 == r2) goto L_0x0077
            r2 = r6
            goto L_0x0078
        L_0x0077:
            r2 = r1
        L_0x0078:
            android.view.Surface r3 = r5.f9985e
            if (r3 == r2) goto L_0x0084
            r5.mo7293a()
            r5.f9985e = r2
            r5.mo7297e(r0)
        L_0x0084:
            r5 = 0
            r4.f9935A = r5
            int r0 = r4.f8682c
            androidx.media3.exoplayer.e.q r2 = r4.f8640j
            if (r2 == 0) goto L_0x009f
            int r3 = androidx.media3.common.p136b.C2612ak.f7249a
            if (r6 == 0) goto L_0x0099
            boolean r3 = r4.f9961w
            if (r3 != 0) goto L_0x0099
            r2.mo6876j(r6)
            goto L_0x009f
        L_0x0099:
            r4.mo6913af()
            r4.mo6911ad()
        L_0x009f:
            if (r6 == 0) goto L_0x00b3
            androidx.media3.exoplayer.video.PlaceholderSurface r2 = r4.f9964z
            if (r6 == r2) goto L_0x00b3
            r4.m9554av()
            r4.f9937C = r5
            int r5 = androidx.media3.common.p136b.C2612ak.f7249a
            r5 = 2
            if (r0 != r5) goto L_0x00ce
            r4.m9557ay()
            return
        L_0x00b3:
            r4.f9953S = r1
            r4.f9937C = r5
            int r5 = androidx.media3.common.p136b.C2612ak.f7249a
            return
        L_0x00ba:
            if (r6 == 0) goto L_0x00ce
            androidx.media3.exoplayer.video.PlaceholderSurface r5 = r4.f9964z
            if (r6 == r5) goto L_0x00ce
            r4.m9554av()
            boolean r5 = r4.f9935A
            if (r5 == 0) goto L_0x00ce
            androidx.media3.exoplayer.video.z r5 = r4.f9958t
            android.view.Surface r6 = r4.f9963y
            r5.mo7309b(r6)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.C3298e.mo6526n(int, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        if (r13.f9832c[(int) ((r11 - 1) % 15)] == false) goto L_0x0084;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6516V(long r28, long r30, androidx.media3.exoplayer.p142e.C2987q r32, java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, androidx.media3.common.C2680x r41) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r3 = r32
            r4 = r34
            r5 = r37
            r32.getClass()
            long r7 = r0.f9940F
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x001a
            r0.f9940F = r1
        L_0x001a:
            long r7 = r0.f9946L
            r11 = -1
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x00b9
            androidx.media3.exoplayer.video.o r7 = r0.f9957s
            long r9 = r7.f9992l
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0033
            r7.f9994n = r9
            long r8 = r7.f9993m
            r7.f9995o = r8
        L_0x0033:
            long r8 = r7.f9991k
            r16 = 1
            long r8 = r8 + r16
            r7.f9991k = r8
            androidx.media3.exoplayer.video.b r8 = r7.f9981a
            long r9 = r5 * r13
            androidx.media3.exoplayer.video.a r13 = r8.f9924a
            r13.mo7261b(r9)
            androidx.media3.exoplayer.video.a r13 = r8.f9924a
            boolean r13 = r13.mo7263d()
            if (r13 == 0) goto L_0x004f
            r8.f9926c = r15
            goto L_0x008c
        L_0x004f:
            long r13 = r8.f9927d
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r20 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r20 == 0) goto L_0x008c
            boolean r13 = r8.f9926c
            if (r13 == 0) goto L_0x0078
            androidx.media3.exoplayer.video.a r13 = r8.f9925b
            long r11 = r13.f9830a
            r20 = 0
            int r14 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r14 != 0) goto L_0x0069
            goto L_0x0084
        L_0x0069:
            boolean[] r13 = r13.f9832c
            r18 = -1
            long r11 = r11 + r18
            r20 = 15
            long r11 = r11 % r20
            int r12 = (int) r11
            boolean r11 = r13[r12]
            if (r11 == 0) goto L_0x0084
        L_0x0078:
            androidx.media3.exoplayer.video.a r11 = r8.f9925b
            r11.mo7262c()
            androidx.media3.exoplayer.video.a r11 = r8.f9925b
            long r12 = r8.f9927d
            r11.mo7261b(r12)
        L_0x0084:
            r11 = 1
            r8.f9926c = r11
            androidx.media3.exoplayer.video.a r11 = r8.f9925b
            r11.mo7261b(r9)
        L_0x008c:
            boolean r11 = r8.f9926c
            if (r11 == 0) goto L_0x00a2
            androidx.media3.exoplayer.video.a r11 = r8.f9925b
            boolean r11 = r11.mo7263d()
            if (r11 == 0) goto L_0x00a2
            androidx.media3.exoplayer.video.a r11 = r8.f9924a
            androidx.media3.exoplayer.video.a r12 = r8.f9925b
            r8.f9924a = r12
            r8.f9925b = r11
            r8.f9926c = r15
        L_0x00a2:
            r8.f9927d = r9
            androidx.media3.exoplayer.video.a r9 = r8.f9924a
            boolean r9 = r9.mo7263d()
            if (r9 == 0) goto L_0x00ae
            r9 = 0
            goto L_0x00b2
        L_0x00ae:
            int r9 = r8.f9928e
            r10 = 1
            int r9 = r9 + r10
        L_0x00b2:
            r8.f9928e = r9
            r7.mo7296d()
            r0.f9946L = r5
        L_0x00b9:
            long r7 = r0.f8647q
            long r9 = r5 - r7
            if (r39 == 0) goto L_0x00c7
            if (r40 == 0) goto L_0x00c2
            goto L_0x00c7
        L_0x00c2:
            r0.mo7284at(r3, r4)
            r1 = 1
            return r1
        L_0x00c7:
            float r11 = r0.f8639i
            double r11 = (double) r11
            int r13 = r0.f8682c
            r14 = 2
            if (r13 != r14) goto L_0x00d1
            r13 = 1
            goto L_0x00d2
        L_0x00d1:
            r13 = 0
        L_0x00d2:
            long r20 = android.os.SystemClock.elapsedRealtime()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r16
            long r5 = r5 - r1
            double r5 = (double) r5
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r11)
            double r5 = r5 / r11
            long r5 = (long) r5
            if (r13 == 0) goto L_0x00e9
            long r11 = r20 - r30
            long r5 = r5 - r11
        L_0x00e9:
            android.view.Surface r11 = r0.f9963y
            androidx.media3.exoplayer.video.PlaceholderSurface r12 = r0.f9964z
            if (r11 != r12) goto L_0x00fe
            boolean r1 = m9558az(r5)
            if (r1 == 0) goto L_0x00fd
            r0.mo7284at(r3, r4)
            r0.mo7282aq(r5)
            r1 = 1
            return r1
        L_0x00fd:
            return r15
        L_0x00fe:
            long r11 = r0.f9947M
            long r20 = r20 - r11
            boolean r11 = r0.f9939E
            if (r11 != 0) goto L_0x010d
            if (r13 != 0) goto L_0x0111
            boolean r11 = r0.f9938D
            if (r11 == 0) goto L_0x0113
            goto L_0x0111
        L_0x010d:
            boolean r11 = r0.f9937C
            if (r11 != 0) goto L_0x0113
        L_0x0111:
            r11 = 1
            goto L_0x0114
        L_0x0113:
            r11 = 0
        L_0x0114:
            long r14 = r0.f9941G
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r24 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r24 != 0) goto L_0x014e
            int r14 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r14 < 0) goto L_0x014e
            if (r11 != 0) goto L_0x0135
            if (r13 == 0) goto L_0x014e
            boolean r7 = m9558az(r5)
            if (r7 == 0) goto L_0x014e
            r7 = 100000(0x186a0, double:4.94066E-319)
            int r11 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x0135
            goto L_0x014e
        L_0x0135:
            long r1 = java.lang.System.nanoTime()
            r35 = r27
            r36 = r9
            r38 = r1
            r40 = r41
            r35.m9555aw(r36, r38, r40)
            int r7 = androidx.media3.common.p136b.C2612ak.f7249a
            r0.mo7283as(r3, r4, r1)
            r0.mo7282aq(r5)
            r1 = 1
            return r1
        L_0x014e:
            if (r13 == 0) goto L_0x027a
            long r7 = r0.f9940F
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0158
            goto L_0x027a
        L_0x0158:
            long r7 = java.lang.System.nanoTime()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r13
            long r5 = r5 + r7
            androidx.media3.exoplayer.video.o r11 = r0.f9957s
            long r13 = r11.f9994n
            r18 = -1
            int r15 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r15 == 0) goto L_0x01b0
            androidx.media3.exoplayer.video.b r13 = r11.f9981a
            androidx.media3.exoplayer.video.a r13 = r13.f9924a
            boolean r13 = r13.mo7263d()
            if (r13 == 0) goto L_0x01b0
            androidx.media3.exoplayer.video.b r13 = r11.f9981a
            androidx.media3.exoplayer.video.a r14 = r13.f9924a
            boolean r14 = r14.mo7263d()
            if (r14 == 0) goto L_0x0188
            androidx.media3.exoplayer.video.a r13 = r13.f9924a
            long r13 = r13.mo7260a()
            r37 = r13
            goto L_0x018d
        L_0x0188:
            r37 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x018d:
            long r12 = r11.f9995o
            long r14 = r11.f9991k
            long r1 = r11.f9994n
            long r14 = r14 - r1
            r1 = r37
            long r1 = r1 * r14
            float r1 = (float) r1
            float r2 = r11.f9987g
            float r1 = r1 / r2
            long r1 = (long) r1
            long r12 = r12 + r1
            long r1 = r5 - r12
            long r1 = java.lang.Math.abs(r1)
            r14 = 20000000(0x1312d00, double:9.881313E-317)
            int r18 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r18 > 0) goto L_0x01ad
            r5 = r12
            goto L_0x01b0
        L_0x01ad:
            r11.mo7294b()
        L_0x01b0:
            long r1 = r11.f9991k
            r11.f9992l = r1
            r11.f9993m = r5
            androidx.media3.exoplayer.video.n r1 = r11.f9983c
            if (r1 == 0) goto L_0x01ef
            long r12 = r11.f9989i
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x01c6
            goto L_0x01ef
        L_0x01c6:
            long r1 = r1.f9976b
            int r12 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x01cd
            goto L_0x01ef
        L_0x01cd:
            long r12 = r11.f9989i
            long r14 = r5 - r1
            long r14 = r14 / r12
            long r14 = r14 * r12
            long r1 = r1 + r14
            int r14 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r14 > 0) goto L_0x01dc
            long r12 = r1 - r12
            goto L_0x01e2
        L_0x01dc:
            long r12 = r12 + r1
            r25 = r1
            r1 = r12
            r12 = r25
        L_0x01e2:
            long r14 = r1 - r5
            long r5 = r5 - r12
            int r18 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r18 >= 0) goto L_0x01ea
            goto L_0x01eb
        L_0x01ea:
            r1 = r12
        L_0x01eb:
            long r5 = r11.f9990j
            long r5 = r1 - r5
        L_0x01ef:
            long r1 = r5 - r7
            r7 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r7
            long r7 = r0.f9941G
            r11 = -500000(0xfffffffffff85ee0, double:NaN)
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0230
            if (r40 != 0) goto L_0x0230
            int r11 = r27.mo6932d(r28)
            if (r11 != 0) goto L_0x0206
            goto L_0x0230
        L_0x0206:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x021e
            androidx.media3.exoplayer.h r1 = r0.f8646p
            int r2 = r1.f8697d
            int r2 = r2 + r11
            r1.f8697d = r2
            int r2 = r1.f8699f
            int r3 = r0.f9945K
            int r2 = r2 + r3
            r1.f8699f = r2
            goto L_0x022b
        L_0x021e:
            androidx.media3.exoplayer.h r1 = r0.f8646p
            int r2 = r1.f8703j
            r3 = 1
            int r2 = r2 + r3
            r1.f8703j = r2
            int r1 = r0.f9945K
            r0.mo7281ap(r11, r1)
        L_0x022b:
            r27.mo6919am()
            r1 = 0
            return r1
        L_0x0230:
            boolean r11 = m9558az(r1)
            if (r11 == 0) goto L_0x025c
            if (r40 != 0) goto L_0x025c
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0246
            r0.mo7284at(r3, r4)
            r4 = 1
            goto L_0x0258
        L_0x0246:
            int r5 = androidx.media3.common.p136b.C2612ak.f7249a
            java.lang.String r5 = "dropVideoBuffer"
            android.os.Trace.beginSection(r5)
            r3.mo6882p(r4)
            android.os.Trace.endSection()
            r3 = 0
            r4 = 1
            r0.mo7281ap(r3, r4)
        L_0x0258:
            r0.mo7282aq(r1)
            return r4
        L_0x025c:
            int r7 = androidx.media3.common.p136b.C2612ak.f7249a
            r7 = 50000(0xc350, double:2.47033E-319)
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x0278
            r35 = r27
            r36 = r9
            r38 = r5
            r40 = r41
            r35.m9555aw(r36, r38, r40)
            r0.mo7283as(r3, r4, r5)
            r0.mo7282aq(r1)
            r1 = 1
            return r1
        L_0x0278:
            r1 = 0
            return r1
        L_0x027a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.C3298e.mo6516V(long, long, androidx.media3.exoplayer.e.q, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, androidx.media3.common.x):boolean");
    }
}
