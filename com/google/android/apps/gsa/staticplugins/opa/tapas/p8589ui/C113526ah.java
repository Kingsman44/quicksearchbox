package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.ah */
/* compiled from: PG */
final class C113526ah {

    /* renamed from: a */
    public final View f314312a;

    /* renamed from: b */
    public final long f314313b;

    /* renamed from: c */
    public boolean f314314c = false;

    /* renamed from: d */
    public ViewPropertyAnimator f314315d;

    public C113526ah(h hVar, C2391v vVar, C22871g gVar, C86124t tVar, View view) {
        this.f314312a = view;
        this.f314313b = tVar.mo79743a(C90063do.f249500eh);
        gVar.mo28212l("observe livedata on ui thread", new C113524af(this, hVar, vVar));
    }
}
