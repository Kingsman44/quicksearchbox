package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ak */
/* compiled from: PG */
public final /* synthetic */ class C95590ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95598as f267514a;

    /* renamed from: b */
    public final /* synthetic */ C58881cr f267515b;

    public /* synthetic */ C95590ak(C95598as asVar, C58881cr crVar) {
        this.f267514a = asVar;
        this.f267515b = crVar;
    }

    public final void run() {
        C95598as asVar = this.f267514a;
        C58881cr crVar = this.f267515b;
        C58976aa aaVar = C58975e.f156826a;
        List<C90421b> list = (List) crVar.mo6453a();
        C95599at atVar = asVar.f267538i;
        if (atVar != null) {
            ((C95618n) atVar).f267607a.f267950h = true;
        }
        HashSet hashSet = new HashSet();
        for (C90421b c : list) {
            hashSet.add(c.mo84145c());
        }
        HashMap hashMap = new HashMap();
        for (C90421b e : asVar.f267533d.mo89585f(asVar.f267535f)) {
            C95598as.m158262e(e, hashMap);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C95596aq aqVar = (C95596aq) entry.getValue();
            List<C90421b> list2 = aqVar.f267524b;
            if (list2.isEmpty() || !(((C90421b) list2.get(0)) instanceof MessageNotification)) {
                for (C90421b bVar : list2) {
                    if (hashSet.contains(bVar.mo84145c())) {
                        C95598as.m158262e(bVar, asVar.f267532c);
                    } else {
                        asVar.f267533d.mo89588k(bVar);
                    }
                }
            } else {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (hashSet.contains(((C90421b) it.next()).mo84145c())) {
                            asVar.f267532c.put((C90427h) entry.getKey(), aqVar);
                            break;
                        }
                    } else {
                        for (C90421b k : list2) {
                            asVar.f267533d.mo89588k(k);
                        }
                    }
                }
            }
        }
        asVar.mo89543g(list);
        C95599at atVar2 = asVar.f267538i;
        if (atVar2 != null) {
            ((C95618n) atVar2).f267607a.f267950h = false;
        }
    }
}
