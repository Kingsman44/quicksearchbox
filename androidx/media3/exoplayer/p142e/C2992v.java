package androidx.media3.exoplayer.p142e;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2608ag;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.C3001g;
import androidx.media3.exoplayer.C3004h;
import androidx.media3.exoplayer.C3187i;
import androidx.media3.exoplayer.C3267o;
import androidx.media3.exoplayer.p139c.C2869l;
import androidx.media3.exoplayer.p145h.C3095cf;
import androidx.media3.extractor.C3344as;
import androidx.media3.p134c.C2525c;
import androidx.media3.p134c.C2528f;
import androidx.media3.p134c.C2529g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.e.v */
/* compiled from: PG */
public abstract class C2992v extends C3001g {

    /* renamed from: A */
    private C2680x f8599A;

    /* renamed from: B */
    private C2680x f8600B;

    /* renamed from: C */
    private MediaCrypto f8601C;

    /* renamed from: D */
    private boolean f8602D;

    /* renamed from: E */
    private long f8603E;

    /* renamed from: F */
    private float f8604F;

    /* renamed from: G */
    private C2680x f8605G;

    /* renamed from: H */
    private boolean f8606H;

    /* renamed from: I */
    private float f8607I;

    /* renamed from: J */
    private ArrayDeque f8608J;

    /* renamed from: K */
    private C2991u f8609K;

    /* renamed from: L */
    private boolean f8610L;

    /* renamed from: M */
    private boolean f8611M;

    /* renamed from: N */
    private C2982l f8612N;

    /* renamed from: O */
    private long f8613O;

    /* renamed from: P */
    private int f8614P;

    /* renamed from: Q */
    private int f8615Q;

    /* renamed from: R */
    private ByteBuffer f8616R;

    /* renamed from: S */
    private boolean f8617S;

    /* renamed from: T */
    private boolean f8618T;

    /* renamed from: U */
    private boolean f8619U;

    /* renamed from: V */
    private boolean f8620V;

    /* renamed from: W */
    private boolean f8621W;

    /* renamed from: X */
    private boolean f8622X;

    /* renamed from: Y */
    private int f8623Y;

    /* renamed from: Z */
    private int f8624Z;

    /* renamed from: aa */
    private int f8625aa;

    /* renamed from: ab */
    private boolean f8626ab;

    /* renamed from: ac */
    private boolean f8627ac;

    /* renamed from: ad */
    private long f8628ad;

    /* renamed from: ae */
    private long f8629ae;

    /* renamed from: af */
    private boolean f8630af;

    /* renamed from: ag */
    private boolean f8631ag;

    /* renamed from: ah */
    private long f8632ah;

    /* renamed from: ai */
    private int f8633ai;

    /* renamed from: aj */
    private C2869l f8634aj;

    /* renamed from: ak */
    private C2869l f8635ak;

    /* renamed from: f */
    private final C2994x f8636f;

    /* renamed from: g */
    private final float f8637g;

    /* renamed from: h */
    private final C2529g f8638h = new C2529g(0);

    /* renamed from: i */
    public float f8639i;

    /* renamed from: j */
    public C2987q f8640j;

    /* renamed from: k */
    public MediaFormat f8641k;

    /* renamed from: l */
    public C2989s f8642l;

    /* renamed from: m */
    public boolean f8643m;

    /* renamed from: n */
    public boolean f8644n;

    /* renamed from: o */
    public C3267o f8645o;

    /* renamed from: p */
    public C3004h f8646p;

    /* renamed from: q */
    public long f8647q;

    /* renamed from: r */
    private final C2529g f8648r = new C2529g(0);

    /* renamed from: s */
    private final C2529g f8649s = new C2529g(2);

    /* renamed from: t */
    private final C2981k f8650t;

    /* renamed from: u */
    private final C2608ag f8651u;

    /* renamed from: v */
    private final ArrayList f8652v;

    /* renamed from: w */
    private final MediaCodec.BufferInfo f8653w;

    /* renamed from: x */
    private final long[] f8654x;

    /* renamed from: y */
    private final long[] f8655y;

    /* renamed from: z */
    private final long[] f8656z;

    public C2992v(int i, C2994x xVar, float f) {
        super(i);
        xVar.getClass();
        this.f8636f = xVar;
        this.f8637g = f;
        C2981k kVar = new C2981k();
        this.f8650t = kVar;
        this.f8651u = new C2608ag((byte[]) null);
        this.f8652v = new ArrayList();
        this.f8653w = new MediaCodec.BufferInfo();
        this.f8639i = 1.0f;
        this.f8604F = 1.0f;
        this.f8603E = -9223372036854775807L;
        this.f8654x = new long[10];
        this.f8655y = new long[10];
        this.f8656z = new long[10];
        this.f8632ah = -9223372036854775807L;
        this.f8647q = -9223372036854775807L;
        kVar.mo5960c(0);
        kVar.f6955c.order(ByteOrder.nativeOrder());
        this.f8607I = -1.0f;
        this.f8623Y = 0;
        this.f8614P = -1;
        this.f8615Q = -1;
        this.f8613O = -9223372036854775807L;
        this.f8628ad = -9223372036854775807L;
        this.f8629ae = -9223372036854775807L;
        this.f8624Z = 0;
        this.f8625aa = 0;
    }

    /* renamed from: aA */
    private final void m8469aA() {
        if (this.f8626ab) {
            this.f8624Z = 1;
            this.f8625aa = 2;
            return;
        }
        m8478au();
    }

    /* renamed from: al */
    protected static boolean m8470al(C2680x xVar) {
        int i = xVar.f7483G;
        return i == 0 || i == 2;
    }

    /* renamed from: an */
    private final void m8471an() {
        this.f8621W = false;
        this.f8650t.mo5953fg();
        this.f8649s.mo5953fg();
        this.f8620V = false;
        this.f8619U = false;
    }

    /* renamed from: ao */
    private final void m8472ao() {
        if (this.f8626ab) {
            this.f8624Z = 1;
            this.f8625aa = 3;
            return;
        }
        mo6913af();
        mo6911ad();
    }

    /* renamed from: ap */
    private final void m8473ap() {
        try {
            this.f8640j.mo6873g();
        } finally {
            mo6914ag();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010e A[Catch:{ all -> 0x01f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f2 A[SYNTHETIC, Splitter:B:85:0x01f2] */
    /* renamed from: aq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8474aq(androidx.media3.exoplayer.p142e.C2989s r17, android.media.MediaCrypto r18) {
        /*
            r16 = this;
            r7 = r16
            r0 = r17
            java.lang.String r1 = "createCodec:"
            java.lang.String r2 = r0.f8587a
            int r3 = androidx.media3.common.p136b.C2612ak.f7249a
            float r3 = r7.f8604F
            androidx.media3.common.x[] r4 = r16.mo6931G()
            float r3 = r7.mo6518X(r3, r4)
            float r4 = r7.f8637g
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x001c
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x001c:
            long r4 = android.os.SystemClock.elapsedRealtime()
            androidx.media3.common.x r6 = r7.f8599A
            r8 = 0
            androidx.media3.exoplayer.e.o r6 = r7.mo6509O(r0, r6, r8, r3)
            int r9 = androidx.media3.common.p136b.C2612ak.f7249a
            r10 = 31
            if (r9 < r10) goto L_0x0035
            androidx.media3.exoplayer.a.bt r9 = r7.f8681b
            r9.getClass()
            androidx.media3.exoplayer.p142e.C2990t.m8468a(r6, r9)
        L_0x0035:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r9.<init>(r1)     // Catch:{ all -> 0x01f6 }
            r9.append(r2)     // Catch:{ all -> 0x01f6 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01f6 }
            android.os.Trace.beginSection(r9)     // Catch:{ all -> 0x01f6 }
            int r9 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ all -> 0x01f6 }
            java.lang.String r11 = "startCodec"
            java.lang.String r12 = "configureCodec"
            if (r9 < r10) goto L_0x0112
            androidx.media3.common.x r9 = r6.f8581c     // Catch:{ all -> 0x01f6 }
            java.lang.String r9 = r9.f7496n     // Catch:{ all -> 0x01f6 }
            int r9 = androidx.media3.common.C2598ay.m6803b(r9)     // Catch:{ all -> 0x01f6 }
            java.lang.String r10 = "DMCodecAdapterFactory"
            java.lang.String r15 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r14 = androidx.media3.common.p136b.C2612ak.m6936S(r9)     // Catch:{ all -> 0x01f6 }
            java.lang.String r14 = r15.concat(r14)     // Catch:{ all -> 0x01f6 }
            androidx.media3.common.p136b.C2633u.m7049d(r10, r14)     // Catch:{ all -> 0x01f6 }
            androidx.media3.exoplayer.e.c r10 = new androidx.media3.exoplayer.e.c     // Catch:{ all -> 0x01f6 }
            r10.<init>(r9)     // Catch:{ all -> 0x01f6 }
            androidx.media3.exoplayer.e.s r9 = r6.f8579a     // Catch:{ all -> 0x01f6 }
            java.lang.String r9 = r9.f8587a     // Catch:{ all -> 0x01f6 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0103 }
            r14.<init>(r1)     // Catch:{ Exception -> 0x0103 }
            r14.append(r9)     // Catch:{ Exception -> 0x0103 }
            java.lang.String r1 = r14.toString()     // Catch:{ Exception -> 0x0103 }
            android.os.Trace.beginSection(r1)     // Catch:{ Exception -> 0x0103 }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r9)     // Catch:{ Exception -> 0x0103 }
            androidx.media3.exoplayer.e.d r9 = new androidx.media3.exoplayer.e.d     // Catch:{ Exception -> 0x0101 }
            com.google.common.base.cr r14 = r10.f8532a     // Catch:{ Exception -> 0x0101 }
            androidx.media3.exoplayer.e.a r14 = (androidx.media3.exoplayer.p142e.C2964a) r14     // Catch:{ Exception -> 0x0101 }
            int r14 = r14.f8520a     // Catch:{ Exception -> 0x0101 }
            android.os.HandlerThread r14 = androidx.media3.exoplayer.p142e.C2973c.m8407a(r14)     // Catch:{ Exception -> 0x0101 }
            com.google.common.base.cr r10 = r10.f8533b     // Catch:{ Exception -> 0x0101 }
            androidx.media3.exoplayer.e.b r10 = (androidx.media3.exoplayer.p142e.C2972b) r10     // Catch:{ Exception -> 0x0101 }
            int r10 = r10.f8531a     // Catch:{ Exception -> 0x0101 }
            android.os.HandlerThread r10 = androidx.media3.exoplayer.p142e.C2973c.m8408b(r10)     // Catch:{ Exception -> 0x0101 }
            r9.<init>(r1, r14, r10)     // Catch:{ Exception -> 0x0101 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x00fe }
            android.media.MediaFormat r10 = r6.f8580b     // Catch:{ Exception -> 0x00fe }
            android.view.Surface r14 = r6.f8582d     // Catch:{ Exception -> 0x00fe }
            android.media.MediaCrypto r15 = r6.f8583e     // Catch:{ Exception -> 0x00fe }
            int r6 = r6.f8584f     // Catch:{ Exception -> 0x00fe }
            androidx.media3.exoplayer.e.j r6 = r9.f8535b     // Catch:{ Exception -> 0x00fe }
            android.media.MediaCodec r15 = r9.f8534a     // Catch:{ Exception -> 0x00fe }
            android.os.Handler r8 = r6.f8557c     // Catch:{ Exception -> 0x00fe }
            if (r8 != 0) goto L_0x00ad
            r8 = 1
            goto L_0x00ae
        L_0x00ad:
            r8 = 0
        L_0x00ae:
            androidx.media3.common.p136b.C2601a.m6832d(r8)     // Catch:{ Exception -> 0x00fe }
            android.os.HandlerThread r8 = r6.f8556b     // Catch:{ Exception -> 0x00fe }
            r8.start()     // Catch:{ Exception -> 0x00fe }
            android.os.Handler r8 = new android.os.Handler     // Catch:{ Exception -> 0x00fe }
            android.os.HandlerThread r13 = r6.f8556b     // Catch:{ Exception -> 0x00fe }
            android.os.Looper r13 = r13.getLooper()     // Catch:{ Exception -> 0x00fe }
            r8.<init>(r13)     // Catch:{ Exception -> 0x00fe }
            r15.setCallback(r6, r8)     // Catch:{ Exception -> 0x00fe }
            r6.f8557c = r8     // Catch:{ Exception -> 0x00fe }
            android.os.Trace.beginSection(r12)     // Catch:{ Exception -> 0x00fe }
            android.media.MediaCodec r6 = r9.f8534a     // Catch:{ Exception -> 0x00fe }
            r8 = 0
            r12 = 0
            r6.configure(r10, r14, r12, r8)     // Catch:{ Exception -> 0x00fe }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x00fe }
            androidx.media3.exoplayer.e.h r6 = r9.f8536c     // Catch:{ Exception -> 0x00fe }
            boolean r8 = r6.f8553h     // Catch:{ Exception -> 0x00fe }
            if (r8 != 0) goto L_0x00ee
            android.os.HandlerThread r8 = r6.f8549d     // Catch:{ Exception -> 0x00fe }
            r8.start()     // Catch:{ Exception -> 0x00fe }
            androidx.media3.exoplayer.e.f r8 = new androidx.media3.exoplayer.e.f     // Catch:{ Exception -> 0x00fe }
            android.os.HandlerThread r10 = r6.f8549d     // Catch:{ Exception -> 0x00fe }
            android.os.Looper r10 = r10.getLooper()     // Catch:{ Exception -> 0x00fe }
            r8.<init>(r6, r10)     // Catch:{ Exception -> 0x00fe }
            r6.f8550e = r8     // Catch:{ Exception -> 0x00fe }
            r8 = 1
            r6.f8553h = r8     // Catch:{ Exception -> 0x00fe }
        L_0x00ee:
            android.os.Trace.beginSection(r11)     // Catch:{ Exception -> 0x00fe }
            android.media.MediaCodec r6 = r9.f8534a     // Catch:{ Exception -> 0x00fe }
            r6.start()     // Catch:{ Exception -> 0x00fe }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x00fe }
            r6 = 1
            r9.f8537d = r6     // Catch:{ Exception -> 0x00fe }
            r6 = 0
            goto L_0x0148
        L_0x00fe:
            r0 = move-exception
            r8 = r9
            goto L_0x0106
        L_0x0101:
            r0 = move-exception
            goto L_0x0105
        L_0x0103:
            r0 = move-exception
            r1 = 0
        L_0x0105:
            r8 = 0
        L_0x0106:
            if (r8 != 0) goto L_0x010e
            if (r1 == 0) goto L_0x0111
            r1.release()     // Catch:{ all -> 0x01f6 }
            goto L_0x0111
        L_0x010e:
            r8.mo6874h()     // Catch:{ all -> 0x01f6 }
        L_0x0111:
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x0112:
            androidx.media3.exoplayer.e.s r8 = r6.f8579a     // Catch:{ IOException -> 0x01ed, RuntimeException -> 0x01eb }
            r8.getClass()
            java.lang.String r8 = r8.f8587a     // Catch:{ IOException -> 0x01ed, RuntimeException -> 0x01eb }
            java.lang.String r1 = r1.concat(r8)     // Catch:{ IOException -> 0x01ed, RuntimeException -> 0x01eb }
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x01ed, RuntimeException -> 0x01eb }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r8)     // Catch:{ IOException -> 0x01ed, RuntimeException -> 0x01eb }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x01ed, RuntimeException -> 0x01eb }
            android.os.Trace.beginSection(r12)     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            android.media.MediaFormat r8 = r6.f8580b     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            android.view.Surface r9 = r6.f8582d     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            android.media.MediaCrypto r10 = r6.f8583e     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            int r6 = r6.f8584f     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            r6 = 0
            r10 = 0
            r1.configure(r8, r9, r10, r6)     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            android.os.Trace.beginSection(r11)     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            r1.start()     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            androidx.media3.exoplayer.e.ag r9 = new androidx.media3.exoplayer.e.ag     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
            r9.<init>(r1)     // Catch:{ IOException -> 0x01e8, RuntimeException -> 0x01e6 }
        L_0x0148:
            r7.f8640j = r9     // Catch:{ all -> 0x01f6 }
            android.os.Trace.endSection()
            long r8 = android.os.SystemClock.elapsedRealtime()
            r7.f8642l = r0
            r7.f8607I = r3
            androidx.media3.common.x r1 = r7.f8599A
            r7.f8605G = r1
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            r3 = 29
            if (r1 != r3) goto L_0x0169
            java.lang.String r1 = "c2.android.aac.decoder"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0169
            r1 = 1
            goto L_0x016a
        L_0x0169:
            r1 = 0
        L_0x016a:
            r7.f8610L = r1
            java.lang.String r1 = r0.f8587a
            int r10 = androidx.media3.common.p136b.C2612ak.f7249a
            if (r10 > r3) goto L_0x0185
            java.lang.String r3 = "OMX.broadcom.video_decoder.tunnel"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0183
            java.lang.String r3 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0183
            goto L_0x0185
        L_0x0183:
            r13 = 1
            goto L_0x01a6
        L_0x0185:
            java.lang.String r1 = "Amazon"
            java.lang.String r3 = androidx.media3.common.p136b.C2612ak.f7251c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x019e
            java.lang.String r1 = "AFTS"
            java.lang.String r3 = androidx.media3.common.p136b.C2612ak.f7252d
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x019e
            boolean r1 = r0.f8592f
            if (r1 == 0) goto L_0x019e
            goto L_0x0183
        L_0x019e:
            boolean r1 = r16.mo6917aj()
            if (r1 == 0) goto L_0x01a5
            goto L_0x0183
        L_0x01a5:
            r13 = 0
        L_0x01a6:
            r7.f8611M = r13
            androidx.media3.exoplayer.e.q r1 = r7.f8640j
            boolean r1 = r1.mo6879m()
            if (r1 == 0) goto L_0x01b5
            r1 = 1
            r7.f8622X = r1
            r7.f8623Y = r1
        L_0x01b5:
            java.lang.String r1 = "c2.android.mp3.decoder"
            java.lang.String r0 = r0.f8587a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01c6
            androidx.media3.exoplayer.e.l r0 = new androidx.media3.exoplayer.e.l
            r0.<init>()
            r7.f8612N = r0
        L_0x01c6:
            int r0 = r7.f8682c
            r1 = 2
            if (r0 != r1) goto L_0x01d4
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r10
            r7.f8613O = r0
        L_0x01d4:
            androidx.media3.exoplayer.h r0 = r7.f8646p
            int r1 = r0.f8694a
            r3 = 1
            int r1 = r1 + r3
            r0.f8694a = r1
            long r10 = r8 - r4
            r1 = r16
            r3 = r8
            r5 = r10
            r1.mo6519Y(r2, r3, r5)
            return
        L_0x01e6:
            r0 = move-exception
            goto L_0x01e9
        L_0x01e8:
            r0 = move-exception
        L_0x01e9:
            r8 = r1
            goto L_0x01f0
        L_0x01eb:
            r0 = move-exception
            goto L_0x01ee
        L_0x01ed:
            r0 = move-exception
        L_0x01ee:
            r10 = 0
            r8 = r10
        L_0x01f0:
            if (r8 == 0) goto L_0x01f5
            r8.release()     // Catch:{ all -> 0x01f6 }
        L_0x01f5:
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x01f6:
            r0 = move-exception
            android.os.Trace.endSection()
            goto L_0x01fc
        L_0x01fb:
            throw r0
        L_0x01fc:
            goto L_0x01fb
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p142e.C2992v.m8474aq(androidx.media3.exoplayer.e.s, android.media.MediaCrypto):void");
    }

    /* renamed from: as */
    private final void m8476as() {
        this.f8614P = -1;
        this.f8648r.f6955c = null;
    }

    /* renamed from: at */
    private final void m8477at() {
        this.f8615Q = -1;
        this.f8616R = null;
    }

    /* renamed from: au */
    private final void m8478au() {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw mo6934g(e, this.f8599A, false, 6006);
        }
    }

    /* renamed from: av */
    private final boolean m8479av() {
        C2987q qVar = this.f8640j;
        if (qVar == null || this.f8624Z == 2 || this.f8630af) {
            return false;
        }
        if (this.f8614P < 0) {
            int a = qVar.mo6868a();
            this.f8614P = a;
            if (a < 0) {
                return false;
            }
            this.f8648r.f6955c = this.f8640j.mo6871e(a);
            this.f8648r.mo5953fg();
        }
        if (this.f8624Z == 1) {
            if (!this.f8611M) {
                this.f8640j.mo6880n(this.f8614P, 0, 0, 4);
                m8476as();
            }
            this.f8624Z = 2;
            return false;
        }
        if (this.f8623Y == 1) {
            for (int i = 0; i < this.f8605G.f7498p.size(); i++) {
                this.f8648r.f6955c.put((byte[]) this.f8605G.f7498p.get(i));
            }
            this.f8623Y = 2;
        }
        int position = this.f8648r.f6955c.position();
        C2874cc h = mo6935h();
        try {
            int eW = mo6933eW(h, this.f8648r, 0);
            if (mo6684E()) {
                this.f8629ae = this.f8628ad;
            }
            if (eW == -3) {
                return false;
            }
            if (eW == -5) {
                if (this.f8623Y == 2) {
                    this.f8648r.mo5953fg();
                    this.f8623Y = 1;
                }
                mo6508N(h);
                return true;
            }
            C2529g gVar = this.f8648r;
            if (gVar.mo5954fh(4)) {
                if (this.f8623Y == 2) {
                    gVar.mo5953fg();
                    this.f8623Y = 1;
                }
                this.f8630af = true;
                if (!this.f8626ab) {
                    m8475ar();
                    return false;
                }
                try {
                    if (!this.f8611M) {
                        this.f8640j.mo6880n(this.f8614P, 0, 0, 4);
                        m8476as();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw mo6934g(e, this.f8599A, false, C2612ak.m6986k(e.getErrorCode()));
                }
            } else if (this.f8626ab || gVar.mo5954fh(1)) {
                boolean fh = gVar.mo5954fh(1073741824);
                if (fh) {
                    C2525c cVar = gVar.f6954b;
                    if (position != 0) {
                        if (cVar.f6947d == null) {
                            cVar.f6947d = new int[1];
                            cVar.f6952i.numBytesOfClearData = cVar.f6947d;
                        }
                        int[] iArr = cVar.f6947d;
                        iArr[0] = iArr[0] + position;
                    }
                }
                C2529g gVar2 = this.f8648r;
                long j = gVar2.f6957e;
                C2982l lVar = this.f8612N;
                if (lVar != null) {
                    C2680x xVar = this.f8599A;
                    if (lVar.f8572b == 0) {
                        lVar.f8571a = j;
                    }
                    if (!lVar.f8573c) {
                        ByteBuffer byteBuffer = gVar2.f6955c;
                        byteBuffer.getClass();
                        byte b = 0;
                        for (int i2 = 0; i2 < 4; i2++) {
                            b = (b << 8) | (byteBuffer.get(i2) & 255);
                        }
                        int c = C3344as.m9690c(b);
                        if (c == -1) {
                            lVar.f8573c = true;
                            lVar.f8572b = 0;
                            lVar.f8571a = gVar2.f6957e;
                            C2633u.m7050e("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                            j = gVar2.f6957e;
                        } else {
                            j = lVar.mo6898a((long) xVar.f7478B);
                            lVar.f8572b += (long) c;
                        }
                    }
                    this.f8628ad = Math.max(this.f8628ad, this.f8612N.mo6898a((long) this.f8599A.f7478B));
                }
                long j2 = j;
                if (this.f8648r.mo5954fh(LinearLayoutManager.INVALID_OFFSET)) {
                    this.f8652v.add(Long.valueOf(j2));
                }
                if (this.f8631ag) {
                    this.f8651u.mo6177e(j2, this.f8599A);
                    this.f8631ag = false;
                }
                this.f8628ad = Math.max(this.f8628ad, j2);
                this.f8648r.mo5961d();
                C2529g gVar3 = this.f8648r;
                if (gVar3.mo5954fh(268435456)) {
                    mo6910ac(gVar3);
                }
                mo6514T(this.f8648r);
                if (fh) {
                    try {
                        this.f8640j.mo6881o(this.f8614P, this.f8648r.f6954b, j2);
                    } catch (MediaCodec.CryptoException e2) {
                        throw mo6934g(e2, this.f8599A, false, C2612ak.m6986k(e2.getErrorCode()));
                    }
                } else {
                    this.f8640j.mo6880n(this.f8614P, this.f8648r.f6955c.limit(), j2, 0);
                }
                m8476as();
                this.f8626ab = true;
                this.f8623Y = 0;
                this.f8646p.f8696c++;
                return true;
            } else {
                gVar.mo5953fg();
                if (this.f8623Y == 2) {
                    this.f8623Y = 1;
                }
                return true;
            }
        } catch (C2528f e3) {
            mo6510P(e3);
            m8481ax(0);
            m8473ap();
            return true;
        }
    }

    /* renamed from: aw */
    private final boolean m8480aw() {
        return this.f8615Q >= 0;
    }

    /* renamed from: ax */
    private final boolean m8481ax(int i) {
        C2874cc h = mo6935h();
        this.f8638h.mo5953fg();
        int eW = mo6933eW(h, this.f8638h, i | 4);
        if (eW == -5) {
            mo6508N(h);
            return true;
        } else if (eW != -4 || !this.f8638h.mo5954fh(4)) {
            return false;
        } else {
            this.f8630af = true;
            m8475ar();
            return false;
        }
    }

    /* renamed from: ay */
    private final boolean m8482ay(long j) {
        return this.f8603E == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f8603E;
    }

    /* renamed from: az */
    private final boolean m8483az() {
        int i = C2612ak.f7249a;
        if (!(this.f8640j == null || this.f8625aa == 3 || this.f8682c == 0)) {
            float X = mo6518X(this.f8604F, mo6931G());
            float f = this.f8607I;
            if (f == X) {
                return true;
            }
            if (X == -1.0f) {
                m8472ao();
                return false;
            } else if (f == -1.0f && X <= this.f8637g) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", X);
                this.f8640j.mo6877k(bundle);
                this.f8607I = X;
            }
        }
        return true;
    }

    /* renamed from: B */
    public void mo6681B(float f, float f2) {
        this.f8639i = f;
        this.f8604F = f2;
        m8483az();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x018d, code lost:
        r2 = r9;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0223, code lost:
        if (r15.f8600B != null) goto L_0x0225;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x028b A[Catch:{ IllegalStateException -> 0x02cb }, LOOP:2: B:88:0x0156->B:150:0x028b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0297 A[Catch:{ IllegalStateException -> 0x02cb }, LOOP:4: B:153:0x0297->B:156:0x02a1, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x028a A[SYNTHETIC] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6686I(long r25, long r27) {
        /*
            r24 = this;
            r15 = r24
            r14 = 0
            r13 = 1
            boolean r0 = r15.f8643m     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x000c
            r24.mo6515U()     // Catch:{ IllegalStateException -> 0x02ce }
            return
        L_0x000c:
            androidx.media3.common.x r0 = r15.f8599A     // Catch:{ IllegalStateException -> 0x02ce }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.m8481ax(r11)     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r24.mo6911ad()     // Catch:{ IllegalStateException -> 0x02ce }
            boolean r0 = r15.f8619U     // Catch:{ IllegalStateException -> 0x02ce }
            r12 = 4
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = "bypassRender"
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ IllegalStateException -> 0x0140 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0140 }
        L_0x0028:
            boolean r0 = r15.f8643m     // Catch:{ IllegalStateException -> 0x0140 }
            r0 = r0 ^ r13
            androidx.media3.common.p136b.C2601a.m6832d(r0)     // Catch:{ IllegalStateException -> 0x0140 }
            androidx.media3.exoplayer.e.k r0 = r15.f8650t     // Catch:{ IllegalStateException -> 0x0140 }
            boolean r1 = r0.mo6897f()     // Catch:{ IllegalStateException -> 0x0140 }
            if (r1 == 0) goto L_0x0080
            java.nio.ByteBuffer r7 = r0.f6955c     // Catch:{ IllegalStateException -> 0x02ce }
            int r8 = r15.f8615Q     // Catch:{ IllegalStateException -> 0x02ce }
            int r10 = r0.f8569h     // Catch:{ IllegalStateException -> 0x02ce }
            long r4 = r0.f6957e     // Catch:{ IllegalStateException -> 0x02ce }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r16 = r0.mo5954fh(r1)     // Catch:{ IllegalStateException -> 0x02ce }
            r6 = 0
            r9 = 0
            boolean r0 = r0.mo5954fh(r12)     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.common.x r11 = r15.f8600B     // Catch:{ IllegalStateException -> 0x02ce }
            r1 = r24
            r2 = r25
            r17 = r4
            r4 = r27
            r19 = r11
            r11 = r17
            r13 = r16
            r14 = r0
            r15 = r19
            boolean r0 = r1.mo6516V(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0078 }
            if (r0 == 0) goto L_0x0072
            r15 = r24
            androidx.media3.exoplayer.e.k r0 = r15.f8650t     // Catch:{ IllegalStateException -> 0x02ce }
            long r0 = r0.f8568g     // Catch:{ IllegalStateException -> 0x02ce }
            r15.mo6912ae(r0)     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.exoplayer.e.k r0 = r15.f8650t     // Catch:{ IllegalStateException -> 0x02ce }
            r0.mo5953fg()     // Catch:{ IllegalStateException -> 0x02ce }
            goto L_0x0080
        L_0x0072:
            r15 = r24
            r13 = 0
            r14 = 1
            goto L_0x0137
        L_0x0078:
            r0 = move-exception
            r2 = 1
            r20 = 0
            r1 = r24
            goto L_0x02d3
        L_0x0080:
            boolean r0 = r15.f8630af     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x008a
            r14 = 1
            r15.f8643m = r14     // Catch:{ IllegalStateException -> 0x02ce }
            r13 = 0
            goto L_0x0137
        L_0x008a:
            r14 = 1
            boolean r0 = r15.f8620V     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x009e
            androidx.media3.exoplayer.e.k r0 = r15.f8650t     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.c.g r1 = r15.f8649s     // Catch:{ IllegalStateException -> 0x02ce }
            boolean r0 = r0.mo6896e(r1)     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.common.p136b.C2601a.m6832d(r0)     // Catch:{ IllegalStateException -> 0x02ce }
            r13 = 0
            r15.f8620V = r13     // Catch:{ IllegalStateException -> 0x02ce }
            goto L_0x009f
        L_0x009e:
            r13 = 0
        L_0x009f:
            boolean r0 = r15.f8621W     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x00bd
            androidx.media3.exoplayer.e.k r0 = r15.f8650t     // Catch:{ IllegalStateException -> 0x02ce }
            boolean r0 = r0.mo6897f()     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 != 0) goto L_0x00b8
            r24.m8471an()     // Catch:{ IllegalStateException -> 0x02ce }
            r15.f8621W = r13     // Catch:{ IllegalStateException -> 0x02ce }
            r24.mo6911ad()     // Catch:{ IllegalStateException -> 0x02ce }
            boolean r0 = r15.f8619U     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x0137
            goto L_0x00bd
        L_0x00b8:
            r12 = 4
        L_0x00b9:
            r13 = 1
            r14 = 0
            goto L_0x0028
        L_0x00bd:
            boolean r0 = r15.f8630af     // Catch:{ IllegalStateException -> 0x02ce }
            r0 = r0 ^ r14
            androidx.media3.common.p136b.C2601a.m6832d(r0)     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.exoplayer.cc r0 = r24.mo6935h()     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.c.g r1 = r15.f8649s     // Catch:{ IllegalStateException -> 0x02ce }
            r1.mo5953fg()     // Catch:{ IllegalStateException -> 0x02ce }
        L_0x00cc:
            androidx.media3.c.g r1 = r15.f8649s     // Catch:{ IllegalStateException -> 0x02ce }
            r1.mo5953fg()     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.c.g r1 = r15.f8649s     // Catch:{ IllegalStateException -> 0x02ce }
            int r1 = r15.mo6933eW(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x02ce }
            r2 = -5
            if (r1 == r2) goto L_0x0117
            r2 = -4
            if (r1 == r2) goto L_0x00e8
            r0 = -3
            if (r1 != r0) goto L_0x00e2
            r12 = 4
            goto L_0x011b
        L_0x00e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x02ce }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x02ce }
            throw r0     // Catch:{ IllegalStateException -> 0x02ce }
        L_0x00e8:
            androidx.media3.c.g r1 = r15.f8649s     // Catch:{ IllegalStateException -> 0x02ce }
            r12 = 4
            boolean r1 = r1.mo5954fh(r12)     // Catch:{ IllegalStateException -> 0x02ce }
            if (r1 == 0) goto L_0x00f4
            r15.f8630af = r14     // Catch:{ IllegalStateException -> 0x02ce }
            goto L_0x011b
        L_0x00f4:
            boolean r1 = r15.f8631ag     // Catch:{ IllegalStateException -> 0x02ce }
            if (r1 == 0) goto L_0x0105
            androidx.media3.common.x r1 = r15.f8599A     // Catch:{ IllegalStateException -> 0x02ce }
            r1.getClass()
            r15.f8600B = r1     // Catch:{ IllegalStateException -> 0x02ce }
            r2 = 0
            r15.mo6512R(r1, r2)     // Catch:{ IllegalStateException -> 0x02ce }
            r15.f8631ag = r13     // Catch:{ IllegalStateException -> 0x02ce }
        L_0x0105:
            androidx.media3.c.g r1 = r15.f8649s     // Catch:{ IllegalStateException -> 0x02ce }
            r1.mo5961d()     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.exoplayer.e.k r1 = r15.f8650t     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.c.g r2 = r15.f8649s     // Catch:{ IllegalStateException -> 0x02ce }
            boolean r1 = r1.mo6896e(r2)     // Catch:{ IllegalStateException -> 0x02ce }
            if (r1 != 0) goto L_0x00cc
            r15.f8620V = r14     // Catch:{ IllegalStateException -> 0x02ce }
            goto L_0x011b
        L_0x0117:
            r12 = 4
            r15.mo6508N(r0)     // Catch:{ IllegalStateException -> 0x02ce }
        L_0x011b:
            androidx.media3.exoplayer.e.k r0 = r15.f8650t     // Catch:{ IllegalStateException -> 0x02ce }
            boolean r1 = r0.mo6897f()     // Catch:{ IllegalStateException -> 0x02ce }
            if (r1 == 0) goto L_0x0126
            r0.mo5961d()     // Catch:{ IllegalStateException -> 0x02ce }
        L_0x0126:
            androidx.media3.exoplayer.e.k r0 = r15.f8650t     // Catch:{ IllegalStateException -> 0x02ce }
            boolean r0 = r0.mo6897f()     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r15.f8630af     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r15.f8621W     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x0137
            goto L_0x00b9
        L_0x0137:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x02ce }
            r1 = r15
            r2 = 1
            r20 = 0
            goto L_0x02c3
        L_0x0140:
            r0 = move-exception
            r13 = 0
            r14 = 1
            goto L_0x02cf
        L_0x0145:
            r13 = 0
            r14 = 1
            androidx.media3.exoplayer.e.q r0 = r15.f8640j     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x02b1
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x02ac }
            java.lang.String r0 = "drainAndFeed"
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ IllegalStateException -> 0x02ac }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x02ac }
        L_0x0156:
            boolean r0 = r24.m8480aw()     // Catch:{ IllegalStateException -> 0x02ac }
            if (r0 != 0) goto L_0x022e
            androidx.media3.exoplayer.e.q r0 = r15.f8640j     // Catch:{ IllegalStateException -> 0x02ce }
            android.media.MediaCodec$BufferInfo r1 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ce }
            int r0 = r0.mo6869b(r1)     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 >= 0) goto L_0x0193
            r1 = -2
            if (r0 != r1) goto L_0x017e
            r15.f8627ac = r14     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.exoplayer.e.q r0 = r15.f8640j     // Catch:{ IllegalStateException -> 0x02ce }
            android.media.MediaFormat r0 = r0.mo6870c()     // Catch:{ IllegalStateException -> 0x02ce }
            r15.f8641k = r0     // Catch:{ IllegalStateException -> 0x02ce }
            r15.f8606H = r14     // Catch:{ IllegalStateException -> 0x02ce }
            r2 = r9
            r1 = r15
            r0 = 2
            r16 = 4
            r20 = 0
            goto L_0x0284
        L_0x017e:
            boolean r0 = r15.f8611M     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x018d
            boolean r0 = r15.f8630af     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 != 0) goto L_0x018a
            int r0 = r15.f8624Z     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 != r11) goto L_0x018d
        L_0x018a:
            r24.m8475ar()     // Catch:{ IllegalStateException -> 0x02ce }
        L_0x018d:
            r2 = r9
            r1 = r15
            r20 = 0
            goto L_0x0297
        L_0x0193:
            android.media.MediaCodec$BufferInfo r1 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ce }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x02ce }
            if (r1 != 0) goto L_0x01a4
            android.media.MediaCodec$BufferInfo r1 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ce }
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x02ce }
            r1 = r1 & r12
            if (r1 == 0) goto L_0x01a4
            r24.m8475ar()     // Catch:{ IllegalStateException -> 0x02ce }
            goto L_0x018d
        L_0x01a4:
            r15.f8615Q = r0     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.exoplayer.e.q r1 = r15.f8640j     // Catch:{ IllegalStateException -> 0x02ce }
            java.nio.ByteBuffer r0 = r1.mo6872f(r0)     // Catch:{ IllegalStateException -> 0x02ce }
            r15.f8616R = r0     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x01c5
            android.media.MediaCodec$BufferInfo r1 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ce }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x02ce }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x02ce }
            java.nio.ByteBuffer r0 = r15.f8616R     // Catch:{ IllegalStateException -> 0x02ce }
            android.media.MediaCodec$BufferInfo r1 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ce }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x02ce }
            android.media.MediaCodec$BufferInfo r2 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ce }
            int r2 = r2.size     // Catch:{ IllegalStateException -> 0x02ce }
            int r1 = r1 + r2
            r0.limit(r1)     // Catch:{ IllegalStateException -> 0x02ce }
        L_0x01c5:
            android.media.MediaCodec$BufferInfo r0 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ce }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02ce }
            java.util.ArrayList r2 = r15.f8652v     // Catch:{ IllegalStateException -> 0x02ce }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x02ce }
            r3 = 0
        L_0x01d0:
            if (r3 >= r2) goto L_0x01ec
            java.util.ArrayList r4 = r15.f8652v     // Catch:{ IllegalStateException -> 0x02ce }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x02ce }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x02ce }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x02ce }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x01e9
            java.util.ArrayList r0 = r15.f8652v     // Catch:{ IllegalStateException -> 0x02ce }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x02ce }
            r0 = 1
            goto L_0x01ed
        L_0x01e9:
            int r3 = r3 + 1
            goto L_0x01d0
        L_0x01ec:
            r0 = 0
        L_0x01ed:
            r15.f8617S = r0     // Catch:{ IllegalStateException -> 0x02ce }
            long r0 = r15.f8629ae     // Catch:{ IllegalStateException -> 0x02ce }
            android.media.MediaCodec$BufferInfo r2 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ce }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02ce }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x01fb
            r0 = 1
            goto L_0x01fc
        L_0x01fb:
            r0 = 0
        L_0x01fc:
            r15.f8618T = r0     // Catch:{ IllegalStateException -> 0x02ce }
            android.media.MediaCodec$BufferInfo r0 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ce }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.common.b.ag r2 = r15.f8651u     // Catch:{ IllegalStateException -> 0x02ce }
            java.lang.Object r0 = r2.mo6176d(r0)     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.common.x r0 = (androidx.media3.common.C2680x) r0     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 != 0) goto L_0x0218
            boolean r1 = r15.f8606H     // Catch:{ IllegalStateException -> 0x02ce }
            if (r1 == 0) goto L_0x0218
            androidx.media3.common.b.ag r0 = r15.f8651u     // Catch:{ IllegalStateException -> 0x02ce }
            java.lang.Object r0 = r0.mo6175c()     // Catch:{ IllegalStateException -> 0x02ce }
            androidx.media3.common.x r0 = (androidx.media3.common.C2680x) r0     // Catch:{ IllegalStateException -> 0x02ce }
        L_0x0218:
            if (r0 == 0) goto L_0x021d
            r15.f8600B = r0     // Catch:{ IllegalStateException -> 0x02ce }
            goto L_0x0225
        L_0x021d:
            boolean r0 = r15.f8606H     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x022e
            androidx.media3.common.x r0 = r15.f8600B     // Catch:{ IllegalStateException -> 0x02ce }
            if (r0 == 0) goto L_0x022e
        L_0x0225:
            androidx.media3.common.x r0 = r15.f8600B     // Catch:{ IllegalStateException -> 0x02ce }
            android.media.MediaFormat r1 = r15.f8641k     // Catch:{ IllegalStateException -> 0x02ce }
            r15.mo6512R(r0, r1)     // Catch:{ IllegalStateException -> 0x02ce }
            r15.f8606H = r13     // Catch:{ IllegalStateException -> 0x02ce }
        L_0x022e:
            androidx.media3.exoplayer.e.q r6 = r15.f8640j     // Catch:{ IllegalStateException -> 0x02ac }
            java.nio.ByteBuffer r7 = r15.f8616R     // Catch:{ IllegalStateException -> 0x02ac }
            int r8 = r15.f8615Q     // Catch:{ IllegalStateException -> 0x02ac }
            android.media.MediaCodec$BufferInfo r0 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ac }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x02ac }
            r16 = 1
            android.media.MediaCodec$BufferInfo r1 = r15.f8653w     // Catch:{ IllegalStateException -> 0x02ac }
            long r4 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02ac }
            boolean r2 = r15.f8617S     // Catch:{ IllegalStateException -> 0x02ac }
            boolean r3 = r15.f8618T     // Catch:{ IllegalStateException -> 0x02ac }
            androidx.media3.common.x r1 = r15.f8600B     // Catch:{ IllegalStateException -> 0x02ac }
            r17 = r1
            r1 = r24
            r18 = r2
            r19 = r3
            r2 = r25
            r20 = r4
            r4 = r27
            r22 = r9
            r9 = r0
            r10 = r16
            r0 = 2
            r16 = 4
            r11 = r20
            r20 = 0
            r13 = r18
            r14 = r19
            r15 = r17
            boolean r1 = r1.mo6516V(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02a8 }
            if (r1 == 0) goto L_0x0293
            r1 = r24
            android.media.MediaCodec$BufferInfo r2 = r1.f8653w     // Catch:{ IllegalStateException -> 0x02cb }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02cb }
            r1.mo6912ae(r2)     // Catch:{ IllegalStateException -> 0x02cb }
            android.media.MediaCodec$BufferInfo r2 = r1.f8653w     // Catch:{ IllegalStateException -> 0x02cb }
            int r2 = r2.flags     // Catch:{ IllegalStateException -> 0x02cb }
            r24.m8477at()     // Catch:{ IllegalStateException -> 0x02cb }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0282
            r24.m8475ar()     // Catch:{ IllegalStateException -> 0x02cb }
            goto L_0x0295
        L_0x0282:
            r2 = r22
        L_0x0284:
            boolean r4 = r1.m8482ay(r2)     // Catch:{ IllegalStateException -> 0x02cb }
            if (r4 != 0) goto L_0x028b
            goto L_0x0297
        L_0x028b:
            r15 = r1
            r9 = r2
            r11 = 2
            r12 = 4
            r13 = 0
            r14 = 1
            goto L_0x0156
        L_0x0293:
            r1 = r24
        L_0x0295:
            r2 = r22
        L_0x0297:
            boolean r0 = r24.m8479av()     // Catch:{ IllegalStateException -> 0x02cb }
            if (r0 == 0) goto L_0x02a3
            boolean r0 = r1.m8482ay(r2)     // Catch:{ IllegalStateException -> 0x02cb }
            if (r0 != 0) goto L_0x0297
        L_0x02a3:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x02cb }
            r2 = 1
            goto L_0x02c3
        L_0x02a8:
            r0 = move-exception
            r1 = r24
            goto L_0x02cc
        L_0x02ac:
            r0 = move-exception
            r1 = r15
            r20 = 0
            goto L_0x02cc
        L_0x02b1:
            r1 = r15
            r20 = 0
            androidx.media3.exoplayer.h r0 = r1.f8646p     // Catch:{ IllegalStateException -> 0x02cb }
            int r2 = r0.f8697d     // Catch:{ IllegalStateException -> 0x02cb }
            int r3 = r24.mo6932d(r25)     // Catch:{ IllegalStateException -> 0x02cb }
            int r2 = r2 + r3
            r0.f8697d = r2     // Catch:{ IllegalStateException -> 0x02cb }
            r2 = 1
            r1.m8481ax(r2)     // Catch:{ IllegalStateException -> 0x02c9 }
        L_0x02c3:
            androidx.media3.exoplayer.h r0 = r1.f8646p     // Catch:{ IllegalStateException -> 0x02c9 }
            r0.mo6936a()     // Catch:{ IllegalStateException -> 0x02c9 }
            return
        L_0x02c9:
            r0 = move-exception
            goto L_0x02d3
        L_0x02cb:
            r0 = move-exception
        L_0x02cc:
            r2 = 1
            goto L_0x02d3
        L_0x02ce:
            r0 = move-exception
        L_0x02cf:
            r1 = r15
            r2 = 1
            r20 = 0
        L_0x02d3:
            int r3 = androidx.media3.common.p136b.C2612ak.f7249a
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x02da
            goto L_0x02ef
        L_0x02da:
            java.lang.StackTraceElement[] r4 = r0.getStackTrace()
            int r5 = r4.length
            if (r5 <= 0) goto L_0x0314
            r4 = r4[r20]
            java.lang.String r4 = r4.getClassName()
            java.lang.String r5 = "android.media.MediaCodec"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0314
        L_0x02ef:
            r1.mo6510P(r0)
            if (r3 == 0) goto L_0x02ff
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x02ff
            r14 = 1
            goto L_0x0300
        L_0x02ff:
            r14 = 0
        L_0x0300:
            if (r14 == 0) goto L_0x0305
            r24.mo6913af()
        L_0x0305:
            androidx.media3.exoplayer.e.s r2 = r1.f8642l
            androidx.media3.exoplayer.e.r r0 = r1.mo6909ab(r0, r2)
            androidx.media3.common.x r2 = r1.f8599A
            r3 = 4003(0xfa3, float:5.61E-42)
            androidx.media3.exoplayer.o r0 = r1.mo6934g(r0, r2, r14, r3)
            throw r0
        L_0x0314:
            goto L_0x0316
        L_0x0315:
            throw r0
        L_0x0316:
            goto L_0x0315
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p142e.C2992v.mo6686I(long, long):void");
    }

    /* renamed from: J */
    public boolean mo6505J() {
        return this.f8643m;
    }

    /* renamed from: L */
    public final int mo6699L(C2680x xVar) {
        try {
            return mo6522aa(xVar);
        } catch (C2967ac e) {
            throw mo6934g(e, xVar, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C3187i mo6507M(C2989s sVar, C2680x xVar, C2680x xVar2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009d A[RETURN] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.media3.exoplayer.C3187i mo6508N(androidx.media3.exoplayer.C2874cc r11) {
        /*
            r10 = this;
            r0 = 1
            r10.f8631ag = r0
            androidx.media3.common.x r4 = r11.f8096a
            r4.getClass()
            java.lang.String r1 = r4.f7496n
            r2 = 0
            if (r1 == 0) goto L_0x00c7
            androidx.media3.exoplayer.c.l r11 = r11.f8097b
            r10.f8635ak = r11
            r10.f8599A = r4
            boolean r1 = r10.f8619U
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r10.f8621W = r0
            return r3
        L_0x001b:
            androidx.media3.exoplayer.e.q r1 = r10.f8640j
            if (r1 != 0) goto L_0x0025
            r10.f8608J = r3
            r10.mo6911ad()
            return r3
        L_0x0025:
            androidx.media3.exoplayer.e.s r3 = r10.f8642l
            androidx.media3.common.x r5 = r10.f8605G
            androidx.media3.exoplayer.c.l r6 = r10.f8634aj
            if (r6 != r11) goto L_0x009e
            if (r11 == r6) goto L_0x0031
            r11 = 1
            goto L_0x0032
        L_0x0031:
            r11 = 0
        L_0x0032:
            if (r11 == 0) goto L_0x0036
            int r6 = androidx.media3.common.p136b.C2612ak.f7249a
        L_0x0036:
            androidx.media3.exoplayer.i r6 = r10.mo6507M(r3, r5, r4)
            int r7 = r6.f9537d
            if (r7 == 0) goto L_0x007f
            r8 = 16
            if (r7 == r0) goto L_0x0067
            r9 = 2
            if (r7 == r9) goto L_0x0054
            boolean r0 = r10.m8483az()
            if (r0 != 0) goto L_0x004c
            goto L_0x0083
        L_0x004c:
            r10.f8605G = r4
            if (r11 == 0) goto L_0x0082
            r10.m8469aA()
            goto L_0x0082
        L_0x0054:
            boolean r7 = r10.m8483az()
            if (r7 != 0) goto L_0x005b
            goto L_0x0083
        L_0x005b:
            r10.f8622X = r0
            r10.f8623Y = r0
            r10.f8605G = r4
            if (r11 == 0) goto L_0x0082
            r10.m8469aA()
            goto L_0x0082
        L_0x0067:
            boolean r7 = r10.m8483az()
            if (r7 != 0) goto L_0x006e
            goto L_0x0083
        L_0x006e:
            r10.f8605G = r4
            if (r11 == 0) goto L_0x0076
            r10.m8469aA()
            goto L_0x0082
        L_0x0076:
            boolean r11 = r10.f8626ab
            if (r11 == 0) goto L_0x0082
            r10.f8624Z = r0
            r10.f8625aa = r0
            goto L_0x0082
        L_0x007f:
            r10.m8472ao()
        L_0x0082:
            r8 = 0
        L_0x0083:
            int r11 = r6.f9537d
            if (r11 == 0) goto L_0x009d
            androidx.media3.exoplayer.e.q r11 = r10.f8640j
            if (r11 != r1) goto L_0x0090
            int r11 = r10.f8625aa
            r0 = 3
            if (r11 != r0) goto L_0x009d
        L_0x0090:
            androidx.media3.exoplayer.i r11 = new androidx.media3.exoplayer.i
            java.lang.String r2 = r3.f8587a
            r0 = 0
            r1 = r11
            r3 = r5
            r5 = r0
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r11
        L_0x009d:
            return r6
        L_0x009e:
            if (r11 == 0) goto L_0x00b6
            if (r6 != 0) goto L_0x00a3
            goto L_0x00b6
        L_0x00a3:
            int r11 = androidx.media3.common.p136b.C2612ak.f7249a
            java.util.UUID r11 = androidx.media3.common.C2669m.f7432e
            java.util.UUID r0 = androidx.media3.common.C2669m.f7428a
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x00b6
            java.util.UUID r11 = androidx.media3.common.C2669m.f7432e
            java.util.UUID r0 = androidx.media3.common.C2669m.f7428a
            r11.equals(r0)
        L_0x00b6:
            r10.m8472ao()
            androidx.media3.exoplayer.i r11 = new androidx.media3.exoplayer.i
            java.lang.String r2 = r3.f8587a
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r11
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r11
        L_0x00c7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            androidx.media3.exoplayer.o r11 = r10.mo6934g(r11, r4, r2, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p142e.C2992v.mo6508N(androidx.media3.exoplayer.cc):androidx.media3.exoplayer.i");
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public abstract C2985o mo6509O(C2989s sVar, C2680x xVar, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo6510P(Exception exc) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo6511Q(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo6512R(C2680x xVar, MediaFormat mediaFormat) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo6513S() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo6514T(C2529g gVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo6515U() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public abstract boolean mo6516V(long j, long j2, C2987q qVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2680x xVar);

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public boolean mo6517W(C2680x xVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public float mo6518X(float f, C2680x[] xVarArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public void mo6519Y(String str, long j, long j2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public abstract List mo6520Z(C2680x xVar, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public abstract int mo6522aa(C2680x xVar);

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public C2988r mo6909ab(Throwable th, C2989s sVar) {
        return new C2988r(th, sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public void mo6910ac(C2529g gVar) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.media3.exoplayer.e.s} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ad */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6911ad() {
        /*
            r12 = this;
            androidx.media3.exoplayer.e.q r0 = r12.f8640j
            if (r0 != 0) goto L_0x0178
            boolean r0 = r12.f8619U
            if (r0 != 0) goto L_0x0178
            androidx.media3.common.x r0 = r12.f8599A
            if (r0 != 0) goto L_0x000e
            goto L_0x0178
        L_0x000e:
            androidx.media3.exoplayer.c.l r1 = r12.f8635ak
            if (r1 != 0) goto L_0x0046
            boolean r0 = r12.mo6517W(r0)
            if (r0 == 0) goto L_0x0046
            androidx.media3.common.x r0 = r12.f8599A
            r12.m8471an()
            java.lang.String r0 = r0.f7496n
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r0)
            r2 = 1
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "audio/opus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003d
            androidx.media3.exoplayer.e.k r0 = r12.f8650t
            r0.f8570i = r2
            goto L_0x0043
        L_0x003d:
            androidx.media3.exoplayer.e.k r0 = r12.f8650t
            r1 = 32
            r0.f8570i = r1
        L_0x0043:
            r12.f8619U = r2
            return
        L_0x0046:
            androidx.media3.exoplayer.c.l r0 = r12.f8635ak
            r12.f8634aj = r0
            androidx.media3.common.x r0 = r12.f8599A
            java.lang.String r0 = r0.f7496n
            androidx.media3.exoplayer.c.l r0 = r12.f8634aj
            r1 = 0
            if (r0 == 0) goto L_0x0065
            boolean r0 = androidx.media3.exoplayer.p139c.C2870m.f8052a
            if (r0 != 0) goto L_0x0058
            goto L_0x0065
        L_0x0058:
            androidx.media3.exoplayer.c.l r0 = r12.f8634aj
            androidx.media3.exoplayer.c.c r0 = r0.f8051a
            androidx.media3.common.x r2 = r12.f8599A
            int r3 = r0.f8042a
            androidx.media3.exoplayer.o r0 = r12.mo6934g(r0, r2, r1, r3)
            throw r0
        L_0x0065:
            java.util.ArrayDeque r0 = r12.f8608J     // Catch:{ u -> 0x016e }
            r2 = 0
            if (r0 != 0) goto L_0x009a
            androidx.media3.common.x r0 = r12.f8599A     // Catch:{ ac -> 0x008e }
            java.util.List r0 = r12.mo6520Z(r0, r1)     // Catch:{ ac -> 0x008e }
            r0.isEmpty()     // Catch:{ ac -> 0x008e }
            java.util.ArrayDeque r3 = new java.util.ArrayDeque     // Catch:{ ac -> 0x008e }
            r3.<init>()     // Catch:{ ac -> 0x008e }
            r12.f8608J = r3     // Catch:{ ac -> 0x008e }
            boolean r3 = r0.isEmpty()     // Catch:{ ac -> 0x008e }
            if (r3 != 0) goto L_0x008b
            java.util.ArrayDeque r3 = r12.f8608J     // Catch:{ ac -> 0x008e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ac -> 0x008e }
            androidx.media3.exoplayer.e.s r0 = (androidx.media3.exoplayer.p142e.C2989s) r0     // Catch:{ ac -> 0x008e }
            r3.add(r0)     // Catch:{ ac -> 0x008e }
        L_0x008b:
            r12.f8609K = r2     // Catch:{ ac -> 0x008e }
            goto L_0x009a
        L_0x008e:
            r0 = move-exception
            androidx.media3.exoplayer.e.u r2 = new androidx.media3.exoplayer.e.u     // Catch:{ u -> 0x016e }
            androidx.media3.common.x r3 = r12.f8599A     // Catch:{ u -> 0x016e }
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r2.<init>(r3, r0, r1, r4)     // Catch:{ u -> 0x016e }
            throw r2     // Catch:{ u -> 0x016e }
        L_0x009a:
            java.util.ArrayDeque r0 = r12.f8608J     // Catch:{ u -> 0x016e }
            boolean r0 = r0.isEmpty()     // Catch:{ u -> 0x016e }
            if (r0 != 0) goto L_0x0163
            java.util.ArrayDeque r0 = r12.f8608J     // Catch:{ u -> 0x016e }
            java.lang.Object r0 = r0.peekFirst()     // Catch:{ u -> 0x016e }
            androidx.media3.exoplayer.e.s r0 = (androidx.media3.exoplayer.p142e.C2989s) r0     // Catch:{ u -> 0x016e }
        L_0x00aa:
            androidx.media3.exoplayer.e.q r3 = r12.f8640j     // Catch:{ u -> 0x016e }
            if (r3 != 0) goto L_0x0160
            java.util.ArrayDeque r3 = r12.f8608J     // Catch:{ u -> 0x016e }
            java.lang.Object r3 = r3.peekFirst()     // Catch:{ u -> 0x016e }
            r9 = r3
            androidx.media3.exoplayer.e.s r9 = (androidx.media3.exoplayer.p142e.C2989s) r9     // Catch:{ u -> 0x016e }
            boolean r3 = r12.mo6918ak(r9)     // Catch:{ u -> 0x016e }
            if (r3 != 0) goto L_0x00be
            return
        L_0x00be:
            r12.m8474aq(r9, r2)     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00aa
        L_0x00c2:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r9 != r0) goto L_0x00d5
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            androidx.media3.common.p136b.C2633u.m7050e(r4, r3)     // Catch:{ Exception -> 0x00d6 }
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch:{ Exception -> 0x00d6 }
            r12.m8474aq(r9, r2)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00aa
        L_0x00d5:
            throw r3     // Catch:{ Exception -> 0x00d6 }
        L_0x00d6:
            r3 = move-exception
            r6 = r3
            java.lang.String r3 = "Failed to initialize decoder: "
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ u -> 0x016e }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ u -> 0x016e }
            java.lang.String r3 = r3.concat(r5)     // Catch:{ u -> 0x016e }
            java.lang.String r3 = androidx.media3.common.p136b.C2633u.m7046a(r3, r6)     // Catch:{ u -> 0x016e }
            androidx.media3.common.p136b.C2633u.m7050e(r4, r3)     // Catch:{ u -> 0x016e }
            java.util.ArrayDeque r3 = r12.f8608J     // Catch:{ u -> 0x016e }
            r3.removeFirst()     // Catch:{ u -> 0x016e }
            androidx.media3.exoplayer.e.u r3 = new androidx.media3.exoplayer.e.u     // Catch:{ u -> 0x016e }
            androidx.media3.common.x r4 = r12.f8599A     // Catch:{ u -> 0x016e }
            java.lang.String r5 = r9.f8587a     // Catch:{ u -> 0x016e }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ u -> 0x016e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ u -> 0x016e }
            r8.<init>()     // Catch:{ u -> 0x016e }
            java.lang.String r10 = "Decoder init failed: "
            r8.append(r10)     // Catch:{ u -> 0x016e }
            r8.append(r5)     // Catch:{ u -> 0x016e }
            java.lang.String r5 = ", "
            r8.append(r5)     // Catch:{ u -> 0x016e }
            r8.append(r7)     // Catch:{ u -> 0x016e }
            java.lang.String r5 = r8.toString()     // Catch:{ u -> 0x016e }
            java.lang.String r7 = r4.f7496n     // Catch:{ u -> 0x016e }
            int r4 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ u -> 0x016e }
            boolean r4 = r6 instanceof android.media.MediaCodec.CodecException     // Catch:{ u -> 0x016e }
            if (r4 == 0) goto L_0x0126
            r4 = r6
            android.media.MediaCodec$CodecException r4 = (android.media.MediaCodec.CodecException) r4     // Catch:{ u -> 0x016e }
            java.lang.String r4 = r4.getDiagnosticInfo()     // Catch:{ u -> 0x016e }
            r10 = r4
            goto L_0x0127
        L_0x0126:
            r10 = r2
        L_0x0127:
            r8 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ u -> 0x016e }
            r12.mo6510P(r3)     // Catch:{ u -> 0x016e }
            androidx.media3.exoplayer.e.u r4 = r12.f8609K     // Catch:{ u -> 0x016e }
            if (r4 != 0) goto L_0x0136
            r12.f8609K = r3     // Catch:{ u -> 0x016e }
            goto L_0x0153
        L_0x0136:
            androidx.media3.exoplayer.e.u r10 = new androidx.media3.exoplayer.e.u     // Catch:{ u -> 0x016e }
            java.lang.String r5 = r4.getMessage()     // Catch:{ u -> 0x016e }
            java.lang.Throwable r6 = r4.getCause()     // Catch:{ u -> 0x016e }
            java.lang.String r7 = r4.f8595a     // Catch:{ u -> 0x016e }
            r8 = 0
            androidx.media3.exoplayer.e.s r9 = r4.f8597c     // Catch:{ u -> 0x016e }
            java.lang.String r11 = r4.f8598d     // Catch:{ u -> 0x016e }
            r3 = r10
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ u -> 0x016e }
            r12.f8609K = r10     // Catch:{ u -> 0x016e }
        L_0x0153:
            java.util.ArrayDeque r3 = r12.f8608J     // Catch:{ u -> 0x016e }
            boolean r3 = r3.isEmpty()     // Catch:{ u -> 0x016e }
            if (r3 != 0) goto L_0x015d
            goto L_0x00aa
        L_0x015d:
            androidx.media3.exoplayer.e.u r0 = r12.f8609K     // Catch:{ u -> 0x016e }
            throw r0     // Catch:{ u -> 0x016e }
        L_0x0160:
            r12.f8608J = r2     // Catch:{ u -> 0x016e }
            return
        L_0x0163:
            androidx.media3.exoplayer.e.u r0 = new androidx.media3.exoplayer.e.u     // Catch:{ u -> 0x016e }
            androidx.media3.common.x r3 = r12.f8599A     // Catch:{ u -> 0x016e }
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>(r3, r2, r1, r4)     // Catch:{ u -> 0x016e }
            throw r0     // Catch:{ u -> 0x016e }
        L_0x016e:
            r0 = move-exception
            androidx.media3.common.x r2 = r12.f8599A
            r3 = 4001(0xfa1, float:5.607E-42)
            androidx.media3.exoplayer.o r0 = r12.mo6934g(r0, r2, r1, r3)
            throw r0
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p142e.C2992v.mo6911ad():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public void mo6912ae(long j) {
        while (true) {
            int i = this.f8633ai;
            if (i != 0 && j >= this.f8656z[0]) {
                long[] jArr = this.f8654x;
                this.f8632ah = jArr[0];
                this.f8647q = this.f8655y[0];
                int i2 = i - 1;
                this.f8633ai = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f8655y;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f8633ai);
                long[] jArr3 = this.f8656z;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f8633ai);
                mo6513S();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final void mo6913af() {
        try {
            C2987q qVar = this.f8640j;
            if (qVar != null) {
                qVar.mo6874h();
                this.f8646p.f8695b++;
                mo6511Q(this.f8642l.f8587a);
            }
        } finally {
            this.f8640j = null;
            this.f8601C = null;
            this.f8634aj = null;
            mo6915ah();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ag */
    public void mo6914ag() {
        m8476as();
        m8477at();
        this.f8613O = -9223372036854775807L;
        this.f8626ab = false;
        this.f8617S = false;
        this.f8618T = false;
        this.f8652v.clear();
        this.f8628ad = -9223372036854775807L;
        this.f8629ae = -9223372036854775807L;
        C2982l lVar = this.f8612N;
        if (lVar != null) {
            lVar.f8571a = 0;
            lVar.f8572b = 0;
            lVar.f8573c = false;
        }
        this.f8624Z = 0;
        this.f8625aa = 0;
        this.f8623Y = this.f8622X ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ah */
    public final void mo6915ah() {
        mo6914ag();
        this.f8645o = null;
        this.f8612N = null;
        this.f8608J = null;
        this.f8642l = null;
        this.f8605G = null;
        this.f8641k = null;
        this.f8606H = false;
        this.f8627ac = false;
        this.f8607I = -1.0f;
        this.f8610L = false;
        this.f8611M = false;
        this.f8622X = false;
        this.f8623Y = 0;
        this.f8602D = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aj */
    public boolean mo6917aj() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ak */
    public boolean mo6918ak(C2989s sVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public final void mo6919am() {
        if (mo6916ai()) {
            mo6911ad();
        }
    }

    /* renamed from: e */
    public final int mo6700e() {
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo6527q() {
        this.f8599A = null;
        this.f8632ah = -9223372036854775807L;
        this.f8647q = -9223372036854775807L;
        this.f8633ai = 0;
        mo6916ai();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo6528r(boolean z, boolean z2) {
        this.f8646p = new C3004h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo6529s(long j, boolean z) {
        this.f8630af = false;
        this.f8643m = false;
        this.f8644n = false;
        if (this.f8619U) {
            this.f8650t.mo5953fg();
            this.f8649s.mo5953fg();
            this.f8620V = false;
        } else {
            mo6919am();
        }
        C2608ag agVar = this.f8651u;
        if (agVar.mo6173a() > 0) {
            this.f8631ag = true;
        }
        agVar.mo6178f();
        int i = this.f8633ai;
        if (i != 0) {
            int i2 = i - 1;
            this.f8647q = this.f8655y[i2];
            this.f8632ah = this.f8654x[i2];
            this.f8633ai = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo6530t() {
        try {
            m8471an();
            mo6913af();
        } finally {
            this.f8635ak = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo6920w(C2680x[] xVarArr, long j, long j2) {
        boolean z = true;
        if (this.f8647q == -9223372036854775807L) {
            if (this.f8632ah != -9223372036854775807L) {
                z = false;
            }
            C2601a.m6832d(z);
            this.f8632ah = j;
            this.f8647q = j2;
            return;
        }
        int i = this.f8633ai;
        if (i == 10) {
            C2633u.m7050e("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f8655y[9]);
        } else {
            this.f8633ai = i + 1;
        }
        long[] jArr = this.f8654x;
        int i2 = this.f8633ai - 1;
        jArr[i2] = j;
        this.f8655y[i2] = j2;
        this.f8656z[i2] = this.f8628ad;
    }

    /* renamed from: K */
    public boolean mo6506K() {
        boolean z;
        if (this.f8599A == null) {
            return false;
        }
        if (mo6684E()) {
            z = this.f8684e;
        } else {
            C3095cf cfVar = this.f8683d;
            cfVar.getClass();
            z = cfVar.mo6847f();
        }
        if (z || m8480aw()) {
            return true;
        }
        if (this.f8613O == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f8613O) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public final boolean mo6916ai() {
        if (this.f8640j == null) {
            return false;
        }
        int i = this.f8625aa;
        if (i == 3 || (this.f8610L && !this.f8627ac)) {
            mo6913af();
            return true;
        }
        if (i == 2) {
            int i2 = C2612ak.f7249a;
            try {
                m8478au();
            } catch (C3267o e) {
                C2633u.m7050e("MediaCodecRenderer", C2633u.m7046a("Failed to update the DRM session, releasing the codec instead.", e));
                mo6913af();
                return true;
            }
        }
        m8473ap();
        return false;
    }

    /* renamed from: ar */
    private final void m8475ar() {
        int i = this.f8625aa;
        if (i == 1) {
            m8473ap();
        } else if (i == 2) {
            m8473ap();
            m8478au();
        } else if (i != 3) {
            this.f8643m = true;
            mo6515U();
        } else {
            mo6913af();
            mo6911ad();
        }
    }
}
