package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.content.Intent;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.n */
/* compiled from: PG */
public final class C125258n {

    /* renamed from: a */
    public final Locale f345547a;

    /* renamed from: b */
    public final boolean f345548b;

    /* renamed from: c */
    private final boolean f345549c;

    public C125258n(Locale locale, boolean z, boolean z2) {
        C69664n.m101061g(locale, "locale");
        this.f345547a = locale;
        this.f345549c = z;
        this.f345548b = z2;
    }

    /* renamed from: a */
    public final Intent mo106884a() {
        Intent putExtra = new Intent("android.speech.action.RECOGNIZE_SPEECH").putExtra("android.speech.extra.LANGUAGE", this.f345547a.toLanguageTag()).putExtra("android.speech.extra.PREFER_OFFLINE", true).putExtra("android.speech.extra.PARTIAL_RESULTS", true).putExtra("android.speech.extra.LANGUAGE_MODEL", "smart_dictation").putExtra("com.google.recognition.extra.ENABLE_PERSONALIZATION", this.f345549c);
        C69664n.m101060f(putExtra, "Intent(RecognizerIntent.…N, enablePersonalization)");
        return putExtra;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125258n)) {
            return false;
        }
        C125258n nVar = (C125258n) obj;
        return C69664n.m101066l(this.f345547a, nVar.f345547a) && this.f345549c == nVar.f345549c && this.f345548b == nVar.f345548b;
    }

    public final int hashCode() {
        return (((this.f345547a.hashCode() * 31) + (this.f345549c ? 1 : 0)) * 31) + (this.f345548b ? 1 : 0);
    }

    public final String toString() {
        Locale locale = this.f345547a;
        boolean z = this.f345549c;
        boolean z2 = this.f345548b;
        return "AiAiConfig(locale=" + locale + ", enablePersonalization=" + z + ", maskOffensiveWords=" + z2 + ")";
    }
}
