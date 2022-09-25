package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.bo */
/* compiled from: PG */
public final /* synthetic */ class C113969bo implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114071eg f315601a;

    /* renamed from: b */
    public final /* synthetic */ CharSequence f315602b;

    public /* synthetic */ C113969bo(C114071eg egVar, CharSequence charSequence) {
        this.f315601a = egVar;
        this.f315602b = charSequence;
    }

    public final void run() {
        C114071eg egVar = this.f315601a;
        CharSequence charSequence = this.f315602b;
        View view = egVar.f315793C;
        view.getClass();
        ((TextView) view).setText(charSequence);
    }
}
