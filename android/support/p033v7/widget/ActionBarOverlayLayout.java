package android.support.p033v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p033v7.app.C0381bo;
import android.support.p033v7.view.menu.C0451ae;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2007aa;
import androidx.core.p098j.C2008ab;
import androidx.core.p098j.C2009ac;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2071ce;
import androidx.core.p098j.C2072cf;
import androidx.core.p098j.C2073cg;
import androidx.core.p098j.C2082cp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
/* compiled from: PG */
public class ActionBarOverlayLayout extends ViewGroup implements C0555by, C2007aa, C2008ab {

    /* renamed from: a */
    static final int[] f1741a = {R.attr.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f1742A;

    /* renamed from: B */
    private final C2009ac f1743B;

    /* renamed from: b */
    public int f1744b;

    /* renamed from: c */
    ActionBarContainer f1745c;

    /* renamed from: d */
    public boolean f1746d;

    /* renamed from: e */
    public boolean f1747e;

    /* renamed from: f */
    boolean f1748f;

    /* renamed from: g */
    public int f1749g;

    /* renamed from: h */
    public C0692h f1750h;

    /* renamed from: i */
    ViewPropertyAnimator f1751i;

    /* renamed from: j */
    final AnimatorListenerAdapter f1752j;

    /* renamed from: k */
    private int f1753k;

    /* renamed from: l */
    private ContentFrameLayout f1754l;

    /* renamed from: m */
    private C0556bz f1755m;

    /* renamed from: n */
    private Drawable f1756n;

    /* renamed from: o */
    private boolean f1757o;

    /* renamed from: p */
    private boolean f1758p;

    /* renamed from: q */
    private int f1759q;

    /* renamed from: r */
    private final Rect f1760r;

    /* renamed from: s */
    private final Rect f1761s;

    /* renamed from: t */
    private final Rect f1762t;

    /* renamed from: u */
    private C2082cp f1763u;

    /* renamed from: v */
    private C2082cp f1764v;

    /* renamed from: w */
    private C2082cp f1765w;

    /* renamed from: x */
    private C2082cp f1766x;

    /* renamed from: y */
    private OverScroller f1767y;

    /* renamed from: z */
    private final Runnable f1768z;

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: v */
    private final void m1678v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1741a);
        boolean z = false;
        this.f1753k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1756n = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1757o = z;
        this.f1767y = new OverScroller(context);
    }

    /* renamed from: w */
    private static final boolean m1679w(View view, Rect rect, boolean z) {
        boolean z2;
        C0719i iVar = (C0719i) view.getLayoutParams();
        if (iVar.leftMargin != rect.left) {
            iVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (iVar.topMargin != rect.top) {
            iVar.topMargin = rect.top;
            z2 = true;
        }
        if (iVar.rightMargin != rect.right) {
            iVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || iVar.bottomMargin == rect.bottom) {
            return z2;
        }
        iVar.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: a */
    public final void mo1844a() {
        mo1858i();
        this.f1755m.mo2645h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo1845b() {
        removeCallbacks(this.f1768z);
        removeCallbacks(this.f1742A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1751i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: c */
    public final void mo1846c(int i) {
        mo1858i();
        if (i == 2) {
            this.f1755m.mo2647j();
        } else if (i == 5) {
            this.f1755m.mo2646i();
        } else if (i == 109) {
            boolean z = true;
            this.f1746d = true;
            if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                z = false;
            }
            this.f1757o = z;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0719i;
    }

    /* renamed from: d */
    public final void mo1848d(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1756n != null && !this.f1757o) {
            int bottom = this.f1745c.getVisibility() == 0 ? (int) (((float) this.f1745c.getBottom()) + this.f1745c.getTranslationY() + 0.5f) : 0;
            this.f1756n.setBounds(0, bottom, getWidth(), this.f1756n.getIntrinsicHeight() + bottom);
            this.f1756n.draw(canvas);
        }
    }

    /* renamed from: e */
    public final void mo1850e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: f */
    public final void mo1851f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1850e(view, i, i2, i3, i4, i5);
    }

    /* renamed from: g */
    public final void mo1852g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0719i();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0719i(getContext(), attributeSet);
    }

    public final int getNestedScrollAxes() {
        C2009ac acVar = this.f1743B;
        return acVar.f5928b | acVar.f5927a;
    }

    /* renamed from: h */
    public final void mo1857h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo1858i() {
        C0556bz bzVar;
        if (this.f1754l == null) {
            this.f1754l = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1745c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C0556bz) {
                bzVar = (C0556bz) findViewById;
            } else if (findViewById instanceof Toolbar) {
                bzVar = ((Toolbar) findViewById).mo2392f();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(findViewById.getClass().getSimpleName())));
            }
            this.f1755m = bzVar;
        }
    }

    /* renamed from: j */
    public final void mo1859j(int i) {
        mo1845b();
        this.f1745c.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1745c.getHeight()))));
    }

    /* renamed from: k */
    public final void mo1860k(boolean z) {
        if (z != this.f1758p) {
            this.f1758p = z;
            if (!z) {
                mo1845b();
                mo1859j(0);
            }
        }
    }

    /* renamed from: l */
    public final void mo1861l(Menu menu, C0451ae aeVar) {
        mo1858i();
        this.f1755m.mo2651n(menu, aeVar);
    }

    /* renamed from: m */
    public final void mo1862m() {
        mo1858i();
        this.f1755m.mo2652o();
    }

    /* renamed from: n */
    public final void mo1863n(Window.Callback callback) {
        mo1858i();
        this.f1755m.mo2656s(callback);
    }

    /* renamed from: o */
    public final void mo1864o(CharSequence charSequence) {
        mo1858i();
        this.f1755m.mo2657t(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005f, code lost:
        if (r0 != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
        /*
            r6 = this;
            r6.mo1858i()
            androidx.core.j.cp r7 = androidx.core.p098j.C2082cp.m5717h(r7, r6)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r7.mo5240b()
            int r2 = r7.mo5242d()
            int r3 = r7.mo5241c()
            int r4 = r7.mo5239a()
            r0.<init>(r1, r2, r3, r4)
            android.support.v7.widget.ActionBarContainer r1 = r6.f1745c
            r2 = 0
            boolean r0 = m1679w(r1, r0, r2)
            android.graphics.Rect r1 = r6.f1760r
            androidx.core.p098j.C2043bi.m5538aE(r6, r7, r1)
            android.graphics.Rect r1 = r6.f1760r
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f1760r
            int r2 = r2.top
            android.graphics.Rect r3 = r6.f1760r
            int r3 = r3.right
            android.graphics.Rect r4 = r6.f1760r
            int r4 = r4.bottom
            androidx.core.j.cm r5 = r7.f5994b
            androidx.core.j.cp r1 = r5.mo5220e(r1, r2, r3, r4)
            r6.f1763u = r1
            androidx.core.j.cp r2 = r6.f1764v
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x004d
            androidx.core.j.cp r0 = r6.f1763u
            r6.f1764v = r0
            r0 = 1
        L_0x004d:
            android.graphics.Rect r1 = r6.f1761s
            android.graphics.Rect r2 = r6.f1760r
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x005f
            android.graphics.Rect r0 = r6.f1761s
            android.graphics.Rect r1 = r6.f1760r
            r0.set(r1)
            goto L_0x0061
        L_0x005f:
            if (r0 == 0) goto L_0x0064
        L_0x0061:
            r6.requestLayout()
        L_0x0064:
            androidx.core.j.cm r7 = r7.f5994b
            androidx.core.j.cp r7 = r7.mo5235r()
            androidx.core.j.cm r7 = r7.f5994b
            androidx.core.j.cp r7 = r7.mo5231o()
            androidx.core.j.cm r7 = r7.f5994b
            androidx.core.j.cp r7 = r7.mo5230n()
            android.view.WindowInsets r7 = r7.mo5243e()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1678v(getContext());
        C2043bi.m5524R(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1845b();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0719i iVar = (C0719i) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = iVar.leftMargin + paddingLeft;
                int i7 = iVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        C2073cg cgVar;
        mo1858i();
        measureChildWithMargins(this.f1745c, i, 0, i2, 0);
        C0719i iVar = (C0719i) this.f1745c.getLayoutParams();
        int max = Math.max(0, this.f1745c.getMeasuredWidth() + iVar.leftMargin + iVar.rightMargin);
        int max2 = Math.max(0, this.f1745c.getMeasuredHeight() + iVar.topMargin + iVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1745c.getMeasuredState());
        boolean z = (C2043bi.m5584m(this) & 256) != 0;
        if (z) {
            i3 = this.f1753k;
            if (this.f1747e && this.f1745c.f1719a != null) {
                i3 += i3;
            }
        } else {
            i3 = this.f1745c.getVisibility() != 8 ? this.f1745c.getMeasuredHeight() : 0;
        }
        this.f1762t.set(this.f1760r);
        C2082cp cpVar = this.f1763u;
        this.f1765w = cpVar;
        if (this.f1746d || z) {
            C1926c d = C1926c.m5198d(cpVar.mo5240b(), this.f1765w.mo5242d() + i3, this.f1765w.mo5241c(), this.f1765w.mo5239a());
            C2082cp cpVar2 = this.f1765w;
            if (Build.VERSION.SDK_INT >= 30) {
                cgVar = new C2072cf(cpVar2);
            } else {
                cgVar = new C2071ce(cpVar2);
            }
            cgVar.mo5212e(d);
            this.f1765w = cgVar.mo5208a();
        } else {
            this.f1762t.top += i3;
            Rect rect = this.f1762t;
            rect.bottom = rect.bottom;
            this.f1765w = this.f1765w.f5994b.mo5220e(0, i3, 0, 0);
        }
        m1679w(this.f1754l, this.f1762t, true);
        if (!this.f1766x.equals(this.f1765w)) {
            C2082cp cpVar3 = this.f1765w;
            this.f1766x = cpVar3;
            C2043bi.m5596y(this.f1754l, cpVar3);
        }
        measureChildWithMargins(this.f1754l, i, 0, i2, 0);
        C0719i iVar2 = (C0719i) this.f1754l.getLayoutParams();
        int max3 = Math.max(max, this.f1754l.getMeasuredWidth() + iVar2.leftMargin + iVar2.rightMargin);
        int max4 = Math.max(max2, this.f1754l.getMeasuredHeight() + iVar2.topMargin + iVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1754l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1758p || !z) {
            return false;
        }
        this.f1767y.fling(0, 0, 0, (int) f2, 0, 0, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        if (this.f1767y.getFinalY() > this.f1745c.getHeight()) {
            mo1845b();
            this.f1742A.run();
        } else {
            mo1845b();
            this.f1768z.run();
        }
        this.f1748f = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1759q + i2;
        this.f1759q = i5;
        mo1859j(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r1 = (android.support.p033v7.app.C0381bo) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            androidx.core.j.ac r1 = r0.f1743B
            r2 = 0
            r1.mo5172a(r3, r2)
            android.support.v7.widget.ActionBarContainer r1 = r0.f1745c
            if (r1 == 0) goto L_0x0010
            float r1 = r1.getTranslationY()
            int r1 = (int) r1
            int r2 = -r1
        L_0x0010:
            r0.f1759q = r2
            r0.mo1845b()
            android.support.v7.widget.h r1 = r0.f1750h
            if (r1 == 0) goto L_0x0025
            android.support.v7.app.bo r1 = (android.support.p033v7.app.C0381bo) r1
            android.support.v7.view.l r2 = r1.f1301o
            if (r2 == 0) goto L_0x0025
            r2.mo1435a()
            r2 = 0
            r1.f1301o = r2
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1745c.getVisibility() != 0) {
            return false;
        }
        return this.f1758p;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f1758p && !this.f1748f) {
            if (this.f1759q <= this.f1745c.getHeight()) {
                mo1845b();
                postDelayed(this.f1768z, 600);
                return;
            }
            mo1845b();
            postDelayed(this.f1742A, 600);
        }
    }

    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        mo1858i();
        int i2 = this.f1749g ^ i;
        this.f1749g = i;
        int i3 = i & 4;
        int i4 = i & 256;
        C0692h hVar = this.f1750h;
        if (hVar != null) {
            C0381bo boVar = (C0381bo) hVar;
            boVar.f1298l = i4 == 0;
            if (i3 == 0 || i4 == 0) {
                if (boVar.f1300n) {
                    boVar.f1300n = false;
                    boVar.mo1285K(true);
                }
            } else if (!boVar.f1300n) {
                boVar.f1300n = true;
                boVar.mo1285K(true);
            }
        }
        if ((i2 & 256) != 0 && this.f1750h != null) {
            C2043bi.m5524R(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1744b = i;
        C0692h hVar = this.f1750h;
        if (hVar != null) {
            ((C0381bo) hVar).f1297k = i;
        }
    }

    /* renamed from: p */
    public final boolean mo1879p() {
        mo1858i();
        return this.f1755m.mo2658u();
    }

    /* renamed from: q */
    public final boolean mo1880q() {
        mo1858i();
        return this.f1755m.mo2660w();
    }

    /* renamed from: r */
    public final boolean mo1881r() {
        mo1858i();
        return this.f1755m.mo2661x();
    }

    /* renamed from: s */
    public final boolean mo1882s() {
        mo1858i();
        return this.f1755m.mo2662y();
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final boolean mo1884t(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: u */
    public final boolean mo1885u() {
        mo1858i();
        return this.f1755m.mo2663z();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1744b = 0;
        this.f1760r = new Rect();
        this.f1761s = new Rect();
        this.f1762t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.f1763u = C2082cp.f5993a;
        C2082cp cpVar = C2082cp.f5993a;
        this.f1764v = cpVar;
        this.f1765w = cpVar;
        this.f1766x = cpVar;
        this.f1752j = new C0611e(this);
        this.f1768z = new C0638f(this);
        this.f1742A = new C0665g(this);
        m1678v(context);
        this.f1743B = new C2009ac();
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0719i(layoutParams);
    }
}
