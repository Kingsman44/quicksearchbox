package com.facebook.litho;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import androidx.p060c.C0979i;
import androidx.p060c.C0981k;
import com.facebook.litho.p325d.C6180a;
import com.facebook.p313c.C6060s;
import com.facebook.p313c.p315b.C6027c;
import com.facebook.p313c.p315b.C6028d;
import com.facebook.p313c.p316c.C6036d;
import com.facebook.p313c.p318e.C6041a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.litho.dg */
/* compiled from: PG */
public final class C6187dg implements C6027c, C6041a, C6036d, C6140bu {

    /* renamed from: I */
    private static final AtomicInteger f18267I = new AtomicInteger(1);

    /* renamed from: A */
    public final Map f18268A;

    /* renamed from: B */
    public List f18269B;

    /* renamed from: C */
    public volatile boolean f18270C;

    /* renamed from: D */
    C6391hp f18271D;

    /* renamed from: E */
    public Map f18272E;

    /* renamed from: F */
    final boolean f18273F;

    /* renamed from: G */
    final Map f18274G;

    /* renamed from: H */
    public boolean f18275H;

    /* renamed from: J */
    private final Map f18276J = new HashMap();

    /* renamed from: K */
    private final C6202dv f18277K;

    /* renamed from: L */
    private C6188dh f18278L;

    /* renamed from: M */
    private final Map f18279M;

    /* renamed from: N */
    private C6189di f18280N;

    /* renamed from: O */
    private final List f18281O;

    /* renamed from: P */
    private int f18282P;

    /* renamed from: Q */
    private int f18283Q;

    /* renamed from: R */
    private int f18284R;

    /* renamed from: S */
    private long f18285S;

    /* renamed from: T */
    private int f18286T;

    /* renamed from: U */
    private boolean f18287U;

    /* renamed from: V */
    private boolean f18288V;

    /* renamed from: W */
    private AccessibilityManager f18289W;

    /* renamed from: X */
    private boolean f18290X;

    /* renamed from: Y */
    private C6367gt f18291Y;

    /* renamed from: Z */
    private C6259fb f18292Z;

    /* renamed from: a */
    public List f18293a;

    /* renamed from: aa */
    private final Set f18294aa;

    /* renamed from: ab */
    private final int f18295ab;

    /* renamed from: ac */
    private C6122bc f18296ac;

    /* renamed from: b */
    public List f18297b;

    /* renamed from: c */
    public final C6411u f18298c;

    /* renamed from: d */
    public C6407q f18299d;

    /* renamed from: e */
    public int f18300e;

    /* renamed from: f */
    public int f18301f;

    /* renamed from: g */
    public C6188dh f18302g;

    /* renamed from: h */
    public final List f18303h;

    /* renamed from: i */
    public final List f18304i;

    /* renamed from: j */
    public final C0981k f18305j;

    /* renamed from: k */
    public final ArrayList f18306k;

    /* renamed from: l */
    public final ArrayList f18307l;

    /* renamed from: m */
    public final Set f18308m;

    /* renamed from: n */
    public final Map f18309n;

    /* renamed from: o */
    C6181da f18310o;

    /* renamed from: p */
    C6367gt f18311p;

    /* renamed from: q */
    String f18312q;

    /* renamed from: r */
    public int f18313r;

    /* renamed from: s */
    public int f18314s;

    /* renamed from: t */
    public int f18315t;

    /* renamed from: u */
    public final int f18316u;

    /* renamed from: v */
    public final int f18317v;

    /* renamed from: w */
    public boolean f18318w;

    /* renamed from: x */
    public C6280fw f18319x;

    /* renamed from: y */
    public List f18320y;

    /* renamed from: z */
    public List f18321z;

    public C6187dg(C6411u uVar, C6187dg dgVar) {
        new HashMap();
        this.f18303h = new ArrayList(8);
        this.f18305j = new C0981k(8);
        this.f18279M = new LinkedHashMap(8);
        this.f18306k = new ArrayList();
        this.f18307l = new ArrayList();
        this.f18308m = new C0979i(4);
        this.f18284R = 0;
        this.f18285S = -1;
        int i = -1;
        this.f18286T = -1;
        this.f18287U = true;
        this.f18288V = false;
        this.f18315t = -1;
        this.f18290X = false;
        this.f18268A = new LinkedHashMap();
        this.f18294aa = new HashSet();
        this.f18270C = true;
        boolean z = C6180a.f18234a;
        this.f18273F = false;
        HashMap hashMap = new HashMap();
        this.f18274G = hashMap;
        this.f18298c = uVar;
        int andIncrement = f18267I.getAndIncrement();
        this.f18316u = andIncrement;
        i = dgVar != null ? dgVar.f18316u : i;
        this.f18317v = i;
        this.f18319x = uVar.f19010c;
        this.f18281O = C6180a.f18235b ? new ArrayList(8) : null;
        this.f18295ab = uVar.f19009b.getResources().getConfiguration().orientation;
        this.f18309n = new HashMap();
        this.f18293a = new ArrayList();
        if (uVar.f19017j != null) {
            this.f18277K = null;
        } else {
            this.f18277K = null;
        }
        this.f18304i = new ArrayList(8);
        hashMap.put("layoutId", Integer.valueOf(andIncrement));
        hashMap.put("previousLayoutId", Integer.valueOf(i));
    }

    /* renamed from: A */
    private final void m16343A(C6185de deVar, int i, int i2, long j, boolean z) {
        if (this.f18280N == null) {
            this.f18280N = new C6189di();
        }
        C6189di diVar = this.f18280N;
        int i3 = 2;
        if (diVar.f18324a == null) {
            diVar.f18324a = new C0981k(2);
        }
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException("Level must be non-negative and no greater than 255 actual level " + i);
        }
        long j2 = (((long) deVar.f18255e.f17990y) << 27) | (((long) i) << 19) | (((long) i2) << 16);
        int i4 = -1;
        if (j > 0 && ((int) ((j >> 19) & 255)) == i) {
            i4 = (int) (65535 & j);
        }
        int intValue = ((Integer) diVar.f18324a.mo3679f(j2, 0)).intValue();
        if (i4 < intValue) {
            i4 = intValue + 1;
            i3 = 0;
        } else if (true == z) {
            i3 = 1;
        }
        deVar.f18264n = i3;
        if (i4 < 0 || i4 > 65535) {
            throw new IllegalArgumentException("Sequence must be non-negative and no greater than 65535 actual sequence " + i4);
        }
        deVar.f18263m = ((long) i4) | j2;
        diVar.f18324a.mo3682i(j2, Integer.valueOf(i4 + 1));
    }

    /* renamed from: h */
    public static C6060s m16344h(C6187dg dgVar, C6185de deVar, C6060s sVar) {
        deVar.f18262l = dgVar.f18303h.size();
        C6060s f = C6185de.m16312f(deVar, sVar, dgVar.f18274G);
        if (sVar != null) {
            if (sVar.f17832g == null) {
                sVar.f17832g = new ArrayList(4);
            }
            sVar.f17832g.add(f);
        }
        if (deVar.f18255e.mo12820ak() && deVar.mo13155c() && sVar != null) {
            ((C6170cr) ((C6201du) sVar.f17827b).f18345a.f18255e).f18211b = true;
        }
        dgVar.f18303h.add(f);
        C6028d dVar = new C6028d(deVar.f18263m, deVar.f18262l, deVar.f18256f, sVar != null ? (C6028d) dgVar.f18279M.get(Long.valueOf(((C6201du) sVar.f17827b).f18345a.f18263m)) : null);
        dgVar.f18279M.put(Long.valueOf(deVar.f18263m), dVar);
        dgVar.f18306k.add(dVar);
        dgVar.f18307l.add(dVar);
        if (deVar.f18255e.mo12817ah()) {
            dgVar.f18308m.add(Long.valueOf(deVar.f18263m));
        }
        return f;
    }

    /* renamed from: j */
    static String m16345j(int i) {
        switch (i) {
            case -1:
                return "none";
            case 0:
                return "setRoot";
            case 1:
                return "setRootAsync";
            case 2:
                return "setSizeSpec";
            case 3:
                return "setSizeSpecAsync";
            case 4:
                return "updateStateSync";
            case 5:
                return "updateStateAsync";
            case 6:
                return "measure_setSizeSpec";
            default:
                return "measure_setSizeSpecAsync";
        }
    }

    /* renamed from: l */
    public static void m16346l(C0981k kVar, C6185de deVar, int i) {
        kVar.mo3682i(deVar.f18263m, Integer.valueOf(i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v1, types: [com.facebook.litho.da] */
    /* JADX WARNING: type inference failed for: r13v1, types: [com.facebook.litho.dg, com.facebook.c.s, com.facebook.litho.bc, com.facebook.litho.da, com.facebook.litho.ComponentTree] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (r4.mo13057a(r3) == false) goto L_0x0086;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ce A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cd A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2 A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6 A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010c A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0124 A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139 A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014c A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0160 A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0173 A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0194 A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0195 A[Catch:{ IllegalArgumentException -> 0x025e, IllegalArgumentException -> 0x01ed, all -> 0x0027 }] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facebook.litho.C6187dg m16347s(com.facebook.litho.C6411u r21, com.facebook.litho.C6407q r22, int r23, int r24, int r25, boolean r26, com.facebook.litho.C6187dg r27, int r28, java.lang.String r29) {
        /*
            r0 = r21
            r3 = r22
            r1 = r27
            java.lang.String r11 = "   Index "
            java.lang.String r12 = "\n"
            java.lang.String r13 = "Error while sorting LayoutState bottoms. Size: "
            java.lang.String r14 = "Error while sorting LayoutState tops. Size: "
            com.google.android.libraries.elements.h.m r15 = r21.mo13475m()
            if (r1 == 0) goto L_0x0018
            com.facebook.litho.bc r2 = r1.f18296ac
            r9 = r2
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            if (r15 == 0) goto L_0x002a
            r2 = 16
            com.facebook.litho.fd r2 = r15.mo26269a(r0, r2)     // Catch:{ all -> 0x0027 }
            com.facebook.litho.fd r2 = com.facebook.litho.C6231ee.m16500a(r0, r15, r2)     // Catch:{ all -> 0x0027 }
            r8 = r2
            goto L_0x002b
        L_0x0027:
            r0 = move-exception
            goto L_0x02cd
        L_0x002a:
            r8 = 0
        L_0x002b:
            if (r8 == 0) goto L_0x0049
            java.lang.String r2 = "component"
            java.lang.String r4 = r22.mo13461q()     // Catch:{ all -> 0x0027 }
            r8.mo13235a(r2, r4)     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "calculate_layout_state_source"
            java.lang.String r4 = m16345j(r28)     // Catch:{ all -> 0x0027 }
            r8.mo13235a(r2, r4)     // Catch:{ all -> 0x0027 }
            com.facebook.litho.C6349gb.m17046b()     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "attribution"
            r4 = r29
            r8.mo13235a(r2, r4)     // Catch:{ all -> 0x0027 }
        L_0x0049:
            com.facebook.litho.dg r7 = new com.facebook.litho.dg     // Catch:{ all -> 0x0027 }
            r7.<init>(r0, r1)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0053
            com.facebook.litho.dh r2 = r1.f18302g     // Catch:{ all -> 0x0027 }
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            r7.f18278L = r2     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0086
            com.facebook.litho.da r4 = r1.f18310o     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0086
            boolean r4 = r21.mo13472j()     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x0063
            goto L_0x0086
        L_0x0063:
            com.facebook.litho.fw r4 = r0.f19010c     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0086
            boolean r4 = r4.mo13288m()     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x006e
            goto L_0x0086
        L_0x006e:
            com.facebook.litho.q r4 = r1.f18299d     // Catch:{ all -> 0x0027 }
            boolean r5 = com.facebook.litho.C6103an.m15881h(r4, r3)     // Catch:{ all -> 0x0027 }
            if (r5 != 0) goto L_0x0077
            goto L_0x0086
        L_0x0077:
            if (r4 != r3) goto L_0x007b
        L_0x0079:
            r4 = 1
            goto L_0x0087
        L_0x007b:
            if (r4 == 0) goto L_0x0086
            if (r3 != 0) goto L_0x0080
            goto L_0x0086
        L_0x0080:
            boolean r4 = r4.mo13057a(r3)     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x0079
        L_0x0086:
            r4 = 0
        L_0x0087:
            com.facebook.litho.dh r5 = new com.facebook.litho.dh     // Catch:{ all -> 0x0027 }
            com.facebook.litho.ComponentTree r6 = r0.f19017j     // Catch:{ all -> 0x0027 }
            r5.<init>(r7, r6)     // Catch:{ all -> 0x0027 }
            com.facebook.litho.C6407q.m17274F(r22)     // Catch:{ all -> 0x0027 }
            r7.f18302g = r5     // Catch:{ all -> 0x0027 }
            r0.f19018k = r5     // Catch:{ all -> 0x0027 }
            r6 = r26
            r7.f18288V = r6     // Catch:{ all -> 0x0027 }
            r6 = r23
            r7.f18315t = r6     // Catch:{ all -> 0x0027 }
            android.content.Context r6 = r0.f19009b     // Catch:{ all -> 0x0027 }
            java.lang.String r10 = "accessibility"
            java.lang.Object r6 = r6.getSystemService(r10)     // Catch:{ all -> 0x0027 }
            android.view.accessibility.AccessibilityManager r6 = (android.view.accessibility.AccessibilityManager) r6     // Catch:{ all -> 0x0027 }
            r7.f18289W = r6     // Catch:{ all -> 0x0027 }
            boolean r6 = com.facebook.litho.C6067a.m15730c(r6)     // Catch:{ all -> 0x0027 }
            r7.f18290X = r6     // Catch:{ all -> 0x0027 }
            r7.f18299d = r3     // Catch:{ all -> 0x0027 }
            r6 = r24
            r7.f18300e = r6     // Catch:{ all -> 0x0027 }
            r10 = r25
            r7.f18301f = r10     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = r22.mo13461q()     // Catch:{ all -> 0x0027 }
            r7.f18312q = r2     // Catch:{ all -> 0x0027 }
            r2 = 1
            r7.f18318w = r2     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x00ca
            if (r1 == 0) goto L_0x00ca
            r2 = 0
            r1.f18310o = r2     // Catch:{ all -> 0x0027 }
            goto L_0x00cb
        L_0x00ca:
            r2 = 0
        L_0x00cb:
            if (r4 == 0) goto L_0x00d2
            java.lang.String r16 = r22.mo13460p()     // Catch:{ all -> 0x0027 }
            goto L_0x00d4
        L_0x00d2:
            r16 = r2
        L_0x00d4:
            if (r4 == 0) goto L_0x00db
            com.facebook.litho.da r1 = r1.f18310o     // Catch:{ all -> 0x0027 }
            r17 = r1
            goto L_0x00dd
        L_0x00db:
            r17 = r2
        L_0x00dd:
            com.facebook.litho.dh r4 = r7.f18278L     // Catch:{ all -> 0x0027 }
            r1 = r5
            r18 = r2
            r2 = r21
            r3 = r22
            r19 = r4
            r4 = r16
            r16 = r14
            r14 = r5
            r5 = r24
            r20 = r11
            r11 = 0
            r6 = r25
            r10 = r7
            r7 = r17
            r22 = r8
            r8 = r19
            r11 = r10
            r17 = r13
            r13 = r18
            r10 = r22
            com.facebook.litho.da r1 = com.facebook.litho.C6184dd.m16306e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0027 }
            com.facebook.litho.u r2 = r1.mo12937aj()     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0112
            com.facebook.litho.u r2 = r1.mo12937aj()     // Catch:{ all -> 0x0027 }
            r2.f19018k = r14     // Catch:{ all -> 0x0027 }
        L_0x0112:
            r11.f18310o = r1     // Catch:{ all -> 0x0027 }
            com.facebook.litho.gt r1 = m16349u(r1)     // Catch:{ all -> 0x0027 }
            r11.f18311p = r1     // Catch:{ all -> 0x0027 }
            r1 = 0
            r11.f18318w = r1     // Catch:{ all -> 0x0027 }
            r14.mo13162a()     // Catch:{ all -> 0x0027 }
            r10 = r22
            if (r10 == 0) goto L_0x0129
            java.lang.String r2 = "start_collect_results"
            r10.mo13236b(r2)     // Catch:{ all -> 0x0027 }
        L_0x0129:
            int r2 = r11.f18300e     // Catch:{ all -> 0x0027 }
            int r3 = r11.f18301f     // Catch:{ all -> 0x0027 }
            com.facebook.litho.da r4 = r11.f18310o     // Catch:{ all -> 0x0027 }
            int r5 = android.view.View.MeasureSpec.getMode(r2)     // Catch:{ all -> 0x0027 }
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r7) goto L_0x014c
            if (r5 == 0) goto L_0x0145
            if (r5 == r6) goto L_0x013e
            goto L_0x015a
        L_0x013e:
            int r2 = android.view.View.MeasureSpec.getSize(r2)     // Catch:{ all -> 0x0027 }
            r11.f18313r = r2     // Catch:{ all -> 0x0027 }
            goto L_0x015a
        L_0x0145:
            int r2 = r4.mo12882H()     // Catch:{ all -> 0x0027 }
            r11.f18313r = r2     // Catch:{ all -> 0x0027 }
            goto L_0x015a
        L_0x014c:
            int r5 = r4.mo12882H()     // Catch:{ all -> 0x0027 }
            int r2 = android.view.View.MeasureSpec.getSize(r2)     // Catch:{ all -> 0x0027 }
            int r2 = java.lang.Math.min(r5, r2)     // Catch:{ all -> 0x0027 }
            r11.f18313r = r2     // Catch:{ all -> 0x0027 }
        L_0x015a:
            int r2 = android.view.View.MeasureSpec.getMode(r3)     // Catch:{ all -> 0x0027 }
            if (r2 == r7) goto L_0x0173
            if (r2 == 0) goto L_0x016c
            if (r2 == r6) goto L_0x0165
            goto L_0x0181
        L_0x0165:
            int r2 = android.view.View.MeasureSpec.getSize(r3)     // Catch:{ all -> 0x0027 }
            r11.f18314s = r2     // Catch:{ all -> 0x0027 }
            goto L_0x0181
        L_0x016c:
            int r2 = r4.mo12901a()     // Catch:{ all -> 0x0027 }
            r11.f18314s = r2     // Catch:{ all -> 0x0027 }
            goto L_0x0181
        L_0x0173:
            int r2 = r4.mo12901a()     // Catch:{ all -> 0x0027 }
            int r3 = android.view.View.MeasureSpec.getSize(r3)     // Catch:{ all -> 0x0027 }
            int r2 = java.lang.Math.min(r2, r3)     // Catch:{ all -> 0x0027 }
            r11.f18314s = r2     // Catch:{ all -> 0x0027 }
        L_0x0181:
            com.facebook.litho.di r2 = r11.f18280N     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x018c
            androidx.c.k r2 = r2.f18324a     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x018c
            r2.mo3681h()     // Catch:{ all -> 0x0027 }
        L_0x018c:
            r2 = -1
            r11.f18285S = r2     // Catch:{ all -> 0x0027 }
            com.facebook.litho.da r2 = com.facebook.litho.C6411u.f19008a     // Catch:{ all -> 0x0027 }
            if (r4 != r2) goto L_0x0195
            goto L_0x01c8
        L_0x0195:
            m16353y(r0, r4, r11, r13, r13)     // Catch:{ all -> 0x0027 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0027 }
            java.util.ArrayList r3 = r11.f18306k     // Catch:{ all -> 0x0027 }
            r2.<init>(r3)     // Catch:{ all -> 0x0027 }
            java.util.ArrayList r3 = r11.f18306k     // Catch:{ IllegalArgumentException -> 0x025e }
            java.util.Comparator r4 = com.facebook.p313c.p315b.C6031g.f17758a     // Catch:{ IllegalArgumentException -> 0x025e }
            java.util.Collections.sort(r3, r4)     // Catch:{ IllegalArgumentException -> 0x025e }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0027 }
            java.util.ArrayList r3 = r11.f18307l     // Catch:{ all -> 0x0027 }
            r2.<init>(r3)     // Catch:{ all -> 0x0027 }
            java.util.ArrayList r3 = r11.f18307l     // Catch:{ IllegalArgumentException -> 0x01ed }
            java.util.Comparator r4 = com.facebook.p313c.p315b.C6031g.f17759b     // Catch:{ IllegalArgumentException -> 0x01ed }
            java.util.Collections.sort(r3, r4)     // Catch:{ IllegalArgumentException -> 0x01ed }
            boolean r1 = r21.mo13472j()     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x01c8
            boolean r1 = com.facebook.litho.p325d.C6180a.f18234a     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x01c8
            boolean r1 = com.facebook.litho.p325d.C6180a.f18235b     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x01c8
            boolean r1 = com.facebook.litho.p325d.C6180a.f18243j     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x01c8
            r11.f18310o = r13     // Catch:{ all -> 0x0027 }
        L_0x01c8:
            r14.f18322a = r13     // Catch:{ all -> 0x0027 }
            r14.f18323b = r13     // Catch:{ all -> 0x0027 }
            if (r10 == 0) goto L_0x01da
            java.lang.String r1 = "end_collect_results"
            r10.mo13236b(r1)     // Catch:{ all -> 0x0027 }
            com.facebook.litho.fd r0 = com.facebook.litho.C6231ee.m16500a(r0, r15, r10)     // Catch:{ all -> 0x0027 }
            com.google.android.libraries.elements.p1729h.C21215m.m39906e(r0)     // Catch:{ all -> 0x0027 }
        L_0x01da:
            java.util.concurrent.atomic.AtomicLong r0 = com.facebook.litho.p332h.C6375a.f18853d
            r1 = 1
            r0.addAndGet(r1)
            boolean r0 = com.facebook.litho.C6349gb.m17046b()
            if (r0 == 0) goto L_0x01ec
            java.util.concurrent.atomic.AtomicLong r0 = com.facebook.litho.p332h.C6375a.f18854e
            r0.addAndGet(r1)
        L_0x01ec:
            return r11
        L_0x01ed:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r3.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0027 }
            r3.append(r0)     // Catch:{ all -> 0x0027 }
            r3.append(r12)     // Catch:{ all -> 0x0027 }
            int r0 = r2.size()     // Catch:{ all -> 0x0027 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r5 = r17
            r4.<init>(r5)     // Catch:{ all -> 0x0027 }
            r4.append(r0)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r3.append(r4)     // Catch:{ all -> 0x0027 }
            r3.append(r12)     // Catch:{ all -> 0x0027 }
            r6 = 0
        L_0x0216:
            if (r6 >= r0) goto L_0x0254
            java.lang.Object r1 = r2.get(r6)     // Catch:{ all -> 0x0027 }
            com.facebook.c.b.d r1 = (com.facebook.p313c.p315b.C6028d) r1     // Catch:{ all -> 0x0027 }
            int r1 = r1.f17753a     // Catch:{ all -> 0x0027 }
            com.facebook.c.s r1 = r11.mo12598d(r1)     // Catch:{ all -> 0x0027 }
            com.facebook.c.v r1 = r1.f17827b     // Catch:{ all -> 0x0027 }
            com.facebook.litho.du r1 = (com.facebook.litho.C6201du) r1     // Catch:{ all -> 0x0027 }
            com.facebook.litho.de r1 = r1.f18345a     // Catch:{ all -> 0x0027 }
            int r4 = r1.f18262l     // Catch:{ all -> 0x0027 }
            android.graphics.Rect r1 = r1.f18256f     // Catch:{ all -> 0x0027 }
            int r1 = r1.bottom     // Catch:{ all -> 0x0027 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r5.<init>()     // Catch:{ all -> 0x0027 }
            r7 = r20
            r5.append(r7)     // Catch:{ all -> 0x0027 }
            r5.append(r4)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = " bottom: "
            r5.append(r4)     // Catch:{ all -> 0x0027 }
            r5.append(r1)     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0027 }
            r3.append(r1)     // Catch:{ all -> 0x0027 }
            r3.append(r12)     // Catch:{ all -> 0x0027 }
            int r6 = r6 + 1
            r20 = r7
            goto L_0x0216
        L_0x0254:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x025e:
            r0 = move-exception
            r7 = r20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r3.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0027 }
            r3.append(r0)     // Catch:{ all -> 0x0027 }
            r3.append(r12)     // Catch:{ all -> 0x0027 }
            int r0 = r2.size()     // Catch:{ all -> 0x0027 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r5 = r16
            r4.<init>(r5)     // Catch:{ all -> 0x0027 }
            r4.append(r0)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r3.append(r4)     // Catch:{ all -> 0x0027 }
            r3.append(r12)     // Catch:{ all -> 0x0027 }
            r6 = 0
        L_0x0289:
            if (r6 >= r0) goto L_0x02c3
            java.lang.Object r1 = r2.get(r6)     // Catch:{ all -> 0x0027 }
            com.facebook.c.b.d r1 = (com.facebook.p313c.p315b.C6028d) r1     // Catch:{ all -> 0x0027 }
            int r1 = r1.f17753a     // Catch:{ all -> 0x0027 }
            com.facebook.c.s r1 = r11.mo12598d(r1)     // Catch:{ all -> 0x0027 }
            com.facebook.c.v r1 = r1.f17827b     // Catch:{ all -> 0x0027 }
            com.facebook.litho.du r1 = (com.facebook.litho.C6201du) r1     // Catch:{ all -> 0x0027 }
            com.facebook.litho.de r1 = r1.f18345a     // Catch:{ all -> 0x0027 }
            int r4 = r1.f18262l     // Catch:{ all -> 0x0027 }
            android.graphics.Rect r1 = r1.f18256f     // Catch:{ all -> 0x0027 }
            int r1 = r1.top     // Catch:{ all -> 0x0027 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r5.<init>()     // Catch:{ all -> 0x0027 }
            r5.append(r7)     // Catch:{ all -> 0x0027 }
            r5.append(r4)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = " top: "
            r5.append(r4)     // Catch:{ all -> 0x0027 }
            r5.append(r1)     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0027 }
            r3.append(r1)     // Catch:{ all -> 0x0027 }
            r3.append(r12)     // Catch:{ all -> 0x0027 }
            int r6 = r6 + 1
            goto L_0x0289
        L_0x02c3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x02cd:
            goto L_0x02cf
        L_0x02ce:
            throw r0
        L_0x02cf:
            goto L_0x02ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6187dg.m16347s(com.facebook.litho.u, com.facebook.litho.q, int, int, int, boolean, com.facebook.litho.dg, int, java.lang.String):com.facebook.litho.dg");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f9, code lost:
        if (r13.mo13093j() == 2) goto L_0x00fd;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.litho.C6185de m16348t(com.facebook.litho.C6407q r19, java.lang.String r20, long r21, com.facebook.litho.C6187dg r23, com.facebook.litho.C6195do r24, boolean r25, int r26, boolean r27, boolean r28, boolean r29) {
        /*
            r0 = r23
            boolean r1 = com.facebook.litho.C6407q.m17270A(r19)
            int r2 = r0.f18286T
            if (r2 < 0) goto L_0x0021
            java.util.List r4 = r0.f18303h
            java.lang.Object r2 = r4.get(r2)
            com.facebook.c.s r2 = (com.facebook.p313c.C6060s) r2
            com.facebook.c.v r2 = r2.f17827b
            com.facebook.litho.du r2 = (com.facebook.litho.C6201du) r2
            com.facebook.litho.de r2 = r2.f18345a
            android.graphics.Rect r2 = r2.f18256f
            int r4 = r2.left
            int r2 = r2.top
            r12 = r2
            r11 = r4
            goto L_0x0023
        L_0x0021:
            r11 = 0
            r12 = 0
        L_0x0023:
            int r2 = r0.f18282P
            int r4 = r24.mo12883I()
            int r2 = r2 + r4
            int r4 = r0.f18283Q
            int r5 = r24.mo12884J()
            int r4 = r4 + r5
            int r5 = r24.mo12882H()
            int r5 = r5 + r2
            int r6 = r24.mo12901a()
            int r6 = r6 + r4
            if (r25 == 0) goto L_0x0042
            int r7 = r24.mo12879E()
            goto L_0x0043
        L_0x0042:
            r7 = 0
        L_0x0043:
            if (r25 == 0) goto L_0x004a
            int r8 = r24.mo12881G()
            goto L_0x004b
        L_0x004a:
            r8 = 0
        L_0x004b:
            if (r25 == 0) goto L_0x0052
            int r9 = r24.mo12880F()
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            if (r25 == 0) goto L_0x005a
            int r10 = r24.mo12878D()
            goto L_0x005b
        L_0x005a:
            r10 = 0
        L_0x005b:
            com.facebook.litho.ev r13 = r24.mo12952ay()
            r14 = 0
            if (r1 == 0) goto L_0x00ee
            com.facebook.litho.hh r1 = new com.facebook.litho.hh
            r1.<init>()
            if (r25 == 0) goto L_0x0088
            boolean r15 = r24.mo12887M()
            if (r15 == 0) goto L_0x0088
            android.graphics.Rect r15 = r1.f18889c
            if (r15 != 0) goto L_0x0080
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            r1.f18889c = r15
            android.graphics.Rect r15 = r1.f18889c
            r15.set(r7, r8, r9, r10)
            goto L_0x0088
        L_0x0080:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Padding already initialized for this ViewNodeInfo."
            r0.<init>(r1)
            throw r0
        L_0x0088:
            com.facebook.yoga.f r7 = r24.mo12886L()
            r1.f18891e = r7
            int r7 = r2 - r11
            int r8 = r4 - r12
            int r9 = r5 - r11
            int r10 = r6 - r12
            boolean r15 = r24.mo12989bj()
            if (r15 != 0) goto L_0x009d
            goto L_0x00d7
        L_0x009d:
            int r15 = r24.mo12928aa()
            int r16 = r24.mo12930ac()
            int r17 = r24.mo12929ab()
            int r18 = r24.mo12900Z()
            if (r15 != 0) goto L_0x00c0
            if (r16 != 0) goto L_0x00bf
            if (r17 != 0) goto L_0x00bb
            if (r18 == 0) goto L_0x00d7
            r15 = 0
            r16 = 0
            r17 = 0
            goto L_0x00c0
        L_0x00bb:
            r15 = 0
            r16 = 0
            goto L_0x00c0
        L_0x00bf:
            r15 = 0
        L_0x00c0:
            android.graphics.Rect r3 = r1.f18890d
            if (r3 != 0) goto L_0x00e6
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.f18890d = r3
            android.graphics.Rect r3 = r1.f18890d
            int r7 = r7 - r15
            int r8 = r8 - r16
            int r9 = r9 + r17
            int r10 = r10 + r18
            r3.set(r7, r8, r9, r10)
        L_0x00d7:
            int r3 = r24.mo12898X()
            android.graphics.Paint r7 = r24.mo12932ae()
            r1.f18894h = r3
            r1.f18895i = r7
            r7 = r1
            r3 = 0
            goto L_0x00ff
        L_0x00e6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ExpandedTouchBounds already initialized for this ViewNodeInfo."
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            int r2 = r2 + r7
            int r4 = r4 + r8
            int r5 = r5 - r9
            int r6 = r6 - r10
            if (r13 == 0) goto L_0x00fc
            int r1 = r13.mo13093j()
            r3 = 2
            if (r1 != r3) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r3 = 0
        L_0x00fd:
            r7 = r14
            r13 = r7
        L_0x00ff:
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r2, r4, r5, r6)
            if (r27 == 0) goto L_0x0108
            r3 = r3 | 1
        L_0x0108:
            if (r28 == 0) goto L_0x010c
            r3 = r3 | 16
        L_0x010c:
            if (r29 == 0) goto L_0x0113
            r1 = r3 | 4
            r18 = r14
            goto L_0x0118
        L_0x0113:
            com.facebook.litho.gt r1 = r0.f18291Y
            r18 = r1
            r1 = r3
        L_0x0118:
            com.facebook.litho.de r2 = new com.facebook.litho.de
            int r0 = r0.f18295ab
            r5 = r2
            r6 = r13
            r8 = r19
            r9 = r20
            r13 = r1
            r14 = r21
            r16 = r26
            r17 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6187dg.m16348t(com.facebook.litho.q, java.lang.String, long, com.facebook.litho.dg, com.facebook.litho.do, boolean, int, boolean, boolean, boolean):com.facebook.litho.de");
    }

    /* renamed from: u */
    private static C6367gt m16349u(C6195do doVar) {
        int i;
        String aI = doVar.mo12910aI();
        C6362go aA = doVar.mo12902aA();
        String aJ = doVar.mo12911aJ();
        String aH = doVar.mo12909aH();
        if (TextUtils.isEmpty(aI)) {
            aI = aH;
            aJ = null;
            i = 3;
        } else if (aA == C6362go.GLOBAL) {
            i = 1;
            aJ = null;
        } else if (aA == C6362go.LOCAL) {
            i = 2;
        } else {
            throw new IllegalArgumentException("Unhandled transition key type ".concat(String.valueOf(String.valueOf(aA))));
        }
        if (aI != null) {
            return new C6367gt(i, aI, aJ);
        }
        return null;
    }

    /* renamed from: v */
    private static void m16350v(C6187dg dgVar) {
        C6367gt gtVar;
        String str;
        char c;
        C6259fb fbVar = dgVar.f18292Z;
        if (fbVar != null && fbVar.f18498b != 0 && (gtVar = dgVar.f18291Y) != null) {
            if (gtVar.f18824a == 3 || C6180a.f18239f) {
                if (!dgVar.f18294aa.contains(gtVar) && dgVar.f18268A.put(gtVar, fbVar) != null) {
                    dgVar.f18268A.remove(gtVar);
                    dgVar.f18294aa.add(gtVar);
                }
            } else if (dgVar.f18268A.put(gtVar, fbVar) != null) {
                String obj = gtVar.toString();
                C6181da daVar = dgVar.f18310o;
                if (daVar == null) {
                    str = "null";
                } else {
                    StringBuilder sb = new StringBuilder();
                    LinkedList linkedList = new LinkedList();
                    linkedList.addLast((Object) null);
                    linkedList.addLast(daVar);
                    int i = 0;
                    while (!linkedList.isEmpty()) {
                        C6181da daVar2 = (C6181da) linkedList.removeLast();
                        if (daVar2 == null) {
                            i--;
                        } else {
                            C6407q ai = daVar2.mo12936ai();
                            if (ai != null) {
                                if (daVar2 != daVar) {
                                    sb.append(10);
                                    Iterator it = linkedList.iterator();
                                    it.next();
                                    it.next();
                                    for (int i2 = 0; i2 < i - 1; i2++) {
                                        if (it.next() != null) {
                                            do {
                                            } while (it.next() != null);
                                            c = "│";
                                        } else {
                                            c = ' ';
                                        }
                                        sb.append(c);
                                        sb.append(' ');
                                    }
                                    sb.append(linkedList.getLast() == null ? "└╴" : "├╴");
                                }
                                sb.append(ai.mo13461q());
                                if (ai.f18993p || daVar2.mo12990bk() || daVar2.mo12908aG() != null) {
                                    sb.append('[');
                                    if (ai.f18993p) {
                                        sb.append("manual.key=\"");
                                        sb.append(ai.mo13460p());
                                        sb.append("\";");
                                    }
                                    if (daVar2.mo12990bk()) {
                                        sb.append("trans.key=\"");
                                        sb.append(daVar2.mo12910aI());
                                        sb.append("\";");
                                    }
                                    if (daVar2.mo12908aG() != null) {
                                        sb.append("test.key=\"");
                                        sb.append(daVar2.mo12908aG());
                                        sb.append("\";");
                                    }
                                    sb.append(']');
                                }
                                if (daVar2.mo12894T() != 0) {
                                    linkedList.addLast((Object) null);
                                    int T = daVar2.mo12894T();
                                    while (true) {
                                        T--;
                                        if (T < 0) {
                                            break;
                                        }
                                        linkedList.addLast(daVar2.mo12947at(T));
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                    str = sb.toString();
                }
                C6106aq.m15891b(3, "LayoutState:DuplicateTransitionIds", "The transitionId '" + obj + "' is defined multiple times in the same layout. TransitionIDs must be unique.\nTree:\n" + str);
            }
            dgVar.f18292Z = null;
            dgVar.f18291Y = null;
        }
    }

    /* renamed from: w */
    private static void m16351w(C6259fb fbVar, int i, C6185de deVar) {
        if (fbVar != null) {
            fbVar.mo13251c(i, deVar);
        }
    }

    /* renamed from: x */
    private final boolean m16352x(C6195do doVar) {
        if (this.f18310o.mo12998bs()) {
            if (doVar == this.f18310o.mo12948au()) {
                return true;
            }
            return false;
        } else if (doVar == this.f18310o) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.facebook.litho.do, com.facebook.litho.z, com.facebook.litho.da] */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0173, code lost:
        if (r1 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01af, code lost:
        if (com.facebook.litho.C6407q.m17270A(r54.mo12936ai()) == false) goto L_0x00cd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0457 A[LOOP:5: B:197:0x0455->B:198:0x0457, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0625  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x067c  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x070e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d1  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m16353y(com.facebook.litho.C6411u r53, com.facebook.litho.C6195do r54, com.facebook.litho.C6187dg r55, com.facebook.p313c.C6060s r56, com.facebook.litho.C6122bc r57) {
        /*
            r0 = r53
            r11 = r54
            r12 = r55
            r13 = r56
            r1 = r57
            r53.mo13473k()
            com.facebook.litho.q r14 = r54.mo12936ai()
            r54.mo12907aF()
            com.facebook.litho.C6103an.m15882i(r14)
            boolean r2 = com.facebook.litho.p325d.C6180a.f18234a
            boolean r2 = r54.mo12998bs()
            if (r2 == 0) goto L_0x0064
            int r2 = r54.mo12882H()
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            int r4 = r54.mo12901a()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            com.facebook.litho.dh r4 = r12.f18278L
            com.facebook.litho.da r2 = com.facebook.litho.C6184dd.m16303b(r0, r11, r2, r3, r4)
            com.facebook.litho.da r3 = com.facebook.litho.C6411u.f19008a
            if (r2 != r3) goto L_0x003c
            return
        L_0x003c:
            int r3 = r12.f18282P
            int r4 = r54.mo12883I()
            int r3 = r3 + r4
            r12.f18282P = r3
            int r3 = r12.f18283Q
            int r4 = r54.mo12884J()
            int r3 = r3 + r4
            r12.f18283Q = r3
            m16353y(r0, r2, r12, r13, r1)
            int r0 = r12.f18282P
            int r1 = r54.mo12883I()
            int r0 = r0 - r1
            r12.f18282P = r0
            int r0 = r12.f18283Q
            int r1 = r54.mo12884J()
            int r0 = r0 - r1
            r12.f18283Q = r0
            return
        L_0x0064:
            boolean r0 = r12.f18288V
            com.facebook.litho.bc r15 = r54.mo13002bw()
            boolean r2 = com.facebook.litho.C6407q.m17281z(r14)
            r9 = 1
            if (r2 == 0) goto L_0x0076
            if (r15 == 0) goto L_0x0076
            r16 = 1
            goto L_0x0078
        L_0x0076:
            r16 = 0
        L_0x0078:
            if (r16 == 0) goto L_0x0083
            boolean r2 = r54.mo12986bg()
            if (r2 == 0) goto L_0x0083
            r17 = 1
            goto L_0x0085
        L_0x0083:
            r17 = 0
        L_0x0085:
            r18 = 0
            if (r0 == 0) goto L_0x00c3
            com.facebook.litho.bc r0 = new com.facebook.litho.bc
            r0.<init>()
            int r2 = r54.mo12897W()
            r0.f18068h = r2
            int r2 = r54.mo12896V()
            r0.f18069i = r2
            float r2 = r54.mo12889O()
            r0.f18066f = r2
            float r2 = r54.mo12888N()
            r0.f18067g = r2
            com.facebook.litho.q r2 = r54.mo12936ai()
            com.facebook.litho.q r3 = r54.mo12936ai()
            r54.mo12907aF()
            com.facebook.litho.C6103an.m15882i(r3)
            r0.f18065e = r2
            if (r1 == 0) goto L_0x00bd
            java.util.List r2 = r1.f18070j
            r2.add(r0)
        L_0x00bd:
            if (r1 != 0) goto L_0x00c1
            r12.f18296ac = r0
        L_0x00c1:
            r8 = r0
            goto L_0x00c5
        L_0x00c3:
            r8 = r18
        L_0x00c5:
            boolean r0 = r12.m16352x(r11)
            r7 = -1
            r6 = 2
            if (r0 == 0) goto L_0x00d0
        L_0x00cd:
            r10 = 1
            goto L_0x01b3
        L_0x00d0:
            com.facebook.litho.q r0 = r54.mo12936ai()
            boolean r0 = com.facebook.litho.C6407q.m17270A(r0)
            if (r0 == 0) goto L_0x00dd
        L_0x00da:
            r10 = 0
            goto L_0x01b3
        L_0x00dd:
            boolean r0 = r54.mo12994bo()
            if (r0 == 0) goto L_0x00e4
            goto L_0x00cd
        L_0x00e4:
            com.facebook.litho.q r0 = r54.mo12936ai()
            com.facebook.litho.ev r1 = r54.mo12952ay()
            if (r1 == 0) goto L_0x00f7
            boolean r2 = r1.mo13074ap()
            if (r2 != 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r0 = 1
            goto L_0x0101
        L_0x00f7:
            if (r0 == 0) goto L_0x0100
            boolean r0 = r0.mo12819aj()
            if (r0 == 0) goto L_0x0100
            goto L_0x00f5
        L_0x0100:
            r0 = 0
        L_0x0101:
            int r2 = r54.mo12895U()
            boolean r3 = r12.f18290X
            if (r3 == 0) goto L_0x011c
            if (r2 == r6) goto L_0x011c
            if (r0 != 0) goto L_0x00cd
            if (r1 == 0) goto L_0x0119
            java.lang.CharSequence r0 = r1.mo13035E()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00cd
        L_0x0119:
            if (r2 == 0) goto L_0x011c
            goto L_0x00cd
        L_0x011c:
            boolean r0 = r54.mo12992bm()
            if (r0 != 0) goto L_0x00cd
            if (r1 != 0) goto L_0x0125
            goto L_0x0177
        L_0x0125:
            boolean r0 = r1.mo13066ah()
            boolean r2 = r1.mo13067ai()
            if (r2 == 0) goto L_0x0137
            int r2 = r1.mo13093j()
            if (r2 == r6) goto L_0x0137
            r2 = 1
            goto L_0x0138
        L_0x0137:
            r2 = 0
        L_0x0138:
            java.lang.Object r3 = r1.mo13036F()
            android.util.SparseArray r4 = r1.mo13097n()
            float r5 = r1.mo13090g()
            android.view.ViewOutlineProvider r19 = r1.mo13098o()
            boolean r20 = r1.mo13065ag()
            int r6 = r1.mo13095l()
            int r10 = r1.mo13092i()
            boolean r22 = r1.mo13069ak()
            java.lang.String r1 = r1.mo13038H()
            if (r0 != 0) goto L_0x00cd
            if (r2 != 0) goto L_0x00cd
            if (r3 != 0) goto L_0x00cd
            if (r4 != 0) goto L_0x00cd
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00cd
            if (r19 != 0) goto L_0x00cd
            if (r20 != 0) goto L_0x00cd
            if (r22 != 0) goto L_0x00cd
            if (r6 == r9) goto L_0x00cd
            if (r10 == r9) goto L_0x00cd
            if (r1 == 0) goto L_0x0177
            goto L_0x00cd
        L_0x0177:
            int r0 = r54.mo12898X()
            if (r0 == r7) goto L_0x017f
            goto L_0x00cd
        L_0x017f:
            java.util.List r0 = r54.mo12915aN()
            java.util.Iterator r0 = r0.iterator()
        L_0x0187:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x019d
            java.lang.Object r1 = r0.next()
            com.facebook.litho.q r1 = (com.facebook.litho.C6407q) r1
            if (r1 == 0) goto L_0x0187
            boolean r1 = r1.mo13145v()
            if (r1 == 0) goto L_0x0187
            goto L_0x00cd
        L_0x019d:
            java.lang.String r0 = r54.mo12910aI()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00da
            com.facebook.litho.q r0 = r54.mo12936ai()
            boolean r0 = com.facebook.litho.C6407q.m17270A(r0)
            if (r0 != 0) goto L_0x00da
            goto L_0x00cd
        L_0x01b3:
            long r5 = r12.f18285S
            int r4 = r12.f18286T
            com.facebook.litho.gt r2 = r12.f18291Y
            com.facebook.litho.fb r3 = r12.f18292Z
            com.facebook.litho.gt r0 = m16349u(r54)
            r12.f18291Y = r0
            if (r0 == 0) goto L_0x01c9
            com.facebook.litho.fb r0 = new com.facebook.litho.fb
            r0.<init>()
            goto L_0x01cb
        L_0x01c9:
            r0 = r18
        L_0x01cb:
            r12.f18292Z = r0
            r19 = r5
            if (r10 == 0) goto L_0x02db
            com.facebook.litho.q r0 = r54.mo12936ai()
            boolean r0 = com.facebook.litho.C6407q.m17270A(r0)
            if (r0 == 0) goto L_0x01ea
            boolean r0 = r12.m16352x(r11)
            if (r0 == 0) goto L_0x01e2
            goto L_0x01ea
        L_0x01e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "We shouldn't insert a host as a parent of a View"
            r0.<init>(r1)
            throw r0
        L_0x01ea:
            com.facebook.litho.cr r0 = new com.facebook.litho.cr
            r0.<init>()
            java.util.List r5 = r54.mo12915aN()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x01fc:
            boolean r23 = r5.hasNext()
            if (r23 == 0) goto L_0x022f
            java.lang.Object r23 = r5.next()
            com.facebook.litho.q r23 = (com.facebook.litho.C6407q) r23
            android.util.SparseArray r6 = r23.mo13144g()
            if (r6 == 0) goto L_0x01fc
            r7 = 0
        L_0x020f:
            int r9 = r6.size()
            if (r7 >= r9) goto L_0x022d
            int r9 = r6.keyAt(r7)
            java.lang.Object r26 = r6.get(r9)
            r27 = r2
            r2 = r26
            com.facebook.litho.bs r2 = (com.facebook.litho.C6138bs) r2
            if (r2 == 0) goto L_0x0228
            r1.append(r9, r2)
        L_0x0228:
            int r7 = r7 + 1
            r2 = r27
            goto L_0x020f
        L_0x022d:
            r9 = 1
            goto L_0x01fc
        L_0x022f:
            r27 = r2
            r0.f18210a = r1
            boolean r1 = r12.m16352x(r11)
            if (r1 == 0) goto L_0x023c
            r5 = 0
            goto L_0x023f
        L_0x023c:
            long r1 = r12.f18285S
            r5 = r1
        L_0x023f:
            r1 = 0
            r7 = 0
            int r9 = r54.mo12895U()
            boolean r26 = r54.mo12993bn()
            boolean r28 = r54.mo12992bm()
            r29 = 0
            r2 = 3
            r31 = r3
            r30 = r27
            r2 = r5
            r6 = r4
            r4 = r55
            r32 = r19
            r5 = r54
            r34 = r6
            r6 = r7
            r19 = -1
            r7 = r9
            r9 = r8
            r8 = r26
            r35 = r9
            r9 = r28
            r20 = r14
            r14 = r10
            r10 = r29
            com.facebook.litho.de r7 = m16348t(r0, r1, r2, r4, r5, r6, r7, r8, r9, r10)
            com.facebook.litho.hh r0 = r7.f18254d
            if (r0 == 0) goto L_0x0289
            boolean r1 = r54.mo12988bi()
            if (r1 == 0) goto L_0x0283
            int r1 = r54.mo12899Y()
            r0.f18893g = r1
            goto L_0x0289
        L_0x0283:
            android.animation.StateListAnimator r1 = r54.mo12931ad()
            r0.f18892f = r1
        L_0x0289:
            boolean r0 = r12.m16352x(r11)
            if (r0 == 0) goto L_0x0297
            r9 = 0
            r7.f18263m = r9
            r8 = 2
            r7.f18264n = r8
            goto L_0x02a6
        L_0x0297:
            r8 = 2
            r9 = 0
            int r2 = r12.f18284R
            r3 = 3
            r4 = -1
            r6 = 0
            r0 = r55
            r1 = r7
            r0.m16343A(r1, r2, r3, r4, r6)
        L_0x02a6:
            m16344h(r12, r7, r13)
            java.util.List r0 = r12.f18303h
            int r0 = r0.size()
            int r0 = r0 + -1
            androidx.c.k r1 = r12.f18305j
            m16346l(r1, r7, r0)
            com.facebook.litho.fb r1 = r12.f18292Z
            r6 = 3
            m16351w(r1, r6, r7)
            m16350v(r55)
            java.util.List r1 = r12.f18303h
            java.lang.Object r1 = r1.get(r0)
            com.facebook.c.s r1 = (com.facebook.p313c.C6060s) r1
            com.facebook.c.v r2 = r1.f17827b
            com.facebook.litho.du r2 = (com.facebook.litho.C6201du) r2
            com.facebook.litho.de r2 = r2.f18345a
            int r3 = r12.f18284R
            r7 = 1
            int r3 = r3 + r7
            r12.f18284R = r3
            long r2 = r2.f18263m
            r12.f18285S = r2
            r12.f18286T = r0
            r13 = r1
            goto L_0x02ef
        L_0x02db:
            r30 = r2
            r31 = r3
            r34 = r4
            r35 = r8
            r32 = r19
            r6 = 3
            r7 = 1
            r8 = 2
            r19 = -1
            r20 = r14
            r14 = r10
            r9 = 0
        L_0x02ef:
            boolean r5 = r12.f18287U
            if (r14 != 0) goto L_0x02fe
            if (r5 == 0) goto L_0x02fc
            boolean r0 = r54.mo12993bn()
            if (r0 == 0) goto L_0x02fc
            goto L_0x02fe
        L_0x02fc:
            r0 = 0
            goto L_0x02ff
        L_0x02fe:
            r0 = 1
        L_0x02ff:
            r12.f18287U = r0
            com.facebook.litho.q r0 = r54.mo12936ai()
            java.lang.String r1 = r54.mo12907aF()
            if (r0 == 0) goto L_0x0341
            int r2 = r0.mo12824ao()
            if (r2 != r7) goto L_0x031a
            r36 = r5
            r21 = r9
            r7 = r18
            r25 = 3
            goto L_0x0349
        L_0x031a:
            long r2 = r12.f18285S
            r21 = 1
            int r22 = r54.mo12895U()
            boolean r4 = r12.f18287U
            r23 = 0
            r24 = r4
            r4 = r55
            r36 = r5
            r5 = r54
            r25 = 3
            r6 = r21
            r7 = r22
            r8 = r24
            r21 = r9
            r9 = r23
            r10 = r14
            com.facebook.litho.de r0 = m16348t(r0, r1, r2, r4, r5, r6, r7, r8, r9, r10)
            r7 = r0
            goto L_0x0349
        L_0x0341:
            r36 = r5
            r21 = r9
            r25 = 3
            r7 = r18
        L_0x0349:
            if (r7 == 0) goto L_0x0361
            r0 = -1
            if (r16 == 0) goto L_0x0355
            com.facebook.litho.de r2 = r15.f18061a
            if (r2 == 0) goto L_0x0355
            long r0 = r2.f18263m
        L_0x0355:
            r4 = r0
            int r2 = r12.f18284R
            r3 = 0
            r0 = r55
            r1 = r7
            r6 = r17
            r0.m16343A(r1, r2, r3, r4, r6)
        L_0x0361:
            android.graphics.drawable.Drawable r4 = r54.mo12885K()
            if (r4 == 0) goto L_0x038a
            if (r7 == 0) goto L_0x0370
            com.facebook.litho.hh r0 = r7.f18254d
            if (r0 == 0) goto L_0x0370
            r0.f18887a = r4
            goto L_0x038a
        L_0x0370:
            if (r15 == 0) goto L_0x0376
            com.facebook.litho.de r0 = r15.f18062b
            r3 = r0
            goto L_0x0378
        L_0x0376:
            r3 = r18
        L_0x0378:
            r5 = 1
            r0 = r13
            r1 = r54
            r2 = r55
            r6 = r14
            com.facebook.litho.de r0 = m16354z(r0, r1, r2, r3, r4, r5, r6)
            r8 = r35
            if (r8 == 0) goto L_0x038c
            r8.f18062b = r0
            goto L_0x038c
        L_0x038a:
            r8 = r35
        L_0x038c:
            boolean r0 = com.facebook.litho.C6407q.m17281z(r20)
            if (r0 == 0) goto L_0x03b7
            r9 = r20
            com.facebook.litho.u r0 = r9.f18995r
            r9.mo12803W(r0, r11)
            com.facebook.c.s r0 = m16344h(r12, r7, r13)
            androidx.c.k r1 = r12.f18305j
            java.util.List r2 = r12.f18303h
            int r2 = r2.size()
            int r2 = r2 + -1
            m16346l(r1, r7, r2)
            com.facebook.litho.fb r1 = r12.f18292Z
            r10 = 0
            m16351w(r1, r10, r7)
            if (r8 == 0) goto L_0x03b4
            r8.f18061a = r7
        L_0x03b4:
            r5 = r0
            r6 = 1
            goto L_0x03c1
        L_0x03b7:
            r9 = r20
            r6 = 1
            r10 = 0
            if (r6 == r14) goto L_0x03c0
            r5 = r18
            goto L_0x03c1
        L_0x03c0:
            r5 = r13
        L_0x03c1:
            if (r9 == 0) goto L_0x03c6
            com.facebook.litho.u r0 = r9.f18995r
            goto L_0x03c8
        L_0x03c6:
            r0 = r18
        L_0x03c8:
            boolean r0 = com.facebook.litho.C6184dd.m16304c(r0)
            if (r0 == 0) goto L_0x043e
            java.util.ArrayList r0 = r54.mo12912aK()
            if (r0 == 0) goto L_0x03f7
            int r1 = r0.size()
            r2 = 0
        L_0x03d9:
            if (r2 >= r1) goto L_0x03f7
            java.lang.Object r3 = r0.get(r2)
            com.facebook.litho.gr r3 = (com.facebook.litho.C6365gr) r3
            java.util.List r4 = r12.f18269B
            if (r4 != 0) goto L_0x03ec
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r12.f18269B = r4
        L_0x03ec:
            java.util.List r4 = r12.f18269B
            java.lang.String r10 = r12.f18312q
            com.facebook.p313c.p316c.C6035c.m15517a(r3, r4, r10)
            int r2 = r2 + 1
            r10 = 0
            goto L_0x03d9
        L_0x03f7:
            java.util.Map r0 = r54.mo12916aO()
            if (r0 == 0) goto L_0x043e
            java.util.List r1 = r12.f18320y
            if (r1 != 0) goto L_0x0408
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r12.f18320y = r1
        L_0x0408:
            java.util.List r1 = r12.f18321z
            if (r1 != 0) goto L_0x0413
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r12.f18321z = r1
        L_0x0413:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x041b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x043e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.List r2 = r12.f18321z
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            java.util.List r2 = r12.f18320y
            java.lang.Object r1 = r1.getValue()
            com.facebook.litho.q r1 = (com.facebook.litho.C6407q) r1
            r2.add(r1)
            goto L_0x041b
        L_0x043e:
            int r0 = r12.f18282P
            int r1 = r54.mo12883I()
            int r0 = r0 + r1
            r12.f18282P = r0
            int r0 = r12.f18283Q
            int r1 = r54.mo12884J()
            int r0 = r0 + r1
            r12.f18283Q = r0
            int r0 = r54.mo12894T()
            r10 = 0
        L_0x0455:
            if (r10 >= r0) goto L_0x0465
            com.facebook.litho.u r1 = r54.mo12937aj()
            com.facebook.litho.da r2 = r11.mo12947at(r10)
            m16353y(r1, r2, r12, r13, r8)
            int r10 = r10 + 1
            goto L_0x0455
        L_0x0465:
            int r0 = r12.f18282P
            int r1 = r54.mo12883I()
            int r0 = r0 - r1
            r12.f18282P = r0
            int r0 = r12.f18283Q
            int r1 = r54.mo12884J()
            int r0 = r0 - r1
            r12.f18283Q = r0
            boolean r0 = r54.mo12999bt()
            if (r0 == 0) goto L_0x0512
            if (r15 == 0) goto L_0x0483
            com.facebook.litho.de r0 = r15.f18064d
            r3 = r0
            goto L_0x0485
        L_0x0483:
            r3 = r18
        L_0x0485:
            boolean r0 = r54.mo12999bt()
            if (r0 == 0) goto L_0x050a
            com.facebook.yoga.f r0 = r54.mo12905aD()
            com.facebook.yoga.f r1 = com.facebook.yoga.C6570f.RTL
            if (r0 != r1) goto L_0x0495
            r10 = 1
            goto L_0x0496
        L_0x0495:
            r10 = 0
        L_0x0496:
            float[] r0 = r54.mo13000bu()
            int[] r1 = r54.mo13001bv()
            if (r10 == 0) goto L_0x04a2
            r2 = 3
            goto L_0x04a3
        L_0x04a2:
            r2 = 1
        L_0x04a3:
            if (r6 == r10) goto L_0x04a7
            r4 = 3
            goto L_0x04a8
        L_0x04a7:
            r4 = 1
        L_0x04a8:
            com.facebook.litho.f.a r10 = new com.facebook.litho.f.a
            r10.<init>()
            android.graphics.PathEffect r6 = r54.mo12933af()
            r10.f18486i = r6
            int r6 = com.facebook.litho.C6207e.m16462b(r1, r2)
            r10.f18482e = r6
            r53 = r5
            r6 = 2
            int r5 = com.facebook.litho.C6207e.m16462b(r1, r6)
            r10.f18483f = r5
            int r5 = com.facebook.litho.C6207e.m16462b(r1, r4)
            r10.f18484g = r5
            r5 = 4
            int r1 = com.facebook.litho.C6207e.m16462b(r1, r5)
            r10.f18485h = r1
            int r1 = r11.mo12977bW(r2)
            float r1 = (float) r1
            r10.f18478a = r1
            int r1 = r11.mo12977bW(r6)
            float r1 = (float) r1
            r10.f18479b = r1
            int r1 = r11.mo12977bW(r4)
            float r1 = (float) r1
            r10.f18480c = r1
            int r1 = r11.mo12977bW(r5)
            float r1 = (float) r1
            r10.f18481d = r1
            int r1 = r0.length
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r10.f18487j = r0
            com.facebook.litho.f.b r4 = new com.facebook.litho.f.b
            r4.<init>(r10)
            r0 = r13
            r1 = r54
            r2 = r55
            r10 = r53
            r16 = 1
            r6 = r14
            com.facebook.litho.de r0 = m16354z(r0, r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L_0x0515
            r8.f18064d = r0
            goto L_0x0515
        L_0x050a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "This result does not support drawing border color"
            r0.<init>(r1)
            throw r0
        L_0x0512:
            r10 = r5
            r16 = 1
        L_0x0515:
            android.graphics.drawable.Drawable r4 = r54.mo12934ag()
            if (r4 == 0) goto L_0x053b
            if (r7 == 0) goto L_0x0524
            com.facebook.litho.hh r0 = r7.f18254d
            if (r0 == 0) goto L_0x0524
            r0.f18888b = r4
            goto L_0x053b
        L_0x0524:
            if (r15 == 0) goto L_0x052a
            com.facebook.litho.de r0 = r15.f18063c
            r3 = r0
            goto L_0x052c
        L_0x052a:
            r3 = r18
        L_0x052c:
            r5 = 2
            r0 = r13
            r1 = r54
            r2 = r55
            r6 = r14
            com.facebook.litho.de r0 = m16354z(r0, r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L_0x053b
            r8.f18063c = r0
        L_0x053b:
            boolean r0 = r54.mo12991bl()
            if (r0 == 0) goto L_0x05c2
            int r0 = r12.f18282P
            int r1 = r54.mo12883I()
            int r0 = r0 + r1
            int r1 = r12.f18283Q
            int r2 = r54.mo12884J()
            int r1 = r1 + r2
            int r2 = r54.mo12882H()
            int r2 = r2 + r0
            int r3 = r54.mo12901a()
            int r3 = r3 + r1
            com.facebook.litho.cb r46 = r54.mo12945ar()
            com.facebook.litho.cb r47 = r54.mo12942ao()
            com.facebook.litho.cb r49 = r54.mo12939al()
            com.facebook.litho.cb r50 = r54.mo12943ap()
            com.facebook.litho.cb r51 = r54.mo12940am()
            com.facebook.litho.cb r48 = r54.mo12941an()
            com.facebook.litho.cb r52 = r54.mo12944aq()
            com.facebook.litho.q r4 = r54.mo12936ai()
            r54.mo12907aF()
            java.lang.String r5 = com.facebook.litho.C6103an.m15882i(r4)
            if (r4 != 0) goto L_0x0584
            java.lang.String r5 = "null"
        L_0x0584:
            r38 = r5
            com.facebook.c.e.e r5 = new com.facebook.c.e.e
            if (r4 == 0) goto L_0x058f
            java.lang.String r4 = r4.mo13461q()
            goto L_0x0591
        L_0x058f:
            java.lang.String r4 = "Unknown"
        L_0x0591:
            r39 = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r0, r1, r2, r3)
            if (r10 == 0) goto L_0x059d
            r41 = 1
            goto L_0x059f
        L_0x059d:
            r41 = 0
        L_0x059f:
            if (r10 == 0) goto L_0x05ac
            com.facebook.c.v r0 = r10.f17827b
            com.facebook.litho.du r0 = (com.facebook.litho.C6201du) r0
            com.facebook.litho.de r0 = r0.f18345a
            long r0 = r0.f18263m
            r42 = r0
            goto L_0x05ae
        L_0x05ac:
            r42 = r21
        L_0x05ae:
            float r44 = r54.mo12892R()
            float r45 = r54.mo12893S()
            r37 = r5
            r40 = r4
            r37.<init>(r38, r39, r40, r41, r42, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            java.util.List r0 = r12.f18304i
            r0.add(r5)
        L_0x05c2:
            java.util.List r0 = r12.f18281O
            if (r0 == 0) goto L_0x0607
            java.lang.String r0 = r54.mo12908aG()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0607
            int r0 = r12.f18282P
            int r1 = r54.mo12883I()
            int r0 = r0 + r1
            int r1 = r12.f18283Q
            int r2 = r54.mo12884J()
            int r1 = r1 + r2
            int r2 = r54.mo12882H()
            int r3 = r54.mo12901a()
            com.facebook.litho.fy r4 = new com.facebook.litho.fy
            r4.<init>()
            java.lang.String r5 = r54.mo12908aG()
            r4.f18546a = r5
            android.graphics.Rect r5 = r4.f18549d
            int r2 = r2 + r0
            int r3 = r3 + r1
            r5.set(r0, r1, r2, r3)
            long r0 = r12.f18285S
            r4.f18547b = r0
            if (r7 == 0) goto L_0x0602
            long r0 = r7.f18263m
            r4.f18548c = r0
        L_0x0602:
            java.util.List r0 = r12.f18281O
            r0.add(r4)
        L_0x0607:
            java.util.ArrayList r0 = r54.mo12913aL()
            if (r0 == 0) goto L_0x067a
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x067a
            com.facebook.litho.hp r1 = r12.f18271D
            if (r1 != 0) goto L_0x061e
            com.facebook.litho.hp r1 = new com.facebook.litho.hp
            r1.<init>()
            r12.f18271D = r1
        L_0x061e:
            int r1 = r0.size()
            r10 = 0
        L_0x0623:
            if (r10 >= r1) goto L_0x067a
            java.lang.Object r2 = r0.get(r10)
            com.facebook.litho.ho r2 = (com.facebook.litho.C6390ho) r2
            com.facebook.litho.hp r3 = r12.f18271D
            java.lang.String r4 = r2.f18910a
            com.facebook.litho.hm r5 = r2.f18911b
            com.facebook.litho.q r6 = r2.f18912c
            java.lang.String r2 = r2.f18913d
            java.util.Map r8 = r3.f18914a
            if (r8 != 0) goto L_0x0640
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r3.f18914a = r8
        L_0x0640:
            int r8 = r5.hashCode()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            java.lang.String r14 = "_"
            r13.append(r14)
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            java.util.Map r13 = r3.f18914a
            java.lang.Object r13 = r13.get(r8)
            com.facebook.litho.hn r13 = (com.facebook.litho.C6389hn) r13
            if (r13 != 0) goto L_0x066d
            java.util.Map r3 = r3.f18914a
            com.facebook.litho.hn r13 = new com.facebook.litho.hn
            r13.<init>(r4, r5, r6, r2)
            r3.put(r8, r13)
            goto L_0x0677
        L_0x066d:
            java.util.List r3 = r13.f18908c
            r3.add(r6)
            java.util.List r3 = r13.f18909d
            r3.add(r2)
        L_0x0677:
            int r10 = r10 + 1
            goto L_0x0623
        L_0x067a:
            if (r9 == 0) goto L_0x0706
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r7 == 0) goto L_0x0689
            android.graphics.Rect r1 = r7.f18256f
            r0.set(r1)
            goto L_0x06ad
        L_0x0689:
            int r1 = r12.f18282P
            int r2 = r54.mo12883I()
            int r1 = r1 + r2
            r0.left = r1
            int r1 = r12.f18283Q
            int r2 = r54.mo12884J()
            int r1 = r1 + r2
            r0.top = r1
            int r1 = r0.left
            int r2 = r54.mo12882H()
            int r1 = r1 + r2
            r0.right = r1
            int r1 = r0.top
            int r2 = r54.mo12901a()
            int r1 = r1 + r2
            r0.bottom = r1
        L_0x06ad:
            java.util.List r1 = r54.mo12914aM()
            java.util.List r2 = r54.mo12915aN()
            int r2 = r2.size()
            r10 = 0
        L_0x06ba:
            if (r10 >= r2) goto L_0x0706
            java.util.List r3 = r54.mo12915aN()
            java.lang.Object r3 = r3.get(r10)
            com.facebook.litho.q r3 = (com.facebook.litho.C6407q) r3
            if (r1 == 0) goto L_0x06ce
            java.lang.Object r4 = r1.get(r10)
            java.lang.String r4 = (java.lang.String) r4
        L_0x06ce:
            java.lang.String r4 = com.facebook.litho.C6103an.m15882i(r3)
            com.facebook.litho.u r5 = r3.f18995r
            if (r5 == 0) goto L_0x06f7
            com.facebook.litho.ComponentTree r5 = r5.f19017j
            if (r5 == 0) goto L_0x06f7
            java.util.List r5 = r12.f18293a
            if (r5 == 0) goto L_0x06e1
            r5.add(r3)
        L_0x06e1:
            boolean r5 = r3.mo12816ag()
            if (r5 == 0) goto L_0x06f7
            java.util.Map r5 = r12.f18272E
            if (r5 != 0) goto L_0x06f2
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r12.f18272E = r5
        L_0x06f2:
            java.util.Map r5 = r12.f18272E
            r5.put(r4, r3)
        L_0x06f7:
            if (r4 == 0) goto L_0x0703
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r0)
            java.util.Map r5 = r12.f18276J
            r5.put(r4, r3)
        L_0x0703:
            int r10 = r10 + 1
            goto L_0x06ba
        L_0x0706:
            long r0 = r12.f18285S
            r2 = r32
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x071a
            r12.f18285S = r2
            r0 = r34
            r12.f18286T = r0
            int r0 = r12.f18284R
            int r0 = r0 + -1
            r12.f18284R = r0
        L_0x071a:
            r0 = r36
            r12.f18287U = r0
            m16350v(r55)
            r0 = r30
            r12.f18291Y = r0
            r0 = r31
            r12.f18292Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6187dg.m16353y(com.facebook.litho.u, com.facebook.litho.do, com.facebook.litho.dg, com.facebook.c.s, com.facebook.litho.bc):void");
    }

    /* renamed from: z */
    private static C6185de m16354z(C6060s sVar, C6195do doVar, C6187dg dgVar, C6185de deVar, Drawable drawable, int i, boolean z) {
        C6187dg dgVar2 = dgVar;
        C6185de deVar2 = deVar;
        C6134bo boVar = new C6134bo(drawable);
        boolean z2 = deVar2 != null ? !boVar.mo12809aC(deVar2.f18255e, boVar) : false;
        long j = deVar2 != null ? deVar2.f18263m : -1;
        C6195do doVar2 = doVar;
        boVar.mo12803W(dgVar2.f18298c, doVar2);
        C6185de t = m16348t(boVar, (String) null, dgVar2.f18285S, dgVar, doVar2, false, 2, dgVar2.f18287U, false, z);
        dgVar.m16343A(t, dgVar2.f18284R, i, j, z2);
        C6060s sVar2 = sVar;
        m16344h(dgVar2, t, sVar);
        m16346l(dgVar2.f18305j, t, dgVar2.f18303h.size() - 1);
        m16351w(dgVar2.f18292Z, i, t);
        return t;
    }

    /* renamed from: a */
    public final int mo12597a() {
        return this.f18303h.size();
    }

    /* renamed from: b */
    public final int mo13124b() {
        List list = this.f18281O;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: c */
    public final C6282fy mo13125c(int i) {
        List list = this.f18281O;
        if (list == null) {
            return null;
        }
        return (C6282fy) list.get(i);
    }

    /* renamed from: d */
    public final C6060s mo12598d(int i) {
        return (C6060s) this.f18303h.get(i);
    }

    /* renamed from: e */
    public final int mo12586e() {
        return this.f18279M.size();
    }

    /* renamed from: f */
    public final int mo12622f(long j) {
        return ((Integer) this.f18305j.mo3679f(j, -1)).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C6181da mo13157g(C6407q qVar) {
        return (C6181da) this.f18309n.get(Integer.valueOf(qVar.f18989l));
    }

    /* renamed from: i */
    public final C6028d mo12587i(long j) {
        return (C6028d) this.f18279M.get(Long.valueOf(j));
    }

    /* renamed from: k */
    public final Collection mo12588k() {
        return this.f18279M.values();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo13158m(C6407q qVar) {
        this.f18309n.remove(Integer.valueOf(qVar.f18989l));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo13159n() {
        return C6067a.m15730c(this.f18289W) == this.f18290X;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo13160o(int i, int i2, int i3) {
        return this.f18299d.f18989l == i && mo13161p(i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo13161p(int i, int i2) {
        return C6235ei.m16506a(this.f18300e, i, this.f18313r) && C6235ei.m16506a(this.f18301f, i2, this.f18314s);
    }

    /* renamed from: q */
    public final boolean mo12599q() {
        return this.f18298c.f19017j.f17919v;
    }

    /* renamed from: r */
    public final boolean mo12589r(long j) {
        return this.f18308m.contains(Long.valueOf(j));
    }
}
