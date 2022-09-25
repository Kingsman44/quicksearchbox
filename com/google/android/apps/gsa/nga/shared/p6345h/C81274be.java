package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.be */
/* compiled from: PG */
public final class C81274be extends C62934bn implements C63001dt {
    public C81274be() {
        super(C81277bh.f222481m);
    }

    /* renamed from: a */
    public final C81250ao mo74979a(String str, C81250ao aoVar) {
        str.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((C81277bh) this.instance).f222494l);
        return unmodifiableMap.containsKey(str) ? (C81250ao) unmodifiableMap.get(str) : aoVar;
    }

    /* renamed from: b */
    public final void mo74980b(String str, C81250ao aoVar) {
        str.getClass();
        aoVar.getClass();
        copyOnWrite();
        C81277bh bhVar = (C81277bh) this.instance;
        C81277bh bhVar2 = C81277bh.f222481m;
        C62995dn dnVar = bhVar.f222494l;
        if (!dnVar.f170058b) {
            bhVar.f222494l = dnVar.mo58980a();
        }
        bhVar.f222494l.put(str, aoVar);
    }
}
