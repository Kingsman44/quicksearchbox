package com.google.android.libraries.assistant.auto.tng.morris.p1088g;

import android.databinding.C0118a;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.w */
/* compiled from: PG */
final class C15369w implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C14603pi f46131a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f46132b;

    /* renamed from: c */
    final /* synthetic */ ContextThemeWrapper f46133c;

    /* renamed from: d */
    final /* synthetic */ boolean f46134d;

    /* renamed from: e */
    final /* synthetic */ ViewGroup f46135e;

    /* renamed from: f */
    final /* synthetic */ C15109ac f46136f;

    public C15369w(C15109ac acVar, C14603pi piVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper, boolean z, ViewGroup viewGroup2) {
        this.f46136f = acVar;
        this.f46131a = piVar;
        this.f46132b = viewGroup;
        this.f46133c = contextThemeWrapper;
        this.f46134d = z;
        this.f46135e = viewGroup2;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f46136f.mo21973c(this.f46131a, this.f46132b, this.f46133c, this.f46134d);
        if (this.f46132b.getChildCount() == 0) {
            this.f46135e.setVisibility(8);
            C59104x d = C15109ac.f45336a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.ModeTaskRndr");
            C0118a.m108p(d, "Cannot fade in ongoing task because child view does not exist.", 45933, C38505d.f101864b, 160351205);
            return;
        }
        this.f46132b.getChildAt(0).startAnimation(AnimationUtils.loadAnimation(this.f46133c, R.anim.ongoing_task_fade_in));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
