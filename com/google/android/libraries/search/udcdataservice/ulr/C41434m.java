package com.google.android.libraries.search.udcdataservice.ulr;

import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41388d;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.udcdataservice.ulr.m */
/* compiled from: PG */
public final /* synthetic */ class C41434m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C41438q f108217a;

    public /* synthetic */ C41434m(C41438q qVar) {
        this.f108217a = qVar;
    }

    public final Object apply(Object obj) {
        C41438q qVar = this.f108217a;
        C41441t tVar = (C41441t) obj;
        if ((tVar.f108231a & 1) != 0) {
            C41389e eVar = tVar.f108232b;
            if (eVar == null) {
                return C41389e.f108143e;
            }
            return eVar;
        }
        ((C19567d) qVar.f108227g.f103002da.mo6453a()).mo24822a(1, new Object[0]);
        C41388d dVar = (C41388d) C41389e.f108143e.createBuilder();
        C41387c cVar = C41387c.LOCATION_HISTORY_AND_REPORTING;
        dVar.copyOnWrite();
        C41389e eVar2 = (C41389e) dVar.instance;
        eVar2.f108146b = cVar.f108142h;
        eVar2.f108145a |= 1;
        dVar.copyOnWrite();
        C41389e eVar3 = (C41389e) dVar.instance;
        eVar3.f108147c = 0;
        eVar3.f108145a |= 2;
        dVar.copyOnWrite();
        C41389e eVar4 = (C41389e) dVar.instance;
        eVar4.f108148d = 0;
        eVar4.f108145a |= 4;
        return (C41389e) dVar.build();
    }
}
