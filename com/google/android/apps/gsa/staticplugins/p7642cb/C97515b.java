package com.google.android.apps.gsa.staticplugins.p7642cb;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cb.b */
/* compiled from: PG */
public final /* synthetic */ class C97515b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97517d f272330a;

    public /* synthetic */ C97515b(C97517d dVar) {
        this.f272330a = dVar;
    }

    public final void run() {
        C97517d dVar = this.f272330a;
        if (dVar.f272338h != 1) {
            C89062r rVar = dVar.f272336f;
            C86337q b = ((C86338r) dVar.f272335c.mo27525b()).mo80076b();
            b.mo80067b("last_known_connectivity_status", rVar.mo83040a());
            b.apply();
            dVar.f272339i.mo80613e(dVar.f272336f);
        }
    }
}
