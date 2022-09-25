package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.bf */
/* compiled from: PG */
public final class C126325bf {

    /* renamed from: a */
    public final C58485gu f347993a;

    public C126325bf(C58485gu guVar) {
        C69664n.m101061g(guVar, "suggestions");
        this.f347993a = guVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C126325bf) && C69664n.m101066l(this.f347993a, ((C126325bf) obj).f347993a);
    }

    public final int hashCode() {
        return this.f347993a.hashCode();
    }

    public final String toString() {
        C58485gu guVar = this.f347993a;
        return "UiSuggestionsState(suggestions=" + guVar + ")";
    }
}
