package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.z */
/* compiled from: PG */
public final /* synthetic */ class C112956z implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112721aa f313020a;

    /* renamed from: b */
    public final /* synthetic */ C113415ez f313021b;

    /* renamed from: c */
    public final /* synthetic */ C112919hj f313022c;

    public /* synthetic */ C112956z(C112721aa aaVar, C113415ez ezVar, C112919hj hjVar) {
        this.f313020a = aaVar;
        this.f313021b = ezVar;
        this.f313022c = hjVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112721aa aaVar = this.f313020a;
        C113415ez ezVar = this.f313021b;
        C112919hj hjVar = this.f313022c;
        C59104x d = C112721aa.f312467a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AppShortcutsRenderer");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(27782)).mo56389s("Unable to load app label for - %s.", ezVar.mo100199L());
        if (!aaVar.f312470c.mo79746e(C90063do.f249525fF)) {
            hjVar.itemView.setVisibility(8);
        }
    }
}
