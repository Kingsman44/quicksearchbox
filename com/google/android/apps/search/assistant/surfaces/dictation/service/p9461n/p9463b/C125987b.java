package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125040f;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.b */
/* compiled from: PG */
final class C125987b extends C126032h {

    /* renamed from: a */
    private final String f347228a;

    /* renamed from: b */
    private final String f347229b;

    /* renamed from: c */
    private final C126030f f347230c;

    /* renamed from: d */
    private final C125044j f347231d;

    /* renamed from: e */
    private final C125040f f347232e;

    /* renamed from: f */
    private final int f347233f;

    public C125987b(String str, String str2, int i, C126030f fVar, C125044j jVar, C125040f fVar2) {
        this.f347228a = str;
        this.f347229b = str2;
        this.f347233f = i;
        this.f347230c = fVar;
        this.f347231d = jVar;
        this.f347232e = fVar2;
    }

    /* renamed from: a */
    public final C125040f mo107224a() {
        return this.f347232e;
    }

    /* renamed from: b */
    public final C125044j mo107225b() {
        return this.f347231d;
    }

    /* renamed from: c */
    public final C126030f mo107226c() {
        return this.f347230c;
    }

    /* renamed from: d */
    public final String mo107227d() {
        return this.f347229b;
    }

    /* renamed from: e */
    public final String mo107228e() {
        return this.f347228a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C126032h) {
            C126032h hVar = (C126032h) obj;
            return this.f347228a.equals(hVar.mo107228e()) && this.f347229b.equals(hVar.mo107227d()) && this.f347233f == hVar.mo107230f() && this.f347230c.equals(hVar.mo107226c()) && this.f347231d.equals(hVar.mo107225b()) && this.f347232e.equals(hVar.mo107224a());
        }
    }

    /* renamed from: f */
    public final int mo107230f() {
        return this.f347233f;
    }

    public final int hashCode() {
        return ((((((((((this.f347228a.hashCode() ^ 1000003) * 1000003) ^ this.f347229b.hashCode()) * 1000003) ^ this.f347233f) * 1000003) ^ this.f347230c.hashCode()) * 1000003) ^ this.f347231d.hashCode()) * 1000003) ^ this.f347232e.hashCode();
    }

    public final String toString() {
        String str = this.f347228a;
        String str2 = this.f347229b;
        int i = this.f347233f;
        String str3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "LANGUAGE_PICKER" : "EMOJI" : "COMMAND" : "GUIDING_TEXT" : "UNKNOWN";
        String obj = this.f347230c.toString();
        String num = Integer.toString(this.f347231d.getNumber());
        String obj2 = this.f347232e.toString();
        return "KeyboardUiSuggestion{text=" + str + ", description=" + str2 + ", suggestionType=" + str3 + ", accessibilityBehavior=" + obj + ", chipId=" + num + ", emojiSuggestion=" + obj2 + "}";
    }
}
