package com.google.android.apps.gsa.nga.engine.viss;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.w;
import com.google.android.apps.gsa.nga.engine.tclib.TcLibWrapper;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4273bs.p4277b.p4278a.C56481u;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.g */
/* compiled from: PG */
public final /* synthetic */ class C79377g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C79378h f217996a;

    /* renamed from: b */
    public final /* synthetic */ w f217997b;

    public /* synthetic */ C79377g(C79378h hVar, w wVar) {
        this.f217996a = hVar;
        this.f217997b = wVar;
    }

    public final void run() {
        C79378h hVar = this.f217996a;
        w wVar = this.f217997b;
        try {
            Optional m = ((TcLibWrapper) hVar.f217998a.f217938n.mo27525b()).mo72947m();
            if (m.isPresent()) {
                wVar.a(((C56481u) m.get()).toByteArray());
            }
        } catch (RemoteException unused) {
            ((C58970a) ((C58970a) NgaService.f217912a.mo56224b()).mo56372aa(5541)).mo56386p("Error getting the ModelVersion.");
        }
    }
}
