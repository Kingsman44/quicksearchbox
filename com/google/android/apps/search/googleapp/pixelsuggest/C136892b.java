package com.google.android.apps.search.googleapp.pixelsuggest;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.pixelsuggest.b */
/* compiled from: PG */
public final class C136892b implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f372574a;

    /* renamed from: b */
    final /* synthetic */ View f372575b;

    /* renamed from: c */
    final /* synthetic */ int f372576c;

    /* renamed from: d */
    final /* synthetic */ float f372577d;

    /* renamed from: e */
    final /* synthetic */ ImageView f372578e;

    /* renamed from: f */
    final /* synthetic */ ImageView f372579f;

    /* renamed from: g */
    final /* synthetic */ ImageView f372580g;

    /* renamed from: h */
    final /* synthetic */ View f372581h;

    /* renamed from: i */
    final /* synthetic */ Resources f372582i;

    public C136892b(ViewGroup viewGroup, View view, int i, float f, ImageView imageView, ImageView imageView2, ImageView imageView3, View view2, Resources resources) {
        this.f372574a = viewGroup;
        this.f372575b = view;
        this.f372576c = i;
        this.f372577d = f;
        this.f372578e = imageView;
        this.f372579f = imageView2;
        this.f372580g = imageView3;
        this.f372581h = view2;
        this.f372582i = resources;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C69664n.m101061g(view, "view");
        view.removeOnLayoutChangeListener(this);
        int i9 = C136895e.f372593d;
        View findViewById = this.f372574a.findViewById(R.id.googleapp_suggest_search_box);
        View findViewById2 = this.f372574a.findViewById(R.id.googleapp_suggest_app_strip);
        if (findViewById == null || findViewById2 == null) {
            this.f372575b.setVisibility(8);
            this.f372574a.setVisibility(0);
            return;
        }
        int max = Math.max(0, this.f372576c - C136891a.m222563a(findViewById, this.f372574a));
        if (max > 0) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = max;
                findViewById.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        float a = this.f372577d - ((float) (C136891a.m222563a(findViewById2, this.f372574a) + max));
        ViewGroup viewGroup = this.f372574a;
        viewGroup.setVisibility(0);
        viewGroup.setTranslationY(a);
        float f = this.f372577d;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f372574a, "translationY", new float[]{0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f372578e, "translationY", new float[]{f - a});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f372578e, "alpha", new float[]{0.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f372579f, "translationX", new float[]{0.0f});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f372579f, "scaleX", new float[]{1.0f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f372579f, "scaleY", new float[]{1.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f372580g, "translationX", new float[]{0.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f372581h, "alpha", new float[]{1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8});
        animatorSet.setDuration((long) this.f372582i.getInteger(R.integer.googleapp_pixel_suggest_animation_duration));
        animatorSet.addListener(new C136893c(this.f372575b));
        animatorSet.start();
    }
}
