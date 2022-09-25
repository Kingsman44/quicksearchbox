package com.google.android.libraries.lens.view.session.ondevice.offlinedownload;

import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.a */
/* compiled from: PG */
public final class C27978a extends C27982e {

    /* renamed from: a */
    private final Locale f76139a;

    /* renamed from: b */
    private final long f76140b;

    public C27978a(Locale locale, long j) {
        if (locale != null) {
            this.f76139a = locale;
            this.f76140b = j;
            return;
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: a */
    public final long mo33431a() {
        return this.f76140b;
    }

    /* renamed from: b */
    public final Locale mo33432b() {
        return this.f76139a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27982e) {
            C27982e eVar = (C27982e) obj;
            return this.f76139a.equals(eVar.mo33432b()) && this.f76140b == eVar.mo33431a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f76139a.hashCode();
        long j = this.f76140b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f76139a.toString();
        long j = this.f76140b;
        return "TranslateLanguagePackInfo{locale=" + obj + ", modelSizeBytes=" + j + "}";
    }
}
