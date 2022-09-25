package com.google.android.apps.search.assistant.libraries.p8975g;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.g.a */
/* compiled from: PG */
public final class C119385a {

    /* renamed from: a */
    public final String f332856a = "whole_home_native_feature_module";

    /* renamed from: b */
    private final boolean f332857b = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C119385a)) {
            return false;
        }
        C119385a aVar = (C119385a) obj;
        if (!C69664n.m101066l(this.f332856a, aVar.f332856a)) {
            return false;
        }
        boolean z = aVar.f332857b;
        return true;
    }

    public final int hashCode() {
        return (this.f332856a.hashCode() * 31) + 1;
    }

    public final String toString() {
        String str = this.f332856a;
        return "FeatureModule(name=" + str + ", enabled=true)";
    }
}
