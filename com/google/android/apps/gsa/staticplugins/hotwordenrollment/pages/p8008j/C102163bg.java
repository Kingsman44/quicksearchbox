package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import com.google.android.apps.gsa.search.core.p6500ac.C84404h;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.bg */
/* compiled from: PG */
final class C102163bg implements C84404h {

    /* renamed from: a */
    final /* synthetic */ C102166bj f284997a;

    public C102163bg(C102166bj bjVar) {
        this.f284997a = bjVar;
    }

    /* renamed from: a */
    public final void mo77957a(int i) {
        ((C59052c) ((C59052c) C102166bj.f285000a.mo56224b()).mo56372aa(20602)).mo56389s("VAA Consent consenting result - %s", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ERROR" : "NOT_GIVEN" : "REVOKED" : "GIVEN" : "UNKNOWN_CONSENT_RESULT");
        this.f284997a.f285005e.mo28212l("Handle consent result", C101873d.m168557b(new C102162bf(this, i)));
    }

    /* renamed from: b */
    public final void mo77958b(int i) {
        ((C59052c) ((C59052c) C102166bj.f285000a.mo56224b()).mo56372aa(20603)).mo56389s("VAA Consent loading result - %s", i != 1 ? i != 2 ? i != 3 ? "SKIPPED" : "FAILED" : "COMPLETED" : "UNKNOWN_LOADING_RESULT");
        this.f284997a.f285005e.mo28212l("Handle loading result", C101873d.m168557b(new C102161be(this, i)));
    }
}
