package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100739e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.p */
/* compiled from: PG */
public final /* synthetic */ class C100811p implements C100739e {

    /* renamed from: a */
    public final /* synthetic */ String f281758a;

    public /* synthetic */ C100811p(String str) {
        this.f281758a = str;
    }

    /* renamed from: a */
    public final void mo92029a(Throwable th) {
        String str = this.f281758a;
        C59104x c = GsaExampleStoreService.f281713a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaExamplesService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(19514)).mo56389s("startQuery() failed for collection: %s", str);
    }
}
