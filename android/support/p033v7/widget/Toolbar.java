package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.app.C0339a;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.view.C0442j;
import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0475o;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.view.menu.C0480t;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2104s;
import androidx.core.p098j.C2105t;
import androidx.customview.view.AbsSavedState;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.Toolbar */
/* compiled from: PG */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public boolean f1922A;

    /* renamed from: B */
    private TextView f1923B;

    /* renamed from: C */
    private ImageButton f1924C;

    /* renamed from: D */
    private int f1925D;

    /* renamed from: E */
    private int f1926E;

    /* renamed from: F */
    private int f1927F;

    /* renamed from: G */
    private int f1928G;

    /* renamed from: H */
    private int f1929H;

    /* renamed from: I */
    private ColorStateList f1930I;

    /* renamed from: J */
    private ColorStateList f1931J;

    /* renamed from: K */
    private boolean f1932K;

    /* renamed from: L */
    private boolean f1933L;

    /* renamed from: M */
    private final ArrayList f1934M;

    /* renamed from: N */
    private final int[] f1935N;

    /* renamed from: O */
    private C0750jd f1936O;

    /* renamed from: P */
    private OnBackInvokedCallback f1937P;

    /* renamed from: Q */
    private OnBackInvokedDispatcher f1938Q;

    /* renamed from: R */
    private final Runnable f1939R;

    /* renamed from: S */
    private final C0737ir f1940S;

    /* renamed from: a */
    public ActionMenuView f1941a;

    /* renamed from: b */
    public TextView f1942b;

    /* renamed from: c */
    public ImageView f1943c;

    /* renamed from: d */
    public Drawable f1944d;

    /* renamed from: e */
    public CharSequence f1945e;

    /* renamed from: f */
    ImageButton f1946f;

    /* renamed from: g */
    View f1947g;

    /* renamed from: h */
    public Context f1948h;

    /* renamed from: i */
    public int f1949i;

    /* renamed from: j */
    public int f1950j;

    /* renamed from: k */
    int f1951k;

    /* renamed from: l */
    public int f1952l;

    /* renamed from: m */
    public int f1953m;

    /* renamed from: n */
    public int f1954n;

    /* renamed from: o */
    public int f1955o;

    /* renamed from: p */
    public C0680go f1956p;

    /* renamed from: q */
    public CharSequence f1957q;

    /* renamed from: r */
    public CharSequence f1958r;

    /* renamed from: s */
    public final ArrayList f1959s;

    /* renamed from: t */
    final C2105t f1960t;

    /* renamed from: u */
    public C0745iz f1961u;

    /* renamed from: v */
    public ActionMenuPresenter f1962v;

    /* renamed from: w */
    public C0743ix f1963w;

    /* renamed from: x */
    public C0451ae f1964x;

    /* renamed from: y */
    public C0475o f1965y;

    /* renamed from: z */
    public boolean f1966z;

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: E */
    protected static final C0744iy m1805E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0744iy) {
            return new C0744iy((C0744iy) layoutParams);
        }
        if (layoutParams instanceof C0339a) {
            return new C0744iy((C0339a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0744iy((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0744iy(layoutParams);
    }

    /* renamed from: F */
    private final int m1806F(int i) {
        int f = C2043bi.m5577f(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, f) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return f == 1 ? 5 : 3;
    }

    /* renamed from: G */
    private final int m1807G(View view, int i) {
        C0744iy iyVar = (C0744iy) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = iyVar.f1134a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.f1929H & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - iyVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i4 < iyVar.topMargin) {
            i4 = iyVar.topMargin;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            if (i5 < iyVar.bottomMargin) {
                i4 = Math.max(0, i4 - (iyVar.bottomMargin - i5));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: H */
    private final int m1808H(View view, int i, int[] iArr, int i2) {
        C0744iy iyVar = (C0744iy) view.getLayoutParams();
        int i3 = iyVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int G = m1807G(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, G, max + measuredWidth, view.getMeasuredHeight() + G);
        return max + measuredWidth + iyVar.rightMargin;
    }

    /* renamed from: I */
    private final int m1809I(View view, int i, int[] iArr, int i2) {
        C0744iy iyVar = (C0744iy) view.getLayoutParams();
        int i3 = iyVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int G = m1807G(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, G, max, view.getMeasuredHeight() + G);
        return max - (measuredWidth + iyVar.leftMargin);
    }

    /* renamed from: J */
    private final int m1810J(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: K */
    private final void m1811K(List list, int i) {
        int f = C2043bi.m5577f(this);
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C2043bi.m5577f(this));
        list.clear();
        if (f == 1) {
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    View childAt = getChildAt(childCount);
                    C0744iy iyVar = (C0744iy) childAt.getLayoutParams();
                    if (iyVar.f2607b == 0 && m1816P(childAt) && m1806F(iyVar.f1134a) == absoluteGravity) {
                        list.add(childAt);
                    }
                } else {
                    return;
                }
            }
        } else {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = getChildAt(i2);
                C0744iy iyVar2 = (C0744iy) childAt2.getLayoutParams();
                if (iyVar2.f2607b == 0 && m1816P(childAt2) && m1806F(iyVar2.f1134a) == absoluteGravity) {
                    list.add(childAt2);
                }
            }
        }
    }

    /* renamed from: L */
    private final void m1812L(View view, boolean z) {
        C0744iy iyVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            iyVar = new C0744iy();
        } else if (!checkLayoutParams(layoutParams)) {
            iyVar = m1805E(layoutParams);
        } else {
            iyVar = (C0744iy) layoutParams;
        }
        iyVar.f2607b = 1;
        if (!z || this.f1947g == null) {
            addView(view, iyVar);
            return;
        }
        view.setLayoutParams(iyVar);
        this.f1959s.add(view);
    }

    /* renamed from: M */
    private final void m1813M() {
        if (this.f1943c == null) {
            this.f1943c = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: N */
    private final void m1814N() {
        if (this.f1924C == null) {
            this.f1924C = new AppCompatImageButton(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            C0744iy iyVar = new C0744iy();
            iyVar.f1134a = (this.f1951k & 112) | 8388611;
            this.f1924C.setLayoutParams(iyVar);
        }
    }

    /* renamed from: O */
    private final boolean m1815O(View view) {
        return view.getParent() == this || this.f1959s.contains(view);
    }

    /* renamed from: P */
    private final boolean m1816P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: Q */
    private static final int m1817Q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C2104s.m5790c(marginLayoutParams) + C2104s.m5789b(marginLayoutParams);
    }

    /* renamed from: R */
    private static final int m1818R(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: S */
    private final void m1819S(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: A */
    public final boolean mo2383A() {
        C0743ix ixVar = this.f1963w;
        return (ixVar == null || ixVar.f2605b == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f1786c;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2384B() {
        /*
            r1 = this;
            android.support.v7.widget.ActionMenuView r0 = r1.f1941a
            if (r0 == 0) goto L_0x0010
            android.support.v7.widget.ActionMenuPresenter r0 = r0.f1786c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.mo1887l()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.Toolbar.mo2384B():boolean");
    }

    /* renamed from: C */
    public final boolean mo2385C() {
        ActionMenuView actionMenuView = this.f1941a;
        return actionMenuView != null && actionMenuView.mo1905i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f1786c;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2386D() {
        /*
            r1 = this;
            android.support.v7.widget.ActionMenuView r0 = r1.f1941a
            if (r0 == 0) goto L_0x0010
            android.support.v7.widget.ActionMenuPresenter r0 = r0.f1786c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.mo1889o()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.Toolbar.mo2386D():boolean");
    }

    /* renamed from: b */
    public final int mo2387b() {
        C0680go goVar = this.f1956p;
        if (goVar != null) {
            return goVar.f2498g ? goVar.f2493b : goVar.f2492a;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f1784a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo2388c() {
        /*
            r3 = this;
            android.support.v7.widget.ActionMenuView r0 = r3.f1941a
            if (r0 == 0) goto L_0x001e
            android.support.v7.view.menu.q r0 = r0.f1784a
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x001e
            int r0 = r3.mo2402lp()
            int r1 = r3.f1928G
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0022
        L_0x001e:
            int r0 = r3.mo2402lp()
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.Toolbar.mo2388c():int");
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0744iy);
    }

    /* renamed from: d */
    public final int mo2390d() {
        return mo2391e() != null ? Math.max(mo2387b(), Math.max(this.f1927F, 0)) : mo2387b();
    }

    /* renamed from: e */
    public final Drawable mo2391e() {
        ImageButton imageButton = this.f1924C;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* renamed from: f */
    public final C0556bz mo2392f() {
        if (this.f1936O == null) {
            this.f1936O = new C0750jd(this, true);
        }
        return this.f1936O;
    }

    /* renamed from: g */
    public final Menu mo2393g() {
        mo2401l();
        return this.f1941a.mo1896d();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0744iy();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0744iy(getContext(), attributeSet);
    }

    /* renamed from: h */
    public final CharSequence mo2397h() {
        ImageButton imageButton = this.f1924C;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    /* renamed from: i */
    public final void mo2398i() {
        C0743ix ixVar = this.f1963w;
        C0480t tVar = ixVar == null ? null : ixVar.f2605b;
        if (tVar != null) {
            tVar.collapseActionView();
        }
    }

    /* renamed from: j */
    public final void mo2399j() {
        ActionMenuView actionMenuView = this.f1941a;
        if (actionMenuView != null) {
            actionMenuView.mo1898e();
        }
    }

    /* renamed from: k */
    public final void mo2400k() {
        if (this.f1956p == null) {
            this.f1956p = new C0680go();
        }
    }

    /* renamed from: l */
    public final void mo2401l() {
        mo2403m();
        ActionMenuView actionMenuView = this.f1941a;
        if (actionMenuView.f1784a == null) {
            Menu d = actionMenuView.mo1896d();
            if (this.f1963w == null) {
                this.f1963w = new C0743ix(this);
            }
            this.f1941a.f1786c.f1771j = true;
            ((C0477q) d).mo1655f(this.f1963w, this.f1948h);
            mo2425z();
        }
    }

    /* renamed from: lp */
    public final int mo2402lp() {
        C0680go goVar = this.f1956p;
        if (goVar != null) {
            return goVar.f2498g ? goVar.f2492a : goVar.f2493b;
        }
        return 0;
    }

    /* renamed from: m */
    public final void mo2403m() {
        if (this.f1941a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1941a = actionMenuView;
            actionMenuView.mo1899f(this.f1949i);
            ActionMenuView actionMenuView2 = this.f1941a;
            actionMenuView2.f1789f = this.f1940S;
            C0451ae aeVar = this.f1964x;
            C0739it itVar = new C0739it(this);
            actionMenuView2.f1787d = aeVar;
            actionMenuView2.f1788e = itVar;
            C0744iy iyVar = new C0744iy();
            iyVar.f1134a = (this.f1951k & 112) | 8388613;
            this.f1941a.setLayoutParams(iyVar);
            m1812L(this.f1941a, false);
        }
    }

    /* renamed from: n */
    public void mo2404n(int i) {
        new C0442j(getContext()).inflate(i, mo2393g());
    }

    /* renamed from: o */
    public final void mo2405o(Drawable drawable) {
        if (drawable != null) {
            m1813M();
            if (!m1815O(this.f1943c)) {
                m1812L(this.f1943c, true);
            }
        } else {
            ImageView imageView = this.f1943c;
            if (imageView != null && m1815O(imageView)) {
                removeView(this.f1943c);
                this.f1959s.remove(this.f1943c);
            }
        }
        ImageView imageView2 = this.f1943c;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo2425z();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1939R);
        mo2425z();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.f1933L = false;
            actionMasked = 9;
        }
        if (!this.f1933L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.f1933L = true;
                }
                if (i == 10 || i == 3) {
                    this.f1933L = false;
                }
                return true;
            }
        }
        i = actionMasked;
        this.f1933L = false;
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b8 A[LOOP:0: B:109:0x02b6->B:110:0x02b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02db A[LOOP:1: B:112:0x02d9->B:113:0x02db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02ff A[LOOP:2: B:115:0x02fd->B:116:0x02ff, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x034f A[LOOP:3: B:123:0x034d->B:124:0x034f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = androidx.core.p098j.C2043bi.m5577f(r18)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            int r6 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r8 = r18.getPaddingTop()
            int r9 = r18.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1935N
            r11[r3] = r2
            r11[r2] = r2
            int r12 = androidx.core.p098j.C2043bi.m5579h(r18)
            if (r12 < 0) goto L_0x003a
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1924C
            boolean r13 = r0.m1816P(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f1924C
            int r13 = r0.m1809I(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f1924C
            int r13 = r0.m1808H(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f1946f
            boolean r15 = r0.m1816P(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f1946f
            int r14 = r0.m1809I(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f1946f
            int r13 = r0.m1808H(r15, r13, r11, r12)
        L_0x006e:
            android.support.v7.widget.ActionMenuView r15 = r0.f1941a
            boolean r15 = r0.m1816P(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            android.support.v7.widget.ActionMenuView r15 = r0.f1941a
            int r13 = r0.m1808H(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            android.support.v7.widget.ActionMenuView r15 = r0.f1941a
            int r14 = r0.m1809I(r15, r14, r11, r12)
        L_0x0085:
            int r15 = androidx.core.p098j.C2043bi.m5577f(r18)
            if (r15 != r3) goto L_0x0090
            int r15 = r18.mo2388c()
            goto L_0x0094
        L_0x0090:
            int r15 = r18.mo2390d()
        L_0x0094:
            int r2 = androidx.core.p098j.C2043bi.m5577f(r18)
            if (r2 != r3) goto L_0x009f
            int r2 = r18.mo2390d()
            goto L_0x00a3
        L_0x009f:
            int r2 = r18.mo2388c()
        L_0x00a3:
            int r3 = r15 - r13
            r22 = r7
            r7 = 0
            int r3 = java.lang.Math.max(r7, r3)
            r11[r7] = r3
            int r3 = r10 - r14
            int r3 = r2 - r3
            int r3 = java.lang.Math.max(r7, r3)
            r7 = 1
            r11[r7] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r2
            int r2 = java.lang.Math.min(r14, r10)
            android.view.View r7 = r0.f1947g
            boolean r7 = r0.m1816P(r7)
            if (r7 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.view.View r7 = r0.f1947g
            int r2 = r0.m1809I(r7, r2, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.view.View r7 = r0.f1947g
            int r3 = r0.m1808H(r7, r3, r11, r12)
        L_0x00d9:
            android.widget.ImageView r7 = r0.f1943c
            boolean r7 = r0.m1816P(r7)
            if (r7 == 0) goto L_0x00f0
            if (r1 == 0) goto L_0x00ea
            android.widget.ImageView r7 = r0.f1943c
            int r2 = r0.m1809I(r7, r2, r11, r12)
            goto L_0x00f0
        L_0x00ea:
            android.widget.ImageView r7 = r0.f1943c
            int r3 = r0.m1808H(r7, r3, r11, r12)
        L_0x00f0:
            android.widget.TextView r7 = r0.f1923B
            boolean r7 = r0.m1816P(r7)
            android.widget.TextView r10 = r0.f1942b
            boolean r10 = r0.m1816P(r10)
            if (r7 == 0) goto L_0x0113
            android.widget.TextView r13 = r0.f1923B
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            android.support.v7.widget.iy r13 = (android.support.p033v7.widget.C0744iy) r13
            int r14 = r13.topMargin
            android.widget.TextView r15 = r0.f1923B
            int r15 = r15.getMeasuredHeight()
            int r14 = r14 + r15
            int r13 = r13.bottomMargin
            int r13 = r13 + r14
            goto L_0x0114
        L_0x0113:
            r13 = 0
        L_0x0114:
            if (r10 == 0) goto L_0x012e
            android.widget.TextView r14 = r0.f1942b
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            android.support.v7.widget.iy r14 = (android.support.p033v7.widget.C0744iy) r14
            int r15 = r14.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1942b
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r14.bottomMargin
            int r15 = r15 + r4
            int r13 = r13 + r15
            goto L_0x0130
        L_0x012e:
            r16 = r4
        L_0x0130:
            if (r7 != 0) goto L_0x013b
            if (r10 == 0) goto L_0x0135
            goto L_0x013b
        L_0x0135:
            r17 = r6
            r21 = r12
            goto L_0x02a8
        L_0x013b:
            if (r7 == 0) goto L_0x0140
            android.widget.TextView r4 = r0.f1923B
            goto L_0x0142
        L_0x0140:
            android.widget.TextView r4 = r0.f1942b
        L_0x0142:
            if (r10 == 0) goto L_0x0147
            android.widget.TextView r14 = r0.f1942b
            goto L_0x0149
        L_0x0147:
            android.widget.TextView r14 = r0.f1923B
        L_0x0149:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.iy r4 = (android.support.p033v7.widget.C0744iy) r4
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            android.support.v7.widget.iy r14 = (android.support.p033v7.widget.C0744iy) r14
            if (r7 == 0) goto L_0x0164
            android.widget.TextView r15 = r0.f1923B
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0160
            goto L_0x0164
        L_0x0160:
            r17 = r6
            r15 = 1
            goto L_0x0172
        L_0x0164:
            if (r10 == 0) goto L_0x016f
            android.widget.TextView r15 = r0.f1942b
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x016f
            goto L_0x0160
        L_0x016f:
            r17 = r6
            r15 = 0
        L_0x0172:
            int r6 = r0.f1929H
            r6 = r6 & 112(0x70, float:1.57E-43)
            r21 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01bb
            r12 = 80
            if (r6 == r12) goto L_0x01af
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r13
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r3
            int r3 = r0.f1954n
            int r12 = r12 + r3
            if (r6 >= r12) goto L_0x0196
            int r3 = r4.topMargin
            int r4 = r0.f1954n
            int r6 = r3 + r4
            goto L_0x01ad
        L_0x0196:
            int r5 = r5 - r9
            int r5 = r5 - r13
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r3 = r4.bottomMargin
            int r4 = r0.f1955o
            int r3 = r3 + r4
            if (r5 >= r3) goto L_0x01ad
            int r3 = r14.bottomMargin
            int r4 = r0.f1955o
            int r3 = r3 + r4
            int r3 = r3 - r5
            int r6 = r6 - r3
            r3 = 0
            int r6 = java.lang.Math.max(r3, r6)
        L_0x01ad:
            int r8 = r8 + r6
            goto L_0x01c8
        L_0x01af:
            r23 = r3
            int r5 = r5 - r9
            int r3 = r14.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f1955o
            int r5 = r5 - r3
            int r8 = r5 - r13
            goto L_0x01c8
        L_0x01bb:
            r23 = r3
            int r3 = r18.getPaddingTop()
            int r4 = r4.topMargin
            int r3 = r3 + r4
            int r4 = r0.f1954n
            int r8 = r3 + r4
        L_0x01c8:
            if (r1 == 0) goto L_0x023c
            if (r15 == 0) goto L_0x01cf
            int r1 = r0.f1952l
            goto L_0x01d0
        L_0x01cf:
            r1 = 0
        L_0x01d0:
            r3 = 1
            r4 = r11[r3]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r2 = r2 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r3] = r1
            if (r7 == 0) goto L_0x0207
            android.widget.TextView r1 = r0.f1923B
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.iy r1 = (android.support.p033v7.widget.C0744iy) r1
            android.widget.TextView r3 = r0.f1923B
            int r3 = r3.getMeasuredWidth()
            int r3 = r2 - r3
            android.widget.TextView r4 = r0.f1923B
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1923B
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f1953m
            int r3 = r3 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0208
        L_0x0207:
            r3 = r2
        L_0x0208:
            if (r10 == 0) goto L_0x0230
            android.widget.TextView r1 = r0.f1942b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.iy r1 = (android.support.p033v7.widget.C0744iy) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f1942b
            int r4 = r4.getMeasuredWidth()
            android.widget.TextView r5 = r0.f1942b
            int r5 = r5.getMeasuredHeight()
            android.widget.TextView r6 = r0.f1942b
            int r4 = r2 - r4
            int r5 = r5 + r8
            r6.layout(r4, r8, r2, r5)
            int r4 = r0.f1953m
            int r4 = r2 - r4
            int r1 = r1.bottomMargin
            goto L_0x0231
        L_0x0230:
            r4 = r2
        L_0x0231:
            if (r15 == 0) goto L_0x0238
            int r1 = java.lang.Math.min(r3, r4)
            r2 = r1
        L_0x0238:
            r3 = r23
            goto L_0x02a8
        L_0x023c:
            if (r15 == 0) goto L_0x0241
            int r1 = r0.f1952l
            goto L_0x0242
        L_0x0241:
            r1 = 0
        L_0x0242:
            r3 = 0
            r4 = r11[r3]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r3, r1)
            int r4 = r23 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            if (r7 == 0) goto L_0x0278
            android.widget.TextView r1 = r0.f1923B
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.iy r1 = (android.support.p033v7.widget.C0744iy) r1
            android.widget.TextView r3 = r0.f1923B
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r4
            android.widget.TextView r5 = r0.f1923B
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1923B
            r6.layout(r4, r8, r3, r5)
            int r6 = r0.f1953m
            int r3 = r3 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x0279
        L_0x0278:
            r3 = r4
        L_0x0279:
            if (r10 == 0) goto L_0x029f
            android.widget.TextView r1 = r0.f1942b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.iy r1 = (android.support.p033v7.widget.C0744iy) r1
            int r5 = r1.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.f1942b
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r4
            android.widget.TextView r6 = r0.f1942b
            int r6 = r6.getMeasuredHeight()
            android.widget.TextView r7 = r0.f1942b
            int r6 = r6 + r8
            r7.layout(r4, r8, r5, r6)
            int r6 = r0.f1953m
            int r5 = r5 + r6
            int r1 = r1.bottomMargin
            goto L_0x02a0
        L_0x029f:
            r5 = r4
        L_0x02a0:
            if (r15 == 0) goto L_0x02a7
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x02a8
        L_0x02a7:
            r3 = r4
        L_0x02a8:
            java.util.ArrayList r1 = r0.f1934M
            r4 = 3
            r0.m1811K(r1, r4)
            java.util.ArrayList r1 = r0.f1934M
            int r1 = r1.size()
            r4 = r3
            r3 = 0
        L_0x02b6:
            if (r3 >= r1) goto L_0x02c9
            java.util.ArrayList r5 = r0.f1934M
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r21
            int r4 = r0.m1808H(r5, r4, r11, r12)
            int r3 = r3 + 1
            goto L_0x02b6
        L_0x02c9:
            r12 = r21
            java.util.ArrayList r1 = r0.f1934M
            r3 = 5
            r0.m1811K(r1, r3)
            java.util.ArrayList r1 = r0.f1934M
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x02d9:
            if (r2 >= r1) goto L_0x02ea
            java.util.ArrayList r5 = r0.f1934M
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            int r3 = r0.m1809I(r5, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02d9
        L_0x02ea:
            java.util.ArrayList r1 = r0.f1934M
            r2 = 1
            r0.m1811K(r1, r2)
            java.util.ArrayList r1 = r0.f1934M
            r5 = 0
            r6 = r11[r5]
            r2 = r11[r2]
            int r5 = r1.size()
            r7 = 0
            r8 = 0
        L_0x02fd:
            if (r7 >= r5) goto L_0x0330
            java.lang.Object r9 = r1.get(r7)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            android.support.v7.widget.iy r10 = (android.support.p033v7.widget.C0744iy) r10
            int r13 = r10.leftMargin
            int r13 = r13 - r6
            int r6 = r10.rightMargin
            int r6 = r6 - r2
            r2 = 0
            int r10 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r6)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r6 = -r6
            int r6 = java.lang.Math.max(r2, r6)
            int r9 = r9.getMeasuredWidth()
            int r10 = r10 + r9
            int r10 = r10 + r14
            int r8 = r8 + r10
            int r7 = r7 + 1
            r2 = r6
            r6 = r13
            goto L_0x02fd
        L_0x0330:
            r2 = 0
            int r1 = r16 - r17
            int r1 = r1 - r22
            int r1 = r1 / 2
            int r6 = r17 + r1
            int r1 = r8 / 2
            int r6 = r6 - r1
            int r8 = r8 + r6
            if (r6 >= r4) goto L_0x0340
            goto L_0x0347
        L_0x0340:
            if (r8 <= r3) goto L_0x0346
            int r8 = r8 - r3
            int r4 = r6 - r8
            goto L_0x0347
        L_0x0346:
            r4 = r6
        L_0x0347:
            java.util.ArrayList r1 = r0.f1934M
            int r1 = r1.size()
        L_0x034d:
            if (r2 >= r1) goto L_0x035e
            java.util.ArrayList r3 = r0.f1934M
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.m1808H(r3, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x034d
        L_0x035e:
            java.util.ArrayList r1 = r0.f1934M
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1935N;
        char b = C0763jq.m2570b(this);
        char c = b ^ 1;
        int i10 = 0;
        if (m1816P(this.f1924C)) {
            m1819S(this.f1924C, i, 0, i2, this.f1926E);
            i5 = this.f1924C.getMeasuredWidth() + m1817Q(this.f1924C);
            i4 = Math.max(0, this.f1924C.getMeasuredHeight() + m1818R(this.f1924C));
            i3 = View.combineMeasuredStates(0, this.f1924C.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1816P(this.f1946f)) {
            m1819S(this.f1946f, i, 0, i2, this.f1926E);
            i5 = this.f1946f.getMeasuredWidth() + m1817Q(this.f1946f);
            i4 = Math.max(i4, this.f1946f.getMeasuredHeight() + m1818R(this.f1946f));
            i3 = View.combineMeasuredStates(i3, this.f1946f.getMeasuredState());
        }
        int d = mo2390d();
        int max = Math.max(d, i5);
        iArr[b] = Math.max(0, d - i5);
        if (m1816P(this.f1941a)) {
            m1819S(this.f1941a, i, max, i2, this.f1926E);
            i6 = this.f1941a.getMeasuredWidth() + m1817Q(this.f1941a);
            i4 = Math.max(i4, this.f1941a.getMeasuredHeight() + m1818R(this.f1941a));
            i3 = View.combineMeasuredStates(i3, this.f1941a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int c2 = mo2388c();
        int max2 = max + Math.max(c2, i6);
        iArr[c] = Math.max(0, c2 - i6);
        if (m1816P(this.f1947g)) {
            max2 += m1810J(this.f1947g, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1947g.getMeasuredHeight() + m1818R(this.f1947g));
            i3 = View.combineMeasuredStates(i3, this.f1947g.getMeasuredState());
        }
        if (m1816P(this.f1943c)) {
            max2 += m1810J(this.f1943c, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1943c.getMeasuredHeight() + m1818R(this.f1943c));
            i3 = View.combineMeasuredStates(i3, this.f1943c.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0744iy) childAt.getLayoutParams()).f2607b == 0 && m1816P(childAt)) {
                max2 += m1810J(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1818R(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1954n + this.f1955o;
        int i13 = this.f1952l + this.f1953m;
        if (m1816P(this.f1923B)) {
            m1810J(this.f1923B, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1923B.getMeasuredWidth() + m1817Q(this.f1923B);
            i7 = this.f1923B.getMeasuredHeight() + m1818R(this.f1923B);
            i9 = View.combineMeasuredStates(i3, this.f1923B.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m1816P(this.f1942b)) {
            int i14 = i7 + i12;
            i8 = Math.max(i8, m1810J(this.f1942b, i, max2 + i13, i2, i14, iArr));
            i7 += this.f1942b.getMeasuredHeight() + m1818R(this.f1942b);
            i9 = View.combineMeasuredStates(i9, this.f1942b.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(max2 + i8 + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3 + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f1966z) {
            int childCount2 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i16);
                if (m1816P(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i16++;
            }
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        ActionMenuView actionMenuView = this.f1941a;
        C0477q qVar = actionMenuView != null ? actionMenuView.f1784a : null;
        int i = savedState.f1967a;
        if (!(i == 0 || this.f1963w == null || qVar == null || (findItem = qVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1968b) {
            removeCallbacks(this.f1939R);
            post(this.f1939R);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        mo2400k();
        C0680go goVar = this.f1956p;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != goVar.f2498g) {
            goVar.f2498g = z;
            if (!goVar.f2499h) {
                goVar.f2492a = goVar.f2496e;
                goVar.f2493b = goVar.f2497f;
            } else if (z) {
                int i2 = goVar.f2495d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = goVar.f2496e;
                }
                goVar.f2492a = i2;
                int i3 = goVar.f2494c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = goVar.f2497f;
                }
                goVar.f2493b = i3;
            } else {
                int i4 = goVar.f2494c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = goVar.f2496e;
                }
                goVar.f2492a = i4;
                int i5 = goVar.f2495d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = goVar.f2497f;
                }
                goVar.f2493b = i5;
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0480t tVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0743ix ixVar = this.f1963w;
        if (!(ixVar == null || (tVar = ixVar.f2605b) == null)) {
            savedState.f1967a = tVar.f1682a;
        }
        savedState.f1968b = mo2385C();
        return savedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1932K = false;
            actionMasked = 0;
        }
        if (!this.f1932K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.f1932K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1932K = false;
        }
        return true;
    }

    /* renamed from: p */
    public final void mo2415p(int i) {
        mo2416q(i != 0 ? getContext().getText(i) : null);
    }

    /* renamed from: q */
    public final void mo2416q(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1814N();
        }
        ImageButton imageButton = this.f1924C;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C0751je.m2535a(this.f1924C, charSequence);
        }
    }

    /* renamed from: r */
    public final void mo2417r(int i) {
        mo2418s(C0678gm.m2375e().mo3100c(getContext(), i));
    }

    /* renamed from: s */
    public void mo2418s(Drawable drawable) {
        if (drawable != null) {
            m1814N();
            if (!m1815O(this.f1924C)) {
                m1812L(this.f1924C, true);
            }
        } else {
            ImageButton imageButton = this.f1924C;
            if (imageButton != null && m1815O(imageButton)) {
                removeView(this.f1924C);
                this.f1959s.remove(this.f1924C);
            }
        }
        ImageButton imageButton2 = this.f1924C;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    /* renamed from: t */
    public void mo2419t(View.OnClickListener onClickListener) {
        m1814N();
        this.f1924C.setOnClickListener(onClickListener);
    }

    /* renamed from: u */
    public final void mo2420u(int i) {
        if (this.f1949i != i) {
            this.f1949i = i;
            if (i == 0) {
                this.f1948h = getContext();
            } else {
                this.f1948h = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* renamed from: v */
    public void mo2421v(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1942b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1942b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1942b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1950j;
                if (i != 0) {
                    this.f1942b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1931J;
                if (colorStateList != null) {
                    this.f1942b.setTextColor(colorStateList);
                }
            }
            if (!m1815O(this.f1942b)) {
                m1812L(this.f1942b, true);
            }
        } else {
            TextView textView = this.f1942b;
            if (textView != null && m1815O(textView)) {
                removeView(this.f1942b);
                this.f1959s.remove(this.f1942b);
            }
        }
        TextView textView2 = this.f1942b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1958r = charSequence;
    }

    /* renamed from: w */
    public final void mo2422w(int i) {
        mo2423x(getContext().getText(i));
    }

    /* renamed from: x */
    public void mo2423x(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1923B == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1923B = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1923B.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1925D;
                if (i != 0) {
                    this.f1923B.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1930I;
                if (colorStateList != null) {
                    this.f1923B.setTextColor(colorStateList);
                }
            }
            if (!m1815O(this.f1923B)) {
                m1812L(this.f1923B, true);
            }
        } else {
            TextView textView = this.f1923B;
            if (textView != null && m1815O(textView)) {
                removeView(this.f1923B);
                this.f1959s.remove(this.f1923B);
            }
        }
        TextView textView2 = this.f1923B;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1957q = charSequence;
    }

    /* renamed from: y */
    public final void mo2424y(Context context, int i) {
        this.f1925D = i;
        TextView textView = this.f1923B;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: z */
    public final void mo2425z() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher b = C0742iw.m2481b(this);
            if (!mo2383A() || b == null || !C2043bi.m5569aw(this) || !this.f1922A) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1938Q;
                if (onBackInvokedDispatcher != null) {
                    C0742iw.m2483d(onBackInvokedDispatcher, this.f1937P);
                    this.f1938Q = null;
                }
            } else if (this.f1938Q == null) {
                if (this.f1937P == null) {
                    this.f1937P = C0742iw.m2480a(new C0736iq(this));
                }
                C0742iw.m2482c(b, this.f1937P);
                this.f1938Q = b;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1805E(layoutParams);
    }

    /* renamed from: android.support.v7.widget.Toolbar$SavedState */
    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C0747ja();

        /* renamed from: a */
        int f1967a;

        /* renamed from: b */
        boolean f1968b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1967a = parcel.readInt();
            this.f1968b = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeInt(this.f1967a);
            parcel.writeInt(this.f1968b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1929H = 8388627;
        this.f1934M = new ArrayList();
        this.f1959s = new ArrayList();
        this.f1935N = new int[2];
        this.f1960t = new C2105t();
        new ArrayList();
        this.f1940S = new C0737ir(this);
        this.f1939R = new C0738is(this);
        C0735ip f = C0735ip.m2473f(getContext(), attributeSet, C0338a.f1090z, i, 0);
        C2043bi.m5525S(this, context, C0338a.f1090z, attributeSet, f.f2596b, i, 0);
        this.f1925D = f.f2596b.getResourceId(28, 0);
        this.f1950j = f.f2596b.getResourceId(19, 0);
        this.f1929H = f.f2596b.getInteger(0, this.f1929H);
        this.f1951k = f.f2596b.getInteger(2, 48);
        int dimensionPixelOffset = f.f2596b.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = f.f2596b.hasValue(27) ? f.f2596b.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1955o = dimensionPixelOffset;
        this.f1954n = dimensionPixelOffset;
        this.f1953m = dimensionPixelOffset;
        this.f1952l = dimensionPixelOffset;
        int dimensionPixelOffset2 = f.f2596b.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1952l = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = f.f2596b.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1953m = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = f.f2596b.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1954n = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = f.f2596b.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1955o = dimensionPixelOffset5;
        }
        this.f1926E = f.f2596b.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = f.f2596b.getDimensionPixelOffset(9, LinearLayoutManager.INVALID_OFFSET);
        int dimensionPixelOffset7 = f.f2596b.getDimensionPixelOffset(5, LinearLayoutManager.INVALID_OFFSET);
        int dimensionPixelSize = f.f2596b.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = f.f2596b.getDimensionPixelSize(8, 0);
        mo2400k();
        C0680go goVar = this.f1956p;
        goVar.f2499h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            goVar.f2496e = dimensionPixelSize;
            goVar.f2492a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            goVar.f2497f = dimensionPixelSize2;
            goVar.f2493b = dimensionPixelSize2;
        }
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            goVar.mo3148a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1927F = f.f2596b.getDimensionPixelOffset(10, LinearLayoutManager.INVALID_OFFSET);
        this.f1928G = f.f2596b.getDimensionPixelOffset(6, LinearLayoutManager.INVALID_OFFSET);
        this.f1944d = f.mo3246b(4);
        this.f1945e = f.f2596b.getText(3);
        CharSequence text = f.f2596b.getText(21);
        if (!TextUtils.isEmpty(text)) {
            mo2423x(text);
        }
        CharSequence text2 = f.f2596b.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            mo2421v(text2);
        }
        this.f1948h = getContext();
        mo2420u(f.f2596b.getResourceId(17, 0));
        Drawable b = f.mo3246b(16);
        if (b != null) {
            mo2418s(b);
        }
        CharSequence text3 = f.f2596b.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            mo2416q(text3);
        }
        Drawable b2 = f.mo3246b(11);
        if (b2 != null) {
            mo2405o(b2);
        }
        CharSequence text4 = f.f2596b.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            if (!TextUtils.isEmpty(text4)) {
                m1813M();
            }
            ImageView imageView = this.f1943c;
            if (imageView != null) {
                imageView.setContentDescription(text4);
            }
        }
        if (f.f2596b.hasValue(29)) {
            ColorStateList a = f.mo3245a(29);
            this.f1930I = a;
            TextView textView = this.f1923B;
            if (textView != null) {
                textView.setTextColor(a);
            }
        }
        if (f.f2596b.hasValue(20)) {
            ColorStateList a2 = f.mo3245a(20);
            this.f1931J = a2;
            TextView textView2 = this.f1942b;
            if (textView2 != null) {
                textView2.setTextColor(a2);
            }
        }
        if (f.f2596b.hasValue(14)) {
            mo2404n(f.f2596b.getResourceId(14, 0));
        }
        f.f2596b.recycle();
    }
}
