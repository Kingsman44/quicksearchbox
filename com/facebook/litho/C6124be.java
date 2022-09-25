package com.facebook.litho;

import android.animation.StateListAnimator;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.p097i.C1970e;
import com.facebook.litho.p325d.C6180a;
import com.facebook.yoga.C6565a;
import com.facebook.yoga.C6569e;
import com.facebook.yoga.C6570f;
import com.facebook.yoga.C6575k;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.litho.be */
/* compiled from: PG */
public final class C6124be implements Cloneable, C6181da {

    /* renamed from: A */
    private List f18072A;

    /* renamed from: B */
    private Paint f18073B;

    /* renamed from: C */
    private boolean f18074C;

    /* renamed from: D */
    private boolean f18075D;

    /* renamed from: E */
    private int f18076E = -1;

    /* renamed from: F */
    private int f18077F = 0;

    /* renamed from: G */
    private float f18078G = Float.NaN;

    /* renamed from: H */
    private float f18079H = Float.NaN;

    /* renamed from: I */
    private float f18080I = Float.NaN;

    /* renamed from: J */
    private float f18081J = Float.NaN;

    /* renamed from: K */
    private float f18082K = Float.NaN;

    /* renamed from: L */
    private float f18083L = Float.NaN;

    /* renamed from: M */
    private int f18084M = -1;

    /* renamed from: N */
    private int f18085N = -1;

    /* renamed from: O */
    private float f18086O = -1.0f;

    /* renamed from: P */
    private float f18087P = -1.0f;

    /* renamed from: Q */
    private long f18088Q;

    /* renamed from: R */
    private C6122bc f18089R;

    /* renamed from: a */
    public C6575k f18090a;

    /* renamed from: b */
    private C6411u f18091b;

    /* renamed from: c */
    private List f18092c = new ArrayList(1);

    /* renamed from: d */
    private List f18093d;

    /* renamed from: e */
    private final int[] f18094e = new int[4];

    /* renamed from: f */
    private final float[] f18095f = new float[4];

    /* renamed from: g */
    private C6248ev f18096g;

    /* renamed from: h */
    private C6178cz f18097h;

    /* renamed from: i */
    private C6154cb f18098i;

    /* renamed from: j */
    private C6154cb f18099j;

    /* renamed from: k */
    private C6154cb f18100k;

    /* renamed from: l */
    private C6154cb f18101l;

    /* renamed from: m */
    private C6154cb f18102m;

    /* renamed from: n */
    private C6154cb f18103n;

    /* renamed from: o */
    private C6154cb f18104o;

    /* renamed from: p */
    private Drawable f18105p;

    /* renamed from: q */
    private boolean[] f18106q;

    /* renamed from: r */
    private C6139bt f18107r;

    /* renamed from: s */
    private String f18108s;

    /* renamed from: t */
    private String f18109t;

    /* renamed from: u */
    private C6362go f18110u;

    /* renamed from: v */
    private ArrayList f18111v;

    /* renamed from: w */
    private Map f18112w;

    /* renamed from: x */
    private ArrayList f18113x;

    /* renamed from: y */
    private String f18114y;

    /* renamed from: z */
    private Set f18115z;

    protected C6124be(C6411u uVar, C6575k kVar) {
        this.f18091b = uVar;
        ((YogaNodeJNIBase) kVar).f19544b = this;
        this.f18090a = kVar;
        this.f18115z = new HashSet();
        boolean z = C6180a.f18234a;
        this.f18093d = null;
    }

    /* renamed from: bZ */
    private final C6139bt m15922bZ() {
        C6178cz as = mo12946as();
        if (as.f18228d == null) {
            as.f18228d = new C6139bt();
        }
        return as.f18228d;
    }

    /* renamed from: ca */
    private static C6154cb m15923ca(C6154cb cbVar, C6154cb cbVar2) {
        return cbVar == null ? cbVar2 : cbVar2 == null ? cbVar : new C6127bh(cbVar, cbVar2);
    }

    /* renamed from: cb */
    private static C6181da m15924cb(C6188dh dhVar, C6411u uVar, C6124be beVar, C6407q qVar, String str, Set set) {
        C6411u uVar2 = qVar.f18995r;
        List list = beVar.f18092c;
        List list2 = beVar.f18093d;
        C6407q ah = beVar.mo12935ah();
        if (!(uVar2 == null || ah == null || beVar.mo12998bs())) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                C6407q qVar2 = (C6407q) list.get(i);
                if (list2 != null) {
                    String str2 = (String) list2.get(i);
                }
                if (!set.contains(C6103an.m15882i(qVar2))) {
                    i++;
                }
            }
            beVar.mo12976bV();
            String E = C6407q.m17273E(ah);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).startsWith(E)) {
                    return m15925cc(dhVar, beVar, qVar, str, set, 1);
                }
            }
            boolean z = C6180a.f18234a;
            return m15925cc(dhVar, beVar, qVar, str, set, 0);
        }
        return C6184dd.m16302a(uVar, qVar, false, true, str);
    }

    /* renamed from: cc */
    private static C6181da m15925cc(C6188dh dhVar, C6124be beVar, C6407q qVar, String str, Set set, int i) {
        ArrayList arrayList;
        String str2;
        C6181da daVar;
        C6124be beVar2 = beVar;
        C6407q qVar2 = qVar;
        C6575k kVar = beVar2.f18090a;
        C6575k h = kVar.mo13687h();
        C6124be ak = beVar.clone();
        ak.f18092c = new ArrayList();
        if (ak.f18093d != null) {
            ak.f18093d = new ArrayList();
        }
        ak.f18089R = null;
        ak.f18115z = null;
        ak.f18078G = Float.NaN;
        ak.f18079H = Float.NaN;
        ak.f18080I = Float.NaN;
        ak.f18081J = Float.NaN;
        ak.f18082K = Float.NaN;
        ak.f18083L = Float.NaN;
        int size = beVar2.f18092c.size();
        ArrayList arrayList2 = new ArrayList(size);
        if (beVar2.f18093d == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(size);
        }
        arrayList2.add(qVar2);
        if (arrayList != null) {
            arrayList.add(str);
        }
        C6411u uVar = qVar2.f18995r;
        for (int i2 = size - 2; i2 >= 0; i2--) {
            C6407q qVar3 = (C6407q) beVar2.f18092c.get(i2);
            List list = beVar2.f18093d;
            if (list != null) {
                String str3 = (String) list.get(i2);
            }
            String i3 = C6103an.m15882i(qVar3);
            C6407q G = ((C6407q) beVar2.f18092c.get(i2)).mo13454G(uVar);
            arrayList2.add(G);
            if (beVar2.f18093d != null) {
                arrayList.add(i3);
            }
            uVar = G.f18995r;
        }
        Collections.reverse(arrayList2);
        if (arrayList != null) {
            Collections.reverse(arrayList);
        }
        C1970e eVar = new C1970e(arrayList2, arrayList);
        C6411u uVar2 = qVar2.f18995r;
        List list2 = (List) eVar.f5888a;
        List list3 = (List) eVar.f5889b;
        ak.f18091b = uVar2;
        ak.f18090a = h;
        h.mo13700t(ak);
        ak.f18092c = list2;
        ak.f18093d = list3;
        ak.f18089R = null;
        ak.f18112w = null;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C6407q qVar4 = (C6407q) list2.get(i4);
            if (list3 != null) {
                String str4 = (String) list3.get(i4);
            }
            C6103an.m15882i(qVar4);
        }
        ArrayList arrayList3 = ak.f18113x;
        ak.f18113x = null;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            ak.f18113x = new ArrayList(arrayList3.size());
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                C6390ho hoVar = (C6390ho) arrayList3.get(i5);
                ak.f18113x.add(new C6390ho(hoVar.f18910a, hoVar.f18911b, hoVar.f18912c.mo13454G(uVar2), hoVar.f18913d));
            }
        }
        C6407q ai = ak.mo12936ai();
        ak.mo12907aF();
        C6411u uVar3 = ai.f18995r;
        if (ak.mo12948au() != null) {
            ak.mo12946as().f18226b = null;
        }
        int e = kVar.mo13684e();
        for (int i6 = 0; i6 < e; i6++) {
            C6124be beVar3 = (C6124be) kVar.mo13688i(i6).mo13692m();
            List list4 = beVar3.f18092c;
            List list5 = beVar3.f18093d;
            int max = Math.max(0, list4.size() - 1);
            C6407q qVar5 = (C6407q) list4.get(max);
            if (list5 == null) {
                str2 = null;
            } else {
                str2 = (String) list5.get(max);
            }
            C6407q G2 = qVar5.mo13454G(uVar3);
            if (i == 0) {
                daVar = m15925cc(dhVar, beVar3, G2, str2, set, 0);
            } else {
                daVar = m15924cb(dhVar, uVar3, beVar3, G2, str2, set);
            }
            ak.mo12956bB(daVar);
        }
        return ak;
    }

    /* renamed from: cd */
    private final void m15926cd(C6181da daVar) {
        if (C6180a.f18234a && daVar != null) {
            C6110au.m15901m(this.f18091b, daVar);
            int T = daVar.mo12894T();
            for (int i = 0; i < T; i++) {
                m15926cd(daVar.mo12947at(i));
            }
            if (daVar.mo12987bh()) {
                m15926cd(daVar.mo12948au());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f18096g;
     */
    /* renamed from: ce */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m15927ce() {
        /*
            r1 = this;
            com.facebook.litho.bt r0 = r1.f18107r
            if (r0 == 0) goto L_0x0010
            com.facebook.litho.ev r0 = r1.f18096g
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.mo13067ai()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6124be.m15927ce():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r0 == r1) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r0 == r1) goto L_0x0028;
     */
    /* renamed from: cf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float m15928cf(com.facebook.litho.C6139bt r7, int r8) {
        /*
            r6 = this;
            com.facebook.yoga.k r0 = r6.f18090a
            com.facebook.yoga.f r0 = r0.mo13685f()
            com.facebook.yoga.f r1 = com.facebook.yoga.C6570f.RTL
            int r2 = r8 + -1
            r3 = 6
            r4 = 5
            if (r2 == 0) goto L_0x0024
            r5 = 2
            if (r2 != r5) goto L_0x0014
            if (r0 != r1) goto L_0x0028
            goto L_0x0027
        L_0x0014:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Not an horizontal padding edge: "
            java.lang.String r8 = com.facebook.yoga.C6571g.m17938a(r8)
            java.lang.String r8 = r0.concat(r8)
            r7.<init>(r8)
            throw r7
        L_0x0024:
            if (r0 != r1) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r3 = 5
        L_0x0028:
            float r0 = r7.mo13121d(r3)
            boolean r1 = com.facebook.yoga.C6569e.m17936a(r0)
            if (r1 == 0) goto L_0x0037
            float r7 = r7.mo13120c(r8)
            return r7
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6124be.m15928cf(com.facebook.litho.bt, int):float");
    }

    /* renamed from: cg */
    private final void m15929cg(int i, boolean z) {
        if (this.f18106q == null && z) {
            this.f18106q = new boolean[9];
        }
        boolean[] zArr = this.f18106q;
        if (zArr != null) {
            zArr[i - 1] = z;
        }
    }

    /* renamed from: B */
    public final void mo12876B(int i, float f) {
        this.f18088Q |= 2048;
        this.f18090a.mo13677aa(i, f);
    }

    /* renamed from: C */
    public final void mo12877C(int i, int i2) {
        this.f18088Q |= 2048;
        this.f18090a.mo13675Z(i, (float) i2);
    }

    /* renamed from: D */
    public final int mo12878D() {
        return C6159cg.m16231a(this.f18090a.mo13669T(4));
    }

    /* renamed from: E */
    public final int mo12879E() {
        return C6159cg.m16231a(this.f18090a.mo13669T(1));
    }

    /* renamed from: F */
    public final int mo12880F() {
        return C6159cg.m16231a(this.f18090a.mo13669T(3));
    }

    /* renamed from: G */
    public final int mo12881G() {
        return C6159cg.m16231a(this.f18090a.mo13669T(2));
    }

    /* renamed from: H */
    public final int mo12882H() {
        if (C6569e.m17936a(this.f18082K)) {
            this.f18082K = this.f18090a.mo13680b();
        }
        return (int) this.f18082K;
    }

    /* renamed from: I */
    public final int mo12883I() {
        if (C6569e.m17936a(this.f18080I)) {
            this.f18080I = this.f18090a.mo13682c();
        }
        return (int) this.f18080I;
    }

    /* renamed from: J */
    public final int mo12884J() {
        if (C6569e.m17936a(this.f18081J)) {
            this.f18081J = this.f18090a.mo13683d();
        }
        return (int) this.f18081J;
    }

    /* renamed from: K */
    public final Drawable mo12885K() {
        return this.f18105p;
    }

    /* renamed from: L */
    public final C6570f mo12886L() {
        return this.f18090a.mo13685f();
    }

    /* renamed from: M */
    public final boolean mo12887M() {
        return (this.f18088Q & 1024) != 0;
    }

    /* renamed from: N */
    public final float mo12888N() {
        return this.f18087P;
    }

    /* renamed from: O */
    public final float mo12889O() {
        return this.f18086O;
    }

    /* renamed from: P */
    public final float mo12890P() {
        return this.f18090a.mo13690k().f19565a;
    }

    /* renamed from: Q */
    public final float mo12891Q() {
        return this.f18090a.mo13691l().f19565a;
    }

    /* renamed from: R */
    public final float mo12892R() {
        return 0.0f;
    }

    /* renamed from: S */
    public final float mo12893S() {
        return 0.0f;
    }

    /* renamed from: T */
    public final int mo12894T() {
        return this.f18090a.mo13684e();
    }

    /* renamed from: U */
    public final int mo12895U() {
        return this.f18077F;
    }

    /* renamed from: V */
    public final int mo12896V() {
        return this.f18085N;
    }

    /* renamed from: W */
    public final int mo12897W() {
        return this.f18084M;
    }

    /* renamed from: X */
    public final int mo12898X() {
        return this.f18076E;
    }

    /* renamed from: Y */
    public final int mo12899Y() {
        return 0;
    }

    /* renamed from: Z */
    public final int mo12900Z() {
        if (!m15927ce()) {
            return 0;
        }
        return C6159cg.m16231a(this.f18107r.mo13120c(4));
    }

    /* renamed from: a */
    public final int mo12901a() {
        if (C6569e.m17936a(this.f18083L)) {
            this.f18083L = this.f18090a.mo13676a();
        }
        return (int) this.f18083L;
    }

    /* renamed from: aA */
    public final C6362go mo12902aA() {
        return this.f18110u;
    }

    /* renamed from: aB */
    public final C6381hf mo12903aB() {
        C6178cz czVar = this.f18097h;
        if (czVar != null) {
            return czVar.f18230f;
        }
        return null;
    }

    /* renamed from: aC */
    public final C6570f mo12904aC() {
        return this.f18090a.mo13686g();
    }

    /* renamed from: aD */
    public final C6570f mo12905aD() {
        C6575k kVar = this.f18090a;
        while (kVar != null && kVar.mo13685f() == C6570f.INHERIT) {
            kVar = kVar.mo13689j();
        }
        return kVar == null ? C6570f.INHERIT : kVar.mo13685f();
    }

    /* renamed from: aE */
    public final C6575k mo12906aE() {
        return this.f18090a;
    }

    /* renamed from: aF */
    public final String mo12907aF() {
        List list = this.f18093d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) this.f18093d.get(0);
    }

    /* renamed from: aG */
    public final String mo12908aG() {
        return this.f18114y;
    }

    /* renamed from: aH */
    public final String mo12909aH() {
        C6407q ai = mo12936ai();
        if (ai == null) {
            return null;
        }
        mo12907aF();
        return C6407q.m17273E(ai);
    }

    /* renamed from: aI */
    public final String mo12910aI() {
        return this.f18108s;
    }

    /* renamed from: aJ */
    public final String mo12911aJ() {
        return this.f18109t;
    }

    /* renamed from: aK */
    public final ArrayList mo12912aK() {
        return this.f18111v;
    }

    /* renamed from: aL */
    public final ArrayList mo12913aL() {
        return this.f18113x;
    }

    /* renamed from: aM */
    public final List mo12914aM() {
        return this.f18093d;
    }

    /* renamed from: aN */
    public final List mo12915aN() {
        return this.f18092c;
    }

    /* renamed from: aO */
    public final Map mo12916aO() {
        return null;
    }

    /* renamed from: aP */
    public final void mo12917aP(C6365gr grVar) {
        if (this.f18111v == null) {
            this.f18111v = new ArrayList(1);
        }
        this.f18111v.add(grVar);
    }

    /* renamed from: aQ */
    public final void mo12918aQ(List list) {
        if (this.f18113x == null) {
            this.f18113x = new ArrayList(list.size());
        }
        this.f18113x.addAll(list);
    }

    /* renamed from: aR */
    public final void mo12919aR(C6407q qVar, String str) {
        this.f18092c.add(qVar);
        List list = this.f18093d;
        if (list != null) {
            list.add(str);
        }
    }

    /* renamed from: aS */
    public final void mo12920aS(C6407q qVar) {
        if (this.f18072A == null) {
            this.f18072A = new ArrayList();
        }
        this.f18072A.add(qVar);
    }

    /* renamed from: aT */
    public final void mo12921aT() {
        List list = null;
        if ((this.f18088Q & 2) != 0) {
            list = C6404n.m17222a((List) null, "alignSelf");
        }
        if ((this.f18088Q & 4) != 0) {
            list = C6404n.m17222a(list, "positionType");
        }
        if ((this.f18088Q & 8) != 0) {
            list = C6404n.m17222a(list, "flex");
        }
        if ((this.f18088Q & 16) != 0) {
            list = C6404n.m17222a(list, "flexGrow");
        }
        if ((this.f18088Q & 512) != 0) {
            list = C6404n.m17222a(list, "margin");
        }
        if (list != null) {
            String valueOf = String.valueOf(TextUtils.join(", ", list));
            String simpleName = mo12936ai().getClass().getSimpleName();
            C6106aq.m15891b(1, "DefaultInternalNode:ContextSpecificStyleSet", "You should not set " + valueOf + " to a root layout in " + simpleName);
        }
    }

    /* renamed from: aU */
    public final void mo12922aU(C6139bt btVar, int[] iArr, float[] fArr) {
        this.f18088Q |= 268435456;
        this.f18090a.mo13670U(1, btVar.mo13121d(1));
        this.f18090a.mo13670U(2, btVar.mo13121d(2));
        this.f18090a.mo13670U(3, btVar.mo13121d(3));
        this.f18090a.mo13670U(4, btVar.mo13121d(4));
        this.f18090a.mo13670U(8, btVar.mo13121d(8));
        this.f18090a.mo13670U(7, btVar.mo13121d(7));
        this.f18090a.mo13670U(5, btVar.mo13121d(5));
        this.f18090a.mo13670U(6, btVar.mo13121d(6));
        this.f18090a.mo13670U(9, btVar.mo13121d(9));
        System.arraycopy(iArr, 0, this.f18094e, 0, 4);
        System.arraycopy(fArr, 0, this.f18095f, 0, 4);
    }

    /* renamed from: aV */
    public final void mo12923aV(float f, float f2) {
        m15926cd(this);
        this.f18090a.mo13695o(f, f2);
        for (C6407q ay : this.f18092c) {
            ay.mo12833ay();
        }
    }

    /* renamed from: aW */
    public final void mo12924aW(C6403m mVar) {
        mVar.mo13414b("DefaultInternalNode 0x%08X", Integer.valueOf(System.identityHashCode(this)));
        mVar.mo13413a();
        mVar.mo13414b("mYogaNode.isDirty(): %b", Boolean.valueOf(this.f18090a.mo13661L()));
        mVar.mo13414b("resolvedRect: [%.2f, %.2f, %.2f, %.2f]", Float.valueOf(this.f18080I), Float.valueOf(this.f18081J), Float.valueOf(this.f18082K), Float.valueOf(this.f18083L));
        for (C6407q qVar : this.f18092c) {
            mVar.mo13415c("Component");
            mVar.mo13413a();
            mVar.mo13414b("mId: %d", Integer.valueOf(qVar.f18989l));
            mVar.mo13414b("mGlobalKey: '%s'", qVar.f18991n);
            mVar.mo13414b("mKey: '%s'", qVar.f18992o);
            mVar.mo13414b("mSimpleName: '%s'", qVar.f18986i);
            mVar.mo13414b("mIsLayoutStarted: %b", Boolean.valueOf(qVar.f18996s));
            mVar.mo13416d();
        }
        for (int i = 0; i < this.f18090a.mo13684e(); i++) {
            C6181da at = mo12947at(i);
            if (at == null) {
                mVar.mo13415c("NULL CHILD");
            } else {
                at.mo12924aW(mVar);
            }
        }
        mVar.mo13416d();
    }

    /* renamed from: aX */
    public final void mo12925aX(C6110au auVar) {
        if (this.f18115z == null) {
            this.f18115z = new HashSet();
        }
        this.f18115z.add(auVar);
    }

    /* renamed from: aY */
    public final void mo12926aY(int i) {
        this.f18085N = i;
    }

    /* renamed from: aZ */
    public final void mo12927aZ(float f) {
        this.f18087P = f;
    }

    /* renamed from: aa */
    public final int mo12928aa() {
        if (!m15927ce()) {
            return 0;
        }
        if (C6569e.m17936a(this.f18078G)) {
            this.f18078G = m15928cf(this.f18107r, 1);
        }
        return C6159cg.m16231a(this.f18078G);
    }

    /* renamed from: ab */
    public final int mo12929ab() {
        if (!m15927ce()) {
            return 0;
        }
        if (C6569e.m17936a(this.f18079H)) {
            this.f18079H = m15928cf(this.f18107r, 3);
        }
        return C6159cg.m16231a(this.f18079H);
    }

    /* renamed from: ac */
    public final int mo12930ac() {
        if (!m15927ce()) {
            return 0;
        }
        return C6159cg.m16231a(this.f18107r.mo13120c(2));
    }

    /* renamed from: ad */
    public final StateListAnimator mo12931ad() {
        return null;
    }

    /* renamed from: ae */
    public final Paint mo12932ae() {
        return this.f18073B;
    }

    /* renamed from: af */
    public final PathEffect mo12933af() {
        return null;
    }

    /* renamed from: ag */
    public final Drawable mo12934ag() {
        return null;
    }

    /* renamed from: ah */
    public final C6407q mo12935ah() {
        if (this.f18092c.isEmpty()) {
            return null;
        }
        List list = this.f18092c;
        return (C6407q) list.get(list.size() - 1);
    }

    /* renamed from: ai */
    public final C6407q mo12936ai() {
        if (this.f18092c.isEmpty()) {
            return null;
        }
        return (C6407q) this.f18092c.get(0);
    }

    /* renamed from: aj */
    public final C6411u mo12937aj() {
        return this.f18091b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ak */
    public final C6124be clone() {
        try {
            return (C6124be) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: al */
    public final C6154cb mo12939al() {
        return this.f18100k;
    }

    /* renamed from: am */
    public final C6154cb mo12940am() {
        return this.f18102m;
    }

    /* renamed from: an */
    public final C6154cb mo12941an() {
        return this.f18103n;
    }

    /* renamed from: ao */
    public final C6154cb mo12942ao() {
        return this.f18099j;
    }

    /* renamed from: ap */
    public final C6154cb mo12943ap() {
        return this.f18101l;
    }

    /* renamed from: aq */
    public final C6154cb mo12944aq() {
        return this.f18104o;
    }

    /* renamed from: ar */
    public final C6154cb mo12945ar() {
        return this.f18098i;
    }

    /* renamed from: as */
    public final C6178cz mo12946as() {
        if (this.f18097h == null) {
            this.f18097h = new C6178cz();
        }
        return this.f18097h;
    }

    /* renamed from: at */
    public final C6181da mo12947at(int i) {
        return (C6181da) this.f18090a.mo13688i(i).mo13692m();
    }

    /* renamed from: au */
    public final C6181da mo12948au() {
        C6178cz czVar = this.f18097h;
        if (czVar != null) {
            return czVar.f18226b;
        }
        return null;
    }

    /* renamed from: av */
    public final C6181da mo12949av() {
        C6178cz czVar = this.f18097h;
        if (czVar != null) {
            return czVar.f18227c;
        }
        return null;
    }

    /* renamed from: aw */
    public final C6181da mo12950aw() {
        C6575k kVar = this.f18090a;
        if (kVar == null || kVar.mo13689j() == null) {
            return null;
        }
        return (C6181da) kVar.mo13689j().mo13692m();
    }

    /* renamed from: ax */
    public final C6181da mo12951ax(C6188dh dhVar, C6411u uVar, C6407q qVar, String str) {
        Set set;
        C6280fw fwVar = uVar.f19010c;
        if (fwVar == null) {
            set = Collections.emptySet();
        } else {
            set = fwVar.mo13281f();
        }
        return m15924cb(dhVar, uVar, this, qVar, str, set);
    }

    /* renamed from: ay */
    public final C6248ev mo12952ay() {
        return this.f18096g;
    }

    /* renamed from: az */
    public final C6248ev mo12953az() {
        if (this.f18096g == null) {
            this.f18096g = new C6126bg();
        }
        return this.f18096g;
    }

    /* renamed from: b */
    public final void mo12954b(C6565a aVar) {
        this.f18088Q |= 2;
        this.f18090a.mo13698r(aVar);
    }

    /* renamed from: bA */
    public final void mo12955bA(C6407q qVar) {
        if (qVar != null) {
            mo12956bB(C6184dd.m16302a(this.f18091b, qVar, false, false, (String) null));
        }
    }

    /* renamed from: bB */
    public final void mo12956bB(C6181da daVar) {
        if (daVar != null && daVar != C6411u.f19008a) {
            this.f18090a.mo13694n(daVar.mo12906aE(), this.f18090a.mo13684e());
        }
    }

    /* renamed from: bC */
    public final void mo12957bC() {
        this.f18088Q |= 8589934592L;
    }

    /* renamed from: bD */
    public final void mo12958bD(C6154cb cbVar) {
        this.f18088Q |= 2097152;
        this.f18100k = m15923ca(this.f18100k, cbVar);
    }

    /* renamed from: bE */
    public final void mo12959bE(C6154cb cbVar) {
        this.f18088Q |= 4194304;
        this.f18102m = m15923ca(this.f18102m, cbVar);
    }

    /* renamed from: bF */
    public final void mo12960bF(int i) {
        this.f18088Q |= 128;
        this.f18077F = i;
    }

    /* renamed from: bG */
    public final void mo12961bG(C6154cb cbVar) {
        this.f18088Q |= 8388608;
        this.f18103n = m15923ca(this.f18103n, cbVar);
    }

    /* renamed from: bH */
    public final void mo12962bH(int i, Paint paint) {
        if (i != -1) {
            this.f18076E = i;
            this.f18073B = paint;
        }
    }

    /* renamed from: bI */
    public final void mo12963bI(C6154cb cbVar) {
        this.f18088Q |= Long.MIN_VALUE;
        this.f18099j = m15923ca(this.f18099j, cbVar);
    }

    /* renamed from: bJ */
    public final void mo12964bJ() {
        this.f18075D = true;
    }

    /* renamed from: bK */
    public final void mo12965bK() {
        this.f18088Q |= 536870912;
        this.f18074C = true;
    }

    /* renamed from: bL */
    public final void mo12966bL() {
        this.f18088Q |= 1073741824;
        this.f18074C = true;
    }

    /* renamed from: bM */
    public final void mo12967bM(String str) {
        this.f18114y = str;
    }

    /* renamed from: bN */
    public final void mo12968bN(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f18088Q |= 134217728;
            this.f18108s = str;
            this.f18109t = str2;
        }
    }

    /* renamed from: bO */
    public final void mo12969bO(C6362go goVar) {
        this.f18088Q |= 4294967296L;
        this.f18110u = goVar;
    }

    /* renamed from: bP */
    public final void mo12970bP(C6154cb cbVar) {
        this.f18088Q |= 16777216;
        this.f18101l = m15923ca(this.f18101l, cbVar);
    }

    /* renamed from: bQ */
    public final void mo12971bQ(C6154cb cbVar) {
        this.f18088Q |= 2147483648L;
        this.f18104o = m15923ca(this.f18104o, cbVar);
    }

    /* renamed from: bR */
    public final void mo12972bR(C6154cb cbVar) {
        this.f18088Q |= 1048576;
        this.f18098i = m15923ca(this.f18098i, cbVar);
    }

    /* renamed from: bS */
    public final void mo12973bS() {
        this.f18074C = true;
    }

    /* renamed from: bT */
    public final void mo12974bT() {
        this.f18088Q |= 256;
    }

    /* renamed from: bU */
    public final void mo12975bU() {
        this.f18088Q |= 524288;
    }

    /* renamed from: bV */
    public final void mo12976bV() {
        List list = this.f18093d;
        if (list != null && !list.isEmpty()) {
            List list2 = this.f18093d;
            String str = (String) list2.get(list2.size() - 1);
        }
    }

    /* renamed from: bW */
    public final int mo12977bW(int i) {
        return C6159cg.m16231a(this.f18090a.mo13667R(i));
    }

    /* renamed from: bX */
    public final void mo12978bX(int i, int i2) {
        if (this.f18107r == null) {
            this.f18107r = new C6139bt();
        }
        this.f18088Q |= 33554432;
        this.f18107r.mo13122e(i, (float) i2);
    }

    /* renamed from: bY */
    public final void mo12979bY(C6230ed edVar) {
        this.f18090a.mo13678ab(edVar);
    }

    /* renamed from: ba */
    public final void mo12980ba(float f) {
        this.f18086O = f;
    }

    /* renamed from: bb */
    public final void mo12981bb(int i) {
        this.f18084M = i;
    }

    /* renamed from: bc */
    public final void mo12982bc(C6181da daVar) {
        if (daVar != C6411u.f19008a) {
            daVar.mo12946as().f18227c = this;
        }
        mo12946as().f18226b = daVar;
    }

    /* renamed from: bd */
    public final void mo12983bd(C6248ev evVar) {
        this.f18096g = evVar;
    }

    /* renamed from: be */
    public final void mo12984be(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            this.f18090a.mo13651B((float) View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            this.f18090a.mo13706z(Float.NaN);
        } else if (mode == 1073741824) {
            this.f18090a.mo13706z((float) View.MeasureSpec.getSize(i));
        }
    }

    /* renamed from: bf */
    public final void mo12985bf(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            this.f18090a.mo13653D((float) View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            this.f18090a.mo13659J(Float.NaN);
        } else if (mode == 1073741824) {
            this.f18090a.mo13659J((float) View.MeasureSpec.getSize(i));
        }
    }

    /* renamed from: bg */
    public final boolean mo12986bg() {
        return this.f18075D;
    }

    /* renamed from: bh */
    public final boolean mo12987bh() {
        C6178cz czVar = this.f18097h;
        return (czVar == null || czVar.f18226b == null) ? false : true;
    }

    /* renamed from: bi */
    public final boolean mo12988bi() {
        return (this.f18088Q & 1073741824) != 0;
    }

    /* renamed from: bj */
    public final boolean mo12989bj() {
        return (this.f18088Q & 33554432) != 0;
    }

    /* renamed from: bk */
    public final boolean mo12990bk() {
        return !TextUtils.isEmpty(this.f18108s);
    }

    /* renamed from: bl */
    public final boolean mo12991bl() {
        return (this.f18098i == null && this.f18099j == null && this.f18100k == null && this.f18101l == null && this.f18102m == null && this.f18103n == null && this.f18104o == null) ? false : true;
    }

    /* renamed from: bm */
    public final boolean mo12992bm() {
        return false;
    }

    /* renamed from: bn */
    public final boolean mo12993bn() {
        return false;
    }

    /* renamed from: bo */
    public final boolean mo12994bo() {
        return this.f18074C;
    }

    /* renamed from: bp */
    public final boolean mo12995bp() {
        return (this.f18088Q & 128) == 0 || this.f18077F == 0;
    }

    /* renamed from: bq */
    public final boolean mo12996bq() {
        return (this.f18090a == null || this.f18091b == null) ? false : true;
    }

    /* renamed from: br */
    public final boolean mo12997br() {
        return (this.f18088Q & 1) == 0 || this.f18090a.mo13685f() == C6570f.INHERIT;
    }

    /* renamed from: bs */
    public final boolean mo12998bs() {
        C6178cz czVar = this.f18097h;
        return czVar != null && czVar.f18225a;
    }

    /* renamed from: bt */
    public final boolean mo12999bt() {
        int[] iArr = this.f18094e;
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return (this.f18090a.mo13667R(1) == 0.0f && this.f18090a.mo13667R(2) == 0.0f && this.f18090a.mo13667R(3) == 0.0f && this.f18090a.mo13667R(4) == 0.0f) ? false : true;
            }
        }
        return false;
    }

    /* renamed from: bu */
    public final float[] mo13000bu() {
        return this.f18095f;
    }

    /* renamed from: bv */
    public final int[] mo13001bv() {
        return this.f18094e;
    }

    /* renamed from: bw */
    public final C6122bc mo13002bw() {
        return this.f18089R;
    }

    /* renamed from: bx */
    public final void mo13003bx(C6122bc bcVar) {
        this.f18089R = bcVar;
    }

    /* renamed from: by */
    public final void mo13004by(Drawable drawable) {
        this.f18088Q |= 262144;
        this.f18105p = drawable;
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            if (rect.bottom != 0 || rect.top != 0 || rect.left != 0 || rect.right != 0) {
                mo12875A(1, rect.left);
                mo12875A(2, rect.top);
                mo12875A(3, rect.right);
                mo12875A(4, rect.bottom);
            }
        }
    }

    /* renamed from: bz */
    public final void mo13005bz(C6207e eVar) {
        this.f18088Q |= 268435456;
        int[] iArr = eVar.f18353b;
        int i = 0;
        while (true) {
            int i2 = 4;
            if (i < 4) {
                if (i == 0) {
                    i2 = 1;
                } else if (i == 1) {
                    i2 = 2;
                } else if (i == 2) {
                    i2 = 3;
                }
                int i3 = eVar.f18353b[i];
                C6178cz czVar = this.f18097h;
                if (czVar == null || !czVar.f18225a) {
                    this.f18090a.mo13670U(i2, (float) i3);
                } else {
                    C6178cz as = mo12946as();
                    if (as.f18229e == null) {
                        as.f18229e = new C6139bt();
                    }
                    as.f18229e.mo13122e(i2, (float) i3);
                }
                i++;
            } else {
                System.arraycopy(eVar.f18354c, 0, this.f18094e, 0, 4);
                System.arraycopy(eVar.f18352a, 0, this.f18095f, 0, 4);
                PathEffect pathEffect = eVar.f18355d;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo13006c(float f) {
        this.f18088Q |= 67108864;
        this.f18090a.mo13699s(f);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, com.facebook.litho.da] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo12856d(java.lang.Object r8) {
        /*
            r7 = this;
            com.facebook.litho.da r0 = com.facebook.litho.C6411u.f19008a
            if (r8 != r0) goto L_0x0006
            goto L_0x0195
        L_0x0006:
            com.facebook.litho.ev r0 = r7.f18096g
            if (r0 == 0) goto L_0x001b
            com.facebook.litho.ev r1 = r8.mo12952ay()
            if (r1 != 0) goto L_0x0014
            r8.mo12983bd(r0)
            goto L_0x001b
        L_0x0014:
            com.facebook.litho.ev r1 = r8.mo12953az()
            r0.mo13039I(r1)
        L_0x001b:
            boolean r0 = r8.mo12997br()
            if (r0 == 0) goto L_0x002a
            com.facebook.yoga.k r0 = r7.f18090a
            com.facebook.yoga.f r0 = r0.mo13685f()
            r8.mo13014k(r0)
        L_0x002a:
            boolean r0 = r8.mo12995bp()
            if (r0 == 0) goto L_0x0035
            int r0 = r7.f18077F
            r8.mo12960bF(r0)
        L_0x0035:
            long r0 = r7.f18088Q
            r2 = 256(0x100, double:1.265E-321)
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0043
            r8.mo12974bT()
        L_0x0043:
            long r0 = r7.f18088Q
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0052
            r8.mo12957bC()
        L_0x0052:
            long r0 = r7.f18088Q
            r4 = 262144(0x40000, double:1.295163E-318)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0061
            android.graphics.drawable.Drawable r0 = r7.f18105p
            r8.mo13004by(r0)
        L_0x0061:
            long r0 = r7.f18088Q
            r4 = 524288(0x80000, double:2.590327E-318)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006e
            r8.mo12975bU()
        L_0x006e:
            boolean r0 = r7.f18074C
            if (r0 == 0) goto L_0x0075
            r8.mo12973bS()
        L_0x0075:
            long r0 = r7.f18088Q
            r4 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0084
            com.facebook.litho.cb r0 = r7.f18098i
            r8.mo12972bR(r0)
        L_0x0084:
            long r0 = r7.f18088Q
            r4 = -9223372036854775808
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0092
            com.facebook.litho.cb r0 = r7.f18099j
            r8.mo12963bI(r0)
        L_0x0092:
            long r0 = r7.f18088Q
            r4 = 2097152(0x200000, double:1.0361308E-317)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a1
            com.facebook.litho.cb r0 = r7.f18100k
            r8.mo12958bD(r0)
        L_0x00a1:
            long r0 = r7.f18088Q
            r4 = 4194304(0x400000, double:2.0722615E-317)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b0
            com.facebook.litho.cb r0 = r7.f18102m
            r8.mo12959bE(r0)
        L_0x00b0:
            long r0 = r7.f18088Q
            r4 = 8388608(0x800000, double:4.144523E-317)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00bf
            com.facebook.litho.cb r0 = r7.f18103n
            r8.mo12961bG(r0)
        L_0x00bf:
            long r0 = r7.f18088Q
            r4 = 16777216(0x1000000, double:8.289046E-317)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ce
            com.facebook.litho.cb r0 = r7.f18101l
            r8.mo12970bP(r0)
        L_0x00ce:
            long r0 = r7.f18088Q
            r4 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00df
            com.facebook.litho.cb r0 = r7.f18104o
            r8.mo12971bQ(r0)
        L_0x00df:
            java.lang.String r0 = r7.f18114y
            if (r0 == 0) goto L_0x00e6
            r8.mo12967bM(r0)
        L_0x00e6:
            long r0 = r7.f18088Q
            r4 = 1024(0x400, double:5.06E-321)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x012d
            com.facebook.litho.cz r0 = r7.f18097h
            if (r0 == 0) goto L_0x0125
            com.facebook.litho.bt r0 = r0.f18228d
            if (r0 == 0) goto L_0x0125
            r0 = 0
        L_0x00f8:
            int r1 = com.facebook.litho.C6139bt.f18162a
            r1 = 9
            if (r0 >= r1) goto L_0x012d
            com.facebook.litho.cz r1 = r7.f18097h
            com.facebook.litho.bt r1 = r1.f18228d
            float r1 = r1.mo13119b(r0)
            boolean r4 = com.facebook.yoga.C6569e.m17936a(r1)
            if (r4 != 0) goto L_0x0122
            int r4 = com.facebook.yoga.C6571g.m17939b(r0)
            boolean[] r5 = r7.f18106q
            if (r5 == 0) goto L_0x011e
            int r6 = r4 + -1
            boolean r5 = r5[r6]
            if (r5 == 0) goto L_0x011e
            r8.mo13029z(r4, r1)
            goto L_0x0122
        L_0x011e:
            int r1 = (int) r1
            r8.mo12875A(r4, r1)
        L_0x0122:
            int r0 = r0 + 1
            goto L_0x00f8
        L_0x0125:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "copyInto() must be used when resolving a nestedTree. If padding was set on the holder node, we must have a mNestedTreePadding instance"
            r8.<init>(r0)
            throw r8
        L_0x012d:
            long r0 = r7.f18088Q
            r4 = 268435456(0x10000000, double:1.32624737E-315)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x014f
            com.facebook.litho.cz r0 = r7.f18097h
            if (r0 == 0) goto L_0x0147
            com.facebook.litho.bt r0 = r0.f18229e
            if (r0 == 0) goto L_0x0147
            int[] r1 = r7.f18094e
            float[] r4 = r7.f18095f
            r8.mo12922aU(r0, r1, r4)
            goto L_0x014f
        L_0x0147:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "copyInto() must be used when resolving a nestedTree.If border width was set on the holder node, we must have a mNestedTreeBorderWidth instance"
            r8.<init>(r0)
            throw r8
        L_0x014f:
            long r0 = r7.f18088Q
            r4 = 134217728(0x8000000, double:6.63123685E-316)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0160
            java.lang.String r0 = r7.f18108s
            java.lang.String r1 = r7.f18109t
            r8.mo12968bN(r0, r1)
        L_0x0160:
            long r0 = r7.f18088Q
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0171
            com.facebook.litho.go r0 = r7.f18110u
            r8.mo12969bO(r0)
        L_0x0171:
            long r0 = r7.f18088Q
            r4 = 536870912(0x20000000, double:2.652494739E-315)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x017e
            r8.mo12965bK()
        L_0x017e:
            long r0 = r7.f18088Q
            r4 = 1073741824(0x40000000, double:5.304989477E-315)
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x018b
            r8.mo12966bL()
        L_0x018b:
            int r0 = r7.f18076E
            r1 = -1
            if (r0 == r1) goto L_0x0195
            android.graphics.Paint r1 = r7.f18073B
            r8.mo12962bH(r0, r1)
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6124be.mo12856d(java.lang.Object):void");
    }

    /* renamed from: e */
    public final void mo13008e(float f) {
        this.f18088Q |= 64;
        this.f18090a.mo13703w(f);
    }

    /* renamed from: f */
    public final void mo13009f(int i) {
        this.f18088Q |= 64;
        this.f18090a.mo13702v((float) i);
    }

    /* renamed from: g */
    public final void mo13010g(float f) {
        this.f18088Q |= 16;
        this.f18090a.mo13704x(f);
    }

    /* renamed from: h */
    public final void mo13011h(float f) {
        this.f18088Q |= 32;
        this.f18090a.mo13705y(f);
    }

    /* renamed from: i */
    public final void mo13012i(float f) {
        this.f18088Q |= 32768;
        this.f18090a.mo13650A(f);
    }

    /* renamed from: j */
    public final void mo13013j(int i) {
        this.f18088Q |= 32768;
        this.f18090a.mo13706z((float) i);
    }

    /* renamed from: k */
    public final void mo13014k(C6570f fVar) {
        this.f18088Q |= 1;
        this.f18090a.mo13701u(fVar);
    }

    /* renamed from: l */
    public final void mo13015l(float f) {
        this.f18088Q |= 131072;
        this.f18090a.mo13652C(f);
    }

    /* renamed from: m */
    public final void mo13016m(int i) {
        this.f18088Q |= 131072;
        this.f18090a.mo13651B((float) i);
    }

    /* renamed from: n */
    public final void mo13017n(float f) {
        this.f18088Q |= 16384;
        this.f18090a.mo13654E(f);
    }

    /* renamed from: o */
    public final void mo13018o(int i) {
        this.f18088Q |= 16384;
        this.f18090a.mo13653D((float) i);
    }

    /* renamed from: p */
    public final void mo13019p(float f) {
        this.f18088Q |= 65536;
        this.f18090a.mo13656G(f);
    }

    /* renamed from: q */
    public final void mo13020q(int i) {
        this.f18088Q |= 65536;
        this.f18090a.mo13655F((float) i);
    }

    /* renamed from: r */
    public final void mo13021r(float f) {
        this.f18088Q |= 8192;
        this.f18090a.mo13658I(f);
    }

    /* renamed from: s */
    public final void mo13022s(int i) {
        this.f18088Q |= 8192;
        this.f18090a.mo13657H((float) i);
    }

    /* renamed from: t */
    public final void mo13023t(float f) {
        this.f18088Q |= 4096;
        this.f18090a.mo13660K(f);
    }

    /* renamed from: u */
    public final void mo13024u(int i) {
        this.f18088Q |= 4096;
        this.f18090a.mo13659J((float) i);
    }

    /* renamed from: v */
    public final void mo13025v(int i) {
        this.f18088Q |= 4;
        this.f18090a.mo13663N(i);
    }

    /* renamed from: w */
    public final void mo13026w() {
        this.f18088Q |= 8;
        this.f18090a.mo13666Q();
    }

    /* renamed from: x */
    public final void mo13027x(int i, float f) {
        this.f18088Q |= 512;
        this.f18090a.mo13672W(i, f);
    }

    /* renamed from: y */
    public final void mo13028y(int i, int i2) {
        this.f18088Q |= 512;
        this.f18090a.mo13671V(i, (float) i2);
    }

    /* renamed from: A */
    public final void mo12875A(int i, int i2) {
        this.f18088Q |= 1024;
        C6178cz czVar = this.f18097h;
        if (czVar == null || !czVar.f18225a) {
            this.f18090a.mo13673X(i, (float) i2);
            return;
        }
        m15922bZ().mo13122e(i, (float) i2);
        m15929cg(i, false);
    }

    /* renamed from: z */
    public final void mo13029z(int i, float f) {
        this.f18088Q |= 1024;
        C6178cz czVar = this.f18097h;
        if (czVar == null || !czVar.f18225a) {
            this.f18090a.mo13674Y(i, f);
            return;
        }
        m15922bZ().mo13122e(i, f);
        m15929cg(i, true);
    }
}
