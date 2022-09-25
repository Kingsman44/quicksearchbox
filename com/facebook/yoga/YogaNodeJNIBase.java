package com.facebook.yoga;

import android.support.p033v7.widget.LinearLayoutManager;
import com.facebook.litho.C6103an;
import com.facebook.litho.C6122bc;
import com.facebook.litho.C6124be;
import com.facebook.litho.C6181da;
import com.facebook.litho.C6184dd;
import com.facebook.litho.C6188dh;
import com.facebook.litho.C6230ed;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6277ft;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public abstract class YogaNodeJNIBase extends C6575k implements Cloneable {

    /* renamed from: a */
    protected long f19543a;
    private float[] arr;

    /* renamed from: b */
    public Object f19544b;

    /* renamed from: c */
    private YogaNodeJNIBase f19545c;

    /* renamed from: d */
    private List f19546d;

    /* renamed from: e */
    private C6230ed f19547e;
    private int mLayoutDirection;

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    /* renamed from: ad */
    private static C6577m m17879ad(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) j);
        int i = (int) (j >> 32);
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    if (i == 3) {
                        i2 = 4;
                    } else {
                        throw new IllegalArgumentException("Unknown enum value: " + i);
                    }
                }
            } else {
                i2 = 2;
            }
        }
        return new C6577m(intBitsToFloat, i2);
    }

    /* renamed from: ae */
    private final void m17880ae() {
        Object obj = this.f19544b;
        if (obj instanceof C6574j) {
            C6124be beVar = (C6124be) obj;
            C6181da aw = beVar.mo12950aw();
            if (aw != null && aw.mo12895U() == 8) {
                beVar.mo12960bF(4);
            }
            if (aw != null && aw.mo12952ay() != null && aw.mo12952ay().mo13093j() == 2) {
                beVar.mo12953az().mo13049S(false);
            }
        }
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.f19546d;
        if (list != null) {
            list.remove(i);
            this.f19546d.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.f19545c = this;
            return yogaNodeJNIBase.f19543a;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    /* renamed from: A */
    public final void mo13650A(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f19543a, f);
    }

    /* renamed from: B */
    public final void mo13651B(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f19543a, f);
    }

    /* renamed from: C */
    public final void mo13652C(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f19543a, f);
    }

    /* renamed from: D */
    public final void mo13653D(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f19543a, f);
    }

    /* renamed from: E */
    public final void mo13654E(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f19543a, f);
    }

    /* renamed from: F */
    public final void mo13655F(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f19543a, f);
    }

    /* renamed from: G */
    public final void mo13656G(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f19543a, f);
    }

    /* renamed from: H */
    public final void mo13657H(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f19543a, f);
    }

    /* renamed from: I */
    public final void mo13658I(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f19543a, f);
    }

    /* renamed from: J */
    public final void mo13659J(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f19543a, f);
    }

    /* renamed from: K */
    public final void mo13660K(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f19543a, f);
    }

    /* renamed from: L */
    public final boolean mo13661L() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f19543a);
    }

    /* renamed from: M */
    public final void mo13662M(int i) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f19543a, i - 1);
    }

    /* renamed from: N */
    public final void mo13663N(int i) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f19543a, i - 1);
    }

    /* renamed from: O */
    public final void mo13664O(int i) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f19543a, i - 1);
    }

    /* renamed from: P */
    public final void mo13665P(int i) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f19543a, i - 1);
    }

    /* renamed from: Q */
    public final void mo13666Q() {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f19543a, 0.0f);
    }

    /* renamed from: R */
    public final float mo13667R(int i) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = (int) fArr[0];
        if ((i3 & 4) != 4) {
            return 0.0f;
        }
        int i4 = 14 - (1 != (i3 & 1) ? 4 : 0);
        if ((i3 & 2) != 2) {
            i2 = 4;
        }
        int i5 = i4 - i2;
        int i6 = i - 1;
        if (i6 == 0) {
            return fArr[i5];
        }
        if (i6 == 1) {
            return fArr[i5 + 1];
        }
        if (i6 != 2) {
            return fArr[i5 + 3];
        }
        return fArr[i5 + 2];
    }

    /* renamed from: S */
    public final float mo13668S(int i) {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 1) != 1) {
            return 0.0f;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return fArr[6];
        }
        if (i2 == 1) {
            return fArr[7];
        }
        if (i2 != 2) {
            return fArr[9];
        }
        return fArr[8];
    }

    /* renamed from: T */
    public final float mo13669T(int i) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = (int) fArr[0];
        if ((i3 & 2) != 2) {
            return 0.0f;
        }
        if (1 != (i3 & 1)) {
            i2 = 4;
        }
        int i4 = 10 - i2;
        int i5 = i - 1;
        if (i5 == 0) {
            return fArr[i4];
        }
        if (i5 == 1) {
            return fArr[i4 + 1];
        }
        if (i5 != 2) {
            return fArr[i4 + 3];
        }
        return fArr[i4 + 2];
    }

    /* renamed from: U */
    public final void mo13670U(int i, float f) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f19543a, i - 1, f);
    }

    /* renamed from: V */
    public final void mo13671V(int i, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f19543a, i - 1, f);
    }

    /* renamed from: W */
    public final void mo13672W(int i, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f19543a, i - 1, f);
    }

    /* renamed from: X */
    public final void mo13673X(int i, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f19543a, i - 1, f);
    }

    /* renamed from: Y */
    public final void mo13674Y(int i, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f19543a, i - 1, f);
    }

    /* renamed from: Z */
    public final void mo13675Z(int i, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f19543a, i - 1, f);
    }

    /* renamed from: a */
    public final float mo13676a() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    /* renamed from: aa */
    public final void mo13677aa(int i, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f19543a, i - 1, f);
    }

    /* renamed from: ab */
    public final void mo13678ab(C6230ed edVar) {
        this.f19547e = edVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f19543a, edVar != null);
    }

    /* renamed from: ac */
    public final YogaNodeJNIBase mo13687h() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeCloneJNI = YogaNative.jni_YGNodeCloneJNI(this.f19543a);
            yogaNodeJNIBase.f19545c = null;
            yogaNodeJNIBase.f19543a = jni_YGNodeCloneJNI;
            yogaNodeJNIBase.f19546d = null;
            YogaNative.jni_YGNodeClearChildrenJNI(jni_YGNodeCloneJNI);
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final float mo13680b() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    public final float baseline(float f, float f2) {
        throw null;
    }

    /* renamed from: c */
    public final float mo13682c() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final float mo13683d() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    /* renamed from: e */
    public final int mo13684e() {
        List list = this.f19546d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: f */
    public final C6570f mo13685f() {
        int i;
        float[] fArr = this.arr;
        if (fArr != null) {
            i = (int) fArr[5];
        } else {
            i = this.mLayoutDirection;
        }
        return C6570f.m17937a(i);
    }

    /* renamed from: g */
    public final C6570f mo13686g() {
        return C6570f.m17937a(YogaNative.jni_YGNodeStyleGetDirectionJNI(this.f19543a));
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C6575k mo13688i(int i) {
        List list = this.f19546d;
        if (list != null) {
            return (YogaNodeJNIBase) list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    /* renamed from: j */
    public final /* synthetic */ C6575k mo13689j() {
        return this.f19545c;
    }

    /* renamed from: k */
    public final C6577m mo13690k() {
        return m17879ad(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f19543a));
    }

    /* renamed from: l */
    public final C6577m mo13691l() {
        return m17879ad(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f19543a));
    }

    /* renamed from: m */
    public final Object mo13692m() {
        return this.f19544b;
    }

    /* renamed from: n */
    public final void mo13694n(C6575k kVar, int i) {
        if (kVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) kVar;
            if (yogaNodeJNIBase.f19545c == null) {
                if (this.f19546d == null) {
                    this.f19546d = new ArrayList(4);
                }
                this.f19546d.add(i, yogaNodeJNIBase);
                yogaNodeJNIBase.f19545c = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.f19543a, yogaNodeJNIBase.f19543a, i);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    /* renamed from: o */
    public final void mo13695o(float f, float f2) {
        m17880ae();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i)).f19546d;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase : list) {
                    yogaNodeJNIBase.m17880ae();
                    arrayList.add(yogaNodeJNIBase);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].f19543a;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f19543a, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    /* renamed from: p */
    public final void mo13696p(C6565a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f19543a, aVar.f19557i);
    }

    /* renamed from: q */
    public final void mo13697q(C6565a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f19543a, aVar.f19557i);
    }

    /* renamed from: r */
    public final void mo13698r(C6565a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f19543a, aVar.f19557i);
    }

    /* renamed from: s */
    public final void mo13699s(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f19543a, f);
    }

    /* renamed from: t */
    public final void mo13700t(Object obj) {
        this.f19544b = obj;
    }

    /* renamed from: u */
    public final void mo13701u(C6570f fVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f19543a, fVar.f19563d);
    }

    /* renamed from: v */
    public final void mo13702v(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f19543a, f);
    }

    /* renamed from: w */
    public final void mo13703w(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f19543a, f);
    }

    /* renamed from: x */
    public final void mo13704x(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f19543a, f);
    }

    /* renamed from: y */
    public final void mo13705y(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f19543a, f);
    }

    /* renamed from: z */
    public final void mo13706z(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f19543a, f);
    }

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        if (j != 0) {
            this.f19543a = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    public final long measure(float f, int i, float f2, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f19547e != null) {
            int a = C6573i.m17941a(i);
            int a2 = C6573i.m17941a(i2);
            C6181da daVar = (C6181da) mo13692m();
            C6407q ai = daVar.mo12936ai();
            daVar.mo12907aF();
            C6411u uVar = ai.f18995r;
            try {
                C6122bc bw = daVar.mo12986bg() ? daVar.mo13002bw() : null;
                int b = C6277ft.m16838b(f, a);
                int b2 = C6277ft.m16838b(f2, a2);
                daVar.mo12981bb(b);
                daVar.mo12926aY(b2);
                C6411u aj = daVar.mo12937aj();
                if (!C6407q.m17271B(aj, ai)) {
                    if (!daVar.mo12987bh()) {
                        if (bw == null || bw.f18068h != b || bw.f18069i != b2 || ai.mo12823an()) {
                            C6276fs fsVar = new C6276fs(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
                            ai.mo12804X(uVar, daVar, b, b2, fsVar);
                            int i6 = fsVar.f18535a;
                            if (i6 < 0 || (i5 = fsVar.f18536b) < 0) {
                                throw new IllegalStateException("MeasureOutput not set, ComponentLifecycle is: " + String.valueOf(ai));
                            }
                            if (daVar.mo13002bw() != null) {
                                daVar.mo13002bw().f18068h = b;
                                daVar.mo13002bw().f18069i = b2;
                                daVar.mo13002bw().f18066f = (float) i6;
                                daVar.mo13002bw().f18067g = (float) i5;
                            }
                            i3 = i5;
                            i4 = i6;
                            float f3 = (float) i4;
                            daVar.mo12980ba(f3);
                            float f4 = (float) i3;
                            daVar.mo12927aZ(f4);
                            return ((long) Float.floatToRawIntBits(f4)) | (((long) Float.floatToRawIntBits(f3)) << 32);
                        }
                        i4 = (int) bw.f18066f;
                        i3 = (int) bw.f18067g;
                        float f32 = (float) i4;
                        daVar.mo12980ba(f32);
                        float f42 = (float) i3;
                        daVar.mo12927aZ(f42);
                        return ((long) Float.floatToRawIntBits(f42)) | (((long) Float.floatToRawIntBits(f32)) << 32);
                    }
                }
                C6407q ah = daVar.mo12935ah();
                daVar.mo12976bV();
                if (ai == ah) {
                    if (daVar.mo12950aw() != null) {
                        ah = daVar.mo12950aw().mo12936ai();
                        daVar.mo12950aw().mo12907aF();
                    } else {
                        ah = null;
                    }
                }
                if (ah != null) {
                    aj = ah.f18995r;
                }
                C6181da b3 = C6184dd.m16303b(aj, daVar, b, b2, (C6188dh) null);
                int H = b3.mo12882H();
                i3 = b3.mo12901a();
                i4 = H;
                float f322 = (float) i4;
                daVar.mo12980ba(f322);
                float f422 = (float) i3;
                daVar.mo12927aZ(f422);
                return ((long) Float.floatToRawIntBits(f422)) | (((long) Float.floatToRawIntBits(f322)) << 32);
            } catch (Exception e) {
                throw C6103an.m15874a(uVar, e);
            }
        } else {
            throw new RuntimeException("Measure function isn't defined!");
        }
    }
}
