package com.google.android.apps.gsa.staticplugins.p8689s;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87813en;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87822ew;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87825ez;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87827fa;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.s.d */
/* compiled from: PG */
final class C116239d implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C116240e f322324a;

    public C116239d(C116240e eVar) {
        this.f322324a = eVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C116240e.f322325a.mo56225c()).mo56382g(th)).mo56372aa(14483)).mo56386p("BiometricAuth# Exception on checkFingerprintAvailability.");
        C87813en enVar = (C87813en) C87827fa.f237637c.createBuilder();
        C87822ew ewVar = (C87822ew) C87825ez.f237627c.createBuilder();
        ewVar.copyOnWrite();
        C87825ez ezVar = (C87825ez) ewVar.instance;
        ezVar.f237630b = 0;
        ezVar.f237629a |= 1;
        C87825ez ezVar2 = (C87825ez) ewVar.build();
        enVar.copyOnWrite();
        C87827fa faVar = (C87827fa) enVar.instance;
        ezVar2.getClass();
        faVar.f237640b = ezVar2;
        faVar.f237639a = 5;
        this.f322324a.mo102634f((C87827fa) enVar.build());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f322324a.mo102634f((C87827fa) obj);
    }
}
