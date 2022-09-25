package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123029bw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a */
/* compiled from: PG */
final class C122550a extends C122719at {

    /* renamed from: a */
    private final C123029bw f339676a;

    /* renamed from: b */
    private final C58485gu f339677b;

    public C122550a(C123029bw bwVar, C58485gu guVar) {
        if (bwVar != null) {
            this.f339676a = bwVar;
            if (guVar != null) {
                this.f339677b = guVar;
                return;
            }
            throw new NullPointerException("Null annotations");
        }
        throw new NullPointerException("Null response");
    }

    /* renamed from: a */
    public final C123029bw mo105663a() {
        return this.f339676a;
    }

    /* renamed from: b */
    public final C58485gu mo105664b() {
        return this.f339677b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C122719at) {
            C122719at atVar = (C122719at) obj;
            return this.f339676a.equals(atVar.mo105663a()) && C58597ky.m90218i(this.f339677b, atVar.mo105664b());
        }
    }

    public final int hashCode() {
        return ((this.f339676a.hashCode() ^ 1000003) * 1000003) ^ this.f339677b.hashCode();
    }

    public final String toString() {
        String obj = this.f339676a.toString();
        String obj2 = this.f339677b.toString();
        return "ResponseData{response=" + obj + ", annotations=" + obj2 + "}";
    }
}
