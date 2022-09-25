package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.k */
/* compiled from: PG */
final class C125505k extends C125511q {

    /* renamed from: a */
    private final String f346087a;

    /* renamed from: b */
    private final C125065at f346088b;

    /* renamed from: c */
    private final C125513s f346089c;

    public C125505k(String str, C125065at atVar, C125513s sVar) {
        if (str != null) {
            this.f346087a = str;
            if (atVar != null) {
                this.f346088b = atVar;
                this.f346089c = sVar;
                return;
            }
            throw new NullPointerException("Null composingText");
        }
        throw new NullPointerException("Null transcription");
    }

    /* renamed from: a */
    public final C125065at mo107002a() {
        return this.f346088b;
    }

    /* renamed from: b */
    public final C125513s mo107003b() {
        return this.f346089c;
    }

    /* renamed from: c */
    public final String mo107004c() {
        return this.f346087a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C125511q) {
            C125511q qVar = (C125511q) obj;
            return this.f346087a.equals(qVar.mo107004c()) && this.f346088b.equals(qVar.mo107002a()) && this.f346089c.equals(qVar.mo107003b());
        }
    }

    public final int hashCode() {
        return ((((this.f346087a.hashCode() ^ 1000003) * 1000003) ^ this.f346088b.hashCode()) * 1000003) ^ this.f346089c.hashCode();
    }

    public final String toString() {
        String str = this.f346087a;
        String obj = this.f346088b.toString();
        String obj2 = this.f346089c.toString();
        return "FormattedPreview{transcription=" + str + ", composingText=" + obj + ", newState=" + obj2 + "}";
    }
}
