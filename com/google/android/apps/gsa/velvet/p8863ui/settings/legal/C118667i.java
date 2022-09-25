package com.google.android.apps.gsa.velvet.p8863ui.settings.legal;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.social.licenses.License;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.legal.i */
/* compiled from: PG */
final class C118667i implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C118668j f331042a;

    /* renamed from: b */
    final /* synthetic */ License f331043b;

    public C118667i(C118668j jVar, License license) {
        this.f331042a = jVar;
        this.f331043b = license;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) ((C59052c) C118669k.f331044a.mo56225c()).mo56382g(th)).mo56372aa(34083)).mo56389s("Failed to load license text for %s", this.f331043b);
            this.f331042a.mo103840c();
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f331042a.mo103838a(this.f331043b, (String) obj);
    }
}
