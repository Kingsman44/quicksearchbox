package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.android.libraries.storage.p3315b.C42838ax;
import com.google.android.libraries.storage.p3315b.C42847bf;
import p5462h.C69788q;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.ao */
/* compiled from: PG */
final class C135143ao implements C135202v {

    /* renamed from: a */
    final /* synthetic */ C135157bb f368096a;

    public C135143ao(C135157bb bbVar) {
        this.f368096a = bbVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo112131a(C135205y yVar) {
        C134755f fVar = this.f368096a.f368141g;
        C42847bf bfVar = yVar.f368296a;
        C42838ax axVar = new C42838ax("feed_table");
        axVar.f112125a.append("feed_id = ?");
        axVar.f112126b.add(fVar.f366925c);
        bfVar.mo45929a(axVar.mo45919a());
        return C69788q.f186170a;
    }
}
