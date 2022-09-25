package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.el */
/* compiled from: PG */
public final /* synthetic */ class C94287el implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94290eo f263479a;

    public /* synthetic */ C94287el(C94290eo eoVar) {
        this.f263479a = eoVar;
    }

    public final void run() {
        C94290eo eoVar = this.f263479a;
        if (eoVar.getActivity() != null) {
            eoVar.getActivity().getWindow().clearFlags(128);
        }
    }
}
