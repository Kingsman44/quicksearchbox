package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.o */
/* compiled from: PG */
public final /* synthetic */ class C107604o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107606q f299345a;

    public /* synthetic */ C107604o(C107606q qVar) {
        this.f299345a = qVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.OPA_ANDROID_RICH_INPUT_DRAW_FAILED;
        ((C89859i) this.f299345a.f299353d.mo27525b()).mo74236a(fVar.mo83699a());
        C59104x d = C107606q.f299350a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "richInputCtl");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(25512)).mo56386p("#addRichInputTo(): failed with error");
    }
}
