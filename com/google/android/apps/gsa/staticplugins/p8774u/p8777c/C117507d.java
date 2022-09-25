package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.d */
/* compiled from: PG */
final class C117507d extends Animation implements C117500ae {

    /* renamed from: a */
    public static final Interpolator f326184a = C91107f.m148859b(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: b */
    public static final Interpolator f326185b = C91107f.m148859b(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: e */
    private static final C59071e f326186e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.u.c.d");

    /* renamed from: f */
    private static final Interpolator f326187f = C91107f.m148859b(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: c */
    public final C117494j f326188c;

    /* renamed from: d */
    public final View f326189d;

    public C117507d(C117494j jVar, View view) {
        this.f326188c = jVar;
        this.f326189d = view;
    }

    /* renamed from: a */
    public final void mo103348a(C117501af afVar) {
        AnimationSet animationSet = new AnimationSet(false);
        int height = this.f326189d.getHeight();
        C117494j jVar = C117494j.ANIMATE_FADE_IN;
        int ordinal = this.f326188c.ordinal();
        if (ordinal == 0) {
            animationSet.addAnimation(new C117505b(0.0f, 1.0f, f326187f));
        } else if (ordinal == 1) {
            animationSet.addAnimation(new C117505b(1.0f, 0.0f, f326187f));
        } else if (ordinal == 2) {
            animationSet.addAnimation(new C117506c((float) height, 0.0f, 225, f326185b));
        } else if (ordinal == 3) {
            animationSet.addAnimation(new C117506c(0.0f, (float) height, 195, f326184a));
        } else if (ordinal == 4) {
            animationSet.addAnimation(new C117505b(0.0f, 1.0f, f326187f));
            animationSet.addAnimation(new C117506c((float) height, 0.0f, 225, f326185b));
        } else if (ordinal != 5) {
            C59104x d = f326186e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BSCAnimation");
            ((C59052c) ((C59052c) d).mo56372aa(18276)).mo56386p("Unknown transition animation to dismiss the bottom sheet");
            int i = C90755l.f253831a;
        } else {
            animationSet.addAnimation(new C117505b(1.0f, 0.0f, f326187f));
            animationSet.addAnimation(new C117506c(0.0f, (float) height, 195, f326184a));
        }
        animationSet.setAnimationListener(new C117495a(this, afVar));
        this.f326189d.startAnimation(animationSet);
    }
}
