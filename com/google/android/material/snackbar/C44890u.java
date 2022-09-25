package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import com.google.android.material.p3515l.C44785p;

/* renamed from: com.google.android.material.snackbar.u */
/* compiled from: PG */
public class C44890u extends FrameLayout {

    /* renamed from: h */
    private static final View.OnTouchListener f117136h = new C44889t();

    /* renamed from: a */
    public BaseTransientBottomBar f117137a;

    /* renamed from: b */
    C44785p f117138b;

    /* renamed from: c */
    public int f117139c;

    /* renamed from: d */
    public final float f117140d;

    /* renamed from: e */
    public final int f117141e;

    /* renamed from: f */
    public Rect f117142f;

    /* renamed from: g */
    public boolean f117143g;

    /* renamed from: i */
    private final float f117144i;

    /* renamed from: j */
    private final int f117145j;

    /* renamed from: k */
    private ColorStateList f117146k;

    /* renamed from: l */
    private PorterDuff.Mode f117147l;

    protected C44890u(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        BaseTransientBottomBar baseTransientBottomBar = this.f117137a;
        if (!(baseTransientBottomBar == null || (rootWindowInsets = baseTransientBottomBar.f117089j.getRootWindowInsets()) == null)) {
            baseTransientBottomBar.f117095p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            baseTransientBottomBar.mo48345j();
        }
        C2043bi.m5524R(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BaseTransientBottomBar baseTransientBottomBar = this.f117137a;
        if (baseTransientBottomBar != null && baseTransientBottomBar.mo48346k()) {
            BaseTransientBottomBar.f117073a.post(new C44882m(baseTransientBottomBar));
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        BaseTransientBottomBar baseTransientBottomBar = this.f117137a;
        if (baseTransientBottomBar != null && baseTransientBottomBar.f117097r) {
            baseTransientBottomBar.mo48344i();
            baseTransientBottomBar.f117097r = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f117145j > 0 && getMeasuredWidth() > (i3 = this.f117145j)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f117146k == null)) {
            drawable = drawable.mutate();
            C1929b.m5226g(drawable, this.f117146k);
            C1929b.m5227h(drawable, this.f117147l);
        }
        super.setBackgroundDrawable(drawable);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.f117146k = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            C1929b.m5226g(mutate, colorStateList);
            C1929b.m5227h(mutate, this.f117147l);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f117147l = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            C1929b.m5227h(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.f117143g && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f117142f = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar baseTransientBottomBar = this.f117137a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.mo48345j();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.material.l.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C44890u(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r6 = com.google.android.material.theme.p3518a.C44965a.m79936a(r6, r7, r0, r0)
            r5.<init>(r6, r7)
            android.content.Context r6 = r5.getContext()
            int[] r1 = com.google.android.material.snackbar.C44891v.f117148a
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r1)
            r2 = 6
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0021
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            androidx.core.p098j.C2043bi.m5548ab(r5, r2)
        L_0x0021:
            r2 = 2
            int r2 = r1.getInt(r2, r0)
            r5.f117139c = r2
            r2 = 8
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L_0x0038
            r2 = 9
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0043
        L_0x0038:
            com.google.android.material.l.o r7 = com.google.android.material.p3515l.C44785p.m79428e(r6, r7, r0, r0)
            com.google.android.material.l.p r2 = new com.google.android.material.l.p
            r2.<init>(r7)
            r5.f117138b = r2
        L_0x0043:
            r7 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r7 = r1.getFloat(r7, r2)
            r5.f117144i = r7
            r3 = 4
            android.content.res.ColorStateList r6 = com.google.android.material.p3512i.C44694d.m79230b(r6, r1, r3)
            r5.setBackgroundTintList(r6)
            r6 = 5
            r3 = -1
            int r6 = r1.getInt(r6, r3)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.C44741bm.m79310c(r6, r4)
            r5.setBackgroundTintMode(r6)
            r6 = 1
            float r2 = r1.getFloat(r6, r2)
            r5.f117140d = r2
            int r2 = r1.getDimensionPixelSize(r0, r3)
            r5.f117145j = r2
            r2 = 7
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r5.f117141e = r2
            r1.recycle()
            android.view.View$OnTouchListener r1 = f117136h
            r5.setOnTouchListener(r1)
            r5.setFocusable(r6)
            android.graphics.drawable.Drawable r6 = r5.getBackground()
            if (r6 != 0) goto L_0x00d3
            r6 = 2130969167(0x7f04024f, float:1.7547008E38)
            int r6 = com.google.android.material.p3505b.C44535e.m78719b(r5, r6)
            r1 = 2130969124(0x7f040224, float:1.7546921E38)
            int r1 = com.google.android.material.p3505b.C44535e.m78719b(r5, r1)
            int r6 = com.google.android.material.p3505b.C44535e.m78721d(r6, r1, r7)
            com.google.android.material.l.p r7 = r5.f117138b
            if (r7 == 0) goto L_0x00ad
            java.lang.String r0 = com.google.android.material.snackbar.BaseTransientBottomBar.f117074b
            com.google.android.material.l.j r0 = new com.google.android.material.l.j
            r0.<init>((com.google.android.material.p3515l.C44785p) r7)
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r6)
            r0.mo48124V(r6)
            goto L_0x00c9
        L_0x00ad:
            android.content.res.Resources r7 = r5.getResources()
            java.lang.String r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f117074b
            r1 = 2131170527(0x7f0714df, float:1.7955415E38)
            float r7 = r7.getDimension(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r0)
            r1.setCornerRadius(r7)
            r1.setColor(r6)
            r0 = r1
        L_0x00c9:
            android.content.res.ColorStateList r6 = r5.f117146k
            if (r6 == 0) goto L_0x00d0
            androidx.core.graphics.drawable.C1929b.m5226g(r0, r6)
        L_0x00d0:
            androidx.core.p098j.C2043bi.m5530X(r5, r0)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.C44890u.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f117136h);
        super.setOnClickListener(onClickListener);
    }
}
