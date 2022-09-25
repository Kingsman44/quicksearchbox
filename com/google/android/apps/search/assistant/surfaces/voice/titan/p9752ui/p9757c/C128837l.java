package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c;

import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.c.l */
/* compiled from: PG */
public final class C128837l implements C128831f {

    /* renamed from: a */
    public final C51986gl f354126a;

    /* renamed from: b */
    public final Duration f354127b;

    public C128837l(C51986gl glVar, Duration duration) {
        C69664n.m101061g(glVar, "suggestions");
        C69664n.m101061g(duration, "timeout");
        this.f354126a = glVar;
        this.f354127b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128837l)) {
            return false;
        }
        C128837l lVar = (C128837l) obj;
        return C69664n.m101066l(this.f354126a, lVar.f354126a) && C69664n.m101066l(this.f354127b, lVar.f354127b);
    }

    public final int hashCode() {
        return (this.f354126a.hashCode() * 31) + this.f354127b.hashCode();
    }

    public final String toString() {
        C51986gl glVar = this.f354126a;
        Duration duration = this.f354127b;
        return "SuggestionsContentState(suggestions=" + glVar + ", timeout=" + duration + ")";
    }
}
