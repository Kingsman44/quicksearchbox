package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.l */
/* compiled from: PG */
final class C100615l implements C22868d {

    /* renamed from: a */
    final /* synthetic */ int f281351a;

    /* renamed from: b */
    final /* synthetic */ C100617n f281352b;

    public C100615l(C100617n nVar, int i) {
        this.f281352b = nVar;
        this.f281351a = i;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C100617n.f281353a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VSResultWRHandler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(33676)).mo56386p("Failure while getting Query with recognized text.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C59104x d = C100617n.f281353a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VSResultWRHandler");
            ((C59052c) ((C59052c) d).mo56372aa(33678)).mo56386p("Query with recognized text is not populated.");
            return;
        }
        int i = this.f281351a;
        if (i == 1) {
            ((C11897m) this.f281352b.f281354b.mo56107c()).mo20284e((Query) axVar.mo56107c());
        } else if (i != 2) {
            C59104x c = C100617n.f281353a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VSResultWRHandler");
            ((C59052c) ((C59052c) c).mo56372aa(33677)).mo56387q("Invalid recognizerId %d for auto fulfillMode logging", this.f281351a);
        } else {
            ((C11897m) this.f281352b.f281354b.mo56107c()).mo20285f((Query) axVar.mo56107c());
        }
    }
}
