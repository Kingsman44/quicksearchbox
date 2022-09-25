package com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b;

import android.speech.tts.TextToSpeech;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.c.g.o.b.a */
/* compiled from: PG */
final class C17575a extends C17583i {

    /* renamed from: a */
    private final TextToSpeech f50676a;

    /* renamed from: b */
    private final Locale f50677b;

    public C17575a(TextToSpeech textToSpeech, Locale locale) {
        this.f50676a = textToSpeech;
        if (locale != null) {
            this.f50677b = locale;
            return;
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: a */
    public final TextToSpeech mo23396a() {
        return this.f50676a;
    }

    /* renamed from: b */
    public final Locale mo23397b() {
        return this.f50677b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17583i) {
            C17583i iVar = (C17583i) obj;
            return this.f50676a.equals(iVar.mo23396a()) && this.f50677b.equals(iVar.mo23397b());
        }
    }

    public final int hashCode() {
        return ((this.f50676a.hashCode() ^ 1000003) * 1000003) ^ this.f50677b.hashCode();
    }

    public final String toString() {
        String obj = this.f50676a.toString();
        String obj2 = this.f50677b.toString();
        return "TextToSpeechWithLocale{textToSpeech=" + obj + ", locale=" + obj2 + "}";
    }
}
