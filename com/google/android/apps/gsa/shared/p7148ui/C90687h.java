package com.google.android.apps.gsa.shared.p7148ui;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.apps.gsa.shared.util.p7187ui.C91105d;

/* renamed from: com.google.android.apps.gsa.shared.ui.h */
/* compiled from: PG */
public final class C90687h extends ValueAnimator {

    /* renamed from: a */
    public static final View.OnLayoutChangeListener f253606a = new C90672e();

    /* renamed from: g */
    private static final TimeInterpolator f253607g = C91105d.f254401a;

    /* renamed from: b */
    public final boolean f253608b;

    /* renamed from: c */
    public final int f253609c;

    /* renamed from: d */
    public View f253610d;

    /* renamed from: e */
    public Animator f253611e;

    /* renamed from: f */
    public int f253612f;

    /* renamed from: h */
    private int f253613h = 0;

    /* renamed from: i */
    private int f253614i = 0;

    /* renamed from: j */
    private int f253615j;

    public C90687h(boolean z, int i) {
        this.f253608b = z;
        this.f253609c = i;
        addListener(new C90675f(this));
        addUpdateListener(new C90677g());
        if (z) {
            setFloatValues(new float[]{0.0f, 1.0f});
        } else {
            setFloatValues(new float[]{1.0f, 0.0f});
        }
    }

    /* renamed from: b */
    public static boolean m148061b(int i) {
        return i == 8;
    }

    /* renamed from: c */
    public static boolean m148062c(int i) {
        return m148065f(i) || m148064e(i);
    }

    /* renamed from: d */
    public static final void m148063d(View view, float f) {
        C90638an anVar = (C90638an) view.getLayoutParams();
        if (!anVar.f253484m) {
            if (!(((SuggestionGridLayout) view.getParent()) == null || anVar == null || anVar.f253483l)) {
                f += 0.0f;
            }
            view.setTranslationY(f);
        }
    }

    /* renamed from: e */
    private static boolean m148064e(int i) {
        return i == 4 || i == 6;
    }

    /* renamed from: f */
    private static boolean m148065f(int i) {
        return i == 3 || i == 2;
    }

    /* renamed from: a */
    public final void mo84986a(View view, float f, boolean z) {
        float f2 = 0.0f + f;
        m148063d(view, ((float) (z ? -view.getBottom() : this.f253609c - view.getTop())) * (1.0f - f));
        view.setAlpha(f2);
    }

    public final void setTarget(Object obj) {
        int i;
        View view = (View) obj;
        this.f253610d = view;
        int i2 = 4;
        boolean z = false;
        if (view.getLayoutParams() instanceof C90638an) {
            C90638an anVar = (C90638an) this.f253610d.getLayoutParams();
            boolean z2 = this.f253608b;
            int i3 = z2 ? anVar.f253489r : anVar.f253490s;
            this.f253612f = i3;
            if (i3 == 0) {
                if (true == z2) {
                    i2 = 1;
                }
                this.f253612f = i2;
                i3 = i2;
            }
            if (i3 == 9) {
                C90638an anVar2 = (C90638an) this.f253610d.getLayoutParams();
                int i4 = anVar2.f253485n;
                int max = Math.max(0, this.f253610d.getWidth());
                View view2 = this.f253610d;
                int i5 = anVar2.f253485n;
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, 0, 0, (float) max, 0.0f);
                this.f253611e = createCircularReveal;
                createCircularReveal.setDuration(133);
            }
            this.f253614i = anVar.f253477f;
            boolean z3 = this.f253608b;
            this.f253613h = z3 ? anVar.f253478g : anVar.f253479h;
            if (z3) {
                i = anVar.f253487p;
            } else {
                i = 0;
            }
            this.f253615j = i;
        } else {
            if (true == this.f253608b) {
                i2 = 1;
            }
            this.f253612f = i2;
        }
        if (this.f253608b && this.f253610d.getVisibility() != 0) {
            this.f253612f = 5;
        }
        int i6 = this.f253612f;
        boolean z4 = i6 == 1;
        if (i6 == 8) {
            z = true;
        }
        if (!z4 && i6 != 5 && !z && this.f253608b) {
            this.f253610d.setAlpha(0.0f);
        }
        if (z4) {
            m148063d(this.f253610d, (float) this.f253609c);
        }
        if (z) {
            this.f253610d.setAlpha(1.0f);
            m148063d(this.f253610d, 0.0f);
            this.f253610d.addOnLayoutChangeListener(f253606a);
        }
    }

    public final void start() {
        boolean z = this.f253608b;
        if (z && this.f253612f == 1) {
            setStartDelay((long) ((this.f253614i * 33) + this.f253615j));
            setInterpolator(f253607g);
        } else if (!z || this.f253612f != 6) {
            if (z && this.f253612f == 7) {
                setInterpolator(f253607g);
            }
            setStartDelay((long) this.f253615j);
        } else {
            setStartDelay((long) ((this.f253614i * 33) + 100 + this.f253615j));
        }
        Animator animator = this.f253611e;
        if (animator != null) {
            setDuration(animator.getDuration());
        } else {
            int i = this.f253613h;
            if (i > 0) {
                setDuration((long) i);
            } else {
                int i2 = this.f253612f;
                long j = 66;
                if (m148065f(i2)) {
                    if (true == this.f253608b) {
                        j = 133;
                    }
                    setDuration(j);
                } else {
                    if (this.f253608b) {
                        if (i2 == 7) {
                            setDuration(100);
                        } else if (m148064e(i2)) {
                            setDuration(66);
                        }
                    }
                    setDuration(166);
                }
            }
        }
        Animator animator2 = this.f253611e;
        if (animator2 != null) {
            animator2.start();
        }
        super.start();
    }
}
