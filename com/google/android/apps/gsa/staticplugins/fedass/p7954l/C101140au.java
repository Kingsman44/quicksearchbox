package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.RemoteException;
import com.google.android.apps.gsa.i.a.c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.au */
/* compiled from: PG */
final class C101140au implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ c f282356a;

    public C101140au(c cVar) {
        this.f282356a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C101141av.f282357a.mo56225c()).mo56382g(th)).mo56372aa(19855)).mo56386p("getSpeechLearningData(): failed");
        try {
            this.f282356a.f(false, "getSpeechLearningData(): failed");
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101141av.f282357a.mo56225c()).mo56382g(e)).mo56372aa(19856)).mo56386p("Failed to return failure callback.");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.f282356a.f(true, "getSpeechLearningData(): success");
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101141av.f282357a.mo56225c()).mo56382g(e)).mo56372aa(19858)).mo56386p("Failed to return success callback.");
        }
    }
}
