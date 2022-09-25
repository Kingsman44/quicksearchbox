package com.google.apps.tiktok.coroutines.p3632a;

import com.google.apps.tiktok.coroutines.C46650c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.ae */
/* compiled from: PG */
public final class C46596ae extends C46598ag {

    /* renamed from: a */
    public final C46650c f121786a;

    public C46596ae(C46650c cVar) {
        this.f121786a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46596ae) && C69664n.m101066l(this.f121786a, ((C46596ae) obj).f121786a);
    }

    public final int hashCode() {
        return this.f121786a.hashCode();
    }

    public final String toString() {
        C46650c cVar = this.f121786a;
        return "Complete(outcome=" + cVar + ")";
    }
}
