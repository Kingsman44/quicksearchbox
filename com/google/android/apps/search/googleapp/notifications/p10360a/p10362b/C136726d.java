package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import com.google.android.libraries.storage.p3315b.C42838ax;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.d */
/* compiled from: PG */
public final class C136726d implements C42844bc {

    /* renamed from: a */
    final /* synthetic */ C58485gu f372177a;

    public C136726d(C58485gu guVar) {
        this.f372177a = guVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45922a(C42847bf bfVar) {
        C42838ax axVar = new C42838ax("actions");
        axVar.f112125a.append("_id IN (");
        C58801sm G = this.f372177a.listIterator(0);
        C69664n.m101060f(G, "idList.iterator()");
        while (G.hasNext()) {
            Long l = (Long) G.next();
            if (G.hasNext()) {
                axVar.f112125a.append("?, ");
                axVar.f112126b.add(String.valueOf(l));
            } else {
                axVar.f112125a.append("?");
                axVar.f112126b.add(String.valueOf(l));
            }
        }
        axVar.f112125a.append(")");
        return Integer.valueOf(bfVar.mo45929a(axVar.mo45919a()));
    }
}
