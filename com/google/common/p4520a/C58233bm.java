package com.google.common.p4520a;

import java.util.Map;

/* renamed from: com.google.common.a.bm */
/* compiled from: PG */
final class C58233bm implements Map.Entry {

    /* renamed from: a */
    final Object f155728a;

    /* renamed from: b */
    Object f155729b;

    /* renamed from: c */
    final /* synthetic */ C58234bn f155730c;

    public C58233bm(C58234bn bnVar, Object obj, Object obj2) {
        this.f155730c = bnVar;
        this.f155728a = obj;
        this.f155729b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f155728a.equals(entry.getKey()) || !this.f155729b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Object getKey() {
        return this.f155728a;
    }

    public final Object getValue() {
        return this.f155729b;
    }

    public final int hashCode() {
        return this.f155728a.hashCode() ^ this.f155729b.hashCode();
    }

    public final Object setValue(Object obj) {
        Object put = this.f155730c.put(this.f155728a, obj);
        this.f155729b = obj;
        return put;
    }

    public final String toString() {
        return this.f155728a + "=" + this.f155729b;
    }
}
