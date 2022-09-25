package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.hh */
/* compiled from: PG */
final class C58499hh extends C58548jc {

    /* renamed from: a */
    private final C58495hd f156134a;

    public C58499hh(C58495hd hdVar) {
        this.f156134a = hdVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    /* renamed from: b */
    public final Object mo55447b(int i) {
        return ((Map.Entry) this.f156134a.entrySet().mo55229u().get(i)).getKey();
    }

    public final boolean contains(Object obj) {
        return this.f156134a.containsKey(obj);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f156134a.mo55388lB();
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return this.f156134a.mo55388lB();
    }

    public final int size() {
        return this.f156134a.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58498hg(this.f156134a);
    }
}
