package com.google.android.apps.gsa.p6482q.p6483a;

import com.google.assistant.p3861at.C50163mx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.q.a.b */
/* compiled from: PG */
final class C84229b extends C84231d {

    /* renamed from: a */
    public final C58485gu f229230a;

    /* renamed from: b */
    public final C50163mx f229231b;

    public C84229b(C58485gu guVar, C50163mx mxVar) {
        this.f229230a = guVar;
        this.f229231b = mxVar;
    }

    /* renamed from: a */
    public final C84230c mo77686a() {
        return new C84228a(this);
    }

    /* renamed from: b */
    public final C50163mx mo77687b() {
        return this.f229231b;
    }

    /* renamed from: c */
    public final C58485gu mo77688c() {
        return this.f229230a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84231d) {
            C84231d dVar = (C84231d) obj;
            return C58597ky.m90218i(this.f229230a, dVar.mo77688c()) && this.f229231b.equals(dVar.mo77687b());
        }
    }

    public final int hashCode() {
        return ((this.f229230a.hashCode() ^ 1000003) * 1000003) ^ this.f229231b.hashCode();
    }

    public final String toString() {
        String obj = this.f229230a.toString();
        String obj2 = this.f229231b.toString();
        return "UnifiedDeviceActivationSettingsData{devices=" + obj + ", helpImproveAssistantSettingsUi=" + obj2 + "}";
    }
}
