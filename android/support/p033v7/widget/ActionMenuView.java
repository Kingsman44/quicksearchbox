package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0452af;
import android.support.p033v7.view.menu.C0454ah;
import android.support.p033v7.view.menu.C0475o;
import android.support.p033v7.view.menu.C0476p;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.view.menu.C0480t;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
/* compiled from: PG */
public class ActionMenuView extends C0597dm implements C0476p, C0454ah {

    /* renamed from: a */
    public C0477q f1784a;

    /* renamed from: b */
    public boolean f1785b;

    /* renamed from: c */
    public ActionMenuPresenter f1786c;

    /* renamed from: d */
    public C0451ae f1787d;

    /* renamed from: e */
    public C0475o f1788e;

    /* renamed from: f */
    C0737ir f1789f;

    /* renamed from: g */
    private Context f1790g;

    /* renamed from: h */
    private int f1791h;

    /* renamed from: i */
    private boolean f1792i;

    /* renamed from: j */
    private int f1793j;

    /* renamed from: k */
    private int f1794k;

    /* renamed from: l */
    private int f1795l;

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: j */
    protected static final C0774t m1715j() {
        C0774t tVar = new C0774t();
        tVar.gravity = 16;
        return tVar;
    }

    /* renamed from: k */
    protected static final C0774t m1716k(ViewGroup.LayoutParams layoutParams) {
        C0774t tVar;
        if (layoutParams == null) {
            return m1715j();
        }
        if (layoutParams instanceof C0774t) {
            tVar = new C0774t((C0774t) layoutParams);
        } else {
            tVar = new C0774t(layoutParams);
        }
        if (tVar.gravity <= 0) {
            tVar.gravity = 16;
        }
        return tVar;
    }

    /* renamed from: a */
    public final void mo1454a(C0477q qVar) {
        this.f1784a = qVar;
    }

    /* renamed from: b */
    public final boolean mo1455b(C0480t tVar) {
        return this.f1784a.mo1680z(tVar, (C0452af) null, 0);
    }

    /* renamed from: c */
    public final C0774t generateLayoutParams(AttributeSet attributeSet) {
        return new C0774t(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0774t;
    }

    /* renamed from: d */
    public final Menu mo1896d() {
        if (this.f1784a == null) {
            Context context = getContext();
            C0477q qVar = new C0477q(context);
            this.f1784a = qVar;
            qVar.mo1586p(new C0775u(this));
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1786c = actionMenuPresenter;
            actionMenuPresenter.mo1891q();
            ActionMenuPresenter actionMenuPresenter2 = this.f1786c;
            C0451ae aeVar = this.f1787d;
            if (aeVar == null) {
                aeVar = new C0773s();
            }
            actionMenuPresenter2.f1594e = aeVar;
            this.f1784a.mo1655f(this.f1786c, this.f1790g);
            this.f1786c.mo1886k(this);
        }
        return this.f1784a;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public final void mo1898e() {
        ActionMenuPresenter actionMenuPresenter = this.f1786c;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1887l();
            actionMenuPresenter.mo1890p();
        }
    }

    /* renamed from: f */
    public final void mo1899f(int i) {
        if (this.f1791h != i) {
            this.f1791h = i;
            if (i == 0) {
                this.f1790g = getContext();
            } else {
                this.f1790g = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* renamed from: g */
    public final void mo1900g(ActionMenuPresenter actionMenuPresenter) {
        this.f1786c = actionMenuPresenter;
        actionMenuPresenter.mo1886k(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo1904h(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0772r)) {
            z = ((C0772r) childAt).mo1443c();
        }
        return (i <= 0 || !(childAt2 instanceof C0772r)) ? z : ((C0772r) childAt2).mo1444d() | z;
    }

    /* renamed from: i */
    public final boolean mo1905i() {
        ActionMenuPresenter actionMenuPresenter = this.f1786c;
        return actionMenuPresenter != null && actionMenuPresenter.mo1888m();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1786c;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1546f(false);
            if (this.f1786c.mo1888m()) {
                this.f1786c.mo1887l();
                this.f1786c.mo1889o();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1898e();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f1792i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0763jq.m2570b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0774t tVar = (C0774t) childAt.getLayoutParams();
                if (tVar.f2661a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1904h(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + tVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - tVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + tVar.leftMargin) + tVar.rightMargin;
                    mo1904h(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1) {
            if (i9 != 0) {
                childCount = 1;
            } else {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i13 = (i8 / 2) - (measuredWidth2 / 2);
                int i14 = i7 - (measuredHeight2 / 2);
                childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
                return;
            }
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0774t tVar2 = (C0774t) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !tVar2.f2661a) {
                    int i17 = width - tVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + tVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0774t tVar3 = (C0774t) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !tVar3.f2661a) {
                int i20 = paddingLeft + tVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + tVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r0 = r30
            boolean r1 = r0.f1792i
            int r2 = android.view.View.MeasureSpec.getMode(r31)
            r3 = 1
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 != r5) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            r0.f1792i = r2
            if (r1 == r2) goto L_0x0017
            r0.f1793j = r4
        L_0x0017:
            int r1 = android.view.View.MeasureSpec.getSize(r31)
            boolean r2 = r0.f1792i
            if (r2 == 0) goto L_0x002c
            android.support.v7.view.menu.q r2 = r0.f1784a
            if (r2 == 0) goto L_0x002c
            int r6 = r0.f1793j
            if (r1 == r6) goto L_0x002c
            r0.f1793j = r1
            r2.mo1665l(r3)
        L_0x002c:
            int r1 = r30.getChildCount()
            boolean r2 = r0.f1792i
            if (r2 == 0) goto L_0x02fe
            if (r1 <= 0) goto L_0x02fe
            int r1 = android.view.View.MeasureSpec.getMode(r32)
            int r2 = android.view.View.MeasureSpec.getSize(r31)
            int r6 = android.view.View.MeasureSpec.getSize(r32)
            int r7 = r30.getPaddingLeft()
            int r8 = r30.getPaddingRight()
            int r9 = r30.getPaddingTop()
            int r10 = r30.getPaddingBottom()
            int r9 = r9 + r10
            r10 = -2
            r11 = r32
            int r10 = getChildMeasureSpec(r11, r9, r10)
            int r7 = r7 + r8
            int r2 = r2 - r7
            int r7 = r0.f1794k
            int r8 = r2 / r7
            int r11 = r2 % r7
            if (r8 != 0) goto L_0x0068
            r0.setMeasuredDimension(r2, r4)
            return
        L_0x0068:
            int r11 = r11 / r8
            int r7 = r7 + r11
            int r11 = r30.getChildCount()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
        L_0x0078:
            if (r14 >= r11) goto L_0x0163
            android.view.View r5 = r0.getChildAt(r14)
            int r3 = r5.getVisibility()
            r4 = 8
            if (r3 != r4) goto L_0x008e
            r24 = r2
            r21 = r6
            r23 = r9
            goto L_0x0157
        L_0x008e:
            boolean r3 = r5 instanceof android.support.p033v7.view.menu.ActionMenuItemView
            int r12 = r12 + 1
            if (r3 == 0) goto L_0x009d
            int r4 = r0.f1795l
            r21 = r6
            r6 = 0
            r5.setPadding(r4, r6, r4, r6)
            goto L_0x00a0
        L_0x009d:
            r21 = r6
            r6 = 0
        L_0x00a0:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            android.support.v7.widget.t r4 = (android.support.p033v7.widget.C0774t) r4
            r4.f2666f = r6
            r4.f2663c = r6
            r4.f2662b = r6
            r4.f2664d = r6
            r4.leftMargin = r6
            r4.rightMargin = r6
            if (r3 == 0) goto L_0x00bf
            r6 = r5
            android.support.v7.view.menu.ActionMenuItemView r6 = (android.support.p033v7.view.menu.ActionMenuItemView) r6
            boolean r6 = r6.mo1442b()
            if (r6 == 0) goto L_0x00bf
            r6 = 1
            goto L_0x00c0
        L_0x00bf:
            r6 = 0
        L_0x00c0:
            r4.f2665e = r6
            boolean r6 = r4.f2661a
            r22 = r12
            r12 = 1
            if (r12 == r6) goto L_0x00cb
            r6 = r8
            goto L_0x00cc
        L_0x00cb:
            r6 = 1
        L_0x00cc:
            android.view.ViewGroup$LayoutParams r12 = r5.getLayoutParams()
            android.support.v7.widget.t r12 = (android.support.p033v7.widget.C0774t) r12
            int r23 = android.view.View.MeasureSpec.getSize(r10)
            r24 = r2
            int r2 = r23 - r9
            r23 = r9
            int r9 = android.view.View.MeasureSpec.getMode(r10)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r9)
            if (r3 == 0) goto L_0x00ea
            r3 = r5
            android.support.v7.view.menu.ActionMenuItemView r3 = (android.support.p033v7.view.menu.ActionMenuItemView) r3
            goto L_0x00eb
        L_0x00ea:
            r3 = 0
        L_0x00eb:
            if (r3 == 0) goto L_0x00f5
            boolean r3 = r3.mo1442b()
            if (r3 == 0) goto L_0x00f5
            r3 = 1
            goto L_0x00f6
        L_0x00f5:
            r3 = 0
        L_0x00f6:
            if (r6 <= 0) goto L_0x011a
            if (r3 == 0) goto L_0x00fd
            r9 = 2
            if (r6 < r9) goto L_0x011a
        L_0x00fd:
            int r6 = r6 * r7
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r5.measure(r6, r2)
            int r6 = r5.getMeasuredWidth()
            int r9 = r6 / r7
            int r6 = r6 % r7
            if (r6 == 0) goto L_0x0113
            int r9 = r9 + 1
        L_0x0113:
            if (r3 == 0) goto L_0x011b
            r6 = 2
            if (r9 >= r6) goto L_0x011b
            r9 = 2
            goto L_0x011b
        L_0x011a:
            r9 = 0
        L_0x011b:
            boolean r6 = r12.f2661a
            if (r6 != 0) goto L_0x0123
            if (r3 == 0) goto L_0x0123
            r3 = 1
            goto L_0x0124
        L_0x0123:
            r3 = 0
        L_0x0124:
            r12.f2664d = r3
            r12.f2662b = r9
            int r3 = r9 * r7
            r6 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r6)
            r5.measure(r3, r2)
            r2 = r18
            int r18 = java.lang.Math.max(r2, r9)
            boolean r2 = r4.f2664d
            if (r2 == 0) goto L_0x013f
            int r19 = r19 + 1
        L_0x013f:
            boolean r2 = r4.f2661a
            r15 = r15 | r2
            int r8 = r8 - r9
            int r2 = r5.getMeasuredHeight()
            int r13 = java.lang.Math.max(r13, r2)
            r2 = 1
            if (r9 != r2) goto L_0x0155
            int r3 = r2 << r14
            long r2 = (long) r3
            long r2 = r16 | r2
            r16 = r2
        L_0x0155:
            r12 = r22
        L_0x0157:
            int r14 = r14 + 1
            r6 = r21
            r9 = r23
            r2 = r24
            r3 = 1
            r4 = 0
            goto L_0x0078
        L_0x0163:
            r24 = r2
            r21 = r6
            r2 = r18
            if (r15 == 0) goto L_0x0171
            r3 = 2
            if (r12 != r3) goto L_0x0171
            r3 = 1
            r12 = 2
            goto L_0x0172
        L_0x0171:
            r3 = 0
        L_0x0172:
            r4 = 0
        L_0x0173:
            if (r19 <= 0) goto L_0x01fb
            if (r8 <= 0) goto L_0x01fb
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r14 = 0
            r22 = 0
        L_0x017e:
            if (r5 >= r11) goto L_0x01aa
            android.view.View r6 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.t r6 = (android.support.p033v7.widget.C0774t) r6
            r18 = r4
            boolean r4 = r6.f2664d
            if (r4 != 0) goto L_0x0191
            goto L_0x01a5
        L_0x0191:
            int r4 = r6.f2662b
            r25 = 1
            if (r4 >= r9) goto L_0x019c
            long r22 = r25 << r5
            r9 = r4
            r14 = 1
            goto L_0x01a5
        L_0x019c:
            if (r4 != r9) goto L_0x01a5
            long r27 = r25 << r5
            long r22 = r22 | r27
            int r4 = r14 + 1
            r14 = r4
        L_0x01a5:
            int r5 = r5 + 1
            r4 = r18
            goto L_0x017e
        L_0x01aa:
            r18 = r4
            long r16 = r16 | r22
            if (r14 > r8) goto L_0x01f8
            int r9 = r9 + 1
            r4 = 0
        L_0x01b3:
            if (r4 >= r11) goto L_0x01f5
            android.view.View r5 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.support.v7.widget.t r6 = (android.support.p033v7.widget.C0774t) r6
            r27 = r13
            r14 = 1
            int r13 = r14 << r4
            long r13 = (long) r13
            long r25 = r22 & r13
            r28 = 0
            int r18 = (r25 > r28 ? 1 : (r25 == r28 ? 0 : -1))
            if (r18 != 0) goto L_0x01d4
            int r5 = r6.f2662b
            if (r5 != r9) goto L_0x01f0
            long r16 = r16 | r13
            goto L_0x01f0
        L_0x01d4:
            if (r3 == 0) goto L_0x01e6
            boolean r13 = r6.f2665e
            if (r13 == 0) goto L_0x01e6
            r13 = 1
            if (r8 != r13) goto L_0x01e6
            int r8 = r0.f1795l
            int r14 = r8 + r7
            r13 = 0
            r5.setPadding(r14, r13, r8, r13)
            r8 = 1
        L_0x01e6:
            int r5 = r6.f2662b
            r13 = 1
            int r5 = r5 + r13
            r6.f2662b = r5
            r6.f2666f = r13
            int r8 = r8 + -1
        L_0x01f0:
            int r4 = r4 + 1
            r13 = r27
            goto L_0x01b3
        L_0x01f5:
            r4 = 1
            goto L_0x0173
        L_0x01f8:
            r27 = r13
            goto L_0x01fe
        L_0x01fb:
            r18 = r4
            goto L_0x01f8
        L_0x01fe:
            if (r15 != 0) goto L_0x0207
            r3 = 1
            if (r12 != r3) goto L_0x0208
            r4 = 1
            r20 = 1
            goto L_0x020b
        L_0x0207:
            r3 = 1
        L_0x0208:
            r20 = r12
            r4 = 0
        L_0x020b:
            if (r8 <= 0) goto L_0x02c2
            r5 = 0
            int r9 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x02c2
            int r5 = r20 + -1
            if (r8 < r5) goto L_0x021b
            if (r4 != 0) goto L_0x021b
            if (r2 <= r3) goto L_0x02c2
        L_0x021b:
            int r2 = java.lang.Long.bitCount(r16)
            float r2 = (float) r2
            if (r4 != 0) goto L_0x025b
            r3 = 1
            long r3 = r16 & r3
            r5 = -1090519040(0xffffffffbf000000, float:-0.5)
            r12 = 0
            int r6 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x023e
            r3 = 0
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            android.support.v7.widget.t r3 = (android.support.p033v7.widget.C0774t) r3
            boolean r3 = r3.f2665e
            if (r3 != 0) goto L_0x023e
            float r2 = r2 + r5
        L_0x023e:
            int r3 = r11 + -1
            r4 = 1
            int r6 = r4 << r3
            long r12 = (long) r6
            long r12 = r16 & r12
            r14 = 0
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x025b
            android.view.View r3 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v7.widget.t r3 = (android.support.p033v7.widget.C0774t) r3
            boolean r3 = r3.f2665e
            if (r3 != 0) goto L_0x025b
            float r2 = r2 + r5
        L_0x025b:
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0266
            int r8 = r8 * r7
            float r3 = (float) r8
            float r3 = r3 / r2
            int r6 = (int) r3
            goto L_0x0267
        L_0x0266:
            r6 = 0
        L_0x0267:
            r12 = r18
            r2 = 0
        L_0x026a:
            if (r2 >= r11) goto L_0x02c0
            r3 = 1
            int r4 = r3 << r2
            long r3 = (long) r4
            long r3 = r16 & r3
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x027a
            r3 = 2
            goto L_0x02bd
        L_0x027a:
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.support.v7.widget.t r4 = (android.support.p033v7.widget.C0774t) r4
            boolean r3 = r3 instanceof android.support.p033v7.view.menu.ActionMenuItemView
            if (r3 == 0) goto L_0x029e
            r4.f2663c = r6
            r3 = 1
            r4.f2666f = r3
            if (r2 != 0) goto L_0x029c
            boolean r2 = r4.f2665e
            if (r2 != 0) goto L_0x0299
            int r2 = -r6
            r3 = 2
            int r2 = r2 / r3
            r4.leftMargin = r2
            goto L_0x029a
        L_0x0299:
            r3 = 2
        L_0x029a:
            r2 = 0
            goto L_0x02ac
        L_0x029c:
            r3 = 2
            goto L_0x02ac
        L_0x029e:
            r3 = 2
            boolean r5 = r4.f2661a
            if (r5 == 0) goto L_0x02af
            r4.f2663c = r6
            r5 = 1
            r4.f2666f = r5
            int r5 = -r6
            int r5 = r5 / r3
            r4.rightMargin = r5
        L_0x02ac:
            r4 = 1
            r12 = 1
            goto L_0x02be
        L_0x02af:
            if (r2 == 0) goto L_0x02b5
            int r5 = r6 / 2
            r4.leftMargin = r5
        L_0x02b5:
            int r5 = r11 + -1
            if (r2 == r5) goto L_0x02bd
            int r5 = r6 / 2
            r4.rightMargin = r5
        L_0x02bd:
            r4 = 1
        L_0x02be:
            int r2 = r2 + r4
            goto L_0x026a
        L_0x02c0:
            r4 = r12
            goto L_0x02c4
        L_0x02c2:
            r4 = r18
        L_0x02c4:
            if (r4 == 0) goto L_0x02ed
            r4 = 0
        L_0x02c7:
            if (r4 >= r11) goto L_0x02ed
            android.view.View r2 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.t r3 = (android.support.p033v7.widget.C0774t) r3
            boolean r5 = r3.f2666f
            if (r5 == 0) goto L_0x02e8
            int r5 = r3.f2662b
            int r5 = r5 * r7
            int r3 = r3.f2663c
            int r5 = r5 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
            r2.measure(r5, r10)
            goto L_0x02ea
        L_0x02e8:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x02ea:
            int r4 = r4 + 1
            goto L_0x02c7
        L_0x02ed:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L_0x02f6
            r2 = r24
            r6 = r27
            goto L_0x02fa
        L_0x02f6:
            r6 = r21
            r2 = r24
        L_0x02fa:
            r0.setMeasuredDimension(r2, r6)
            return
        L_0x02fe:
            r11 = r32
            r6 = 0
        L_0x0301:
            if (r6 >= r1) goto L_0x0315
            android.view.View r2 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.t r2 = (android.support.p033v7.widget.C0774t) r2
            r3 = 0
            r2.rightMargin = r3
            r2.leftMargin = r3
            int r6 = r6 + 1
            goto L_0x0301
        L_0x0315:
            super.onMeasure(r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1794k = (int) (56.0f * f);
        this.f1795l = (int) (f * 4.0f);
        this.f1790g = context;
        this.f1791h = 0;
    }
}
