package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.animation.ValueAnimator;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.ab */
/* compiled from: PG */
public final /* synthetic */ class C113520ab implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C113521ac f314296a;

    /* renamed from: b */
    public final /* synthetic */ int f314297b;

    public /* synthetic */ C113520ab(C113521ac acVar, int i) {
        this.f314296a = acVar;
        this.f314297b = i;
    }

    public final void run() {
        C113521ac acVar = this.f314296a;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{acVar.f314298a, this.f314297b});
        ofInt.addUpdateListener(new C113519aa(acVar));
        ofInt.addListener(acVar.f314299b);
        ofInt.setDuration(acVar.f314300c.f314303b.mo79743a(C90063do.f249599ga));
        ofInt.start();
    }
}
