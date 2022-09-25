package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.RemoteException;
import com.google.android.apps.gsa.i.a.c;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100739e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.af */
/* compiled from: PG */
public final /* synthetic */ class C101125af implements C100739e {

    /* renamed from: a */
    public final /* synthetic */ c f282328a;

    public /* synthetic */ C101125af(c cVar) {
        this.f282328a = cVar;
    }

    /* renamed from: a */
    public final void mo92029a(Throwable th) {
        c cVar = this.f282328a;
        ((C59052c) ((C59052c) ((C59052c) C101128ai.f282331a.mo56225c()).mo56382g(th)).mo56372aa(19834)).mo56386p("Failed to init materializer on call to getMaterializeForDevApp.");
        try {
            cVar.f(false, String.format("Failed to init materializer on call to getMaterializeForDevApp: %s", new Object[]{th}));
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101128ai.f282331a.mo56225c()).mo56382g(e)).mo56372aa(19835)).mo56386p("Failed to return callback failed state while attempting to getMaterializeForDevApp");
        }
    }
}
