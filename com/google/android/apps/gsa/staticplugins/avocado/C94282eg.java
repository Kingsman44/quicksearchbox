package com.google.android.apps.gsa.staticplugins.avocado;

import android.content.DialogInterface;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.eg */
/* compiled from: PG */
public final /* synthetic */ class C94282eg implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94286ek f263469a;

    public /* synthetic */ C94282eg(C94286ek ekVar) {
        this.f263469a = ekVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C94286ek ekVar = this.f263469a;
        ekVar.f263476f = 1;
        C86337q b = ((C86338r) ekVar.f263474d.mo27525b()).mo80076b();
        b.mo80075j("PROBLEM_WITH_UP_DOWN_POSE_KEY");
        b.commit();
        ekVar.mo77318iT().mo77312a();
    }
}
