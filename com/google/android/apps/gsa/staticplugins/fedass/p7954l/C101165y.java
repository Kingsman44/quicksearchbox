package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.RemoteException;
import com.google.android.apps.gsa.i.a.c;
import com.google.android.apps.search.fedora.p10099e.C132804l;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.y */
/* compiled from: PG */
final class C101165y implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ c f282395a;

    public C101165y(c cVar) {
        this.f282395a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        try {
            ((C59052c) ((C59052c) ((C59052c) C101166z.f282396a.mo56225c()).mo56382g(th)).mo56372aa(19816)).mo56386p("Error on getProtoStore");
            this.f282395a.g((byte[]) null, th.getMessage());
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101166z.f282396a.mo56225c()).mo56382g(e)).mo56372aa(19817)).mo56386p("Error on getProtoStore");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        try {
            this.f282395a.g(((C132804l) obj).toByteArray(), (String) null);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101166z.f282396a.mo56225c()).mo56382g(e)).mo56372aa(19818)).mo56386p("Error on getProtoStore");
        }
    }
}
