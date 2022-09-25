package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.ak */
/* compiled from: PG */
public final class C46602ak extends C46605an {

    /* renamed from: a */
    public final C46607ap f121791a;

    public C46602ak(C46607ap apVar) {
        this.f121791a = apVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46602ak) && C69664n.m101066l(this.f121791a, ((C46602ak) obj).f121791a);
    }

    public final int hashCode() {
        C46607ap apVar = this.f121791a;
        if (apVar == null) {
            return 0;
        }
        return apVar.hashCode();
    }

    public final String toString() {
        C46607ap apVar = this.f121791a;
        return "Reading(cause=" + apVar + ")";
    }
}
