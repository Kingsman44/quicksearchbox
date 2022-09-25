package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.C74737q;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.af */
/* compiled from: PG */
public final /* synthetic */ class C78627af implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78632ak f216515a;

    /* renamed from: b */
    public final /* synthetic */ C74737q f216516b;

    public /* synthetic */ C78627af(C78632ak akVar, C74737q qVar) {
        this.f216515a = akVar;
        this.f216516b = qVar;
    }

    public final void run() {
        C78632ak akVar = this.f216515a;
        C74737q qVar = this.f216516b;
        ((C59052c) ((C59052c) C78632ak.f216521a.mo56224b()).mo56372aa(5260)).mo56386p("setIAssistUiStateCallback");
        akVar.mo73558c();
        akVar.f216526f.mo71358a(akVar);
        akVar.f216522b.mo76660b(true);
        akVar.f216525e = qVar;
        try {
            qVar.mo71118f(new C78631aj(akVar));
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C78632ak.f216521a.mo56225c()).mo56382g(e)).mo56372aa(5261)).mo56386p("Could not set callback");
            akVar.mo73558c();
        }
        akVar.f216523c.mo76660b(true);
    }
}
