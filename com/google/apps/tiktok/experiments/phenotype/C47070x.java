package com.google.apps.tiktok.experiments.phenotype;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.x */
/* compiled from: PG */
final class C47070x {

    /* renamed from: a */
    public final String f122661a;

    /* renamed from: b */
    public final String f122662b;

    public C47070x(String str, String str2) {
        C69664n.m101061g(str, "packageName");
        C69664n.m101061g(str2, "flagName");
        this.f122661a = str;
        this.f122662b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47070x)) {
            return false;
        }
        C47070x xVar = (C47070x) obj;
        return C69664n.m101066l(this.f122661a, xVar.f122661a) && C69664n.m101066l(this.f122662b, xVar.f122662b);
    }

    public final int hashCode() {
        return (this.f122661a.hashCode() * 31) + this.f122662b.hashCode();
    }

    public final String toString() {
        String str = this.f122661a;
        String str2 = this.f122662b;
        return "PackageAndFlagName(packageName=" + str + ", flagName=" + str2 + ")";
    }
}
