package com.google.android.libraries.home.p1940a.p1943c;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.d */
/* compiled from: PG */
public final class C23526d {

    /* renamed from: a */
    public final Object f64279a;

    public C23526d() {
        this.f64279a = null;
    }

    public C23526d(Object obj) {
        this.f64279a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23526d) && C69664n.m101066l(this.f64279a, ((C23526d) obj).f64279a);
    }

    public final int hashCode() {
        Object obj = this.f64279a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f64279a;
        return "HomeAutomationAttributeValue(value=" + obj + ")";
    }
}
