package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8466q;

import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.q.a */
/* compiled from: PG */
final class C110896a extends C110911g {

    /* renamed from: a */
    public final C63088z f308934a;

    /* renamed from: b */
    public final int f308935b;

    public C110896a(C63088z zVar, int i) {
        if (zVar != null) {
            this.f308934a = zVar;
            this.f308935b = i;
            return;
        }
        throw new NullPointerException("Null iconBytes");
    }

    /* renamed from: a */
    public final int mo98922a() {
        return this.f308935b;
    }

    /* renamed from: b */
    public final C63088z mo98923b() {
        return this.f308934a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C110911g) {
            C110911g gVar = (C110911g) obj;
            return this.f308934a.equals(gVar.mo98923b()) && this.f308935b == gVar.mo98922a();
        }
    }

    public final int hashCode() {
        return ((this.f308934a.hashCode() ^ 1000003) * 1000003) ^ this.f308935b;
    }

    public final String toString() {
        String obj = this.f308934a.toString();
        int i = this.f308935b;
        return "IconBytesAndColorInt{iconBytes=" + obj + ", color=" + i + "}";
    }
}
