package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9462a;

import android.content.Context;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.a.a */
/* compiled from: PG */
final class C125939a extends C125940b {

    /* renamed from: a */
    private final Locale f347154a;

    /* renamed from: b */
    private final Context f347155b;

    public C125939a(Locale locale, Context context) {
        if (locale != null) {
            this.f347154a = locale;
            if (context != null) {
                this.f347155b = context;
                return;
            }
            throw new NullPointerException("Null context");
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: a */
    public final Context mo107206a() {
        return this.f347155b;
    }

    /* renamed from: b */
    public final Locale mo107207b() {
        return this.f347154a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C125940b) {
            C125940b bVar = (C125940b) obj;
            return this.f347154a.equals(bVar.mo107207b()) && this.f347155b.equals(bVar.mo107206a());
        }
    }

    public final int hashCode() {
        return ((this.f347154a.hashCode() ^ 1000003) * 1000003) ^ this.f347155b.hashCode();
    }

    public final String toString() {
        String obj = this.f347154a.toString();
        String obj2 = this.f347155b.toString();
        return "LocalizedContextCache{locale=" + obj + ", context=" + obj2 + "}";
    }
}
