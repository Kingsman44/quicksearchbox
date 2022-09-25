package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.al */
/* compiled from: PG */
final class C123304al extends C123427f {

    /* renamed from: a */
    public final String f341042a;

    /* renamed from: b */
    public final C58485gu f341043b;

    public C123304al(String str, C58485gu guVar) {
        if (str != null) {
            this.f341042a = str;
            if (guVar != null) {
                this.f341043b = guVar;
                return;
            }
            throw new NullPointerException("Null annotations");
        }
        throw new NullPointerException("Null text");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123427f) {
            C123427f fVar = (C123427f) obj;
            return this.f341042a.equals(fVar.mo105929i()) && C58597ky.m90218i(this.f341043b, fVar.mo105927h());
        }
    }

    /* renamed from: h */
    public final C58485gu mo105927h() {
        return this.f341043b;
    }

    public final int hashCode() {
        return ((this.f341042a.hashCode() ^ 1000003) * 1000003) ^ this.f341043b.hashCode();
    }

    /* renamed from: i */
    public final String mo105929i() {
        return this.f341042a;
    }

    public final String toString() {
        String str = this.f341042a;
        String obj = this.f341043b.toString();
        return "AnnotatedString{text=" + str + ", annotations=" + obj + "}";
    }
}
