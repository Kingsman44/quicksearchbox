package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.cj */
/* compiled from: PG */
final class C15227cj implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ boolean f45694a;

    /* renamed from: b */
    final /* synthetic */ C15231cn f45695b;

    public C15227cj(C15231cn cnVar, boolean z) {
        this.f45695b = cnVar;
        this.f45694a = z;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        View view = this.f45695b.f45699b;
        if (view != null) {
            view.setAlpha(0.0f);
        }
        this.f45695b.f45709l.mo21875g(C14731a.m31004a(this.f45694a));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
