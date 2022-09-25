package com.google.android.libraries.gsa.logoview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gsa.searchplate.C88945h;
import com.google.android.apps.gsa.searchplate.C88948k;

/* renamed from: com.google.android.libraries.gsa.logoview.f */
/* compiled from: PG */
final class C22913f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ LogoView f63109a;

    public C22913f(LogoView logoView) {
        this.f63109a = logoView;
    }

    public final void onAnimationEnd(Animator animator) {
        C88945h hVar = this.f63109a.f63002i;
        if (hVar != null) {
            hVar.mo82832a(false);
            C88948k kVar = this.f63109a.f63002i.f240956a;
        }
    }
}
