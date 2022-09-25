package com.google.android.apps.gsa.shared.search;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.search.p7138b.C90487c;
import com.google.android.apps.gsa.shared.search.p7138b.C90488d;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.shared.search.h */
/* compiled from: PG */
public final class C90500h {
    /* renamed from: a */
    public static final C90488d m147585a(Query query) {
        String bn = query.mo84355bn();
        C90487c cVar = (C90487c) C90488d.f252873g.createBuilder();
        C63088z m = C90772bp.m148305m(query);
        cVar.copyOnWrite();
        C90488d dVar = (C90488d) cVar.instance;
        m.getClass();
        dVar.f252875a |= 1;
        dVar.f252876b = m;
        String obj = query.f252768g.toString();
        cVar.copyOnWrite();
        C90488d dVar2 = (C90488d) cVar.instance;
        obj.getClass();
        dVar2.f252875a |= 2;
        dVar2.f252877c = obj;
        if (bn == null) {
            bn = BuildConfig.FLAVOR;
        }
        cVar.copyOnWrite();
        C90488d dVar3 = (C90488d) cVar.instance;
        dVar3.f252875a |= 4;
        dVar3.f252878d = bn;
        return (C90488d) cVar.build();
    }

    /* renamed from: b */
    public static final Query m147586b(C90488d dVar, int i) {
        if (i == 1 && !dVar.f252876b.mo59173M()) {
            Query query = (Query) C90772bp.m148301i(dVar.f252876b, Query.CREATOR);
            query.getClass();
            return query.mo84258U();
        } else if ((dVar.f252875a & 2) != 0) {
            return Query.f252741b.mo84268aE(dVar.f252877c, false).mo84275aL(dVar.f252878d).mo84493u().mo84258U();
        } else {
            return Query.f252741b.mo84259V().mo84493u().mo84262Z();
        }
    }
}
