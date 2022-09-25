package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.C1769b;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C44749i;
import java.util.List;

/* compiled from: PG */
public class ExtendedFloatingActionButton extends MaterialButton implements C1769b {

    /* renamed from: h */
    static final Property f116345h = new C44670i(Float.class);

    /* renamed from: i */
    static final Property f116346i = new C44671j(Float.class);

    /* renamed from: j */
    static final Property f116347j = new C44672k(Float.class);

    /* renamed from: k */
    static final Property f116348k = new C44673l(Float.class);

    /* renamed from: v */
    public static final /* synthetic */ int f116349v = 0;

    /* renamed from: l */
    public int f116350l;

    /* renamed from: m */
    public final C44661ad f116351m;

    /* renamed from: n */
    public final C44661ad f116352n;

    /* renamed from: o */
    public final C44661ad f116353o;

    /* renamed from: p */
    public final C44661ad f116354p;

    /* renamed from: q */
    public int f116355q;

    /* renamed from: r */
    public int f116356r;

    /* renamed from: s */
    public boolean f116357s;

    /* renamed from: t */
    public boolean f116358t;

    /* renamed from: u */
    protected ColorStateList f116359u;

    /* renamed from: w */
    private final C44657a f116360w;

    /* renamed from: x */
    private final int f116361x;

    /* renamed from: y */
    private final C1770c f116362y;

    /* compiled from: PG */
    public class ExtendedFloatingActionButtonBehavior extends C1770c {

        /* renamed from: a */
        private Rect f116363a;

        /* renamed from: b */
        private boolean f116364b;

        /* renamed from: c */
        private boolean f116365c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f116364b = false;
            this.f116365c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44662ae.f116421b);
            this.f116364b = obtainStyledAttributes.getBoolean(0, false);
            this.f116365c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: u */
        private static boolean m79112u(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C1773f) {
                return ((C1773f) layoutParams).f5523a instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: v */
        private final boolean m79113v(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            C1773f fVar = (C1773f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f116364b || this.f116365c) && fVar.f5528f == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: w */
        private final boolean m79114w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m79113v(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f116363a == null) {
                this.f116363a = new Rect();
            }
            Rect rect = this.f116363a;
            C44749i.m79353a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.mo47398h()) {
                mo47896t(extendedFloatingActionButton);
                return true;
            }
            mo47895s(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: x */
        private final boolean m79115x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m79113v(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((C1773f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo47896t(extendedFloatingActionButton);
                return true;
            }
            mo47895s(extendedFloatingActionButton);
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
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m79114w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                return false;
            } else if (!m79112u(view2)) {
                return false;
            } else {
                m79115x(view2, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List b = coordinatorLayout.mo4914b(extendedFloatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) b.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    if (m79112u(view2) && m79115x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m79114w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo4927k(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: n */
        public final /* synthetic */ boolean mo4966n(View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public final void mo47895s(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C44661ad adVar;
            if (this.f116365c) {
                int i = ExtendedFloatingActionButton.f116349v;
                adVar = extendedFloatingActionButton.f116352n;
            } else {
                int i2 = ExtendedFloatingActionButton.f116349v;
                adVar = extendedFloatingActionButton.f116353o;
            }
            extendedFloatingActionButton.mo47890r(adVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public final void mo47896t(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C44661ad adVar;
            if (this.f116365c) {
                int i = ExtendedFloatingActionButton.f116349v;
                adVar = extendedFloatingActionButton.f116351m;
            } else {
                int i2 = ExtendedFloatingActionButton.f116349v;
                adVar = extendedFloatingActionButton.f116354p;
            }
            extendedFloatingActionButton.mo47890r(adVar);
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final C1770c mo4952a() {
        return this.f116362y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo32790b() {
        return (mo47888c() - this.f115972e) / 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo47888c() {
        int i = this.f116361x;
        if (i >= 0) {
            return i;
        }
        int min = Math.min(C2043bi.m5583l(this), C2043bi.m5582k(this));
        return min + min + this.f115972e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo47889d(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    /* renamed from: e */
    public final boolean mo32798e() {
        return getVisibility() != 0 ? this.f116350l == 2 : this.f116350l != 1;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f116357s && TextUtils.isEmpty(getText()) && this.f115971d != null) {
            this.f116357s = false;
            this.f116351m.mo47943i();
        }
    }

    /* renamed from: r */
    public final void mo47890r(C44661ad adVar) {
        if (!adVar.mo47944j()) {
            if (!C2043bi.m5570ax(this)) {
                mo32798e();
            } else if (!isInEditMode()) {
                measure(0, 0);
                AnimatorSet a = adVar.mo47937a();
                a.addListener(new C44669h(adVar));
                for (Animator.AnimatorListener addListener : adVar.mo47938d()) {
                    a.addListener(addListener);
                }
                a.start();
                return;
            }
            adVar.mo47943i();
            adVar.mo47945k();
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f116357s && !this.f116358t) {
            this.f116355q = C2043bi.m5583l(this);
            this.f116356r = C2043bi.m5582k(this);
        }
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f116357s && !this.f116358t) {
            this.f116355q = i;
            this.f116356r = i3;
        }
    }

    public final void setTextColor(int i) {
        super.setTextColor(i);
        this.f116359u = getTextColors();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            r9 = 2132151768(0x7f160dd8, float:1.9945608E38)
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.p3518a.C44965a.m79936a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f116350l = r10
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>()
            r0.f116360w = r1
            com.google.android.material.floatingactionbutton.o r11 = new com.google.android.material.floatingactionbutton.o
            r11.<init>(r0, r1)
            r0.f116353o = r11
            com.google.android.material.floatingactionbutton.n r12 = new com.google.android.material.floatingactionbutton.n
            r12.<init>(r0, r1)
            r0.f116354p = r12
            r13 = 1
            r0.f116357s = r13
            r0.f116358t = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f116362y = r1
            int[] r3 = com.google.android.material.floatingactionbutton.C44662ae.f116420a
            r5 = 2132151768(0x7f160dd8, float:1.9945608E38)
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            android.content.res.TypedArray r1 = com.google.android.material.internal.C44733be.m79295a(r1, r2, r3, r4, r5, r6)
            r2 = 4
            com.google.android.material.a.g r2 = com.google.android.material.p3504a.C44502g.m78603b(r14, r1, r2)
            r3 = 3
            com.google.android.material.a.g r3 = com.google.android.material.p3504a.C44502g.m78603b(r14, r1, r3)
            r4 = 2
            com.google.android.material.a.g r4 = com.google.android.material.p3504a.C44502g.m78603b(r14, r1, r4)
            r5 = 5
            com.google.android.material.a.g r5 = com.google.android.material.p3504a.C44502g.m78603b(r14, r1, r5)
            r6 = -1
            int r6 = r1.getDimensionPixelSize(r10, r6)
            r0.f116361x = r6
            int r6 = androidx.core.p098j.C2043bi.m5583l(r16)
            r0.f116355q = r6
            int r6 = androidx.core.p098j.C2043bi.m5582k(r16)
            r0.f116356r = r6
            com.google.android.material.floatingactionbutton.a r6 = new com.google.android.material.floatingactionbutton.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.m r15 = new com.google.android.material.floatingactionbutton.m
            com.google.android.material.floatingactionbutton.f r9 = new com.google.android.material.floatingactionbutton.f
            r9.<init>(r0)
            r15.<init>(r0, r6, r9, r13)
            r0.f116352n = r15
            com.google.android.material.floatingactionbutton.m r9 = new com.google.android.material.floatingactionbutton.m
            com.google.android.material.floatingactionbutton.g r13 = new com.google.android.material.floatingactionbutton.g
            r13.<init>(r0)
            r9.<init>(r0, r6, r13, r10)
            r0.f116351m = r9
            com.google.android.material.floatingactionbutton.c r11 = (com.google.android.material.floatingactionbutton.C44664c) r11
            r11.f116427c = r2
            com.google.android.material.floatingactionbutton.c r12 = (com.google.android.material.floatingactionbutton.C44664c) r12
            r12.f116427c = r3
            com.google.android.material.floatingactionbutton.c r15 = (com.google.android.material.floatingactionbutton.C44664c) r15
            r15.f116427c = r4
            com.google.android.material.floatingactionbutton.c r9 = (com.google.android.material.floatingactionbutton.C44664c) r9
            r9.f116427c = r5
            r1.recycle()
            com.google.android.material.l.c r1 = com.google.android.material.p3515l.C44785p.f116779a
            r2 = 2132151768(0x7f160dd8, float:1.9945608E38)
            com.google.android.material.l.o r1 = com.google.android.material.p3515l.C44785p.m79426a(r14, r7, r8, r2, r1)
            com.google.android.material.l.p r2 = new com.google.android.material.l.p
            r2.<init>(r1)
            r0.mo47555l(r2)
            android.content.res.ColorStateList r1 = r16.getTextColors()
            r0.f116359u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f116359u = getTextColors();
    }
}
