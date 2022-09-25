package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1639g;
import androidx.constraintlayout.p079a.p082b.C1642j;
import androidx.constraintlayout.p079a.p082b.C1643k;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: P */
    public static C1762u f5200P;

    /* renamed from: Q */
    SparseArray f5201Q = new SparseArray();

    /* renamed from: R */
    public ArrayList f5202R = new ArrayList(4);

    /* renamed from: S */
    public C1639g f5203S = new C1639g();

    /* renamed from: T */
    protected boolean f5204T = true;

    /* renamed from: U */
    public int f5205U = 257;

    /* renamed from: V */
    public C1756o f5206V = null;

    /* renamed from: W */
    protected C1749h f5207W = null;

    /* renamed from: a */
    private int f5208a = 0;

    /* renamed from: aa */
    C1746e f5209aa = new C1746e(this, this);

    /* renamed from: b */
    private int f5210b = 0;

    /* renamed from: c */
    private int f5211c = Integer.MAX_VALUE;

    /* renamed from: d */
    private int f5212d = Integer.MAX_VALUE;

    /* renamed from: e */
    private int f5213e = -1;

    /* renamed from: f */
    private HashMap f5214f = new HashMap();

    /* renamed from: g */
    private SparseArray f5215g = new SparseArray();

    public ConstraintLayout(Context context) {
        super(context);
        m4741a((AttributeSet) null, 0, 0);
    }

    /* renamed from: J */
    protected static C1745d m4740J() {
        return new C1745d(-2, -2);
    }

    /* renamed from: a */
    private final void m4741a(AttributeSet attributeSet, int i, int i2) {
        C1639g gVar = this.f5203S;
        gVar.f4636ap = this;
        gVar.mo4651R(this.f5209aa);
        this.f5201Q.put(getId(), this);
        this.f5206V = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1761t.f5460b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f5208a = obtainStyledAttributes.getDimensionPixelOffset(16, this.f5208a);
                } else if (index == 17) {
                    this.f5210b = obtainStyledAttributes.getDimensionPixelOffset(17, this.f5210b);
                } else if (index == 14) {
                    this.f5211c = obtainStyledAttributes.getDimensionPixelOffset(14, this.f5211c);
                } else if (index == 15) {
                    this.f5212d = obtainStyledAttributes.getDimensionPixelOffset(15, this.f5212d);
                } else if (index == 113) {
                    this.f5205U = obtainStyledAttributes.getInt(113, this.f5205U);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            mo4724o(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f5207W = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(34, 0);
                    try {
                        C1756o oVar = new C1756o();
                        this.f5206V = oVar;
                        oVar.mo4896p(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f5206V = null;
                    }
                    this.f5213e = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f5203S.mo4649P(this.f5205U);
    }

    /* renamed from: b */
    private final void mo33195b() {
        String str;
        int h;
        C1638f fVar;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1638f D = mo4825D(getChildAt(i));
            if (D != null) {
                D.mo4641s();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    Integer valueOf = Integer.valueOf(childAt.getId());
                    if (resourceName instanceof String) {
                        if (this.f5214f == null) {
                            this.f5214f = new HashMap();
                        }
                        int indexOf = resourceName.indexOf("/");
                        this.f5214f.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, Integer.valueOf(valueOf.intValue()));
                    }
                    int indexOf2 = resourceName.indexOf(47);
                    if (indexOf2 != -1) {
                        resourceName = resourceName.substring(indexOf2 + 1);
                    }
                    int id = childAt.getId();
                    if (id == 0) {
                        fVar = this.f5203S;
                    } else {
                        View view = (View) this.f5201Q.get(id);
                        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                            onViewAdded(view);
                        }
                        fVar = view == this ? this.f5203S : view == null ? null : ((C1745d) view.getLayoutParams()).f5276ar;
                    }
                    fVar.f4638ar = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f5213e != -1) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() != this.f5213e || !(childAt2 instanceof C1758q)) {
                    i3++;
                } else {
                    C1758q qVar = (C1758q) childAt2;
                    throw null;
                }
            }
        }
        C1756o oVar = this.f5206V;
        if (oVar != null) {
            oVar.mo4900v(this);
        }
        this.f5203S.f4756be.clear();
        int size = this.f5202R.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                C1743b bVar = (C1743b) this.f5202R.get(i4);
                if (bVar.isInEditMode()) {
                    bVar.mo4856l(bVar.f5227f);
                }
                C1643k kVar = bVar.f5230i;
                if (kVar != null) {
                    kVar.mo4667S();
                    for (int i5 = 0; i5 < bVar.f5225d; i5++) {
                        int i6 = bVar.f5224c[i5];
                        View C = mo4824C(i6);
                        if (C == null && (h = bVar.mo4853h(this, str)) != 0) {
                            bVar.f5224c[i5] = h;
                            bVar.f5229h.put(Integer.valueOf(h), (str = (String) bVar.f5229h.get(Integer.valueOf(i6))));
                            C = mo4824C(h);
                        }
                        if (C != null) {
                            bVar.f5230i.mo4665Q(mo4825D(C));
                        }
                    }
                    bVar.f5230i.mo4668T();
                }
            }
        }
        int i7 = 0;
        while (i7 < childCount) {
            View childAt3 = getChildAt(i7);
            if (!(childAt3 instanceof C1759r)) {
                i7++;
            } else {
                C1759r rVar = (C1759r) childAt3;
                throw null;
            }
        }
        this.f5215g.clear();
        this.f5215g.put(0, this.f5203S);
        this.f5215g.put(getId(), this.f5203S);
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt4 = getChildAt(i8);
            this.f5215g.put(childAt4.getId(), mo4825D(childAt4));
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt5 = getChildAt(i9);
            C1638f D2 = mo4825D(childAt5);
            if (D2 != null) {
                this.f5203S.mo4671T(D2);
                mo4826E(isInEditMode, childAt5, D2, (C1745d) childAt5.getLayoutParams(), this.f5215g);
            }
        }
    }

    /* renamed from: c */
    private final void m4743c(C1638f fVar, C1745d dVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f5201Q.get(i);
        C1638f fVar2 = (C1638f) sparseArray.get(i);
        if (fVar2 != null && view != null && (view.getLayoutParams() instanceof C1745d)) {
            dVar.f5261ac = true;
            if (i2 == 6) {
                C1745d dVar2 = (C1745d) view.getLayoutParams();
                dVar2.f5261ac = true;
                dVar2.f5276ar.f4589I = true;
            }
            fVar.mo4626L(6).mo4613n(fVar2.mo4626L(i2), dVar.f5235D, dVar.f5234C, true);
            fVar.f4589I = true;
            fVar.mo4626L(3).mo4604e();
            fVar.mo4626L(5).mo4604e();
        }
    }

    /* renamed from: C */
    public final View mo4824C(int i) {
        return (View) this.f5201Q.get(i);
    }

    /* renamed from: D */
    public final C1638f mo4825D(View view) {
        if (view == this) {
            return this.f5203S;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1745d) {
            return ((C1745d) view.getLayoutParams()).f5276ar;
        }
        view.setLayoutParams(new C1745d(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1745d) {
            return ((C1745d) view.getLayoutParams()).f5276ar;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c9  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4826E(boolean r18, android.view.View r19, androidx.constraintlayout.p079a.p082b.C1638f r20, androidx.constraintlayout.widget.C1745d r21, android.util.SparseArray r22) {
        /*
            r17 = this;
            r0 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r21.mo4863a()
            r9 = 0
            r7.f5277as = r9
            int r1 = r19.getVisibility()
            r6.f4637aq = r1
            boolean r1 = r7.f5264af
            r6.f4636ap = r0
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.C1743b
            if (r1 == 0) goto L_0x0028
            androidx.constraintlayout.widget.b r0 = (androidx.constraintlayout.widget.C1743b) r0
            r10 = r17
            androidx.constraintlayout.a.b.g r1 = r10.f5203S
            boolean r1 = r1.f4691d
            r0.mo4703d(r6, r1)
            goto L_0x002a
        L_0x0028:
            r10 = r17
        L_0x002a:
            boolean r0 = r7.f5262ad
            r11 = -1
            if (r0 == 0) goto L_0x005f
            r0 = r6
            androidx.constraintlayout.a.b.j r0 = (androidx.constraintlayout.p079a.p082b.C1642j) r0
            int r1 = r7.f5273ao
            int r2 = r7.f5274ap
            float r3 = r7.f5275aq
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0049
            int r1 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x032f
            r0.f4735a = r3
            r0.f4739b = r11
            r0.f4740c = r11
            return
        L_0x0049:
            if (r1 == r11) goto L_0x0054
            if (r1 < 0) goto L_0x032f
            r0.f4735a = r4
            r0.f4739b = r1
            r0.f4740c = r11
            return
        L_0x0054:
            if (r2 == r11) goto L_0x032f
            if (r2 < 0) goto L_0x032f
            r0.f4735a = r4
            r0.f4739b = r11
            r0.f4740c = r2
            return
        L_0x005f:
            int r0 = r7.f5266ah
            int r1 = r7.f5267ai
            int r12 = r7.f5268aj
            int r13 = r7.f5269ak
            int r5 = r7.f5270al
            int r14 = r7.f5271am
            float r15 = r7.f5272an
            int r2 = r7.f5292p
            r4 = 0
            if (r2 == r11) goto L_0x008f
            java.lang.Object r0 = r8.get(r2)
            r2 = r0
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            if (r2 == 0) goto L_0x008c
            float r8 = r7.f5294r
            r1 = 7
            r3 = 7
            int r5 = r7.f5293q
            r12 = 0
            r0 = r20
            r13 = 0
            r4 = r5
            r5 = r12
            r0.mo4628N(r1, r2, r3, r4, r5)
            r6.f4588H = r8
        L_0x008c:
            r9 = 0
            goto L_0x018d
        L_0x008f:
            if (r0 == r11) goto L_0x00ab
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            if (r2 == 0) goto L_0x00a9
            r1 = 2
            r3 = 2
            int r0 = r7.leftMargin
            r16 = r0
            r0 = r20
            r9 = 0
            r4 = r16
            r0.mo4628N(r1, r2, r3, r4, r5)
            goto L_0x00c0
        L_0x00a9:
            r9 = 0
            goto L_0x00c0
        L_0x00ab:
            r9 = 0
            if (r1 == r11) goto L_0x00c0
            java.lang.Object r0 = r8.get(r1)
            r2 = r0
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            if (r2 == 0) goto L_0x00c0
            r1 = 2
            r3 = 4
            int r4 = r7.leftMargin
            r0 = r20
            r0.mo4628N(r1, r2, r3, r4, r5)
        L_0x00c0:
            if (r12 == r11) goto L_0x00d6
            java.lang.Object r0 = r8.get(r12)
            r2 = r0
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            if (r2 == 0) goto L_0x00eb
            r1 = 4
            r3 = 2
            int r4 = r7.rightMargin
            r0 = r20
            r5 = r14
            r0.mo4628N(r1, r2, r3, r4, r5)
            goto L_0x00eb
        L_0x00d6:
            if (r13 == r11) goto L_0x00eb
            java.lang.Object r0 = r8.get(r13)
            r2 = r0
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            if (r2 == 0) goto L_0x00eb
            r1 = 4
            r3 = 4
            int r4 = r7.rightMargin
            r0 = r20
            r5 = r14
            r0.mo4628N(r1, r2, r3, r4, r5)
        L_0x00eb:
            int r0 = r7.f5285i
            if (r0 == r11) goto L_0x0104
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            if (r2 == 0) goto L_0x011c
            r1 = 3
            r3 = 3
            int r4 = r7.topMargin
            int r5 = r7.f5300x
            r0 = r20
            r0.mo4628N(r1, r2, r3, r4, r5)
            goto L_0x011c
        L_0x0104:
            int r0 = r7.f5286j
            if (r0 == r11) goto L_0x011c
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            if (r2 == 0) goto L_0x011c
            r1 = 3
            r3 = 5
            int r4 = r7.topMargin
            int r5 = r7.f5300x
            r0 = r20
            r0.mo4628N(r1, r2, r3, r4, r5)
        L_0x011c:
            int r0 = r7.f5287k
            if (r0 == r11) goto L_0x0135
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            if (r2 == 0) goto L_0x014d
            r1 = 5
            r3 = 3
            int r4 = r7.bottomMargin
            int r5 = r7.f5302z
            r0 = r20
            r0.mo4628N(r1, r2, r3, r4, r5)
            goto L_0x014d
        L_0x0135:
            int r0 = r7.f5288l
            if (r0 == r11) goto L_0x014d
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            if (r2 == 0) goto L_0x014d
            r1 = 5
            r3 = 5
            int r4 = r7.bottomMargin
            int r5 = r7.f5302z
            r0 = r20
            r0.mo4628N(r1, r2, r3, r4, r5)
        L_0x014d:
            int r4 = r7.f5289m
            if (r4 == r11) goto L_0x015e
            r5 = 6
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r0.m4743c(r1, r2, r3, r4, r5)
            goto L_0x017f
        L_0x015e:
            int r4 = r7.f5290n
            if (r4 == r11) goto L_0x016f
            r5 = 3
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r0.m4743c(r1, r2, r3, r4, r5)
            goto L_0x017f
        L_0x016f:
            int r4 = r7.f5291o
            if (r4 == r11) goto L_0x017f
            r5 = 5
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r0.m4743c(r1, r2, r3, r4, r5)
        L_0x017f:
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0185
            r6.f4634an = r15
        L_0x0185:
            float r0 = r7.f5237F
            int r1 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x018d
            r6.f4635ao = r0
        L_0x018d:
            if (r18 == 0) goto L_0x019e
            int r0 = r7.f5251T
            if (r0 != r11) goto L_0x0198
            int r0 = r7.f5252U
            if (r0 == r11) goto L_0x019e
            r0 = -1
        L_0x0198:
            int r1 = r7.f5252U
            r6.f4625ae = r0
            r6.f4626af = r1
        L_0x019e:
            boolean r0 = r7.f5259aa
            r1 = -2
            r2 = 2
            if (r0 != 0) goto L_0x01d8
            int r0 = r7.width
            if (r0 != r11) goto L_0x01cd
            boolean r0 = r7.f5254W
            if (r0 == 0) goto L_0x01b4
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            androidx.constraintlayout.a.b.e[] r3 = r6.f4605Y
            r4 = 0
            r3[r4] = r0
            goto L_0x01bb
        L_0x01b4:
            r4 = 0
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            androidx.constraintlayout.a.b.e[] r3 = r6.f4605Y
            r3[r4] = r0
        L_0x01bb:
            androidx.constraintlayout.a.b.d r0 = r6.mo4626L(r2)
            int r3 = r7.leftMargin
            r0.f4572f = r3
            r0 = 4
            androidx.constraintlayout.a.b.d r0 = r6.mo4626L(r0)
            int r3 = r7.rightMargin
            r0.f4572f = r3
            goto L_0x01ee
        L_0x01cd:
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            androidx.constraintlayout.a.b.e[] r3 = r6.f4605Y
            r4 = 0
            r3[r4] = r0
            r6.mo4618D(r4)
            goto L_0x01ee
        L_0x01d8:
            r4 = 0
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            androidx.constraintlayout.a.b.e[] r3 = r6.f4605Y
            r3[r4] = r0
            int r0 = r7.width
            r6.mo4618D(r0)
            int r0 = r7.width
            if (r0 != r1) goto L_0x01ee
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            androidx.constraintlayout.a.b.e[] r3 = r6.f4605Y
            r3[r4] = r0
        L_0x01ee:
            boolean r0 = r7.f5260ab
            r3 = 3
            r4 = 1
            if (r0 != 0) goto L_0x0226
            int r0 = r7.height
            if (r0 != r11) goto L_0x021b
            boolean r0 = r7.f5255X
            if (r0 == 0) goto L_0x0203
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            androidx.constraintlayout.a.b.e[] r1 = r6.f4605Y
            r1[r4] = r0
            goto L_0x0209
        L_0x0203:
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            androidx.constraintlayout.a.b.e[] r1 = r6.f4605Y
            r1[r4] = r0
        L_0x0209:
            androidx.constraintlayout.a.b.d r0 = r6.mo4626L(r3)
            int r1 = r7.topMargin
            r0.f4572f = r1
            r0 = 5
            androidx.constraintlayout.a.b.d r0 = r6.mo4626L(r0)
            int r1 = r7.bottomMargin
            r0.f4572f = r1
            goto L_0x023b
        L_0x021b:
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            androidx.constraintlayout.a.b.e[] r1 = r6.f4605Y
            r1[r4] = r0
            r0 = 0
            r6.mo4648z(r0)
            goto L_0x023b
        L_0x0226:
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            androidx.constraintlayout.a.b.e[] r5 = r6.f4605Y
            r5[r4] = r0
            int r0 = r7.height
            r6.mo4648z(r0)
            int r0 = r7.height
            if (r0 != r1) goto L_0x023b
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            androidx.constraintlayout.a.b.e[] r1 = r6.f4605Y
            r1[r4] = r0
        L_0x023b:
            java.lang.String r0 = r7.f5238G
            if (r0 == 0) goto L_0x02ce
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0247
            goto L_0x02ce
        L_0x0247:
            int r1 = r0.length()
            r5 = 44
            int r5 = r0.indexOf(r5)
            if (r5 <= 0) goto L_0x0273
            int r8 = r1 + -1
            if (r5 >= r8) goto L_0x0273
            r8 = 0
            java.lang.String r12 = r0.substring(r8, r5)
            java.lang.String r8 = "W"
            boolean r8 = r12.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0266
            r8 = 0
            goto L_0x0271
        L_0x0266:
            java.lang.String r8 = "H"
            boolean r8 = r12.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0270
            r8 = 1
            goto L_0x0271
        L_0x0270:
            r8 = -1
        L_0x0271:
            int r5 = r5 + r4
            goto L_0x0275
        L_0x0273:
            r5 = 0
            r8 = -1
        L_0x0275:
            r12 = 58
            int r12 = r0.indexOf(r12)
            if (r12 < 0) goto L_0x02b5
            int r1 = r1 + r11
            if (r12 >= r1) goto L_0x02b5
            java.lang.String r1 = r0.substring(r5, r12)
            int r12 = r12 + r4
            java.lang.String r0 = r0.substring(r12)
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x02c4
            int r5 = r0.length()
            if (r5 <= 0) goto L_0x02c4
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x02b3 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x02b3 }
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x02c4
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x02c4
            if (r8 != r4) goto L_0x02ad
            float r0 = r0 / r1
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x02b3 }
            goto L_0x02c5
        L_0x02ad:
            float r1 = r1 / r0
            float r0 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x02b3 }
            goto L_0x02c5
        L_0x02b3:
            goto L_0x02c4
        L_0x02b5:
            java.lang.String r0 = r0.substring(r5)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x02c4
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x02b3 }
            goto L_0x02c5
        L_0x02c4:
            r0 = 0
        L_0x02c5:
            int r1 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x02d0
            r6.f4623ac = r0
            r6.f4624ad = r8
            goto L_0x02d0
        L_0x02ce:
            r6.f4623ac = r9
        L_0x02d0:
            float r0 = r7.f5239H
            float[] r1 = r6.f4614aG
            r5 = 0
            r1[r5] = r0
            float r0 = r7.f5240I
            r1[r4] = r0
            int r0 = r7.f5241J
            r6.f4610aC = r0
            int r0 = r7.f5242K
            r6.f4611aD = r0
            int r0 = r7.f5257Z
            if (r0 < 0) goto L_0x02eb
            if (r0 > r3) goto L_0x02eb
            r6.f4663s = r0
        L_0x02eb:
            int r0 = r7.f5243L
            int r1 = r7.f5245N
            int r4 = r7.f5247P
            float r3 = r7.f5249R
            r6.f4664t = r0
            r6.f4667w = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r1) goto L_0x02fd
            r4 = 0
        L_0x02fd:
            r6.f4668x = r4
            r6.f4669y = r3
            r4 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x030f
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x030f
            if (r0 != 0) goto L_0x030f
            r6.f4664t = r2
        L_0x030f:
            int r0 = r7.f5244M
            int r3 = r7.f5246O
            int r8 = r7.f5248Q
            float r7 = r7.f5250S
            r6.f4665u = r0
            r6.f4670z = r3
            if (r8 != r1) goto L_0x031e
            goto L_0x031f
        L_0x031e:
            r5 = r8
        L_0x031f:
            r6.f4581A = r5
            r6.f4582B = r7
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x032f
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x032f
            if (r0 != 0) goto L_0x032f
            r6.f4665u = r2
        L_0x032f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo4826E(boolean, android.view.View, androidx.constraintlayout.a.b.f, androidx.constraintlayout.widget.d, android.util.SparseArray):void");
    }

    /* renamed from: F */
    public final void mo4827F(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C1746e eVar = this.f5209aa;
        int i5 = eVar.f5307e;
        int resolveSizeAndState = resolveSizeAndState(i3 + eVar.f5306d, i, 0);
        int resolveSizeAndState2 = resolveSizeAndState(i4 + i5, i2, 0);
        int min = Math.min(this.f5211c, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f5212d, resolveSizeAndState2 & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0495 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x03cf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01da  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4828G(androidx.constraintlayout.p079a.p082b.C1639g r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = android.view.View.MeasureSpec.getMode(r27)
            int r4 = android.view.View.MeasureSpec.getSize(r27)
            int r5 = android.view.View.MeasureSpec.getMode(r28)
            int r6 = android.view.View.MeasureSpec.getSize(r28)
            int r7 = r24.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r24.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r24.getPaddingLeft()
            int r11 = java.lang.Math.max(r8, r11)
            int r12 = r24.getPaddingRight()
            int r12 = java.lang.Math.max(r8, r12)
            int r11 = r11 + r12
            int r12 = r24.getPaddingStart()
            int r12 = java.lang.Math.max(r8, r12)
            int r13 = r24.getPaddingEnd()
            int r13 = java.lang.Math.max(r8, r13)
            int r12 = r12 + r13
            if (r12 <= 0) goto L_0x004e
            r11 = r12
        L_0x004e:
            androidx.constraintlayout.widget.e r12 = r0.f5209aa
            r12.f5304b = r7
            r12.f5305c = r9
            r12.f5306d = r11
            r12.f5307e = r10
            r9 = r27
            r12.f5308f = r9
            r9 = r28
            r12.f5309g = r9
            int r9 = r24.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r12 = r24.getPaddingEnd()
            int r12 = java.lang.Math.max(r8, r12)
            if (r9 > 0) goto L_0x007e
            if (r12 <= 0) goto L_0x0075
            goto L_0x007e
        L_0x0075:
            int r9 = r24.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L_0x0085
        L_0x007e:
            boolean r13 = r24.mo4830I()
            if (r13 == 0) goto L_0x0085
            r9 = r12
        L_0x0085:
            int r4 = r4 - r11
            int r6 = r6 - r10
            androidx.constraintlayout.widget.e r10 = r0.f5209aa
            int r11 = r10.f5307e
            int r10 = r10.f5306d
            androidx.constraintlayout.a.b.e r12 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            androidx.constraintlayout.a.b.e r13 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            int r14 = r24.getChildCount()
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r3 == r15) goto L_0x00b7
            if (r3 == 0) goto L_0x00a9
            if (r3 == r8) goto L_0x00a1
        L_0x009f:
            r8 = 0
            goto L_0x00c6
        L_0x00a1:
            int r8 = r0.f5211c
            int r8 = r8 - r10
            int r8 = java.lang.Math.min(r8, r4)
            goto L_0x00c6
        L_0x00a9:
            androidx.constraintlayout.a.b.e r12 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r14 != 0) goto L_0x009f
            int r8 = r0.f5208a
            r14 = 0
            int r16 = java.lang.Math.max(r14, r8)
            r8 = r16
            goto L_0x00c6
        L_0x00b7:
            r8 = 0
            androidx.constraintlayout.a.b.e r12 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r14 != 0) goto L_0x00c5
            int r14 = r0.f5208a
            int r14 = java.lang.Math.max(r8, r14)
            r8 = r14
            r14 = 0
            goto L_0x00c6
        L_0x00c5:
            r8 = r4
        L_0x00c6:
            if (r5 == r15) goto L_0x00e8
            if (r5 == 0) goto L_0x00d8
            r15 = 1073741824(0x40000000, float:2.0)
            if (r5 == r15) goto L_0x00d0
        L_0x00ce:
            r14 = 0
            goto L_0x00f5
        L_0x00d0:
            int r14 = r0.f5212d
            int r14 = r14 - r11
            int r14 = java.lang.Math.min(r14, r6)
            goto L_0x00f5
        L_0x00d8:
            androidx.constraintlayout.a.b.e r13 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r14 != 0) goto L_0x00e6
            int r14 = r0.f5210b
            r15 = 0
            int r16 = java.lang.Math.max(r15, r14)
            r14 = r16
            goto L_0x00f5
        L_0x00e6:
            r15 = 0
            goto L_0x00ce
        L_0x00e8:
            r15 = 0
            androidx.constraintlayout.a.b.e r13 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r14 != 0) goto L_0x00f4
            int r14 = r0.f5210b
            int r14 = java.lang.Math.max(r15, r14)
            goto L_0x00f5
        L_0x00f4:
            r14 = r6
        L_0x00f5:
            int r15 = r25.mo4631i()
            r28 = r6
            r6 = 1
            if (r8 != r15) goto L_0x0104
            int r15 = r25.mo4630h()
            if (r14 == r15) goto L_0x0108
        L_0x0104:
            androidx.constraintlayout.a.b.a.f r15 = r1.f4685b
            r15.f4503c = r6
        L_0x0108:
            r15 = 0
            r1.f4625ae = r15
            r1.f4626af = r15
            int r6 = r0.f5211c
            r18 = r4
            int[] r4 = r1.f4587G
            int r6 = r6 - r10
            r4[r15] = r6
            int r6 = r0.f5212d
            int r6 = r6 - r11
            r17 = 1
            r4[r17] = r6
            r1.mo4617C(r15)
            r1.mo4616B(r15)
            androidx.constraintlayout.a.b.e[] r4 = r1.f4605Y
            r4[r15] = r12
            r1.mo4618D(r8)
            androidx.constraintlayout.a.b.e[] r4 = r1.f4605Y
            r4[r17] = r13
            r1.mo4648z(r14)
            int r4 = r0.f5208a
            int r4 = r4 - r10
            r1.mo4617C(r4)
            int r4 = r0.f5210b
            int r4 = r4 - r11
            r1.mo4616B(r4)
            r1.f4673aO = r9
            r1.f4674aP = r7
            androidx.constraintlayout.a.b.a.c r4 = r1.f4671a
            androidx.constraintlayout.widget.e r6 = r1.f4689bd
            java.util.ArrayList r7 = r1.f4756be
            int r7 = r7.size()
            int r8 = r25.mo4631i()
            int r9 = r25.mo4630h()
            r10 = 128(0x80, float:1.794E-43)
            boolean r10 = androidx.constraintlayout.p079a.p082b.C1644l.m4482b(r2, r10)
            r11 = 64
            if (r10 != 0) goto L_0x0166
            boolean r2 = androidx.constraintlayout.p079a.p082b.C1644l.m4482b(r2, r11)
            if (r2 == 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r2 = 0
            goto L_0x0167
        L_0x0166:
            r2 = 1
        L_0x0167:
            if (r2 == 0) goto L_0x01c1
            r13 = 0
        L_0x016a:
            if (r13 >= r7) goto L_0x01c1
            java.util.ArrayList r14 = r1.f4756be
            java.lang.Object r14 = r14.get(r13)
            androidx.constraintlayout.a.b.f r14 = (androidx.constraintlayout.p079a.p082b.C1638f) r14
            androidx.constraintlayout.a.b.e[] r15 = r14.f4605Y
            r16 = 0
            r15 = r15[r16]
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            androidx.constraintlayout.a.b.e[] r12 = r14.f4605Y
            r17 = 1
            r12 = r12[r17]
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r15 != r11) goto L_0x0191
            if (r12 != r0) goto L_0x0191
            float r0 = r14.f4623ac
            r11 = 0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0191
            r0 = 1
            goto L_0x0192
        L_0x0191:
            r0 = 0
        L_0x0192:
            boolean r11 = r14.mo4623I()
            if (r11 == 0) goto L_0x019f
            if (r0 == 0) goto L_0x019e
        L_0x019a:
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            goto L_0x01c3
        L_0x019e:
            r0 = 0
        L_0x019f:
            boolean r11 = r14.mo4624J()
            if (r11 == 0) goto L_0x01a8
            if (r0 == 0) goto L_0x01a8
            goto L_0x019a
        L_0x01a8:
            boolean r0 = r14 instanceof androidx.constraintlayout.p079a.p082b.C1646n
            if (r0 == 0) goto L_0x01ad
            goto L_0x019a
        L_0x01ad:
            boolean r0 = r14.mo4623I()
            if (r0 != 0) goto L_0x019a
            boolean r0 = r14.mo4624J()
            if (r0 == 0) goto L_0x01ba
            goto L_0x019a
        L_0x01ba:
            int r13 = r13 + 1
            r0 = r24
            r11 = 64
            goto L_0x016a
        L_0x01c1:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x01c3:
            if (r3 != r0) goto L_0x01d0
            if (r5 == r0) goto L_0x01ca
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x01d0
        L_0x01ca:
            r0 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x01d7
        L_0x01d0:
            if (r10 == 0) goto L_0x01d5
            r15 = r3
            r0 = 1
            goto L_0x01d7
        L_0x01d5:
            r15 = r3
            r0 = 0
        L_0x01d7:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0489
            int[] r3 = r1.f4587G
            r11 = 0
            r3 = r3[r11]
            r11 = r18
            int r3 = java.lang.Math.min(r3, r11)
            int[] r11 = r1.f4587G
            r12 = 1
            r11 = r11[r12]
            r13 = r28
            int r11 = java.lang.Math.min(r11, r13)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r15 != r13) goto L_0x01f6
            r14 = 0
            goto L_0x01f7
        L_0x01f6:
            r14 = 1
        L_0x01f7:
            if (r15 != r13) goto L_0x0206
            int r2 = r25.mo4631i()
            if (r2 == r3) goto L_0x0206
            r1.mo4618D(r3)
            androidx.constraintlayout.a.b.a.f r2 = r1.f4685b
            r2.f4502b = r12
        L_0x0206:
            if (r5 != r13) goto L_0x020a
            r2 = 0
            goto L_0x020b
        L_0x020a:
            r2 = 1
        L_0x020b:
            if (r5 != r13) goto L_0x021b
            int r3 = r25.mo4630h()
            if (r3 == r11) goto L_0x021b
            r1.mo4648z(r11)
            androidx.constraintlayout.a.b.a.f r3 = r1.f4685b
            r11 = 1
            r3.f4502b = r11
        L_0x021b:
            if (r15 != r13) goto L_0x03de
            if (r5 != r13) goto L_0x03de
            androidx.constraintlayout.a.b.a.f r3 = r1.f4685b
            boolean r5 = r3.f4502b
            if (r5 != 0) goto L_0x022c
            boolean r5 = r3.f4503c
            if (r5 == 0) goto L_0x022a
            goto L_0x022c
        L_0x022a:
            r11 = 0
            goto L_0x0268
        L_0x022c:
            androidx.constraintlayout.a.b.g r5 = r3.f4501a
            java.util.ArrayList r5 = r5.f4756be
            int r11 = r5.size()
            r12 = 0
        L_0x0235:
            if (r12 >= r11) goto L_0x0250
            java.lang.Object r13 = r5.get(r12)
            androidx.constraintlayout.a.b.f r13 = (androidx.constraintlayout.p079a.p082b.C1638f) r13
            r13.mo4640r()
            r15 = 0
            r13.f4649e = r15
            androidx.constraintlayout.a.b.a.m r15 = r13.f4652h
            r15.mo4586g()
            androidx.constraintlayout.a.b.a.o r13 = r13.f4653i
            r13.mo4590g()
            int r12 = r12 + 1
            goto L_0x0235
        L_0x0250:
            androidx.constraintlayout.a.b.g r5 = r3.f4501a
            r5.mo4640r()
            androidx.constraintlayout.a.b.g r5 = r3.f4501a
            r11 = 0
            r5.f4649e = r11
            androidx.constraintlayout.a.b.a.m r5 = r5.f4652h
            r5.mo4586g()
            androidx.constraintlayout.a.b.g r5 = r3.f4501a
            androidx.constraintlayout.a.b.a.o r5 = r5.f4653i
            r5.mo4590g()
            r3.f4503c = r11
        L_0x0268:
            androidx.constraintlayout.a.b.g r5 = r3.f4504d
            r3.mo4581e(r5)
            androidx.constraintlayout.a.b.g r5 = r3.f4501a
            r5.f4625ae = r11
            r5.f4626af = r11
            androidx.constraintlayout.a.b.e[] r5 = r5.f4605Y
            r12 = r5[r11]
            r11 = 1
            r5 = r5[r11]
            boolean r11 = r3.f4502b
            if (r11 == 0) goto L_0x0281
            r3.mo4578b()
        L_0x0281:
            androidx.constraintlayout.a.b.g r11 = r3.f4501a
            int r11 = r11.mo4632j()
            androidx.constraintlayout.a.b.g r13 = r3.f4501a
            int r13 = r13.mo4633k()
            androidx.constraintlayout.a.b.g r15 = r3.f4501a
            androidx.constraintlayout.a.b.a.m r15 = r15.f4652h
            androidx.constraintlayout.a.b.a.g r15 = r15.f4544j
            r15.mo4584c(r11)
            androidx.constraintlayout.a.b.g r15 = r3.f4501a
            androidx.constraintlayout.a.b.a.o r15 = r15.f4653i
            androidx.constraintlayout.a.b.a.g r15 = r15.f4544j
            r15.mo4584c(r13)
            r3.mo4579c()
            androidx.constraintlayout.a.b.e r15 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r12 == r15) goto L_0x02aa
            androidx.constraintlayout.a.b.e r15 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r5 != r15) goto L_0x0311
        L_0x02aa:
            if (r10 == 0) goto L_0x0311
            java.util.ArrayList r10 = r3.f4505e
            int r15 = r10.size()
            r18 = r0
            r0 = 0
        L_0x02b5:
            if (r0 >= r15) goto L_0x02c9
            int r20 = r0 + 1
            java.lang.Object r0 = r10.get(r0)
            androidx.constraintlayout.a.b.a.r r0 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r0
            boolean r0 = r0.mo4574e()
            if (r0 != 0) goto L_0x02c6
            goto L_0x0313
        L_0x02c6:
            r0 = r20
            goto L_0x02b5
        L_0x02c9:
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r12 != r0) goto L_0x02ed
            androidx.constraintlayout.a.b.g r0 = r3.f4501a
            androidx.constraintlayout.a.b.e r10 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            androidx.constraintlayout.a.b.e[] r15 = r0.f4605Y
            r20 = r6
            r6 = 0
            r15[r6] = r10
            int r10 = r3.mo4577a(r0, r6)
            r0.mo4618D(r10)
            androidx.constraintlayout.a.b.g r0 = r3.f4501a
            androidx.constraintlayout.a.b.a.m r6 = r0.f4652h
            androidx.constraintlayout.a.b.a.h r6 = r6.f4541g
            int r0 = r0.mo4631i()
            r6.mo4584c(r0)
            goto L_0x02ef
        L_0x02ed:
            r20 = r6
        L_0x02ef:
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r5 != r0) goto L_0x0315
            androidx.constraintlayout.a.b.g r0 = r3.f4501a
            androidx.constraintlayout.a.b.e r6 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            androidx.constraintlayout.a.b.e[] r10 = r0.f4605Y
            r15 = 1
            r10[r15] = r6
            int r6 = r3.mo4577a(r0, r15)
            r0.mo4648z(r6)
            androidx.constraintlayout.a.b.g r0 = r3.f4501a
            androidx.constraintlayout.a.b.a.o r6 = r0.f4653i
            androidx.constraintlayout.a.b.a.h r6 = r6.f4541g
            int r0 = r0.mo4630h()
            r6.mo4584c(r0)
            goto L_0x0315
        L_0x0311:
            r18 = r0
        L_0x0313:
            r20 = r6
        L_0x0315:
            androidx.constraintlayout.a.b.g r0 = r3.f4501a
            androidx.constraintlayout.a.b.e[] r6 = r0.f4605Y
            r10 = 0
            r6 = r6[r10]
            androidx.constraintlayout.a.b.e r10 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r6 == r10) goto L_0x0327
            androidx.constraintlayout.a.b.e r10 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r6 != r10) goto L_0x0325
            goto L_0x0327
        L_0x0325:
            r0 = 0
            goto L_0x0369
        L_0x0327:
            int r6 = r0.mo4631i()
            int r6 = r6 + r11
            androidx.constraintlayout.a.b.a.m r0 = r0.f4652h
            androidx.constraintlayout.a.b.a.g r0 = r0.f4545k
            r0.mo4584c(r6)
            androidx.constraintlayout.a.b.g r0 = r3.f4501a
            androidx.constraintlayout.a.b.a.m r0 = r0.f4652h
            androidx.constraintlayout.a.b.a.h r0 = r0.f4541g
            int r6 = r6 - r11
            r0.mo4584c(r6)
            r3.mo4579c()
            androidx.constraintlayout.a.b.g r0 = r3.f4501a
            androidx.constraintlayout.a.b.e[] r6 = r0.f4605Y
            r10 = 1
            r6 = r6[r10]
            androidx.constraintlayout.a.b.e r10 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r6 == r10) goto L_0x034f
            androidx.constraintlayout.a.b.e r10 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r6 != r10) goto L_0x0365
        L_0x034f:
            int r6 = r0.mo4630h()
            int r6 = r6 + r13
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.g r0 = r0.f4545k
            r0.mo4584c(r6)
            androidx.constraintlayout.a.b.g r0 = r3.f4501a
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.h r0 = r0.f4541g
            int r6 = r6 - r13
            r0.mo4584c(r6)
        L_0x0365:
            r3.mo4579c()
            r0 = 1
        L_0x0369:
            java.util.ArrayList r6 = r3.f4505e
            int r10 = r6.size()
            r11 = 0
        L_0x0370:
            if (r11 >= r10) goto L_0x038c
            java.lang.Object r13 = r6.get(r11)
            androidx.constraintlayout.a.b.a.r r13 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r13
            androidx.constraintlayout.a.b.f r15 = r13.f4538d
            r27 = r6
            androidx.constraintlayout.a.b.g r6 = r3.f4501a
            if (r15 != r6) goto L_0x0384
            boolean r6 = r13.f4543i
            if (r6 == 0) goto L_0x0387
        L_0x0384:
            r13.mo4572c()
        L_0x0387:
            int r11 = r11 + 1
            r6 = r27
            goto L_0x0370
        L_0x038c:
            java.util.ArrayList r6 = r3.f4505e
            int r10 = r6.size()
            r11 = 0
        L_0x0393:
            if (r11 >= r10) goto L_0x03cf
            java.lang.Object r13 = r6.get(r11)
            androidx.constraintlayout.a.b.a.r r13 = (androidx.constraintlayout.p079a.p082b.p083a.C1633r) r13
            if (r0 != 0) goto L_0x03a6
            androidx.constraintlayout.a.b.f r15 = r13.f4538d
            r27 = r0
            androidx.constraintlayout.a.b.g r0 = r3.f4501a
            if (r15 != r0) goto L_0x03a8
            goto L_0x03ca
        L_0x03a6:
            r27 = r0
        L_0x03a8:
            androidx.constraintlayout.a.b.a.g r0 = r13.f4544j
            boolean r0 = r0.f4517i
            if (r0 != 0) goto L_0x03b0
        L_0x03ae:
            r0 = 0
            goto L_0x03d0
        L_0x03b0:
            androidx.constraintlayout.a.b.a.g r0 = r13.f4545k
            boolean r0 = r0.f4517i
            if (r0 != 0) goto L_0x03bb
            boolean r0 = r13 instanceof androidx.constraintlayout.p079a.p082b.p083a.C1626k
            if (r0 != 0) goto L_0x03bb
            goto L_0x03ae
        L_0x03bb:
            androidx.constraintlayout.a.b.a.h r0 = r13.f4541g
            boolean r0 = r0.f4517i
            if (r0 != 0) goto L_0x03ca
            boolean r0 = r13 instanceof androidx.constraintlayout.p079a.p082b.p083a.C1619d
            if (r0 != 0) goto L_0x03ca
            boolean r0 = r13 instanceof androidx.constraintlayout.p079a.p082b.p083a.C1626k
            if (r0 != 0) goto L_0x03ca
            goto L_0x03ae
        L_0x03ca:
            int r11 = r11 + 1
            r0 = r27
            goto L_0x0393
        L_0x03cf:
            r0 = 1
        L_0x03d0:
            androidx.constraintlayout.a.b.g r3 = r3.f4501a
            androidx.constraintlayout.a.b.e[] r3 = r3.f4605Y
            r6 = 0
            r3[r6] = r12
            r6 = 1
            r3[r6] = r5
            r3 = 2
            r5 = 1
            goto L_0x0480
        L_0x03de:
            r18 = r0
            r20 = r6
            androidx.constraintlayout.a.b.a.f r0 = r1.f4685b
            boolean r3 = r0.f4502b
            if (r3 == 0) goto L_0x0446
            androidx.constraintlayout.a.b.g r3 = r0.f4501a
            java.util.ArrayList r3 = r3.f4756be
            int r6 = r3.size()
            r11 = 0
        L_0x03f1:
            if (r11 >= r6) goto L_0x0420
            java.lang.Object r12 = r3.get(r11)
            androidx.constraintlayout.a.b.f r12 = (androidx.constraintlayout.p079a.p082b.C1638f) r12
            r12.mo4640r()
            r13 = 0
            r12.f4649e = r13
            r16 = r3
            androidx.constraintlayout.a.b.a.m r3 = r12.f4652h
            r21 = r6
            androidx.constraintlayout.a.b.a.h r6 = r3.f4541g
            r6.f4517i = r13
            r3.f4543i = r13
            r3.mo4586g()
            androidx.constraintlayout.a.b.a.o r3 = r12.f4653i
            androidx.constraintlayout.a.b.a.h r6 = r3.f4541g
            r6.f4517i = r13
            r3.f4543i = r13
            r3.mo4590g()
            int r11 = r11 + 1
            r3 = r16
            r6 = r21
            goto L_0x03f1
        L_0x0420:
            r13 = 0
            androidx.constraintlayout.a.b.g r3 = r0.f4501a
            r3.mo4640r()
            androidx.constraintlayout.a.b.g r3 = r0.f4501a
            r3.f4649e = r13
            androidx.constraintlayout.a.b.a.m r3 = r3.f4652h
            androidx.constraintlayout.a.b.a.h r6 = r3.f4541g
            r6.f4517i = r13
            r3.f4543i = r13
            r3.mo4586g()
            androidx.constraintlayout.a.b.g r3 = r0.f4501a
            androidx.constraintlayout.a.b.a.o r3 = r3.f4653i
            androidx.constraintlayout.a.b.a.h r6 = r3.f4541g
            r6.f4517i = r13
            r3.f4543i = r13
            r3.mo4590g()
            r0.mo4578b()
            goto L_0x0447
        L_0x0446:
            r13 = 0
        L_0x0447:
            androidx.constraintlayout.a.b.g r3 = r0.f4504d
            r0.mo4581e(r3)
            androidx.constraintlayout.a.b.g r3 = r0.f4501a
            r3.f4625ae = r13
            r3.f4626af = r13
            androidx.constraintlayout.a.b.a.m r3 = r3.f4652h
            androidx.constraintlayout.a.b.a.g r3 = r3.f4544j
            r3.mo4584c(r13)
            androidx.constraintlayout.a.b.g r0 = r0.f4501a
            androidx.constraintlayout.a.b.a.o r0 = r0.f4653i
            androidx.constraintlayout.a.b.a.g r0 = r0.f4544j
            r0.mo4584c(r13)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r15 != r0) goto L_0x046f
            androidx.constraintlayout.a.b.a.f r3 = r1.f4685b
            boolean r3 = r3.mo4580d(r10, r13)
            r6 = r3
            r3 = 1
            goto L_0x0471
        L_0x046f:
            r3 = 0
            r6 = 1
        L_0x0471:
            if (r5 != r0) goto L_0x047e
            androidx.constraintlayout.a.b.a.f r0 = r1.f4685b
            r5 = 1
            boolean r0 = r0.mo4580d(r10, r5)
            r0 = r0 & r6
            int r3 = r3 + 1
            goto L_0x0480
        L_0x047e:
            r5 = 1
            r0 = r6
        L_0x0480:
            if (r0 == 0) goto L_0x048f
            r6 = r14 ^ 1
            r2 = r2 ^ r5
            r1.mo4619E(r6, r2)
            goto L_0x048f
        L_0x0489:
            r18 = r0
            r20 = r6
            r0 = 0
            r3 = 0
        L_0x048f:
            if (r0 == 0) goto L_0x0496
            r0 = 2
            if (r3 == r0) goto L_0x0495
            goto L_0x0496
        L_0x0495:
            return
        L_0x0496:
            int r0 = r1.f4679aU
            if (r7 <= 0) goto L_0x056e
            java.util.ArrayList r2 = r1.f4756be
            int r2 = r2.size()
            r3 = 64
            boolean r3 = r1.mo4650Q(r3)
            androidx.constraintlayout.widget.e r5 = r1.f4689bd
            r14 = 0
        L_0x04a9:
            if (r14 >= r2) goto L_0x053a
            java.util.ArrayList r6 = r1.f4756be
            java.lang.Object r6 = r6.get(r14)
            androidx.constraintlayout.a.b.f r6 = (androidx.constraintlayout.p079a.p082b.C1638f) r6
            boolean r10 = r6 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r10 == 0) goto L_0x04ba
        L_0x04b7:
            r12 = 0
            goto L_0x0536
        L_0x04ba:
            boolean r10 = r6 instanceof androidx.constraintlayout.p079a.p082b.C1615a
            if (r10 != 0) goto L_0x04b7
            boolean r10 = r6.f4591K
            if (r10 != 0) goto L_0x04b7
            if (r3 == 0) goto L_0x04d8
            androidx.constraintlayout.a.b.a.m r10 = r6.f4652h
            if (r10 == 0) goto L_0x04d8
            androidx.constraintlayout.a.b.a.o r11 = r6.f4653i
            if (r11 == 0) goto L_0x04d8
            androidx.constraintlayout.a.b.a.h r10 = r10.f4541g
            boolean r10 = r10.f4517i
            if (r10 == 0) goto L_0x04d8
            androidx.constraintlayout.a.b.a.h r10 = r11.f4541g
            boolean r10 = r10.f4517i
            if (r10 != 0) goto L_0x04b7
        L_0x04d8:
            androidx.constraintlayout.a.b.e[] r10 = r6.f4605Y
            r11 = 0
            r12 = r10[r11]
            r11 = 1
            r10 = r10[r11]
            androidx.constraintlayout.a.b.e r13 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x04f0
            int r13 = r6.f4664t
            if (r13 == r11) goto L_0x04f0
            androidx.constraintlayout.a.b.e r13 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r10 != r13) goto L_0x04f0
            int r13 = r6.f4665u
            if (r13 != r11) goto L_0x04b7
        L_0x04f0:
            boolean r13 = r1.mo4650Q(r11)
            if (r13 == 0) goto L_0x0531
            boolean r11 = r6 instanceof androidx.constraintlayout.p079a.p082b.C1646n
            if (r11 != 0) goto L_0x0531
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r12 != r11) goto L_0x050c
            int r13 = r6.f4664t
            if (r13 != 0) goto L_0x050c
            if (r10 == r11) goto L_0x050c
            boolean r11 = r6.mo4623I()
            if (r11 != 0) goto L_0x050c
            r11 = 1
            goto L_0x050d
        L_0x050c:
            r11 = 0
        L_0x050d:
            androidx.constraintlayout.a.b.e r13 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r10 != r13) goto L_0x051e
            int r15 = r6.f4665u
            if (r15 != 0) goto L_0x051e
            if (r12 == r13) goto L_0x051e
            boolean r13 = r6.mo4623I()
            if (r13 != 0) goto L_0x051e
            r11 = 1
        L_0x051e:
            androidx.constraintlayout.a.b.e r13 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r12 == r13) goto L_0x0527
            if (r10 != r13) goto L_0x0525
            goto L_0x0527
        L_0x0525:
            r12 = 0
            goto L_0x052e
        L_0x0527:
            float r10 = r6.f4623ac
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x0536
        L_0x052e:
            if (r11 != 0) goto L_0x0536
            goto L_0x0532
        L_0x0531:
            r12 = 0
        L_0x0532:
            r10 = 0
            r4.mo4568b(r5, r6, r10)
        L_0x0536:
            int r14 = r14 + 1
            goto L_0x04a9
        L_0x053a:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r5.f5303a
            int r2 = r2.getChildCount()
            r14 = 0
        L_0x0541:
            if (r14 >= r2) goto L_0x0554
            androidx.constraintlayout.widget.ConstraintLayout r3 = r5.f5303a
            android.view.View r3 = r3.getChildAt(r14)
            boolean r6 = r3 instanceof androidx.constraintlayout.widget.C1759r
            if (r6 != 0) goto L_0x0550
            int r14 = r14 + 1
            goto L_0x0541
        L_0x0550:
            androidx.constraintlayout.widget.r r3 = (androidx.constraintlayout.widget.C1759r) r3
            r0 = 0
            throw r0
        L_0x0554:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r5.f5303a
            java.util.ArrayList r2 = r2.f5202R
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x056e
            r14 = 0
        L_0x055f:
            if (r14 >= r2) goto L_0x056e
            androidx.constraintlayout.widget.ConstraintLayout r3 = r5.f5303a
            java.util.ArrayList r3 = r3.f5202R
            java.lang.Object r3 = r3.get(r14)
            androidx.constraintlayout.widget.b r3 = (androidx.constraintlayout.widget.C1743b) r3
            int r14 = r14 + 1
            goto L_0x055f
        L_0x056e:
            r4.mo4567a(r1)
            java.util.ArrayList r2 = r4.f4496a
            int r2 = r2.size()
            r14 = 0
            if (r7 <= 0) goto L_0x057d
            r4.mo4569c(r1, r14, r8, r9)
        L_0x057d:
            if (r2 <= 0) goto L_0x0738
            androidx.constraintlayout.a.b.e[] r3 = r1.f4605Y
            r3 = r3[r14]
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            androidx.constraintlayout.a.b.e[] r6 = r1.f4605Y
            r7 = 1
            r6 = r6[r7]
            androidx.constraintlayout.a.b.e r7 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            int r10 = r25.mo4631i()
            androidx.constraintlayout.a.b.g r11 = r4.f4497b
            int r11 = r11.f4632al
            int r10 = java.lang.Math.max(r10, r11)
            int r11 = r25.mo4630h()
            androidx.constraintlayout.a.b.g r12 = r4.f4497b
            int r12 = r12.f4633am
            int r11 = java.lang.Math.max(r11, r12)
            r12 = 0
            r13 = 0
        L_0x05a6:
            if (r12 >= r2) goto L_0x063e
            java.util.ArrayList r15 = r4.f4496a
            java.lang.Object r15 = r15.get(r12)
            androidx.constraintlayout.a.b.f r15 = (androidx.constraintlayout.p079a.p082b.C1638f) r15
            boolean r14 = r15 instanceof androidx.constraintlayout.p079a.p082b.C1646n
            if (r14 != 0) goto L_0x05bc
            r19 = r0
            r1 = r20
            r20 = r8
            goto L_0x0631
        L_0x05bc:
            int r14 = r15.mo4631i()
            r19 = r0
            int r0 = r15.mo4630h()
            r1 = r20
            r20 = r8
            r8 = 1
            boolean r21 = r4.mo4568b(r1, r15, r8)
            r8 = r13 | r21
            int r13 = r15.mo4631i()
            r21 = r8
            int r8 = r15.mo4630h()
            if (r13 == r14) goto L_0x0602
            r15.mo4618D(r13)
            if (r3 != r5) goto L_0x0600
            int r13 = r15.mo4632j()
            int r14 = r15.f4621aa
            int r13 = r13 + r14
            if (r13 <= r10) goto L_0x0600
            int r13 = r15.mo4632j()
            int r14 = r15.f4621aa
            int r13 = r13 + r14
            r14 = 4
            androidx.constraintlayout.a.b.d r14 = r15.mo4626L(r14)
            int r14 = r14.mo4601b()
            int r13 = r13 + r14
            int r10 = java.lang.Math.max(r10, r13)
        L_0x0600:
            r21 = 1
        L_0x0602:
            if (r8 == r0) goto L_0x062a
            r15.mo4648z(r8)
            if (r6 != r7) goto L_0x0628
            int r0 = r15.mo4633k()
            int r8 = r15.f4622ab
            int r0 = r0 + r8
            if (r0 <= r11) goto L_0x0628
            int r0 = r15.mo4633k()
            int r8 = r15.f4622ab
            int r0 = r0 + r8
            r8 = 5
            androidx.constraintlayout.a.b.d r8 = r15.mo4626L(r8)
            int r8 = r8.mo4601b()
            int r0 = r0 + r8
            int r0 = java.lang.Math.max(r11, r0)
            r11 = r0
        L_0x0628:
            r21 = 1
        L_0x062a:
            androidx.constraintlayout.a.b.n r15 = (androidx.constraintlayout.p079a.p082b.C1646n) r15
            boolean r0 = r15.f4751bm
            r0 = r21 | r0
            r13 = r0
        L_0x0631:
            int r12 = r12 + 1
            r0 = r19
            r8 = r20
            r14 = 0
            r20 = r1
            r1 = r25
            goto L_0x05a6
        L_0x063e:
            r19 = r0
            r1 = r20
            r20 = r8
            r0 = 2
            r14 = 0
        L_0x0646:
            if (r14 >= r0) goto L_0x0733
            r8 = 0
        L_0x0649:
            if (r8 >= r2) goto L_0x0714
            java.util.ArrayList r12 = r4.f4496a
            java.lang.Object r12 = r12.get(r8)
            androidx.constraintlayout.a.b.f r12 = (androidx.constraintlayout.p079a.p082b.C1638f) r12
            boolean r15 = r12 instanceof androidx.constraintlayout.p079a.p082b.C1643k
            if (r15 == 0) goto L_0x065b
            boolean r15 = r12 instanceof androidx.constraintlayout.p079a.p082b.C1646n
            if (r15 == 0) goto L_0x067e
        L_0x065b:
            boolean r15 = r12 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r15 == 0) goto L_0x0660
            goto L_0x067e
        L_0x0660:
            int r15 = r12.f4637aq
            r0 = 8
            if (r15 != r0) goto L_0x0667
            goto L_0x067e
        L_0x0667:
            if (r18 == 0) goto L_0x067a
            androidx.constraintlayout.a.b.a.m r0 = r12.f4652h
            androidx.constraintlayout.a.b.a.h r0 = r0.f4541g
            boolean r0 = r0.f4517i
            if (r0 == 0) goto L_0x067a
            androidx.constraintlayout.a.b.a.o r0 = r12.f4653i
            androidx.constraintlayout.a.b.a.h r0 = r0.f4541g
            boolean r0 = r0.f4517i
            if (r0 == 0) goto L_0x067a
            goto L_0x067e
        L_0x067a:
            boolean r0 = r12 instanceof androidx.constraintlayout.p079a.p082b.C1646n
            if (r0 == 0) goto L_0x0689
        L_0x067e:
            r23 = r1
            r21 = r2
            r22 = r9
            r9 = r13
            r1 = 5
            r13 = 4
            goto L_0x0708
        L_0x0689:
            int r0 = r12.mo4631i()
            int r15 = r12.mo4630h()
            r21 = r2
            int r2 = r12.f4631ak
            r22 = r9
            r9 = 1
            if (r14 != r9) goto L_0x069b
            r9 = 2
        L_0x069b:
            boolean r9 = r4.mo4568b(r1, r12, r9)
            r9 = r9 | r13
            int r13 = r12.mo4631i()
            r23 = r1
            int r1 = r12.mo4630h()
            if (r13 == r0) goto L_0x06d3
            r12.mo4618D(r13)
            if (r3 != r5) goto L_0x06d0
            int r0 = r12.mo4632j()
            int r9 = r12.f4621aa
            int r0 = r0 + r9
            if (r0 <= r10) goto L_0x06d0
            int r0 = r12.mo4632j()
            int r9 = r12.f4621aa
            int r0 = r0 + r9
            r13 = 4
            androidx.constraintlayout.a.b.d r9 = r12.mo4626L(r13)
            int r9 = r9.mo4601b()
            int r0 = r0 + r9
            int r10 = java.lang.Math.max(r10, r0)
            goto L_0x06d1
        L_0x06d0:
            r13 = 4
        L_0x06d1:
            r9 = 1
            goto L_0x06d4
        L_0x06d3:
            r13 = 4
        L_0x06d4:
            if (r1 == r15) goto L_0x06fe
            r12.mo4648z(r1)
            if (r6 != r7) goto L_0x06fb
            int r0 = r12.mo4633k()
            int r1 = r12.f4622ab
            int r0 = r0 + r1
            if (r0 <= r11) goto L_0x06fb
            int r0 = r12.mo4633k()
            int r1 = r12.f4622ab
            int r0 = r0 + r1
            r1 = 5
            androidx.constraintlayout.a.b.d r9 = r12.mo4626L(r1)
            int r9 = r9.mo4601b()
            int r0 = r0 + r9
            int r0 = java.lang.Math.max(r11, r0)
            r11 = r0
            goto L_0x06fc
        L_0x06fb:
            r1 = 5
        L_0x06fc:
            r9 = 1
            goto L_0x06ff
        L_0x06fe:
            r1 = 5
        L_0x06ff:
            boolean r0 = r12.f4589I
            if (r0 == 0) goto L_0x0708
            int r0 = r12.f4631ak
            if (r2 == r0) goto L_0x0708
            r9 = 1
        L_0x0708:
            int r8 = r8 + 1
            r13 = r9
            r2 = r21
            r9 = r22
            r1 = r23
            r0 = 2
            goto L_0x0649
        L_0x0714:
            r23 = r1
            r21 = r2
            r22 = r9
            r0 = 4
            r1 = 5
            if (r13 == 0) goto L_0x0733
            int r14 = r14 + 1
            r2 = r25
            r9 = r20
            r12 = r22
            r8 = r23
            r4.mo4569c(r2, r14, r9, r12)
            r1 = r8
            r9 = r12
            r2 = r21
            r0 = 2
            r13 = 0
            goto L_0x0646
        L_0x0733:
            r2 = r25
            r0 = r19
            goto L_0x0739
        L_0x0738:
            r2 = r1
        L_0x0739:
            r2.mo4649P(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo4828G(androidx.constraintlayout.a.b.g, int, int, int):void");
    }

    /* renamed from: H */
    public final void mo4829H(int i) {
        if (i != this.f5210b) {
            this.f5210b = i;
            requestLayout();
        }
    }

    /* renamed from: I */
    public final boolean mo4830I() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    /* renamed from: K */
    public final Object mo4831K(Object obj) {
        HashMap hashMap;
        if (!(obj instanceof String) || (hashMap = this.f5214f) == null || !hashMap.containsKey(obj)) {
            return null;
        }
        return this.f5214f.get(obj);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1745d;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f5202R;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                C1743b bVar = (C1743b) this.f5202R.get(i);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int parseInt4 = Integer.parseInt(split[3]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float f8 = (float) (i4 + ((int) ((((float) parseInt4) / 1920.0f) * height)));
                        float f9 = f2;
                        float f10 = f8;
                        canvas2.drawLine(f9, f6, f7, f10, paint3);
                        float f11 = f8;
                        float f12 = f5;
                        canvas2.drawLine(f9, f11, f12, f10, paint3);
                        float f13 = f5;
                        canvas2.drawLine(f13, f11, f12, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        float f14 = f2;
                        Paint paint5 = paint4;
                        canvas2.drawLine(f13, f3, f14, f8, paint5);
                        canvas2.drawLine(f13, f8, f14, f3, paint5);
                    }
                }
            }
        }
    }

    public final void forceLayout() {
        this.f5204T = true;
        super.forceLayout();
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4740J();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1745d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo4724o(int i) {
        this.f5207W = new C1749h(getContext(), this, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            C1745d dVar = (C1745d) childAt.getLayoutParams();
            C1638f fVar = dVar.f5276ar;
            if (childAt.getVisibility() == 8 && !dVar.f5262ad && !dVar.f5263ae) {
                boolean z2 = dVar.f5265ag;
                if (!isInEditMode) {
                    continue;
                    i5++;
                }
            }
            boolean z3 = dVar.f5264af;
            int j = fVar.mo4632j();
            int k = fVar.mo4633k();
            childAt.layout(j, k, fVar.mo4631i() + j, fVar.mo4630h() + k);
            if (!(childAt instanceof C1759r)) {
                i5++;
            } else {
                C1759r rVar = (C1759r) childAt;
                throw null;
            }
        }
        int size = this.f5202R.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((C1743b) this.f5202R.get(i6)).mo4842q();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        if (!this.f5204T) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.f5204T = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.f5203S.f4691d = mo4830I();
        if (this.f5204T) {
            this.f5204T = false;
            int childCount2 = getChildCount();
            while (true) {
                if (i3 >= childCount2) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    mo33195b();
                    C1639g gVar = this.f5203S;
                    gVar.f4671a.mo4567a(gVar);
                    break;
                } else {
                    i3++;
                }
            }
        }
        mo4828G(this.f5203S, this.f5205U, i, i2);
        int i5 = this.f5203S.mo4631i();
        int h = this.f5203S.mo4630h();
        C1639g gVar2 = this.f5203S;
        mo4827F(i, i2, i5, h, gVar2.f4680aV, gVar2.f4681aW);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C1638f D = mo4825D(view);
        if ((view instanceof Guideline) && !(D instanceof C1642j)) {
            C1745d dVar = (C1745d) view.getLayoutParams();
            dVar.f5276ar = new C1642j();
            dVar.f5262ad = true;
            ((C1642j) dVar.f5276ar).mo4664d(dVar.f5253V);
        }
        if (view instanceof C1743b) {
            C1743b bVar = (C1743b) view;
            bVar.mo4859o();
            ((C1745d) view.getLayoutParams()).f5263ae = true;
            if (!this.f5202R.contains(bVar)) {
                this.f5202R.add(bVar);
            }
        }
        this.f5201Q.put(view.getId(), view);
        this.f5204T = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f5201Q.remove(view.getId());
        this.f5203S.mo4672U(mo4825D(view));
        this.f5202R.remove(view);
        this.f5204T = true;
    }

    public void requestLayout() {
        this.f5204T = true;
        super.requestLayout();
    }

    public final void setId(int i) {
        this.f5201Q.remove(getId());
        super.setId(i);
        this.f5201Q.put(getId(), this);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1745d(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4741a(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4741a(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4741a(attributeSet, i, i2);
    }
}
