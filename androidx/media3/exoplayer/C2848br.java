package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Spatializer;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.common.C2574aa;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2591ar;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2593at;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2642bd;
import androidx.media3.common.C2644bf;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2666j;
import androidx.media3.common.C2672p;
import androidx.media3.common.p135a.C2568d;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2616d;
import androidx.media3.common.p136b.C2619g;
import androidx.media3.common.p136b.C2626n;
import androidx.media3.common.p136b.C2632t;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.p137a.C2684a;
import androidx.media3.exoplayer.p137a.C2733d;
import androidx.media3.exoplayer.p145h.C3035ar;
import androidx.media3.exoplayer.p145h.C3036as;
import androidx.media3.exoplayer.p145h.C3038au;
import androidx.media3.exoplayer.p145h.C3098ci;
import androidx.media3.exoplayer.p145h.C3107cr;
import androidx.media3.exoplayer.p150j.C3195ab;
import androidx.media3.exoplayer.p150j.C3204ak;
import androidx.media3.exoplayer.p150j.C3205al;
import androidx.media3.exoplayer.p150j.C3225u;
import androidx.media3.exoplayer.p151k.C3240f;
import androidx.media3.exoplayer.p151k.C3244j;
import androidx.media3.exoplayer.video.p153a.C3292q;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.media3.exoplayer.br */
/* compiled from: PG */
public final class C2848br extends C2666j implements C2759ad, C3268p {

    /* renamed from: F */
    public static final /* synthetic */ int f7951F = 0;

    /* renamed from: A */
    public C2672p f7952A;

    /* renamed from: B */
    public C2593at f7953B;

    /* renamed from: C */
    public C2888cq f7954C;

    /* renamed from: D */
    public int f7955D;

    /* renamed from: E */
    public long f7956E;

    /* renamed from: G */
    private final C2619g f7957G;

    /* renamed from: H */
    private final Context f7958H;

    /* renamed from: I */
    private final C2893cv[] f7959I;

    /* renamed from: J */
    private final C3204ak f7960J;

    /* renamed from: K */
    private final C2626n f7961K;

    /* renamed from: L */
    private final C2872ca f7962L;

    /* renamed from: M */
    private final CopyOnWriteArraySet f7963M;

    /* renamed from: N */
    private final C2649bk f7964N;

    /* renamed from: O */
    private final boolean f7965O;

    /* renamed from: P */
    private final C3035ar f7966P;

    /* renamed from: Q */
    private final C3240f f7967Q;

    /* renamed from: R */
    private final long f7968R;

    /* renamed from: S */
    private final long f7969S;

    /* renamed from: T */
    private final C2616d f7970T;

    /* renamed from: U */
    private final C2857c f7971U;

    /* renamed from: V */
    private final C2997f f7972V;

    /* renamed from: W */
    private final C2961de f7973W;

    /* renamed from: X */
    private final C2962df f7974X;

    /* renamed from: Y */
    private final long f7975Y;

    /* renamed from: Z */
    private C2897cz f7976Z;

    /* renamed from: a */
    final C3205al f7977a;

    /* renamed from: aa */
    private boolean f7978aa;

    /* renamed from: ab */
    private Surface f7979ab;

    /* renamed from: ac */
    private TextureView f7980ac;

    /* renamed from: ad */
    private int f7981ad;

    /* renamed from: ae */
    private int f7982ae;

    /* renamed from: af */
    private int f7983af;

    /* renamed from: ag */
    private C2664h f7984ag;

    /* renamed from: ah */
    private boolean f7985ah;

    /* renamed from: ai */
    private boolean f7986ai;

    /* renamed from: aj */
    private boolean f7987aj;

    /* renamed from: ak */
    private final C2771ap f7988ak;

    /* renamed from: al */
    private C3098ci f7989al;

    /* renamed from: b */
    final C2642bd f7990b;

    /* renamed from: c */
    public final C2646bh f7991c;

    /* renamed from: d */
    public final C2632t f7992d;

    /* renamed from: e */
    public final List f7993e;

    /* renamed from: f */
    public final C2684a f7994f;

    /* renamed from: g */
    public final Looper f7995g;

    /* renamed from: h */
    public final C2845bo f7996h;

    /* renamed from: i */
    public final C2846bp f7997i;

    /* renamed from: j */
    public final C2960dd f7998j;

    /* renamed from: k */
    public int f7999k;

    /* renamed from: l */
    public boolean f8000l;

    /* renamed from: n */
    public int f8001n;

    /* renamed from: o */
    public int f8002o;

    /* renamed from: p */
    public boolean f8003p;

    /* renamed from: q */
    public int f8004q;

    /* renamed from: r */
    public C2642bd f8005r;

    /* renamed from: s */
    public C2593at f8006s;

    /* renamed from: t */
    public Object f8007t;

    /* renamed from: u */
    public SurfaceHolder f8008u;

    /* renamed from: v */
    public C3292q f8009v;

    /* renamed from: w */
    public boolean f8010w;

    /* renamed from: x */
    public int f8011x;

    /* renamed from: y */
    public float f8012y;

    /* renamed from: z */
    public boolean f8013z;

    static {
        C2591ar.m6797b("media3.exoplayer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x02d8 A[Catch:{ all -> 0x0356 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x02da A[Catch:{ all -> 0x0356 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x02e1 A[Catch:{ all -> 0x0356 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02fd A[Catch:{ all -> 0x0356 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2848br(androidx.media3.exoplayer.C2758ac r39) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            java.lang.String r2 = "Init "
            r38.<init>()
            androidx.media3.common.b.g r3 = new androidx.media3.common.b.g
            r4 = 0
            r3.<init>(r4)
            r1.f7957G = r3
            java.lang.String r5 = "ExoPlayerImpl"
            int r6 = java.lang.System.identityHashCode(r38)     // Catch:{ all -> 0x0356 }
            java.lang.String r6 = java.lang.Integer.toHexString(r6)     // Catch:{ all -> 0x0356 }
            java.lang.String r7 = androidx.media3.common.p136b.C2612ak.f7253e     // Catch:{ all -> 0x0356 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0356 }
            r8.<init>(r2)     // Catch:{ all -> 0x0356 }
            r8.append(r6)     // Catch:{ all -> 0x0356 }
            java.lang.String r2 = " [AndroidXMedia3/1.0.0-beta02] ["
            r8.append(r2)     // Catch:{ all -> 0x0356 }
            r8.append(r7)     // Catch:{ all -> 0x0356 }
            java.lang.String r2 = "]"
            r8.append(r2)     // Catch:{ all -> 0x0356 }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x0356 }
            androidx.media3.common.p136b.C2633u.m7049d(r5, r2)     // Catch:{ all -> 0x0356 }
            android.content.Context r2 = r0.f7638a     // Catch:{ all -> 0x0356 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0356 }
            r1.f7958H = r2     // Catch:{ all -> 0x0356 }
            com.google.common.base.ah r5 = r0.f7645h     // Catch:{ all -> 0x0356 }
            androidx.media3.common.b.d r6 = r0.f7639b     // Catch:{ all -> 0x0356 }
            java.lang.Object r5 = r5.apply(r6)     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.a.a r5 = (androidx.media3.exoplayer.p137a.C2684a) r5     // Catch:{ all -> 0x0356 }
            r1.f7994f = r5     // Catch:{ all -> 0x0356 }
            androidx.media3.common.h r6 = r0.f7647j     // Catch:{ all -> 0x0356 }
            r1.f7984ag = r6     // Catch:{ all -> 0x0356 }
            int r6 = r0.f7651n     // Catch:{ all -> 0x0356 }
            r1.f8011x = r6     // Catch:{ all -> 0x0356 }
            r15 = 0
            r1.f8013z = r15     // Catch:{ all -> 0x0356 }
            long r6 = r0.f7657t     // Catch:{ all -> 0x0356 }
            r1.f7975Y = r6     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.bo r14 = new androidx.media3.exoplayer.bo     // Catch:{ all -> 0x0356 }
            r14.<init>(r1)     // Catch:{ all -> 0x0356 }
            r1.f7996h = r14     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.bp r7 = new androidx.media3.exoplayer.bp     // Catch:{ all -> 0x0356 }
            r7.<init>()     // Catch:{ all -> 0x0356 }
            r1.f7997i = r7     // Catch:{ all -> 0x0356 }
            android.os.Handler r6 = new android.os.Handler     // Catch:{ all -> 0x0356 }
            android.os.Looper r8 = r0.f7646i     // Catch:{ all -> 0x0356 }
            r6.<init>(r8)     // Catch:{ all -> 0x0356 }
            com.google.common.base.cr r8 = r0.f7640c     // Catch:{ all -> 0x0356 }
            java.lang.Object r8 = r8.mo6453a()     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.cy r8 = (androidx.media3.exoplayer.C2896cy) r8     // Catch:{ all -> 0x0356 }
            r9 = r6
            r10 = r14
            r11 = r14
            r12 = r14
            r13 = r14
            androidx.media3.exoplayer.cv[] r8 = r8.mo6704a(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0356 }
            r1.f7959I = r8     // Catch:{ all -> 0x0356 }
            int r9 = r8.length     // Catch:{ all -> 0x0356 }
            if (r9 <= 0) goto L_0x0089
            r9 = 1
            goto L_0x008a
        L_0x0089:
            r9 = 0
        L_0x008a:
            androidx.media3.common.p136b.C2601a.m6832d(r9)     // Catch:{ all -> 0x0356 }
            com.google.common.base.cr r9 = r0.f7642e     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.w r9 = (androidx.media3.exoplayer.C3320w) r9     // Catch:{ all -> 0x0356 }
            android.content.Context r9 = r9.f10026a     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.j.ab r12 = new androidx.media3.exoplayer.j.ab     // Catch:{ all -> 0x0356 }
            r12.<init>(r9)     // Catch:{ all -> 0x0356 }
            r1.f7960J = r12     // Catch:{ all -> 0x0356 }
            com.google.common.base.cr r9 = r0.f7641d     // Catch:{ all -> 0x0356 }
            java.lang.Object r9 = r9.mo6453a()     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.h.ar r9 = (androidx.media3.exoplayer.p145h.C3035ar) r9     // Catch:{ all -> 0x0356 }
            r1.f7966P = r9     // Catch:{ all -> 0x0356 }
            com.google.common.base.cr r9 = r0.f7644g     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.z r9 = (androidx.media3.exoplayer.C3323z) r9     // Catch:{ all -> 0x0356 }
            android.content.Context r9 = r9.f10029a     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.k.j r11 = androidx.media3.exoplayer.p151k.C3244j.m9455f(r9)     // Catch:{ all -> 0x0356 }
            r1.f7967Q = r11     // Catch:{ all -> 0x0356 }
            boolean r9 = r0.f7652o     // Catch:{ all -> 0x0356 }
            r1.f7965O = r9     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.cz r9 = r0.f7653p     // Catch:{ all -> 0x0356 }
            r1.f7976Z = r9     // Catch:{ all -> 0x0356 }
            long r9 = r0.f7654q     // Catch:{ all -> 0x0356 }
            r1.f7968R = r9     // Catch:{ all -> 0x0356 }
            long r9 = r0.f7655r     // Catch:{ all -> 0x0356 }
            r1.f7969S = r9     // Catch:{ all -> 0x0356 }
            boolean r9 = r0.f7658u     // Catch:{ all -> 0x0356 }
            r1.f7978aa = r9     // Catch:{ all -> 0x0356 }
            android.os.Looper r10 = r0.f7646i     // Catch:{ all -> 0x0356 }
            r1.f7995g = r10     // Catch:{ all -> 0x0356 }
            androidx.media3.common.b.d r9 = r0.f7639b     // Catch:{ all -> 0x0356 }
            r1.f7970T = r9     // Catch:{ all -> 0x0356 }
            r1.f7991c = r1     // Catch:{ all -> 0x0356 }
            androidx.media3.common.b.t r13 = new androidx.media3.common.b.t     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.ao r15 = new androidx.media3.exoplayer.ao     // Catch:{ all -> 0x0356 }
            r15.<init>(r1)     // Catch:{ all -> 0x0356 }
            r13.<init>(r10, r9, r15)     // Catch:{ all -> 0x0356 }
            r1.f7992d = r13     // Catch:{ all -> 0x0356 }
            java.util.concurrent.CopyOnWriteArraySet r15 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x0356 }
            r15.<init>()     // Catch:{ all -> 0x0356 }
            r1.f7963M = r15     // Catch:{ all -> 0x0356 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0356 }
            r13.<init>()     // Catch:{ all -> 0x0356 }
            r1.f7993e = r13     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.h.ci r13 = new androidx.media3.exoplayer.h.ci     // Catch:{ all -> 0x0356 }
            r13.<init>()     // Catch:{ all -> 0x0356 }
            r1.f7989al = r13     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.j.al r13 = new androidx.media3.exoplayer.j.al     // Catch:{ all -> 0x0356 }
            int r4 = r8.length     // Catch:{ all -> 0x0356 }
            r18 = r6
            androidx.media3.exoplayer.cx[] r6 = new androidx.media3.exoplayer.C2895cx[r4]     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.j.ad[] r4 = new androidx.media3.exoplayer.p150j.C3197ad[r4]     // Catch:{ all -> 0x0356 }
            r19 = r7
            androidx.media3.common.bs r7 = androidx.media3.common.C2657bs.f7406a     // Catch:{ all -> 0x0356 }
            r20 = r11
            r11 = 0
            r13.<init>(r6, r4, r7, r11)     // Catch:{ all -> 0x0356 }
            r1.f7977a = r13     // Catch:{ all -> 0x0356 }
            androidx.media3.common.bk r4 = new androidx.media3.common.bk     // Catch:{ all -> 0x0356 }
            r4.<init>()     // Catch:{ all -> 0x0356 }
            r1.f7964N = r4     // Catch:{ all -> 0x0356 }
            androidx.media3.common.t r4 = new androidx.media3.common.t     // Catch:{ all -> 0x0356 }
            r4.<init>()     // Catch:{ all -> 0x0356 }
            r6 = 21
            int[] r7 = new int[r6]     // Catch:{ all -> 0x0356 }
            r16 = 0
            r17 = 1
            r7[r16] = r17     // Catch:{ all -> 0x0356 }
            r11 = 2
            r7[r17] = r11     // Catch:{ all -> 0x0356 }
            r6 = 3
            r7[r11] = r6     // Catch:{ all -> 0x0356 }
            r22 = 13
            r7[r6] = r22     // Catch:{ all -> 0x0356 }
            r23 = 14
            r24 = r3
            r3 = 4
            r7[r3] = r23     // Catch:{ all -> 0x0356 }
            r25 = 15
            r3 = 5
            r7[r3] = r25     // Catch:{ all -> 0x0356 }
            r26 = 16
            r3 = 6
            r7[r3] = r26     // Catch:{ all -> 0x0356 }
            r27 = 17
            r3 = 7
            r7[r3] = r27     // Catch:{ all -> 0x0356 }
            r28 = 18
            r3 = 8
            r7[r3] = r28     // Catch:{ all -> 0x0356 }
            r29 = 19
            r3 = 9
            r7[r3] = r29     // Catch:{ all -> 0x0356 }
            r6 = 31
            r3 = 10
            r7[r3] = r6     // Catch:{ all -> 0x0356 }
            r31 = 11
            r32 = 20
            r7[r31] = r32     // Catch:{ all -> 0x0356 }
            r31 = 12
            r33 = 30
            r7[r31] = r33     // Catch:{ all -> 0x0356 }
            r21 = 21
            r7[r22] = r21     // Catch:{ all -> 0x0356 }
            r21 = 22
            r7[r23] = r21     // Catch:{ all -> 0x0356 }
            r21 = 23
            r7[r25] = r21     // Catch:{ all -> 0x0356 }
            r21 = 24
            r7[r26] = r21     // Catch:{ all -> 0x0356 }
            r21 = 25
            r7[r27] = r21     // Catch:{ all -> 0x0356 }
            r21 = 26
            r7[r28] = r21     // Catch:{ all -> 0x0356 }
            r21 = 27
            r7[r29] = r21     // Catch:{ all -> 0x0356 }
            r21 = 28
            r7[r32] = r21     // Catch:{ all -> 0x0356 }
            r4.mo6350c(r7)     // Catch:{ all -> 0x0356 }
            r7 = 29
            r4.mo6349b(r7)     // Catch:{ all -> 0x0356 }
            androidx.media3.common.bd r4 = androidx.media3.common.C2641bc.m7056a(r4)     // Catch:{ all -> 0x0356 }
            r1.f7990b = r4     // Catch:{ all -> 0x0356 }
            androidx.media3.common.t r7 = new androidx.media3.common.t     // Catch:{ all -> 0x0356 }
            r7.<init>()     // Catch:{ all -> 0x0356 }
            androidx.media3.common.C2641bc.m7057b(r4, r7)     // Catch:{ all -> 0x0356 }
            r4 = 4
            r7.mo6349b(r4)     // Catch:{ all -> 0x0356 }
            r7.mo6349b(r3)     // Catch:{ all -> 0x0356 }
            androidx.media3.common.bd r4 = androidx.media3.common.C2641bc.m7056a(r7)     // Catch:{ all -> 0x0356 }
            r1.f8005r = r4     // Catch:{ all -> 0x0356 }
            r4 = 0
            androidx.media3.common.b.n r7 = r9.mo6160b(r10, r4)     // Catch:{ all -> 0x0356 }
            r1.f7961K = r7     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.ap r7 = new androidx.media3.exoplayer.ap     // Catch:{ all -> 0x0356 }
            r7.<init>(r1)     // Catch:{ all -> 0x0356 }
            r1.f7988ak = r7     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.cq r4 = androidx.media3.exoplayer.C2888cq.m8041h(r13)     // Catch:{ all -> 0x0356 }
            r1.f7954C = r4     // Catch:{ all -> 0x0356 }
            r5.mo6378M(r1, r10)     // Catch:{ all -> 0x0356 }
            int r4 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ all -> 0x0356 }
            if (r4 >= r6) goto L_0x01be
            androidx.media3.exoplayer.a.bt r4 = new androidx.media3.exoplayer.a.bt     // Catch:{ all -> 0x0356 }
            r4.<init>()     // Catch:{ all -> 0x0356 }
        L_0x01bb:
            r23 = r4
            goto L_0x01c5
        L_0x01be:
            boolean r4 = r0.f7659v     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.a.bt r4 = androidx.media3.exoplayer.C2835be.m7795a(r2, r1, r4)     // Catch:{ all -> 0x0356 }
            goto L_0x01bb
        L_0x01c5:
            androidx.media3.exoplayer.ca r4 = new androidx.media3.exoplayer.ca     // Catch:{ all -> 0x0356 }
            com.google.common.base.cr r6 = r0.f7643f     // Catch:{ all -> 0x0356 }
            java.lang.Object r6 = r6.mo6453a()     // Catch:{ all -> 0x0356 }
            r21 = r6
            androidx.media3.exoplayer.cd r21 = (androidx.media3.exoplayer.C2875cd) r21     // Catch:{ all -> 0x0356 }
            int r6 = r1.f7999k     // Catch:{ all -> 0x0356 }
            boolean r3 = r1.f8000l     // Catch:{ all -> 0x0356 }
            r22 = r15
            androidx.media3.exoplayer.cz r15 = r1.f7976Z     // Catch:{ all -> 0x0356 }
            r26 = r2
            androidx.media3.exoplayer.j r2 = r0.f7661x     // Catch:{ all -> 0x0356 }
            r27 = r14
            r28 = r15
            long r14 = r0.f7656s     // Catch:{ all -> 0x0356 }
            boolean r0 = r1.f7978aa     // Catch:{ all -> 0x0356 }
            r34 = r18
            r18 = r6
            r6 = r4
            r29 = r7
            r35 = r19
            r7 = r8
            r8 = r12
            r30 = r9
            r9 = r13
            r13 = r10
            r10 = r21
            r31 = r20
            r11 = r31
            r36 = r12
            r12 = r18
            r32 = r13
            r13 = r3
            r17 = r14
            r3 = r27
            r14 = r5
            r37 = r22
            r3 = 0
            r15 = r28
            r16 = r2
            r19 = r0
            r20 = r32
            r21 = r30
            r22 = r29
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0356 }
            r1.f7962L = r4     // Catch:{ all -> 0x0356 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f8012y = r0     // Catch:{ all -> 0x0356 }
            r1.f7999k = r3     // Catch:{ all -> 0x0356 }
            androidx.media3.common.at r0 = androidx.media3.common.C2593at.f7182a     // Catch:{ all -> 0x0356 }
            r1.f8006s = r0     // Catch:{ all -> 0x0356 }
            r1.f7953B = r0     // Catch:{ all -> 0x0356 }
            r0 = -1
            r1.f7955D = r0     // Catch:{ all -> 0x0356 }
            int r0 = androidx.media3.common.p136b.C2612ak.m6982g(r26)     // Catch:{ all -> 0x0356 }
            r1.f7983af = r0     // Catch:{ all -> 0x0356 }
            int r0 = androidx.media3.common.p135a.C2568d.f7101b     // Catch:{ all -> 0x0356 }
            r0 = 1
            r1.f7985ah = r0     // Catch:{ all -> 0x0356 }
            r1.mo6016w(r5)     // Catch:{ all -> 0x0356 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0356 }
            r4 = r32
            r2.<init>(r4)     // Catch:{ all -> 0x0356 }
            r5.getClass()
            r4 = r31
            r11 = r4
            androidx.media3.exoplayer.k.j r11 = (androidx.media3.exoplayer.p151k.C3244j) r11     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.k.d r4 = r4.f9752g     // Catch:{ all -> 0x0356 }
            r4.mo7232a(r5)     // Catch:{ all -> 0x0356 }
            java.util.concurrent.CopyOnWriteArrayList r4 = r4.f9739a     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.k.c r6 = new androidx.media3.exoplayer.k.c     // Catch:{ all -> 0x0356 }
            r6.<init>(r2, r5)     // Catch:{ all -> 0x0356 }
            r4.add(r6)     // Catch:{ all -> 0x0356 }
            r2 = r27
            r4 = r37
            r4.add(r2)     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.c r4 = new androidx.media3.exoplayer.c     // Catch:{ all -> 0x0356 }
            r5 = r39
            android.content.Context r6 = r5.f7638a     // Catch:{ all -> 0x0356 }
            r7 = r34
            r4.<init>(r6, r7, r2)     // Catch:{ all -> 0x0356 }
            r1.f7971U = r4     // Catch:{ all -> 0x0356 }
            boolean r6 = r5.f7650m     // Catch:{ all -> 0x0356 }
            r4.mo6606a(r6)     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.f r4 = new androidx.media3.exoplayer.f     // Catch:{ all -> 0x0356 }
            android.content.Context r6 = r5.f7638a     // Catch:{ all -> 0x0356 }
            r4.<init>(r6, r7, r2)     // Catch:{ all -> 0x0356 }
            r1.f7972V = r4     // Catch:{ all -> 0x0356 }
            boolean r6 = r5.f7648k     // Catch:{ all -> 0x0356 }
            if (r6 == 0) goto L_0x027e
            androidx.media3.common.h r6 = r1.f7984ag     // Catch:{ all -> 0x0356 }
            goto L_0x027f
        L_0x027e:
            r6 = 0
        L_0x027f:
            r4.mo6925d(r6)     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.dd r4 = new androidx.media3.exoplayer.dd     // Catch:{ all -> 0x0356 }
            android.content.Context r6 = r5.f7638a     // Catch:{ all -> 0x0356 }
            r4.<init>(r6, r7, r2)     // Catch:{ all -> 0x0356 }
            r1.f7998j = r4     // Catch:{ all -> 0x0356 }
            androidx.media3.common.h r2 = r1.f7984ag     // Catch:{ all -> 0x0356 }
            int r2 = r2.f7423c     // Catch:{ all -> 0x0356 }
            int r2 = androidx.media3.common.p136b.C2612ak.m6990o(r2)     // Catch:{ all -> 0x0356 }
            r4.mo6859a(r2)     // Catch:{ all -> 0x0356 }
            androidx.media3.exoplayer.de r2 = new androidx.media3.exoplayer.de     // Catch:{ all -> 0x0356 }
            android.content.Context r6 = r5.f7638a     // Catch:{ all -> 0x0356 }
            r2.<init>(r6)     // Catch:{ all -> 0x0356 }
            r1.f7973W = r2     // Catch:{ all -> 0x0356 }
            int r6 = r5.f7649l     // Catch:{ all -> 0x0356 }
            if (r6 == 0) goto L_0x02a5
            r15 = 1
            goto L_0x02a6
        L_0x02a5:
            r15 = 0
        L_0x02a6:
            if (r15 == 0) goto L_0x02c5
            android.os.PowerManager$WakeLock r6 = r2.f8511b     // Catch:{ all -> 0x0356 }
            if (r6 != 0) goto L_0x02c5
            android.os.PowerManager r6 = r2.f8510a     // Catch:{ all -> 0x0356 }
            if (r6 != 0) goto L_0x02b8
            java.lang.String r2 = "WakeLockManager"
            java.lang.String r6 = "PowerManager is null, therefore not creating the WakeLock."
            androidx.media3.common.p136b.C2633u.m7050e(r2, r6)     // Catch:{ all -> 0x0356 }
            goto L_0x02ca
        L_0x02b8:
            java.lang.String r7 = "ExoPlayer:WakeLockManager"
            android.os.PowerManager$WakeLock r6 = r6.newWakeLock(r0, r7)     // Catch:{ all -> 0x0356 }
            r2.f8511b = r6     // Catch:{ all -> 0x0356 }
            android.os.PowerManager$WakeLock r6 = r2.f8511b     // Catch:{ all -> 0x0356 }
            r6.setReferenceCounted(r3)     // Catch:{ all -> 0x0356 }
        L_0x02c5:
            r2.f8512c = r15     // Catch:{ all -> 0x0356 }
            r2.mo6861a()     // Catch:{ all -> 0x0356 }
        L_0x02ca:
            androidx.media3.exoplayer.df r2 = new androidx.media3.exoplayer.df     // Catch:{ all -> 0x0356 }
            android.content.Context r6 = r5.f7638a     // Catch:{ all -> 0x0356 }
            r2.<init>(r6)     // Catch:{ all -> 0x0356 }
            r1.f7974X = r2     // Catch:{ all -> 0x0356 }
            int r5 = r5.f7649l     // Catch:{ all -> 0x0356 }
            r6 = 2
            if (r5 != r6) goto L_0x02da
            r15 = 1
            goto L_0x02db
        L_0x02da:
            r15 = 0
        L_0x02db:
            if (r15 == 0) goto L_0x02fd
            android.net.wifi.WifiManager$WifiLock r5 = r2.f8515b     // Catch:{ all -> 0x0356 }
            if (r5 != 0) goto L_0x02fd
            android.net.wifi.WifiManager r5 = r2.f8514a     // Catch:{ all -> 0x0356 }
            if (r5 != 0) goto L_0x02ee
            java.lang.String r2 = "WifiLockManager"
            java.lang.String r5 = "WifiManager is null, therefore not creating the WifiLock."
            androidx.media3.common.p136b.C2633u.m7050e(r2, r5)     // Catch:{ all -> 0x0356 }
            r8 = 3
            goto L_0x0303
        L_0x02ee:
            java.lang.String r7 = "ExoPlayer:WifiLockManager"
            r8 = 3
            android.net.wifi.WifiManager$WifiLock r5 = r5.createWifiLock(r8, r7)     // Catch:{ all -> 0x0356 }
            r2.f8515b = r5     // Catch:{ all -> 0x0356 }
            android.net.wifi.WifiManager$WifiLock r5 = r2.f8515b     // Catch:{ all -> 0x0356 }
            r5.setReferenceCounted(r3)     // Catch:{ all -> 0x0356 }
            goto L_0x02fe
        L_0x02fd:
            r8 = 3
        L_0x02fe:
            r2.f8516c = r15     // Catch:{ all -> 0x0356 }
            r2.mo6862a()     // Catch:{ all -> 0x0356 }
        L_0x0303:
            androidx.media3.common.p r2 = m7814aA(r4)     // Catch:{ all -> 0x0356 }
            r1.f7952A = r2     // Catch:{ all -> 0x0356 }
            androidx.media3.common.h r2 = r1.f7984ag     // Catch:{ all -> 0x0356 }
            r4 = r36
            r4.mo7205e(r2)     // Catch:{ all -> 0x0356 }
            int r2 = r1.f7983af     // Catch:{ all -> 0x0356 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0356 }
            r4 = 10
            r1.mo6591aH(r0, r4, r2)     // Catch:{ all -> 0x0356 }
            int r2 = r1.f7983af     // Catch:{ all -> 0x0356 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0356 }
            r1.mo6591aH(r6, r4, r2)     // Catch:{ all -> 0x0356 }
            androidx.media3.common.h r2 = r1.f7984ag     // Catch:{ all -> 0x0356 }
            r1.mo6591aH(r0, r8, r2)     // Catch:{ all -> 0x0356 }
            int r2 = r1.f8011x     // Catch:{ all -> 0x0356 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0356 }
            r4 = 4
            r1.mo6591aH(r6, r4, r2)     // Catch:{ all -> 0x0356 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0356 }
            r3 = 5
            r1.mo6591aH(r6, r3, r2)     // Catch:{ all -> 0x0356 }
            boolean r2 = r1.f8013z     // Catch:{ all -> 0x0356 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0356 }
            r3 = 9
            r1.mo6591aH(r0, r3, r2)     // Catch:{ all -> 0x0356 }
            r0 = r35
            r2 = 7
            r1.mo6591aH(r6, r2, r0)     // Catch:{ all -> 0x0356 }
            r2 = 8
            r3 = 6
            r1.mo6591aH(r3, r2, r0)     // Catch:{ all -> 0x0356 }
            r24.mo6192d()
            return
        L_0x0356:
            r0 = move-exception
            androidx.media3.common.b.g r2 = r1.f7957G
            r2.mo6192d()
            goto L_0x035e
        L_0x035d:
            throw r0
        L_0x035e:
            goto L_0x035d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2848br.<init>(androidx.media3.exoplayer.ac):void");
    }

    /* renamed from: aA */
    public static C2672p m7814aA(C2960dd ddVar) {
        int i = C2612ak.f7249a;
        return new C2672p(ddVar.f8504c.getStreamMinVolume(ddVar.f8506e), ddVar.f8504c.getStreamMaxVolume(ddVar.f8506e));
    }

    /* renamed from: aR */
    public static boolean m7815aR(C2888cq cqVar) {
        return cqVar.f8168f == 3 && cqVar.f8175m && cqVar.f8176n == 0;
    }

    /* renamed from: aS */
    private final int m7816aS() {
        if (this.f7954C.f8164b.mo6304o()) {
            return this.f7955D;
        }
        C2888cq cqVar = this.f7954C;
        return cqVar.f8164b.mo6303n(cqVar.f8165c.f7204a, this.f7964N).f7330c;
    }

    /* renamed from: aT */
    private final long m7817aT(C2888cq cqVar) {
        if (cqVar.f8164b.mo6304o()) {
            return C2612ak.m6998w(this.f7956E);
        }
        if (cqVar.f8165c.mo6102a()) {
            return cqVar.f8181s;
        }
        return mo6601az(cqVar.f8164b, cqVar.f8165c, cqVar.f8181s);
    }

    /* renamed from: aU */
    private static long m7818aU(C2888cq cqVar) {
        C2650bl blVar = new C2650bl();
        C2649bk bkVar = new C2649bk();
        cqVar.f8164b.mo6303n(cqVar.f8165c.f7204a, bkVar);
        long j = cqVar.f8166d;
        return j == -9223372036854775807L ? cqVar.f8164b.mo6024e(bkVar.f7330c, blVar, 0).f7348m : bkVar.f7332e + j;
    }

    /* renamed from: aV */
    private final Pair m7819aV(C2651bm bmVar, int i, long j) {
        if (bmVar.mo6304o()) {
            this.f7955D = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f7956E = j;
            return null;
        }
        if (i == -1 || i >= bmVar.mo6022c()) {
            i = bmVar.mo6296g(this.f8000l);
            j = C2612ak.m6918A(bmVar.mo6024e(i, this.f7427m, 0).f7348m);
        }
        return bmVar.mo6301l(this.f7427m, this.f7964N, i, C2612ak.m6998w(j));
    }

    /* renamed from: aW */
    private final C2651bm m7820aW() {
        return new C2892cu(this.f7993e, this.f7989al);
    }

    /* renamed from: aX */
    private final C2888cq m7821aX(C2888cq cqVar, C2651bm bmVar, Pair pair) {
        C3107cr crVar;
        C3205al alVar;
        C3036as asVar;
        List list;
        C2888cq cqVar2;
        long j;
        C2651bm bmVar2 = bmVar;
        Pair pair2 = pair;
        C2601a.m6830b(bmVar.mo6304o() || pair2 != null);
        C2651bm bmVar3 = cqVar.f8164b;
        C2888cq g = cqVar.mo6673g(bmVar);
        if (bmVar.mo6304o()) {
            C3036as asVar2 = C2888cq.f8163a;
            long w = C2612ak.m6998w(this.f7956E);
            C2888cq a = g.mo6668b(asVar2, w, w, w, 0, C3107cr.f9108a, this.f7977a, C58485gu.m89845m()).mo6667a(asVar2);
            a.f8179q = a.f8181s;
            return a;
        }
        Object obj = g.f8165c.f7204a;
        int i = C2612ak.f7249a;
        boolean z = !obj.equals(pair2.first);
        C3036as asVar3 = z ? new C3036as(pair2.first) : g.f8165c;
        long longValue = ((Long) pair2.second).longValue();
        long w2 = C2612ak.m6998w(mo6003j());
        if (!bmVar3.mo6304o()) {
            w2 -= bmVar3.mo6303n(obj, this.f7964N).f7332e;
        }
        if (z || longValue < w2) {
            C3036as asVar4 = asVar3;
            C2601a.m6832d(!asVar4.mo6102a());
            if (z) {
                crVar = C3107cr.f9108a;
            } else {
                crVar = g.f8171i;
            }
            C3107cr crVar2 = crVar;
            if (z) {
                asVar = asVar4;
                alVar = this.f7977a;
            } else {
                asVar = asVar4;
                alVar = g.f8172j;
            }
            C3205al alVar2 = alVar;
            if (z) {
                list = C58485gu.m89845m();
            } else {
                list = g.f8173k;
            }
            C2888cq a2 = g.mo6668b(asVar, longValue, longValue, longValue, 0, crVar2, alVar2, list).mo6667a(asVar);
            a2.f8179q = longValue;
            return a2;
        }
        if (longValue == w2) {
            int a3 = bmVar2.mo6020a(g.f8174l.f7204a);
            if (a3 != -1 && bmVar2.mo6023d(a3, this.f7964N, false).f7330c == bmVar2.mo6303n(asVar3.f7204a, this.f7964N).f7330c) {
                return g;
            }
            bmVar2.mo6303n(asVar3.f7204a, this.f7964N);
            if (asVar3.mo6102a()) {
                j = this.f7964N.mo6284e(asVar3.f7205b, asVar3.f7206c);
            } else {
                j = this.f7964N.f7331d;
            }
            cqVar2 = g.mo6668b(asVar3, g.f8181s, g.f8181s, g.f8167e, j - g.f8181s, g.f8171i, g.f8172j, g.f8173k).mo6667a(asVar3);
            cqVar2.f8179q = j;
        } else {
            C3036as asVar5 = asVar3;
            C2601a.m6832d(!asVar5.mo6102a());
            long max = Math.max(0, g.f8180r - (longValue - w2));
            long j2 = g.f8179q;
            if (g.f8174l.equals(g.f8165c)) {
                j2 = longValue + max;
            }
            cqVar2 = g.mo6668b(asVar5, longValue, longValue, longValue, max, g.f8171i, g.f8172j, g.f8173k);
            cqVar2.f8179q = j2;
        }
        return cqVar2;
    }

    /* renamed from: aY */
    private final List m7822aY(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((C58724pq) list).f156474d; i++) {
            arrayList.add(this.f7966P.mo6760b((C2590aq) list.get(i)));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* renamed from: aZ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7823aZ(java.util.List r18, int r19, long r20, boolean r22) {
        /*
            r17 = this;
            r10 = r17
            r0 = r19
            int r1 = r17.m7816aS()
            long r2 = r17.mo6004k()
            int r4 = r10.f8001n
            r5 = 1
            int r4 = r4 + r5
            r10.f8001n = r4
            java.util.List r4 = r10.f7993e
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0023
            java.util.List r4 = r10.f7993e
            int r4 = r4.size()
            r10.m7828bd(r4)
        L_0x0023:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r4 = 0
            r6 = 0
        L_0x002a:
            int r7 = r18.size()
            if (r6 >= r7) goto L_0x0055
            androidx.media3.exoplayer.cn r7 = new androidx.media3.exoplayer.cn
            r8 = r18
            java.lang.Object r9 = r8.get(r6)
            androidx.media3.exoplayer.h.au r9 = (androidx.media3.exoplayer.p145h.C3038au) r9
            boolean r11 = r10.f7965O
            r7.<init>(r9, r11)
            r12.add(r7)
            java.util.List r9 = r10.f7993e
            androidx.media3.exoplayer.bq r11 = new androidx.media3.exoplayer.bq
            java.lang.Object r13 = r7.f8147b
            androidx.media3.exoplayer.h.an r7 = r7.f8146a
            androidx.media3.exoplayer.h.al r7 = r7.f8786a
            r11.<init>(r13, r7)
            r9.add(r6, r11)
            int r6 = r6 + 1
            goto L_0x002a
        L_0x0055:
            androidx.media3.exoplayer.h.ci r6 = r10.f7989al
            int r7 = r12.size()
            androidx.media3.exoplayer.h.ci r6 = r6.mo7091b(r4, r7)
            r10.f7989al = r6
            androidx.media3.common.bm r6 = r17.m7820aW()
            boolean r7 = r6.mo6304o()
            if (r7 != 0) goto L_0x0079
            r7 = r6
            androidx.media3.exoplayer.cu r7 = (androidx.media3.exoplayer.C2892cu) r7
            int r7 = r7.f8194a
            if (r0 >= r7) goto L_0x0073
            goto L_0x0079
        L_0x0073:
            androidx.media3.common.aa r0 = new androidx.media3.common.aa
            r0.<init>()
            throw r0
        L_0x0079:
            r7 = -1
            if (r22 == 0) goto L_0x0089
            boolean r0 = r10.f8000l
            int r0 = r6.mo6296g(r0)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0087:
            r14 = r0
            goto L_0x0091
        L_0x0089:
            if (r0 != r7) goto L_0x008e
            r14 = r1
            r1 = r2
            goto L_0x0091
        L_0x008e:
            r1 = r20
            goto L_0x0087
        L_0x0091:
            androidx.media3.exoplayer.cq r0 = r10.f7954C
            android.util.Pair r3 = r10.m7819aV(r6, r14, r1)
            androidx.media3.exoplayer.cq r0 = r10.m7821aX(r0, r6, r3)
            int r3 = r0.f8168f
            if (r14 == r7) goto L_0x00b2
            if (r3 == r5) goto L_0x00b2
            boolean r3 = r6.mo6304o()
            r7 = 4
            if (r3 != 0) goto L_0x00b1
            androidx.media3.exoplayer.cu r6 = (androidx.media3.exoplayer.C2892cu) r6
            int r3 = r6.f8194a
            if (r14 < r3) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r3 = 2
            goto L_0x00b2
        L_0x00b1:
            r3 = 4
        L_0x00b2:
            androidx.media3.exoplayer.cq r3 = r0.mo6672f(r3)
            androidx.media3.exoplayer.ca r0 = r10.f7962L
            long r15 = androidx.media3.common.p136b.C2612ak.m6998w(r1)
            androidx.media3.exoplayer.h.ci r13 = r10.f7989al
            androidx.media3.common.b.n r0 = r0.f8070a
            androidx.media3.exoplayer.bv r1 = new androidx.media3.exoplayer.bv
            r11 = r1
            r11.<init>(r12, r13, r14, r15)
            r2 = 17
            androidx.media3.common.b.ae r0 = r0.mo6163b(r2, r1)
            r0.mo6161a()
            androidx.media3.exoplayer.cq r0 = r10.f7954C
            androidx.media3.exoplayer.h.as r0 = r0.f8165c
            java.lang.Object r0 = r0.f7204a
            androidx.media3.exoplayer.h.as r1 = r3.f8165c
            java.lang.Object r1 = r1.f7204a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00ea
            androidx.media3.exoplayer.cq r0 = r10.f7954C
            androidx.media3.common.bm r0 = r0.f8164b
            boolean r0 = r0.mo6304o()
            if (r0 != 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r5 = 0
        L_0x00eb:
            r2 = 0
            r4 = 1
            r6 = 0
            r7 = 4
            long r8 = r10.m7817aT(r3)
            r11 = -1
            r0 = r17
            r1 = r3
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r9 = r11
            r0.mo6598aO(r1, r2, r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2848br.m7823aZ(java.util.List, int, long, boolean):void");
    }

    /* renamed from: ay */
    public static int m7824ay(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: ba */
    private final void m7825ba(boolean z, C3267o oVar) {
        C2888cq cqVar;
        if (z) {
            cqVar = m7827bc(this.f7993e.size()).mo6670d((C3267o) null);
        } else {
            C2888cq cqVar2 = this.f7954C;
            cqVar = cqVar2.mo6667a(cqVar2.f8165c);
            cqVar.f8179q = cqVar.f8181s;
            cqVar.f8180r = 0;
        }
        C2888cq f = cqVar.mo6672f(1);
        if (oVar != null) {
            f = f.mo6670d(oVar);
        }
        C2888cq cqVar3 = f;
        this.f8001n++;
        this.f7962L.f8070a.mo6162a(6).mo6161a();
        mo6598aO(cqVar3, 0, 1, false, cqVar3.f8164b.mo6304o() && !this.f7954C.f8164b.mo6304o(), 4, m7817aT(cqVar3), -1);
    }

    /* renamed from: bb */
    private final void m7826bb() {
        C2642bd bdVar = this.f8005r;
        C2642bd H = C2612ak.m6925H(this.f7991c, this.f7990b);
        this.f8005r = H;
        if (!H.equals(bdVar)) {
            this.f7992d.mo6204c(13, new C2768am(this));
        }
    }

    /* renamed from: bc */
    private final C2888cq m7827bc(int i) {
        int i2;
        int i3;
        Pair pair;
        int i4 = i;
        boolean z = false;
        C2601a.m6830b(i4 >= 0 && i4 <= this.f7993e.size());
        int c = mo5996c();
        C2651bm u = mo6014u();
        int size = this.f7993e.size();
        this.f8001n++;
        m7828bd(i);
        C2651bm aW = m7820aW();
        C2888cq cqVar = this.f7954C;
        long j = mo6003j();
        int i5 = -1;
        if (u.mo6304o() || aW.mo6304o()) {
            i2 = c;
            if (!u.mo6304o() && aW.mo6304o()) {
                z = true;
            }
            if (!z) {
                i5 = m7816aS();
            }
            i3 = 1;
            if (true == z) {
                j = -9223372036854775807L;
            }
            pair = m7819aV(aW, i5, j);
        } else {
            i2 = c;
            pair = u.mo6301l(this.f7427m, this.f7964N, mo5996c(), C2612ak.m6998w(j));
            Object obj = pair.first;
            if (aW.mo6020a(obj) == -1) {
                Object a = C2872ca.m7946a(this.f7427m, this.f7964N, this.f7999k, this.f8000l, obj, u, aW);
                if (a != null) {
                    aW.mo6303n(a, this.f7964N);
                    int i6 = this.f7964N.f7330c;
                    C2650bl blVar = this.f7427m;
                    aW.mo6024e(i6, blVar, 0);
                    pair = m7819aV(aW, i6, C2612ak.m6918A(blVar.f7348m));
                } else {
                    pair = m7819aV(aW, -1, -9223372036854775807L);
                }
            }
            i3 = 1;
        }
        C2888cq aX = m7821aX(cqVar, aW, pair);
        int i7 = aX.f8168f;
        if (i7 != i3 && i7 != 4 && i4 > 0 && i4 == size && i2 >= aX.f8164b.mo6022c()) {
            aX = aX.mo6672f(4);
        }
        this.f7962L.f8070a.mo6166e(i4, this.f7989al).mo6161a();
        return aX;
    }

    /* renamed from: bd */
    private final void m7828bd(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.f7993e.remove(i2);
        }
        this.f7989al = this.f7989al.mo7092c(0, i);
    }

    /* renamed from: A */
    public final void mo5973A(int i, long j) {
        int i2 = i;
        mo6600aQ();
        this.f7994f.mo6373H();
        C2651bm bmVar = this.f7954C.f8164b;
        if (i2 < 0 || (!bmVar.mo6304o() && i2 >= bmVar.mo6022c())) {
            throw new C2574aa();
        }
        int i3 = 1;
        this.f8001n++;
        if (mo5989Q()) {
            C2633u.m7050e("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C2855by byVar = new C2855by(this.f7954C);
            byVar.mo6605a(1);
            this.f7988ak.f7674a.mo6588aE(byVar);
            return;
        }
        if (mo5998e() != 1) {
            i3 = 2;
        }
        int c = mo5996c();
        C2888cq aX = m7821aX(this.f7954C.mo6672f(i3), bmVar, m7819aV(bmVar, i, j));
        this.f7962L.f8070a.mo6163b(3, new C2856bz(bmVar, i, C2612ak.m6998w(j))).mo6161a();
        mo6598aO(aX, 0, 1, true, true, 1, m7817aT(aX), c);
    }

    /* renamed from: B */
    public final void mo5974B(boolean z) {
        mo6600aQ();
        int a = this.f7972V.mo6922a(z, mo5998e());
        mo6597aN(z, a, m7824ay(z, a));
    }

    /* renamed from: C */
    public final void mo5975C(C2640bb bbVar) {
        mo6600aQ();
        if (!this.f7954C.f8177o.equals(bbVar)) {
            C2888cq e = this.f7954C.mo6671e(bbVar);
            this.f8001n++;
            this.f7962L.f8070a.mo6163b(4, bbVar).mo6161a();
            mo6598aO(e, 0, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: D */
    public final int mo6459D() {
        mo6600aQ();
        return this.f7983af;
    }

    /* renamed from: E */
    public final void mo5977E(int i) {
        mo6600aQ();
        if (this.f7999k != i) {
            this.f7999k = i;
            this.f7962L.f8070a.mo6164c(11, i, 0).mo6161a();
            this.f7992d.mo6204c(8, new C2772aq(i));
            m7826bb();
            this.f7992d.mo6203b();
        }
    }

    /* renamed from: F */
    public final void mo5978F(boolean z) {
        mo6600aQ();
        if (this.f8000l != z) {
            this.f8000l = z;
            this.f7962L.f8070a.mo6164c(12, z ? 1 : 0, 0).mo6161a();
            this.f7992d.mo6204c(9, new C2775at(z));
            m7826bb();
            this.f7992d.mo6203b();
        }
    }

    /* renamed from: G */
    public final void mo5979G(TextureView textureView) {
        mo6600aQ();
        if (textureView == null) {
            mo6587aD();
            return;
        }
        mo6590aG();
        this.f7980ac = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C2633u.m7050e("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f7996h);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            mo6596aM((Object) null);
            mo6589aF(0, 0);
            return;
        }
        mo6595aL(surfaceTexture);
        mo6589aF(textureView.getWidth(), textureView.getHeight());
    }

    /* renamed from: H */
    public final void mo5980H(float f) {
        mo6600aQ();
        float a = C2612ak.m6944a(f, 0.0f, 1.0f);
        if (this.f8012y != a) {
            this.f8012y = a;
            mo6592aI();
            C2632t tVar = this.f7992d;
            tVar.mo6204c(22, new C2777av(a));
            tVar.mo6203b();
        }
    }

    /* renamed from: I */
    public final void mo5981I() {
        mo6600aQ();
        mo5982J(false);
    }

    /* renamed from: J */
    public final void mo5982J(boolean z) {
        mo6600aQ();
        this.f7972V.mo6922a(mo5987O(), 1);
        m7825ba(z, (C3267o) null);
        C58485gu m = C58485gu.m89845m();
        long j = this.f7954C.f8181s;
        new C2568d(m);
    }

    /* renamed from: K */
    public final C3267o mo6011r() {
        mo6600aQ();
        return this.f7954C.f8169g;
    }

    @Deprecated
    /* renamed from: L */
    public final C3268p mo6461L() {
        mo6600aQ();
        return this;
    }

    @Deprecated
    /* renamed from: N */
    public final void mo6463N(C3038au auVar) {
        mo6600aQ();
        mo6467Z(auVar);
        mo6017x();
    }

    /* renamed from: O */
    public final boolean mo5987O() {
        mo6600aQ();
        return this.f7954C.f8175m;
    }

    /* renamed from: P */
    public final boolean mo5988P() {
        mo6600aQ();
        return this.f8000l;
    }

    /* renamed from: Q */
    public final boolean mo5989Q() {
        mo6600aQ();
        return this.f7954C.f8165c.mo6102a();
    }

    /* renamed from: S */
    public final void mo5991S() {
        mo6600aQ();
        C2888cq bc = m7827bc(Math.min(Integer.MAX_VALUE, this.f7993e.size()));
        mo6598aO(bc, 0, 1, false, !bc.f8165c.f7204a.equals(this.f7954C.f8165c.f7204a), 4, m7817aT(bc), -1);
    }

    /* renamed from: T */
    public final void mo5992T(List list) {
        mo6600aQ();
        mo6593aJ(m7822aY(list), true);
    }

    /* renamed from: U */
    public final void mo5993U(List list, long j) {
        mo6600aQ();
        List aY = m7822aY(list);
        mo6600aQ();
        m7823aZ(aY, 0, j, false);
    }

    @Deprecated
    /* renamed from: X */
    public final void mo6465X() {
        mo6600aQ();
        mo6017x();
    }

    /* renamed from: Y */
    public final void mo6466Y(C2664h hVar, boolean z) {
        mo6600aQ();
        if (!this.f7987aj) {
            if (!C2612ak.m6951aa(this.f7984ag, hVar)) {
                this.f7984ag = hVar;
                mo6591aH(1, 3, hVar);
                this.f7998j.mo6859a(C2612ak.m6990o(hVar.f7423c));
                this.f7992d.mo6204c(20, new C2769an(hVar));
            }
            this.f7972V.mo6925d(true != z ? null : hVar);
            this.f7960J.mo7205e(hVar);
            boolean O = mo5987O();
            int a = this.f7972V.mo6922a(O, mo5998e());
            mo6597aN(O, a, m7824ay(O, a));
            this.f7992d.mo6203b();
        }
    }

    /* renamed from: Z */
    public final void mo6467Z(C3038au auVar) {
        mo6600aQ();
        mo6468am(Collections.singletonList(auVar));
    }

    /* renamed from: a */
    public final int mo5994a() {
        mo6600aQ();
        if (mo5989Q()) {
            return this.f7954C.f8165c.f7205b;
        }
        return -1;
    }

    /* renamed from: aB */
    public final C2593at mo6585aB() {
        C2651bm u = mo6014u();
        if (u.mo6304o()) {
            return this.f7953B;
        }
        C2590aq aqVar = u.mo6024e(mo5996c(), this.f7427m, 0).f7338c;
        C2592as asVar = new C2592as(this.f7953B);
        C2593at atVar = aqVar.f7157f;
        CharSequence charSequence = atVar.f7183b;
        if (charSequence != null) {
            asVar.f7162a = charSequence;
        }
        CharSequence charSequence2 = atVar.f7184c;
        if (charSequence2 != null) {
            asVar.f7163b = charSequence2;
        }
        CharSequence charSequence3 = atVar.f7185d;
        if (charSequence3 != null) {
            asVar.f7164c = charSequence3;
        }
        CharSequence charSequence4 = atVar.f7186e;
        if (charSequence4 != null) {
            asVar.f7165d = charSequence4;
        }
        CharSequence charSequence5 = atVar.f7187f;
        if (charSequence5 != null) {
            asVar.f7166e = charSequence5;
        }
        byte[] bArr = atVar.f7188g;
        if (bArr != null) {
            asVar.mo6099b(bArr, atVar.f7189h);
        }
        Integer num = atVar.f7190i;
        if (num != null) {
            asVar.f7169h = num;
        }
        Integer num2 = atVar.f7191j;
        if (num2 != null) {
            asVar.f7170i = num2;
        }
        Integer num3 = atVar.f7192k;
        if (num3 != null) {
            asVar.f7171j = num3;
        }
        Integer num4 = atVar.f7193l;
        if (num4 != null) {
            asVar.f7171j = num4;
        }
        Integer num5 = atVar.f7194m;
        if (num5 != null) {
            asVar.f7172k = num5;
        }
        Integer num6 = atVar.f7195n;
        if (num6 != null) {
            asVar.f7173l = num6;
        }
        Integer num7 = atVar.f7196o;
        if (num7 != null) {
            asVar.f7174m = num7;
        }
        Integer num8 = atVar.f7197p;
        if (num8 != null) {
            asVar.f7175n = num8;
        }
        Integer num9 = atVar.f7198q;
        if (num9 != null) {
            asVar.f7176o = num9;
        }
        CharSequence charSequence6 = atVar.f7199r;
        if (charSequence6 != null) {
            asVar.f7177p = charSequence6;
        }
        CharSequence charSequence7 = atVar.f7200s;
        if (charSequence7 != null) {
            asVar.f7178q = charSequence7;
        }
        CharSequence charSequence8 = atVar.f7201t;
        if (charSequence8 != null) {
            asVar.f7179r = charSequence8;
        }
        CharSequence charSequence9 = atVar.f7202u;
        if (charSequence9 != null) {
            asVar.f7180s = charSequence9;
        }
        CharSequence charSequence10 = atVar.f7203v;
        if (charSequence10 != null) {
            asVar.f7181t = charSequence10;
        }
        return new C2593at(asVar);
    }

    /* renamed from: aC */
    public final C2891ct mo6586aC(C2890cs csVar) {
        int aS = m7816aS();
        C2872ca caVar = this.f7962L;
        return new C2891ct(caVar, csVar, this.f7954C.f8164b, aS == -1 ? 0 : aS, caVar.f8071b);
    }

    /* renamed from: aD */
    public final void mo6587aD() {
        mo6600aQ();
        mo6590aG();
        mo6596aM((Object) null);
        mo6589aF(0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aE */
    public final /* synthetic */ void mo6588aE(C2855by byVar) {
        this.f7961K.mo6167f(new C2773ar(this, byVar));
    }

    /* renamed from: aF */
    public final void mo6589aF(int i, int i2) {
        if (i != this.f7981ad || i2 != this.f7982ae) {
            this.f7981ad = i;
            this.f7982ae = i2;
            C2632t tVar = this.f7992d;
            tVar.mo6204c(24, new C2776au(i, i2));
            tVar.mo6203b();
        }
    }

    /* renamed from: aG */
    public final void mo6590aG() {
        if (this.f8009v != null) {
            C2891ct aC = mo6586aC(this.f7997i);
            aC.mo6678e(10000);
            aC.mo6677d((Object) null);
            aC.mo6676c();
            C3292q qVar = this.f8009v;
            qVar.f9906a.remove(this.f7996h);
            this.f8009v = null;
        }
        TextureView textureView = this.f7980ac;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f7996h) {
                C2633u.m7050e("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f7980ac.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f7980ac = null;
        }
        SurfaceHolder surfaceHolder = this.f8008u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f7996h);
            this.f8008u = null;
        }
    }

    /* renamed from: aH */
    public final void mo6591aH(int i, int i2, Object obj) {
        for (C2893cv cvVar : this.f7959I) {
            if (cvVar.mo6688eV() == i) {
                C2891ct aC = mo6586aC(cvVar);
                aC.mo6678e(i2);
                aC.mo6677d(obj);
                aC.mo6676c();
            }
        }
    }

    /* renamed from: aI */
    public final void mo6592aI() {
        mo6591aH(1, 2, Float.valueOf(this.f8012y * this.f7972V.f8661a));
    }

    /* renamed from: aJ */
    public final void mo6593aJ(List list, boolean z) {
        mo6600aQ();
        m7823aZ(list, -1, -9223372036854775807L, z);
    }

    /* renamed from: aK */
    public final void mo6594aK(SurfaceHolder surfaceHolder) {
        this.f8010w = false;
        this.f8008u = surfaceHolder;
        surfaceHolder.addCallback(this.f7996h);
        Surface surface = this.f8008u.getSurface();
        if (surface == null || !surface.isValid()) {
            mo6589aF(0, 0);
            return;
        }
        Rect surfaceFrame = this.f8008u.getSurfaceFrame();
        mo6589aF(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: aL */
    public final void mo6595aL(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        mo6596aM(surface);
        this.f7979ab = surface;
    }

    /* renamed from: aM */
    public final void mo6596aM(Object obj) {
        boolean z;
        ArrayList<C2891ct> arrayList = new ArrayList<>();
        C2893cv[] cvVarArr = this.f7959I;
        int length = cvVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            C2893cv cvVar = cvVarArr[i];
            if (cvVar.mo6688eV() == 2) {
                C2891ct aC = mo6586aC(cvVar);
                aC.mo6678e(1);
                aC.mo6677d(obj);
                aC.mo6676c();
                arrayList.add(aC);
            }
            i++;
        }
        Object obj2 = this.f8007t;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (C2891ct b : arrayList) {
                    b.mo6675b(this.f7975Y);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f8007t;
            Surface surface = this.f7979ab;
            if (obj3 == surface) {
                surface.release();
                this.f7979ab = null;
            }
        }
        this.f8007t = obj;
        if (z) {
            m7825ba(false, C3267o.m9504b(new C2873cb(3), 1003));
        }
    }

    /* renamed from: aN */
    public final void mo6597aN(boolean z, int i, int i2) {
        int i3;
        boolean z2;
        int i4 = 0;
        if (!z) {
            i3 = i;
            z2 = false;
        } else if (i != -1) {
            i3 = i;
            z2 = true;
        } else {
            z2 = false;
            i3 = -1;
        }
        if (z2 && i3 != 1) {
            i4 = 1;
        }
        C2888cq cqVar = this.f7954C;
        if (cqVar.f8175m != z2 || cqVar.f8176n != i4) {
            this.f8001n++;
            C2888cq c = cqVar.mo6669c(z2, i4);
            this.f7962L.f8070a.mo6164c(1, z2 ? 1 : 0, i4).mo6161a();
            mo6598aO(c, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0290  */
    /* renamed from: aO */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6598aO(androidx.media3.exoplayer.C2888cq r41, int r42, int r43, boolean r44, boolean r45, int r46, long r47, int r49) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r46
            androidx.media3.exoplayer.cq r3 = r0.f7954C
            r0.f7954C = r1
            androidx.media3.common.bm r4 = r3.f8164b
            androidx.media3.common.bm r5 = r1.f8164b
            boolean r4 = r4.equals(r5)
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r4 = r4 ^ r5
            androidx.media3.common.bm r7 = r3.f8164b
            androidx.media3.common.bm r8 = r1.f8164b
            boolean r9 = r8.mo6304o()
            r11 = 3
            r12 = 0
            r14 = -1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r10 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r10)
            if (r9 == 0) goto L_0x003c
            boolean r9 = r7.mo6304o()
            if (r9 == 0) goto L_0x003c
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r14, r15)
            goto L_0x00bf
        L_0x003c:
            boolean r9 = r8.mo6304o()
            boolean r10 = r7.mo6304o()
            if (r9 == r10) goto L_0x0051
            android.util.Pair r4 = new android.util.Pair
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r4.<init>(r6, r7)
            goto L_0x00bf
        L_0x0051:
            androidx.media3.exoplayer.h.as r9 = r3.f8165c
            java.lang.Object r9 = r9.f7204a
            androidx.media3.common.bk r10 = r0.f7964N
            androidx.media3.common.bk r9 = r7.mo6303n(r9, r10)
            int r9 = r9.f7330c
            androidx.media3.common.bl r10 = r0.f7427m
            androidx.media3.common.bl r7 = r7.mo6024e(r9, r10, r12)
            java.lang.Object r7 = r7.f7337b
            androidx.media3.exoplayer.h.as r9 = r1.f8165c
            java.lang.Object r9 = r9.f7204a
            androidx.media3.common.bk r10 = r0.f7964N
            androidx.media3.common.bk r9 = r8.mo6303n(r9, r10)
            int r9 = r9.f7330c
            androidx.media3.common.bl r10 = r0.f7427m
            androidx.media3.common.bl r8 = r8.mo6024e(r9, r10, r12)
            java.lang.Object r8 = r8.f7337b
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x009f
            if (r45 == 0) goto L_0x0085
            if (r2 != 0) goto L_0x0085
            r4 = 1
            goto L_0x008e
        L_0x0085:
            if (r45 == 0) goto L_0x008b
            if (r2 != r5) goto L_0x008b
            r4 = 2
            goto L_0x008e
        L_0x008b:
            if (r4 == 0) goto L_0x0099
            r4 = 3
        L_0x008e:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.<init>(r6, r4)
            r4 = r7
            goto L_0x00bf
        L_0x0099:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009f:
            if (r45 == 0) goto L_0x00ba
            if (r2 != 0) goto L_0x00ba
            androidx.media3.exoplayer.h.as r4 = r3.f8165c
            long r7 = r4.f7207d
            androidx.media3.exoplayer.h.as r4 = r1.f8165c
            long r9 = r4.f7207d
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ba
            android.util.Pair r4 = new android.util.Pair
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r4.<init>(r6, r8)
            goto L_0x00bf
        L_0x00ba:
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r14, r15)
        L_0x00bf:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            androidx.media3.common.at r7 = r0.f8006s
            if (r6 == 0) goto L_0x00fa
            androidx.media3.common.bm r9 = r1.f8164b
            boolean r9 = r9.mo6304o()
            if (r9 != 0) goto L_0x00f4
            androidx.media3.common.bm r9 = r1.f8164b
            androidx.media3.exoplayer.h.as r10 = r1.f8165c
            java.lang.Object r10 = r10.f7204a
            androidx.media3.common.bk r14 = r0.f7964N
            androidx.media3.common.bk r9 = r9.mo6303n(r10, r14)
            int r9 = r9.f7330c
            androidx.media3.common.bm r10 = r1.f8164b
            androidx.media3.common.bl r14 = r0.f7427m
            androidx.media3.common.bl r9 = r10.mo6024e(r9, r14, r12)
            androidx.media3.common.aq r9 = r9.f7338c
            goto L_0x00f5
        L_0x00f4:
            r9 = 0
        L_0x00f5:
            androidx.media3.common.at r10 = androidx.media3.common.C2593at.f7182a
            r0.f7953B = r10
            goto L_0x00fb
        L_0x00fa:
            r9 = 0
        L_0x00fb:
            if (r6 != 0) goto L_0x0107
            java.util.List r10 = r3.f8173k
            java.util.List r14 = r1.f8173k
            boolean r10 = com.google.common.p4522b.C58597ky.m90218i(r10, r14)
            if (r10 != 0) goto L_0x013f
        L_0x0107:
            androidx.media3.common.at r7 = r0.f7953B
            androidx.media3.common.as r10 = new androidx.media3.common.as
            r10.<init>(r7)
            java.util.List r7 = r1.f8173k
            r14 = 0
        L_0x0111:
            r15 = r7
            com.google.common.b.pq r15 = (com.google.common.p4522b.C58724pq) r15
            int r15 = r15.f156474d
            if (r14 >= r15) goto L_0x0134
            java.lang.Object r15 = r7.get(r14)
            androidx.media3.common.Metadata r15 = (androidx.media3.common.Metadata) r15
            r8 = 0
        L_0x011f:
            androidx.media3.common.Metadata$Entry[] r11 = r15.f7056a
            int r12 = r11.length
            if (r8 >= r12) goto L_0x012e
            r11 = r11[r8]
            r11.mo6067b(r10)
            int r8 = r8 + 1
            r12 = 0
            goto L_0x011f
        L_0x012e:
            int r14 = r14 + 1
            r11 = 3
            r12 = 0
            goto L_0x0111
        L_0x0134:
            androidx.media3.common.at r7 = new androidx.media3.common.at
            r7.<init>(r10)
            r0.f7953B = r7
            androidx.media3.common.at r7 = r40.mo6585aB()
        L_0x013f:
            androidx.media3.common.at r8 = r0.f8006s
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.f8006s = r7
            boolean r7 = r3.f8175m
            boolean r10 = r1.f8175m
            if (r7 == r10) goto L_0x0150
            r7 = 1
            goto L_0x0151
        L_0x0150:
            r7 = 0
        L_0x0151:
            int r10 = r3.f8168f
            int r11 = r1.f8168f
            if (r10 == r11) goto L_0x0159
            r10 = 1
            goto L_0x015a
        L_0x0159:
            r10 = 0
        L_0x015a:
            if (r10 != 0) goto L_0x015e
            if (r7 == 0) goto L_0x0161
        L_0x015e:
            r40.mo6599aP()
        L_0x0161:
            boolean r11 = r3.f8170h
            boolean r12 = r1.f8170h
            if (r11 == r12) goto L_0x0169
            r11 = 1
            goto L_0x016a
        L_0x0169:
            r11 = 0
        L_0x016a:
            androidx.media3.common.bm r12 = r3.f8164b
            androidx.media3.common.bm r13 = r1.f8164b
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0181
            androidx.media3.common.b.t r12 = r0.f7992d
            androidx.media3.exoplayer.ax r13 = new androidx.media3.exoplayer.ax
            r14 = r42
            r13.<init>(r1, r14)
            r14 = 0
            r12.mo6204c(r14, r13)
        L_0x0181:
            if (r45 == 0) goto L_0x02b2
            androidx.media3.common.bk r12 = new androidx.media3.common.bk
            r12.<init>()
            androidx.media3.common.bm r13 = r3.f8164b
            boolean r13 = r13.mo6304o()
            if (r13 != 0) goto L_0x01c2
            androidx.media3.exoplayer.h.as r13 = r3.f8165c
            java.lang.Object r13 = r13.f7204a
            androidx.media3.common.bm r14 = r3.f8164b
            r14.mo6303n(r13, r12)
            int r14 = r12.f7330c
            androidx.media3.common.bm r15 = r3.f8164b
            int r15 = r15.mo6020a(r13)
            androidx.media3.common.bm r5 = r3.f8164b
            r42 = r13
            androidx.media3.common.bl r13 = r0.f7427m
            r16 = r10
            r17 = r11
            r10 = 0
            androidx.media3.common.bl r5 = r5.mo6024e(r14, r13, r10)
            java.lang.Object r5 = r5.f7337b
            androidx.media3.common.bl r10 = r0.f7427m
            androidx.media3.common.aq r10 = r10.f7338c
            r22 = r42
            r19 = r5
            r21 = r10
            r20 = r14
            r23 = r15
            goto L_0x01d0
        L_0x01c2:
            r16 = r10
            r17 = r11
            r20 = r49
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = -1
        L_0x01d0:
            if (r2 != 0) goto L_0x01fc
            androidx.media3.exoplayer.h.as r5 = r3.f8165c
            boolean r5 = r5.mo6102a()
            if (r5 == 0) goto L_0x01e9
            androidx.media3.exoplayer.h.as r5 = r3.f8165c
            int r10 = r5.f7205b
            int r5 = r5.f7206c
            long r10 = r12.mo6284e(r10, r5)
            long r12 = m7818aU(r3)
            goto L_0x0211
        L_0x01e9:
            androidx.media3.exoplayer.h.as r5 = r3.f8165c
            int r5 = r5.f7208e
            r10 = -1
            if (r5 == r10) goto L_0x01f7
            androidx.media3.exoplayer.cq r5 = r0.f7954C
            long r10 = m7818aU(r5)
            goto L_0x0210
        L_0x01f7:
            long r10 = r12.f7332e
            long r12 = r12.f7331d
            goto L_0x020f
        L_0x01fc:
            androidx.media3.exoplayer.h.as r5 = r3.f8165c
            boolean r5 = r5.mo6102a()
            if (r5 == 0) goto L_0x020b
            long r10 = r3.f8181s
            long r12 = m7818aU(r3)
            goto L_0x0211
        L_0x020b:
            long r10 = r12.f7332e
            long r12 = r3.f8181s
        L_0x020f:
            long r10 = r10 + r12
        L_0x0210:
            r12 = r10
        L_0x0211:
            androidx.media3.common.bg r5 = new androidx.media3.common.bg
            long r24 = androidx.media3.common.p136b.C2612ak.m6918A(r10)
            androidx.media3.exoplayer.h.as r10 = r3.f8165c
            long r26 = androidx.media3.common.p136b.C2612ak.m6918A(r12)
            int r11 = r10.f7205b
            int r10 = r10.f7206c
            r18 = r5
            r28 = r11
            r29 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r29)
            int r10 = r40.mo5996c()
            androidx.media3.exoplayer.cq r11 = r0.f7954C
            androidx.media3.common.bm r11 = r11.f8164b
            boolean r11 = r11.mo6304o()
            if (r11 != 0) goto L_0x026b
            androidx.media3.exoplayer.cq r11 = r0.f7954C
            androidx.media3.exoplayer.h.as r12 = r11.f8165c
            java.lang.Object r12 = r12.f7204a
            androidx.media3.common.bm r11 = r11.f8164b
            androidx.media3.common.bk r13 = r0.f7964N
            r11.mo6303n(r12, r13)
            androidx.media3.exoplayer.cq r11 = r0.f7954C
            androidx.media3.common.bm r11 = r11.f8164b
            int r11 = r11.mo6020a(r12)
            androidx.media3.exoplayer.cq r13 = r0.f7954C
            androidx.media3.common.bm r13 = r13.f8164b
            androidx.media3.common.bl r14 = r0.f7427m
            r42 = r11
            r15 = r12
            r11 = 0
            androidx.media3.common.bl r11 = r13.mo6024e(r10, r14, r11)
            java.lang.Object r11 = r11.f7337b
            androidx.media3.common.bl r12 = r0.f7427m
            androidx.media3.common.aq r12 = r12.f7338c
            r33 = r42
            r29 = r11
            r31 = r12
            r32 = r15
            goto L_0x0273
        L_0x026b:
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = -1
        L_0x0273:
            long r34 = androidx.media3.common.p136b.C2612ak.m6918A(r47)
            androidx.media3.common.bg r11 = new androidx.media3.common.bg
            androidx.media3.exoplayer.cq r12 = r0.f7954C
            androidx.media3.exoplayer.h.as r12 = r12.f8165c
            boolean r12 = r12.mo6102a()
            if (r12 == 0) goto L_0x0290
            androidx.media3.exoplayer.cq r12 = r0.f7954C
            long r12 = m7818aU(r12)
            long r12 = androidx.media3.common.p136b.C2612ak.m6918A(r12)
            r36 = r12
            goto L_0x0292
        L_0x0290:
            r36 = r34
        L_0x0292:
            androidx.media3.exoplayer.cq r12 = r0.f7954C
            androidx.media3.exoplayer.h.as r12 = r12.f8165c
            int r13 = r12.f7205b
            int r12 = r12.f7206c
            r28 = r11
            r30 = r10
            r38 = r13
            r39 = r12
            r28.<init>(r29, r30, r31, r32, r33, r34, r36, r38, r39)
            androidx.media3.common.b.t r10 = r0.f7992d
            androidx.media3.exoplayer.bd r12 = new androidx.media3.exoplayer.bd
            r12.<init>(r2, r5, r11)
            r2 = 11
            r10.mo6204c(r2, r12)
            goto L_0x02b6
        L_0x02b2:
            r16 = r10
            r17 = r11
        L_0x02b6:
            if (r6 == 0) goto L_0x02c3
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.ae r5 = new androidx.media3.exoplayer.ae
            r5.<init>(r9, r4)
            r4 = 1
            r2.mo6204c(r4, r5)
        L_0x02c3:
            androidx.media3.exoplayer.o r2 = r3.f8169g
            androidx.media3.exoplayer.o r4 = r1.f8169g
            if (r2 == r4) goto L_0x02e3
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.af r4 = new androidx.media3.exoplayer.af
            r4.<init>(r1)
            r5 = 10
            r2.mo6204c(r5, r4)
            androidx.media3.exoplayer.o r2 = r1.f8169g
            if (r2 == 0) goto L_0x02e3
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.ag r4 = new androidx.media3.exoplayer.ag
            r4.<init>(r1)
            r2.mo6204c(r5, r4)
        L_0x02e3:
            androidx.media3.exoplayer.j.al r2 = r3.f8172j
            androidx.media3.exoplayer.j.al r4 = r1.f8172j
            if (r2 == r4) goto L_0x02f6
            java.lang.Object r2 = r4.f9617e
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.ah r4 = new androidx.media3.exoplayer.ah
            r4.<init>(r1)
            r5 = 2
            r2.mo6204c(r5, r4)
        L_0x02f6:
            if (r8 == 0) goto L_0x0306
            androidx.media3.common.at r2 = r0.f8006s
            androidx.media3.common.b.t r4 = r0.f7992d
            androidx.media3.exoplayer.ai r5 = new androidx.media3.exoplayer.ai
            r5.<init>(r2)
            r2 = 14
            r4.mo6204c(r2, r5)
        L_0x0306:
            if (r17 == 0) goto L_0x0313
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.aj r4 = new androidx.media3.exoplayer.aj
            r4.<init>(r1)
            r5 = 3
            r2.mo6204c(r5, r4)
        L_0x0313:
            if (r16 != 0) goto L_0x0317
            if (r7 == 0) goto L_0x0322
        L_0x0317:
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.ak r4 = new androidx.media3.exoplayer.ak
            r4.<init>(r1)
            r5 = -1
            r2.mo6204c(r5, r4)
        L_0x0322:
            if (r16 == 0) goto L_0x032f
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.al r4 = new androidx.media3.exoplayer.al
            r4.<init>(r1)
            r5 = 4
            r2.mo6204c(r5, r4)
        L_0x032f:
            if (r7 == 0) goto L_0x033e
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.ay r4 = new androidx.media3.exoplayer.ay
            r5 = r43
            r4.<init>(r1, r5)
            r5 = 5
            r2.mo6204c(r5, r4)
        L_0x033e:
            int r2 = r3.f8176n
            int r4 = r1.f8176n
            if (r2 == r4) goto L_0x034f
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.az r4 = new androidx.media3.exoplayer.az
            r4.<init>(r1)
            r5 = 6
            r2.mo6204c(r5, r4)
        L_0x034f:
            boolean r2 = m7815aR(r3)
            boolean r4 = m7815aR(r41)
            if (r2 == r4) goto L_0x0364
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.ba r4 = new androidx.media3.exoplayer.ba
            r4.<init>(r1)
            r5 = 7
            r2.mo6204c(r5, r4)
        L_0x0364:
            androidx.media3.common.bb r2 = r3.f8177o
            androidx.media3.common.bb r4 = r1.f8177o
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x037a
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.bb r4 = new androidx.media3.exoplayer.bb
            r4.<init>(r1)
            r5 = 12
            r2.mo6204c(r5, r4)
        L_0x037a:
            if (r44 == 0) goto L_0x0384
            androidx.media3.common.b.t r2 = r0.f7992d
            androidx.media3.exoplayer.bc r4 = androidx.media3.exoplayer.C2833bc.f7929a
            r5 = -1
            r2.mo6204c(r5, r4)
        L_0x0384:
            r40.m7826bb()
            androidx.media3.common.b.t r2 = r0.f7992d
            r2.mo6203b()
            boolean r2 = r3.f8178p
            boolean r3 = r1.f8178p
            if (r2 == r3) goto L_0x03aa
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.f7963M
            java.util.Iterator r2 = r2.iterator()
        L_0x0398:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03aa
            java.lang.Object r3 = r2.next()
            androidx.media3.exoplayer.bo r3 = (androidx.media3.exoplayer.C2845bo) r3
            boolean r4 = r1.f8178p
            r3.mo6571b()
            goto L_0x0398
        L_0x03aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2848br.mo6598aO(androidx.media3.exoplayer.cq, int, int, boolean, boolean, int, long, int):void");
    }

    /* renamed from: aP */
    public final void mo6599aP() {
        int e = mo5998e();
        boolean z = false;
        if (e == 2 || e == 3) {
            mo6600aQ();
            boolean z2 = this.f7954C.f8178p;
            C2961de deVar = this.f7973W;
            if (mo5987O() && !z2) {
                z = true;
            }
            deVar.f8513d = z;
            deVar.mo6861a();
            C2962df dfVar = this.f7974X;
            dfVar.f8517d = mo5987O();
            dfVar.mo6862a();
            return;
        }
        C2961de deVar2 = this.f7973W;
        deVar2.f8513d = false;
        deVar2.mo6861a();
        C2962df dfVar2 = this.f7974X;
        dfVar2.f8517d = false;
        dfVar2.mo6862a();
    }

    /* renamed from: aQ */
    public final void mo6600aQ() {
        IllegalStateException illegalStateException;
        this.f7957G.mo6190b();
        if (Thread.currentThread() != this.f7995g.getThread()) {
            String K = C2612ak.m6928K("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f7995g.getThread().getName());
            if (!this.f7985ah) {
                if (this.f7986ai) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                C2633u.m7050e("ExoPlayerImpl", C2633u.m7046a(K, illegalStateException));
                this.f7986ai = true;
                return;
            }
            throw new IllegalStateException(K);
        }
    }

    /* renamed from: am */
    public final void mo6468am(List list) {
        mo6600aQ();
        mo6593aJ(list, true);
    }

    /* renamed from: ax */
    public final void mo6469ax(C3038au auVar) {
        mo6600aQ();
        mo6593aJ(Collections.singletonList(auVar), false);
    }

    /* renamed from: az */
    public final long mo6601az(C2651bm bmVar, C3036as asVar, long j) {
        bmVar.mo6303n(asVar.f7204a, this.f7964N);
        return j + this.f7964N.f7332e;
    }

    /* renamed from: b */
    public final int mo5995b() {
        mo6600aQ();
        if (mo5989Q()) {
            return this.f7954C.f8165c.f7206c;
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo5996c() {
        mo6600aQ();
        int aS = m7816aS();
        if (aS == -1) {
            return 0;
        }
        return aS;
    }

    /* renamed from: d */
    public final int mo5997d() {
        mo6600aQ();
        if (this.f7954C.f8164b.mo6304o()) {
            return 0;
        }
        C2888cq cqVar = this.f7954C;
        return cqVar.f8164b.mo6020a(cqVar.f8165c.f7204a);
    }

    /* renamed from: e */
    public final int mo5998e() {
        mo6600aQ();
        return this.f7954C.f8168f;
    }

    /* renamed from: f */
    public final int mo5999f() {
        mo6600aQ();
        return this.f7954C.f8176n;
    }

    /* renamed from: g */
    public final int mo6000g() {
        mo6600aQ();
        return this.f7999k;
    }

    /* renamed from: h */
    public final long mo6001h() {
        mo6600aQ();
        if (!mo5989Q()) {
            return mo6002i();
        }
        C2888cq cqVar = this.f7954C;
        if (cqVar.f8174l.equals(cqVar.f8165c)) {
            return C2612ak.m6918A(this.f7954C.f8179q);
        }
        return mo6005l();
    }

    /* renamed from: i */
    public final long mo6002i() {
        mo6600aQ();
        if (this.f7954C.f8164b.mo6304o()) {
            return this.f7956E;
        }
        C2888cq cqVar = this.f7954C;
        if (cqVar.f8174l.f7207d != cqVar.f8165c.f7207d) {
            return C2612ak.m6918A(cqVar.f8164b.mo6024e(mo5996c(), this.f7427m, 0).f7349n);
        }
        long j = cqVar.f8179q;
        if (this.f7954C.f8174l.mo6102a()) {
            C2888cq cqVar2 = this.f7954C;
            C2649bk n = cqVar2.f8164b.mo6303n(cqVar2.f8174l.f7204a, this.f7964N);
            long f = n.mo6286f(this.f7954C.f8174l.f7205b);
            j = f == Long.MIN_VALUE ? n.f7331d : f;
        }
        C2888cq cqVar3 = this.f7954C;
        return C2612ak.m6918A(mo6601az(cqVar3.f8164b, cqVar3.f8174l, j));
    }

    /* renamed from: j */
    public final long mo6003j() {
        mo6600aQ();
        if (!mo5989Q()) {
            return mo6004k();
        }
        C2888cq cqVar = this.f7954C;
        cqVar.f8164b.mo6303n(cqVar.f8165c.f7204a, this.f7964N);
        C2888cq cqVar2 = this.f7954C;
        if (cqVar2.f8166d == -9223372036854775807L) {
            return C2612ak.m6918A(cqVar2.f8164b.mo6024e(mo5996c(), this.f7427m, 0).f7348m);
        }
        return C2612ak.m6918A(this.f7964N.f7332e) + C2612ak.m6918A(this.f7954C.f8166d);
    }

    /* renamed from: k */
    public final long mo6004k() {
        mo6600aQ();
        return C2612ak.m6918A(m7817aT(this.f7954C));
    }

    /* renamed from: l */
    public final long mo6005l() {
        mo6600aQ();
        if (!mo5989Q()) {
            return mo6337bg();
        }
        C2888cq cqVar = this.f7954C;
        C3036as asVar = cqVar.f8165c;
        cqVar.f8164b.mo6303n(asVar.f7204a, this.f7964N);
        return C2612ak.m6918A(this.f7964N.mo6284e(asVar.f7205b, asVar.f7206c));
    }

    /* renamed from: m */
    public final long mo6006m() {
        mo6600aQ();
        return 3000;
    }

    /* renamed from: n */
    public final long mo6007n() {
        mo6600aQ();
        return this.f7968R;
    }

    /* renamed from: o */
    public final long mo6008o() {
        mo6600aQ();
        return this.f7969S;
    }

    /* renamed from: p */
    public final Looper mo6009p() {
        return this.f7995g;
    }

    /* renamed from: q */
    public final void mo6470q(boolean z) {
        mo6600aQ();
        if (this.f8013z != z) {
            this.f8013z = z;
            mo6591aH(1, 9, Boolean.valueOf(z));
            C2632t tVar = this.f7992d;
            tVar.mo6204c(23, new C2778aw(z));
            tVar.mo6203b();
        }
    }

    /* renamed from: s */
    public final C2640bb mo6012s() {
        mo6600aQ();
        return this.f7954C.f8177o;
    }

    /* renamed from: t */
    public final C2642bd mo6013t() {
        mo6600aQ();
        return this.f8005r;
    }

    /* renamed from: u */
    public final C2651bm mo6014u() {
        mo6600aQ();
        return this.f7954C.f8164b;
    }

    /* renamed from: v */
    public final C2657bs mo6015v() {
        mo6600aQ();
        return this.f7954C.f8172j.f9616d;
    }

    /* renamed from: x */
    public final void mo6017x() {
        mo6600aQ();
        boolean O = mo5987O();
        int i = 2;
        int a = this.f7972V.mo6922a(O, 2);
        mo6597aN(O, a, m7824ay(O, a));
        C2888cq cqVar = this.f7954C;
        if (cqVar.f8168f == 1) {
            C2888cq d = cqVar.mo6670d((C3267o) null);
            if (true == d.f8164b.mo6304o()) {
                i = 4;
            }
            C2888cq f = d.mo6672f(i);
            this.f8001n++;
            this.f7962L.f8070a.mo6162a(0).mo6161a();
            mo6598aO(f, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: y */
    public final void mo6018y() {
        C3225u uVar;
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = C2612ak.f7253e;
        String a = C2591ar.m6796a();
        C2633u.m7049d("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "] [" + a + "]");
        mo6600aQ();
        this.f7971U.mo6606a(false);
        C2960dd ddVar = this.f7998j;
        C2959dc dcVar = ddVar.f8505d;
        if (dcVar != null) {
            try {
                ddVar.f8502a.unregisterReceiver(dcVar);
            } catch (RuntimeException e) {
                C2633u.m7050e("StreamVolumeManager", C2633u.m7046a("Error unregistering stream volume receiver", e));
            }
            ddVar.f8505d = null;
        }
        C2961de deVar = this.f7973W;
        deVar.f8513d = false;
        deVar.mo6861a();
        C2962df dfVar = this.f7974X;
        dfVar.f8517d = false;
        dfVar.mo6862a();
        C2997f fVar = this.f7972V;
        fVar.f8662b = null;
        fVar.mo6923b();
        if (!this.f7962L.mo6619e()) {
            C2632t tVar = this.f7992d;
            tVar.mo6204c(10, C2774as.f7678a);
            tVar.mo6203b();
        }
        this.f7992d.mo6205d();
        this.f7961K.mo6168g();
        C3240f fVar2 = this.f7967Q;
        ((C3244j) fVar2).f9752g.mo7232a(this.f7994f);
        C2888cq f = this.f7954C.mo6672f(1);
        this.f7954C = f;
        C2888cq a2 = f.mo6667a(f.f8165c);
        this.f7954C = a2;
        a2.f8179q = a2.f8181s;
        this.f7954C.f8180r = 0;
        this.f7994f.mo6376K();
        C3204ak akVar = this.f7960J;
        synchronized (((C3195ab) akVar).f9598c) {
            if (!(C2612ak.f7249a < 32 || (uVar = ((C3195ab) akVar).f9601f) == null || (onSpatializerStateChangedListener = uVar.f9694d) == null || uVar.f9693c == null)) {
                uVar.f9691a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
                uVar.f9693c.removeCallbacksAndMessages((Object) null);
                uVar.f9693c = null;
                uVar.f9694d = null;
            }
        }
        akVar.f9611h = null;
        akVar.f9612i = null;
        mo6590aG();
        Surface surface = this.f7979ab;
        if (surface != null) {
            surface.release();
            this.f7979ab = null;
        }
        int i = C2568d.f7101b;
        this.f7987aj = true;
    }

    /* renamed from: M */
    public final void mo6462M(C2733d dVar) {
        C2684a aVar = this.f7994f;
        dVar.getClass();
        aVar.mo6372G(dVar);
    }

    /* renamed from: R */
    public final void mo6464R(C2733d dVar) {
        C2684a aVar = this.f7994f;
        dVar.getClass();
        aVar.mo6377L(dVar);
    }

    /* renamed from: w */
    public final void mo6016w(C2644bf bfVar) {
        C2632t tVar = this.f7992d;
        bfVar.getClass();
        tVar.mo6202a(bfVar);
    }

    /* renamed from: z */
    public final void mo6019z(C2644bf bfVar) {
        bfVar.getClass();
        this.f7992d.mo6206e(bfVar);
    }
}
