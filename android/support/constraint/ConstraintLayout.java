package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.p029a.p030a.C0133c;
import android.support.constraint.p029a.p030a.C0134d;
import android.support.constraint.p029a.p030a.C0135e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray f333a = new SparseArray();

    /* renamed from: b */
    C0134d f334b = new C0134d();

    /* renamed from: c */
    public C0146c f335c = null;

    /* renamed from: d */
    private final ArrayList f336d = new ArrayList(100);

    /* renamed from: e */
    private int f337e = 0;

    /* renamed from: f */
    private int f338f = 0;

    /* renamed from: g */
    private int f339g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f340h = Integer.MAX_VALUE;

    /* renamed from: i */
    private boolean f341i = true;

    /* renamed from: j */
    private int f342j = 2;

    public ConstraintLayout(Context context) {
        super(context);
        m142d((AttributeSet) null);
    }

    /* renamed from: a */
    protected static final C0129a m139a() {
        return new C0129a(-2, -2);
    }

    /* renamed from: b */
    private final C0133c m140b(int i) {
        if (i == 0) {
            return this.f334b;
        }
        View view = (View) this.f333a.get(i);
        if (view == this) {
            return this.f334b;
        }
        if (view == null) {
            return null;
        }
        return ((C0129a) view.getLayoutParams()).f367Y;
    }

    /* renamed from: c */
    private final C0133c m141c(View view) {
        if (view == this) {
            return this.f334b;
        }
        if (view == null) {
            return null;
        }
        return ((C0129a) view.getLayoutParams()).f367Y;
    }

    /* renamed from: d */
    private final void m142d(AttributeSet attributeSet) {
        this.f334b.f424L = this;
        this.f333a.put(getId(), this);
        this.f335c = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0147d.f599a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.f337e = obtainStyledAttributes.getDimensionPixelOffset(16, this.f337e);
                } else if (index == 17) {
                    this.f338f = obtainStyledAttributes.getDimensionPixelOffset(17, this.f338f);
                } else if (index == 14) {
                    this.f339g = obtainStyledAttributes.getDimensionPixelOffset(14, this.f339g);
                } else if (index == 15) {
                    this.f340h = obtainStyledAttributes.getDimensionPixelOffset(15, this.f340h);
                } else if (index == 113) {
                    this.f342j = obtainStyledAttributes.getInt(113, this.f342j);
                } else if (index == 34) {
                    int resourceId = obtainStyledAttributes.getResourceId(34, 0);
                    C0146c cVar = new C0146c();
                    this.f335c = cVar;
                    cVar.mo194f(getContext(), resourceId);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f334b.f475ak = this.f342j;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0129a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m139a();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0129a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0129a aVar = (C0129a) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || aVar.f359Q || isInEditMode) {
                C0133c cVar = aVar.f367Y;
                int i6 = cVar.f470y + cVar.f415C;
                int i7 = cVar.f471z + cVar.f416D;
                childAt.layout(i6, i7, cVar.mo132d() + i6, cVar.mo129a() + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x045c, code lost:
        if (r10.height == -1) goto L_0x0465;
     */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r24.getPaddingLeft()
            int r4 = r24.getPaddingTop()
            android.support.constraint.a.a.d r5 = r0.f334b
            r5.f468w = r3
            r5.f469x = r4
            int r5 = android.view.View.MeasureSpec.getMode(r25)
            int r6 = android.view.View.MeasureSpec.getSize(r25)
            int r7 = android.view.View.MeasureSpec.getMode(r26)
            int r8 = android.view.View.MeasureSpec.getSize(r26)
            int r9 = r24.getPaddingTop()
            int r10 = r24.getPaddingBottom()
            int r9 = r9 + r10
            int r10 = r24.getPaddingLeft()
            int r11 = r24.getPaddingRight()
            int r10 = r10 + r11
            r24.getLayoutParams()
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 1073741824(0x40000000, float:2.0)
            r14 = 0
            if (r5 == r11) goto L_0x0053
            if (r5 == 0) goto L_0x0050
            if (r5 == r12) goto L_0x0046
            r5 = 1
            goto L_0x0051
        L_0x0046:
            int r5 = r0.f339g
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r5 - r10
            r5 = 1
            goto L_0x0054
        L_0x0050:
            r5 = 2
        L_0x0051:
            r6 = 0
            goto L_0x0054
        L_0x0053:
            r5 = 2
        L_0x0054:
            if (r7 == r11) goto L_0x0069
            if (r7 == 0) goto L_0x0066
            if (r7 == r12) goto L_0x005c
            r7 = 1
            goto L_0x0067
        L_0x005c:
            int r7 = r0.f340h
            int r7 = java.lang.Math.min(r7, r8)
            int r8 = r7 - r9
            r7 = 1
            goto L_0x006a
        L_0x0066:
            r7 = 2
        L_0x0067:
            r8 = 0
            goto L_0x006a
        L_0x0069:
            r7 = 2
        L_0x006a:
            android.support.constraint.a.a.d r9 = r0.f334b
            r9.mo138j(r14)
            android.support.constraint.a.a.d r9 = r0.f334b
            r9.mo137i(r14)
            android.support.constraint.a.a.d r9 = r0.f334b
            r9.mo147s(r5)
            android.support.constraint.a.a.d r5 = r0.f334b
            r5.mo141m(r6)
            android.support.constraint.a.a.d r5 = r0.f334b
            r5.mo148t(r7)
            android.support.constraint.a.a.d r5 = r0.f334b
            r5.mo135g(r8)
            android.support.constraint.a.a.d r5 = r0.f334b
            int r6 = r0.f337e
            int r7 = r24.getPaddingLeft()
            int r6 = r6 - r7
            int r7 = r24.getPaddingRight()
            int r6 = r6 - r7
            r5.mo138j(r6)
            android.support.constraint.a.a.d r5 = r0.f334b
            int r6 = r0.f338f
            int r7 = r24.getPaddingTop()
            int r6 = r6 - r7
            int r7 = r24.getPaddingBottom()
            int r6 = r6 - r7
            r5.mo137i(r6)
            boolean r5 = r0.f341i
            r8 = -1
            if (r5 == 0) goto L_0x0406
            r0.f341i = r14
            int r5 = r24.getChildCount()
            r9 = 0
        L_0x00b6:
            if (r9 >= r5) goto L_0x0406
            android.view.View r10 = r0.getChildAt(r9)
            boolean r10 = r10.isLayoutRequested()
            if (r10 == 0) goto L_0x03fe
            java.util.ArrayList r5 = r0.f336d
            r5.clear()
            android.support.constraint.c r5 = r0.f335c
            if (r5 == 0) goto L_0x00ce
            r5.mo190b(r0)
        L_0x00ce:
            int r5 = r24.getChildCount()
            android.support.constraint.a.a.d r9 = r0.f334b
            java.util.ArrayList r9 = r9.f501an
            r9.clear()
            r9 = 0
        L_0x00da:
            if (r9 >= r5) goto L_0x0406
            android.view.View r10 = r0.getChildAt(r9)
            android.support.constraint.a.a.c r11 = r0.m141c(r10)
            if (r11 != 0) goto L_0x00eb
        L_0x00e6:
            r23 = r5
            r13 = 0
            goto L_0x03f5
        L_0x00eb:
            android.view.ViewGroup$LayoutParams r16 = r10.getLayoutParams()
            r12 = r16
            android.support.constraint.a r12 = (android.support.constraint.C0129a) r12
            r11.mo133e()
            int r14 = r10.getVisibility()
            r11.f425M = r14
            r11.f424L = r10
            android.support.constraint.a.a.d r10 = r0.f334b
            java.util.ArrayList r14 = r10.f501an
            r14.add(r11)
            android.support.constraint.a.a.c r14 = r11.f463r
            if (r14 == 0) goto L_0x010e
            android.support.constraint.a.a.h r14 = (android.support.constraint.p029a.p030a.C0138h) r14
            r14.mo157A(r11)
        L_0x010e:
            r11.f463r = r10
            boolean r10 = r12.f357O
            if (r10 == 0) goto L_0x0118
            boolean r10 = r12.f356N
            if (r10 != 0) goto L_0x011d
        L_0x0118:
            java.util.ArrayList r10 = r0.f336d
            r10.add(r11)
        L_0x011d:
            boolean r10 = r12.f359Q
            if (r10 == 0) goto L_0x014e
            android.support.constraint.a.a.e r11 = (android.support.constraint.p029a.p030a.C0135e) r11
            int r10 = r12.f368a
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r10 == r8) goto L_0x0131
            if (r10 < 0) goto L_0x0131
            r11.f486ah = r14
            r11.f487ai = r10
            r11.f488aj = r8
        L_0x0131:
            int r10 = r12.f369b
            if (r10 == r8) goto L_0x013d
            if (r10 < 0) goto L_0x013d
            r11.f486ah = r14
            r11.f487ai = r8
            r11.f488aj = r10
        L_0x013d:
            float r10 = r12.f370c
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x00e6
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x00e6
            r11.f486ah = r10
            r11.f487ai = r8
            r11.f488aj = r8
            goto L_0x00e6
        L_0x014e:
            int r10 = r12.f360R
            if (r10 != r8) goto L_0x0182
            int r10 = r12.f361S
            if (r10 != r8) goto L_0x0182
            int r10 = r12.f362T
            if (r10 != r8) goto L_0x0182
            int r10 = r12.f363U
            if (r10 != r8) goto L_0x0182
            int r10 = r12.f375h
            if (r10 != r8) goto L_0x0182
            int r10 = r12.f376i
            if (r10 != r8) goto L_0x0182
            int r10 = r12.f377j
            if (r10 != r8) goto L_0x0182
            int r10 = r12.f378k
            if (r10 != r8) goto L_0x0182
            int r10 = r12.f379l
            if (r10 != r8) goto L_0x0182
            int r10 = r12.f353K
            if (r10 != r8) goto L_0x0182
            int r10 = r12.f354L
            if (r10 != r8) goto L_0x0182
            int r10 = r12.width
            if (r10 == r8) goto L_0x0182
            int r10 = r12.height
            if (r10 != r8) goto L_0x00e6
        L_0x0182:
            int r10 = r12.f360R
            int r14 = r12.f361S
            int r13 = r12.f362T
            int r7 = r12.f363U
            int r6 = r12.f364V
            int r15 = r12.f365W
            r23 = r5
            float r5 = r12.f366X
            if (r10 == r8) goto L_0x01aa
            android.support.constraint.a.a.c r18 = r0.m140b(r10)
            if (r18 == 0) goto L_0x01c1
            r17 = 2
            r19 = 2
            int r10 = r12.leftMargin
            r16 = r11
            r20 = r10
            r21 = r6
            r16.mo146r(r17, r18, r19, r20, r21)
            goto L_0x01c1
        L_0x01aa:
            if (r14 == r8) goto L_0x01c1
            android.support.constraint.a.a.c r18 = r0.m140b(r14)
            if (r18 == 0) goto L_0x01c1
            r17 = 2
            r19 = 4
            int r10 = r12.leftMargin
            r16 = r11
            r20 = r10
            r21 = r6
            r16.mo146r(r17, r18, r19, r20, r21)
        L_0x01c1:
            if (r13 == r8) goto L_0x01d9
            android.support.constraint.a.a.c r18 = r0.m140b(r13)
            if (r18 == 0) goto L_0x01f0
            r17 = 4
            r19 = 2
            int r6 = r12.rightMargin
            r16 = r11
            r20 = r6
            r21 = r15
            r16.mo146r(r17, r18, r19, r20, r21)
            goto L_0x01f0
        L_0x01d9:
            if (r7 == r8) goto L_0x01f0
            android.support.constraint.a.a.c r18 = r0.m140b(r7)
            if (r18 == 0) goto L_0x01f0
            r17 = 4
            r19 = 4
            int r6 = r12.rightMargin
            r16 = r11
            r20 = r6
            r21 = r15
            r16.mo146r(r17, r18, r19, r20, r21)
        L_0x01f0:
            int r6 = r12.f375h
            if (r6 == r8) goto L_0x020c
            android.support.constraint.a.a.c r18 = r0.m140b(r6)
            if (r18 == 0) goto L_0x0227
            r17 = 3
            r19 = 3
            int r6 = r12.topMargin
            int r7 = r12.f385r
            r16 = r11
            r20 = r6
            r21 = r7
            r16.mo146r(r17, r18, r19, r20, r21)
            goto L_0x0227
        L_0x020c:
            int r6 = r12.f376i
            if (r6 == r8) goto L_0x0227
            android.support.constraint.a.a.c r18 = r0.m140b(r6)
            if (r18 == 0) goto L_0x0227
            r17 = 3
            r19 = 5
            int r6 = r12.topMargin
            int r7 = r12.f385r
            r16 = r11
            r20 = r6
            r21 = r7
            r16.mo146r(r17, r18, r19, r20, r21)
        L_0x0227:
            int r6 = r12.f377j
            if (r6 == r8) goto L_0x0243
            android.support.constraint.a.a.c r18 = r0.m140b(r6)
            if (r18 == 0) goto L_0x025e
            r17 = 5
            r19 = 3
            int r6 = r12.bottomMargin
            int r7 = r12.f387t
            r16 = r11
            r20 = r6
            r21 = r7
            r16.mo146r(r17, r18, r19, r20, r21)
            goto L_0x025e
        L_0x0243:
            int r6 = r12.f378k
            if (r6 == r8) goto L_0x025e
            android.support.constraint.a.a.c r18 = r0.m140b(r6)
            if (r18 == 0) goto L_0x025e
            r17 = 5
            r19 = 5
            int r6 = r12.bottomMargin
            int r7 = r12.f387t
            r16 = r11
            r20 = r6
            r21 = r7
            r16.mo146r(r17, r18, r19, r20, r21)
        L_0x025e:
            int r6 = r12.f379l
            r7 = 3
            if (r6 == r8) goto L_0x02ac
            android.util.SparseArray r10 = r0.f333a
            java.lang.Object r6 = r10.get(r6)
            android.view.View r6 = (android.view.View) r6
            int r10 = r12.f379l
            android.support.constraint.a.a.c r10 = r0.m140b(r10)
            if (r10 == 0) goto L_0x02ac
            if (r6 == 0) goto L_0x02ac
            android.view.ViewGroup$LayoutParams r13 = r6.getLayoutParams()
            boolean r13 = r13 instanceof android.support.constraint.C0129a
            if (r13 == 0) goto L_0x02ac
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.constraint.a r6 = (android.support.constraint.C0129a) r6
            r13 = 1
            r12.f358P = r13
            r6.f358P = r13
            r6 = 6
            android.support.constraint.a.a.b r13 = r11.mo145q(r6)
            android.support.constraint.a.a.b r14 = r10.mo145q(r6)
            r15 = 0
            r16 = -1
            r17 = 2
            r18 = 0
            r19 = 1
            r13.mo126d(r14, r15, r16, r17, r18, r19)
            android.support.constraint.a.a.b r6 = r11.mo145q(r7)
            r6.mo124b()
            r6 = 5
            android.support.constraint.a.a.b r10 = r11.mo145q(r6)
            r10.mo124b()
        L_0x02ac:
            r6 = 1056964608(0x3f000000, float:0.5)
            r10 = 0
            int r13 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x02b9
            int r13 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x02b9
            r11.f422J = r5
        L_0x02b9:
            float r5 = r12.f391x
            int r13 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x02c5
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x02c5
            r11.f423K = r5
        L_0x02c5:
            boolean r5 = r24.isInEditMode()
            if (r5 == 0) goto L_0x02da
            int r5 = r12.f353K
            if (r5 != r8) goto L_0x02d4
            int r5 = r12.f354L
            if (r5 == r8) goto L_0x02da
            r5 = -1
        L_0x02d4:
            int r6 = r12.f354L
            r11.f468w = r5
            r11.f469x = r6
        L_0x02da:
            boolean r5 = r12.f356N
            if (r5 != 0) goto L_0x02fe
            int r5 = r12.width
            if (r5 != r8) goto L_0x02f7
            r5 = 4
            r11.f445af = r5
            r6 = 2
            android.support.constraint.a.a.b r13 = r11.mo145q(r6)
            int r6 = r12.leftMargin
            r13.f406c = r6
            android.support.constraint.a.a.b r6 = r11.mo145q(r5)
            int r5 = r12.rightMargin
            r6.f406c = r5
            goto L_0x0306
        L_0x02f7:
            r11.f445af = r7
            r5 = 0
            r11.mo141m(r5)
            goto L_0x0306
        L_0x02fe:
            r5 = 1
            r11.f445af = r5
            int r5 = r12.width
            r11.mo141m(r5)
        L_0x0306:
            boolean r5 = r12.f357O
            if (r5 != 0) goto L_0x032a
            int r5 = r12.height
            if (r5 != r8) goto L_0x0323
            r5 = 4
            r11.f446ag = r5
            android.support.constraint.a.a.b r5 = r11.mo145q(r7)
            int r6 = r12.topMargin
            r5.f406c = r6
            r5 = 5
            android.support.constraint.a.a.b r6 = r11.mo145q(r5)
            int r5 = r12.bottomMargin
            r6.f406c = r5
            goto L_0x0332
        L_0x0323:
            r11.f446ag = r7
            r5 = 0
            r11.mo135g(r5)
            goto L_0x0332
        L_0x032a:
            r5 = 1
            r11.f446ag = r5
            int r5 = r12.height
            r11.mo135g(r5)
        L_0x0332:
            java.lang.String r5 = r12.f392y
            if (r5 == 0) goto L_0x03cc
            int r6 = r5.length()
            if (r6 != 0) goto L_0x0340
            r11.f466u = r10
            goto L_0x03cc
        L_0x0340:
            int r6 = r5.length()
            r7 = 44
            int r7 = r5.indexOf(r7)
            if (r7 <= 0) goto L_0x036d
            int r13 = r6 + -1
            if (r7 >= r13) goto L_0x036d
            r13 = 0
            java.lang.String r14 = r5.substring(r13, r7)
            java.lang.String r15 = "W"
            boolean r15 = r14.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x035f
            r14 = 0
            goto L_0x036a
        L_0x035f:
            java.lang.String r15 = "H"
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x0369
            r14 = 1
            goto L_0x036a
        L_0x0369:
            r14 = -1
        L_0x036a:
            int r7 = r7 + 1
            goto L_0x0370
        L_0x036d:
            r13 = 0
            r7 = 0
            r14 = -1
        L_0x0370:
            r15 = 58
            int r15 = r5.indexOf(r15)
            if (r15 < 0) goto L_0x03b3
            int r6 = r6 + -1
            if (r15 >= r6) goto L_0x03b3
            java.lang.String r6 = r5.substring(r7, r15)
            int r15 = r15 + 1
            java.lang.String r5 = r5.substring(r15)
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x03c2
            int r7 = r5.length()
            if (r7 <= 0) goto L_0x03c2
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x03b1 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x03b1 }
            int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x03c2
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x03c2
            r7 = 1
            if (r14 != r7) goto L_0x03ab
            float r5 = r5 / r6
            float r5 = java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x03b1 }
            goto L_0x03c3
        L_0x03ab:
            float r6 = r6 / r5
            float r5 = java.lang.Math.abs(r6)     // Catch:{ NumberFormatException -> 0x03b1 }
            goto L_0x03c3
        L_0x03b1:
            goto L_0x03c2
        L_0x03b3:
            java.lang.String r5 = r5.substring(r7)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x03c2
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x03b1 }
            goto L_0x03c3
        L_0x03c2:
            r5 = 0
        L_0x03c3:
            int r6 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x03cd
            r11.f466u = r5
            r11.f467v = r14
            goto L_0x03cd
        L_0x03cc:
            r13 = 0
        L_0x03cd:
            float r5 = r12.f343A
            r11.f441ab = r5
            float r5 = r12.f344B
            r11.f442ac = r5
            int r5 = r12.f345C
            r11.f436X = r5
            int r5 = r12.f346D
            r11.f437Y = r5
            int r5 = r12.f347E
            int r6 = r12.f349G
            int r7 = r12.f351I
            r11.f448c = r5
            r11.f450e = r6
            r11.f451f = r7
            int r5 = r12.f348F
            int r6 = r12.f350H
            int r7 = r12.f352J
            r11.f449d = r5
            r11.f452g = r6
            r11.f453h = r7
        L_0x03f5:
            int r9 = r9 + 1
            r5 = r23
            r12 = 1073741824(0x40000000, float:2.0)
            r14 = 0
            goto L_0x00da
        L_0x03fe:
            r13 = 0
            int r9 = r9 + 1
            r12 = 1073741824(0x40000000, float:2.0)
            r14 = 0
            goto L_0x00b6
        L_0x0406:
            r13 = 0
            int r5 = r24.getPaddingTop()
            int r6 = r24.getPaddingBottom()
            int r5 = r5 + r6
            int r6 = r24.getPaddingLeft()
            int r7 = r24.getPaddingRight()
            int r6 = r6 + r7
            int r7 = r24.getChildCount()
            r9 = 0
        L_0x041e:
            r10 = 8
            if (r9 >= r7) goto L_0x04b6
            android.view.View r12 = r0.getChildAt(r9)
            int r14 = r12.getVisibility()
            if (r14 != r10) goto L_0x042e
            goto L_0x04b0
        L_0x042e:
            android.view.ViewGroup$LayoutParams r10 = r12.getLayoutParams()
            android.support.constraint.a r10 = (android.support.constraint.C0129a) r10
            android.support.constraint.a.a.c r14 = r10.f367Y
            boolean r15 = r10.f359Q
            if (r15 != 0) goto L_0x04b0
            int r15 = r10.width
            int r13 = r10.height
            boolean r11 = r10.f356N
            if (r11 != 0) goto L_0x0465
            boolean r11 = r10.f357O
            if (r11 != 0) goto L_0x0465
            int r11 = r10.f347E
            r8 = 1
            if (r11 == r8) goto L_0x0464
            int r11 = r10.width
            r8 = -1
            if (r11 == r8) goto L_0x0465
            boolean r11 = r10.f357O
            if (r11 != 0) goto L_0x045f
            int r11 = r10.f348F
            r8 = 1
            if (r11 == r8) goto L_0x0464
            int r11 = r10.height
            r8 = -1
            if (r11 != r8) goto L_0x045f
            goto L_0x0465
        L_0x045f:
            r8 = r13
            r13 = 0
            r16 = 0
            goto L_0x0495
        L_0x0464:
            r8 = -1
        L_0x0465:
            if (r15 == 0) goto L_0x0473
            if (r15 != r8) goto L_0x046a
            goto L_0x0473
        L_0x046a:
            int r11 = getChildMeasureSpec(r1, r6, r15)
            r15 = r11
            r11 = -2
            r16 = 0
            goto L_0x047a
        L_0x0473:
            r11 = -2
            int r15 = getChildMeasureSpec(r1, r6, r11)
            r16 = 1
        L_0x047a:
            if (r13 == 0) goto L_0x0485
            if (r13 != r8) goto L_0x047f
            goto L_0x0485
        L_0x047f:
            int r8 = getChildMeasureSpec(r2, r5, r13)
            r13 = 0
            goto L_0x048a
        L_0x0485:
            int r8 = getChildMeasureSpec(r2, r5, r11)
            r13 = 1
        L_0x048a:
            r12.measure(r15, r8)
            int r15 = r12.getMeasuredWidth()
            int r8 = r12.getMeasuredHeight()
        L_0x0495:
            r14.mo141m(r15)
            r14.mo135g(r8)
            if (r16 == 0) goto L_0x049f
            r14.f420H = r15
        L_0x049f:
            if (r13 == 0) goto L_0x04a3
            r14.f421I = r8
        L_0x04a3:
            boolean r8 = r10.f358P
            if (r8 == 0) goto L_0x04b0
            int r8 = r12.getBaseline()
            r10 = -1
            if (r8 == r10) goto L_0x04b0
            r14.f417E = r8
        L_0x04b0:
            int r9 = r9 + 1
            r8 = -1
            r13 = 0
            goto L_0x041e
        L_0x04b6:
            int r5 = r24.getChildCount()
            if (r5 <= 0) goto L_0x04c1
            android.support.constraint.a.a.d r5 = r0.f334b
            r5.mo155z()
        L_0x04c1:
            java.util.ArrayList r5 = r0.f336d
            int r5 = r5.size()
            int r6 = r24.getPaddingBottom()
            int r4 = r4 + r6
            int r6 = r24.getPaddingRight()
            int r3 = r3 + r6
            if (r5 <= 0) goto L_0x05ea
            android.support.constraint.a.a.d r6 = r0.f334b
            int r7 = r6.f445af
            int r6 = r6.f446ag
            r8 = 0
            r14 = 0
            r22 = 0
        L_0x04dd:
            if (r14 >= r5) goto L_0x05e1
            java.util.ArrayList r9 = r0.f336d
            java.lang.Object r9 = r9.get(r14)
            android.support.constraint.a.a.c r9 = (android.support.constraint.p029a.p030a.C0133c) r9
            boolean r11 = r9 instanceof android.support.constraint.p029a.p030a.C0135e
            if (r11 == 0) goto L_0x04ec
            goto L_0x04f9
        L_0x04ec:
            java.lang.Object r11 = r9.f424L
            if (r11 != 0) goto L_0x04f1
            goto L_0x04f9
        L_0x04f1:
            android.view.View r11 = (android.view.View) r11
            int r12 = r11.getVisibility()
            if (r12 != r10) goto L_0x0500
        L_0x04f9:
            r19 = r5
            r21 = r7
            r7 = -1
            goto L_0x05d7
        L_0x0500:
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            android.support.constraint.a r12 = (android.support.constraint.C0129a) r12
            int r13 = r12.width
            r15 = -2
            if (r13 != r15) goto L_0x0512
            int r13 = r12.width
            int r13 = getChildMeasureSpec(r1, r3, r13)
            goto L_0x051c
        L_0x0512:
            int r13 = r9.mo132d()
            r10 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
        L_0x051c:
            int r10 = r12.height
            if (r10 != r15) goto L_0x0529
            int r10 = r12.height
            int r10 = getChildMeasureSpec(r2, r4, r10)
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0533
        L_0x0529:
            int r10 = r9.mo129a()
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
        L_0x0533:
            r11.measure(r13, r10)
            int r10 = r11.getMeasuredWidth()
            int r13 = r11.getMeasuredHeight()
            int r15 = r9.mo132d()
            if (r10 == r15) goto L_0x057e
            r9.mo141m(r10)
            r10 = 2
            if (r7 != r10) goto L_0x0577
            int r10 = r9.f468w
            int r15 = r9.f464s
            int r10 = r10 + r15
            android.support.constraint.a.a.d r15 = r0.f334b
            int r15 = r15.mo132d()
            if (r10 <= r15) goto L_0x0577
            int r10 = r9.f468w
            int r15 = r9.f464s
            r19 = r5
            r5 = 4
            android.support.constraint.a.a.b r20 = r9.mo145q(r5)
            int r20 = r20.mo123a()
            android.support.constraint.a.a.d r5 = r0.f334b
            r21 = r7
            int r7 = r0.f337e
            int r10 = r10 + r15
            int r10 = r10 + r20
            int r7 = java.lang.Math.max(r7, r10)
            r5.mo141m(r7)
            goto L_0x057b
        L_0x0577:
            r19 = r5
            r21 = r7
        L_0x057b:
            r22 = 1
            goto L_0x0582
        L_0x057e:
            r19 = r5
            r21 = r7
        L_0x0582:
            int r5 = r9.mo129a()
            if (r13 == r5) goto L_0x05b7
            r9.mo135g(r13)
            r5 = 2
            if (r6 != r5) goto L_0x05b5
            int r7 = r9.f469x
            int r10 = r9.f465t
            int r7 = r7 + r10
            android.support.constraint.a.a.d r10 = r0.f334b
            int r10 = r10.mo129a()
            if (r7 <= r10) goto L_0x05b5
            int r7 = r9.f469x
            int r10 = r9.f465t
            r13 = 5
            android.support.constraint.a.a.b r15 = r9.mo145q(r13)
            int r15 = r15.mo123a()
            android.support.constraint.a.a.d r5 = r0.f334b
            int r13 = r0.f338f
            int r7 = r7 + r10
            int r7 = r7 + r15
            int r7 = java.lang.Math.max(r13, r7)
            r5.mo135g(r7)
        L_0x05b5:
            r13 = 1
            goto L_0x05b9
        L_0x05b7:
            r13 = r22
        L_0x05b9:
            boolean r5 = r12.f358P
            if (r5 == 0) goto L_0x05cc
            int r5 = r11.getBaseline()
            r7 = -1
            if (r5 == r7) goto L_0x05cd
            int r10 = r9.f417E
            if (r5 == r10) goto L_0x05cd
            r9.f417E = r5
            r13 = 1
            goto L_0x05cd
        L_0x05cc:
            r7 = -1
        L_0x05cd:
            int r5 = r11.getMeasuredState()
            int r8 = combineMeasuredStates(r8, r5)
            r22 = r13
        L_0x05d7:
            int r14 = r14 + 1
            r5 = r19
            r7 = r21
            r10 = 8
            goto L_0x04dd
        L_0x05e1:
            if (r22 == 0) goto L_0x05e8
            android.support.constraint.a.a.d r5 = r0.f334b
            r5.mo155z()
        L_0x05e8:
            r14 = r8
            goto L_0x05eb
        L_0x05ea:
            r14 = 0
        L_0x05eb:
            android.support.constraint.a.a.d r5 = r0.f334b
            int r5 = r5.mo132d()
            android.support.constraint.a.a.d r6 = r0.f334b
            int r6 = r6.mo129a()
            int r5 = r5 + r3
            int r1 = resolveSizeAndState(r5, r1, r14)
            int r6 = r6 + r4
            int r3 = r14 << 16
            int r2 = resolveSizeAndState(r6, r2, r3)
            int r3 = r0.f339g
            int r1 = java.lang.Math.min(r3, r1)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            int r4 = r0.f340h
            int r2 = java.lang.Math.min(r4, r2)
            r2 = r2 & r3
            android.support.constraint.a.a.d r3 = r0.f334b
            boolean r4 = r3.f476al
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 == 0) goto L_0x061d
            r1 = r1 | r5
        L_0x061d:
            boolean r3 = r3.f477am
            if (r3 == 0) goto L_0x0622
            r2 = r2 | r5
        L_0x0622:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0133c c = m141c(view);
        if ((view instanceof Guideline) && !(c instanceof C0135e)) {
            C0129a aVar = (C0129a) view.getLayoutParams();
            aVar.f367Y = new C0135e();
            aVar.f359Q = true;
            ((C0135e) aVar.f367Y).mo156w(aVar.f355M);
            C0133c cVar = aVar.f367Y;
        }
        this.f333a.put(view.getId(), view);
        this.f341i = true;
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f333a.remove(view.getId());
        this.f334b.mo157A(m141c(view));
        this.f341i = true;
    }

    public final void requestLayout() {
        super.requestLayout();
        this.f341i = true;
    }

    public final void setId(int i) {
        this.f333a.remove(getId());
        super.setId(i);
        this.f333a.put(getId(), this);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0129a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m142d(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m142d(attributeSet);
    }
}
