package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.RemoteException;
import com.google.android.apps.gsa.i.a.c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.x */
/* compiled from: PG */
final class C101164x implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ c f282394a;

    public C101164x(c cVar) {
        this.f282394a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        try {
            ((C59052c) ((C59052c) ((C59052c) C101166z.f282396a.mo56225c()).mo56382g(th)).mo56372aa(19813)).mo56386p("Error on clearCachesAndPersonalization");
            this.f282394a.f(false, th.getMessage());
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101166z.f282396a.mo56225c()).mo56382g(e)).mo56372aa(19814)).mo56386p("Error on clearCachesAndPersonalization");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.f282394a.f(true, (String) null);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101166z.f282396a.mo56225c()).mo56382g(e)).mo56372aa(19815)).mo56386p("Error on clearCachesAndPersonalization");
        }
    }
}
