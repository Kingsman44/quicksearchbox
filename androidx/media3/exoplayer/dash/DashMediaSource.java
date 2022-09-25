package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.C2583aj;
import androidx.media3.common.C2584ak;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2591ar;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.dash.p141a.C2910a;
import androidx.media3.exoplayer.dash.p141a.C2912c;
import androidx.media3.exoplayer.dash.p141a.C2914e;
import androidx.media3.exoplayer.dash.p141a.C2917h;
import androidx.media3.exoplayer.dash.p141a.C2932w;
import androidx.media3.exoplayer.p139c.C2859b;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p144g.C3003b;
import androidx.media3.exoplayer.p145h.C3005a;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3035ar;
import androidx.media3.exoplayer.p145h.C3036as;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p145h.C3129x;
import androidx.media3.exoplayer.p145h.p147b.C3054j;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3249o;
import androidx.media3.exoplayer.p151k.C3253s;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.exoplayer.p151k.C3257w;
import androidx.media3.exoplayer.p151k.C3258x;
import androidx.media3.exoplayer.p151k.C3259y;
import androidx.media3.exoplayer.p152l.C3262a;
import androidx.media3.exoplayer.p152l.C3263b;
import androidx.media3.exoplayer.p152l.C3264c;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2504h;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2510n;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
public final class DashMediaSource extends C3005a {

    /* renamed from: A */
    private final C3257w f8267A;

    /* renamed from: B */
    private C2505i f8268B;

    /* renamed from: C */
    private C2495an f8269C;

    /* renamed from: D */
    private C2583aj f8270D;

    /* renamed from: E */
    private Uri f8271E;

    /* renamed from: F */
    private long f8272F;

    /* renamed from: G */
    private final C2950s f8273G;

    /* renamed from: H */
    private final C3245k f8274H;

    /* renamed from: I */
    private final C2941j f8275I;

    /* renamed from: a */
    public final C3065bc f8276a;

    /* renamed from: b */
    public final Object f8277b;

    /* renamed from: c */
    public final Runnable f8278c;

    /* renamed from: d */
    public C3256v f8279d;

    /* renamed from: e */
    public IOException f8280e;

    /* renamed from: f */
    public Handler f8281f;

    /* renamed from: g */
    public Uri f8282g;

    /* renamed from: h */
    public C2912c f8283h = null;

    /* renamed from: i */
    public boolean f8284i;

    /* renamed from: j */
    public long f8285j;

    /* renamed from: k */
    public long f8286k;

    /* renamed from: l */
    public int f8287l;

    /* renamed from: m */
    public long f8288m;

    /* renamed from: n */
    public int f8289n;

    /* renamed from: r */
    private final C2590aq f8290r;

    /* renamed from: s */
    private final C2504h f8291s;

    /* renamed from: t */
    private final C2868k f8292t;

    /* renamed from: u */
    private final C2933b f8293u;

    /* renamed from: v */
    private final long f8294v;

    /* renamed from: w */
    private final C3258x f8295w;

    /* renamed from: x */
    private final C2943l f8296x;

    /* renamed from: y */
    private final SparseArray f8297y;

    /* renamed from: z */
    private final Runnable f8298z;

    static {
        C2591ar.m6797b("media3.exoplayer.dash");
    }

    public DashMediaSource(C2590aq aqVar, C2504h hVar, C3258x xVar, C2950s sVar, C2868k kVar, C3245k kVar2, long j) {
        this.f8290r = aqVar;
        this.f8270D = aqVar.f7156e;
        C2584ak akVar = aqVar.f7154c;
        akVar.getClass();
        Uri uri = akVar.f7131a;
        this.f8282g = uri;
        this.f8271E = uri;
        this.f8291s = hVar;
        this.f8295w = xVar;
        this.f8273G = sVar;
        this.f8292t = kVar;
        this.f8274H = kVar2;
        this.f8294v = j;
        this.f8293u = new C2933b();
        this.f8276a = mo6944q((C3036as) null);
        this.f8277b = new Object();
        this.f8297y = new SparseArray();
        this.f8275I = new C2941j(this);
        this.f8288m = -9223372036854775807L;
        this.f8272F = -9223372036854775807L;
        this.f8296x = new C2943l(this);
        this.f8267A = new C2944m(this);
        this.f8298z = new C2937f(this);
        this.f8278c = new C2938g(this);
    }

    /* renamed from: E */
    private final void m8187E(C3259y yVar, C3249o oVar, int i) {
        this.f8279d.mo7254g(yVar, oVar, i);
        this.f8276a.mo7011j(new C3027aj(yVar.f9792b), yVar.f9793c);
    }

    /* renamed from: F */
    private static boolean m8188F(C2917h hVar) {
        for (int i = 0; i < hVar.f8352c.size(); i++) {
            int i2 = ((C2910a) hVar.f8352c.get(i)).f8307b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        return this.f8290r;
    }

    /* renamed from: b */
    public final void mo6746b() {
        C3256v vVar = this.f8279d;
        C2939h hVar = new C2939h(this);
        if (C3264c.m9497b()) {
            hVar.mo6824a();
            return;
        }
        if (vVar == null) {
            vVar = new C3256v("SntpClient");
        }
        vVar.mo7254g(new C3263b(), new C3262a(hVar), 1);
    }

    /* renamed from: c */
    public final void mo6747c() {
        this.f8267A.mo6828a();
    }

    /* renamed from: d */
    public final void mo6748d(IOException iOException) {
        C2633u.m7048c("DashMediaSource", C2633u.m7046a("Failed to resolve time offset.", iOException));
        mo6751g(true);
    }

    /* renamed from: e */
    public final void mo6749e(long j) {
        this.f8272F = j;
        mo6751g(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo6750f(C2495an anVar) {
        this.f8269C = anVar;
        Looper.myLooper();
        C2601a.m6829a(this.f8712q);
        this.f8268B = this.f8291s.mo5878a();
        this.f8279d = new C3256v("DashMediaSource");
        this.f8281f = C2612ak.m6922E((Handler.Callback) null);
        mo6756l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ba, code lost:
        if (r15.f8307b != 3) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0325, code lost:
        if (r12.f8307b != 3) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0345, code lost:
        r4 = r43;
        r21 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0475, code lost:
        if (r14 != -9223372036854775807L) goto L_0x0481;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04ea, code lost:
        if (r6.f8388a == -9223372036854775807L) goto L_0x04ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0611  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6751g(boolean r44) {
        /*
            r43 = this;
            r1 = r43
            r2 = 0
            r3 = 0
        L_0x0004:
            android.util.SparseArray r0 = r1.f8297y
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x0261
            android.util.SparseArray r0 = r1.f8297y
            int r0 = r0.keyAt(r3)
            int r9 = r1.f8289n
            if (r0 < r9) goto L_0x0258
            android.util.SparseArray r9 = r1.f8297y
            java.lang.Object r9 = r9.valueAt(r3)
            androidx.media3.exoplayer.dash.e r9 = (androidx.media3.exoplayer.dash.C2936e) r9
            androidx.media3.exoplayer.dash.a.c r10 = r1.f8283h
            int r11 = r1.f8289n
            int r11 = r0 - r11
            r9.f8418f = r10
            r9.f8419g = r11
            androidx.media3.exoplayer.dash.z r0 = r9.f8414b
            r0.f8496f = r2
            r0.f8494d = r10
            java.util.TreeMap r12 = r0.f8493c
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0038:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x005f
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getKey()
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            androidx.media3.exoplayer.dash.a.c r15 = r0.f8494d
            r16 = r3
            long r2 = r15.f8323h
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 >= 0) goto L_0x005b
            r12.remove()
        L_0x005b:
            r3 = r16
            r2 = 0
            goto L_0x0038
        L_0x005f:
            r16 = r3
            androidx.media3.exoplayer.h.b.j[] r2 = r9.f8416d
            if (r2 == 0) goto L_0x020f
            int r3 = r2.length
            r12 = 0
        L_0x0067:
            if (r12 >= r3) goto L_0x0201
            r0 = r2[r12]
            androidx.media3.exoplayer.h.b.k r13 = r0.f8865e
            r0 = r13
            androidx.media3.exoplayer.dash.v r0 = (androidx.media3.exoplayer.dash.C2953v) r0     // Catch:{ b -> 0x01dc }
            r0.f8471i = r10     // Catch:{ b -> 0x01dc }
            r0 = r13
            androidx.media3.exoplayer.dash.v r0 = (androidx.media3.exoplayer.dash.C2953v) r0     // Catch:{ b -> 0x01dc }
            r0.f8472j = r11     // Catch:{ b -> 0x01dc }
            r0 = r13
            androidx.media3.exoplayer.dash.v r0 = (androidx.media3.exoplayer.dash.C2953v) r0     // Catch:{ b -> 0x01dc }
            androidx.media3.exoplayer.dash.a.c r0 = r0.f8471i     // Catch:{ b -> 0x01dc }
            long r14 = r0.mo6765b(r11)     // Catch:{ b -> 0x01dc }
            long r14 = androidx.media3.common.p136b.C2612ak.m6998w(r14)     // Catch:{ b -> 0x01dc }
            r0 = r13
            androidx.media3.exoplayer.dash.v r0 = (androidx.media3.exoplayer.dash.C2953v) r0     // Catch:{ b -> 0x01dc }
            java.util.ArrayList r0 = r0.mo6842c()     // Catch:{ b -> 0x01dc }
            r8 = 0
        L_0x008c:
            r4 = r13
            androidx.media3.exoplayer.dash.v r4 = (androidx.media3.exoplayer.dash.C2953v) r4     // Catch:{ b -> 0x01dc }
            androidx.media3.exoplayer.dash.t[] r4 = r4.f8469g     // Catch:{ b -> 0x01dc }
            int r4 = r4.length     // Catch:{ b -> 0x01dc }
            if (r8 >= r4) goto L_0x01cf
            r4 = r13
            androidx.media3.exoplayer.dash.v r4 = (androidx.media3.exoplayer.dash.C2953v) r4     // Catch:{ b -> 0x01dc }
            androidx.media3.exoplayer.j.ad r4 = r4.f8470h     // Catch:{ b -> 0x01dc }
            int r4 = r4.mo7027f(r8)     // Catch:{ b -> 0x01dc }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ b -> 0x01dc }
            r20 = r4
            androidx.media3.exoplayer.dash.a.m r20 = (androidx.media3.exoplayer.dash.p141a.C2922m) r20     // Catch:{ b -> 0x01dc }
            r4 = r13
            androidx.media3.exoplayer.dash.v r4 = (androidx.media3.exoplayer.dash.C2953v) r4     // Catch:{ b -> 0x01dc }
            androidx.media3.exoplayer.dash.t[] r4 = r4.f8469g     // Catch:{ b -> 0x01dc }
            r5 = r4[r8]     // Catch:{ b -> 0x01dc }
            androidx.media3.exoplayer.dash.a.m r6 = r5.f8456a     // Catch:{ b -> 0x01dc }
            androidx.media3.exoplayer.dash.p r6 = r6.mo6789k()     // Catch:{ b -> 0x01dc }
            androidx.media3.exoplayer.dash.p r7 = r20.mo6789k()     // Catch:{ b -> 0x01dc }
            if (r6 != 0) goto L_0x00e3
            androidx.media3.exoplayer.dash.t r6 = new androidx.media3.exoplayer.dash.t     // Catch:{ b -> 0x01dc }
            androidx.media3.exoplayer.dash.a.b r7 = r5.f8457b     // Catch:{ b -> 0x01dc }
            r26 = r0
            androidx.media3.exoplayer.h.b.e r0 = r5.f8461f     // Catch:{ b -> 0x01dc }
            r27 = r2
            r28 = r3
            long r2 = r5.f8460e     // Catch:{ b -> 0x01cd }
            r25 = 0
            r17 = r6
            r18 = r14
            r21 = r7
            r22 = r0
            r23 = r2
            r17.<init>(r18, r20, r21, r22, r23, r25)     // Catch:{ b -> 0x01cd }
            r34 = r8
            r33 = r9
            r30 = r10
            r29 = r11
        L_0x00dd:
            r31 = r12
            r32 = r13
            goto L_0x01a1
        L_0x00e3:
            r26 = r0
            r27 = r2
            r28 = r3
            boolean r0 = r6.mo6788j()     // Catch:{ b -> 0x01cd }
            if (r0 != 0) goto L_0x0119
            androidx.media3.exoplayer.dash.t r6 = new androidx.media3.exoplayer.dash.t     // Catch:{ b -> 0x0110 }
            androidx.media3.exoplayer.dash.a.b r0 = r5.f8457b     // Catch:{ b -> 0x0110 }
            androidx.media3.exoplayer.h.b.e r2 = r5.f8461f     // Catch:{ b -> 0x0110 }
            r3 = r10
            r29 = r11
            long r10 = r5.f8460e     // Catch:{ b -> 0x01c7 }
            r17 = r6
            r18 = r14
            r21 = r0
            r22 = r2
            r23 = r10
            r25 = r7
            r17.<init>(r18, r20, r21, r22, r23, r25)     // Catch:{ b -> 0x01c7 }
        L_0x0109:
            r30 = r3
            r34 = r8
            r33 = r9
            goto L_0x00dd
        L_0x0110:
            r0 = move-exception
            r29 = r11
            r33 = r9
            r30 = r10
            goto L_0x01e7
        L_0x0119:
            r3 = r10
            r29 = r11
            long r10 = r6.mo6784f(r14)     // Catch:{ b -> 0x01c7 }
            r17 = 0
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x013e
            androidx.media3.exoplayer.dash.t r6 = new androidx.media3.exoplayer.dash.t     // Catch:{ b -> 0x01c7 }
            androidx.media3.exoplayer.dash.a.b r0 = r5.f8457b     // Catch:{ b -> 0x01c7 }
            androidx.media3.exoplayer.h.b.e r2 = r5.f8461f     // Catch:{ b -> 0x01c7 }
            long r10 = r5.f8460e     // Catch:{ b -> 0x01c7 }
            r17 = r6
            r18 = r14
            r21 = r0
            r22 = r2
            r23 = r10
            r25 = r7
            r17.<init>(r18, r20, r21, r22, r23, r25)     // Catch:{ b -> 0x01c7 }
            goto L_0x0109
        L_0x013e:
            long r0 = r6.mo6782d()     // Catch:{ b -> 0x01c7 }
            r30 = r3
            long r2 = r6.mo6786h(r0)     // Catch:{ b -> 0x01c5 }
            long r10 = r10 + r0
            r17 = -1
            long r10 = r10 + r17
            long r17 = r6.mo6786h(r10)     // Catch:{ b -> 0x01c5 }
            long r21 = r6.mo6780b(r10, r14)     // Catch:{ b -> 0x01c5 }
            long r17 = r17 + r21
            r31 = r12
            r32 = r13
            long r12 = r7.mo6782d()     // Catch:{ b -> 0x01c1 }
            r34 = r8
            r33 = r9
            long r8 = r7.mo6786h(r12)     // Catch:{ b -> 0x01b9 }
            r21 = r0
            long r0 = r5.f8460e     // Catch:{ b -> 0x01b9 }
            int r19 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r19 != 0) goto L_0x0177
            r2 = 1
            long r10 = r10 + r2
            long r10 = r10 - r12
            long r0 = r0 + r10
        L_0x0174:
            r23 = r0
            goto L_0x018e
        L_0x0177:
            int r10 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x01bb
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x0187
            long r2 = r7.mo6785g(r2, r14)     // Catch:{ b -> 0x01b9 }
            long r2 = r2 - r21
            long r0 = r0 - r2
            goto L_0x0174
        L_0x0187:
            long r2 = r6.mo6785g(r8, r14)     // Catch:{ b -> 0x01b9 }
            long r2 = r2 - r12
            long r0 = r0 + r2
            goto L_0x0174
        L_0x018e:
            androidx.media3.exoplayer.dash.t r6 = new androidx.media3.exoplayer.dash.t     // Catch:{ b -> 0x01b9 }
            androidx.media3.exoplayer.dash.a.b r0 = r5.f8457b     // Catch:{ b -> 0x01b9 }
            androidx.media3.exoplayer.h.b.e r1 = r5.f8461f     // Catch:{ b -> 0x01b9 }
            r17 = r6
            r18 = r14
            r21 = r0
            r22 = r1
            r25 = r7
            r17.<init>(r18, r20, r21, r22, r23, r25)     // Catch:{ b -> 0x01b9 }
        L_0x01a1:
            r4[r34] = r6     // Catch:{ b -> 0x01b9 }
            int r8 = r34 + 1
            r1 = r43
            r0 = r26
            r2 = r27
            r3 = r28
            r11 = r29
            r10 = r30
            r12 = r31
            r13 = r32
            r9 = r33
            goto L_0x008c
        L_0x01b9:
            r0 = move-exception
            goto L_0x01eb
        L_0x01bb:
            androidx.media3.exoplayer.h.b r0 = new androidx.media3.exoplayer.h.b     // Catch:{ b -> 0x01b9 }
            r0.<init>()     // Catch:{ b -> 0x01b9 }
            throw r0     // Catch:{ b -> 0x01b9 }
        L_0x01c1:
            r0 = move-exception
            r33 = r9
            goto L_0x01eb
        L_0x01c5:
            r0 = move-exception
            goto L_0x01ca
        L_0x01c7:
            r0 = move-exception
            r30 = r3
        L_0x01ca:
            r33 = r9
            goto L_0x01e7
        L_0x01cd:
            r0 = move-exception
            goto L_0x01e1
        L_0x01cf:
            r27 = r2
            r28 = r3
            r33 = r9
            r30 = r10
            r29 = r11
            r31 = r12
            goto L_0x01f1
        L_0x01dc:
            r0 = move-exception
            r27 = r2
            r28 = r3
        L_0x01e1:
            r33 = r9
            r30 = r10
            r29 = r11
        L_0x01e7:
            r31 = r12
            r32 = r13
        L_0x01eb:
            r13 = r32
            androidx.media3.exoplayer.dash.v r13 = (androidx.media3.exoplayer.dash.C2953v) r13
            r13.f8473k = r0
        L_0x01f1:
            int r12 = r31 + 1
            r1 = r43
            r2 = r27
            r3 = r28
            r11 = r29
            r10 = r30
            r9 = r33
            goto L_0x0067
        L_0x0201:
            r30 = r10
            r29 = r11
            androidx.media3.exoplayer.h.ap r0 = r9.f8415c
            r0.mo6617b(r9)
            r2 = r29
            r1 = r30
            goto L_0x0211
        L_0x020f:
            r1 = r10
            r2 = r11
        L_0x0211:
            androidx.media3.exoplayer.dash.a.h r0 = r1.mo6766c(r2)
            java.util.List r0 = r0.f8353d
            r9.f8420h = r0
            androidx.media3.exoplayer.dash.w[] r0 = r9.f8417e
            int r3 = r0.length
            r4 = 0
        L_0x021d:
            if (r4 >= r3) goto L_0x025a
            r5 = r0[r4]
            java.util.List r6 = r9.f8420h
            java.util.Iterator r6 = r6.iterator()
        L_0x0227:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0255
            java.lang.Object r7 = r6.next()
            androidx.media3.exoplayer.dash.a.g r7 = (androidx.media3.exoplayer.dash.p141a.C2916g) r7
            java.lang.String r8 = r7.mo6772a()
            androidx.media3.exoplayer.dash.a.g r10 = r5.f8476a
            java.lang.String r10 = r10.mo6772a()
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0227
            int r6 = r1.mo6764a()
            int r6 = r6 + -1
            boolean r8 = r1.f8319d
            if (r8 == 0) goto L_0x0251
            if (r2 != r6) goto L_0x0251
            r6 = 1
            goto L_0x0252
        L_0x0251:
            r6 = 0
        L_0x0252:
            r5.mo6846e(r7, r6)
        L_0x0255:
            int r4 = r4 + 1
            goto L_0x021d
        L_0x0258:
            r16 = r3
        L_0x025a:
            int r3 = r16 + 1
            r2 = 0
            r1 = r43
            goto L_0x0004
        L_0x0261:
            androidx.media3.exoplayer.dash.a.c r0 = r1.f8283h
            r2 = 0
            androidx.media3.exoplayer.dash.a.h r0 = r0.mo6766c(r2)
            androidx.media3.exoplayer.dash.a.c r2 = r1.f8283h
            int r2 = r2.mo6764a()
            int r2 = r2 + -1
            androidx.media3.exoplayer.dash.a.c r3 = r1.f8283h
            androidx.media3.exoplayer.dash.a.h r3 = r3.mo6766c(r2)
            androidx.media3.exoplayer.dash.a.c r4 = r1.f8283h
            long r4 = r4.mo6765b(r2)
            long r4 = androidx.media3.common.p136b.C2612ak.m6998w(r4)
            long r6 = r1.f8272F
            long r6 = androidx.media3.common.p136b.C2612ak.m6996u(r6)
            long r6 = androidx.media3.common.p136b.C2612ak.m6998w(r6)
            androidx.media3.exoplayer.dash.a.c r2 = r1.f8283h
            r8 = 0
            long r9 = r2.mo6765b(r8)
            long r8 = androidx.media3.common.p136b.C2612ak.m6998w(r9)
            long r10 = r0.f8351b
            long r10 = androidx.media3.common.p136b.C2612ak.m6998w(r10)
            boolean r2 = m8188F(r0)
            r13 = r10
            r12 = 0
        L_0x02a1:
            java.util.List r15 = r0.f8352c
            int r15 = r15.size()
            if (r12 >= r15) goto L_0x02fb
            java.util.List r15 = r0.f8352c
            java.lang.Object r15 = r15.get(r12)
            androidx.media3.exoplayer.dash.a.a r15 = (androidx.media3.exoplayer.dash.p141a.C2910a) r15
            java.util.List r1 = r15.f8308c
            if (r2 == 0) goto L_0x02bd
            int r15 = r15.f8307b
            r17 = r2
            r2 = 3
            if (r15 == r2) goto L_0x02c5
            goto L_0x02bf
        L_0x02bd:
            r17 = r2
        L_0x02bf:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x02c8
        L_0x02c5:
            r18 = r4
            goto L_0x02f2
        L_0x02c8:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            androidx.media3.exoplayer.dash.a.m r1 = (androidx.media3.exoplayer.dash.p141a.C2922m) r1
            androidx.media3.exoplayer.dash.p r1 = r1.mo6789k()
            if (r1 != 0) goto L_0x02d6
            goto L_0x02e0
        L_0x02d6:
            long r18 = r1.mo6779a(r8, r6)
            r20 = 0
            int r2 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x02e3
        L_0x02e0:
            r18 = r4
            goto L_0x02fe
        L_0x02e3:
            r18 = r4
            long r4 = r1.mo6781c(r8, r6)
            long r1 = r1.mo6786h(r4)
            long r1 = r1 + r10
            long r13 = java.lang.Math.max(r13, r1)
        L_0x02f2:
            int r12 = r12 + 1
            r1 = r43
            r2 = r17
            r4 = r18
            goto L_0x02a1
        L_0x02fb:
            r18 = r4
            r10 = r13
        L_0x02fe:
            long r1 = r3.f8351b
            long r1 = androidx.media3.common.p136b.C2612ak.m6998w(r1)
            boolean r4 = m8188F(r3)
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
        L_0x030e:
            java.util.List r12 = r3.f8352c
            int r12 = r12.size()
            if (r5 >= r12) goto L_0x037b
            java.util.List r12 = r3.f8352c
            java.lang.Object r12 = r12.get(r5)
            androidx.media3.exoplayer.dash.a.a r12 = (androidx.media3.exoplayer.dash.p141a.C2910a) r12
            java.util.List r13 = r12.f8308c
            if (r4 == 0) goto L_0x0328
            int r12 = r12.f8307b
            r14 = 3
            if (r12 == r14) goto L_0x032f
            goto L_0x0329
        L_0x0328:
            r14 = 3
        L_0x0329:
            boolean r12 = r13.isEmpty()
            if (r12 == 0) goto L_0x0336
        L_0x032f:
            r21 = r6
            r14 = r18
            r17 = -1
            goto L_0x0374
        L_0x0336:
            r12 = 0
            java.lang.Object r13 = r13.get(r12)
            androidx.media3.exoplayer.dash.a.m r13 = (androidx.media3.exoplayer.dash.p141a.C2922m) r13
            androidx.media3.exoplayer.dash.p r12 = r13.mo6789k()
            if (r12 != 0) goto L_0x034a
            long r1 = r1 + r18
        L_0x0345:
            r4 = r43
            r21 = r6
            goto L_0x0380
        L_0x034a:
            r14 = r18
            long r17 = r12.mo6779a(r14, r6)
            r19 = 0
            int r13 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r13 != 0) goto L_0x0357
            goto L_0x0345
        L_0x0357:
            long r19 = r12.mo6781c(r14, r6)
            long r19 = r19 + r17
            r21 = r6
            r17 = -1
            long r6 = r19 + r17
            long r19 = r12.mo6786h(r6)
            long r19 = r1 + r19
            long r6 = r12.mo6780b(r6, r14)
            long r6 = r19 + r6
            long r6 = java.lang.Math.min(r8, r6)
            r8 = r6
        L_0x0374:
            int r5 = r5 + 1
            r18 = r14
            r6 = r21
            goto L_0x030e
        L_0x037b:
            r21 = r6
            r4 = r43
            r1 = r8
        L_0x0380:
            androidx.media3.exoplayer.dash.a.c r5 = r4.f8283h
            boolean r5 = r5.f8319d
            if (r5 == 0) goto L_0x03b2
            r5 = 0
        L_0x0387:
            java.util.List r6 = r3.f8352c
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x03b0
            java.util.List r6 = r3.f8352c
            java.lang.Object r6 = r6.get(r5)
            androidx.media3.exoplayer.dash.a.a r6 = (androidx.media3.exoplayer.dash.p141a.C2910a) r6
            java.util.List r6 = r6.f8308c
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            androidx.media3.exoplayer.dash.a.m r6 = (androidx.media3.exoplayer.dash.p141a.C2922m) r6
            androidx.media3.exoplayer.dash.p r6 = r6.mo6789k()
            if (r6 == 0) goto L_0x03b2
            boolean r6 = r6.mo6788j()
            if (r6 == 0) goto L_0x03ad
            goto L_0x03b2
        L_0x03ad:
            int r5 = r5 + 1
            goto L_0x0387
        L_0x03b0:
            r3 = 1
            goto L_0x03b3
        L_0x03b2:
            r3 = 0
        L_0x03b3:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x03cc
            androidx.media3.exoplayer.dash.a.c r7 = r4.f8283h
            long r7 = r7.f8321f
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x03cc
            long r7 = androidx.media3.common.p136b.C2612ak.m6998w(r7)
            long r7 = r1 - r7
            long r10 = java.lang.Math.max(r10, r7)
        L_0x03cc:
            long r36 = r1 - r10
            androidx.media3.exoplayer.dash.a.c r1 = r4.f8283h
            boolean r2 = r1.f8319d
            if (r2 == 0) goto L_0x0535
            long r1 = r1.f8316a
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x03dc
            r8 = 1
            goto L_0x03dd
        L_0x03dc:
            r8 = 0
        L_0x03dd:
            androidx.media3.common.p136b.C2601a.m6832d(r8)
            androidx.media3.exoplayer.dash.a.c r1 = r4.f8283h
            long r7 = r1.f8316a
            long r7 = androidx.media3.common.p136b.C2612ak.m6998w(r7)
            long r7 = r21 - r7
            long r7 = r7 - r10
            long r12 = androidx.media3.common.p136b.C2612ak.m6918A(r7)
            androidx.media3.common.aq r2 = r4.f8290r
            androidx.media3.common.aj r2 = r2.f7156e
            long r14 = r2.f7128c
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x03fe
            long r1 = java.lang.Math.min(r12, r14)
            goto L_0x040e
        L_0x03fe:
            androidx.media3.exoplayer.dash.a.t r1 = r1.f8325j
            if (r1 == 0) goto L_0x040d
            long r1 = r1.f8390c
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x040d
            long r1 = java.lang.Math.min(r12, r1)
            goto L_0x040e
        L_0x040d:
            r1 = r12
        L_0x040e:
            long r14 = r7 - r36
            long r17 = androidx.media3.common.p136b.C2612ak.m6918A(r14)
            r14 = 0
            int r9 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r9 >= 0) goto L_0x0420
            int r9 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0420
            r17 = 0
        L_0x0420:
            androidx.media3.exoplayer.dash.a.c r9 = r4.f8283h
            long r14 = r9.f8318c
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0431
            long r14 = r17 + r14
            long r14 = java.lang.Math.min(r14, r12)
            r18 = r14
            goto L_0x0433
        L_0x0431:
            r18 = r17
        L_0x0433:
            androidx.media3.common.aq r9 = r4.f8290r
            androidx.media3.common.aj r9 = r9.f7156e
            long r14 = r9.f7127b
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0448
            r16 = r14
            r20 = r12
            long r18 = androidx.media3.common.p136b.C2612ak.m6994s(r16, r18, r20)
        L_0x0445:
            r12 = r18
            goto L_0x045d
        L_0x0448:
            androidx.media3.exoplayer.dash.a.c r9 = r4.f8283h
            androidx.media3.exoplayer.dash.a.t r9 = r9.f8325j
            if (r9 == 0) goto L_0x0445
            long r14 = r9.f8389b
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0445
            r16 = r14
            r20 = r12
            long r18 = androidx.media3.common.p136b.C2612ak.m6994s(r16, r18, r20)
            goto L_0x0445
        L_0x045d:
            int r9 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0462
            r1 = r12
        L_0x0462:
            androidx.media3.common.aj r9 = r4.f8270D
            long r14 = r9.f7126a
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x046b
            goto L_0x0481
        L_0x046b:
            androidx.media3.exoplayer.dash.a.c r9 = r4.f8283h
            androidx.media3.exoplayer.dash.a.t r14 = r9.f8325j
            if (r14 == 0) goto L_0x0478
            long r14 = r14.f8388a
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 == 0) goto L_0x0478
            goto L_0x0481
        L_0x0478:
            long r14 = r9.f8322g
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x047f
            goto L_0x0481
        L_0x047f:
            long r14 = r4.f8294v
        L_0x0481:
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x0486
            r14 = r12
        L_0x0486:
            r16 = 2
            r5 = 5000000(0x4c4b40, double:2.470328E-317)
            int r9 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x04a3
            long r14 = r36 / r16
            long r14 = java.lang.Math.min(r5, r14)
            long r14 = r7 - r14
            long r20 = androidx.media3.common.p136b.C2612ak.m6918A(r14)
            r22 = r12
            r24 = r1
            long r14 = androidx.media3.common.p136b.C2612ak.m6994s(r20, r22, r24)
        L_0x04a3:
            androidx.media3.common.aq r9 = r4.f8290r
            androidx.media3.common.aj r9 = r9.f7156e
            float r5 = r9.f7129d
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r22 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r22 == 0) goto L_0x04b1
            goto L_0x04bd
        L_0x04b1:
            androidx.media3.exoplayer.dash.a.c r5 = r4.f8283h
            androidx.media3.exoplayer.dash.a.t r5 = r5.f8325j
            if (r5 == 0) goto L_0x04ba
            float r5 = r5.f8391d
            goto L_0x04bd
        L_0x04ba:
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x04bd:
            float r9 = r9.f7130e
            int r22 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r22 != 0) goto L_0x04cf
            androidx.media3.exoplayer.dash.a.c r9 = r4.f8283h
            androidx.media3.exoplayer.dash.a.t r9 = r9.f8325j
            if (r9 == 0) goto L_0x04cc
            float r9 = r9.f8392e
            goto L_0x04cf
        L_0x04cc:
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x04cf:
            int r22 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r22 != 0) goto L_0x04f1
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x04f1
            androidx.media3.exoplayer.dash.a.c r6 = r4.f8283h
            androidx.media3.exoplayer.dash.a.t r6 = r6.f8325j
            r22 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x04ec
            r23 = r5
            long r5 = r6.f8388a
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r24 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r24 != 0) goto L_0x04f3
        L_0x04ec:
            r5 = 1065353216(0x3f800000, float:1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x04f5
        L_0x04f1:
            r23 = r5
        L_0x04f3:
            r5 = r23
        L_0x04f5:
            androidx.media3.common.ai r6 = new androidx.media3.common.ai
            r6.<init>()
            r6.f7121a = r14
            r6.f7122b = r12
            r6.f7123c = r1
            r6.f7124d = r5
            r6.f7125e = r9
            androidx.media3.common.aj r1 = new androidx.media3.common.aj
            r1.<init>(r6)
            r4.f8270D = r1
            androidx.media3.exoplayer.dash.a.c r1 = r4.f8283h
            long r1 = r1.f8316a
            long r5 = androidx.media3.common.p136b.C2612ak.m6918A(r10)
            long r1 = r1 + r5
            androidx.media3.common.aj r5 = r4.f8270D
            long r5 = r5.f7126a
            long r5 = androidx.media3.common.p136b.C2612ak.m6998w(r5)
            long r5 = r7 - r5
            long r7 = r36 / r16
            r12 = 5000000(0x4c4b40, double:2.470328E-317)
            long r7 = java.lang.Math.min(r12, r7)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0530
            r29 = r1
            r38 = r7
            goto L_0x053c
        L_0x0530:
            r29 = r1
            r38 = r5
            goto L_0x053c
        L_0x0535:
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r38 = 0
        L_0x053c:
            long r0 = r0.f8351b
            long r0 = androidx.media3.common.p136b.C2612ak.m6998w(r0)
            long r34 = r10 - r0
            androidx.media3.exoplayer.dash.i r0 = new androidx.media3.exoplayer.dash.i
            androidx.media3.exoplayer.dash.a.c r1 = r4.f8283h
            long r5 = r1.f8316a
            long r7 = r4.f8272F
            int r2 = r4.f8289n
            androidx.media3.common.aq r9 = r4.f8290r
            boolean r10 = r1.f8319d
            if (r10 == 0) goto L_0x0557
            androidx.media3.common.aj r10 = r4.f8270D
            goto L_0x0558
        L_0x0557:
            r10 = 0
        L_0x0558:
            r42 = r10
            r26 = r0
            r27 = r5
            r31 = r7
            r33 = r2
            r40 = r1
            r41 = r9
            r26.<init>(r27, r29, r31, r33, r34, r36, r38, r40, r41, r42)
            r4.mo6952y(r0)
            android.os.Handler r0 = r4.f8281f
            java.lang.Runnable r1 = r4.f8278c
            r0.removeCallbacks(r1)
            r0 = 5000(0x1388, double:2.4703E-320)
            if (r3 == 0) goto L_0x0609
            android.os.Handler r2 = r4.f8281f
            java.lang.Runnable r3 = r4.f8278c
            androidx.media3.exoplayer.dash.a.c r5 = r4.f8283h
            long r6 = r4.f8272F
            long r6 = androidx.media3.common.p136b.C2612ak.m6996u(r6)
            int r8 = r5.mo6764a()
            int r8 = r8 + -1
            androidx.media3.exoplayer.dash.a.h r9 = r5.mo6766c(r8)
            long r10 = r9.f8351b
            long r10 = androidx.media3.common.p136b.C2612ak.m6998w(r10)
            long r12 = r5.mo6765b(r8)
            long r12 = androidx.media3.common.p136b.C2612ak.m6998w(r12)
            long r6 = androidx.media3.common.p136b.C2612ak.m6998w(r6)
            long r14 = r5.f8316a
            long r14 = androidx.media3.common.p136b.C2612ak.m6998w(r14)
            long r16 = androidx.media3.common.p136b.C2612ak.m6998w(r0)
            r0 = r16
            r5 = 0
        L_0x05ac:
            java.util.List r8 = r9.f8352c
            int r8 = r8.size()
            if (r5 >= r8) goto L_0x05fe
            java.util.List r8 = r9.f8352c
            java.lang.Object r8 = r8.get(r5)
            androidx.media3.exoplayer.dash.a.a r8 = (androidx.media3.exoplayer.dash.p141a.C2910a) r8
            java.util.List r8 = r8.f8308c
            boolean r20 = r8.isEmpty()
            if (r20 == 0) goto L_0x05c8
            r20 = r9
            r9 = 0
            goto L_0x05f9
        L_0x05c8:
            r20 = r9
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            androidx.media3.exoplayer.dash.a.m r8 = (androidx.media3.exoplayer.dash.p141a.C2922m) r8
            androidx.media3.exoplayer.dash.p r8 = r8.mo6789k()
            if (r8 == 0) goto L_0x05f9
            long r21 = r14 + r10
            long r23 = r8.mo6783e(r12, r6)
            long r21 = r21 + r23
            long r21 = r21 - r6
            r23 = -100000(0xfffffffffffe7960, double:NaN)
            long r23 = r0 + r23
            int r8 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r8 < 0) goto L_0x05f7
            int r8 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x05f9
            r23 = 100000(0x186a0, double:4.94066E-319)
            long r23 = r0 + r23
            int r8 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r8 >= 0) goto L_0x05f9
        L_0x05f7:
            r0 = r21
        L_0x05f9:
            int r5 = r5 + 1
            r9 = r20
            goto L_0x05ac
        L_0x05fe:
            r5 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r7 = java.math.RoundingMode.CEILING
            long r0 = com.google.common.p4573p.C60718h.m92650d(r0, r5, r7)
            r2.postDelayed(r3, r0)
        L_0x0609:
            boolean r0 = r4.f8284i
            if (r0 == 0) goto L_0x0611
            r43.mo6756l()
            return
        L_0x0611:
            if (r44 == 0) goto L_0x063b
            androidx.media3.exoplayer.dash.a.c r0 = r4.f8283h
            boolean r1 = r0.f8319d
            if (r1 == 0) goto L_0x063b
            long r0 = r0.f8320e
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x063b
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x062c
            r0 = 5000(0x1388, double:2.4703E-320)
        L_0x062c:
            long r5 = r4.f8285j
            long r5 = r5 + r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r0
            long r0 = java.lang.Math.max(r2, r5)
            r4.mo6755k(r0)
        L_0x063b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.mo6751g(boolean):void");
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        C2936e eVar = (C2936e) aqVar;
        C2957z zVar = eVar.f8414b;
        zVar.f8497g = true;
        zVar.f8492b.removeCallbacksAndMessages((Object) null);
        for (C3054j g : eVar.f8416d) {
            g.mo6992g(eVar);
        }
        eVar.f8415c = null;
        this.f8297y.remove(eVar.f8413a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo6753i() {
        this.f8284i = false;
        this.f8268B = null;
        C3256v vVar = this.f8279d;
        if (vVar != null) {
            vVar.mo7251d((C3253s) null);
            this.f8279d = null;
        }
        this.f8285j = 0;
        this.f8286k = 0;
        this.f8283h = null;
        this.f8282g = this.f8271E;
        this.f8280e = null;
        Handler handler = this.f8281f;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f8281f = null;
        }
        this.f8272F = -9223372036854775807L;
        this.f8287l = 0;
        this.f8288m = -9223372036854775807L;
        this.f8289n = 0;
        this.f8297y.clear();
        C2933b bVar = this.f8293u;
        bVar.f8400a.clear();
        bVar.f8401b.clear();
        bVar.f8402c.clear();
    }

    /* renamed from: j */
    public final void mo6754j(C2932w wVar, C3258x xVar) {
        m8187E(new C3259y(this.f8268B, Uri.parse(wVar.f8399b), 5, xVar), new C2945n(this), 1);
    }

    /* renamed from: k */
    public final void mo6755k(long j) {
        this.f8281f.postDelayed(this.f8298z, j);
    }

    /* renamed from: l */
    public final void mo6756l() {
        Uri uri;
        this.f8281f.removeCallbacks(this.f8298z);
        if (!this.f8279d.mo7252e()) {
            if (this.f8279d.mo7253f()) {
                this.f8284i = true;
                return;
            }
            synchronized (this.f8277b) {
                uri = this.f8282g;
            }
            this.f8284i = false;
            m8187E(new C3259y(this.f8268B, uri, 4, this.f8295w), this.f8296x, C3245k.m9467b(4));
        }
    }

    /* renamed from: m */
    public final C3034aq mo6757m(C3036as asVar, C3241g gVar, long j) {
        C3036as asVar2 = asVar;
        int intValue = ((Integer) asVar2.f7204a).intValue() - this.f8289n;
        C3065bc a = this.f8710o.mo7002a(0, asVar2, this.f8283h.mo6766c(intValue).f8351b);
        C2862e p = mo6943p(asVar);
        int i = this.f8289n;
        C2912c cVar = this.f8283h;
        C2933b bVar = this.f8293u;
        C2950s sVar = this.f8273G;
        C2495an anVar = this.f8269C;
        C2868k kVar = this.f8292t;
        C3245k kVar2 = this.f8274H;
        long j2 = this.f8272F;
        C3257w wVar = this.f8267A;
        C2941j jVar = this.f8275I;
        long j3 = j2;
        C2601a.m6829a(this.f8712q);
        C2941j jVar2 = jVar;
        C2936e eVar = new C2936e(i + intValue, cVar, bVar, intValue, sVar, anVar, kVar, p, kVar2, a, j3, wVar, gVar, jVar2);
        this.f8297y.put(eVar.f8413a, eVar);
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo6758n(C3259y yVar) {
        long j = yVar.f9791a;
        C2510n nVar = yVar.f9792b;
        C2493al alVar = yVar.f9794d;
        this.f8276a.mo7005d(new C3027aj(nVar, (byte[]) null), yVar.f9793c);
    }

    /* compiled from: PG */
    public final class Factory implements C3035ar {

        /* renamed from: a */
        private final C2504h f8299a;

        /* renamed from: b */
        private long f8300b;

        /* renamed from: c */
        private final C2950s f8301c;

        /* renamed from: d */
        private C3129x f8302d;

        /* renamed from: e */
        private C3245k f8303e;

        /* renamed from: f */
        private C2859b f8304f;

        public Factory(C2504h hVar) {
            this(new C2950s(hVar), hVar);
        }

        /* renamed from: a */
        public final DashMediaSource mo6760b(C2590aq aqVar) {
            aqVar.f7154c.getClass();
            C3258x eVar = new C2914e();
            List list = aqVar.f7154c.f7135e;
            return new DashMediaSource(aqVar, this.f8299a, !list.isEmpty() ? new C3003b(eVar, list) : eVar, this.f8301c, C2859b.m7902a(aqVar), this.f8303e, this.f8300b);
        }

        public Factory(C2950s sVar, C2504h hVar) {
            sVar.getClass();
            this.f8301c = sVar;
            this.f8299a = hVar;
            this.f8304f = new C2859b();
            this.f8303e = new C3245k((byte[]) null);
            this.f8300b = 30000;
            this.f8302d = new C3129x();
        }
    }
}
