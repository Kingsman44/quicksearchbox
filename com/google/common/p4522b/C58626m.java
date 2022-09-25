package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.m */
/* compiled from: PG */
final class C58626m extends C58649mw {

    /* renamed from: a */
    final /* synthetic */ C58680o f156341a;

    public C58626m(C58680o oVar) {
        this.f156341a = oVar;
    }

    /* renamed from: a */
    public final Map mo55683a() {
        return this.f156341a;
    }

    public final boolean contains(Object obj) {
        return C58374cr.m89412d(this.f156341a.f156406a.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new C58653n(this.f156341a);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        C58307ae aeVar = this.f156341a.f156407b;
        Collection collection = (Collection) C58662ni.m90349h(aeVar.f155873a, ((Map.Entry) Objects.requireNonNull((Map.Entry) obj)).getKey());
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        aeVar.f155874b -= size;
        return true;
    }
}
