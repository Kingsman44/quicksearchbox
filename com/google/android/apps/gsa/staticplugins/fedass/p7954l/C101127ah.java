package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.RemoteException;
import com.google.android.apps.gsa.i.a.c;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100739e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.ah */
/* compiled from: PG */
public final /* synthetic */ class C101127ah implements C100739e {

    /* renamed from: a */
    public final /* synthetic */ c f282330a;

    public /* synthetic */ C101127ah(c cVar) {
        this.f282330a = cVar;
    }

    /* renamed from: a */
    public final void mo92029a(Throwable th) {
        c cVar = this.f282330a;
        ((C59052c) ((C59052c) ((C59052c) C101128ai.f282331a.mo56225c()).mo56382g(th)).mo56372aa(19836)).mo56386p("Materialization failed in startMaterializationInternal#runMaterialization");
        try {
            cVar.f(false, String.format("Materialization failed in startMaterializationInternall#runMaterialization: %s", new Object[]{th}));
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101128ai.f282331a.mo56225c()).mo56382g(e)).mo56372aa(19837)).mo56386p("Failed to return callback failed state in startMaterializationInternal");
        }
    }
}
