package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.i.a.c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.t */
/* compiled from: PG */
final class C101160t implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ c f282391a;

    public C101160t(c cVar) {
        this.f282391a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        try {
            this.f282391a.f(false, BuildConfig.FLAVOR);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101166z.f282396a.mo56225c()).mo56382g(e)).mo56372aa(19806)).mo56386p("Error setting the response");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Long l = (Long) obj;
        try {
            this.f282391a.f(true, BuildConfig.FLAVOR);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101166z.f282396a.mo56225c()).mo56382g(e)).mo56372aa(19807)).mo56386p("Error setting the response");
        }
    }
}
