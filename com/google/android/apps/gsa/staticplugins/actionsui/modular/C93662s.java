package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.common.base.C58838bb;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.s */
/* compiled from: PG */
public final class C93662s extends C93663t {

    /* renamed from: a */
    private final int f261438a;

    /* renamed from: b */
    private final int f261439b;

    /* renamed from: c */
    private final int f261440c;

    public C93662s(int i) {
        C58838bb.m90868c(i >= 0);
        this.f261439b = 1;
        this.f261438a = 1;
        this.f261440c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Animator mo88122a(Argument argument, CharSequence charSequence, TransitionValues transitionValues, Argument argument2, CharSequence charSequence2) {
        View view = transitionValues.view;
        if (!(view instanceof C93566bq)) {
            return null;
        }
        C93566bq bqVar = (C93566bq) view;
        View[] D = bqVar.mo87984D();
        if (D.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (View view2 : D) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", new float[]{view.getTranslationY(), (float) (this.f261440c * this.f261438a)});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{view.getAlpha(), 0.0f});
            ofFloat.setInterpolator(C91107f.f254410f);
            ofFloat2.setInterpolator(C91107f.f254410f);
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "translationY", new float[]{(float) (this.f261440c * this.f261439b), 0.0f});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
            ofFloat3.setInterpolator(C91107f.f254411g);
            ofFloat4.setInterpolator(C91107f.f254411g);
            arrayList2.add(ofFloat3);
            arrayList2.add(ofFloat4);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.playTogether(arrayList2);
        animatorSet.playSequentially(new Animator[]{(Animator) arrayList.get(0), (Animator) arrayList2.get(0)});
        ((Animator) arrayList.get(0)).addListener(new C93661r(bqVar, charSequence, argument, argument2, charSequence2));
        return animatorSet;
    }
}
