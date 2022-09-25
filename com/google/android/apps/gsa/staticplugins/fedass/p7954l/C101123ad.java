package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.RemoteException;
import com.google.android.apps.gsa.i.a.c;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100739e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.ad */
/* compiled from: PG */
public final /* synthetic */ class C101123ad implements C100739e {

    /* renamed from: a */
    public final /* synthetic */ c f282322a;

    public /* synthetic */ C101123ad(c cVar) {
        this.f282322a = cVar;
    }

    /* renamed from: a */
    public final void mo92029a(Throwable th) {
        c cVar = this.f282322a;
        ((C59052c) ((C59052c) ((C59052c) C101128ai.f282331a.mo56225c()).mo56382g(th)).mo56372aa(19832)).mo56386p("Materialization failed at startMaterialization");
        try {
            cVar.f(false, String.format("Materialization failed at startMaterialization: %s", new Object[]{th}));
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101128ai.f282331a.mo56225c()).mo56382g(e)).mo56372aa(19833)).mo56386p("Failed to return callback failed state in startMaterialization");
        }
    }
}
