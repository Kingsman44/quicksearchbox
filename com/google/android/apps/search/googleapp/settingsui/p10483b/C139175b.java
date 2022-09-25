package com.google.android.apps.search.googleapp.settingsui.p10483b;

import com.google.android.apps.search.googleapp.settingsui.C139161ao;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.b.b */
/* compiled from: PG */
public final class C139175b implements C47388b {

    /* renamed from: a */
    public final C139161ao f378507a;

    /* renamed from: b */
    public final boolean f378508b;

    public C139175b(C139161ao aoVar, boolean z) {
        this.f378507a = aoVar;
        this.f378508b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C139175b)) {
            return false;
        }
        C139175b bVar = (C139175b) obj;
        return C69664n.m101066l(this.f378507a, bVar.f378507a) && this.f378508b == bVar.f378508b;
    }

    public final int hashCode() {
        return (this.f378507a.hashCode() * 31) + (this.f378508b ? 1 : 0);
    }

    public final String toString() {
        C139161ao aoVar = this.f378507a;
        boolean z = this.f378508b;
        return "LinkElementClickedEvent(destination=" + aoVar + ", isHeaderPane=" + z + ")";
    }
}
