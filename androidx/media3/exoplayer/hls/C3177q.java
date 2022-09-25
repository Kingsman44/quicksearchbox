package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.common.C2598ay;
import androidx.media3.common.C2599az;
import androidx.media3.common.C2652bn;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2897cz;
import androidx.media3.exoplayer.hls.p148a.C3137e;
import androidx.media3.exoplayer.hls.p148a.C3141i;
import androidx.media3.exoplayer.hls.p148a.C3144l;
import androidx.media3.exoplayer.hls.p148a.C3153u;
import androidx.media3.exoplayer.hls.p148a.C3157y;
import androidx.media3.exoplayer.p137a.C2731bt;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p145h.C3033ap;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p145h.C3097ch;
import androidx.media3.exoplayer.p145h.C3107cr;
import androidx.media3.exoplayer.p145h.C3116k;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.p132b.C2495an;
import com.google.common.p4522b.C58557jl;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.hls.q */
/* compiled from: PG */
public final class C3177q implements C3034aq, C3182v, C3153u {

    /* renamed from: a */
    public final C3157y f9448a;

    /* renamed from: b */
    public C3033ap f9449b;

    /* renamed from: c */
    public C3185y[] f9450c = new C3185y[0];

    /* renamed from: d */
    private final C3173m f9451d;

    /* renamed from: e */
    private final C2495an f9452e;

    /* renamed from: f */
    private final C2868k f9453f;

    /* renamed from: g */
    private final C2862e f9454g;

    /* renamed from: h */
    private final C3065bc f9455h;

    /* renamed from: i */
    private final IdentityHashMap f9456i = new IdentityHashMap();

    /* renamed from: j */
    private final C3160ac f9457j = new C3160ac();

    /* renamed from: k */
    private final boolean f9458k;

    /* renamed from: l */
    private final int f9459l;

    /* renamed from: m */
    private final C2731bt f9460m;

    /* renamed from: n */
    private int f9461n;

    /* renamed from: o */
    private C3107cr f9462o;

    /* renamed from: p */
    private C3185y[] f9463p = new C3185y[0];

    /* renamed from: q */
    private int f9464q;

    /* renamed from: r */
    private C3097ch f9465r = new C3116k(new C3097ch[0]);

    /* renamed from: s */
    private final C3163c f9466s;

    /* renamed from: t */
    private final C3245k f9467t;

    /* renamed from: u */
    private final C3241g f9468u;

    public C3177q(C3173m mVar, C3157y yVar, C3163c cVar, C2495an anVar, C2868k kVar, C2862e eVar, C3245k kVar2, C3065bc bcVar, C3241g gVar, boolean z, int i, C2731bt btVar) {
        this.f9451d = mVar;
        this.f9448a = yVar;
        this.f9466s = cVar;
        this.f9452e = anVar;
        this.f9453f = kVar;
        this.f9454g = eVar;
        this.f9467t = kVar2;
        this.f9455h = bcVar;
        this.f9468u = gVar;
        this.f9458k = z;
        this.f9459l = i;
        this.f9460m = btVar;
    }

    /* renamed from: t */
    private final C3185y m9262t(String str, int i, Uri[] uriArr, C2680x[] xVarArr, C2680x xVar, List list, Map map, long j) {
        return new C3185y(str, i, this, new C3172l(this.f9451d, this.f9448a, uriArr, xVarArr, this.f9466s, this.f9452e, this.f9457j, list, this.f9460m), map, this.f9468u, j, xVar, this.f9453f, this.f9454g, this.f9467t, this.f9455h, this.f9459l);
    }

    /* renamed from: a */
    public final long mo6807a(long j, C2897cz czVar) {
        C3185y[] yVarArr = this.f9463p;
        int length = yVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C3185y yVar = yVarArr[i];
            if (yVar.f9518k == 2) {
                C3172l lVar = yVar.f9509b;
                int a = lVar.f9416p.mo7021a();
                Uri[] uriArr = lVar.f9404d;
                C3144l lVar2 = null;
                if (a < uriArr.length && a != -1) {
                    lVar2 = lVar.f9406f.mo7143f(uriArr[lVar.f9416p.mo7028g()], true);
                }
                if (lVar2 != null && !lVar2.f9289o.isEmpty() && lVar2.f9316v) {
                    long j2 = lVar2.f9279e - ((C3137e) lVar.f9406f).f9249l;
                    long j3 = j - j2;
                    int b = C2612ak.m6977b(lVar2.f9289o, Long.valueOf(j3), true, true);
                    long j4 = ((C3141i) lVar2.f9289o.get(b)).f9263g;
                    return czVar.mo6705a(j3, j4, b != lVar2.f9289o.size() + -1 ? ((C3141i) lVar2.f9289o.get(b + 1)).f9263g : j4) + j2;
                }
            } else {
                i++;
            }
        }
        return j;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6617b(C3097ch chVar) {
        throw null;
    }

    /* renamed from: c */
    public final long mo6808c() {
        return this.f9465r.mo6808c();
    }

    /* renamed from: d */
    public final long mo6809d() {
        return this.f9465r.mo6809d();
    }

    /* renamed from: e */
    public final long mo6810e() {
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public final long mo6811f(long j) {
        C3185y[] yVarArr = this.f9463p;
        if (yVarArr.length > 0) {
            boolean t = yVarArr[0].mo7187t(j, false);
            int i = 1;
            while (true) {
                C3185y[] yVarArr2 = this.f9463p;
                if (i >= yVarArr2.length) {
                    break;
                }
                yVarArr2[i].mo7187t(j, t);
                i++;
            }
            if (t) {
                this.f9457j.f9374a.clear();
            }
        }
        return j;
    }

    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r14v1, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0131 A[ADDED_TO_REGION] */
    /* renamed from: fc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6812fc(androidx.media3.exoplayer.p145h.C3033ap r29, long r30) {
        /*
            r28 = this;
            r10 = r28
            r0 = r29
            r10.f9449b = r0
            androidx.media3.exoplayer.hls.a.y r0 = r10.f9448a
            androidx.media3.exoplayer.hls.a.e r0 = (androidx.media3.exoplayer.hls.p148a.C3137e) r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f9240c
            r0.add(r10)
            androidx.media3.exoplayer.hls.a.y r0 = r10.f9448a
            androidx.media3.exoplayer.hls.a.e r0 = (androidx.media3.exoplayer.hls.p148a.C3137e) r0
            androidx.media3.exoplayer.hls.a.o r11 = r0.f9245h
            r11.getClass()
            java.util.Map r12 = java.util.Collections.emptyMap()
            java.util.List r0 = r11.f9305c
            boolean r0 = r0.isEmpty()
            java.util.List r13 = r11.f9307e
            java.util.List r14 = r11.f9308f
            r15 = 0
            r10.f9461n = r15
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r7 = 1
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x0240
            java.util.List r0 = r11.f9305c
            int r0 = r0.size()
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0042:
            java.util.List r5 = r11.f9305c
            int r5 = r5.size()
            r6 = 2
            if (r2 >= r5) goto L_0x007b
            java.util.List r5 = r11.f9305c
            java.lang.Object r5 = r5.get(r2)
            androidx.media3.exoplayer.hls.a.n r5 = (androidx.media3.exoplayer.hls.p148a.C3146n) r5
            androidx.media3.common.x r5 = r5.f9298b
            int r15 = r5.f7502t
            if (r15 > 0) goto L_0x0073
            java.lang.String r15 = r5.f7493k
            java.lang.String r15 = androidx.media3.common.p136b.C2612ak.m6931N(r15, r6)
            if (r15 == 0) goto L_0x0062
            goto L_0x0073
        L_0x0062:
            java.lang.String r5 = r5.f7493k
            java.lang.String r5 = androidx.media3.common.p136b.C2612ak.m6931N(r5, r7)
            if (r5 == 0) goto L_0x006f
            r1[r2] = r7
            int r4 = r4 + 1
            goto L_0x0077
        L_0x006f:
            r5 = -1
            r1[r2] = r5
            goto L_0x0077
        L_0x0073:
            r1[r2] = r6
            int r3 = r3 + 1
        L_0x0077:
            int r2 = r2 + 1
            r15 = 0
            goto L_0x0042
        L_0x007b:
            if (r3 <= 0) goto L_0x0081
            r15 = r3
            r0 = 1
        L_0x007f:
            r2 = 0
            goto L_0x008b
        L_0x0081:
            if (r4 >= r0) goto L_0x0088
            int r0 = r0 - r4
            r15 = r0
            r0 = 0
            r2 = 1
            goto L_0x008b
        L_0x0088:
            r15 = r0
            r0 = 0
            goto L_0x007f
        L_0x008b:
            android.net.Uri[] r3 = new android.net.Uri[r15]
            androidx.media3.common.x[] r5 = new androidx.media3.common.C2680x[r15]
            int[] r4 = new int[r15]
            r7 = 0
            r17 = 0
        L_0x0094:
            java.util.List r6 = r11.f9305c
            int r6 = r6.size()
            if (r7 >= r6) goto L_0x00ca
            if (r0 == 0) goto L_0x00a6
            r6 = r1[r7]
            r19 = r8
            r8 = 2
            if (r6 != r8) goto L_0x00c5
            goto L_0x00a8
        L_0x00a6:
            r19 = r8
        L_0x00a8:
            if (r2 == 0) goto L_0x00af
            r6 = r1[r7]
            r8 = 1
            if (r6 == r8) goto L_0x00c5
        L_0x00af:
            java.util.List r6 = r11.f9305c
            java.lang.Object r6 = r6.get(r7)
            androidx.media3.exoplayer.hls.a.n r6 = (androidx.media3.exoplayer.hls.p148a.C3146n) r6
            android.net.Uri r8 = r6.f9297a
            r3[r17] = r8
            androidx.media3.common.x r6 = r6.f9298b
            r5[r17] = r6
            int r6 = r17 + 1
            r4[r17] = r7
            r17 = r6
        L_0x00c5:
            int r7 = r7 + 1
            r8 = r19
            goto L_0x0094
        L_0x00ca:
            r19 = r8
            r6 = 0
            r1 = r5[r6]
            java.lang.String r1 = r1.f7493k
            r6 = 2
            int r8 = androidx.media3.common.p136b.C2612ak.m6985j(r1, r6)
            r7 = 1
            int r1 = androidx.media3.common.p136b.C2612ak.m6985j(r1, r7)
            if (r1 == r7) goto L_0x00ec
            if (r1 != 0) goto L_0x00f7
            java.util.List r1 = r11.f9307e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00e9
            r1 = 0
            goto L_0x00ec
        L_0x00e9:
            r16 = 0
            goto L_0x00f9
        L_0x00ec:
            if (r8 > r7) goto L_0x00f7
            int r2 = r1 + r8
            if (r2 <= 0) goto L_0x00f7
            r16 = r1
            r17 = 1
            goto L_0x00fb
        L_0x00f7:
            r16 = r1
        L_0x00f9:
            r17 = 0
        L_0x00fb:
            if (r0 != 0) goto L_0x0101
            if (r16 <= 0) goto L_0x0101
            r2 = 1
            goto L_0x0102
        L_0x0101:
            r2 = 0
        L_0x0102:
            java.lang.String r1 = "main"
            androidx.media3.common.x r0 = r11.f9310h
            java.util.List r6 = r11.f9311i
            r20 = r0
            r0 = r28
            r21 = r1
            r22 = r14
            r14 = r4
            r4 = r5
            r23 = r5
            r5 = r20
            r20 = r13
            r13 = 2
            r7 = r12
            r24 = r8
            r13 = r19
            r19 = r12
            r12 = r9
            r8 = r30
            androidx.media3.exoplayer.hls.y r0 = r0.m9262t(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.add(r0)
            r12.add(r14)
            boolean r1 = r10.f9458k
            if (r1 == 0) goto L_0x023e
            if (r17 == 0) goto L_0x023e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r24 <= 0) goto L_0x01ec
            androidx.media3.common.x[] r2 = new androidx.media3.common.C2680x[r15]
            r3 = 0
        L_0x013d:
            if (r3 >= r15) goto L_0x018b
            r4 = r23[r3]
            java.lang.String r5 = r4.f7493k
            r6 = 2
            java.lang.String r5 = androidx.media3.common.p136b.C2612ak.m6931N(r5, r6)
            java.lang.String r7 = androidx.media3.common.C2598ay.m6807f(r5)
            androidx.media3.common.w r8 = new androidx.media3.common.w
            r8.<init>()
            java.lang.String r9 = r4.f7485c
            r8.f7449a = r9
            java.lang.String r9 = r4.f7486d
            r8.f7450b = r9
            java.lang.String r9 = r4.f7495m
            r8.f7458j = r9
            r8.f7459k = r7
            r8.f7456h = r5
            androidx.media3.common.Metadata r5 = r4.f7494l
            r8.f7457i = r5
            int r5 = r4.f7490h
            r8.f7454f = r5
            int r5 = r4.f7491i
            r8.f7455g = r5
            int r5 = r4.f7501s
            r8.f7464p = r5
            int r5 = r4.f7502t
            r8.f7465q = r5
            float r5 = r4.f7503u
            r8.f7466r = r5
            int r5 = r4.f7488f
            r8.f7452d = r5
            int r4 = r4.f7489g
            r8.f7453e = r4
            androidx.media3.common.x r4 = new androidx.media3.common.x
            r4.<init>(r8)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x013d
        L_0x018b:
            androidx.media3.common.bn r3 = new androidx.media3.common.bn
            r4 = r21
            r3.<init>(r4, r2)
            r1.add(r3)
            if (r16 <= 0) goto L_0x01bc
            androidx.media3.common.x r2 = r11.f9310h
            if (r2 != 0) goto L_0x01a3
            java.util.List r2 = r11.f9307e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x01bc
        L_0x01a3:
            androidx.media3.common.bn r2 = new androidx.media3.common.bn
            r14 = 1
            androidx.media3.common.x[] r3 = new androidx.media3.common.C2680x[r14]
            r4 = 0
            r5 = r23[r4]
            androidx.media3.common.x r6 = r11.f9310h
            androidx.media3.common.x r5 = m9261s(r5, r6, r4)
            r3[r4] = r5
            java.lang.String r4 = "main:audio"
            r2.<init>(r4, r3)
            r1.add(r2)
            goto L_0x01bd
        L_0x01bc:
            r14 = 1
        L_0x01bd:
            java.util.List r2 = r11.f9311i
            if (r2 == 0) goto L_0x0209
            r3 = 0
        L_0x01c2:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0209
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "main:cc:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            androidx.media3.common.bn r5 = new androidx.media3.common.bn
            androidx.media3.common.x[] r6 = new androidx.media3.common.C2680x[r14]
            java.lang.Object r7 = r2.get(r3)
            androidx.media3.common.x r7 = (androidx.media3.common.C2680x) r7
            r8 = 0
            r6[r8] = r7
            r5.<init>(r4, r6)
            r1.add(r5)
            int r3 = r3 + 1
            goto L_0x01c2
        L_0x01ec:
            r4 = r21
            r14 = 1
            androidx.media3.common.x[] r2 = new androidx.media3.common.C2680x[r15]
            r3 = 0
        L_0x01f2:
            if (r3 >= r15) goto L_0x0201
            r5 = r23[r3]
            androidx.media3.common.x r6 = r11.f9310h
            androidx.media3.common.x r5 = m9261s(r5, r6, r14)
            r2[r3] = r5
            int r3 = r3 + 1
            goto L_0x01f2
        L_0x0201:
            androidx.media3.common.bn r3 = new androidx.media3.common.bn
            r3.<init>(r4, r2)
            r1.add(r3)
        L_0x0209:
            androidx.media3.common.bn r2 = new androidx.media3.common.bn
            androidx.media3.common.x[] r3 = new androidx.media3.common.C2680x[r14]
            androidx.media3.common.w r4 = new androidx.media3.common.w
            r4.<init>()
            java.lang.String r5 = "ID3"
            r4.f7449a = r5
            java.lang.String r5 = "application/id3"
            r4.f7459k = r5
            androidx.media3.common.x r5 = new androidx.media3.common.x
            r5.<init>(r4)
            r4 = 0
            r3[r4] = r5
            java.lang.String r5 = "main:id3"
            r2.<init>(r5, r3)
            r1.add(r2)
            androidx.media3.common.bn[] r3 = new androidx.media3.common.C2652bn[r4]
            java.lang.Object[] r3 = r1.toArray(r3)
            androidx.media3.common.bn[] r3 = (androidx.media3.common.C2652bn[]) r3
            int[] r5 = new int[r14]
            int r1 = r1.indexOf(r2)
            r5[r4] = r1
            r0.mo7188v(r3, r5)
            goto L_0x0249
        L_0x023e:
            r14 = 1
            goto L_0x0249
        L_0x0240:
            r19 = r12
            r20 = r13
            r22 = r14
            r14 = 1
            r13 = r8
            r12 = r9
        L_0x0249:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r20.size()
            r11.<init>(r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            int r0 = r20.size()
            r15.<init>(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r20.size()
            r8.<init>(r0)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r7 = 0
        L_0x026a:
            int r0 = r20.size()
            if (r7 >= r0) goto L_0x0347
            r6 = r20
            java.lang.Object r0 = r6.get(r7)
            androidx.media3.exoplayer.hls.a.m r0 = (androidx.media3.exoplayer.hls.p148a.C3145m) r0
            java.lang.String r0 = r0.f9296c
            boolean r1 = r9.add(r0)
            if (r1 != 0) goto L_0x028a
            r17 = r6
            r18 = r7
            r20 = r8
            r21 = r9
            goto L_0x033d
        L_0x028a:
            r11.clear()
            r15.clear()
            r8.clear()
            r1 = 0
            r16 = 1
        L_0x0296:
            int r2 = r6.size()
            if (r1 >= r2) goto L_0x02d5
            java.lang.Object r2 = r6.get(r1)
            androidx.media3.exoplayer.hls.a.m r2 = (androidx.media3.exoplayer.hls.p148a.C3145m) r2
            java.lang.String r2 = r2.f9296c
            boolean r2 = androidx.media3.common.p136b.C2612ak.m6951aa(r0, r2)
            if (r2 == 0) goto L_0x02d2
            java.lang.Object r2 = r6.get(r1)
            androidx.media3.exoplayer.hls.a.m r2 = (androidx.media3.exoplayer.hls.p148a.C3145m) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r8.add(r3)
            android.net.Uri r3 = r2.f9294a
            r11.add(r3)
            androidx.media3.common.x r3 = r2.f9295b
            r15.add(r3)
            androidx.media3.common.x r2 = r2.f9295b
            java.lang.String r2 = r2.f7493k
            int r2 = androidx.media3.common.p136b.C2612ak.m6985j(r2, r14)
            if (r2 != r14) goto L_0x02cd
            r2 = 1
            goto L_0x02ce
        L_0x02cd:
            r2 = 0
        L_0x02ce:
            r2 = r16 & r2
            r16 = r2
        L_0x02d2:
            int r1 = r1 + 1
            goto L_0x0296
        L_0x02d5:
            java.lang.String r1 = "audio:"
            java.lang.String r5 = r1.concat(r0)
            r2 = 1
            r0 = 0
            android.net.Uri[] r1 = new android.net.Uri[r0]
            java.lang.Object[] r1 = androidx.media3.common.p136b.C2612ak.m6962al(r1)
            android.net.Uri[] r1 = (android.net.Uri[]) r1
            java.lang.Object[] r1 = r11.toArray(r1)
            r3 = r1
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            androidx.media3.common.x[] r1 = new androidx.media3.common.C2680x[r0]
            java.lang.Object[] r0 = r15.toArray(r1)
            r4 = r0
            androidx.media3.common.x[] r4 = (androidx.media3.common.C2680x[]) r4
            r17 = 0
            java.util.List r18 = java.util.Collections.emptyList()
            r0 = r28
            r1 = r5
            r25 = r5
            r5 = r17
            r17 = r6
            r6 = r18
            r18 = r7
            r7 = r19
            r20 = r8
            r21 = r9
            r8 = r30
            androidx.media3.exoplayer.hls.y r0 = r0.m9262t(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = com.google.common.p4575r.C60757n.m92752m(r20)
            r12.add(r1)
            r13.add(r0)
            boolean r1 = r10.f9458k
            if (r1 == 0) goto L_0x033d
            if (r16 == 0) goto L_0x033d
            r1 = 0
            androidx.media3.common.x[] r2 = new androidx.media3.common.C2680x[r1]
            java.lang.Object[] r2 = r15.toArray(r2)
            androidx.media3.common.x[] r2 = (androidx.media3.common.C2680x[]) r2
            androidx.media3.common.bn[] r3 = new androidx.media3.common.C2652bn[r14]
            androidx.media3.common.bn r4 = new androidx.media3.common.bn
            r5 = r25
            r4.<init>(r5, r2)
            r3[r1] = r4
            int[] r2 = new int[r1]
            r0.mo7188v(r3, r2)
        L_0x033d:
            int r7 = r18 + 1
            r8 = r20
            r9 = r21
            r20 = r17
            goto L_0x026a
        L_0x0347:
            int r0 = r13.size()
            r10.f9464q = r0
            r11 = 0
        L_0x034e:
            int r0 = r22.size()
            if (r11 >= r0) goto L_0x03bd
            r15 = r22
            java.lang.Object r0 = r15.get(r11)
            r8 = r0
            androidx.media3.exoplayer.hls.a.m r8 = (androidx.media3.exoplayer.hls.p148a.C3145m) r8
            java.lang.String r0 = r8.f9296c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "subtitle:"
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            android.net.Uri[] r3 = new android.net.Uri[r14]
            android.net.Uri r0 = r8.f9294a
            r1 = 0
            r3[r1] = r0
            androidx.media3.common.x[] r4 = new androidx.media3.common.C2680x[r14]
            androidx.media3.common.x r0 = r8.f9295b
            r4[r1] = r0
            r2 = 3
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()
            r0 = r28
            r1 = r9
            r7 = r19
            r26 = r8
            r27 = r9
            r8 = r30
            androidx.media3.exoplayer.hls.y r0 = r0.m9262t(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = new int[r14]
            r6 = 0
            r1[r6] = r11
            r12.add(r1)
            r13.add(r0)
            androidx.media3.common.bn[] r1 = new androidx.media3.common.C2652bn[r14]
            androidx.media3.common.bn r2 = new androidx.media3.common.bn
            androidx.media3.common.x[] r3 = new androidx.media3.common.C2680x[r14]
            r4 = r26
            androidx.media3.common.x r4 = r4.f9295b
            r3[r6] = r4
            r4 = r27
            r2.<init>(r4, r3)
            r1[r6] = r2
            int[] r2 = new int[r6]
            r0.mo7188v(r1, r2)
            int r11 = r11 + 1
            goto L_0x034e
        L_0x03bd:
            r6 = 0
            androidx.media3.exoplayer.hls.y[] r0 = new androidx.media3.exoplayer.hls.C3185y[r6]
            java.lang.Object[] r0 = r13.toArray(r0)
            androidx.media3.exoplayer.hls.y[] r0 = (androidx.media3.exoplayer.hls.C3185y[]) r0
            r10.f9450c = r0
            int[][] r0 = new int[r6][]
            java.lang.Object[] r0 = r12.toArray(r0)
            int[][] r0 = (int[][]) r0
            androidx.media3.exoplayer.hls.y[] r0 = r10.f9450c
            int r0 = r0.length
            r10.f9461n = r0
            r0 = 0
        L_0x03d6:
            int r1 = r10.f9464q
            if (r0 >= r1) goto L_0x03e5
            androidx.media3.exoplayer.hls.y[] r1 = r10.f9450c
            r1 = r1[r0]
            androidx.media3.exoplayer.hls.l r1 = r1.f9509b
            r1.f9411k = r14
            int r0 = r0 + 1
            goto L_0x03d6
        L_0x03e5:
            androidx.media3.exoplayer.hls.y[] r0 = r10.f9450c
            int r1 = r0.length
            r15 = 0
        L_0x03e9:
            if (r15 >= r1) goto L_0x03f3
            r2 = r0[r15]
            r2.mo7181h()
            int r15 = r15 + 1
            goto L_0x03e9
        L_0x03f3:
            androidx.media3.exoplayer.hls.y[] r0 = r10.f9450c
            r10.f9463p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.C3177q.mo6812fc(androidx.media3.exoplayer.h.ap, long):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.media3.exoplayer.hls.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0259  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo6813g(androidx.media3.exoplayer.p150j.C3197ad[] r35, boolean[] r36, androidx.media3.exoplayer.p145h.C3095cf[] r37, boolean[] r38, long r39) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r37
            r12 = r39
            int r3 = r1.length
            int[] r14 = new int[r3]
            int[] r15 = new int[r3]
            r3 = 0
        L_0x000e:
            int r10 = r1.length
            r8 = -1
            if (r3 >= r10) goto L_0x004c
            r4 = r2[r3]
            if (r4 != 0) goto L_0x0018
            r4 = -1
            goto L_0x0024
        L_0x0018:
            java.util.IdentityHashMap r5 = r0.f9456i
            java.lang.Object r4 = r5.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x0024:
            r14[r3] = r4
            r15[r3] = r8
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0049
            androidx.media3.common.bn r4 = r4.mo7035m()
            r5 = 0
        L_0x0031:
            androidx.media3.exoplayer.hls.y[] r6 = r0.f9450c
            int r7 = r6.length
            if (r5 >= r7) goto L_0x0049
            r6 = r6[r5]
            r6.mo7180g()
            androidx.media3.exoplayer.h.cr r6 = r6.f9526s
            int r6 = r6.mo7096a(r4)
            if (r6 == r8) goto L_0x0046
            r15[r3] = r5
            goto L_0x0049
        L_0x0046:
            int r5 = r5 + 1
            goto L_0x0031
        L_0x0049:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x004c:
            java.util.IdentityHashMap r3 = r0.f9456i
            r3.clear()
            androidx.media3.exoplayer.h.cf[] r9 = new androidx.media3.exoplayer.p145h.C3095cf[r10]
            androidx.media3.exoplayer.h.cf[] r6 = new androidx.media3.exoplayer.p145h.C3095cf[r10]
            androidx.media3.exoplayer.j.ad[] r7 = new androidx.media3.exoplayer.p150j.C3197ad[r10]
            androidx.media3.exoplayer.hls.y[] r3 = r0.f9450c
            int r3 = r3.length
            androidx.media3.exoplayer.hls.y[] r4 = new androidx.media3.exoplayer.hls.C3185y[r3]
            r3 = 0
            r5 = 0
            r16 = 0
        L_0x0060:
            androidx.media3.exoplayer.hls.y[] r11 = r0.f9450c
            int r11 = r11.length
            if (r5 >= r11) goto L_0x02fa
            r11 = 0
        L_0x0066:
            int r8 = r1.length
            r19 = r3
            if (r11 >= r8) goto L_0x0084
            r8 = r14[r11]
            if (r8 != r5) goto L_0x0072
            r8 = r2[r11]
            goto L_0x0073
        L_0x0072:
            r8 = 0
        L_0x0073:
            r6[r11] = r8
            r8 = r15[r11]
            if (r8 != r5) goto L_0x007c
            r3 = r1[r11]
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            r7[r11] = r3
            int r11 = r11 + 1
            r3 = r19
            goto L_0x0066
        L_0x0084:
            androidx.media3.exoplayer.hls.y[] r8 = r0.f9450c
            r11 = r8[r5]
            r11.mo7180g()
            int r8 = r11.f9522o
            r3 = 0
        L_0x008e:
            if (r3 >= r10) goto L_0x00e8
            r21 = r6[r3]
            r22 = r4
            r4 = r21
            androidx.media3.exoplayer.hls.r r4 = (androidx.media3.exoplayer.hls.C3178r) r4
            if (r4 == 0) goto L_0x00d6
            r21 = r7[r3]
            if (r21 == 0) goto L_0x00a2
            boolean r21 = r36[r3]
            if (r21 != 0) goto L_0x00d6
        L_0x00a2:
            r21 = r5
            int r5 = r11.f9522o
            r23 = r9
            r9 = -1
            int r5 = r5 + r9
            r11.f9522o = r5
            int r5 = r4.f9471c
            if (r5 == r9) goto L_0x00cf
            androidx.media3.exoplayer.hls.y r5 = r4.f9470b
            int r9 = r4.f9469a
            r5.mo7180g()
            int[] r2 = r5.f9528u
            r2.getClass()
            r2 = r2[r9]
            boolean[] r9 = r5.f9530w
            boolean r9 = r9[r2]
            androidx.media3.common.p136b.C2601a.m6832d(r9)
            boolean[] r5 = r5.f9530w
            r17 = 0
            r5[r2] = r17
            r2 = -1
            r4.f9471c = r2
            goto L_0x00d2
        L_0x00cf:
            r2 = -1
            r17 = 0
        L_0x00d2:
            r4 = 0
            r6[r3] = r4
            goto L_0x00dd
        L_0x00d6:
            r21 = r5
            r23 = r9
            r2 = -1
            r17 = 0
        L_0x00dd:
            int r3 = r3 + 1
            r2 = r37
            r5 = r21
            r4 = r22
            r9 = r23
            goto L_0x008e
        L_0x00e8:
            r22 = r4
            r21 = r5
            r23 = r9
            r2 = -1
            r17 = 0
            if (r16 != 0) goto L_0x0103
            boolean r3 = r11.f9484A
            if (r3 == 0) goto L_0x00fa
            if (r8 != 0) goto L_0x0101
            goto L_0x0103
        L_0x00fa:
            long r3 = r11.f9532y
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r3 = 0
            goto L_0x0104
        L_0x0103:
            r3 = 1
        L_0x0104:
            androidx.media3.exoplayer.hls.l r4 = r11.f9509b
            androidx.media3.exoplayer.j.ad r4 = r4.f9416p
            r18 = r3
            r8 = r4
            r3 = 0
        L_0x010c:
            if (r3 >= r10) goto L_0x0161
            r5 = r7[r3]
            if (r5 != 0) goto L_0x0113
            goto L_0x015d
        L_0x0113:
            androidx.media3.exoplayer.h.cr r2 = r11.f9526s
            androidx.media3.common.bn r9 = r5.mo7035m()
            int r2 = r2.mo7096a(r9)
            int r9 = r11.f9529v
            if (r2 != r9) goto L_0x0126
            androidx.media3.exoplayer.hls.l r8 = r11.f9509b
            r8.f9416p = r5
            r8 = r5
        L_0x0126:
            r5 = r6[r3]
            if (r5 != 0) goto L_0x015d
            int r5 = r11.f9522o
            r9 = 1
            int r5 = r5 + r9
            r11.f9522o = r5
            androidx.media3.exoplayer.hls.r r5 = new androidx.media3.exoplayer.hls.r
            r5.<init>(r11, r2)
            r6[r3] = r5
            r38[r3] = r9
            int[] r9 = r11.f9528u
            if (r9 == 0) goto L_0x015d
            r5.mo7175d()
            if (r18 != 0) goto L_0x015d
            androidx.media3.exoplayer.hls.x[] r5 = r11.f9516i
            int[] r9 = r11.f9528u
            r2 = r9[r2]
            r2 = r5[r2]
            r5 = 1
            boolean r9 = r2.mo7070C(r12, r5)
            if (r9 != 0) goto L_0x015b
            int r5 = r2.f9043e
            int r2 = r2.f9044f
            int r5 = r5 + r2
            if (r5 == 0) goto L_0x015b
            r18 = 1
            goto L_0x015d
        L_0x015b:
            r18 = 0
        L_0x015d:
            int r3 = r3 + 1
            r2 = -1
            goto L_0x010c
        L_0x0161:
            int r2 = r11.f9522o
            if (r2 != 0) goto L_0x01ab
            androidx.media3.exoplayer.hls.l r2 = r11.f9509b
            r3 = 0
            r2.f9413m = r3
            r11.f9524q = r3
            r2 = 1
            r11.f9533z = r2
            java.util.ArrayList r3 = r11.f9512e
            r3.clear()
            androidx.media3.exoplayer.k.v r3 = r11.f9510c
            boolean r3 = r3.mo7253f()
            if (r3 == 0) goto L_0x0194
            boolean r3 = r11.f9520m
            if (r3 == 0) goto L_0x018e
            androidx.media3.exoplayer.hls.x[] r3 = r11.f9516i
            int r4 = r3.length
            r5 = 0
        L_0x0184:
            if (r5 >= r4) goto L_0x018e
            r8 = r3[r5]
            r8.mo7081q()
            int r5 = r5 + 1
            goto L_0x0184
        L_0x018e:
            androidx.media3.exoplayer.k.v r3 = r11.f9510c
            r3.mo7249b()
            goto L_0x0197
        L_0x0194:
            r11.mo7184p()
        L_0x0197:
            r31 = r7
            r3 = r10
            r17 = r14
            r30 = r19
            r29 = r21
            r25 = r22
            r32 = r23
            r24 = -1
            r22 = r6
            r14 = r11
            goto L_0x025d
        L_0x01ab:
            r2 = 1
            java.util.ArrayList r3 = r11.f9512e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x022e
            boolean r3 = androidx.media3.common.p136b.C2612ak.m6951aa(r8, r4)
            if (r3 != 0) goto L_0x022e
            boolean r3 = r11.f9484A
            if (r3 != 0) goto L_0x0216
            r3 = 0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x01c5
            long r3 = -r12
        L_0x01c5:
            r25 = r3
            androidx.media3.exoplayer.hls.o r9 = r11.mo7179e()
            androidx.media3.exoplayer.hls.l r3 = r11.f9509b
            androidx.media3.exoplayer.h.b.q[] r20 = r3.mo7171e(r9, r12)
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List r4 = r11.f9513f
            r5 = r19
            r3 = r8
            r30 = r5
            r29 = r21
            r2 = r22
            r21 = r4
            r4 = r39
            r22 = r6
            r31 = r7
            r6 = r25
            r25 = r2
            r19 = r8
            r2 = r9
            r32 = r23
            r24 = -1
            r8 = r27
            r33 = r10
            r10 = r21
            r17 = r14
            r14 = r11
            r11 = r20
            r3.mo7024d(r4, r6, r8, r10, r11)
            androidx.media3.exoplayer.hls.l r3 = r14.f9509b
            androidx.media3.common.bn r3 = r3.f9407g
            androidx.media3.common.x r2 = r2.f8848n
            int r2 = r3.mo6305a(r2)
            int r3 = r19.mo7028g()
            if (r3 == r2) goto L_0x0214
            r2 = 1
            goto L_0x0229
        L_0x0214:
            r2 = 1
            goto L_0x0241
        L_0x0216:
            r31 = r7
            r33 = r10
            r17 = r14
            r30 = r19
            r29 = r21
            r25 = r22
            r32 = r23
            r24 = -1
            r22 = r6
            r14 = r11
        L_0x0229:
            r14.f9533z = r2
            r3 = 1
            r9 = 1
            goto L_0x0245
        L_0x022e:
            r31 = r7
            r33 = r10
            r17 = r14
            r30 = r19
            r29 = r21
            r25 = r22
            r32 = r23
            r24 = -1
            r22 = r6
            r14 = r11
        L_0x0241:
            r3 = r16
            r9 = r18
        L_0x0245:
            if (r9 == 0) goto L_0x0259
            r14.mo7187t(r12, r3)
            r3 = r33
            r11 = 0
        L_0x024d:
            if (r11 >= r3) goto L_0x025b
            r4 = r22[r11]
            if (r4 == 0) goto L_0x0255
            r38[r11] = r2
        L_0x0255:
            int r11 = r11 + 1
            r2 = 1
            goto L_0x024d
        L_0x0259:
            r3 = r33
        L_0x025b:
            r18 = r9
        L_0x025d:
            java.util.ArrayList r2 = r14.f9515h
            r2.clear()
            r11 = 0
        L_0x0263:
            if (r11 >= r3) goto L_0x0273
            r2 = r22[r11]
            if (r2 == 0) goto L_0x0270
            java.util.ArrayList r4 = r14.f9515h
            androidx.media3.exoplayer.hls.r r2 = (androidx.media3.exoplayer.hls.C3178r) r2
            r4.add(r2)
        L_0x0270:
            int r11 = r11 + 1
            goto L_0x0263
        L_0x0273:
            r2 = 1
            r14.f9484A = r2
            r2 = 0
            r11 = 0
        L_0x0278:
            int r4 = r1.length
            if (r11 >= r4) goto L_0x02aa
            r4 = r22[r11]
            r5 = r15[r11]
            r6 = r29
            if (r5 != r6) goto L_0x0295
            r4.getClass()
            r5 = r32
            r5[r11] = r4
            java.util.IdentityHashMap r2 = r0.f9456i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.put(r4, r7)
            r2 = 1
            goto L_0x02a3
        L_0x0295:
            r5 = r32
            r7 = r17[r11]
            if (r7 != r6) goto L_0x02a3
            if (r4 != 0) goto L_0x029f
            r4 = 1
            goto L_0x02a0
        L_0x029f:
            r4 = 0
        L_0x02a0:
            androidx.media3.common.p136b.C2601a.m6832d(r4)
        L_0x02a3:
            int r11 = r11 + 1
            r32 = r5
            r29 = r6
            goto L_0x0278
        L_0x02aa:
            r6 = r29
            r5 = r32
            if (r2 == 0) goto L_0x02e3
            r11 = r30
            r25[r11] = r14
            int r2 = r11 + 1
            if (r11 != 0) goto L_0x02d5
            androidx.media3.exoplayer.hls.l r4 = r14.f9509b
            r7 = 1
            r4.f9411k = r7
            if (r18 != 0) goto L_0x02ca
            androidx.media3.exoplayer.hls.y[] r4 = r0.f9463p
            int r8 = r4.length
            if (r8 == 0) goto L_0x02ca
            r8 = 0
            r4 = r4[r8]
            if (r14 == r4) goto L_0x02e7
            goto L_0x02cb
        L_0x02ca:
            r8 = 0
        L_0x02cb:
            androidx.media3.exoplayer.hls.ac r4 = r0.f9457j
            android.util.SparseArray r4 = r4.f9374a
            r4.clear()
            r16 = 1
            goto L_0x02e7
        L_0x02d5:
            r7 = 1
            r8 = 0
            int r4 = r0.f9464q
            if (r6 >= r4) goto L_0x02dd
            r11 = 1
            goto L_0x02de
        L_0x02dd:
            r11 = 0
        L_0x02de:
            androidx.media3.exoplayer.hls.l r4 = r14.f9509b
            r4.f9411k = r11
            goto L_0x02e7
        L_0x02e3:
            r11 = r30
            r8 = 0
            r2 = r11
        L_0x02e7:
            int r4 = r6 + 1
            r10 = r3
            r9 = r5
            r14 = r17
            r6 = r22
            r7 = r31
            r8 = -1
            r3 = r2
            r5 = r4
            r4 = r25
            r2 = r37
            goto L_0x0060
        L_0x02fa:
            r11 = r3
            r25 = r4
            r5 = r9
            r3 = r10
            r8 = 0
            java.lang.System.arraycopy(r5, r8, r2, r8, r3)
            r1 = r25
            java.lang.Object[] r1 = androidx.media3.common.p136b.C2612ak.m6965ao(r1, r11)
            androidx.media3.exoplayer.hls.y[] r1 = (androidx.media3.exoplayer.hls.C3185y[]) r1
            r0.f9463p = r1
            androidx.media3.exoplayer.h.k r2 = new androidx.media3.exoplayer.h.k
            r2.<init>(r1)
            r0.f9465r = r2
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.C3177q.mo6813g(androidx.media3.exoplayer.j.ad[], boolean[], androidx.media3.exoplayer.h.cf[], boolean[], long):long");
    }

    /* renamed from: h */
    public final C3107cr mo6814h() {
        C3107cr crVar = this.f9462o;
        crVar.getClass();
        return crVar;
    }

    /* renamed from: i */
    public final void mo6815i(long j, boolean z) {
        for (C3185y yVar : this.f9463p) {
            if (yVar.f9520m && !yVar.mo7186s()) {
                int length = yVar.f9516i.length;
                for (int i = 0; i < length; i++) {
                    yVar.f9516i[i].mo7080p(j, z, yVar.f9530w[i]);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo6816j() {
        C3185y[] yVarArr = this.f9450c;
        int length = yVarArr.length;
        int i = 0;
        while (i < length) {
            C3185y yVar = yVarArr[i];
            yVar.mo7183k();
            if (!yVar.f9485B || yVar.f9521n) {
                i++;
            } else {
                throw C2599az.m6819a("Loading finished before preparation is complete.", (Throwable) null);
            }
        }
    }

    /* renamed from: k */
    public final void mo7135k() {
        for (C3185y yVar : this.f9450c) {
            if (!yVar.f9512e.isEmpty()) {
                C3175o oVar = (C3175o) C58557jl.m90131l(yVar.f9512e);
                int a = yVar.f9509b.mo7168a(oVar);
                if (a == 1) {
                    oVar.f9442j = true;
                } else if (a == 2 && !yVar.f9485B) {
                    C3256v vVar = yVar.f9510c;
                    if (vVar.mo7253f()) {
                        vVar.mo7249b();
                    }
                }
            }
        }
        this.f9449b.mo6617b(this);
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
        this.f9465r.mo6818m(j);
    }

    /* renamed from: n */
    public final boolean mo6819n(long j) {
        if (this.f9462o != null) {
            return this.f9465r.mo6819n(j);
        }
        for (C3185y h : this.f9450c) {
            h.mo7181h();
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        return this.f9465r.mo6820o();
    }

    /* renamed from: p */
    public final void mo7173p() {
        int i = this.f9461n - 1;
        this.f9461n = i;
        if (i <= 0) {
            int i2 = 0;
            for (C3185y yVar : this.f9450c) {
                yVar.mo7180g();
                i2 += yVar.f9526s.f9109b;
            }
            C2652bn[] bnVarArr = new C2652bn[i2];
            int i3 = 0;
            for (C3185y yVar2 : this.f9450c) {
                yVar2.mo7180g();
                int i4 = yVar2.f9526s.f9109b;
                int i5 = 0;
                while (i5 < i4) {
                    yVar2.mo7180g();
                    bnVarArr[i3] = yVar2.f9526s.mo7097b(i5);
                    i5++;
                    i3++;
                }
            }
            this.f9462o = new C3107cr(bnVarArr);
            this.f9449b.mo6620eY(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        if (r4.mo7140f(r13) != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        if (r13 == -9223372036854775807L) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0054 A[SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7136q(android.net.Uri r17, androidx.media3.exoplayer.p151k.C3248n r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            androidx.media3.exoplayer.hls.y[] r2 = r0.f9450c
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L_0x0009:
            if (r6 >= r3) goto L_0x0097
            r8 = r2[r6]
            androidx.media3.exoplayer.hls.l r9 = r8.f9509b
            android.net.Uri[] r9 = r9.f9404d
            boolean r9 = androidx.media3.common.p136b.C2612ak.m6952ab(r9, r1)
            if (r9 != 0) goto L_0x001c
            r12 = r18
        L_0x0019:
            r4 = 1
            goto L_0x0092
        L_0x001c:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L_0x003d
            androidx.media3.exoplayer.k.k r11 = r8.f9487D
            androidx.media3.exoplayer.hls.l r11 = r8.f9509b
            androidx.media3.exoplayer.j.ad r11 = r11.f9416p
            androidx.media3.exoplayer.k.l r11 = androidx.media3.exoplayer.p150j.C3202ai.m9387a(r11)
            r12 = r18
            androidx.media3.exoplayer.k.m r11 = androidx.media3.exoplayer.p151k.C3245k.m9466a(r11, r12)
            if (r11 == 0) goto L_0x003f
            int r13 = r11.f9768a
            r14 = 2
            if (r13 != r14) goto L_0x003f
            long r13 = r11.f9769b
            goto L_0x0040
        L_0x003d:
            r12 = r18
        L_0x003f:
            r13 = r9
        L_0x0040:
            androidx.media3.exoplayer.hls.l r8 = r8.f9509b
            r11 = 0
        L_0x0043:
            android.net.Uri[] r15 = r8.f9404d
            int r4 = r15.length
            r5 = -1
            if (r11 >= r4) goto L_0x0054
            r4 = r15[r11]
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0055
            int r11 = r11 + 1
            goto L_0x0043
        L_0x0054:
            r11 = -1
        L_0x0055:
            if (r11 != r5) goto L_0x0058
            goto L_0x008c
        L_0x0058:
            androidx.media3.exoplayer.j.ad r4 = r8.f9416p
            int r4 = r4.mo7029h(r11)
            if (r4 == r5) goto L_0x008c
            boolean r5 = r8.f9418r
            android.net.Uri r11 = r8.f9414n
            boolean r11 = r1.equals(r11)
            r5 = r5 | r11
            r8.f9418r = r5
            int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x008c
            androidx.media3.exoplayer.j.ad r5 = r8.f9416p
            boolean r4 = r5.mo7039q(r4, r13)
            if (r4 == 0) goto L_0x0091
            androidx.media3.exoplayer.hls.a.y r4 = r8.f9406f
            androidx.media3.exoplayer.hls.a.e r4 = (androidx.media3.exoplayer.hls.p148a.C3137e) r4
            java.util.HashMap r4 = r4.f9239b
            java.lang.Object r4 = r4.get(r1)
            androidx.media3.exoplayer.hls.a.d r4 = (androidx.media3.exoplayer.hls.p148a.C3136d) r4
            if (r4 == 0) goto L_0x0091
            boolean r4 = r4.mo7140f(r13)
            if (r4 == 0) goto L_0x008c
            goto L_0x0091
        L_0x008c:
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0091
            goto L_0x0019
        L_0x0091:
            r4 = 0
        L_0x0092:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L_0x0009
        L_0x0097:
            androidx.media3.exoplayer.h.ap r1 = r0.f9449b
            r1.mo6617b(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.C3177q.mo7136q(android.net.Uri, androidx.media3.exoplayer.k.n, boolean):boolean");
    }

    /* renamed from: r */
    public final void mo7174r() {
        this.f9449b.mo6617b(this);
    }

    /* renamed from: s */
    private static C2680x m9261s(C2680x xVar, C2680x xVar2, boolean z) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        Metadata metadata;
        String str3;
        int i4 = -1;
        if (xVar2 != null) {
            str3 = xVar2.f7493k;
            metadata = xVar2.f7494l;
            i3 = xVar2.f7477A;
            i2 = xVar2.f7488f;
            i = xVar2.f7489g;
            str2 = xVar2.f7487e;
            str = xVar2.f7486d;
        } else {
            str3 = C2612ak.m6931N(xVar.f7493k, 1);
            metadata = xVar.f7494l;
            if (z) {
                i3 = xVar.f7477A;
                i2 = xVar.f7488f;
                i = xVar.f7489g;
                str2 = xVar.f7487e;
                str = xVar.f7486d;
            } else {
                str2 = null;
                i2 = 0;
                str = null;
                i3 = -1;
                i = 0;
            }
        }
        String f = C2598ay.m6807f(str3);
        int i5 = z ? xVar.f7490h : -1;
        if (z) {
            i4 = xVar.f7491i;
        }
        C2679w wVar = new C2679w();
        wVar.f7449a = xVar.f7485c;
        wVar.f7450b = str;
        wVar.f7458j = xVar.f7495m;
        wVar.f7459k = f;
        wVar.f7456h = str3;
        wVar.f7457i = metadata;
        wVar.f7454f = i5;
        wVar.f7455g = i4;
        wVar.f7472x = i3;
        wVar.f7452d = i2;
        wVar.f7453e = i;
        wVar.f7451c = str2;
        return new C2680x(wVar);
    }
}
