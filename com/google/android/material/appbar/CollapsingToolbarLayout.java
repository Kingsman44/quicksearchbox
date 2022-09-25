package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.C1930c;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44747g;
import com.google.android.material.internal.C44749i;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3508e.C44654a;
import com.google.android.material.p3512i.C44694d;
import com.google.android.material.theme.p3518a.C44965a;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: A */
    private boolean f115696A;

    /* renamed from: B */
    private int f115697B;

    /* renamed from: C */
    private boolean f115698C;

    /* renamed from: a */
    public final C44747g f115699a;

    /* renamed from: b */
    final C44654a f115700b;

    /* renamed from: c */
    Drawable f115701c;

    /* renamed from: d */
    int f115702d;

    /* renamed from: e */
    C2082cp f115703e;

    /* renamed from: f */
    private boolean f115704f;

    /* renamed from: g */
    private int f115705g;

    /* renamed from: h */
    private ViewGroup f115706h;

    /* renamed from: i */
    private View f115707i;

    /* renamed from: j */
    private View f115708j;

    /* renamed from: k */
    private int f115709k;

    /* renamed from: l */
    private int f115710l;

    /* renamed from: m */
    private int f115711m;

    /* renamed from: n */
    private int f115712n;

    /* renamed from: o */
    private final Rect f115713o;

    /* renamed from: p */
    private boolean f115714p;

    /* renamed from: q */
    private boolean f115715q;

    /* renamed from: r */
    private Drawable f115716r;

    /* renamed from: s */
    private int f115717s;

    /* renamed from: t */
    private boolean f115718t;

    /* renamed from: u */
    private ValueAnimator f115719u;

    /* renamed from: v */
    private long f115720v;

    /* renamed from: w */
    private int f115721w;

    /* renamed from: x */
    private C44520p f115722x;

    /* renamed from: y */
    private int f115723y;

    /* renamed from: z */
    private int f115724z;

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    static C44530z m78664c(View view) {
        C44530z zVar = (C44530z) view.getTag(R.id.view_offset_helper);
        if (zVar != null) {
            return zVar;
        }
        C44530z zVar2 = new C44530z(view);
        view.setTag(R.id.view_offset_helper, zVar2);
        return zVar2;
    }

    /* renamed from: h */
    private static int m78665h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: i */
    private final void m78666i(AppBarLayout appBarLayout) {
        if (m78671n()) {
            appBarLayout.f115670e = false;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m78667j() {
        /*
            r7 = this;
            boolean r0 = r7.f115704f
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r7.f115706h = r0
            r7.f115707i = r0
            int r1 = r7.f115705g
            r2 = -1
            if (r1 == r2) goto L_0x002f
            android.view.View r1 = r7.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r7.f115706h = r1
            if (r1 == 0) goto L_0x002f
            android.view.ViewParent r3 = r1.getParent()
        L_0x001d:
            if (r3 == r7) goto L_0x002d
            if (r3 == 0) goto L_0x002d
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L_0x0028
            r1 = r3
            android.view.View r1 = (android.view.View) r1
        L_0x0028:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x001d
        L_0x002d:
            r7.f115707i = r1
        L_0x002f:
            android.view.ViewGroup r1 = r7.f115706h
            r3 = 0
            if (r1 != 0) goto L_0x0050
            int r1 = r7.getChildCount()
            r4 = 0
        L_0x0039:
            if (r4 >= r1) goto L_0x004e
            android.view.View r5 = r7.getChildAt(r4)
            boolean r6 = r5 instanceof android.support.p033v7.widget.Toolbar
            if (r6 != 0) goto L_0x004b
            boolean r6 = r5 instanceof android.widget.Toolbar
            if (r6 == 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            int r4 = r4 + 1
            goto L_0x0039
        L_0x004b:
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x004e:
            r7.f115706h = r0
        L_0x0050:
            boolean r0 = r7.f115714p
            if (r0 != 0) goto L_0x0067
            android.view.View r0 = r7.f115708j
            if (r0 == 0) goto L_0x0067
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0067
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r7.f115708j
            r0.removeView(r1)
        L_0x0067:
            boolean r0 = r7.f115714p
            if (r0 == 0) goto L_0x008d
            android.view.ViewGroup r0 = r7.f115706h
            if (r0 == 0) goto L_0x008d
            android.view.View r0 = r7.f115708j
            if (r0 != 0) goto L_0x007e
            android.view.View r0 = new android.view.View
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1)
            r7.f115708j = r0
        L_0x007e:
            android.view.View r0 = r7.f115708j
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x008d
            android.view.ViewGroup r0 = r7.f115706h
            android.view.View r1 = r7.f115708j
            r0.addView(r1, r2, r2)
        L_0x008d:
            r7.f115704f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.m78667j():void");
    }

    /* renamed from: k */
    private final void m78668k(Drawable drawable, View view, int i, int i2) {
        if (m78671n() && view != null && this.f115714p) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: l */
    private final void m78669l(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.f115714p && (view = this.f115708j) != null) {
            int i10 = 0;
            boolean z3 = C2043bi.m5569aw(view) && this.f115708j.getVisibility() == 0;
            this.f115715q = z3;
            if (z3) {
                z2 = z;
            } else if (z) {
                z2 = true;
            } else {
                return;
            }
            int f = C2043bi.m5577f(this);
            boolean z4 = f == 1;
            View view2 = this.f115707i;
            if (view2 == null) {
                view2 = this.f115706h;
            }
            int a = mo47431a(view2);
            C44749i.m79353a(this, this.f115708j, this.f115713o);
            ViewGroup viewGroup = this.f115706h;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                i10 = toolbar.f1952l;
                i6 = toolbar.f1953m;
                i5 = toolbar.f1954n;
                i7 = toolbar.f1955o;
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                i10 = toolbar2.getTitleMarginStart();
                i6 = toolbar2.getTitleMarginEnd();
                i5 = toolbar2.getTitleMarginTop();
                i7 = toolbar2.getTitleMarginBottom();
            } else {
                i7 = 0;
                i6 = 0;
                i5 = 0;
            }
            C44747g gVar = this.f115699a;
            int i11 = this.f115713o.left + (f == 1 ? i6 : i10);
            int i12 = this.f115713o.top + a + i5;
            int i13 = this.f115713o.right;
            if (f != 1) {
                i10 = i6;
            }
            gVar.mo48063h(i11, i12, i13 - i10, (this.f115713o.bottom + a) - i7);
            C44747g gVar2 = this.f115699a;
            if (z4) {
                i8 = this.f115711m;
            } else {
                i8 = this.f115709k;
            }
            int i14 = this.f115713o.top + this.f115710l;
            int i15 = i3 - i;
            if (z4) {
                i9 = this.f115709k;
            } else {
                i9 = this.f115711m;
            }
            gVar2.mo48067l(i8, i14, i15 - i9, (i4 - i2) - this.f115712n);
            this.f115699a.mo48061f(z2);
        }
    }

    /* renamed from: m */
    private final void m78670m() {
        CharSequence charSequence;
        if (this.f115706h != null && this.f115714p && TextUtils.isEmpty(this.f115699a.f116660k)) {
            ViewGroup viewGroup = this.f115706h;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).f1957q;
            } else {
                charSequence = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            mo47439f(charSequence);
        }
    }

    /* renamed from: n */
    private final boolean m78671n() {
        return this.f115723y == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo47431a(View view) {
        return ((getHeight() - m78664c(view).f115780a) - view.getHeight()) - ((C44523s) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: b */
    public final int mo47432b() {
        int i = this.f115721w;
        if (i >= 0) {
            return i + this.f115724z + this.f115697B;
        }
        C2082cp cpVar = this.f115703e;
        int d = cpVar != null ? cpVar.mo5242d() : 0;
        int h = C2043bi.m5579h(this);
        if (h > 0) {
            return Math.min(h + h + d, getHeight());
        }
        return getHeight() / 3;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C44523s;
    }

    /* renamed from: d */
    public final void mo47434d(Drawable drawable) {
        Drawable drawable2 = this.f115716r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f115716r = drawable3;
            if (drawable3 != null) {
                m78668k(drawable3, this.f115706h, getWidth(), getHeight());
                this.f115716r.setCallback(this);
                this.f115716r.setAlpha(this.f115717s);
            }
            C2043bi.m5519M(this);
        }
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m78667j();
        if (this.f115706h == null && (drawable = this.f115716r) != null && this.f115717s > 0) {
            drawable.mutate().setAlpha(this.f115717s);
            this.f115716r.draw(canvas);
        }
        if (this.f115714p && this.f115715q) {
            if (this.f115706h != null && this.f115716r != null && this.f115717s > 0 && m78671n()) {
                C44747g gVar = this.f115699a;
                if (gVar.f116636a < gVar.f116653d) {
                    int save = canvas.save();
                    canvas.clipRect(this.f115716r.getBounds(), Region.Op.DIFFERENCE);
                    this.f115699a.mo48058c(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.f115699a.mo48058c(canvas);
        }
        if (this.f115701c != null && this.f115717s > 0) {
            C2082cp cpVar = this.f115703e;
            int d = cpVar != null ? cpVar.mo5242d() : 0;
            if (d > 0) {
                this.f115701c.setBounds(0, -this.f115702d, getWidth(), d - this.f115702d);
                this.f115701c.mutate().setAlpha(this.f115717s);
                this.f115701c.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.f115716r;
        if (drawable == null || this.f115717s <= 0 || ((view2 = this.f115707i) == null || view2 == this ? view != this.f115706h : view != view2)) {
            z = false;
        } else {
            m78668k(drawable, view, getWidth(), getHeight());
            this.f115716r.mutate().setAlpha(this.f115717s);
            this.f115716r.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f115701c;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f115716r;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C44747g gVar = this.f115699a;
        if (gVar != null) {
            z |= gVar.mo48076u(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo47438e(int i) {
        ViewGroup viewGroup;
        if (i != this.f115717s) {
            if (!(this.f115716r == null || (viewGroup = this.f115706h) == null)) {
                C2043bi.m5519M(viewGroup);
            }
            this.f115717s = i;
            C2043bi.m5519M(this);
        }
    }

    /* renamed from: f */
    public final void mo47439f(CharSequence charSequence) {
        this.f115699a.mo48072q(charSequence);
        setContentDescription(this.f115714p ? this.f115699a.f116660k : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo47440g() {
        TimeInterpolator timeInterpolator;
        if (this.f115716r != null || this.f115701c != null) {
            int height = getHeight() + this.f115702d;
            int b = mo47432b();
            int i = 0;
            boolean z = height < b;
            boolean z2 = C2043bi.m5570ax(this) && !isInEditMode();
            if (this.f115718t != z) {
                int i2 = PrivateKeyType.INVALID;
                if (z2) {
                    if (height >= b) {
                        i2 = 0;
                    }
                    m78667j();
                    ValueAnimator valueAnimator = this.f115719u;
                    if (valueAnimator == null) {
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        this.f115719u = valueAnimator2;
                        if (i2 > this.f115717s) {
                            timeInterpolator = C44497b.f115652c;
                        } else {
                            timeInterpolator = C44497b.f115653d;
                        }
                        valueAnimator2.setInterpolator(timeInterpolator);
                        this.f115719u.addUpdateListener(new C44522r(this));
                    } else if (valueAnimator.isRunning()) {
                        this.f115719u.cancel();
                    }
                    this.f115719u.setDuration(this.f115720v);
                    this.f115719u.setIntValues(new int[]{this.f115717s, i2});
                    this.f115719u.start();
                } else {
                    if (height < b) {
                        i = PrivateKeyType.INVALID;
                    }
                    mo47438e(i);
                }
                this.f115718t = z;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m78666i(appBarLayout);
            C2043bi.m5549ac(this, C2043bi.m5564ar(appBarLayout));
            if (this.f115722x == null) {
                this.f115722x = new C44524t(this);
            }
            appBarLayout.mo47402l(this.f115722x);
            C2043bi.m5524R(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f115699a.mo48060e(configuration);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        C44520p pVar = this.f115722x;
        if (!(pVar == null || !(parent instanceof AppBarLayout) || (list = ((AppBarLayout) parent).f115669d) == null)) {
            list.remove(pVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2082cp cpVar = this.f115703e;
        if (cpVar != null) {
            int d = cpVar.mo5242d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C2043bi.m5564ar(childAt) && childAt.getTop() < d) {
                    C2043bi.m5517K(childAt, d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m78664c(getChildAt(i6)).mo47468b();
        }
        m78669l(i, i2, i3, i4, false);
        m78670m();
        mo47440g();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m78664c(getChildAt(i7)).mo47467a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        m78667j();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C2082cp cpVar = this.f115703e;
        int d = cpVar != null ? cpVar.mo5242d() : 0;
        if ((mode == 0 || this.f115696A) && d > 0) {
            this.f115724z = d;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
        if (this.f115698C && this.f115699a.f116668s > 1) {
            m78670m();
            m78669l(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            C44747g gVar = this.f115699a;
            int i3 = gVar.f116658i;
            if (i3 > 1) {
                gVar.mo48059d(gVar.f116663n);
                this.f115697B = Math.round((-gVar.f116663n.ascent()) + gVar.f116663n.descent()) * (i3 - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f115697B, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f115706h;
        if (viewGroup != null) {
            View view = this.f115707i;
            if (view == null || view == this) {
                setMinimumHeight(m78665h(viewGroup));
            } else {
                setMinimumHeight(m78665h(view));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f115716r;
        if (drawable != null) {
            m78668k(drawable, this.f115706h, i, i2);
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f115701c;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f115701c.setVisible(z, false);
        }
        Drawable drawable2 = this.f115716r;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f115716r.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f115716r || drawable == this.f115701c;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C44523s(getContext(), attributeSet);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C44965a.m79936a(context, attributeSet, i, 2132151248), attributeSet, i);
        int i2;
        ColorStateList b;
        TextUtils.TruncateAt truncateAt;
        boolean z = true;
        this.f115704f = true;
        this.f115713o = new Rect();
        this.f115721w = -1;
        this.f115724z = 0;
        this.f115697B = 0;
        Context context2 = getContext();
        C44747g gVar = new C44747g(this);
        this.f115699a = gVar;
        gVar.f116665p = C44497b.f115654e;
        gVar.mo48061f(false);
        gVar.f116662m = false;
        C44654a aVar = new C44654a(context2);
        this.f115700b = aVar;
        TypedArray a = C44733be.m79295a(context2, attributeSet, C44528x.f115774c, i, 2132151248, new int[0]);
        gVar.mo48069n(a.getInt(4, 8388691));
        gVar.mo48066k(a.getInt(0, 8388627));
        int dimensionPixelSize = a.getDimensionPixelSize(5, 0);
        this.f115712n = dimensionPixelSize;
        this.f115711m = dimensionPixelSize;
        this.f115710l = dimensionPixelSize;
        this.f115709k = dimensionPixelSize;
        if (a.hasValue(8)) {
            this.f115709k = a.getDimensionPixelSize(8, 0);
        }
        if (a.hasValue(7)) {
            this.f115711m = a.getDimensionPixelSize(7, 0);
        }
        if (a.hasValue(9)) {
            this.f115710l = a.getDimensionPixelSize(9, 0);
        }
        if (a.hasValue(6)) {
            this.f115712n = a.getDimensionPixelSize(6, 0);
        }
        this.f115714p = a.getBoolean(20, true);
        mo47439f(a.getText(18));
        gVar.mo48068m(2132150355);
        gVar.mo48064i(2132150316);
        if (a.hasValue(10)) {
            gVar.mo48068m(a.getResourceId(10, 0));
        }
        if (a.hasValue(1)) {
            gVar.mo48064i(a.getResourceId(1, 0));
        }
        if (a.hasValue(22)) {
            int i3 = a.getInt(22, -1);
            if (i3 != 0) {
                truncateAt = i3 != 1 ? i3 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE;
            } else {
                truncateAt = TextUtils.TruncateAt.START;
            }
            gVar.f116659j = truncateAt;
            gVar.mo48061f(false);
        }
        if (a.hasValue(11) && gVar.f116656g != (b = C44694d.m79230b(context2, a, 11))) {
            gVar.f116656g = b;
            gVar.mo48061f(false);
        }
        if (a.hasValue(2)) {
            gVar.mo48065j(C44694d.m79230b(context2, a, 2));
        }
        this.f115721w = a.getDimensionPixelSize(16, -1);
        if (a.hasValue(14) && (i2 = a.getInt(14, 1)) != gVar.f116668s) {
            gVar.f116668s = i2;
            gVar.mo48061f(false);
        }
        if (a.hasValue(21)) {
            gVar.f116664o = AnimationUtils.loadInterpolator(context2, a.getResourceId(21, 0));
            gVar.mo48061f(false);
        }
        this.f115720v = (long) a.getInt(15, 600);
        mo47434d(a.getDrawable(3));
        Drawable drawable = a.getDrawable(17);
        Drawable drawable2 = this.f115701c;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            drawable3 = drawable != null ? drawable.mutate() : drawable3;
            this.f115701c = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f115701c.setState(getDrawableState());
                }
                C1930c.m5230b(this.f115701c, C2043bi.m5577f(this));
                this.f115701c.setVisible(getVisibility() != 0 ? false : z, false);
                this.f115701c.setCallback(this);
                this.f115701c.setAlpha(this.f115717s);
            }
            C2043bi.m5519M(this);
        }
        this.f115723y = a.getInt(19, 0);
        boolean n = m78671n();
        gVar.f116651b = n;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m78666i((AppBarLayout) parent);
        }
        if (n && this.f115716r == null) {
            mo47434d(new ColorDrawable(aVar.mo47887b(aVar.f116338b, getResources().getDimension(R.dimen.design_appbar_elevation))));
        }
        this.f115705g = a.getResourceId(23, -1);
        this.f115696A = a.getBoolean(13, false);
        this.f115698C = a.getBoolean(12, false);
        a.recycle();
        setWillNotDraw(false);
        C2043bi.m5555ai(this, new C44521q(this));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C44523s(layoutParams);
    }
}
