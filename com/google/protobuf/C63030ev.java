package com.google.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.ev */
/* compiled from: PG */
final class C63030ev extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C63031ew f170132a;

    public C63030ev(C63031ew ewVar) {
        this.f170132a = ewVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f170132a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f170132a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f170132a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public final Iterator iterator() {
        return new C63029eu(this.f170132a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f170132a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f170132a.size();
    }
}
