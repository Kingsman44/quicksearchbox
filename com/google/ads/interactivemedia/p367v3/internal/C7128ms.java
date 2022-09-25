package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ms */
/* compiled from: PG */
public final class C7128ms implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f22963a = 0;

    /* renamed from: b */
    private static final byte[] f22964b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: c */
    private static final C6864cy f22965c;

    /* renamed from: A */
    private long f22966A;

    /* renamed from: B */
    private C7127mr f22967B;

    /* renamed from: C */
    private int f22968C;

    /* renamed from: D */
    private int f22969D;

    /* renamed from: E */
    private int f22970E;

    /* renamed from: F */
    private boolean f22971F;

    /* renamed from: G */
    private C7056ka f22972G;

    /* renamed from: H */
    private C7073kr[] f22973H;

    /* renamed from: I */
    private C7073kr[] f22974I;

    /* renamed from: J */
    private boolean f22975J;

    /* renamed from: d */
    private final int f22976d;

    /* renamed from: e */
    private final List f22977e;

    /* renamed from: f */
    private final SparseArray f22978f;

    /* renamed from: g */
    private final aee f22979g;

    /* renamed from: h */
    private final aee f22980h;

    /* renamed from: i */
    private final aee f22981i;

    /* renamed from: j */
    private final byte[] f22982j;

    /* renamed from: k */
    private final aee f22983k;

    /* renamed from: l */
    private final aes f22984l;

    /* renamed from: m */
    private final C7249re f22985m;

    /* renamed from: n */
    private final aee f22986n;

    /* renamed from: o */
    private final ArrayDeque f22987o;

    /* renamed from: p */
    private final ArrayDeque f22988p;

    /* renamed from: q */
    private final C7073kr f22989q;

    /* renamed from: r */
    private int f22990r;

    /* renamed from: s */
    private int f22991s;

    /* renamed from: t */
    private long f22992t;

    /* renamed from: u */
    private int f22993u;

    /* renamed from: v */
    private aee f22994v;

    /* renamed from: w */
    private long f22995w;

    /* renamed from: x */
    private int f22996x;

    /* renamed from: y */
    private long f22997y;

    /* renamed from: z */
    private long f22998z;

    static {
        int i = C7125mp.f22948b;
        C6863cx cxVar = new C6863cx();
        cxVar.mo15630ae("application/x-emsg");
        f22965c = cxVar.mo15625a();
    }

    public C7128ms() {
        this((byte[]) null);
    }

    /* renamed from: a */
    private final void m21167a() {
        this.f22990r = 0;
        this.f22993u = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: com.google.ads.interactivemedia.v3.internal.mr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21168b(long r47) {
        /*
            r46 = this;
            r0 = r46
        L_0x0002:
            java.util.ArrayDeque r1 = r0.f22987o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0742
            java.util.ArrayDeque r1 = r0.f22987o
            java.lang.Object r1 = r1.peek()
            com.google.ads.interactivemedia.v3.internal.mc r1 = (com.google.ads.interactivemedia.p367v3.internal.C7112mc) r1
            long r1 = r1.f22907a
            int r3 = (r1 > r47 ? 1 : (r1 == r47 ? 0 : -1))
            if (r3 != 0) goto L_0x0742
            java.util.ArrayDeque r1 = r0.f22987o
            java.lang.Object r1 = r1.pop()
            r2 = r1
            com.google.ads.interactivemedia.v3.internal.mc r2 = (com.google.ads.interactivemedia.p367v3.internal.C7112mc) r2
            int r1 = r2.f22911d
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r6 = 12
            r7 = 8
            r9 = 1
            if (r1 != r3) goto L_0x0143
            java.lang.String r1 = "Unexpected moov box."
            com.google.ads.interactivemedia.p367v3.internal.ary.m19465r(r9, r1)
            java.util.List r1 = r2.f22908b
            com.google.ads.interactivemedia.v3.internal.jc r1 = m21170i(r1)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            com.google.ads.interactivemedia.v3.internal.mc r3 = r2.mo16170d(r3)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r3)
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            java.util.List r8 = r3.f22908b
            int r8 = r8.size()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
        L_0x0053:
            if (r12 >= r8) goto L_0x00bf
            java.util.List r13 = r3.f22908b
            java.lang.Object r13 = r13.get(r12)
            com.google.ads.interactivemedia.v3.internal.md r13 = (com.google.ads.interactivemedia.p367v3.internal.C7113md) r13
            int r14 = r13.f22911d
            r15 = 1953654136(0x74726578, float:7.6818474E31)
            if (r14 != r15) goto L_0x009c
            com.google.ads.interactivemedia.v3.internal.aee r13 = r13.f22910a
            r13.mo14554h(r6)
            int r14 = r13.mo14568v()
            int r15 = r13.mo14568v()
            int r6 = r13.mo14568v()
            int r10 = r13.mo14568v()
            int r13 = r13.mo14568v()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            com.google.ads.interactivemedia.v3.internal.mm r9 = new com.google.ads.interactivemedia.v3.internal.mm
            int r15 = r15 + -1
            r9.<init>(r15, r6, r10, r13)
            android.util.Pair r6 = android.util.Pair.create(r14, r9)
            java.lang.Object r9 = r6.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r6 = r6.second
            com.google.ads.interactivemedia.v3.internal.mm r6 = (com.google.ads.interactivemedia.p367v3.internal.C7122mm) r6
            r11.put(r9, r6)
            goto L_0x00b9
        L_0x009c:
            r6 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r14 != r6) goto L_0x00b9
            com.google.ads.interactivemedia.v3.internal.aee r4 = r13.f22910a
            r4.mo14554h(r7)
            int r5 = r4.mo14568v()
            int r5 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r5)
            if (r5 != 0) goto L_0x00b5
            long r4 = r4.mo14566t()
            goto L_0x00b9
        L_0x00b5:
            long r4 = r4.mo14540D()
        L_0x00b9:
            int r12 = r12 + 1
            r6 = 12
            r9 = 1
            goto L_0x0053
        L_0x00bf:
            com.google.ads.interactivemedia.v3.internal.ki r3 = new com.google.ads.interactivemedia.v3.internal.ki
            r3.<init>()
            com.google.ads.interactivemedia.v3.internal.mo r8 = new com.google.ads.interactivemedia.v3.internal.mo
            r8.<init>()
            r7 = 0
            r6 = r1
            java.util.List r1 = com.google.ads.interactivemedia.p367v3.internal.C7121ml.m21148c(r2, r3, r4, r6, r7, r8)
            int r2 = r1.size()
            android.util.SparseArray r3 = r0.f22978f
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0114
            r10 = 0
        L_0x00dc:
            if (r10 >= r2) goto L_0x010d
            java.lang.Object r3 = r1.get(r10)
            com.google.ads.interactivemedia.v3.internal.ne r3 = (com.google.ads.interactivemedia.p367v3.internal.C7141ne) r3
            com.google.ads.interactivemedia.v3.internal.nb r4 = r3.f23068a
            com.google.ads.interactivemedia.v3.internal.mr r5 = new com.google.ads.interactivemedia.v3.internal.mr
            com.google.ads.interactivemedia.v3.internal.ka r6 = r0.f22972G
            int r7 = r4.f23034b
            com.google.ads.interactivemedia.v3.internal.kr r6 = r6.mo16113ak(r10, r7)
            int r7 = r4.f23033a
            com.google.ads.interactivemedia.v3.internal.mm r7 = m21172k(r11, r7)
            r5.<init>(r6, r3, r7)
            android.util.SparseArray r3 = r0.f22978f
            int r6 = r4.f23033a
            r3.put(r6, r5)
            long r5 = r0.f22998z
            long r3 = r4.f23037e
            long r3 = java.lang.Math.max(r5, r3)
            r0.f22998z = r3
            int r10 = r10 + 1
            goto L_0x00dc
        L_0x010d:
            com.google.ads.interactivemedia.v3.internal.ka r1 = r0.f22972G
            r1.mo16114al()
            goto L_0x0002
        L_0x0114:
            android.util.SparseArray r3 = r0.f22978f
            int r3 = r3.size()
            if (r3 != r2) goto L_0x011e
            r9 = 1
            goto L_0x011f
        L_0x011e:
            r9 = 0
        L_0x011f:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r9)
            r10 = 0
        L_0x0123:
            if (r10 >= r2) goto L_0x0002
            java.lang.Object r3 = r1.get(r10)
            com.google.ads.interactivemedia.v3.internal.ne r3 = (com.google.ads.interactivemedia.p367v3.internal.C7141ne) r3
            com.google.ads.interactivemedia.v3.internal.nb r4 = r3.f23068a
            android.util.SparseArray r5 = r0.f22978f
            int r6 = r4.f23033a
            java.lang.Object r5 = r5.get(r6)
            com.google.ads.interactivemedia.v3.internal.mr r5 = (com.google.ads.interactivemedia.p367v3.internal.C7127mr) r5
            int r4 = r4.f23033a
            com.google.ads.interactivemedia.v3.internal.mm r4 = m21172k(r11, r4)
            r5.mo16176a(r3, r4)
            int r10 = r10 + 1
            goto L_0x0123
        L_0x0143:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 != r3) goto L_0x072a
            android.util.SparseArray r1 = r0.f22978f
            int r3 = r0.f22976d
            byte[] r6 = r0.f22982j
            java.util.List r8 = r2.f22909c
            int r8 = r8.size()
            r9 = 0
        L_0x0155:
            if (r9 >= r8) goto L_0x0695
            java.util.List r11 = r2.f22909c
            java.lang.Object r11 = r11.get(r9)
            com.google.ads.interactivemedia.v3.internal.mc r11 = (com.google.ads.interactivemedia.p367v3.internal.C7112mc) r11
            int r12 = r11.f22911d
            r13 = 1953653094(0x74726166, float:7.6813435E31)
            if (r12 != r13) goto L_0x0675
            r12 = 1952868452(0x74666864, float:7.301914E31)
            com.google.ads.interactivemedia.v3.internal.md r12 = r11.mo16169c(r12)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r12)
            com.google.ads.interactivemedia.v3.internal.aee r12 = r12.f22910a
            r12.mo14554h(r7)
            int r13 = r12.mo14568v()
            int r13 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21131f(r13)
            int r14 = r12.mo14568v()
            int r15 = r1.size()
            r10 = 1
            if (r15 != r10) goto L_0x0190
            r10 = 0
            java.lang.Object r14 = r1.valueAt(r10)
            com.google.ads.interactivemedia.v3.internal.mr r14 = (com.google.ads.interactivemedia.p367v3.internal.C7127mr) r14
            goto L_0x0197
        L_0x0190:
            java.lang.Object r10 = r1.get(r14)
            r14 = r10
            com.google.ads.interactivemedia.v3.internal.mr r14 = (com.google.ads.interactivemedia.p367v3.internal.C7127mr) r14
        L_0x0197:
            if (r14 != 0) goto L_0x019b
            r14 = 0
            goto L_0x01e2
        L_0x019b:
            r10 = r13 & 1
            if (r10 == 0) goto L_0x01a9
            long r4 = r12.mo14540D()
            com.google.ads.interactivemedia.v3.internal.nd r10 = r14.f22952b
            r10.f23051c = r4
            r10.f23052d = r4
        L_0x01a9:
            com.google.ads.interactivemedia.v3.internal.mm r4 = r14.f22955e
            r5 = r13 & 2
            if (r5 == 0) goto L_0x01b6
            int r5 = r12.mo14568v()
            int r5 = r5 + -1
            goto L_0x01b8
        L_0x01b6:
            int r5 = r4.f22937a
        L_0x01b8:
            r10 = r13 & 8
            if (r10 == 0) goto L_0x01c1
            int r10 = r12.mo14568v()
            goto L_0x01c3
        L_0x01c1:
            int r10 = r4.f22938b
        L_0x01c3:
            r15 = r13 & 16
            if (r15 == 0) goto L_0x01cc
            int r15 = r12.mo14568v()
            goto L_0x01ce
        L_0x01cc:
            int r15 = r4.f22939c
        L_0x01ce:
            r13 = r13 & 32
            if (r13 == 0) goto L_0x01d7
            int r4 = r12.mo14568v()
            goto L_0x01d9
        L_0x01d7:
            int r4 = r4.f22940d
        L_0x01d9:
            com.google.ads.interactivemedia.v3.internal.nd r12 = r14.f22952b
            com.google.ads.interactivemedia.v3.internal.mm r13 = new com.google.ads.interactivemedia.v3.internal.mm
            r13.<init>(r5, r10, r15, r4)
            r12.f23049a = r13
        L_0x01e2:
            if (r14 != 0) goto L_0x01e6
            goto L_0x0675
        L_0x01e6:
            com.google.ads.interactivemedia.v3.internal.nd r4 = r14.f22952b
            long r12 = r4.f23066r
            boolean r5 = r4.f23067s
            r14.mo16177b()
            r14.f22962l = true
            r10 = 1952867444(0x74666474, float:7.3014264E31)
            com.google.ads.interactivemedia.v3.internal.md r10 = r11.mo16169c(r10)
            if (r10 == 0) goto L_0x0220
            r15 = r3 & 2
            if (r15 != 0) goto L_0x0220
            com.google.ads.interactivemedia.v3.internal.aee r5 = r10.f22910a
            r5.mo14554h(r7)
            int r10 = r5.mo14568v()
            int r10 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r10)
            r12 = 1
            if (r10 != r12) goto L_0x0214
            long r16 = r5.mo14540D()
            goto L_0x0218
        L_0x0214:
            long r16 = r5.mo14566t()
        L_0x0218:
            r15 = r8
            r7 = r16
            r4.f23066r = r7
            r4.f23067s = r12
            goto L_0x0225
        L_0x0220:
            r15 = r8
            r4.f23066r = r12
            r4.f23067s = r5
        L_0x0225:
            java.util.List r5 = r11.f22908b
            int r7 = r5.size()
            r8 = 0
            r12 = 0
            r13 = 0
        L_0x022e:
            r10 = 1953658222(0x7472756e, float:7.683823E31)
            if (r8 >= r7) goto L_0x025a
            java.lang.Object r17 = r5.get(r8)
            r18 = r1
            r1 = r17
            com.google.ads.interactivemedia.v3.internal.md r1 = (com.google.ads.interactivemedia.p367v3.internal.C7113md) r1
            r17 = r15
            int r15 = r1.f22911d
            if (r15 != r10) goto L_0x0253
            com.google.ads.interactivemedia.v3.internal.aee r1 = r1.f22910a
            r10 = 12
            r1.mo14554h(r10)
            int r1 = r1.mo14538B()
            if (r1 <= 0) goto L_0x0253
            int r13 = r13 + r1
            int r12 = r12 + 1
        L_0x0253:
            int r8 = r8 + 1
            r15 = r17
            r1 = r18
            goto L_0x022e
        L_0x025a:
            r18 = r1
            r17 = r15
            r1 = 0
            r14.f22958h = r1
            r14.f22957g = r1
            r14.f22956f = r1
            com.google.ads.interactivemedia.v3.internal.nd r1 = r14.f22952b
            r1.f23053e = r12
            r1.f23054f = r13
            int[] r8 = r1.f23056h
            int r8 = r8.length
            if (r8 >= r12) goto L_0x0278
            long[] r8 = new long[r12]
            r1.f23055g = r8
            int[] r8 = new int[r12]
            r1.f23056h = r8
        L_0x0278:
            int[] r8 = r1.f23057i
            int r8 = r8.length
            if (r8 >= r13) goto L_0x0295
            int r13 = r13 * 125
            int r13 = r13 / 100
            int[] r8 = new int[r13]
            r1.f23057i = r8
            int[] r8 = new int[r13]
            r1.f23058j = r8
            long[] r8 = new long[r13]
            r1.f23059k = r8
            boolean[] r8 = new boolean[r13]
            r1.f23060l = r8
            boolean[] r8 = new boolean[r13]
            r1.f23062n = r8
        L_0x0295:
            r1 = 0
            r8 = 0
            r12 = 0
        L_0x0298:
            r19 = 0
            if (r1 >= r7) goto L_0x0444
            java.lang.Object r21 = r5.get(r1)
            r15 = r21
            com.google.ads.interactivemedia.v3.internal.md r15 = (com.google.ads.interactivemedia.p367v3.internal.C7113md) r15
            int r13 = r15.f22911d
            if (r13 != r10) goto L_0x0415
            int r13 = r12 + 1
            com.google.ads.interactivemedia.v3.internal.aee r15 = r15.f22910a
            r10 = 8
            r15.mo14554h(r10)
            int r16 = r15.mo14568v()
            int r10 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21131f(r16)
            r16 = r5
            com.google.ads.interactivemedia.v3.internal.ne r5 = r14.f22954d
            com.google.ads.interactivemedia.v3.internal.nb r5 = r5.f23068a
            r22 = r7
            com.google.ads.interactivemedia.v3.internal.nd r7 = r14.f22952b
            r23 = r13
            com.google.ads.interactivemedia.v3.internal.mm r13 = r7.f23049a
            int r24 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            int[] r0 = r7.f23056h
            int r24 = r15.mo14538B()
            r0[r12] = r24
            long[] r0 = r7.f23055g
            r25 = r1
            r24 = r2
            long r1 = r7.f23051c
            r0[r12] = r1
            r26 = r10 & 1
            if (r26 == 0) goto L_0x02ec
            r26 = r9
            int r9 = r15.mo14568v()
            r27 = r8
            long r8 = (long) r9
            long r1 = r1 + r8
            r0[r12] = r1
            goto L_0x02f0
        L_0x02ec:
            r27 = r8
            r26 = r9
        L_0x02f0:
            r0 = r10 & 4
            int r1 = r13.f22940d
            if (r0 == 0) goto L_0x02fa
            int r1 = r15.mo14568v()
        L_0x02fa:
            r2 = r10 & 256(0x100, float:3.59E-43)
            r8 = r10 & 512(0x200, float:7.175E-43)
            r9 = r10 & 1024(0x400, float:1.435E-42)
            r10 = r10 & 2048(0x800, float:2.87E-42)
            r28 = r1
            long[] r1 = r5.f23040h
            if (r1 == 0) goto L_0x0330
            r29 = r6
            int r6 = r1.length
            r30 = r11
            r11 = 1
            if (r6 != r11) goto L_0x032e
            r6 = 0
            r31 = r1[r6]
            int r1 = (r31 > r19 ? 1 : (r31 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x032e
            long[] r1 = r5.f23041i
            java.lang.Object r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18536f(r1)
            long[] r1 = (long[]) r1
            r31 = r1[r6]
            r33 = 1000000(0xf4240, double:4.940656E-318)
            r1 = r10
            long r10 = r5.f23035c
            r35 = r10
            long r19 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r31, r33, r35)
            goto L_0x0335
        L_0x032e:
            r1 = r10
            goto L_0x0335
        L_0x0330:
            r29 = r6
            r1 = r10
            r30 = r11
        L_0x0335:
            int[] r6 = r7.f23057i
            int[] r10 = r7.f23058j
            long[] r11 = r7.f23059k
            r31 = r4
            boolean[] r4 = r7.f23060l
            r32 = r4
            int r4 = r5.f23034b
            r33 = r6
            r6 = 2
            if (r4 != r6) goto L_0x034e
            r4 = r3 & 1
            if (r4 == 0) goto L_0x034e
            r4 = 1
            goto L_0x034f
        L_0x034e:
            r4 = 0
        L_0x034f:
            int[] r6 = r7.f23056h
            r6 = r6[r12]
            int r6 = r27 + r6
            r40 = r3
            r21 = r4
            long r3 = r5.f23035c
            r5 = r11
            long r11 = r7.f23066r
            r41 = r14
            r14 = r27
        L_0x0362:
            if (r14 >= r6) goto L_0x040a
            if (r2 == 0) goto L_0x036f
            int r27 = r15.mo14568v()
            r42 = r2
            r2 = r27
            goto L_0x0373
        L_0x036f:
            r42 = r2
            int r2 = r13.f22938b
        L_0x0373:
            m21171j(r2)
            if (r8 == 0) goto L_0x037f
            int r27 = r15.mo14568v()
            r43 = r6
            goto L_0x0385
        L_0x037f:
            r43 = r6
            int r6 = r13.f22939c
            r27 = r6
        L_0x0385:
            m21171j(r27)
            if (r9 == 0) goto L_0x038f
            int r6 = r15.mo14568v()
            goto L_0x039a
        L_0x038f:
            if (r14 != 0) goto L_0x0398
            if (r0 == 0) goto L_0x0397
            r6 = r28
            r14 = 0
            goto L_0x039a
        L_0x0397:
            r14 = 0
        L_0x0398:
            int r6 = r13.f22940d
        L_0x039a:
            if (r1 == 0) goto L_0x03af
            r44 = r0
            int r0 = r15.mo14568v()
            r45 = r1
            long r0 = (long) r0
            r34 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r34
            long r0 = r0 / r3
            int r1 = (int) r0
            r10[r14] = r1
            goto L_0x03b6
        L_0x03af:
            r44 = r0
            r45 = r1
            r0 = 0
            r10[r14] = r0
        L_0x03b6:
            r36 = 1000000(0xf4240, double:4.940656E-318)
            r34 = r11
            r38 = r3
            long r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r34, r36, r38)
            long r0 = r0 - r19
            r5[r14] = r0
            r34 = r3
            boolean r3 = r7.f23067s
            if (r3 != 0) goto L_0x03d9
            r3 = r41
            com.google.ads.interactivemedia.v3.internal.ne r4 = r3.f22954d
            r36 = r8
            r37 = r9
            long r8 = r4.f23075h
            long r0 = r0 + r8
            r5[r14] = r0
            goto L_0x03df
        L_0x03d9:
            r36 = r8
            r37 = r9
            r3 = r41
        L_0x03df:
            r33[r14] = r27
            r0 = 16
            int r1 = r6 >> 16
            r0 = 1
            r1 = r1 & r0
            if (r1 != 0) goto L_0x03f2
            if (r21 == 0) goto L_0x03f0
            if (r14 != 0) goto L_0x03f2
            r1 = 1
            r14 = 0
            goto L_0x03f3
        L_0x03f0:
            r1 = 1
            goto L_0x03f3
        L_0x03f2:
            r1 = 0
        L_0x03f3:
            r32[r14] = r1
            long r1 = (long) r2
            long r11 = r11 + r1
            int r14 = r14 + r0
            r41 = r3
            r3 = r34
            r8 = r36
            r9 = r37
            r2 = r42
            r6 = r43
            r0 = r44
            r1 = r45
            goto L_0x0362
        L_0x040a:
            r43 = r6
            r3 = r41
            r7.f23066r = r11
            r12 = r23
            r8 = r43
            goto L_0x042a
        L_0x0415:
            r25 = r1
            r24 = r2
            r40 = r3
            r31 = r4
            r16 = r5
            r29 = r6
            r22 = r7
            r27 = r8
            r26 = r9
            r30 = r11
            r3 = r14
        L_0x042a:
            int r1 = r25 + 1
            r0 = r46
            r14 = r3
            r5 = r16
            r7 = r22
            r2 = r24
            r9 = r26
            r6 = r29
            r11 = r30
            r4 = r31
            r3 = r40
            r10 = 1953658222(0x7472756e, float:7.683823E31)
            goto L_0x0298
        L_0x0444:
            r24 = r2
            r40 = r3
            r31 = r4
            r29 = r6
            r26 = r9
            r30 = r11
            r3 = r14
            com.google.ads.interactivemedia.v3.internal.ne r0 = r3.f22954d
            com.google.ads.interactivemedia.v3.internal.nb r0 = r0.f23068a
            r1 = r31
            com.google.ads.interactivemedia.v3.internal.mm r2 = r1.f23049a
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)
            int r2 = r2.f22937a
            com.google.ads.interactivemedia.v3.internal.nc r0 = r0.mo16187a(r2)
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            com.google.ads.interactivemedia.v3.internal.md r2 = r11.mo16169c(r2)
            if (r2 == 0) goto L_0x04e6
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r0)
            com.google.ads.interactivemedia.v3.internal.aee r2 = r2.f22910a
            int r3 = r0.f23047d
            r4 = 8
            r2.mo14554h(r4)
            int r5 = r2.mo14568v()
            int r5 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21131f(r5)
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0486
            r2.mo14557k(r4)
        L_0x0486:
            int r4 = r2.mo14560n()
            int r5 = r2.mo14538B()
            int r6 = r1.f23054f
            if (r5 > r6) goto L_0x04c5
            if (r4 != 0) goto L_0x04ab
            boolean[] r4 = r1.f23062n
            r6 = 0
            r7 = 0
        L_0x0498:
            if (r6 >= r5) goto L_0x04a9
            int r8 = r2.mo14560n()
            int r7 = r7 + r8
            if (r8 <= r3) goto L_0x04a3
            r8 = 1
            goto L_0x04a4
        L_0x04a3:
            r8 = 0
        L_0x04a4:
            r4[r6] = r8
            int r6 = r6 + 1
            goto L_0x0498
        L_0x04a9:
            r4 = 0
            goto L_0x04b8
        L_0x04ab:
            if (r4 <= r3) goto L_0x04af
            r2 = 1
            goto L_0x04b0
        L_0x04af:
            r2 = 0
        L_0x04b0:
            int r7 = r4 * r5
            boolean[] r3 = r1.f23062n
            r4 = 0
            java.util.Arrays.fill(r3, r4, r5, r2)
        L_0x04b8:
            boolean[] r2 = r1.f23062n
            int r3 = r1.f23054f
            java.util.Arrays.fill(r2, r5, r3, r4)
            if (r7 <= 0) goto L_0x04e6
            r1.mo16188a(r7)
            goto L_0x04e6
        L_0x04c5:
            com.google.ads.interactivemedia.v3.internal.dt r0 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 78
            r1.<init>(r2)
            java.lang.String r2 = "Saiz sample count "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " is greater than fragment sample count"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04e6:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            com.google.ads.interactivemedia.v3.internal.md r2 = r11.mo16169c(r2)
            if (r2 == 0) goto L_0x0539
            com.google.ads.interactivemedia.v3.internal.aee r2 = r2.f22910a
            r3 = 8
            r2.mo14554h(r3)
            int r4 = r2.mo14568v()
            int r5 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21131f(r4)
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0505
            r2.mo14557k(r3)
        L_0x0505:
            int r3 = r2.mo14538B()
            if (r3 != r6) goto L_0x0520
            long r5 = r1.f23052d
            int r3 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r4)
            if (r3 != 0) goto L_0x0518
            long r2 = r2.mo14566t()
            goto L_0x051c
        L_0x0518:
            long r2 = r2.mo14540D()
        L_0x051c:
            long r5 = r5 + r2
            r1.f23052d = r5
            goto L_0x0539
        L_0x0520:
            com.google.ads.interactivemedia.v3.internal.dt r0 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 40
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected saio entry count: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0539:
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            com.google.ads.interactivemedia.v3.internal.md r2 = r11.mo16169c(r2)
            if (r2 == 0) goto L_0x0548
            com.google.ads.interactivemedia.v3.internal.aee r2 = r2.f22910a
            r3 = 0
            m21169c(r2, r3, r1)
        L_0x0548:
            if (r0 == 0) goto L_0x054e
            java.lang.String r0 = r0.f23045b
            r4 = r0
            goto L_0x054f
        L_0x054e:
            r4 = 0
        L_0x054f:
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x0552:
            java.util.List r5 = r11.f22908b
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x058f
            java.util.List r5 = r11.f22908b
            java.lang.Object r5 = r5.get(r0)
            com.google.ads.interactivemedia.v3.internal.md r5 = (com.google.ads.interactivemedia.p367v3.internal.C7113md) r5
            com.google.ads.interactivemedia.v3.internal.aee r6 = r5.f22910a
            int r5 = r5.f22911d
            r7 = 1935828848(0x73626770, float:1.7937577E31)
            r8 = 1936025959(0x73656967, float:1.817587E31)
            if (r5 != r7) goto L_0x057b
            r12 = 12
            r6.mo14554h(r12)
            int r5 = r6.mo14568v()
            if (r5 != r8) goto L_0x058c
            r2 = r6
            goto L_0x058c
        L_0x057b:
            r12 = 12
            r7 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 != r7) goto L_0x058c
            r6.mo14554h(r12)
            int r5 = r6.mo14568v()
            if (r5 != r8) goto L_0x058c
            r3 = r6
        L_0x058c:
            int r0 = r0 + 1
            goto L_0x0552
        L_0x058f:
            r12 = 12
            if (r2 == 0) goto L_0x062f
            if (r3 != 0) goto L_0x0597
            goto L_0x062f
        L_0x0597:
            r0 = 8
            r2.mo14554h(r0)
            int r5 = r2.mo14568v()
            r6 = 4
            r2.mo14557k(r6)
            int r5 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r5)
            r7 = 1
            if (r5 != r7) goto L_0x05ae
            r2.mo14557k(r6)
        L_0x05ae:
            int r2 = r2.mo14568v()
            if (r2 != r7) goto L_0x0627
            r3.mo14554h(r0)
            int r0 = r3.mo14568v()
            int r0 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r0)
            r3.mo14557k(r6)
            if (r0 != r7) goto L_0x05d5
            long r7 = r3.mo14566t()
            int r0 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x05cd
            goto L_0x05db
        L_0x05cd:
            com.google.ads.interactivemedia.v3.internal.dt r0 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r1 = "Variable length description in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05d5:
            r2 = 2
            if (r0 < r2) goto L_0x05db
            r3.mo14557k(r6)
        L_0x05db:
            long r7 = r3.mo14566t()
            r13 = 1
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x061f
            r0 = 1
            r3.mo14557k(r0)
            int r2 = r3.mo14560n()
            r5 = r2 & 240(0xf0, float:3.36E-43)
            int r7 = r5 >> 4
            r8 = r2 & 15
            int r2 = r3.mo14560n()
            if (r2 != r0) goto L_0x0630
            int r5 = r3.mo14560n()
            r2 = 16
            byte[] r6 = new byte[r2]
            r9 = 0
            r3.mo14559m(r6, r9, r2)
            if (r5 != 0) goto L_0x0612
            int r2 = r3.mo14560n()
            byte[] r13 = new byte[r2]
            r3.mo14559m(r13, r9, r2)
            r9 = r13
            goto L_0x0613
        L_0x0612:
            r9 = 0
        L_0x0613:
            r1.f23061m = r0
            com.google.ads.interactivemedia.v3.internal.nc r13 = new com.google.ads.interactivemedia.v3.internal.nc
            r3 = 1
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.f23063o = r13
            goto L_0x0630
        L_0x061f:
            com.google.ads.interactivemedia.v3.internal.dt r0 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0627:
            com.google.ads.interactivemedia.v3.internal.dt r0 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x062f:
            r0 = 1
        L_0x0630:
            java.util.List r2 = r11.f22908b
            int r2 = r2.size()
            r3 = 0
        L_0x0637:
            if (r3 >= r2) goto L_0x066f
            java.util.List r4 = r11.f22908b
            java.lang.Object r4 = r4.get(r3)
            com.google.ads.interactivemedia.v3.internal.md r4 = (com.google.ads.interactivemedia.p367v3.internal.C7113md) r4
            int r5 = r4.f22911d
            r6 = 1970628964(0x75756964, float:3.1109627E32)
            if (r5 != r6) goto L_0x0663
            com.google.ads.interactivemedia.v3.internal.aee r4 = r4.f22910a
            r5 = 8
            r4.mo14554h(r5)
            r6 = r29
            r7 = 16
            r10 = 0
            r4.mo14559m(r6, r10, r7)
            byte[] r8 = f22964b
            boolean r8 = java.util.Arrays.equals(r6, r8)
            if (r8 == 0) goto L_0x066a
            m21169c(r4, r7, r1)
            goto L_0x066a
        L_0x0663:
            r6 = r29
            r5 = 8
            r7 = 16
            r10 = 0
        L_0x066a:
            int r3 = r3 + 1
            r29 = r6
            goto L_0x0637
        L_0x066f:
            r6 = r29
            r5 = 8
            r10 = 0
            goto L_0x0685
        L_0x0675:
            r18 = r1
            r24 = r2
            r40 = r3
            r17 = r8
            r26 = r9
            r0 = 1
            r5 = 8
            r10 = 0
            r12 = 12
        L_0x0685:
            int r9 = r26 + 1
            r7 = 8
            r0 = r46
            r8 = r17
            r1 = r18
            r2 = r24
            r3 = r40
            goto L_0x0155
        L_0x0695:
            r1 = r2
            r10 = 0
            java.util.List r0 = r1.f22908b
            com.google.ads.interactivemedia.v3.internal.jc r0 = m21170i(r0)
            r2 = r46
            if (r0 == 0) goto L_0x06e5
            android.util.SparseArray r1 = r2.f22978f
            int r1 = r1.size()
            r3 = 0
        L_0x06a8:
            if (r3 >= r1) goto L_0x06e5
            android.util.SparseArray r4 = r2.f22978f
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.ads.interactivemedia.v3.internal.mr r4 = (com.google.ads.interactivemedia.p367v3.internal.C7127mr) r4
            com.google.ads.interactivemedia.v3.internal.ne r5 = r4.f22954d
            com.google.ads.interactivemedia.v3.internal.nb r5 = r5.f23068a
            com.google.ads.interactivemedia.v3.internal.nd r6 = r4.f22952b
            com.google.ads.interactivemedia.v3.internal.mm r6 = r6.f23049a
            int r7 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            int r6 = r6.f22937a
            com.google.ads.interactivemedia.v3.internal.nc r5 = r5.mo16187a(r6)
            if (r5 == 0) goto L_0x06c7
            java.lang.String r5 = r5.f23045b
            goto L_0x06c8
        L_0x06c7:
            r5 = 0
        L_0x06c8:
            com.google.ads.interactivemedia.v3.internal.jc r5 = r0.mo16061b(r5)
            com.google.ads.interactivemedia.v3.internal.ne r6 = r4.f22954d
            com.google.ads.interactivemedia.v3.internal.nb r6 = r6.f23068a
            com.google.ads.interactivemedia.v3.internal.cy r6 = r6.f23038f
            com.google.ads.interactivemedia.v3.internal.cx r6 = r6.mo15636a()
            r6.mo15610L(r5)
            com.google.ads.interactivemedia.v3.internal.cy r5 = r6.mo15625a()
            com.google.ads.interactivemedia.v3.internal.kr r4 = r4.f22951a
            r4.mo16102a(r5)
            int r3 = r3 + 1
            goto L_0x06a8
        L_0x06e5:
            long r0 = r2.f22997y
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x073f
            android.util.SparseArray r0 = r2.f22978f
            int r0 = r0.size()
        L_0x06f6:
            if (r10 >= r0) goto L_0x0722
            android.util.SparseArray r1 = r2.f22978f
            java.lang.Object r1 = r1.valueAt(r10)
            com.google.ads.interactivemedia.v3.internal.mr r1 = (com.google.ads.interactivemedia.p367v3.internal.C7127mr) r1
            long r3 = r2.f22997y
            int r5 = r1.f22956f
        L_0x0704:
            com.google.ads.interactivemedia.v3.internal.nd r6 = r1.f22952b
            int r7 = r6.f23054f
            if (r5 >= r7) goto L_0x071f
            long r6 = r6.mo16189b(r5)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x071f
            com.google.ads.interactivemedia.v3.internal.nd r6 = r1.f22952b
            boolean[] r6 = r6.f23060l
            boolean r6 = r6[r5]
            if (r6 == 0) goto L_0x071c
            r1.f22959i = r5
        L_0x071c:
            int r5 = r5 + 1
            goto L_0x0704
        L_0x071f:
            int r10 = r10 + 1
            goto L_0x06f6
        L_0x0722:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f22997y = r3
            goto L_0x073f
        L_0x072a:
            r1 = r2
            r2 = r0
            java.util.ArrayDeque r0 = r2.f22987o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x073f
            java.util.ArrayDeque r0 = r2.f22987o
            java.lang.Object r0 = r0.peek()
            com.google.ads.interactivemedia.v3.internal.mc r0 = (com.google.ads.interactivemedia.p367v3.internal.C7112mc) r0
            r0.mo16168b(r1)
        L_0x073f:
            r0 = r2
            goto L_0x0002
        L_0x0742:
            r2 = r0
            r46.m21167a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7128ms.m21168b(long):void");
    }

    /* renamed from: c */
    private static void m21169c(aee aee, int i, C7140nd ndVar) {
        aee.mo14554h(i + 8);
        int f = C7114me.m21131f(aee.mo14568v());
        if ((f & 1) == 0) {
            boolean z = (f & 2) != 0;
            int B = aee.mo14538B();
            if (B == 0) {
                Arrays.fill(ndVar.f23062n, 0, ndVar.f23054f, false);
                return;
            }
            int i2 = ndVar.f23054f;
            if (B == i2) {
                Arrays.fill(ndVar.f23062n, 0, B, z);
                ndVar.mo16188a(aee.mo14550d());
                aee.mo14559m(ndVar.f23064p.mo14555i(), 0, ndVar.f23064p.mo14551e());
                ndVar.f23064p.mo14554h(0);
                ndVar.f23065q = false;
                return;
            }
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(B);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw new C6886dt(sb.toString());
        }
        throw new C6886dt("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: i */
    private static C7031jc m21170i(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C7113md mdVar = (C7113md) list.get(i);
            if (mdVar.f22911d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] i2 = mdVar.f22910a.mo14555i();
                UUID c = C7135mz.m21200c(i2);
                if (c == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C7030jb(c, MediaUtilities.MIME_TYPE, i2));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C7031jc((List) arrayList);
    }

    /* renamed from: j */
    private static void m21171j(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unexpected negtive value: ");
            sb.append(i);
            throw new C6886dt(sb.toString());
        }
    }

    /* renamed from: k */
    private static final C7122mm m21172k(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (C7122mm) sparseArray.valueAt(0);
        }
        C7122mm mmVar = (C7122mm) sparseArray.get(i);
        ary.m19467t(mmVar);
        return mmVar;
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        int i;
        this.f22972G = kaVar;
        m21167a();
        C7073kr[] krVarArr = new C7073kr[2];
        this.f22973H = krVarArr;
        C7073kr krVar = this.f22989q;
        int i2 = 0;
        if (krVar != null) {
            krVarArr[0] = krVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f22976d & 4) != 0) {
            krVarArr[i] = this.f22972G.mo16113ak(100, 4);
            i3 = 101;
            i++;
        }
        C7073kr[] krVarArr2 = (C7073kr[]) aeu.m18538h(this.f22973H, i);
        this.f22973H = krVarArr2;
        for (C7073kr a : krVarArr2) {
            a.mo16102a(f22965c);
        }
        this.f22974I = new C7073kr[this.f22977e.size()];
        while (i2 < this.f22974I.length) {
            C7073kr ak = this.f22972G.mo16113ak(i3, 3);
            ak.mo16102a((C6864cy) this.f22977e.get(i2));
            this.f22974I[i2] = ak;
            i2++;
            i3++;
        }
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        int size = this.f22978f.size();
        for (int i = 0; i < size; i++) {
            ((C7127mr) this.f22978f.valueAt(i)).mo16177b();
        }
        this.f22988p.clear();
        this.f22996x = 0;
        this.f22997y = j2;
        this.f22987o.clear();
        m21167a();
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        return C7137na.m21211a(jvVar);
    }

    public C7128ms(int i, aes aes, List list) {
        this(i, aes, list, (C7073kr) null);
    }

    public C7128ms(int i, aes aes, List list, C7073kr krVar) {
        this.f22976d = i;
        this.f22984l = aes;
        this.f22977e = Collections.unmodifiableList(list);
        this.f22989q = krVar;
        this.f22985m = new C7249re();
        this.f22986n = new aee(16);
        this.f22979g = new aee(aec.f20417a);
        this.f22980h = new aee(5);
        this.f22981i = new aee();
        byte[] bArr = new byte[16];
        this.f22982j = bArr;
        this.f22983k = new aee(bArr);
        this.f22987o = new ArrayDeque();
        this.f22988p = new ArrayDeque();
        this.f22978f = new SparseArray();
        this.f22998z = -9223372036854775807L;
        this.f22997y = -9223372036854775807L;
        this.f22966A = -9223372036854775807L;
        this.f22972G = C7056ka.f22595a;
        this.f22973H = new C7073kr[0];
        this.f22974I = new C7073kr[0];
    }

    public C7128ms(byte[] bArr) {
        this(0, (aes) null, Collections.emptyList());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: com.google.ads.interactivemedia.v3.internal.mr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16112h(com.google.ads.interactivemedia.p367v3.internal.C7050jv r29, com.google.ads.interactivemedia.p367v3.internal.C7067kl r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
        L_0x0004:
            int r2 = r0.f22990r
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r6 = 0
            r7 = 8
            r8 = 1
            if (r2 == 0) goto L_0x0523
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r2 == r8) goto L_0x0300
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r5) goto L_0x02a1
            com.google.ads.interactivemedia.v3.internal.mr r2 = r0.f22967B
            if (r2 != 0) goto L_0x0095
            android.util.SparseArray r2 = r0.f22978f
            int r13 = r2.size()
            r14 = r3
            r3 = r6
            r4 = 0
        L_0x002c:
            if (r4 >= r13) goto L_0x0062
            java.lang.Object r16 = r2.valueAt(r4)
            r5 = r16
            com.google.ads.interactivemedia.v3.internal.mr r5 = (com.google.ads.interactivemedia.p367v3.internal.C7127mr) r5
            boolean r16 = r5.f22962l
            if (r16 != 0) goto L_0x0044
            int r11 = r5.f22956f
            com.google.ads.interactivemedia.v3.internal.ne r9 = r5.f22954d
            int r9 = r9.f23069b
            if (r11 == r9) goto L_0x005e
        L_0x0044:
            boolean r9 = r5.f22962l
            if (r9 == 0) goto L_0x0053
            int r9 = r5.f22958h
            com.google.ads.interactivemedia.v3.internal.nd r11 = r5.f22952b
            int r11 = r11.f23053e
            if (r9 != r11) goto L_0x0053
            goto L_0x005e
        L_0x0053:
            long r18 = r5.mo16179d()
            int r9 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r9 >= 0) goto L_0x005e
            r3 = r5
            r14 = r18
        L_0x005e:
            int r4 = r4 + 1
            r5 = 2
            goto L_0x002c
        L_0x0062:
            if (r3 != 0) goto L_0x007d
            long r2 = r0.f22995w
            long r4 = r29.mo16099l()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x0075
            r1.mo16091d(r3)
            r28.m21167a()
            goto L_0x0004
        L_0x0075:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x007d:
            long r4 = r3.mo16179d()
            long r13 = r29.mo16099l()
            long r4 = r4 - r13
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x008f
            java.lang.String r2 = "Ignoring negative offset to sample data."
            android.util.Log.w(r10, r2)
            r2 = 0
        L_0x008f:
            r1.mo16091d(r2)
            r0.f22967B = r3
            r2 = r3
        L_0x0095:
            int r3 = r0.f22990r
            r4 = 6
            if (r3 != r12) goto L_0x012b
            int r3 = r2.mo16180e()
            r0.f22968C = r3
            int r5 = r2.f22956f
            int r9 = r2.f22959i
            if (r5 >= r9) goto L_0x00db
            r1.mo16091d(r3)
            com.google.ads.interactivemedia.v3.internal.nc r1 = r2.mo16184i()
            if (r1 != 0) goto L_0x00b0
            goto L_0x00ce
        L_0x00b0:
            com.google.ads.interactivemedia.v3.internal.nd r3 = r2.f22952b
            com.google.ads.interactivemedia.v3.internal.aee r3 = r3.f23064p
            int r1 = r1.f23047d
            if (r1 == 0) goto L_0x00bb
            r3.mo14557k(r1)
        L_0x00bb:
            com.google.ads.interactivemedia.v3.internal.nd r1 = r2.f22952b
            int r5 = r2.f22956f
            boolean r1 = r1.mo16190c(r5)
            if (r1 == 0) goto L_0x00ce
            int r1 = r3.mo14561o()
            int r1 = r1 * 6
            r3.mo14557k(r1)
        L_0x00ce:
            boolean r1 = r2.mo16182g()
            if (r1 != 0) goto L_0x00d6
            r0.f22967B = r6
        L_0x00d6:
            r0.f22990r = r12
        L_0x00d8:
            r1 = 0
            goto L_0x02a0
        L_0x00db:
            com.google.ads.interactivemedia.v3.internal.ne r5 = r2.f22954d
            com.google.ads.interactivemedia.v3.internal.nb r5 = r5.f23068a
            int r5 = r5.f23039g
            if (r5 != r8) goto L_0x00ea
            int r3 = r3 + -8
            r0.f22968C = r3
            r1.mo16091d(r7)
        L_0x00ea:
            com.google.ads.interactivemedia.v3.internal.ne r3 = r2.f22954d
            com.google.ads.interactivemedia.v3.internal.nb r3 = r3.f23068a
            com.google.ads.interactivemedia.v3.internal.cy r3 = r3.f23038f
            java.lang.String r3 = r3.f21812l
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0118
            int r3 = r0.f22968C
            r5 = 7
            int r3 = r2.mo16183h(r3, r5)
            r0.f22969D = r3
            int r3 = r0.f22968C
            com.google.ads.interactivemedia.v3.internal.aee r7 = r0.f22983k
            com.google.ads.interactivemedia.p367v3.internal.C6965gr.m20522b(r3, r7)
            com.google.ads.interactivemedia.v3.internal.kr r3 = r2.f22951a
            com.google.ads.interactivemedia.v3.internal.aee r7 = r0.f22983k
            r3.mo16105d(r7, r5)
            int r3 = r0.f22969D
            int r3 = r3 + r5
            r0.f22969D = r3
            r5 = 0
            goto L_0x0121
        L_0x0118:
            int r3 = r0.f22968C
            r5 = 0
            int r3 = r2.mo16183h(r3, r5)
            r0.f22969D = r3
        L_0x0121:
            int r7 = r0.f22968C
            int r7 = r7 + r3
            r0.f22968C = r7
            r3 = 4
            r0.f22990r = r3
            r0.f22970E = r5
        L_0x012b:
            com.google.ads.interactivemedia.v3.internal.ne r3 = r2.f22954d
            com.google.ads.interactivemedia.v3.internal.nb r3 = r3.f23068a
            com.google.ads.interactivemedia.v3.internal.kr r5 = r2.f22951a
            long r9 = r2.mo16178c()
            com.google.ads.interactivemedia.v3.internal.aes r7 = r0.f22984l
            if (r7 == 0) goto L_0x013d
            long r9 = r7.mo14603g(r9)
        L_0x013d:
            int r7 = r3.f23042j
            if (r7 != 0) goto L_0x0153
        L_0x0141:
            int r3 = r0.f22969D
            int r4 = r0.f22968C
            if (r3 >= r4) goto L_0x0237
            int r4 = r4 - r3
            r7 = 0
            int r3 = r5.mo16104c(r1, r4, r7)
            int r4 = r0.f22969D
            int r4 = r4 + r3
            r0.f22969D = r4
            goto L_0x0141
        L_0x0153:
            r7 = 0
            com.google.ads.interactivemedia.v3.internal.aee r11 = r0.f22980h
            byte[] r11 = r11.mo14555i()
            r11[r7] = r7
            r11[r8] = r7
            r13 = 2
            r11[r13] = r7
            int r7 = r3.f23042j
            int r13 = r7 + 1
            r14 = 4
            int r7 = 4 - r7
        L_0x0168:
            int r14 = r0.f22969D
            int r15 = r0.f22968C
            if (r14 >= r15) goto L_0x0237
            int r14 = r0.f22970E
            java.lang.String r15 = "video/hevc"
            if (r14 != 0) goto L_0x01da
            r1.mo16090c(r11, r7, r13)
            com.google.ads.interactivemedia.v3.internal.aee r14 = r0.f22980h
            r12 = 0
            r14.mo14554h(r12)
            com.google.ads.interactivemedia.v3.internal.aee r14 = r0.f22980h
            int r14 = r14.mo14568v()
            if (r14 <= 0) goto L_0x01d2
            int r14 = r14 + -1
            r0.f22970E = r14
            com.google.ads.interactivemedia.v3.internal.aee r14 = r0.f22979g
            r14.mo14554h(r12)
            com.google.ads.interactivemedia.v3.internal.aee r12 = r0.f22979g
            r14 = 4
            r5.mo16105d(r12, r14)
            com.google.ads.interactivemedia.v3.internal.aee r12 = r0.f22980h
            r5.mo16105d(r12, r8)
            com.google.ads.interactivemedia.v3.internal.kr[] r12 = r0.f22974I
            int r12 = r12.length
            if (r12 <= 0) goto L_0x01c3
            com.google.ads.interactivemedia.v3.internal.cy r12 = r3.f23038f
            java.lang.String r12 = r12.f21812l
            byte r18 = r11[r14]
            byte[] r14 = com.google.ads.interactivemedia.p367v3.internal.aec.f20417a
            java.lang.String r14 = "video/avc"
            boolean r14 = r14.equals(r12)
            if (r14 == 0) goto L_0x01b5
            r14 = r18 & 31
            if (r14 == r4) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r12 = 1
            goto L_0x01c4
        L_0x01b5:
            boolean r12 = r15.equals(r12)
            if (r12 == 0) goto L_0x01c3
            r12 = r18 & 126(0x7e, float:1.77E-43)
            int r12 = r12 >> r8
            r14 = 39
            if (r12 != r14) goto L_0x01c3
            goto L_0x01b3
        L_0x01c3:
            r12 = 0
        L_0x01c4:
            r0.f22971F = r12
            int r12 = r0.f22969D
            int r12 = r12 + 5
            r0.f22969D = r12
            int r12 = r0.f22968C
            int r12 = r12 + r7
            r0.f22968C = r12
            goto L_0x0234
        L_0x01d2:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Invalid NAL length"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01da:
            boolean r12 = r0.f22971F
            if (r12 == 0) goto L_0x0222
            com.google.ads.interactivemedia.v3.internal.aee r12 = r0.f22981i
            r12.mo14547a(r14)
            com.google.ads.interactivemedia.v3.internal.aee r12 = r0.f22981i
            byte[] r12 = r12.mo14555i()
            int r14 = r0.f22970E
            r4 = 0
            r1.mo16090c(r12, r4, r14)
            com.google.ads.interactivemedia.v3.internal.aee r4 = r0.f22981i
            int r12 = r0.f22970E
            r5.mo16105d(r4, r12)
            int r4 = r0.f22970E
            com.google.ads.interactivemedia.v3.internal.aee r12 = r0.f22981i
            byte[] r12 = r12.mo14555i()
            com.google.ads.interactivemedia.v3.internal.aee r14 = r0.f22981i
            int r14 = r14.mo14551e()
            int r12 = com.google.ads.interactivemedia.p367v3.internal.aec.m18363a(r12, r14)
            com.google.ads.interactivemedia.v3.internal.aee r14 = r0.f22981i
            com.google.ads.interactivemedia.v3.internal.cy r8 = r3.f23038f
            java.lang.String r8 = r8.f21812l
            boolean r8 = r15.equals(r8)
            r14.mo14554h(r8)
            com.google.ads.interactivemedia.v3.internal.aee r8 = r0.f22981i
            r8.mo14552f(r12)
            com.google.ads.interactivemedia.v3.internal.aee r8 = r0.f22981i
            com.google.ads.interactivemedia.v3.internal.kr[] r12 = r0.f22974I
            com.google.ads.interactivemedia.p367v3.internal.asn.m19528o(r9, r8, r12)
            goto L_0x0228
        L_0x0222:
            r4 = 0
            int r8 = r5.mo16104c(r1, r14, r4)
            r4 = r8
        L_0x0228:
            int r8 = r0.f22969D
            int r8 = r8 + r4
            r0.f22969D = r8
            int r8 = r0.f22970E
            int r8 = r8 - r4
            r0.f22970E = r8
            r4 = 6
            r8 = 1
        L_0x0234:
            r12 = 3
            goto L_0x0168
        L_0x0237:
            int r21 = r2.mo16181f()
            com.google.ads.interactivemedia.v3.internal.nc r1 = r2.mo16184i()
            if (r1 == 0) goto L_0x0246
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.f23046c
            r24 = r1
            goto L_0x0248
        L_0x0246:
            r24 = r6
        L_0x0248:
            int r1 = r0.f22968C
            r23 = 0
            r18 = r5
            r19 = r9
            r22 = r1
            r18.mo16103b(r19, r21, r22, r23, r24)
        L_0x0255:
            java.util.ArrayDeque r1 = r0.f22988p
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0293
            java.util.ArrayDeque r1 = r0.f22988p
            java.lang.Object r1 = r1.removeFirst()
            com.google.ads.interactivemedia.v3.internal.mq r1 = (com.google.ads.interactivemedia.p367v3.internal.C7126mq) r1
            int r3 = r0.f22996x
            int r4 = r1.f22950b
            int r3 = r3 - r4
            r0.f22996x = r3
            long r3 = r1.f22949a
            long r3 = r3 + r9
            com.google.ads.interactivemedia.v3.internal.aes r5 = r0.f22984l
            if (r5 == 0) goto L_0x0277
            long r3 = r5.mo14603g(r3)
        L_0x0277:
            com.google.ads.interactivemedia.v3.internal.kr[] r5 = r0.f22973H
            int r7 = r5.length
            r8 = 0
        L_0x027b:
            if (r8 >= r7) goto L_0x0255
            r18 = r5[r8]
            r21 = 1
            int r11 = r1.f22950b
            int r12 = r0.f22996x
            r24 = 0
            r19 = r3
            r22 = r11
            r23 = r12
            r18.mo16103b(r19, r21, r22, r23, r24)
            int r8 = r8 + 1
            goto L_0x027b
        L_0x0293:
            boolean r1 = r2.mo16182g()
            if (r1 != 0) goto L_0x029b
            r0.f22967B = r6
        L_0x029b:
            r1 = 3
            r0.f22990r = r1
            goto L_0x00d8
        L_0x02a0:
            return r1
        L_0x02a1:
            android.util.SparseArray r2 = r0.f22978f
            int r2 = r2.size()
            r5 = 0
        L_0x02a8:
            if (r5 >= r2) goto L_0x02cb
            android.util.SparseArray r7 = r0.f22978f
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.ads.interactivemedia.v3.internal.mr r7 = (com.google.ads.interactivemedia.p367v3.internal.C7127mr) r7
            com.google.ads.interactivemedia.v3.internal.nd r7 = r7.f22952b
            boolean r8 = r7.f23065q
            if (r8 == 0) goto L_0x02c8
            long r7 = r7.f23052d
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x02c8
            android.util.SparseArray r3 = r0.f22978f
            java.lang.Object r3 = r3.valueAt(r5)
            com.google.ads.interactivemedia.v3.internal.mr r3 = (com.google.ads.interactivemedia.p367v3.internal.C7127mr) r3
            r6 = r3
            r3 = r7
        L_0x02c8:
            int r5 = r5 + 1
            goto L_0x02a8
        L_0x02cb:
            if (r6 != 0) goto L_0x02d2
            r2 = 3
            r0.f22990r = r2
            goto L_0x0004
        L_0x02d2:
            long r7 = r29.mo16099l()
            long r3 = r3 - r7
            int r2 = (int) r3
            if (r2 < 0) goto L_0x02f8
            r1.mo16091d(r2)
            com.google.ads.interactivemedia.v3.internal.nd r2 = r6.f22952b
            com.google.ads.interactivemedia.v3.internal.aee r3 = r2.f23064p
            byte[] r3 = r3.mo14555i()
            com.google.ads.interactivemedia.v3.internal.aee r4 = r2.f23064p
            int r4 = r4.mo14551e()
            r5 = 0
            r1.mo16090c(r3, r5, r4)
            com.google.ads.interactivemedia.v3.internal.aee r3 = r2.f23064p
            r3.mo14554h(r5)
            r2.f23065q = r5
            goto L_0x0004
        L_0x02f8:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0300:
            long r5 = r0.f22992t
            int r2 = (int) r5
            int r5 = r0.f22993u
            int r2 = r2 - r5
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f22994v
            if (r5 == 0) goto L_0x0517
            byte[] r6 = r5.mo14555i()
            r1.mo16090c(r6, r7, r2)
            com.google.ads.interactivemedia.v3.internal.md r2 = new com.google.ads.interactivemedia.v3.internal.md
            int r6 = r0.f22991s
            r2.<init>(r6, r5)
            long r5 = r29.mo16099l()
            java.util.ArrayDeque r8 = r0.f22987o
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0331
            java.util.ArrayDeque r3 = r0.f22987o
            java.lang.Object r3 = r3.peek()
            com.google.ads.interactivemedia.v3.internal.mc r3 = (com.google.ads.interactivemedia.p367v3.internal.C7112mc) r3
            r3.mo16167a(r2)
            goto L_0x051a
        L_0x0331:
            int r8 = r2.f22911d
            if (r8 != r4) goto L_0x03f9
            com.google.ads.interactivemedia.v3.internal.aee r2 = r2.f22910a
            r2.mo14554h(r7)
            int r3 = r2.mo14568v()
            r4 = 4
            r2.mo14557k(r4)
            long r13 = r2.mo14566t()
            int r3 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r3)
            if (r3 != 0) goto L_0x0355
            long r3 = r2.mo14566t()
            long r7 = r2.mo14566t()
            goto L_0x035d
        L_0x0355:
            long r3 = r2.mo14540D()
            long r7 = r2.mo14540D()
        L_0x035d:
            long r5 = r5 + r7
            r9 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r3
            r11 = r13
            long r20 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r7, r9, r11)
            r7 = 2
            r2.mo14557k(r7)
            int r15 = r2.mo14561o()
            int[] r11 = new int[r15]
            long[] r12 = new long[r15]
            long[] r9 = new long[r15]
            long[] r10 = new long[r15]
            r17 = r20
            r7 = 0
        L_0x037a:
            if (r7 >= r15) goto L_0x03d0
            int r8 = r2.mo14568v()
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r8 & r22
            if (r22 != 0) goto L_0x03c8
            long r22 = r2.mo14566t()
            r24 = 2147483647(0x7fffffff, float:NaN)
            r8 = r8 & r24
            r11[r7] = r8
            r12[r7] = r5
            r10[r7] = r17
            long r3 = r3 + r22
            r17 = 1000000(0xf4240, double:4.940656E-318)
            r22 = r7
            r7 = r3
            r23 = r3
            r3 = r9
            r4 = r10
            r9 = r17
            r1 = r12
            r30 = r15
            r15 = r11
            r11 = r13
            long r17 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r7, r9, r11)
            r7 = r4[r22]
            long r7 = r17 - r7
            r3[r22] = r7
            r7 = 4
            r2.mo14557k(r7)
            r8 = r15[r22]
            long r8 = (long) r8
            long r5 = r5 + r8
            int r8 = r22 + 1
            r12 = r1
            r9 = r3
            r10 = r4
            r7 = r8
            r11 = r15
            r3 = r23
            r1 = r29
            r15 = r30
            goto L_0x037a
        L_0x03c8:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03d0:
            r3 = r9
            r4 = r10
            r15 = r11
            r1 = r12
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            com.google.ads.interactivemedia.v3.internal.jt r5 = new com.google.ads.interactivemedia.v3.internal.jt
            r5.<init>(r15, r1, r3, r4)
            android.util.Pair r1 = android.util.Pair.create(r2, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f22966A = r2
            com.google.ads.interactivemedia.v3.internal.ka r2 = r0.f22972G
            java.lang.Object r1 = r1.second
            com.google.ads.interactivemedia.v3.internal.ko r1 = (com.google.ads.interactivemedia.p367v3.internal.C7070ko) r1
            r2.mo16115am(r1)
            r1 = 1
            r0.f22975J = r1
            goto L_0x0514
        L_0x03f9:
            if (r8 != r3) goto L_0x0514
            com.google.ads.interactivemedia.v3.internal.aee r1 = r2.f22910a
            com.google.ads.interactivemedia.v3.internal.kr[] r2 = r0.f22973H
            int r2 = r2.length
            if (r2 == 0) goto L_0x0514
            r1.mo14554h(r7)
            int r2 = r1.mo14568v()
            int r2 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0465
            r5 = 1
            if (r2 == r5) goto L_0x042f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 46
            r1.<init>(r3)
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r10, r1)
            goto L_0x0514
        L_0x042f:
            long r5 = r1.mo14566t()
            long r11 = r1.mo14540D()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r5
            long r7 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r11, r13, r15)
            long r11 = r1.mo14566t()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r11, r13, r15)
            long r9 = r1.mo14566t()
            java.lang.String r2 = r1.mo14544H()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)
            java.lang.String r11 = r1.mo14544H()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r11)
            r21 = r2
            r14 = r3
            r23 = r5
            r25 = r9
            r22 = r11
            goto L_0x04a8
        L_0x0465:
            java.lang.String r2 = r1.mo14544H()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)
            java.lang.String r11 = r1.mo14544H()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r11)
            long r12 = r1.mo14566t()
            long r5 = r1.mo14566t()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r12
            long r14 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r5, r7, r9)
            long r5 = r0.f22966A
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x048d
            long r5 = r5 + r14
            r18 = r5
            goto L_0x048f
        L_0x048d:
            r18 = r3
        L_0x048f:
            long r5 = r1.mo14566t()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = r12
            long r5 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r5, r7, r9)
            long r9 = r1.mo14566t()
            r21 = r2
            r23 = r5
            r25 = r9
            r22 = r11
            r7 = r18
        L_0x04a8:
            int r2 = r1.mo14550d()
            byte[] r2 = new byte[r2]
            int r5 = r1.mo14550d()
            r6 = 0
            r1.mo14559m(r2, r6, r5)
            com.google.ads.interactivemedia.v3.internal.rc r1 = new com.google.ads.interactivemedia.v3.internal.rc
            r20 = r1
            r27 = r2
            r20.<init>(r21, r22, r23, r25, r27)
            com.google.ads.interactivemedia.v3.internal.aee r2 = new com.google.ads.interactivemedia.v3.internal.aee
            com.google.ads.interactivemedia.v3.internal.re r5 = r0.f22985m
            byte[] r1 = r5.mo16365a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.mo14550d()
            com.google.ads.interactivemedia.v3.internal.kr[] r5 = r0.f22973H
            int r6 = r5.length
            r9 = 0
        L_0x04d2:
            if (r9 >= r6) goto L_0x04e0
            r10 = r5[r9]
            r11 = 0
            r2.mo14554h(r11)
            r10.mo16105d(r2, r1)
            int r9 = r9 + 1
            goto L_0x04d2
        L_0x04e0:
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x04f4
            java.util.ArrayDeque r2 = r0.f22988p
            com.google.ads.interactivemedia.v3.internal.mq r3 = new com.google.ads.interactivemedia.v3.internal.mq
            r3.<init>(r14, r1)
            r2.addLast(r3)
            int r2 = r0.f22996x
            int r2 = r2 + r1
            r0.f22996x = r2
            goto L_0x0514
        L_0x04f4:
            com.google.ads.interactivemedia.v3.internal.aes r2 = r0.f22984l
            if (r2 == 0) goto L_0x04fc
            long r7 = r2.mo14603g(r7)
        L_0x04fc:
            com.google.ads.interactivemedia.v3.internal.kr[] r2 = r0.f22973H
            int r3 = r2.length
            r9 = 0
        L_0x0500:
            if (r9 >= r3) goto L_0x0514
            r18 = r2[r9]
            r21 = 1
            r23 = 0
            r24 = 0
            r19 = r7
            r22 = r1
            r18.mo16103b(r19, r21, r22, r23, r24)
            int r9 = r9 + 1
            goto L_0x0500
        L_0x0514:
            r1 = r29
            goto L_0x051a
        L_0x0517:
            r1.mo16091d(r2)
        L_0x051a:
            long r2 = r29.mo16099l()
            r0.m21168b(r2)
            goto L_0x0004
        L_0x0523:
            int r2 = r0.f22993u
            if (r2 != 0) goto L_0x054e
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22986n
            byte[] r2 = r2.mo14555i()
            r5 = 1
            r8 = 0
            boolean r2 = r1.mo16089b(r2, r8, r7, r5)
            if (r2 != 0) goto L_0x0537
            r1 = -1
            return r1
        L_0x0537:
            r0.f22993u = r7
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22986n
            r2.mo14554h(r8)
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22986n
            long r8 = r2.mo14566t()
            r0.f22992t = r8
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22986n
            int r2 = r2.mo14568v()
            r0.f22991s = r2
        L_0x054e:
            long r8 = r0.f22992t
            r10 = 1
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x056d
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22986n
            byte[] r2 = r2.mo14555i()
            r1.mo16090c(r2, r7, r7)
            int r2 = r0.f22993u
            int r2 = r2 + r7
            r0.f22993u = r2
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22986n
            long r8 = r2.mo14540D()
            r0.f22992t = r8
            goto L_0x05a0
        L_0x056d:
            r10 = 0
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x05a0
            long r8 = r29.mo16100m()
            r10 = -1
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0591
            java.util.ArrayDeque r2 = r0.f22987o
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0590
            java.util.ArrayDeque r2 = r0.f22987o
            java.lang.Object r2 = r2.peek()
            com.google.ads.interactivemedia.v3.internal.mc r2 = (com.google.ads.interactivemedia.p367v3.internal.C7112mc) r2
            long r8 = r2.f22907a
            goto L_0x0591
        L_0x0590:
            r8 = r10
        L_0x0591:
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x05a0
            long r10 = r29.mo16099l()
            long r8 = r8 - r10
            int r2 = r0.f22993u
            long r10 = (long) r2
            long r8 = r8 + r10
            r0.f22992t = r8
        L_0x05a0:
            long r8 = r0.f22992t
            int r2 = r0.f22993u
            long r10 = (long) r2
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0729
            long r8 = r29.mo16099l()
            int r2 = r0.f22993u
            long r10 = (long) r2
            long r8 = r8 - r10
            int r2 = r0.f22991s
            r5 = 1835295092(0x6d646174, float:4.4175247E27)
            r10 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r10) goto L_0x05bd
            if (r2 != r5) goto L_0x05d0
        L_0x05bd:
            boolean r2 = r0.f22975J
            if (r2 != 0) goto L_0x05d0
            com.google.ads.interactivemedia.v3.internal.ka r2 = r0.f22972G
            com.google.ads.interactivemedia.v3.internal.kn r11 = new com.google.ads.interactivemedia.v3.internal.kn
            long r12 = r0.f22998z
            r11.<init>(r12, r8)
            r2.mo16115am(r11)
            r2 = 1
            r0.f22975J = r2
        L_0x05d0:
            int r2 = r0.f22991s
            if (r2 != r10) goto L_0x05f0
            android.util.SparseArray r2 = r0.f22978f
            int r2 = r2.size()
            r11 = 0
        L_0x05db:
            if (r11 >= r2) goto L_0x05f0
            android.util.SparseArray r12 = r0.f22978f
            java.lang.Object r12 = r12.valueAt(r11)
            com.google.ads.interactivemedia.v3.internal.mr r12 = (com.google.ads.interactivemedia.p367v3.internal.C7127mr) r12
            com.google.ads.interactivemedia.v3.internal.nd r12 = r12.f22952b
            r12.f23050b = r8
            r12.f23052d = r8
            r12.f23051c = r8
            int r11 = r11 + 1
            goto L_0x05db
        L_0x05f0:
            int r2 = r0.f22991s
            if (r2 != r5) goto L_0x0600
            r0.f22967B = r6
            long r2 = r0.f22992t
            long r8 = r8 + r2
            r0.f22995w = r8
            r2 = 2
            r0.f22990r = r2
            goto L_0x0004
        L_0x0600:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x0700
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x0700
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x0700
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x0700
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x0700
            if (r2 == r10) goto L_0x0700
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x0700
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x0700
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x062c
            goto L_0x0700
        L_0x062c:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r5) goto L_0x06cb
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x06cb
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x06cb
            if (r2 == r4) goto L_0x06cb
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x06cb
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x06cb
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x06cb
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x06cb
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x06cb
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x06cb
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x06cb
            if (r2 != r3) goto L_0x06b6
            goto L_0x06cb
        L_0x06b6:
            long r2 = r0.f22992t
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x06c3
            r0.f22994v = r6
            r2 = 1
            r0.f22990r = r2
            goto L_0x0004
        L_0x06c3:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x06cb:
            int r2 = r0.f22993u
            if (r2 != r7) goto L_0x06f8
            long r2 = r0.f22992t
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x06f0
            com.google.ads.interactivemedia.v3.internal.aee r4 = new com.google.ads.interactivemedia.v3.internal.aee
            int r3 = (int) r2
            r4.<init>((int) r3)
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f22986n
            byte[] r2 = r2.mo14555i()
            byte[] r3 = r4.mo14555i()
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r3, r5, r7)
            r0.f22994v = r4
            r2 = 1
            r0.f22990r = r2
            goto L_0x0004
        L_0x06f0:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x06f8:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0700:
            long r2 = r29.mo16099l()
            long r4 = r0.f22992t
            long r2 = r2 + r4
            r4 = -8
            long r2 = r2 + r4
            java.util.ArrayDeque r4 = r0.f22987o
            com.google.ads.interactivemedia.v3.internal.mc r5 = new com.google.ads.interactivemedia.v3.internal.mc
            int r6 = r0.f22991s
            r5.<init>(r6, r2)
            r4.push(r5)
            long r4 = r0.f22992t
            int r6 = r0.f22993u
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0724
            r0.m21168b(r2)
            goto L_0x0004
        L_0x0724:
            r28.m21167a()
            goto L_0x0004
        L_0x0729:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            goto L_0x0732
        L_0x0731:
            throw r1
        L_0x0732:
            goto L_0x0731
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7128ms.mo16112h(com.google.ads.interactivemedia.v3.internal.jv, com.google.ads.interactivemedia.v3.internal.kl):int");
    }
}
