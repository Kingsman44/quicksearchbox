package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.aj */
/* compiled from: PG */
public final class C46601aj extends C46605an {

    /* renamed from: a */
    public final Object f121790a;

    public C46601aj(Object obj) {
        this.f121790a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46601aj) && C69664n.m101066l(this.f121790a, ((C46601aj) obj).f121790a);
    }

    public final int hashCode() {
        Object obj = this.f121790a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f121790a;
        return "Read(response=" + obj + ")";
    }
}
