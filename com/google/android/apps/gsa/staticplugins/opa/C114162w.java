package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.w */
/* compiled from: PG */
final class C114162w extends C109355kr {

    /* renamed from: a */
    public final C108232bc f316480a;

    /* renamed from: b */
    public final Optional f316481b;

    /* renamed from: c */
    public final Optional f316482c;

    public C114162w(C108232bc bcVar, Optional optional, Optional optional2) {
        this.f316480a = bcVar;
        this.f316481b = optional;
        this.f316482c = optional2;
    }

    /* renamed from: a */
    public final C109353kp mo97795a() {
        return new C113896v(this);
    }

    /* renamed from: b */
    public final C108232bc mo97796b() {
        return this.f316480a;
    }

    /* renamed from: c */
    public final Optional mo97797c() {
        return this.f316482c;
    }

    /* renamed from: d */
    public final Optional mo97798d() {
        return this.f316481b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C109355kr) {
            C109355kr krVar = (C109355kr) obj;
            return this.f316480a.equals(krVar.mo97796b()) && this.f316481b.equals(krVar.mo97798d()) && this.f316482c.equals(krVar.mo97797c());
        }
    }

    public final int hashCode() {
        return ((((this.f316480a.hashCode() ^ 1000003) * 1000003) ^ this.f316481b.hashCode()) * 1000003) ^ this.f316482c.hashCode();
    }

    public final String toString() {
        String obj = this.f316480a.toString();
        String valueOf = String.valueOf(this.f316481b);
        String valueOf2 = String.valueOf(this.f316482c);
        return "OfflineUiRequest{uiElement=" + obj + ", ttsString=" + valueOf + ", logParams=" + valueOf2 + "}";
    }
}
