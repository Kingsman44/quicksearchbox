package com.google.android.apps.search.googleapp.search.voicesearch;

import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.common.p4552o.C60444qg;
import com.google.common.p4552o.C60445qh;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.a */
/* compiled from: PG */
final class C138686a {
    /* renamed from: a */
    public static C28353e m225249a(String str) {
        C62940bt btVar = C138714b.f377284a;
        C60444qg qgVar = (C60444qg) C60445qh.f163576c.createBuilder();
        qgVar.copyOnWrite();
        C60445qh qhVar = (C60445qh) qgVar.instance;
        qhVar.f163578a |= 1;
        qhVar.f163579b = str;
        return new C28353e(btVar, (C60445qh) qgVar.build());
    }
}
