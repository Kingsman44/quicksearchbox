package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.il */
/* compiled from: PG */
final class C58530il extends C58528ij {

    /* renamed from: a */
    private final transient C58532in f156179a;

    public C58530il(C58532in inVar) {
        this.f156179a = inVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return false;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f156179a.mo54952E(entry.getKey(), entry.getValue());
    }

    public final /* synthetic */ Iterator iterator() {
        return new C58504hm(this.f156179a);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return new C58504hm(this.f156179a);
    }

    public final int size() {
        return this.f156179a.size;
    }
}
