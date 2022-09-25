package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.o */
/* compiled from: PG */
public final class C138264o extends C62934bn implements C63001dt {
    public C138264o() {
        super(C138317r.f376326j);
    }

    /* renamed from: a */
    public final void mo114221a(int i) {
        copyOnWrite();
        C138317r rVar = (C138317r) this.instance;
        C138317r rVar2 = C138317r.f376326j;
        C62995dn dnVar = rVar.f376336i;
        if (!dnVar.f170058b) {
            rVar.f376336i = dnVar.mo58980a();
        }
        rVar.f376336i.put(Integer.valueOf(i), true);
    }
}
