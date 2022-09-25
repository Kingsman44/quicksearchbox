package p5652p.p5653a.p5654a.p5655a.p5666f.p5667a;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: p.a.a.a.f.a.b */
/* compiled from: PG */
public final /* synthetic */ class C72700b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C72703e f193312a;

    public /* synthetic */ C72700b(C72703e eVar) {
        this.f193312a = eVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C72703e eVar = this.f193312a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = eVar.f193316a.getLayoutParams();
        layoutParams.height = intValue;
        eVar.f193316a.setLayoutParams(layoutParams);
    }
}
