package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.view.C0442j;
import android.support.p033v7.widget.C0735ip;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.content.C1882h;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44714am;
import com.google.android.material.internal.C44721at;
import com.google.android.material.internal.C44764x;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.p3515l.C44778i;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44780k;
import com.google.android.material.p3515l.C44784o;
import com.google.android.material.p3515l.C44785p;
import com.google.android.material.p3515l.C44786q;
import com.google.android.material.p3515l.C44787r;

/* compiled from: PG */
public class NavigationView extends C44721at {

    /* renamed from: k */
    private static final int[] f116871k = {16842912};

    /* renamed from: l */
    private static final int[] f116872l = {-16842910};

    /* renamed from: e */
    public final C44764x f116873e;

    /* renamed from: f */
    public final C44714am f116874f;

    /* renamed from: g */
    public C44829p f116875g;

    /* renamed from: h */
    public final int[] f116876h;

    /* renamed from: i */
    public boolean f116877i;

    /* renamed from: j */
    public boolean f116878j;

    /* renamed from: m */
    private final int f116879m;

    /* renamed from: n */
    private MenuInflater f116880n;

    /* renamed from: o */
    private ViewTreeObserver.OnGlobalLayoutListener f116881o;

    /* renamed from: p */
    private int f116882p;

    /* renamed from: q */
    private int f116883q;

    /* renamed from: r */
    private Path f116884r;

    /* renamed from: s */
    private final RectF f116885s;

    public NavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private final ColorStateList m79501c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList d = C1882h.m5138d(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = d.getDefaultColor();
        int[] iArr = f116872l;
        return new ColorStateList(new int[][]{iArr, f116871k, EMPTY_STATE_SET}, new int[]{d.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: d */
    private final Drawable m79502d(C0735ip ipVar, ColorStateList colorStateList) {
        int[] iArr = C44831r.f116960a;
        C44779j jVar = new C44779j(new C44785p(C44785p.m79427d(getContext(), ipVar.f2596b.getResourceId(17, 0), ipVar.f2596b.getResourceId(18, 0))));
        jVar.mo48124V(colorStateList);
        return new InsetDrawable(jVar, ipVar.f2596b.getDimensionPixelSize(22, 0), ipVar.f2596b.getDimensionPixelSize(23, 0), ipVar.f2596b.getDimensionPixelSize(21, 0), ipVar.f2596b.getDimensionPixelSize(20, 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48029a(C2082cp cpVar) {
        C44714am amVar = this.f116874f;
        int d = cpVar.mo5242d();
        if (amVar.f116564x != d) {
            amVar.f116564x = d;
            amVar.mo48023q();
        }
        NavigationMenuView navigationMenuView = amVar.f116541a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, cpVar.mo5239a());
        C2043bi.m5596y(amVar.f116542b, cpVar);
    }

    /* renamed from: b */
    public final void mo48187b(int i) {
        this.f116874f.mo48022p(true);
        if (this.f116880n == null) {
            this.f116880n = new C0442j(getContext());
        }
        this.f116880n.inflate(i, this.f116873e);
        this.f116874f.mo48022p(false);
        this.f116874f.mo1546f(false);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f116884r == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f116884r);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44780k.m79412c(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f116881o);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f116879m), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f116879m, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        this.f116873e.mo1659h(savedState.f116886a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f116886a = new Bundle();
        this.f116873e.mo1661i(savedState.f116886a);
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(getParent() instanceof DrawerLayout) || this.f116883q <= 0 || !(getBackground() instanceof C44779j)) {
            this.f116884r = null;
            this.f116885s.setEmpty();
            return;
        }
        C44779j jVar = (C44779j) getBackground();
        C44784o oVar = new C44784o(jVar.f116741C.f116718a);
        if (Gravity.getAbsoluteGravity(this.f116882p, C2043bi.m5577f(this)) == 3) {
            oVar.mo48145d((float) this.f116883q);
            oVar.mo48143b((float) this.f116883q);
        } else {
            oVar.mo48144c((float) this.f116883q);
            oVar.mo48142a((float) this.f116883q);
        }
        jVar.mo47555l(new C44785p(oVar));
        if (this.f116884r == null) {
            this.f116884r = new Path();
        }
        this.f116884r.reset();
        this.f116885s.set(0.0f, 0.0f, (float) i, (float) i2);
        C44787r rVar = C44786q.f116792a;
        C44778i iVar = jVar.f116741C;
        rVar.mo48153a(iVar.f116718a, iVar.f116728k, this.f116885s, (C44776g) null, this.f116884r);
        invalidate();
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        C44780k.m79411b(this, f);
    }

    public final void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C44714am amVar = this.f116874f;
        if (amVar != null) {
            amVar.mo48020m(i);
        }
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C44830q();

        /* renamed from: a */
        public Bundle f116886a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f116886a = parcel.readBundle(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeBundle(this.f116886a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            r9 = 2132151250(0x7f160bd2, float:1.9944557E38)
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.p3518a.C44965a.m79936a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.internal.am r10 = new com.google.android.material.internal.am
            r10.<init>()
            r0.f116874f = r10
            r11 = 2
            int[] r1 = new int[r11]
            r0.f116876h = r1
            r12 = 1
            r0.f116877i = r12
            r0.f116878j = r12
            r13 = 0
            r0.f116882p = r13
            r0.f116883q = r13
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f116885s = r1
            android.content.Context r14 = r16.getContext()
            com.google.android.material.internal.x r15 = new com.google.android.material.internal.x
            r15.<init>(r14)
            r0.f116873e = r15
            int[] r3 = com.google.android.material.navigation.C44831r.f116962c
            r5 = 2132151250(0x7f160bd2, float:1.9944557E38)
            int[] r6 = new int[r13]
            r1 = r14
            r2 = r18
            r4 = r19
            android.support.v7.widget.ip r1 = com.google.android.material.internal.C44733be.m79296b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r2 = r1.f2596b
            boolean r2 = r2.hasValue(r12)
            if (r2 == 0) goto L_0x0059
            android.graphics.drawable.Drawable r2 = r1.mo3246b(r12)
            androidx.core.p098j.C2043bi.m5530X(r0, r2)
        L_0x0059:
            android.content.res.TypedArray r2 = r1.f2596b
            r3 = 7
            int r2 = r2.getDimensionPixelSize(r3, r13)
            r0.f116883q = r2
            android.content.res.TypedArray r2 = r1.f2596b
            int r2 = r2.getInt(r13, r13)
            r0.f116882p = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            if (r2 == 0) goto L_0x0078
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x00a1
        L_0x0078:
            com.google.android.material.l.o r2 = com.google.android.material.p3515l.C44785p.m79428e(r14, r7, r8, r9)
            com.google.android.material.l.p r3 = new com.google.android.material.l.p
            r3.<init>(r2)
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            com.google.android.material.l.j r4 = new com.google.android.material.l.j
            r4.<init>((com.google.android.material.p3515l.C44785p) r3)
            boolean r3 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r3 == 0) goto L_0x009b
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r4.mo48124V(r2)
        L_0x009b:
            r4.mo48121S(r14)
            androidx.core.p098j.C2043bi.m5530X(r0, r4)
        L_0x00a1:
            android.content.res.TypedArray r2 = r1.f2596b
            r3 = 8
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x00b8
            android.content.res.TypedArray r2 = r1.f2596b
            int r2 = r2.getDimensionPixelSize(r3, r13)
            float r2 = (float) r2
            super.setElevation(r2)
            com.google.android.material.p3515l.C44780k.m79411b(r0, r2)
        L_0x00b8:
            android.content.res.TypedArray r2 = r1.f2596b
            boolean r2 = r2.getBoolean(r11, r13)
            r0.setFitsSystemWindows(r2)
            android.content.res.TypedArray r2 = r1.f2596b
            r3 = 3
            int r2 = r2.getDimensionPixelSize(r3, r13)
            r0.f116879m = r2
            android.content.res.TypedArray r2 = r1.f2596b
            r3 = 30
            boolean r2 = r2.hasValue(r3)
            r4 = 0
            if (r2 == 0) goto L_0x00da
            android.content.res.ColorStateList r2 = r1.mo3245a(r3)
            goto L_0x00db
        L_0x00da:
            r2 = r4
        L_0x00db:
            android.content.res.TypedArray r3 = r1.f2596b
            r5 = 33
            boolean r3 = r3.hasValue(r5)
            if (r3 == 0) goto L_0x00ec
            android.content.res.TypedArray r3 = r1.f2596b
            int r3 = r3.getResourceId(r5, r13)
            goto L_0x00ed
        L_0x00ec:
            r3 = 0
        L_0x00ed:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto L_0x00f9
            if (r2 != 0) goto L_0x00f8
            android.content.res.ColorStateList r2 = r0.m79501c(r5)
        L_0x00f8:
            r3 = 0
        L_0x00f9:
            android.content.res.TypedArray r6 = r1.f2596b
            r7 = 14
            boolean r6 = r6.hasValue(r7)
            if (r6 == 0) goto L_0x0108
            android.content.res.ColorStateList r5 = r1.mo3245a(r7)
            goto L_0x010c
        L_0x0108:
            android.content.res.ColorStateList r5 = r0.m79501c(r5)
        L_0x010c:
            android.content.res.TypedArray r6 = r1.f2596b
            r7 = 24
            boolean r6 = r6.hasValue(r7)
            if (r6 == 0) goto L_0x011d
            android.content.res.TypedArray r6 = r1.f2596b
            int r6 = r6.getResourceId(r7, r13)
            goto L_0x011e
        L_0x011d:
            r6 = 0
        L_0x011e:
            android.content.res.TypedArray r7 = r1.f2596b
            r8 = 13
            boolean r7 = r7.hasValue(r8)
            if (r7 == 0) goto L_0x0139
            android.content.res.TypedArray r7 = r1.f2596b
            int r7 = r7.getDimensionPixelSize(r8, r13)
            int r8 = r10.f116557q
            if (r8 == r7) goto L_0x0139
            r10.f116557q = r7
            r10.f116561u = r12
            r10.mo1546f(r13)
        L_0x0139:
            android.content.res.TypedArray r7 = r1.f2596b
            r8 = 25
            boolean r7 = r7.hasValue(r8)
            if (r7 == 0) goto L_0x0148
            android.content.res.ColorStateList r7 = r1.mo3245a(r8)
            goto L_0x0149
        L_0x0148:
            r7 = r4
        L_0x0149:
            if (r6 != 0) goto L_0x0155
            if (r7 != 0) goto L_0x0154
            r6 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r7 = r0.m79501c(r6)
        L_0x0154:
            r6 = 0
        L_0x0155:
            r8 = 10
            android.graphics.drawable.Drawable r8 = r1.mo3246b(r8)
            if (r8 != 0) goto L_0x0199
            android.content.res.TypedArray r9 = r1.f2596b
            r11 = 17
            boolean r9 = r9.hasValue(r11)
            if (r9 != 0) goto L_0x0171
            android.content.res.TypedArray r9 = r1.f2596b
            r11 = 18
            boolean r9 = r9.hasValue(r11)
            if (r9 == 0) goto L_0x0199
        L_0x0171:
            android.content.Context r8 = r16.getContext()
            r9 = 19
            android.content.res.ColorStateList r8 = com.google.android.material.p3512i.C44694d.m79231c(r8, r1, r9)
            android.graphics.drawable.Drawable r8 = r0.m79502d(r1, r8)
            r9 = 16
            android.content.res.ColorStateList r9 = com.google.android.material.p3512i.C44694d.m79231c(r14, r1, r9)
            if (r9 == 0) goto L_0x0199
            android.graphics.drawable.Drawable r11 = r0.m79502d(r1, r4)
            android.graphics.drawable.RippleDrawable r12 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r9 = com.google.android.material.p3513j.C44767a.m79372b(r9)
            r12.<init>(r9, r4, r11)
            r10.f116553m = r12
            r10.mo1546f(r13)
        L_0x0199:
            android.content.res.TypedArray r4 = r1.f2596b
            r9 = 11
            boolean r4 = r4.hasValue(r9)
            if (r4 == 0) goto L_0x01ae
            android.content.res.TypedArray r4 = r1.f2596b
            int r4 = r4.getDimensionPixelSize(r9, r13)
            r10.f116554n = r4
            r10.mo1546f(r13)
        L_0x01ae:
            android.content.res.TypedArray r4 = r1.f2596b
            r9 = 26
            boolean r4 = r4.hasValue(r9)
            if (r4 == 0) goto L_0x01c3
            android.content.res.TypedArray r4 = r1.f2596b
            int r4 = r4.getDimensionPixelSize(r9, r13)
            r10.f116555o = r4
            r10.mo1546f(r13)
        L_0x01c3:
            android.content.res.TypedArray r4 = r1.f2596b
            r9 = 6
            int r4 = r4.getDimensionPixelSize(r9, r13)
            r10.f116558r = r4
            r10.mo1546f(r13)
            android.content.res.TypedArray r4 = r1.f2596b
            r9 = 5
            int r4 = r4.getDimensionPixelSize(r9, r13)
            r10.f116559s = r4
            r10.mo1546f(r13)
            android.content.res.TypedArray r4 = r1.f2596b
            r9 = 32
            int r4 = r4.getDimensionPixelSize(r9, r13)
            r10.mo48021o(r4)
            android.content.res.TypedArray r4 = r1.f2596b
            r9 = 31
            int r4 = r4.getDimensionPixelSize(r9, r13)
            r10.mo48021o(r4)
            boolean r4 = r0.f116877i
            android.content.res.TypedArray r9 = r1.f2596b
            r11 = 34
            boolean r4 = r9.getBoolean(r11, r4)
            r0.f116877i = r4
            boolean r4 = r0.f116878j
            android.content.res.TypedArray r9 = r1.f2596b
            r11 = 4
            boolean r4 = r9.getBoolean(r11, r4)
            r0.f116878j = r4
            android.content.res.TypedArray r4 = r1.f2596b
            r9 = 12
            int r4 = r4.getDimensionPixelSize(r9, r13)
            android.content.res.TypedArray r9 = r1.f2596b
            r11 = 15
            r12 = 1
            int r9 = r9.getInt(r11, r12)
            r10.f116563w = r9
            r10.mo1546f(r13)
            com.google.android.material.navigation.n r9 = new com.google.android.material.navigation.n
            r9.<init>(r0)
            r15.f1651b = r9
            r10.f116544d = r12
            r10.mo1520c(r14, r15)
            if (r3 == 0) goto L_0x0231
            r10.f116547g = r3
            r10.mo1546f(r13)
        L_0x0231:
            r10.f116548h = r2
            r10.mo1546f(r13)
            r10.f116551k = r5
            r10.mo1546f(r13)
            int r2 = r16.getOverScrollMode()
            r10.mo48020m(r2)
            if (r6 == 0) goto L_0x0249
            r10.f116549i = r6
            r10.mo1546f(r13)
        L_0x0249:
            r10.f116550j = r7
            r10.mo1546f(r13)
            r10.mo48019l(r8)
            r10.f116556p = r4
            r10.mo1546f(r13)
            android.content.Context r2 = r15.f1650a
            r15.mo1655f(r10, r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f116541a
            if (r2 != 0) goto L_0x02a3
            android.view.LayoutInflater r2 = r10.f116546f
            r3 = 2131624724(0x7f0e0314, float:1.8876636E38)
            android.view.View r2 = r2.inflate(r3, r0, r13)
            com.google.android.material.internal.NavigationMenuView r2 = (com.google.android.material.internal.NavigationMenuView) r2
            r10.f116541a = r2
            com.google.android.material.internal.NavigationMenuView r2 = r10.f116541a
            com.google.android.material.internal.ah r3 = new com.google.android.material.internal.ah
            com.google.android.material.internal.NavigationMenuView r4 = r10.f116541a
            r3.<init>(r10, r4)
            r2.setAccessibilityDelegateCompat(r3)
            com.google.android.material.internal.ac r2 = r10.f116545e
            if (r2 != 0) goto L_0x0283
            com.google.android.material.internal.ac r2 = new com.google.android.material.internal.ac
            r2.<init>(r10)
            r10.f116545e = r2
        L_0x0283:
            int r2 = r10.f116566z
            r3 = -1
            if (r2 == r3) goto L_0x028d
            com.google.android.material.internal.NavigationMenuView r3 = r10.f116541a
            r3.setOverScrollMode(r2)
        L_0x028d:
            android.view.LayoutInflater r2 = r10.f116546f
            r3 = 2131624721(0x7f0e0311, float:1.887663E38)
            com.google.android.material.internal.NavigationMenuView r4 = r10.f116541a
            android.view.View r2 = r2.inflate(r3, r4, r13)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r10.f116542b = r2
            com.google.android.material.internal.NavigationMenuView r2 = r10.f116541a
            com.google.android.material.internal.ac r3 = r10.f116545e
            r2.setAdapter(r3)
        L_0x02a3:
            com.google.android.material.internal.NavigationMenuView r2 = r10.f116541a
            r0.addView(r2)
            android.content.res.TypedArray r2 = r1.f2596b
            r3 = 27
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x02bb
            android.content.res.TypedArray r2 = r1.f2596b
            int r2 = r2.getResourceId(r3, r13)
            r0.mo48187b(r2)
        L_0x02bb:
            android.content.res.TypedArray r2 = r1.f2596b
            r3 = 9
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x02d6
            android.content.res.TypedArray r2 = r1.f2596b
            int r2 = r2.getResourceId(r3, r13)
            android.view.LayoutInflater r3 = r10.f116546f
            android.widget.LinearLayout r4 = r10.f116542b
            android.view.View r2 = r3.inflate(r2, r4, r13)
            r10.mo48018k(r2)
        L_0x02d6:
            android.content.res.TypedArray r1 = r1.f2596b
            r1.recycle()
            com.google.android.material.navigation.o r1 = new com.google.android.material.navigation.o
            r1.<init>(r0)
            r0.f116881o = r1
            android.view.ViewTreeObserver r1 = r16.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r0.f116881o
            r1.addOnGlobalLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
