package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aib */
/* compiled from: PG */
final class aib implements Map.Entry {

    /* renamed from: a */
    aib f20679a;

    /* renamed from: b */
    aib f20680b;

    /* renamed from: c */
    aib f20681c;

    /* renamed from: d */
    aib f20682d;

    /* renamed from: e */
    aib f20683e;

    /* renamed from: f */
    final Object f20684f;

    /* renamed from: g */
    Object f20685g;

    /* renamed from: h */
    int f20686h;

    public aib() {
        this.f20684f = null;
        this.f20683e = this;
        this.f20682d = this;
    }

    public aib(aib aib, Object obj, aib aib2, aib aib3) {
        this.f20679a = aib;
        this.f20684f = obj;
        this.f20686h = 1;
        this.f20682d = aib2;
        this.f20683e = aib3;
        aib3.f20682d = this;
        aib2.f20683e = this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f20684f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f20685g;
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
        return this.f20684f;
    }

    public final Object getValue() {
        return this.f20685g;
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.f20685g;
        this.f20685g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f20684f + "=" + this.f20685g;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f20684f;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        Object obj2 = this.f20685g;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i ^ i2;
    }
}
