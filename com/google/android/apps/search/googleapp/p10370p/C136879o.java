package com.google.android.apps.search.googleapp.p10370p;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.p.o */
/* compiled from: PG */
public final class C136879o extends C62934bn implements C63001dt {
    public C136879o() {
        super(C136881q.f372552c);
    }

    /* renamed from: a */
    public final C136875k mo113420a(int i, C136875k kVar) {
        Map unmodifiableMap = Collections.unmodifiableMap(((C136881q) this.instance).f372554a);
        Integer valueOf = Integer.valueOf(i);
        return unmodifiableMap.containsKey(valueOf) ? (C136875k) unmodifiableMap.get(valueOf) : kVar;
    }

    /* renamed from: b */
    public final void mo113421b(int i, C136875k kVar) {
        kVar.getClass();
        copyOnWrite();
        C136881q qVar = (C136881q) this.instance;
        C136881q qVar2 = C136881q.f372552c;
        C62995dn dnVar = qVar.f372554a;
        if (!dnVar.f170058b) {
            qVar.f372554a = dnVar.mo58980a();
        }
        qVar.f372554a.put(Integer.valueOf(i), kVar);
    }
}
