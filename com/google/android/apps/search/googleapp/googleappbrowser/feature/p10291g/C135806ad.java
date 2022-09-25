package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136057an;
import com.google.android.libraries.search.logging.p3042e.C39190a;
import com.google.android.material.chip.Chip;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.ad */
/* compiled from: PG */
final class C135806ad extends AnimatorListenerAdapter {

    /* renamed from: a */
    boolean f369909a = false;

    /* renamed from: b */
    final /* synthetic */ C135808af f369910b;

    public C135806ad(C135808af afVar) {
        this.f369910b = afVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f369909a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f369909a) {
            ((C59052c) ((C59052c) C135808af.f369912a.mo56224b()).mo56372aa(40623)).mo56386p("Instacart chip test code logged.");
            this.f369910b.f369916e.mo41592d(new C58759qy(C39190a.GAB_INSTACART_CHIP));
        }
        this.f369910b.f369925n.removeAllListeners();
        this.f369909a = false;
    }

    public final void onAnimationStart(Animator animator) {
        C135808af afVar = this.f369910b;
        Chip chip = (Chip) afVar.f369914c.getView();
        if (!afVar.f369923l && chip != null) {
            C47393f.m84236g(new C136057an(), afVar.f369914c);
            chip.setVisibility(0);
            chip.startAnimation(afVar.f369924m);
        }
    }
}
