package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.RemoteException;
import com.google.android.apps.gsa.i.a.c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.ap */
/* compiled from: PG */
final class C101135ap implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ c f282347a;

    public C101135ap(c cVar) {
        this.f282347a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C101137ar.f282348a.mo56225c()).mo56382g(th)).mo56372aa(19840)).mo56386p("getSheldonSessions(): failed");
        try {
            this.f282347a.f(false, "getSheldonSessions(): failed");
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101137ar.f282348a.mo56225c()).mo56382g(e)).mo56372aa(19841)).mo56386p("Failed to return failure callback in getSheldonSessions()");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        try {
            this.f282347a.f(true, "getSheldonSessions(): success");
            ((C59052c) ((C59052c) C101137ar.f282348a.mo56224b()).mo56372aa(19842)).mo56386p("getSheldonSessions(): success");
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101137ar.f282348a.mo56225c()).mo56382g(e)).mo56372aa(19843)).mo56386p("Failed to return callback in getSheldonSessions()");
        }
    }
}
