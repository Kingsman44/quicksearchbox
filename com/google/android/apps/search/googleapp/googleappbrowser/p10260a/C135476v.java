package com.google.android.apps.search.googleapp.googleappbrowser.p10260a;

import com.google.android.libraries.search.integrations.p3019d.p3020a.C38510a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.a.v */
/* compiled from: PG */
public final class C135476v {

    /* renamed from: a */
    public final boolean f369101a;

    /* renamed from: b */
    public final boolean f369102b;

    /* renamed from: c */
    public final C38510a f369103c;

    public C135476v(boolean z, boolean z2, C38510a aVar) {
        C69664n.m101061g(aVar, "tngExperienceOptInPreference");
        this.f369101a = z;
        this.f369102b = z2;
        this.f369103c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135476v)) {
            return false;
        }
        C135476v vVar = (C135476v) obj;
        return this.f369101a == vVar.f369101a && this.f369102b == vVar.f369102b && this.f369103c == vVar.f369103c;
    }

    public final int hashCode() {
        return ((((this.f369101a ? 1 : 0) * true) + (this.f369102b ? 1 : 0)) * 31) + this.f369103c.hashCode();
    }

    public final String toString() {
        boolean z = this.f369101a;
        boolean z2 = this.f369102b;
        C38510a aVar = this.f369103c;
        return "StatusData(isIncognito=" + z + ", isGabPreferred=" + z2 + ", tngExperienceOptInPreference=" + aVar + ")";
    }
}
