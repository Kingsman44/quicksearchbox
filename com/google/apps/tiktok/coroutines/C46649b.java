package com.google.apps.tiktok.coroutines;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.b */
/* compiled from: PG */
public final class C46649b extends C46650c {

    /* renamed from: a */
    private final Object f121903a;

    public C46649b(Object obj) {
        this.f121903a = obj;
    }

    /* renamed from: a */
    public final Object mo50592a() {
        return this.f121903a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46649b) && C69664n.m101066l(this.f121903a, ((C46649b) obj).f121903a);
    }

    public final int hashCode() {
        Object obj = this.f121903a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f121903a;
        return "Success(value=" + obj + ")";
    }
}
