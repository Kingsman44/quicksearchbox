package com.google.protobuf;

import java.util.Map;

/* renamed from: com.google.protobuf.et */
/* compiled from: PG */
final class C63028et implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f170125a;

    /* renamed from: b */
    public Object f170126b;

    /* renamed from: c */
    final /* synthetic */ C63031ew f170127c;

    public C63028et(C63031ew ewVar, Comparable comparable, Object obj) {
        this.f170127c = ewVar;
        this.f170125a = comparable;
        this.f170126b = obj;
    }

    /* renamed from: a */
    private static final boolean m95849a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f170125a.compareTo(((C63028et) obj).f170125a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m95849a(this.f170125a, entry.getKey()) && m95849a(this.f170126b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f170125a;
    }

    public final Object getValue() {
        return this.f170126b;
    }

    public final int hashCode() {
        Comparable comparable = this.f170125a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f170126b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f170127c.mo59073f();
        Object obj2 = this.f170126b;
        this.f170126b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f170125a);
        String valueOf2 = String.valueOf(this.f170126b);
        return valueOf + "=" + valueOf2;
    }
}
