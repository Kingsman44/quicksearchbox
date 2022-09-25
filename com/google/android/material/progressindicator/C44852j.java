package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.p198v.p199a.p200a.C4244c;

/* renamed from: com.google.android.material.progressindicator.j */
/* compiled from: PG */
final class C44852j extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44855m f117026a;

    public C44852j(C44855m mVar) {
        this.f117026a = mVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f117026a.mo48257a();
        C44855m mVar = this.f117026a;
        C4244c cVar = mVar.f117037i;
        if (cVar != null) {
            cVar.mo8946b(mVar.f117064j);
        }
    }
}
