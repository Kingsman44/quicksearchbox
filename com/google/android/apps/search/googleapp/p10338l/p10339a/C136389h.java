package com.google.android.apps.search.googleapp.p10338l.p10339a;

import com.google.android.apps.search.googleapp.p10338l.C136419m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.l.a.h */
/* compiled from: PG */
public final class C136389h {

    /* renamed from: a */
    public final CharSequence f371316a;

    /* renamed from: b */
    private final C136419m f371317b;

    public C136389h(C136419m mVar, CharSequence charSequence) {
        C69664n.m101061g(mVar, "highestLevel");
        C69664n.m101061g(charSequence, "content");
        this.f371317b = mVar;
        this.f371316a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136389h)) {
            return false;
        }
        C136389h hVar = (C136389h) obj;
        return this.f371317b == hVar.f371317b && C69664n.m101066l(this.f371316a, hVar.f371316a);
    }

    public final int hashCode() {
        return (this.f371317b.hashCode() * 31) + this.f371316a.hashCode();
    }

    public final String toString() {
        C136419m mVar = this.f371317b;
        CharSequence charSequence = this.f371316a;
        return "PrintOutput(highestLevel=" + mVar + ", content=" + charSequence + ")";
    }
}
