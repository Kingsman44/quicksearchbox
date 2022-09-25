package com.google.android.libraries.lens.view.filters.carousel;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.w */
/* compiled from: PG */
public final class C25967w {

    /* renamed from: a */
    public final Animator f70574a;

    /* renamed from: b */
    public final FilterTooltip f70575b;

    /* renamed from: c */
    public final View f70576c;

    /* renamed from: d */
    public final C28443m f70577d;

    /* renamed from: e */
    public final C28306ab f70578e;

    /* renamed from: f */
    public final Duration f70579f;

    /* renamed from: g */
    public boolean f70580g;

    /* renamed from: h */
    public int f70581h = 0;

    /* renamed from: i */
    public int f70582i;

    /* renamed from: j */
    public int f70583j;

    /* renamed from: k */
    public int f70584k;

    /* renamed from: l */
    public C25952h f70585l;

    public C25967w(FilterTooltip filterTooltip, long j, C47770dh dhVar, C28443m mVar, C28306ab abVar) {
        this.f70575b = filterTooltip;
        this.f70579f = Duration.ofMillis(j);
        this.f70576c = filterTooltip.findViewById(R.id.tooltip_caret);
        this.f70577d = mVar;
        this.f70578e = abVar;
        this.f70574a = AnimatorInflater.loadAnimator(filterTooltip.getContext(), R.animator.filter_recommendation_tooltip_out_animator);
        filterTooltip.setOnClickListener(new C47591co(dhVar, "Filter Tooltip", new C25965u(this)));
    }

    /* renamed from: a */
    public final void mo31160a() {
        Animator animator = this.f70574a;
        if (animator == null) {
            this.f70575b.setVisibility(8);
        } else if (!animator.isRunning()) {
            this.f70574a.cancel();
            this.f70574a.setStartDelay(0);
            this.f70574a.start();
            if (this.f70579f.isNegative()) {
                this.f70575b.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo31161b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f70575b.getLayoutParams();
        this.f70584k = ((View) view.getParent()).getWidth();
        this.f70583j = view.getLeft();
        int right = view.getRight();
        this.f70582i = right;
        if (this.f70580g) {
            marginLayoutParams.rightMargin = Math.max(this.f70584k - right, 0);
        } else {
            marginLayoutParams.leftMargin = Math.max(this.f70583j, 0);
        }
        this.f70575b.setLayoutParams(marginLayoutParams);
    }
}
