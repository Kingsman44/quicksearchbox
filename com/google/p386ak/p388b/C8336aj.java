package com.google.p386ak.p388b;

import java.util.Map;

/* renamed from: com.google.ak.b.aj */
/* compiled from: PG */
public final class C8336aj implements Map.Entry {

    /* renamed from: a */
    C8336aj f29152a;

    /* renamed from: b */
    C8336aj f29153b;

    /* renamed from: c */
    C8336aj f29154c;

    /* renamed from: d */
    C8336aj f29155d;

    /* renamed from: e */
    C8336aj f29156e;

    /* renamed from: f */
    public final Object f29157f;

    /* renamed from: g */
    final boolean f29158g;

    /* renamed from: h */
    public Object f29159h;

    /* renamed from: i */
    int f29160i;

    public C8336aj(boolean z) {
        this.f29157f = null;
        this.f29158g = z;
        this.f29156e = this;
        this.f29155d = this;
    }

    public C8336aj(boolean z, C8336aj ajVar, Object obj, C8336aj ajVar2, C8336aj ajVar3) {
        this.f29152a = ajVar;
        this.f29157f = obj;
        this.f29158g = z;
        this.f29160i = 1;
        this.f29155d = ajVar2;
        this.f29156e = ajVar3;
        ajVar3.f29155d = this;
        ajVar2.f29156e = this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f29157f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f29159h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (!obj3.equals(entry.getValue())) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final Object getKey() {
        return this.f29157f;
    }

    public final Object getValue() {
        return this.f29159h;
    }

    public final Object setValue(Object obj) {
        if (obj != null || this.f29158g) {
            Object obj2 = this.f29159h;
            this.f29159h = obj;
            return obj2;
        }
        throw new NullPointerException("value == null");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f29157f);
        String valueOf2 = String.valueOf(this.f29159h);
        return valueOf + "=" + valueOf2;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f29157f;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        Object obj2 = this.f29159h;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i ^ i2;
    }
}
