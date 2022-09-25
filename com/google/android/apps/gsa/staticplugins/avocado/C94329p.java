package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.p */
/* compiled from: PG */
public final /* synthetic */ class C94329p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94170an f263606a;

    public /* synthetic */ C94329p(C94170an anVar) {
        this.f263606a = anVar;
    }

    public final void run() {
        C94170an anVar = this.f263606a;
        if (anVar.getActivity() != null) {
            anVar.getActivity().getWindow().clearFlags(128);
        }
    }
}
