package com.google.p4583d.p4584a.p4587c;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.d.a.c.b */
/* compiled from: PG */
public final class C60971b {

    /* renamed from: a */
    public String f165091a;

    /* renamed from: b */
    public final long f165092b;

    /* renamed from: c */
    public final Map f165093c;

    public C60971b(String str, long j, Map map) {
        this.f165091a = str;
        this.f165092b = j;
        HashMap hashMap = new HashMap();
        this.f165093c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final C60971b clone() {
        return new C60971b(this.f165091a, this.f165092b, new HashMap(this.f165093c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60971b)) {
            return false;
        }
        C60971b bVar = (C60971b) obj;
        if (this.f165092b == bVar.f165092b && this.f165091a.equals(bVar.f165091a)) {
            return this.f165093c.equals(bVar.f165093c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f165091a.hashCode();
        long j = this.f165092b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f165093c.hashCode();
    }

    public final String toString() {
        String str = this.f165091a;
        long j = this.f165092b;
        String obj = this.f165093c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
