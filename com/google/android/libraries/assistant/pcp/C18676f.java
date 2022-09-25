package com.google.android.libraries.assistant.pcp;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.pcp.f */
/* compiled from: PG */
final class C18676f extends C18997n {

    /* renamed from: a */
    private final C60870cx f52709a;

    public C18676f(C60870cx cxVar) {
        this.f52709a = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo24097a() {
        return this.f52709a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18997n) {
            return this.f52709a.equals(((C18997n) obj).mo24097a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f52709a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f52709a.toString();
        return "ProactiveSuggestionsResult{proactiveSuggestions=" + obj + "}";
    }
}
