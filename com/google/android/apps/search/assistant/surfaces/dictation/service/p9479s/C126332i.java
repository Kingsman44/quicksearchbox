package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.i */
/* compiled from: PG */
public final class C126332i extends C126316ay {

    /* renamed from: a */
    private final Locale f348013a;

    /* renamed from: b */
    private final String f348014b;

    /* renamed from: c */
    private final C125422z f348015c;

    public C126332i(Locale locale, String str, C125422z zVar) {
        if (locale != null) {
            this.f348013a = locale;
            if (str != null) {
                this.f348014b = str;
                if (zVar != null) {
                    this.f348015c = zVar;
                    return;
                }
                throw new NullPointerException("Null dictationController");
            }
            throw new NullPointerException("Null initialText");
        }
        throw new NullPointerException("Null spokenLocale");
    }

    /* renamed from: a */
    public final String mo107525a() {
        return this.f348014b;
    }

    /* renamed from: b */
    public final Locale mo107526b() {
        return this.f348013a;
    }

    /* renamed from: c */
    public final C125422z mo107527c() {
        return this.f348015c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C126316ay) {
            C126316ay ayVar = (C126316ay) obj;
            return this.f348013a.equals(ayVar.mo107526b()) && this.f348014b.equals(ayVar.mo107525a()) && this.f348015c.equals(ayVar.mo107527c());
        }
    }

    public final int hashCode() {
        return ((((this.f348013a.hashCode() ^ 1000003) * 1000003) ^ this.f348014b.hashCode()) * 1000003) ^ this.f348015c.hashCode();
    }

    public final String toString() {
        String obj = this.f348013a.toString();
        String str = this.f348014b;
        String obj2 = this.f348015c.toString();
        return "OrationParams{spokenLocale=" + obj + ", initialText=" + str + ", dictationController=" + obj2 + "}";
    }
}
