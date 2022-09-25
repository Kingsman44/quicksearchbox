package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114754h;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.co */
/* compiled from: PG */
final class C114005co implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315648a;

    public C114005co(C114071eg egVar) {
        this.f315648a = egVar;
    }

    public final boolean onPreDraw() {
        this.f315648a.f315855am.getViewTreeObserver().removeOnPreDrawListener(this);
        C114071eg egVar = this.f315648a;
        int[] iArr = {R.id.opa_mark, R.id.profile_icon_container, R.id.opa_fab_container, R.id.opa_search_plate_container};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            View findViewById = egVar.f315984t.findViewById(iArr[i]);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, View.ALPHA, new float[]{0.0f, 1.0f});
                ofFloat.setDuration(160);
                ofFloat.setStartDelay(50);
                ofFloat.setInterpolator(new C91107f(0.0f, 0.0f, 1.0f, 1.0f));
                arrayList.add(ofFloat);
                findViewById.setAlpha(0.0f);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (!arrayList.isEmpty()) {
            animatorSet.playTogether(arrayList);
        }
        C114754h hVar = this.f315648a.f315820aD;
        if (hVar == null) {
            animatorSet.start();
        } else {
            Animator h = hVar.mo101418h();
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{animatorSet, h});
            animatorSet2.start();
        }
        return false;
    }
}
