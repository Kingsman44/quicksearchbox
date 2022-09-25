package androidx.media3.extractor.p163j.p164a;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.p135a.C2567c;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.p163j.C3482c;
import androidx.media3.extractor.p163j.C3508g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.a.c */
/* compiled from: PG */
public final class C3459c extends C3468l {

    /* renamed from: a */
    public static final int[] f10691a = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: d */
    private static final int[] f10692d = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: e */
    private static final int[] f10693e = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: f */
    private static final int[] f10694f = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: g */
    private static final int[] f10695g = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: h */
    private static final int[] f10696h = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: i */
    private static final int[] f10697i = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: j */
    private static final boolean[] f10698j = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: A */
    private boolean f10699A;

    /* renamed from: B */
    private long f10700B;

    /* renamed from: k */
    private final C2604ac f10701k = new C2604ac();

    /* renamed from: l */
    private final int f10702l;

    /* renamed from: m */
    private final int f10703m;

    /* renamed from: n */
    private final int f10704n;

    /* renamed from: o */
    private final long f10705o = 16000000;

    /* renamed from: p */
    private final ArrayList f10706p = new ArrayList();

    /* renamed from: q */
    private C3458b f10707q = new C3458b(0, 4);

    /* renamed from: r */
    private List f10708r;

    /* renamed from: s */
    private List f10709s;

    /* renamed from: t */
    private int f10710t;

    /* renamed from: u */
    private int f10711u;

    /* renamed from: v */
    private boolean f10712v;

    /* renamed from: w */
    private boolean f10713w;

    /* renamed from: x */
    private byte f10714x;

    /* renamed from: y */
    private byte f10715y;

    /* renamed from: z */
    private int f10716z = 0;

    public C3459c(String str, int i) {
        this.f10702l = true != "application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i == 1) {
            this.f10704n = 0;
        } else if (i != 2) {
            if (i == 3) {
                this.f10704n = 0;
            } else if (i != 4) {
                C2633u.m7050e("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                this.f10704n = 0;
                this.f10703m = 0;
                m10022n(0);
                m10021m();
                this.f10699A = true;
                this.f10700B = -9223372036854775807L;
            } else {
                this.f10704n = 1;
            }
            this.f10703m = 1;
            m10022n(0);
            m10021m();
            this.f10699A = true;
            this.f10700B = -9223372036854775807L;
        } else {
            this.f10704n = 1;
        }
        this.f10703m = 0;
        m10022n(0);
        m10021m();
        this.f10699A = true;
        this.f10700B = -9223372036854775807L;
    }

    /* renamed from: k */
    private static char m10019k(byte b) {
        return (char) f10694f[b - 32];
    }

    /* renamed from: l */
    private final List m10020l() {
        int size = this.f10706p.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C2567c b = ((C3458b) this.f10706p.get(i2)).mo7414b(LinearLayoutManager.INVALID_OFFSET);
            arrayList.add(b);
            if (b != null) {
                i = Math.min(i, b.f7092k);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C2567c cVar = (C2567c) arrayList.get(i3);
            if (cVar != null) {
                if (cVar.f7092k != i) {
                    cVar = ((C3458b) this.f10706p.get(i3)).mo7414b(i);
                    cVar.getClass();
                }
                arrayList2.add(cVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: m */
    private final void m10021m() {
        this.f10707q.mo7417e(this.f10710t);
        this.f10706p.clear();
        this.f10706p.add(this.f10707q);
    }

    /* renamed from: n */
    private final void m10022n(int i) {
        int i2 = this.f10710t;
        if (i2 != i) {
            this.f10710t = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f10706p.size(); i3++) {
                    ((C3458b) this.f10706p.get(i3)).f10689g = 3;
                }
                return;
            }
            m10021m();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f10708r = Collections.emptyList();
            }
        }
    }

    /* renamed from: o */
    private final void m10023o(int i) {
        this.f10711u = i;
        this.f10707q.f10690h = i;
    }

    /* renamed from: p */
    private static boolean m10024p(byte b) {
        return (b & 224) == 0;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5956b() {
        return mo5956b();
    }

    /* renamed from: c */
    public final void mo5957c() {
        super.mo5957c();
        this.f10708r = null;
        this.f10709s = null;
        m10022n(0);
        m10023o(4);
        m10021m();
        this.f10712v = false;
        this.f10713w = false;
        this.f10714x = 0;
        this.f10715y = 0;
        this.f10716z = 0;
        this.f10699A = true;
        this.f10700B = -9223372036854775807L;
    }

    /* renamed from: e */
    public final void mo5959e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C3482c mo7420g() {
        List list = this.f10708r;
        this.f10709s = list;
        list.getClass();
        return new C3469m(list);
    }

    /* renamed from: h */
    public final C3508g mo7421h() {
        C3508g gVar;
        C3508g h = super.mo5956b();
        if (h != null) {
            return h;
        }
        long j = this.f10705o;
        long j2 = this.f10700B;
        if (j2 == -9223372036854775807L || this.f10772c - j2 < j || (gVar = (C3508g) this.f10771b.pollFirst()) == null) {
            return null;
        }
        this.f10708r = Collections.emptyList();
        this.f10700B = -9223372036854775807L;
        C3508g gVar2 = gVar;
        gVar2.mo7447e(this.f10772c, mo7420g(), Long.MAX_VALUE);
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0014 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7422i(androidx.media3.extractor.p163j.C3496f r15) {
        /*
            r14 = this;
            java.nio.ByteBuffer r15 = r15.f6955c
            r15.getClass()
            androidx.media3.common.b.ac r0 = r14.f10701k
            byte[] r1 = r15.array()
            int r15 = r15.limit()
            r0.mo6157y(r1, r15)
            r15 = 0
            r0 = 0
        L_0x0014:
            androidx.media3.common.b.ac r1 = r14.f10701k
            int r2 = r1.f7236c
            int r3 = r1.f7235b
            int r4 = r14.f10702l
            int r2 = r2 - r3
            r3 = 3
            r5 = 1
            if (r2 < r4) goto L_0x024c
            r2 = 2
            if (r4 != r2) goto L_0x0026
            r1 = -4
            goto L_0x002b
        L_0x0026:
            int r1 = r1.mo6139g()
            byte r1 = (byte) r1
        L_0x002b:
            androidx.media3.common.b.ac r4 = r14.f10701k
            int r4 = r4.mo6139g()
            androidx.media3.common.b.ac r6 = r14.f10701k
            int r6 = r6.mo6139g()
            r7 = r1 & 2
            if (r7 != 0) goto L_0x0014
            r7 = r1 & 1
            int r8 = r14.f10703m
            if (r7 != r8) goto L_0x0014
            r7 = r4 & 127(0x7f, float:1.78E-43)
            r8 = r6 & 127(0x7f, float:1.78E-43)
            if (r7 != 0) goto L_0x0049
            if (r8 == 0) goto L_0x0014
        L_0x0049:
            boolean r9 = r14.f10712v
            r1 = r1 & 4
            r10 = 4
            if (r1 != r10) goto L_0x005c
            boolean[] r1 = f10698j
            boolean r4 = r1[r4]
            if (r4 == 0) goto L_0x005c
            boolean r1 = r1[r6]
            if (r1 == 0) goto L_0x005c
            r1 = 1
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            r14.f10712v = r1
            byte r4 = (byte) r7
            byte r6 = (byte) r8
            r11 = 16
            if (r1 == 0) goto L_0x0080
            r12 = r7 & 240(0xf0, float:3.36E-43)
            if (r12 != r11) goto L_0x0080
            boolean r12 = r14.f10713w
            if (r12 == 0) goto L_0x0079
            byte r12 = r14.f10714x
            if (r12 != r7) goto L_0x0079
            byte r12 = r14.f10715y
            if (r12 != r8) goto L_0x0079
            r14.f10713w = r15
            r12 = 1
            goto L_0x0083
        L_0x0079:
            r14.f10713w = r5
            r14.f10714x = r4
            r14.f10715y = r6
            goto L_0x0082
        L_0x0080:
            r14.f10713w = r15
        L_0x0082:
            r12 = 0
        L_0x0083:
            if (r12 != 0) goto L_0x0014
            if (r1 != 0) goto L_0x008e
            if (r9 == 0) goto L_0x0014
            r14.m10021m()
        L_0x008c:
            r0 = 1
            goto L_0x0014
        L_0x008e:
            r1 = 20
            r9 = 32
            if (r7 <= 0) goto L_0x009b
            r12 = 15
            if (r7 > r12) goto L_0x009b
            r14.f10699A = r15
            goto L_0x00b1
        L_0x009b:
            r12 = r7 & 247(0xf7, float:3.46E-43)
            if (r12 != r1) goto L_0x00b1
            if (r8 == r9) goto L_0x00af
            r12 = 47
            if (r8 == r12) goto L_0x00af
            switch(r8) {
                case 37: goto L_0x00af;
                case 38: goto L_0x00af;
                case 39: goto L_0x00af;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            switch(r8) {
                case 41: goto L_0x00af;
                case 42: goto L_0x00ac;
                case 43: goto L_0x00ac;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            goto L_0x00b1
        L_0x00ac:
            r14.f10699A = r15
            goto L_0x00b1
        L_0x00af:
            r14.f10699A = r5
        L_0x00b1:
            boolean r12 = r14.f10699A
            if (r12 == 0) goto L_0x0014
            boolean r12 = m10024p(r4)
            if (r12 == 0) goto L_0x00c0
            int r12 = r7 >> 3
            r12 = r12 & r5
            r14.f10716z = r12
        L_0x00c0:
            int r12 = r14.f10716z
            int r13 = r14.f10704n
            if (r12 != r13) goto L_0x0014
            boolean r0 = m10024p(r4)
            if (r0 == 0) goto L_0x0234
            r0 = r7 & 247(0xf7, float:3.46E-43)
            r4 = 17
            if (r0 != r4) goto L_0x00e5
            r6 = r8 & 240(0xf0, float:3.36E-43)
            r12 = 48
            if (r6 != r12) goto L_0x00e5
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            int[] r1 = f10695g
            r2 = r8 & 15
            r1 = r1[r2]
            char r1 = (char) r1
            r0.mo7415c(r1)
            goto L_0x008c
        L_0x00e5:
            r6 = r7 & 246(0xf6, float:3.45E-43)
            r12 = 18
            if (r6 != r12) goto L_0x010c
            r12 = r8 & 224(0xe0, float:3.14E-43)
            if (r12 != r9) goto L_0x010c
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            r0.mo7416d()
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            r1 = r7 & 1
            if (r1 != 0) goto L_0x0101
            int[] r1 = f10696h
            r2 = r8 & 31
            r1 = r1[r2]
            goto L_0x0107
        L_0x0101:
            int[] r1 = f10697i
            r2 = r8 & 31
            r1 = r1[r2]
        L_0x0107:
            char r1 = (char) r1
            r0.mo7415c(r1)
            goto L_0x008c
        L_0x010c:
            if (r0 != r4) goto L_0x0129
            r4 = r8 & 240(0xf0, float:3.36E-43)
            if (r4 != r9) goto L_0x0129
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            r0.mo7415c(r9)
            int r0 = r8 >> 1
            r0 = r0 & 7
            androidx.media3.extractor.j.a.b r1 = r14.f10707q
            r2 = r8 & 1
            if (r5 == r2) goto L_0x0123
            r2 = 0
            goto L_0x0124
        L_0x0123:
            r2 = 1
        L_0x0124:
            r1.mo7418f(r0, r2)
            goto L_0x008c
        L_0x0129:
            r4 = r7 & 240(0xf0, float:3.36E-43)
            if (r4 != r11) goto L_0x0185
            r4 = r8 & 192(0xc0, float:2.69E-43)
            r12 = 64
            if (r4 != r12) goto L_0x0185
            int[] r0 = f10692d
            r1 = r7 & 7
            r0 = r0[r1]
            r1 = r8 & 32
            if (r1 == 0) goto L_0x013f
            int r0 = r0 + 1
        L_0x013f:
            androidx.media3.extractor.j.a.b r1 = r14.f10707q
            int r2 = r1.f10686d
            if (r0 == r2) goto L_0x0163
            int r2 = r14.f10710t
            if (r2 == r5) goto L_0x015f
            boolean r1 = r1.mo7419g()
            if (r1 != 0) goto L_0x015f
            androidx.media3.extractor.j.a.b r1 = new androidx.media3.extractor.j.a.b
            int r2 = r14.f10710t
            int r3 = r14.f10711u
            r1.<init>(r2, r3)
            r14.f10707q = r1
            java.util.ArrayList r2 = r14.f10706p
            r2.add(r1)
        L_0x015f:
            androidx.media3.extractor.j.a.b r1 = r14.f10707q
            r1.f10686d = r0
        L_0x0163:
            r0 = r8 & 16
            r2 = r8 & 1
            int r3 = r8 >> 1
            r3 = r3 & 7
            if (r0 != r11) goto L_0x0170
            r4 = 8
            goto L_0x0171
        L_0x0170:
            r4 = r3
        L_0x0171:
            if (r5 == r2) goto L_0x0175
            r2 = 0
            goto L_0x0176
        L_0x0175:
            r2 = 1
        L_0x0176:
            r1.mo7418f(r4, r2)
            if (r0 != r11) goto L_0x008c
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            int[] r1 = f10693e
            r1 = r1[r3]
            r0.f10687e = r1
            goto L_0x008c
        L_0x0185:
            r4 = 23
            r7 = 33
            if (r0 != r4) goto L_0x0199
            if (r8 < r7) goto L_0x0199
            r0 = 35
            if (r8 > r0) goto L_0x0199
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            int r8 = r8 + -32
            r0.f10688f = r8
            goto L_0x008c
        L_0x0199:
            if (r6 != r1) goto L_0x008c
            r0 = r8 & 240(0xf0, float:3.36E-43)
            if (r0 != r9) goto L_0x008c
            if (r8 == r9) goto L_0x022f
            r0 = 41
            if (r8 == r0) goto L_0x022a
            switch(r8) {
                case 37: goto L_0x0222;
                case 38: goto L_0x021a;
                case 39: goto L_0x0212;
                default: goto L_0x01a8;
            }
        L_0x01a8:
            int r0 = r14.f10710t
            if (r0 != 0) goto L_0x01ae
            goto L_0x008c
        L_0x01ae:
            if (r8 == r7) goto L_0x020b
            switch(r8) {
                case 44: goto L_0x01fa;
                case 45: goto L_0x01c5;
                case 46: goto L_0x01c0;
                case 47: goto L_0x01b5;
                default: goto L_0x01b3;
            }
        L_0x01b3:
            goto L_0x008c
        L_0x01b5:
            java.util.List r0 = r14.m10020l()
            r14.f10708r = r0
            r14.m10021m()
            goto L_0x008c
        L_0x01c0:
            r14.m10021m()
            goto L_0x008c
        L_0x01c5:
            if (r0 != r5) goto L_0x008c
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            boolean r0 = r0.mo7419g()
            if (r0 != 0) goto L_0x008c
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            java.util.List r1 = r0.f10684b
            android.text.SpannableString r2 = r0.mo7413a()
            r1.add(r2)
            java.lang.StringBuilder r1 = r0.f10685c
            r1.setLength(r15)
            java.util.List r1 = r0.f10683a
            r1.clear()
            int r1 = r0.f10690h
            int r2 = r0.f10686d
            int r1 = java.lang.Math.min(r1, r2)
        L_0x01ec:
            java.util.List r2 = r0.f10684b
            int r2 = r2.size()
            if (r2 < r1) goto L_0x008c
            java.util.List r2 = r0.f10684b
            r2.remove(r15)
            goto L_0x01ec
        L_0x01fa:
            java.util.List r0 = java.util.Collections.emptyList()
            r14.f10708r = r0
            int r0 = r14.f10710t
            if (r0 == r5) goto L_0x0206
            if (r0 != r3) goto L_0x008c
        L_0x0206:
            r14.m10021m()
            goto L_0x008c
        L_0x020b:
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            r0.mo7416d()
            goto L_0x008c
        L_0x0212:
            r14.m10022n(r5)
            r14.m10023o(r10)
            goto L_0x008c
        L_0x021a:
            r14.m10022n(r5)
            r14.m10023o(r3)
            goto L_0x008c
        L_0x0222:
            r14.m10022n(r5)
            r14.m10023o(r2)
            goto L_0x008c
        L_0x022a:
            r14.m10022n(r3)
            goto L_0x008c
        L_0x022f:
            r14.m10022n(r2)
            goto L_0x008c
        L_0x0234:
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            char r1 = m10019k(r4)
            r0.mo7415c(r1)
            r0 = r8 & 224(0xe0, float:3.14E-43)
            if (r0 == 0) goto L_0x008c
            androidx.media3.extractor.j.a.b r0 = r14.f10707q
            char r1 = m10019k(r6)
            r0.mo7415c(r1)
            goto L_0x008c
        L_0x024c:
            if (r0 == 0) goto L_0x025e
            int r15 = r14.f10710t
            if (r15 == r5) goto L_0x0254
            if (r15 != r3) goto L_0x025e
        L_0x0254:
            java.util.List r15 = r14.m10020l()
            r14.f10708r = r15
            long r0 = r14.f10772c
            r14.f10700B = r0
        L_0x025e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p164a.C3459c.mo7422i(androidx.media3.extractor.j.f):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo7423j() {
        return this.f10708r != this.f10709s;
    }
}
