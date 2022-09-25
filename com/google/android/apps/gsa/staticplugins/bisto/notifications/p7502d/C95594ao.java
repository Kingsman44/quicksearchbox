package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ao */
/* compiled from: PG */
public final /* synthetic */ class C95594ao implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95598as f267521a;

    public /* synthetic */ C95594ao(C95598as asVar) {
        this.f267521a = asVar;
    }

    public final void run() {
        C95598as asVar = this.f267521a;
        C58976aa aaVar = C58975e.f156826a;
        for (C95596aq aqVar : asVar.f267532c.values()) {
            List list = aqVar.f267524b;
            if (list.size() >= 2) {
                HashSet hashSet = new HashSet();
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    C90421b bVar = (C90421b) list.get(size);
                    if (!hashSet.contains(bVar.mo84145c())) {
                        hashSet.add(bVar.mo84145c());
                    } else if (asVar.mo89547k(bVar)) {
                        bVar.f252596q = true;
                    }
                    if (bVar.f252596q && !asVar.mo89548l(bVar)) {
                        list.remove(size);
                        asVar.f267533d.mo89588k(bVar);
                        size--;
                    }
                }
            }
        }
        C95599at atVar = asVar.f267538i;
        if (atVar != null) {
            ((C95618n) atVar).f267607a.mo89662d();
        }
    }
}
