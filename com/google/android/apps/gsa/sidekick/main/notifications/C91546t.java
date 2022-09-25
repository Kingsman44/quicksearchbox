package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58748qn;
import com.google.common.p4522b.C58749qo;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.t */
/* compiled from: PG */
public final /* synthetic */ class C91546t implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ NotificationRefreshReceiver f255344a;

    public /* synthetic */ C91546t(NotificationRefreshReceiver notificationRefreshReceiver) {
        this.f255344a = notificationRefreshReceiver;
    }

    public final void run() {
        C91544r rVar = (C91544r) this.f255344a.f255190e.mo27525b();
        C91500ao aoVar = rVar.f255333b;
        C58485gu b = aoVar.mo85838b(new C91492ag(aoVar, aoVar.f255216b.mo26870b() / 1000), C58836b.f156633a);
        C91500ao aoVar2 = rVar.f255333b;
        C58748qn qnVar = new C58748qn((C58749qo) C58758qx.m90645c(rVar.mo85926e(b), rVar.mo85926e(aoVar2.mo85838b(new C91497al(aoVar2.f255216b.mo26870b() / 1000, aoVar2.f255219e.mo79746e(C90010bp.f246973ap), aoVar2.f255219e.mo79746e(C90010bp.f246974aq)), C58836b.f156633a))));
        while (qnVar.hasNext()) {
            rVar.f255336e.mo85861c(((Integer) qnVar.next()).intValue());
        }
        rVar.mo85931j();
    }
}
