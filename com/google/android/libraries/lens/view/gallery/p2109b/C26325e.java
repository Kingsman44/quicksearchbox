package com.google.android.libraries.lens.view.gallery.p2109b;

import android.animation.ObjectAnimator;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.onboarding.C27473af;

/* renamed from: com.google.android.libraries.lens.view.gallery.b.e */
/* compiled from: PG */
public final /* synthetic */ class C26325e implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26329i f71560a;

    public /* synthetic */ C26325e(C26329i iVar) {
        this.f71560a = iVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26329i iVar = this.f71560a;
        C27473af afVar = (C27473af) obj;
        boolean b = iVar.f71575l | afVar.mo33010b();
        iVar.f71575l = b;
        if (b) {
            ObjectAnimator objectAnimator = iVar.f71574k;
            objectAnimator.getClass();
            objectAnimator.cancel();
            iVar.f71564a.requireView().setAlpha(true != afVar.mo33010b() ? 1.0f : 0.5f);
        }
    }
}
