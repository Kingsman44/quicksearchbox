package com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b;

import com.google.android.libraries.storage.p3315b.C42838ax;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Iterator;
import p5462h.C69788q;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.b.c */
/* compiled from: PG */
public final class C133955c implements C42844bc {

    /* renamed from: a */
    final /* synthetic */ List f364870a;

    public C133955c(List list) {
        this.f364870a = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45922a(C42847bf bfVar) {
        C42838ax axVar = new C42838ax("action_table");
        axVar.f112125a.append("id IN(?");
        Iterator it = this.f364870a.iterator();
        axVar.f112126b.add(String.valueOf(((Number) it.next()).intValue()));
        Iterator.EL.forEachRemaining(it, new C133954b(axVar));
        axVar.f112125a.append(")");
        bfVar.mo45929a(axVar.mo45919a());
        return C69788q.f186170a;
    }
}
