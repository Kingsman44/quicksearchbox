package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90433n;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95651ae;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95674w;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95695a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95696b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95698d;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.am */
/* compiled from: PG */
public final /* synthetic */ class C95592am implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95598as f267517a;

    /* renamed from: b */
    public final /* synthetic */ Set f267518b;

    public /* synthetic */ C95592am(C95598as asVar, Set set) {
        this.f267517a = asVar;
        this.f267518b = set;
    }

    public final void run() {
        Iterator it;
        Set set;
        ArrayList arrayList;
        ArrayList arrayList2;
        C90421b bVar;
        Long l;
        C90433n nVar;
        C95598as asVar = this.f267517a;
        Set set2 = this.f267518b;
        Iterator it2 = asVar.f267537h.values().iterator();
        long b = asVar.f267535f.mo26870b() - C95598as.f267530b;
        while (it2.hasNext()) {
            Long l2 = (Long) it2.next();
            if (l2 == null || l2.longValue() < b) {
                it2.remove();
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        Iterator it3 = asVar.f267532c.entrySet().iterator();
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        while (it3.hasNext()) {
            C95596aq aqVar = (C95596aq) ((Map.Entry) it3.next()).getValue();
            String str = aqVar.f267523a;
            if (str == null) {
                int size = aqVar.f267524b.size();
                ArrayList arrayList4 = new ArrayList();
                for (C90421b bVar2 : aqVar.f267524b) {
                    if (set2.contains(bVar2.mo84145c()) && !asVar.mo89549m(bVar2.mo84131b(), bVar2.f252592m)) {
                        bVar2.f252596q = true;
                        boolean l3 = asVar.mo89548l(bVar2);
                        boolean a = C95624t.m158316a(bVar2, size - arrayList4.size() == 1);
                        if (!l3) {
                            if (a) {
                                arrayList4.add(bVar2);
                            } else {
                                a = false;
                            }
                        }
                        if (l3 && a) {
                            z = true;
                        }
                    }
                }
                aqVar.f267524b.removeAll(arrayList4);
                if (aqVar.f267524b.isEmpty()) {
                    it3.remove();
                } else {
                    int size2 = arrayList4.size();
                    int i = 0;
                    while (i < size2) {
                        C90421b bVar3 = (C90421b) arrayList4.get(i);
                        C95599at atVar = asVar.f267538i;
                        if (atVar != null) {
                            List<C90421b> list = aqVar.f267524b;
                            C95706l lVar = ((C95618n) atVar).f267607a;
                            C90427h b2 = bVar3.mo84131b();
                            synchronized (lVar.f267946d) {
                                C95696b b3 = lVar.mo89660b(b2);
                                long a2 = bVar3.mo84144a();
                                it = it3;
                                if (b3.f267920b == 2 && (l = b3.f267922d) != null && a2 == l.longValue()) {
                                    b3.mo89650a(1, (Long) null);
                                    C90421b bVar4 = null;
                                    for (C90421b bVar5 : list) {
                                        Set set3 = set2;
                                        long j = bVar5.f252593n;
                                        ArrayList arrayList5 = arrayList3;
                                        if (j > bVar3.f252593n && (bVar4 == null || j < bVar4.f252593n)) {
                                            bVar4 = bVar5;
                                        }
                                        set2 = set3;
                                        arrayList3 = arrayList5;
                                    }
                                    set = set2;
                                    arrayList2 = arrayList3;
                                    if (!(bVar4 == null || (nVar = bVar4.f252594o) == null || nVar.mo84169d())) {
                                        int i2 = ((C95695a) lVar.mo89665g(bVar4)).f267916a;
                                        if (C90433n.m147107h(i2)) {
                                            if (nVar.mo84174j(i2)) {
                                                lVar.f267948f.mo89592o(new C95698d(lVar, nVar));
                                            }
                                            bVar = bVar4;
                                        }
                                    }
                                } else {
                                    set = set2;
                                    arrayList2 = arrayList3;
                                }
                                bVar = null;
                            }
                            arrayList = arrayList2;
                            if (bVar != null) {
                                arrayList.add(bVar);
                            }
                        } else {
                            set = set2;
                            it = it3;
                            arrayList = arrayList3;
                        }
                        asVar.f267533d.mo89588k(bVar3);
                        i++;
                        arrayList3 = arrayList;
                        set2 = set;
                        it3 = it;
                    }
                }
                arrayList3 = arrayList3;
                set2 = set2;
                it3 = it3;
            } else if (set2.contains(str)) {
                int size3 = aqVar.f267524b.size();
                ArrayList arrayList6 = new ArrayList();
                for (C90421b bVar6 : aqVar.f267524b) {
                    if (!asVar.mo89549m(bVar6.mo84131b(), bVar6.f252592m)) {
                        bVar6.f252596q = true;
                        boolean l4 = asVar.mo89548l(bVar6);
                        boolean a3 = C95624t.m158316a(bVar6, size3 - arrayList6.size() == 1);
                        if (!l4 && a3) {
                            asVar.f267533d.mo89588k(bVar6);
                            arrayList6.add(bVar6);
                        } else if (l4 && a3) {
                            z = true;
                        }
                    }
                }
                aqVar.f267524b.removeAll(arrayList6);
                if (aqVar.f267524b.isEmpty()) {
                    it3.remove();
                }
            }
        }
        Set set4 = set2;
        ArrayList arrayList7 = arrayList3;
        synchronized (asVar.f267532c) {
            C95599at atVar2 = asVar.f267538i;
            if (atVar2 != null) {
                C95627w wVar = ((C95618n) atVar2).f267611e;
                if (wVar != null) {
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                        wVar.mo89581a(arrayList7);
                    }
                    if (!((C95651ae) wVar).f267720k.get()) {
                        ((C95651ae) wVar).f267711b.mo28212l("remove", new C95674w((C95651ae) wVar, set4));
                    }
                }
            }
        }
        if (z) {
            asVar.f267536g.mo89577c(asVar, TimeUnit.SECONDS.toMillis(asVar.f267534e.mo83546a("recent_notifs_period_sec")));
        }
    }
}
