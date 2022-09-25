package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.h */
/* compiled from: PG */
final class C139658h extends C139655e {

    /* renamed from: a */
    private final String f379637a;

    /* renamed from: b */
    private final Object f379638b;

    /* renamed from: c */
    private final Optional f379639c;

    public C139658h(String str, Object obj, Optional optional) {
        if (str != null) {
            this.f379637a = str;
            this.f379638b = obj;
            if (optional != null) {
                this.f379639c = optional;
                return;
            }
            throw new NullPointerException("Null requestId");
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: b */
    public final Optional mo115142b() {
        return this.f379639c;
    }

    /* renamed from: c */
    public final Object mo115143c() {
        return this.f379638b;
    }

    /* renamed from: d */
    public final String mo115144d() {
        return this.f379637a;
    }

    /* renamed from: e */
    public final boolean mo115145e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C139655e) {
            C139655e eVar = (C139655e) obj;
            return this.f379637a.equals(eVar.mo115144d()) && this.f379638b.equals(eVar.mo115143c()) && !eVar.mo115145e() && this.f379639c.equals(eVar.mo115142b());
        }
    }

    public final int hashCode() {
        return ((((((this.f379637a.hashCode() ^ 1000003) * 1000003) ^ this.f379638b.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.f379639c.hashCode();
    }

    public final String toString() {
        String str = this.f379637a;
        String obj = this.f379638b.toString();
        String obj2 = this.f379639c.toString();
        return "AmpViewerToDocumentMessage{type=" + str + ", payload=" + obj + ", awaitResponse=false, requestId=" + obj2 + "}";
    }
}
