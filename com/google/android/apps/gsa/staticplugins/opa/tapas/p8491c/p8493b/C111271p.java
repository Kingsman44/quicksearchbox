package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8493b;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111241d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111251n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111252o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111254q;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.b.p */
/* compiled from: PG */
public final /* synthetic */ class C111271p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C111272q f309645a;

    public /* synthetic */ C111271p(C111272q qVar) {
        this.f309645a = qVar;
    }

    public final void onClick(View view) {
        C111272q qVar = this.f309645a;
        int absoluteAdapterPosition = qVar.getAbsoluteAdapterPosition();
        int b = ((C111254q) qVar.f309650e.f309652a.get(absoluteAdapterPosition)).mo99060b();
        if (b == 0) {
            throw null;
        } else if (b == 2) {
            C111252o a = ((C111254q) qVar.f309650e.f309652a.get(absoluteAdapterPosition)).mo99059a();
            C111251n a2 = a.mo99070a();
            a2.mo99069b(!a.mo99073d());
            C111254q a3 = C111241d.m184987a(a2.mo99068a());
            qVar.f309650e.f309652a.set(absoluteAdapterPosition, a3);
            qVar.f309650e.notifyItemChanged(absoluteAdapterPosition, a3);
        }
    }
}
