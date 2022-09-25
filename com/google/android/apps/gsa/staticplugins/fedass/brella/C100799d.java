package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100739e;
import com.google.android.gms.learning.internal.C144771c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.d */
/* compiled from: PG */
public final /* synthetic */ class C100799d implements C100739e {

    /* renamed from: a */
    public final /* synthetic */ C144771c f281728a;

    public /* synthetic */ C100799d(C144771c cVar) {
        this.f281728a = cVar;
    }

    /* renamed from: a */
    public final void mo92029a(Throwable th) {
        C144771c cVar = this.f281728a;
        C59104x c = C100801f.f281730a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaExampleStoreItr");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(19501)).mo56386p("Failed to get a next example from the adapter.");
        cVar.mo120202a((String) null);
    }
}
