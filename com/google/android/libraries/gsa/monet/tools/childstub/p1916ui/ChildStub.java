package com.google.android.libraries.gsa.monet.tools.childstub.p1916ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ViewAnimator;

/* renamed from: com.google.android.libraries.gsa.monet.tools.childstub.ui.ChildStub */
/* compiled from: PG */
public final class ChildStub extends View {

    /* renamed from: a */
    public int f63703a;

    /* renamed from: b */
    private View f63704b;

    /* renamed from: c */
    private int f63705c;

    /* renamed from: d */
    private float f63706d;

    /* renamed from: e */
    private float f63707e;

    /* renamed from: f */
    private float f63708f;

    /* renamed from: g */
    private float f63709g;

    public ChildStub(Context context) {
        this(context, (AttributeSet) null, 0, 0);
    }

    /* renamed from: e */
    private final void m43543e() {
        View view = this.f63704b;
        if (view != null) {
            view.setAlpha(getAlpha());
        }
    }

    /* renamed from: f */
    private final void m43544f() {
        View view = this.f63704b;
        if (view != null) {
            view.setElevation(getElevation());
        }
    }

    /* renamed from: g */
    private final void m43545g() {
        View view = this.f63704b;
        if (view != null) {
            view.setTranslationX(getTranslationX());
        }
    }

    /* renamed from: h */
    private final void m43546h() {
        View view = this.f63704b;
        if (view != null) {
            view.setTranslationY(getTranslationY());
        }
    }

    /* renamed from: i */
    private static void m43547i(View view, View view2) {
        Animation animation;
        Animation animation2;
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 != null) {
            if (layoutParams.height == -2 && layoutParams2.height > 0) {
                layoutParams.height = layoutParams2.height;
            }
            if (layoutParams.width == -2 && layoutParams2.width > 0) {
                layoutParams.width = layoutParams2.width;
            }
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int indexOfChild = viewGroup.indexOfChild(view);
        ViewAnimator viewAnimator = null;
        if (viewGroup instanceof ViewAnimator) {
            ViewAnimator viewAnimator2 = (ViewAnimator) viewGroup;
            i = viewAnimator2.getDisplayedChild();
            animation2 = viewAnimator2.getOutAnimation();
            animation = viewAnimator2.getInAnimation();
            viewAnimator2.setOutAnimation((Animation) null);
            viewAnimator2.setInAnimation((Animation) null);
            viewAnimator = viewAnimator2;
        } else {
            i = 0;
            animation2 = null;
            animation = null;
        }
        viewGroup.removeView(view);
        viewGroup.addView(view2, indexOfChild, layoutParams);
        if (viewAnimator != null) {
            viewAnimator.setDisplayedChild(i);
            viewAnimator.setOutAnimation(animation2);
            viewAnimator.setInAnimation(animation);
        }
    }

    /* renamed from: a */
    public final void mo28716a() {
        View view = this.f63704b;
        if (view != null) {
            view.setVisibility(this.f63703a);
        }
    }

    /* renamed from: b */
    public final void mo28717b() {
        View view = this.f63704b;
        if (view != null) {
            m43547i(view, this);
            this.f63704b.setVisibility(this.f63705c);
            this.f63704b.setAlpha(this.f63706d);
            this.f63704b.setElevation(this.f63707e);
            this.f63704b.setTranslationX(this.f63708f);
            this.f63704b.setTranslationY(this.f63709g);
            this.f63704b = null;
        }
    }

    /* renamed from: c */
    public final void mo28718c(View view) {
        if (this.f63704b != view) {
            if (mo28719d()) {
                mo28717b();
            }
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f63704b = view;
            this.f63705c = view.getVisibility();
            this.f63706d = view.getAlpha();
            this.f63707e = view.getElevation();
            this.f63708f = view.getTranslationX();
            this.f63709g = view.getTranslationY();
            m43547i(this, view);
            mo28716a();
            m43543e();
            m43544f();
            m43545g();
            m43546h();
        }
    }

    /* renamed from: d */
    public final boolean mo28719d() {
        return this.f63704b != null;
    }

    public final void setAlpha(float f) {
        super.setAlpha(f);
        m43543e();
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        m43544f();
    }

    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        m43545g();
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        m43546h();
    }

    public final void setVisibility(int i) {
        this.f63703a = i;
        mo28716a();
    }

    public ChildStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public ChildStub(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ChildStub(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        this.f63703a = super.getVisibility();
        super.setVisibility(8);
        setWillNotDraw(true);
    }
}
