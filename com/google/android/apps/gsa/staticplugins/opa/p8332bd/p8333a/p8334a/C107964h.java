package com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a;

import android.content.ComponentName;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bd.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C107964h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ long f300402a;

    /* renamed from: b */
    public final /* synthetic */ List f300403b;

    public /* synthetic */ C107964h(long j, List list) {
        this.f300402a = j;
        this.f300403b = list;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        long j = this.f300402a;
        List list = this.f300403b;
        List list2 = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) != null && ((C58833ax) list2.get(i)).mo56113h()) {
                C123728av avVar = (C123728av) ((C58833ax) list2.get(i)).mo56107c();
                ((C59052c) ((C59052c) C107970n.f300422a.mo56224b()).mo56372aa(26918)).mo56361N("#getAvailableComponentNamesInCache() cutoffTimestamp %d last update time %d component %s %s size %d", Long.valueOf(j), Long.valueOf(avVar.f341759e), avVar.f341756b, avVar.f341757c, Integer.valueOf(avVar.f341758d.size()));
                if (avVar.f341759e >= j && i < list.size()) {
                    arrayList.add((ComponentName) list.get(i));
                }
            }
        }
        ((C59052c) ((C59052c) C107970n.f300422a.mo56224b()).mo56372aa(26917)).mo56389s("#getAvailableComponentNamesInCache() availableComponentNamesInCache %s", arrayList);
        return arrayList;
    }
}
