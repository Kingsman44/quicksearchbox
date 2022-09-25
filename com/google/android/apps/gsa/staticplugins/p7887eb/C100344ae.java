package com.google.android.apps.gsa.staticplugins.p7887eb;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.base.C58817ah;
import com.google.common.p4575r.C60757n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5451f.p5452a.p5453a.p5454a.C69402ax;
import p5451f.p5452a.p5453a.p5454a.C69404az;
import p5451f.p5452a.p5453a.p5454a.C69431bz;
import p5451f.p5452a.p5453a.p5454a.C69434cb;
import p5451f.p5452a.p5453a.p5454a.C69436cd;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.ae */
/* compiled from: PG */
public final /* synthetic */ class C100344ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C100353an f280603a;

    /* renamed from: b */
    public final /* synthetic */ List f280604b;

    /* renamed from: c */
    public final /* synthetic */ C69402ax f280605c;

    public /* synthetic */ C100344ae(C100353an anVar, List list, C69402ax axVar) {
        this.f280603a = anVar;
        this.f280604b = list;
        this.f280605c = axVar;
    }

    public final Object apply(Object obj) {
        C69436cd cdVar;
        C69431bz bzVar;
        C100353an anVar = this.f280603a;
        List<Integer> list = this.f280604b;
        C69402ax axVar = this.f280605c;
        List list2 = (List) Collection.EL.stream(((Map) obj).entrySet()).filter(C100380z.f280675a).map(C100341ab.f280598a).collect(Collectors.toList());
        list.removeAll(list2);
        for (Integer intValue : list) {
            int intValue2 = intValue.intValue();
            anVar.f280616c.mo91906o(intValue2);
            anVar.mo91895p(C89849ae.TIPMANAGER_TIP_OLD_TIP_TEARDOWN, intValue2);
        }
        C86337q b = anVar.f280616c.f280644b.mo80076b();
        b.mo80071f("setup_tips", C60757n.m92752m(list2));
        b.apply();
        C100358d dVar = anVar.f280616c;
        C86337q b2 = dVar.f280644b.mo80076b();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(dVar.f280644b.mo79999a("interval_time_for_tip_type_").keySet());
        hashSet.addAll(dVar.f280644b.mo79999a("interval_time_for_tab_type_").keySet());
        hashSet.addAll(dVar.f280644b.mo79999a("maximum_count_for_tip_type_").keySet());
        Iterator it = axVar.f185704a.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                C69434cb cbVar = (C69434cb) it.next();
                int i2 = cbVar.f185795b;
                if (i2 == 0) {
                    i = 3;
                } else if (i2 == 1) {
                    i = 1;
                } else if (i2 == 3) {
                    i = 2;
                }
                int i3 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i3 == 0) {
                    if (i2 == 1) {
                        cdVar = C69436cd.m100758a(((Integer) cbVar.f185796c).intValue());
                        if (cdVar == null) {
                            cdVar = C69436cd.UNKNOWN;
                        }
                    } else {
                        cdVar = C69436cd.UNKNOWN;
                    }
                    if (!(cdVar == C69436cd.UNKNOWN || (cbVar.f185794a & 4) == 0)) {
                        String j = C100358d.m166373j("interval_time_for_tip_type_", cdVar.f185809j);
                        String j2 = C100358d.m166373j("last_tip_seen_time_for_tip_type_", cdVar.f185809j);
                        b2.mo80072g(j, cbVar.f185797d);
                        hashSet.remove(j);
                        if (!dVar.f280644b.contains(j2)) {
                            b2.mo80072g(j2, 0);
                        }
                    }
                } else if (i3 == 1) {
                    if (i2 == 3) {
                        bzVar = C69431bz.m100756a(((Integer) cbVar.f185796c).intValue());
                        if (bzVar == null) {
                            bzVar = C69431bz.UNKNOWN_TAB;
                        }
                    } else {
                        bzVar = C69431bz.UNKNOWN_TAB;
                    }
                    if (!(bzVar == C69431bz.UNKNOWN_TAB || (cbVar.f185794a & 4) == 0)) {
                        String j3 = C100358d.m166373j("interval_time_for_tab_type_", bzVar.f185791j);
                        String j4 = C100358d.m166373j("last_tip_seen_time_for_tab_type_", bzVar.f185791j);
                        b2.mo80072g(j3, cbVar.f185797d);
                        hashSet.remove(j3);
                        if (!dVar.f280644b.contains(j4)) {
                            b2.mo80072g(j4, 0);
                        }
                    }
                }
            } else {
                for (C69404az azVar : axVar.f185705b) {
                    C69436cd a = C69436cd.m100758a(azVar.f185709b);
                    if (a == null) {
                        a = C69436cd.UNKNOWN;
                    }
                    if (!(a == C69436cd.UNKNOWN || (azVar.f185708a & 2) == 0)) {
                        String j5 = C100358d.m166373j("maximum_count_for_tip_type_", a.f185809j);
                        String j6 = C100358d.m166373j("impression_count_for_tip_type_", a.f185809j);
                        b2.mo80070e(j5, azVar.f185710c);
                        hashSet.remove(j5);
                        if (!dVar.f280644b.contains(j6)) {
                            b2.mo80070e(j6, 0);
                        }
                    }
                }
                for (String j7 : hashSet) {
                    b2.mo80075j(j7);
                }
                b2.apply();
                anVar.f280617f.mo83702b(C89849ae.TIPMANAGER_SETUP_END);
                return C118826c.f331422a;
            }
        }
    }
}
