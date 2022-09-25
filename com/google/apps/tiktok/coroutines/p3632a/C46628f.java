package com.google.apps.tiktok.coroutines.p3632a;

import com.google.apps.tiktok.coroutines.C46650c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.f */
/* compiled from: PG */
public final class C46628f extends C46631i {

    /* renamed from: a */
    public final C46650c f121832a;

    public C46628f(C46650c cVar) {
        this.f121832a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46628f) && C69664n.m101066l(this.f121832a, ((C46628f) obj).f121832a);
    }

    public final int hashCode() {
        return this.f121832a.hashCode();
    }

    public final String toString() {
        C46650c cVar = this.f121832a;
        return "Complete(outcome=" + cVar + ")";
    }
}
