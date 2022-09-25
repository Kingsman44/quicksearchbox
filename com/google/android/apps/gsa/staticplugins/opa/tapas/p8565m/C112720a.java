package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.a */
/* compiled from: PG */
final class C112720a implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C112801d f312466a;

    public C112720a(C112801d dVar) {
        this.f312466a = dVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f312466a.f312638a.mo96205a(C89849ae.AGSA_TEXT_TAPAS_ANSWER_CARD_REMOVED);
        this.f312466a.f312639b.mo99779a();
    }
}
