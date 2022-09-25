package com.google.common.p4522b;

import java.util.Map;

/* renamed from: com.google.common.b.mh */
/* compiled from: PG */
final class C58634mh extends C58312aj {

    /* renamed from: a */
    final Object f156348a;

    /* renamed from: b */
    Object f156349b;

    /* renamed from: c */
    final /* synthetic */ C58635mi f156350c;

    public C58634mh(C58635mi miVar, Object obj, Object obj2) {
        this.f156350c = miVar;
        this.f156348a = obj;
        this.f156349b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f156348a.equals(entry.getKey()) || !this.f156349b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Object getKey() {
        return this.f156348a;
    }

    public final Object getValue() {
        return this.f156349b;
    }

    public final int hashCode() {
        return this.f156348a.hashCode() ^ this.f156349b.hashCode();
    }

    public final Object setValue(Object obj) {
        Object put = this.f156350c.put(this.f156348a, obj);
        this.f156349b = obj;
        return put;
    }
}
