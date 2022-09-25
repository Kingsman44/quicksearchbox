package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.e */
/* compiled from: PG */
final class C26122e extends C26201n {

    /* renamed from: a */
    private final Locale f70986a;

    /* renamed from: b */
    private final C25327c f70987b;

    public C26122e(Locale locale, C25327c cVar) {
        this.f70986a = locale;
        this.f70987b = cVar;
    }

    /* renamed from: a */
    public final C25327c mo31319a() {
        return this.f70987b;
    }

    /* renamed from: b */
    public final Locale mo31320b() {
        return this.f70986a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26201n) {
            C26201n nVar = (C26201n) obj;
            return this.f70986a.equals(nVar.mo31320b()) && this.f70987b.equals(nVar.mo31319a());
        }
    }

    public final int hashCode() {
        return ((this.f70986a.hashCode() ^ 1000003) * 1000003) ^ this.f70987b.hashCode();
    }

    public final String toString() {
        String obj = this.f70986a.toString();
        String num = Integer.toString(this.f70987b.getNumber());
        return "LanguagePackDownloadState{locale=" + obj + ", downloadState=" + num + "}";
    }
}
