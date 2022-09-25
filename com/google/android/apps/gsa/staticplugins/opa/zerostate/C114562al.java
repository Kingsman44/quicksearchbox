package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114829bz;
import com.google.assistant.p3994s.p3995a.C53306j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.al */
/* compiled from: PG */
public final /* synthetic */ class C114562al implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114575ay f317695a;

    public /* synthetic */ C114562al(C114575ay ayVar) {
        this.f317695a = ayVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114575ay ayVar = this.f317695a;
        if (!((Boolean) obj).booleanValue()) {
            ViewGroup viewGroup = ayVar.f317765y;
            viewGroup.getClass();
            boolean equals = C53306j.MAIN_APP.equals(C53306j.MORRIS);
            float f = true != equals ? 0.5f : 0.4f;
            long j = 320;
            long j2 = true != equals ? 320 : 200;
            long j3 = 1000;
            long j4 = true != equals ? 320 : 1000;
            long j5 = 50;
            if (true == equals) {
                j = 50;
            }
            if (true != equals) {
                j3 = 480;
            }
            if (true != equals) {
                j5 = 1440;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{1.0f, f});
            ofFloat.setStartDelay(j5);
            ofFloat.setDuration(j3);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{f, 1.0f});
            ofFloat2.setStartDelay(j);
            ofFloat2.setDuration(j4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
            animatorSet.addListener(new C114829bz(animatorSet));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{0.0f, 1.0f});
            ofFloat3.setStartDelay(160);
            ofFloat3.setDuration(j2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(new Animator[]{ofFloat3, animatorSet});
            animatorSet2.start();
        }
    }
}
