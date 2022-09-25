package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.a */
/* compiled from: PG */
public final class C125722a extends C125738q {

    /* renamed from: a */
    public final Locale f346511a;

    /* renamed from: b */
    private final C58485gu f346512b;

    /* renamed from: c */
    private final C58485gu f346513c;

    public C125722a(Locale locale, C58485gu guVar, C58485gu guVar2) {
        if (locale != null) {
            this.f346511a = locale;
            if (guVar != null) {
                this.f346512b = guVar;
                if (guVar2 != null) {
                    this.f346513c = guVar2;
                    return;
                }
                throw new NullPointerException("Null emojiConcepts");
            }
            throw new NullPointerException("Null emojiSearchStopWords");
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: a */
    public final C58485gu mo107092a() {
        return this.f346513c;
    }

    /* renamed from: b */
    public final C58485gu mo107093b() {
        return this.f346512b;
    }

    /* renamed from: c */
    public final Locale mo107094c() {
        return this.f346511a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C125738q) {
            C125738q qVar = (C125738q) obj;
            return this.f346511a.equals(qVar.mo107094c()) && C58597ky.m90218i(this.f346512b, qVar.mo107093b()) && C58597ky.m90218i(this.f346513c, qVar.mo107092a());
        }
    }

    public final int hashCode() {
        return ((((this.f346511a.hashCode() ^ 1000003) * 1000003) ^ this.f346512b.hashCode()) * 1000003) ^ this.f346513c.hashCode();
    }

    public final String toString() {
        String obj = this.f346511a.toString();
        String obj2 = this.f346512b.toString();
        String obj3 = this.f346513c.toString();
        return "LoadEmojiNluHandlerRequest{locale=" + obj + ", emojiSearchStopWords=" + obj2 + ", emojiConcepts=" + obj3 + "}";
    }
}
