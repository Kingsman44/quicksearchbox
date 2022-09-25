package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import android.view.View;
import com.google.android.material.bottomsheet.C44565p;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.c */
/* compiled from: PG */
public final /* synthetic */ class C93857c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C93858d f262128a;

    public /* synthetic */ C93857c(C93858d dVar) {
        this.f262128a = dVar;
    }

    public final void onClick(View view) {
        C93858d dVar = this.f262128a;
        C44565p pVar = dVar.f262134f;
        if (pVar != null) {
            pVar.dismiss();
            dVar.f262134f = null;
        }
    }
}
