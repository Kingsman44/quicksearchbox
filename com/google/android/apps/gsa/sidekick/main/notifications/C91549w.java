package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.p489g.p493c.C9135h;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7799kj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.w */
/* compiled from: PG */
public final /* synthetic */ class C91549w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ NotificationRefreshReceiver f255349a;

    public /* synthetic */ C91549w(NotificationRefreshReceiver notificationRefreshReceiver) {
        this.f255349a = notificationRefreshReceiver;
    }

    public final void run() {
        List list;
        C91544r rVar = (C91544r) this.f255349a.f255190e.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        C91500ao aoVar = rVar.f255333b;
        if (!aoVar.mo85848n()) {
            list = C58485gu.m89845m();
        } else {
            long b = aoVar.f255216b.mo26870b() / 1000;
            ArrayList arrayList = null;
            for (C9135h hVar : aoVar.f255220f.f31420c) {
                if (hVar.f31445c <= b) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    C7799kj kjVar = hVar.f31444b;
                    if (kjVar == null) {
                        kjVar = C7799kj.f27263h;
                    }
                    arrayList.add(new C91499an(kjVar, hVar.f31446d));
                }
            }
            list = arrayList;
        }
        rVar.mo85929h(list);
    }
}
