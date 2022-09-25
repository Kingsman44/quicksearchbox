package com.google.android.libraries.onegoogle.accountmenu.features.criticalalert;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.C30194av;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.o */
/* compiled from: PG */
public final class C30539o implements C30194av {

    /* renamed from: a */
    public final CirclePulseDrawable f82485a;

    /* renamed from: b */
    public boolean f82486b;

    /* renamed from: c */
    private AnimatorSet f82487c;

    public C30539o(Context context) {
        int a = C30899a.m57682a(context, R.attr.ogCriticalAlertRingColor);
        this.f82485a = new CirclePulseDrawable(new ColorDrawable(0), a, a);
    }

    /* renamed from: d */
    private static AnimatorSet m57021d(CirclePulseDrawable circlePulseDrawable, String str, int i, long j, long j2) {
        ObjectAnimator duration = ObjectAnimator.ofInt(circlePulseDrawable, str, new int[]{0, i}).setDuration(j);
        duration.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator duration2 = ObjectAnimator.ofInt(circlePulseDrawable, str, new int[]{i, 0}).setDuration(j2);
        duration2.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        return animatorSet;
    }

    /* renamed from: a */
    public final Drawable mo35649a(int i) {
        this.f82485a.setAlpha(128);
        AnimatorSet animatorSet = this.f82487c;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f82487c.removeAllListeners();
        }
        CirclePulseDrawable circlePulseDrawable = this.f82485a;
        int i2 = i + i;
        AnimatorSet d = m57021d(circlePulseDrawable, "firstPulseSize", i2, 950, 900);
        AnimatorSet d2 = m57021d(circlePulseDrawable, "secondPulseSize", i2, 900, 834);
        d2.setStartDelay(400);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{d, d2});
        this.f82487c = animatorSet2;
        animatorSet2.addListener(new C30538n(this));
        if (this.f82486b) {
            this.f82487c.start();
        }
        return this.f82485a;
    }

    /* renamed from: b */
    public final void mo35650b() {
        this.f82486b = true;
        AnimatorSet animatorSet = this.f82487c;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* renamed from: c */
    public final void mo35651c() {
        this.f82486b = false;
        AnimatorSet animatorSet = this.f82487c;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }
}
