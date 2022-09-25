package com.google.android.libraries.lens.view.filters.translation;

import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.g */
/* compiled from: PG */
final class C26124g extends C26116cz {

    /* renamed from: a */
    public final Locale f70990a;

    /* renamed from: b */
    private final Locale f70991b;

    /* renamed from: c */
    private final boolean f70992c;

    public C26124g(Locale locale, Locale locale2, boolean z) {
        if (locale != null) {
            this.f70990a = locale;
            if (locale2 != null) {
                this.f70991b = locale2;
                this.f70992c = z;
                return;
            }
            throw new NullPointerException("Null target");
        }
        throw new NullPointerException("Null source");
    }

    /* renamed from: a */
    public final Locale mo31306a() {
        return this.f70990a;
    }

    /* renamed from: b */
    public final Locale mo31307b() {
        return this.f70991b;
    }

    /* renamed from: c */
    public final boolean mo31308c() {
        return this.f70992c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26116cz) {
            C26116cz czVar = (C26116cz) obj;
            return this.f70990a.equals(czVar.mo31306a()) && this.f70991b.equals(czVar.mo31307b()) && this.f70992c == czVar.mo31308c();
        }
    }

    public final int hashCode() {
        return ((((this.f70990a.hashCode() ^ 1000003) * 1000003) ^ this.f70991b.hashCode()) * 1000003) ^ (true != this.f70992c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f70990a.toString();
        String obj2 = this.f70991b.toString();
        boolean z = this.f70992c;
        return "TranslationParameters{source=" + obj + ", target=" + obj2 + ", areInitialized=" + z + "}";
    }
}
