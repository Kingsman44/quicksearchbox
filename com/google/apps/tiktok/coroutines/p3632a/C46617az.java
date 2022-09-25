package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.az */
/* compiled from: PG */
public final class C46617az extends C46623be {

    /* renamed from: a */
    public final Object f121814a;

    public C46617az(Object obj) {
        this.f121814a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46617az) && C69664n.m101066l(this.f121814a, ((C46617az) obj).f121814a);
    }

    public final int hashCode() {
        Object obj = this.f121814a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f121814a;
        return "Read(response=" + obj + ")";
    }
}
