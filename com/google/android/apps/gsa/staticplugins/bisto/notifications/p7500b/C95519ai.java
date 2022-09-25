package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90425f;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95600au;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94644h;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ai */
/* compiled from: PG */
public final class C95519ai {

    /* renamed from: e */
    private static final C59071e f267289e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ai");

    /* renamed from: a */
    public final List f267290a;

    /* renamed from: b */
    public List f267291b = new ArrayList();

    /* renamed from: c */
    public boolean f267292c;

    /* renamed from: d */
    public int f267293d;

    /* renamed from: f */
    private final C95598as f267294f;

    /* renamed from: g */
    private final C95706l f267295g;

    /* renamed from: h */
    private final C95293ae f267296h;

    /* renamed from: i */
    private final boolean f267297i;

    /* renamed from: j */
    private final C95600au f267298j;

    /* renamed from: k */
    private final C68214a f267299k;

    /* renamed from: l */
    private final C68214a f267300l;

    /* renamed from: m */
    private final C89656k f267301m;

    /* renamed from: n */
    private final C95307m f267302n;

    /* renamed from: o */
    private final C21370a f267303o;

    public C95519ai(List list, boolean z, C95598as asVar, C95706l lVar, C95293ae aeVar, C95600au auVar, C68214a aVar, C68214a aVar2, C89656k kVar, C95307m mVar, C21370a aVar3) {
        this.f267290a = list;
        this.f267294f = asVar;
        this.f267295g = lVar;
        this.f267296h = aeVar;
        this.f267298j = auVar;
        this.f267297i = z;
        this.f267299k = aVar;
        this.f267300l = aVar2;
        this.f267301m = kVar;
        this.f267302n = mVar;
        this.f267303o = aVar3;
        mo89425b();
        C58976aa aaVar = C58975e.f156826a;
        this.f267291b.size();
    }

    /* renamed from: a */
    public static List m158013a(List list, C95598as asVar, C95706l lVar, C95293ae aeVar, C95600au auVar, C68214a aVar, C68214a aVar2, C89656k kVar, C95307m mVar, C21370a aVar3) {
        Iterator it;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C90421b bVar = (C90421b) it2.next();
            if (!hashMap.containsKey(bVar.mo84131b())) {
                hashMap.put(bVar.mo84131b(), new ArrayList());
            }
            ((List) hashMap.get(bVar.mo84131b())).add(bVar);
        }
        Set a = C94644h.m156132a(kVar);
        int a2 = (int) kVar.mo83546a("min_aggregate_size");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = hashMap.values().iterator();
        while (it3.hasNext()) {
            List<C90421b> list2 = (List) it3.next();
            if (((C90421b) list2.get(0)) instanceof MessageNotification) {
                ArrayList arrayList4 = new ArrayList(list2.size());
                for (C90421b bVar2 : list2) {
                    arrayList4.add((MessageNotification) bVar2);
                }
                if (((MessageNotification) arrayList4.get(0)).mo84134g()) {
                    C58976aa aaVar = C58975e.f156826a;
                    arrayList4.size();
                    it = it3;
                    C95541p pVar = r3;
                    arrayList = arrayList3;
                    C95541p pVar2 = new C95541p(arrayList4, asVar, lVar, aeVar, auVar, aVar, aVar2, kVar, mVar, aVar3);
                    arrayList2.add(pVar);
                } else {
                    it = it3;
                    arrayList = arrayList3;
                    C58976aa aaVar2 = C58975e.f156826a;
                    arrayList4.size();
                    arrayList2.add(new C95551z(arrayList4, asVar, lVar, aeVar, auVar, aVar, aVar2, kVar, mVar, aVar3));
                }
            } else {
                it = it3;
                arrayList = arrayList3;
                if (list2.size() < a2 || a.contains(((C90421b) list2.get(0)).f252591l)) {
                    for (C90421b bVar3 : list2) {
                        if (bVar3 instanceof C90425f) {
                            arrayList.add((C90425f) bVar3);
                        } else {
                            C58976aa aaVar3 = C58975e.f156826a;
                            arrayList2.add(new C95522al((StandardNotification) bVar3, lVar, aeVar, mVar, aVar3));
                        }
                    }
                } else {
                    C58976aa aaVar4 = C58975e.f156826a;
                    list2.size();
                    arrayList2.add(new C95528c(list2, asVar, lVar, mVar, aVar3));
                }
            }
            it3 = it;
            arrayList3 = arrayList;
            C89656k kVar2 = kVar;
        }
        ArrayList arrayList5 = arrayList3;
        if (!arrayList5.isEmpty()) {
            C58976aa aaVar5 = C58975e.f156826a;
            arrayList5.size();
            arrayList2.add(new C95537l(arrayList5, lVar, kVar, mVar, aVar3));
        }
        Collections.sort(arrayList2, new C95518ah());
        return arrayList2;
    }

    /* renamed from: b */
    public final void mo89425b() {
        if (this.f267292c) {
            C59104x d = f267289e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "QueueBuilder");
            ((C59052c) ((C59052c) d).mo56372aa(16130)).mo56386p("Can't re-bundle after starting.");
            int i = C90755l.f253831a;
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f267290a.size();
        List a = m158013a(this.f267290a, this.f267294f, this.f267295g, this.f267296h, this.f267298j, this.f267299k, this.f267300l, this.f267301m, this.f267302n, this.f267303o);
        this.f267291b = a;
        if (this.f267297i && a.size() >= 2) {
            List list = this.f267291b;
            list.add(0, new C95533h(new ArrayList(list), this.f267295g, this.f267302n, this.f267303o));
        }
    }

    /* renamed from: c */
    public final boolean mo89426c() {
        return this.f267293d < this.f267291b.size();
    }
}
