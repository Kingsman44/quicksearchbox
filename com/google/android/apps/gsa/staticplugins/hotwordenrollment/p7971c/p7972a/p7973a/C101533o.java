package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C101533o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C101510ae f283357a;

    public /* synthetic */ C101533o(C101510ae aeVar) {
        this.f283357a = aeVar;
    }

    public final void run() {
        C101510ae aeVar = this.f283357a;
        C59104x b = C101510ae.f283274a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HomeEnrollTaskRunner");
        ((C59052c) ((C59052c) b).mo56372aa(20308)).mo56386p("#startFreshEnrollment s3 upload succeeded");
        C90873ag b2 = C90875ai.m148465b(new C101530l(aeVar), aeVar.mo92370d(), aeVar.f283283j, "check utterances ready callback");
        b2.mo85225c(IllegalStateException.class, new C101531m(aeVar));
        b2.mo85223a(new C101532n(aeVar));
    }
}
