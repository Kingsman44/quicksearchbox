package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.ah */
/* compiled from: PG */
public final class C46599ah extends C46605an {

    /* renamed from: a */
    public final C46607ap f121788a;

    public C46599ah(C46607ap apVar) {
        this.f121788a = apVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46599ah) && C69664n.m101066l(this.f121788a, ((C46599ah) obj).f121788a);
    }

    public final int hashCode() {
        return this.f121788a.hashCode();
    }

    public final String toString() {
        C46607ap apVar = this.f121788a;
        return "Failed(cause=" + apVar + ")";
    }
}
