package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100739e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.e */
/* compiled from: PG */
public final /* synthetic */ class C100800e implements C100739e {

    /* renamed from: a */
    public final /* synthetic */ int f281729a;

    public /* synthetic */ C100800e(int i) {
        this.f281729a = i;
    }

    /* renamed from: a */
    public final void mo92029a(Throwable th) {
        int i = this.f281729a;
        C59104x c = C100801f.f281730a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaExampleStoreItr");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(19502)).mo56387q("Failed to request %d more samples", i);
    }
}
