package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.p033v7.widget.C0568ck;
import android.support.p033v7.widget.C0645fg;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.t */
/* compiled from: PG */
public final class C107577t extends C0568ck {
    /* renamed from: x */
    private static final Animator m178434x(View view) {
        view.setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(320);
        ofFloat.setStartDelay(260);
        return ofFloat;
    }

    /* renamed from: y */
    private static final Animator m178435y(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(260);
        ofFloat.addListener(new C107573p(view));
        return ofFloat;
    }

    /* renamed from: z */
    private static final Animator m178436z(int i, int i2, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C107574q(view));
        ofInt.addListener(new C107575r(view));
        ofInt.setDuration(280);
        return ofInt;
    }

    /* renamed from: p */
    public final boolean mo2892p(C0673gh ghVar, C0673gh ghVar2, C0645fg fgVar, C0645fg fgVar2) {
        C107576s sVar = (C107576s) fgVar;
        C107576s sVar2 = (C107576s) fgVar2;
        C107570m mVar = (C107570m) ghVar2;
        C107572o oVar = sVar.f299294c;
        C107572o oVar2 = sVar2.f299294c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m178436z(sVar.f299295d, sVar2.f299295d, mVar.f299247c));
        arrayList.add(m178436z(sVar.f299296e, sVar2.f299296e, mVar.f299248d));
        arrayList.add(m178436z(sVar.f299297f, sVar2.f299297f, mVar.f299249e));
        if ((oVar instanceof C107561d) && (oVar2 instanceof C107558a)) {
            arrayList.add(m178434x(mVar.f299264t));
            arrayList.add(m178434x(mVar.f299265u));
            arrayList.add(m178434x(mVar.f299253i));
            arrayList.add(m178434x(mVar.f299254j));
            arrayList.add(m178435y(mVar.f299250f));
            arrayList.add(m178435y(mVar.f299263s));
            arrayList.add(m178435y(mVar.f299252h));
        } else if (oVar instanceof C107558a) {
            if (oVar2 instanceof C107561d) {
                arrayList.add(m178434x(mVar.f299250f));
                arrayList.add(m178434x(mVar.f299263s));
                arrayList.add(m178434x(mVar.f299252h));
                arrayList.add(m178435y(mVar.f299264t));
                arrayList.add(m178435y(mVar.f299265u));
                arrayList.add(m178435y(mVar.f299253i));
                arrayList.add(m178435y(mVar.f299254j));
            } else if (oVar2 instanceof C107578u) {
                arrayList.add(m178434x(mVar.f299266v));
                arrayList.add(m178434x(mVar.f299267w));
                arrayList.add(m178434x(mVar.f299256l));
                arrayList.add(m178435y(mVar.f299264t));
                arrayList.add(m178435y(mVar.f299265u));
                arrayList.add(m178435y(mVar.f299259o));
                arrayList.add(m178435y(mVar.f299260p));
                arrayList.add(m178435y(mVar.f299253i));
                arrayList.add(m178435y(mVar.f299254j));
                arrayList.add(m178435y(mVar.f299255k));
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        if (ghVar != null) {
            mo2889m(ghVar);
        }
        if (ghVar2 == null || ghVar2 == ghVar) {
            return false;
        }
        mo2889m(ghVar2);
        return false;
    }

    /* renamed from: s */
    public final boolean mo2895s(C0673gh ghVar) {
        return true;
    }

    /* renamed from: u */
    public final C0645fg mo2897u(C0673gh ghVar) {
        C107576s sVar = new C107576s();
        sVar.mo96045b(ghVar);
        return sVar;
    }

    /* renamed from: v */
    public final C0645fg mo2898v(C0673gh ghVar) {
        C107576s sVar = new C107576s();
        sVar.mo96045b(ghVar);
        return sVar;
    }
}
