package com.google.android.libraries.search.assistant.p2486aa.p2492c;

import com.google.speech.p5218j.p5219a.C66722az;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a */
/* compiled from: PG */
public final class C32261a {

    /* renamed from: a */
    public final String f86499a;

    /* renamed from: b */
    public final C66722az f86500b;

    public C32261a(String str, C66722az azVar) {
        C69664n.m101061g(str, "locale");
        C69664n.m101061g(azVar, "recognitionContext");
        this.f86499a = str;
        this.f86500b = azVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32261a)) {
            return false;
        }
        C32261a aVar = (C32261a) obj;
        return C69664n.m101066l(this.f86499a, aVar.f86499a) && C69664n.m101066l(this.f86500b, aVar.f86500b);
    }

    public final int hashCode() {
        return (this.f86499a.hashCode() * 31) + this.f86500b.hashCode();
    }

    public final String toString() {
        String str = this.f86499a;
        C66722az azVar = this.f86500b;
        return "LocaleAndRecognitionContext(locale=" + str + ", recognitionContext=" + azVar + ")";
    }
}
