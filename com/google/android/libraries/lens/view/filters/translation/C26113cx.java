package com.google.android.libraries.lens.view.filters.translation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.lens.view.filters.translation.C26114cy;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.cx */
/* compiled from: PG */
final class C26113cx extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C26114cy f70952a;

    public C26113cx(C26114cy cyVar) {
        this.f70952a = cyVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C26114cy cyVar = this.f70952a;
        cyVar.f70966n = true;
        C47393f.m84237h(new C26114cy.C26115a(), cyVar.f70964l);
    }
}
