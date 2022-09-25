package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage;

import com.google.android.libraries.web.postmessage.internal.C43968o;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.f */
/* compiled from: PG */
final class C139656f extends C139641a {

    /* renamed from: a */
    private final String f379634a;

    /* renamed from: b */
    private final long f379635b;

    /* renamed from: c */
    private final C43968o f379636c;

    public C139656f(String str, long j, C43968o oVar) {
        if (str != null) {
            this.f379634a = str;
            this.f379635b = j;
            this.f379636c = oVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final long mo115134a() {
        return this.f379635b;
    }

    /* renamed from: b */
    public final String mo115135b() {
        return this.f379634a;
    }

    /* renamed from: d */
    public final C43968o mo115137d() {
        return this.f379636c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C139641a) {
            C139641a aVar = (C139641a) obj;
            return this.f379634a.equals(aVar.mo115135b()) && this.f379635b == aVar.mo115134a() && this.f379636c.equals(aVar.mo115137d());
        }
    }

    public final int hashCode() {
        int hashCode = this.f379634a.hashCode();
        long j = this.f379635b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f379636c.hashCode();
    }

    public final String toString() {
        String str = this.f379634a;
        long j = this.f379635b;
        String obj = this.f379636c.toString();
        return "AmpDocumentResponseSender{type=" + str + ", requestId=" + j + ", sender=" + obj + "}";
    }
}
