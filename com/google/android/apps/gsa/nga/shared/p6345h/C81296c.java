package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.c */
/* compiled from: PG */
public final class C81296c extends C62934bn implements C63001dt {
    public C81296c() {
        super(C81309e.f222570b);
    }

    /* renamed from: a */
    public final void mo74986a(String str, int i) {
        str.getClass();
        copyOnWrite();
        C81309e eVar = (C81309e) this.instance;
        C81309e eVar2 = C81309e.f222570b;
        C62995dn dnVar = eVar.f222572a;
        if (!dnVar.f170058b) {
            eVar.f222572a = dnVar.mo58980a();
        }
        eVar.f222572a.put(str, Integer.valueOf(i));
    }
}
