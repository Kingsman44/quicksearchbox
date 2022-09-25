package com.google.android.apps.gsa.staticplugins.avocado;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public class AvocadoLottieAnimationView extends LottieAnimationView {

    /* renamed from: j */
    private static final C59071e f263014j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.AvocadoLottieAnimationView");

    /* renamed from: h */
    public int f263015h;

    /* renamed from: i */
    Animator.AnimatorListener f263016i;

    public AvocadoLottieAnimationView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo9689a(Animator.AnimatorListener animatorListener) {
        this.f15138d.f15342b.addListener(animatorListener);
        this.f263016i = animatorListener;
    }

    /* renamed from: g */
    public final void mo9696g(Animator.AnimatorListener animatorListener) {
        this.f15138d.f15342b.removeListener(animatorListener);
        this.f263016i = null;
    }

    /* renamed from: p */
    public final void mo88348p(int i, int i2) {
        int i3 = this.f263015h;
        if (i3 == 0) {
            ((C59052c) ((C59052c) f263014j.mo56225c()).mo56372aa(14236)).mo56386p("Please set a non-zero total number of frames first");
            return;
        }
        float f = (float) i3;
        float f2 = ((float) i) / f;
        float f3 = ((float) i2) / f;
        ((C59052c) ((C59052c) f263014j.mo56224b()).mo56372aa(14235)).mo56361N("Now play from %g%% to %g%%, minFrame:%d,  maxFrame:%d, totalFrame:%d", Float.valueOf(f2 * 100.0f), Float.valueOf(100.0f * f3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f263015h));
        this.f15138d.mo9769i(f2, f3);
        super.mo9695f();
    }

    public AvocadoLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvocadoLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
