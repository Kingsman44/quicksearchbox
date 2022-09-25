package com.google.android.apps.gsa.nga.engine.viss;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.p5942a.C74974d;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.p5942a.C74975e;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.v */
/* compiled from: PG */
public final /* synthetic */ class C79392v implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C79396z f218020a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f218021b;

    public /* synthetic */ C79392v(C79396z zVar, IBinder iBinder) {
        this.f218020a = zVar;
        this.f218021b = iBinder;
    }

    public final void run() {
        C79396z zVar = this.f218020a;
        IBinder iBinder = this.f218021b;
        C79394x xVar = zVar.f218029e;
        if (xVar == null || !xVar.f218023a.equals(iBinder)) {
            C79394x xVar2 = zVar.f218029e;
            if (xVar2 != null) {
                xVar2.mo74011a();
                ((C58970a) ((C58970a) C79396z.f218025a.mo56224b()).mo56372aa(5588)).mo56386p("Process token changed, assuming :search process died");
            }
            if (iBinder == null) {
                ((C58970a) ((C58970a) C79396z.f218025a.mo56226d()).mo56372aa(5593)).mo56386p("#onSearchProcessAlive: No process token provided");
            } else if (zVar.f218029e == null) {
                try {
                    C79394x xVar3 = new C79394x(zVar, iBinder);
                    iBinder.linkToDeath(xVar3, 0);
                    zVar.f218029e = xVar3;
                    ((C79391u) zVar.f218027c.mo27525b()).mo74008a(iBinder);
                    C74975e eVar = (C74975e) zVar.f218028d.mo27525b();
                    eVar.f209196b.mo28212l("[NGA] notify search process listeners on alive", new C74974d(eVar));
                } catch (RemoteException e) {
                    ((C58970a) ((C58970a) C79396z.f218025a.mo56225c()).mo56372aa(5591)).mo56389s("New client is already dead: %s", e.getMessage());
                }
            } else {
                ((C58970a) ((C58970a) C79396z.f218025a.mo56226d()).mo56372aa(5592)).mo56386p("#onSearchProcessAlive: currentDeathRecipient is still set");
            }
        } else {
            ((C58970a) ((C58970a) C79396z.f218025a.mo56224b()).mo56372aa(5589)).mo56386p("New :search process connection is already being tracked");
        }
    }
}
