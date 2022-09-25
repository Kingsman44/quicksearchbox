package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8521b;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88347yh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111727h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111728i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8584a.C113437f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113448a;
import com.google.common.p4526f.C59052c;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.b.a */
/* compiled from: PG */
final class C111710a implements C111728i, C113448a {

    /* renamed from: a */
    final C68214a f310544a;

    /* renamed from: b */
    C111727h f310545b;

    public C111710a(C68214a aVar) {
        this.f310544a = aVar;
    }

    /* renamed from: a */
    public final void mo99215a(C88344ye yeVar) {
        if (this.f310545b == null) {
            ((C59052c) ((C59052c) C111711b.f310546a.mo56225c()).mo56372aa(27352)).mo56386p("Response listener not set when first search request sent - responses may not be received!");
        }
        ((C113437f) this.f310544a.mo27525b()).f314110b.mo100236b(yeVar);
    }

    /* renamed from: b */
    public final void mo99216b(C111727h hVar) {
        this.f310545b = hVar;
    }

    /* renamed from: e */
    public final void mo96330e(C88347yh yhVar) {
        C111727h hVar = this.f310545b;
        if (hVar != null) {
            hVar.mo99219a(yhVar);
        }
    }
}
