package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.au */
/* compiled from: PG */
public final /* synthetic */ class C94690au implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C86232bo f264808a;

    /* renamed from: b */
    public final /* synthetic */ C22871g f264809b;

    /* renamed from: c */
    public final /* synthetic */ C94785f f264810c;

    public /* synthetic */ C94690au(C86232bo boVar, C22871g gVar, C94785f fVar) {
        this.f264808a = boVar;
        this.f264809b = gVar;
        this.f264810c = fVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C86232bo boVar = this.f264808a;
        C22871g gVar = this.f264809b;
        C94785f fVar = this.f264810c;
        Exception exc = (Exception) obj;
        C59104x c = C94692aw.f264811a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
        ((C59052c) ((C59052c) c).mo56372aa(16872)).mo56386p("getActionDataWithOfflineFallback failed");
        if (boVar.mo79882R()) {
            gVar.mo28212l("failed", new C94684ao(fVar));
            return;
        }
        C59104x c2 = C94692aw.f264811a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
        ((C59052c) ((C59052c) c2).mo56372aa(16873)).mo56386p("getActionDataWithOfflineFallback failed; searchResult did not");
    }
}
