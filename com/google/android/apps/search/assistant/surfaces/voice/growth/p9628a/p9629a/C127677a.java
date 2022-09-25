package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.a */
/* compiled from: PG */
final class C127677a extends C127690f {

    /* renamed from: a */
    private final Locale f351511a;

    /* renamed from: b */
    private final C58485gu f351512b;

    public C127677a(Locale locale, C58485gu guVar) {
        if (locale != null) {
            this.f351511a = locale;
            if (guVar != null) {
                this.f351512b = guVar;
                return;
            }
            throw new NullPointerException("Null suggestions");
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: a */
    public final C58485gu mo108170a() {
        return this.f351512b;
    }

    /* renamed from: b */
    public final Locale mo108171b() {
        return this.f351511a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C127690f) {
            C127690f fVar = (C127690f) obj;
            return this.f351511a.equals(fVar.mo108171b()) && C58597ky.m90218i(this.f351512b, fVar.mo108170a());
        }
    }

    public final int hashCode() {
        return ((this.f351511a.hashCode() ^ 1000003) * 1000003) ^ this.f351512b.hashCode();
    }

    public final String toString() {
        String obj = this.f351511a.toString();
        String obj2 = this.f351512b.toString();
        return "ChalkboardSuggestions{locale=" + obj + ", suggestions=" + obj2 + "}";
    }
}
