package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.view.ViewPropertyAnimator;
import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.assistant.shared.p.f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.ag */
/* compiled from: PG */
public final /* synthetic */ class C113525ag implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C113526ah f314311a;

    public /* synthetic */ C113525ag(C113526ah ahVar) {
        this.f314311a = ahVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C113526ah ahVar = this.f314311a;
        if (((f) obj) == f.a) {
            ViewPropertyAnimator viewPropertyAnimator = ahVar.f314315d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ahVar.f314314c = false;
        }
    }
}
