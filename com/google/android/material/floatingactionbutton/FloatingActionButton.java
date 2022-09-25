package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p033v7.widget.C0512aj;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.C1769b;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.C2043bi;
import androidx.p060c.C0984n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C44742bn;
import com.google.android.material.internal.C44749i;
import com.google.android.material.p3504a.C44502g;
import com.google.android.material.p3509f.C44655a;
import com.google.android.material.p3509f.C44656b;
import com.google.android.material.p3515l.C44770aa;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44780k;
import com.google.android.material.p3515l.C44785p;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;

/* compiled from: PG */
public class FloatingActionButton extends C44742bn implements C44655a, C44770aa, C1769b {

    /* renamed from: a */
    private ColorStateList f116366a;

    /* renamed from: b */
    public int f116367b;

    /* renamed from: c */
    public int f116368c;

    /* renamed from: d */
    boolean f116369d;

    /* renamed from: e */
    final Rect f116370e;

    /* renamed from: g */
    private PorterDuff.Mode f116371g;

    /* renamed from: h */
    private ColorStateList f116372h;

    /* renamed from: i */
    private int f116373i;

    /* renamed from: j */
    private int f116374j;

    /* renamed from: k */
    private int f116375k;

    /* renamed from: l */
    private final Rect f116376l;

    /* renamed from: m */
    private final C0512aj f116377m;

    /* renamed from: n */
    private final C44656b f116378n;

    /* renamed from: o */
    private C44658aa f116379o;

    /* compiled from: PG */
    public class BaseBehavior extends C1770c {

        /* renamed from: a */
        private Rect f116380a;

        /* renamed from: b */
        private boolean f116381b;

        public BaseBehavior() {
            this.f116381b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44662ae.f116423d);
            this.f116381b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: s */
        private static boolean m79129s(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C1773f) {
                return ((C1773f) layoutParams).f5523a instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: t */
        private final boolean m79130t(View view, FloatingActionButton floatingActionButton) {
            C1773f fVar = (C1773f) floatingActionButton.getLayoutParams();
            if (this.f116381b && fVar.f5528f == view.getId() && floatingActionButton.f116606f == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: u */
        private final boolean m79131u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m79130t(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f116380a == null) {
                this.f116380a = new Rect();
            }
            Rect rect = this.f116380a;
            C44749i.m79353a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.mo47398h()) {
                floatingActionButton.mo47899e();
                return true;
            }
            floatingActionButton.mo47900f();
            return true;
        }

        /* renamed from: v */
        private final boolean m79132v(View view, FloatingActionButton floatingActionButton) {
            if (!m79130t(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C1773f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo47899e();
                return true;
            }
            floatingActionButton.mo47900f();
            return true;
        }

        /* renamed from: a */
        public final void mo4953a(C1773f fVar) {
            if (fVar.f5530h == 0) {
                fVar.f5530h = 80;
            }
        }

        /* renamed from: e */
        public final /* bridge */ /* synthetic */ boolean mo4957e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m79131u(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            } else if (!m79129s(view2)) {
                return false;
            } else {
                m79132v(view2, floatingActionButton);
                return false;
            }
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List b = coordinatorLayout.mo4914b(floatingActionButton);
            int size = b.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) b.get(i4);
                if (!(view2 instanceof AppBarLayout)) {
                    if (m79129s(view2) && m79132v(view2, floatingActionButton)) {
                        break;
                    }
                } else if (m79131u(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo4927k(floatingActionButton, i);
            Rect rect = floatingActionButton.f116370e;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            C1773f fVar = (C1773f) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                C2043bi.m5517K(floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            C2043bi.m5516J(floatingActionButton, i2);
            return true;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ boolean mo4966n(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f116370e;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private final C44658aa m79122b() {
        if (this.f116379o == null) {
            this.f116379o = new C44660ac(this, new C44678q(this));
        }
        return this.f116379o;
    }

    /* renamed from: a */
    public final C1770c mo4952a() {
        return new Behavior();
    }

    /* renamed from: c */
    public final int mo47897c(int i) {
        int i2 = this.f116374j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return mo47897c(1);
        } else {
            return mo47897c(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m79122b();
        getDrawableState();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo47899e() {
        AnimatorSet animatorSet;
        C44658aa b = m79122b();
        if (b.f116396C.getVisibility() == 0) {
            if (b.f116395B == 1) {
                return;
            }
        } else if (b.f116395B != 2) {
            return;
        }
        Animator animator = b.f116414v;
        if (animator != null) {
            animator.cancel();
        }
        if (b.mo47935l()) {
            C44502g gVar = b.f116416x;
            if (gVar != null) {
                animatorSet = b.mo47925b(gVar, 0.0f, 0.0f, 0.0f);
            } else {
                animatorSet = b.mo47926c(0.0f, 0.4f, 0.4f, C44658aa.f116386d, C44658aa.f116387e);
            }
            animatorSet.addListener(new C44679r(b));
            animatorSet.start();
            return;
        }
        b.f116396C.mo48051g(4, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo47900f() {
        AnimatorSet animatorSet;
        C44658aa b = m79122b();
        if (b.f116396C.getVisibility() != 0) {
            if (b.f116395B == 2) {
                return;
            }
        } else if (b.f116395B != 1) {
            return;
        }
        Animator animator = b.f116414v;
        if (animator != null) {
            animator.cancel();
        }
        C44502g gVar = b.f116415w;
        if (b.mo47935l()) {
            if (b.f116396C.getVisibility() != 0) {
                float f = 0.0f;
                b.f116396C.setAlpha(0.0f);
                FloatingActionButton floatingActionButton = b.f116396C;
                if (gVar == null) {
                    f = 0.4f;
                }
                super.setScaleY(f);
                floatingActionButton.m79122b();
                FloatingActionButton floatingActionButton2 = b.f116396C;
                super.setScaleX(f);
                floatingActionButton2.m79122b();
                b.mo47930g(f);
            }
            C44502g gVar2 = b.f116415w;
            if (gVar2 != null) {
                animatorSet = b.mo47925b(gVar2, 1.0f, 1.0f, 1.0f);
            } else {
                animatorSet = b.mo47926c(1.0f, 1.0f, 1.0f, C44658aa.f116384b, C44658aa.f116385c);
            }
            animatorSet.addListener(new C44680s(b));
            animatorSet.start();
            return;
        }
        b.f116396C.mo48051g(0, false);
        b.f116396C.setAlpha(1.0f);
        FloatingActionButton floatingActionButton3 = b.f116396C;
        super.setScaleY(1.0f);
        floatingActionButton3.m79122b();
        FloatingActionButton floatingActionButton4 = b.f116396C;
        super.setScaleX(1.0f);
        floatingActionButton4.m79122b();
        b.mo47930g(1.0f);
    }

    public final ColorStateList getBackgroundTintList() {
        return this.f116366a;
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f116371g;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        m79122b();
    }

    /* renamed from: l */
    public final void mo47555l(C44785p pVar) {
        m79122b().mo47931h(pVar);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44658aa b = m79122b();
        C44779j jVar = b.f116405m;
        if (jVar != null) {
            C44780k.m79413d(b.f116396C, jVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C44658aa b = m79122b();
        b.f116396C.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = b.f116397D;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int c = mo47897c(this.f116367b);
        this.f116368c = (c - this.f116375k) / 2;
        m79122b().mo47932i();
        int min = Math.min(View.resolveSize(c, i), View.resolveSize(c, i2));
        setMeasuredDimension(this.f116370e.left + min + this.f116370e.right, min + this.f116370e.top + this.f116370e.bottom);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f6116d);
        C44656b bVar = this.f116378n;
        Bundle bundle = (Bundle) extendableSavedState.f117155a.get("expandableWidgetHelper");
        bundle.getClass();
        bVar.f116343b = bundle.getBoolean("expanded", false);
        bVar.f116344c = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f116343b) {
            ViewParent parent = bVar.f116342a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).mo4915c(bVar.f116342a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        C0984n nVar = extendableSavedState.f117155a;
        C44656b bVar = this.f116378n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f116343b);
        bundle.putInt("expandedComponentIdHint", bVar.f116344c);
        nVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f116376l;
            if (C2043bi.m5570ax(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                rect.left += this.f116370e.left;
                rect.top += this.f116370e.top;
                rect.right -= this.f116370e.right;
                rect.bottom -= this.f116370e.bottom;
                if (!this.f116376l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f116366a != colorStateList) {
            this.f116366a = colorStateList;
            C44658aa b = m79122b();
            C44779j jVar = b.f116405m;
            if (jVar != null) {
                jVar.setTintList(colorStateList);
            }
            C44666e eVar = b.f116407o;
            if (eVar != null) {
                eVar.mo47953b(colorStateList);
            }
        }
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f116371g != mode) {
            this.f116371g = mode;
            C44779j jVar = m79122b().f116405m;
            if (jVar != null) {
                jVar.setTintMode(mode);
            }
        }
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        m79122b().mo47933j(f);
    }

    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C44658aa b = m79122b();
            b.mo47930g(b.f116418z);
        }
    }

    public final void setImageResource(int i) {
        this.f116377m.mo2500d(i);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.clearColorFilter();
        }
    }

    public final void setScaleX(float f) {
        super.setScaleX(f);
        m79122b();
    }

    public final void setScaleY(float f) {
        super.setScaleY(f);
        m79122b();
    }

    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        m79122b();
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        m79122b();
    }

    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        m79122b();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = r20
            r9 = 2132151249(0x7f160bd1, float:1.9944555E38)
            r1 = r18
            android.content.Context r1 = com.google.android.material.theme.p3518a.C44965a.m79936a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f116370e = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f116376l = r1
            android.content.Context r10 = r17.getContext()
            int[] r3 = com.google.android.material.floatingactionbutton.C44662ae.f116422c
            r5 = 2132151249(0x7f160bd1, float:1.9944555E38)
            r11 = 0
            int[] r6 = new int[r11]
            r1 = r10
            r2 = r19
            r4 = r20
            android.content.res.TypedArray r1 = com.google.android.material.internal.C44733be.m79295a(r1, r2, r3, r4, r5, r6)
            r2 = 1
            android.content.res.ColorStateList r3 = com.google.android.material.p3512i.C44694d.m79230b(r10, r1, r2)
            r0.f116366a = r3
            r3 = 2
            r4 = -1
            int r5 = r1.getInt(r3, r4)
            r6 = 0
            android.graphics.PorterDuff$Mode r5 = com.google.android.material.internal.C44741bm.m79310c(r5, r6)
            r0.f116371g = r5
            r5 = 12
            android.content.res.ColorStateList r5 = com.google.android.material.p3512i.C44694d.m79230b(r10, r1, r5)
            r0.f116372h = r5
            r5 = 7
            int r4 = r1.getInt(r5, r4)
            r0.f116367b = r4
            r4 = 6
            int r4 = r1.getDimensionPixelSize(r4, r11)
            r0.f116374j = r4
            r4 = 3
            int r4 = r1.getDimensionPixelSize(r4, r11)
            r0.f116373i = r4
            r4 = 4
            r5 = 0
            float r4 = r1.getDimension(r4, r5)
            r12 = 9
            float r12 = r1.getDimension(r12, r5)
            r13 = 11
            float r5 = r1.getDimension(r13, r5)
            r13 = 16
            boolean r13 = r1.getBoolean(r13, r11)
            r0.f116369d = r13
            android.content.res.Resources r13 = r17.getResources()
            r14 = 2131170447(0x7f07148f, float:1.7955253E38)
            int r13 = r13.getDimensionPixelSize(r14)
            r14 = 10
            int r14 = r1.getDimensionPixelSize(r14, r11)
            r0.f116375k = r14
            com.google.android.material.floatingactionbutton.aa r15 = r17.m79122b()
            int r6 = r15.f116394A
            if (r6 == r14) goto L_0x00a2
            r15.f116394A = r14
            float r6 = r15.f116418z
            r15.mo47930g(r6)
        L_0x00a2:
            r6 = 15
            com.google.android.material.a.g r6 = com.google.android.material.p3504a.C44502g.m78603b(r10, r1, r6)
            r14 = 8
            com.google.android.material.a.g r14 = com.google.android.material.p3504a.C44502g.m78603b(r10, r1, r14)
            com.google.android.material.l.c r15 = com.google.android.material.p3515l.C44785p.f116779a
            com.google.android.material.l.o r9 = com.google.android.material.p3515l.C44785p.m79426a(r10, r7, r8, r9, r15)
            com.google.android.material.l.p r10 = new com.google.android.material.l.p
            r10.<init>(r9)
            r9 = 5
            boolean r9 = r1.getBoolean(r9, r11)
            boolean r15 = r1.getBoolean(r11, r2)
            r0.setEnabled(r15)
            r1.recycle()
            android.support.v7.widget.aj r1 = new android.support.v7.widget.aj
            r1.<init>(r0)
            r0.f116377m = r1
            r1.mo2499c(r7, r8)
            com.google.android.material.f.b r1 = new com.google.android.material.f.b
            r1.<init>(r0)
            r0.f116378n = r1
            com.google.android.material.floatingactionbutton.aa r1 = r17.m79122b()
            r1.mo47931h(r10)
            com.google.android.material.floatingactionbutton.aa r1 = r17.m79122b()
            android.content.res.ColorStateList r7 = r0.f116366a
            android.graphics.PorterDuff$Mode r8 = r0.f116371g
            android.content.res.ColorStateList r10 = r0.f116372h
            int r15 = r0.f116373i
            com.google.android.material.floatingactionbutton.ac r1 = (com.google.android.material.floatingactionbutton.C44660ac) r1
            com.google.android.material.l.p r11 = r1.f116404l
            r11.getClass()
            com.google.android.material.floatingactionbutton.ab r3 = new com.google.android.material.floatingactionbutton.ab
            r3.<init>(r11)
            r1.f116405m = r3
            com.google.android.material.l.j r3 = r1.f116405m
            r3.setTintList(r7)
            if (r8 == 0) goto L_0x0106
            com.google.android.material.l.j r3 = r1.f116405m
            r3.setTintMode(r8)
        L_0x0106:
            com.google.android.material.l.j r3 = r1.f116405m
            com.google.android.material.floatingactionbutton.FloatingActionButton r8 = r1.f116396C
            android.content.Context r8 = r8.getContext()
            r3.mo48121S(r8)
            if (r15 <= 0) goto L_0x0182
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r1.f116396C
            android.content.Context r3 = r3.getContext()
            com.google.android.material.floatingactionbutton.e r8 = new com.google.android.material.floatingactionbutton.e
            com.google.android.material.l.p r11 = r1.f116404l
            r11.getClass()
            r8.<init>(r11)
            r11 = 2131100432(0x7f060310, float:1.7813245E38)
            int r11 = androidx.core.content.C1878d.m5128a(r3, r11)
            r2 = 2131100431(0x7f06030f, float:1.7813243E38)
            int r2 = androidx.core.content.C1878d.m5128a(r3, r2)
            r0 = 2131100429(0x7f06030d, float:1.781324E38)
            int r0 = androidx.core.content.C1878d.m5128a(r3, r0)
            r16 = r9
            r9 = 2131100430(0x7f06030e, float:1.7813241E38)
            int r3 = androidx.core.content.C1878d.m5128a(r3, r9)
            r8.f116434c = r11
            r8.f116435d = r2
            r8.f116436e = r0
            r8.f116437f = r3
            float r0 = (float) r15
            float r2 = r8.f116433b
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0162
            r8.f116433b = r0
            android.graphics.Paint r2 = r8.f116432a
            r3 = 1068149139(0x3faaa993, float:1.3333)
            float r0 = r0 * r3
            r2.setStrokeWidth(r0)
            r0 = 1
            r8.f116438g = r0
            r8.invalidateSelf()
        L_0x0162:
            r8.mo47953b(r7)
            r1.f116407o = r8
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r2 = 2
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            com.google.android.material.floatingactionbutton.e r3 = r1.f116407o
            r3.getClass()
            r7 = 0
            r2[r7] = r3
            com.google.android.material.l.j r3 = r1.f116405m
            r3.getClass()
            r7 = 1
            r2[r7] = r3
            r0.<init>(r2)
            r2 = r0
            r0 = 0
            goto L_0x0189
        L_0x0182:
            r16 = r9
            r0 = 0
            r1.f116407o = r0
            com.google.android.material.l.j r2 = r1.f116405m
        L_0x0189:
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r7 = com.google.android.material.p3513j.C44767a.m79372b(r10)
            r3.<init>(r7, r2, r0)
            r1.f116406n = r3
            android.graphics.drawable.Drawable r0 = r1.f116406n
            r1.f116408p = r0
            com.google.android.material.floatingactionbutton.aa r0 = r17.m79122b()
            r0.f116413u = r13
            com.google.android.material.floatingactionbutton.aa r0 = r17.m79122b()
            float r1 = r0.f116410r
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x01b1
            r0.f116410r = r4
            float r1 = r0.f116411s
            float r2 = r0.f116412t
            r0.mo47929f(r4, r1, r2)
        L_0x01b1:
            com.google.android.material.floatingactionbutton.aa r0 = r17.m79122b()
            float r1 = r0.f116411s
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x01c4
            r0.f116411s = r12
            float r1 = r0.f116410r
            float r2 = r0.f116412t
            r0.mo47929f(r1, r12, r2)
        L_0x01c4:
            com.google.android.material.floatingactionbutton.aa r0 = r17.m79122b()
            float r1 = r0.f116412t
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01d7
            r0.f116412t = r5
            float r1 = r0.f116410r
            float r2 = r0.f116411s
            r0.mo47929f(r1, r2, r5)
        L_0x01d7:
            com.google.android.material.floatingactionbutton.aa r0 = r17.m79122b()
            r0.f116415w = r6
            com.google.android.material.floatingactionbutton.aa r0 = r17.m79122b()
            r0.f116416x = r14
            com.google.android.material.floatingactionbutton.aa r0 = r17.m79122b()
            r1 = r16
            r0.f116409q = r1
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r1 = r17
            r1.setScaleType(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
