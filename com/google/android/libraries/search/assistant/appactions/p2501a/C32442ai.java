package com.google.android.libraries.search.assistant.appactions.p2501a;

import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.assistant.p3931f.p3939c.C52849z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.appactions.a.ai */
/* compiled from: PG */
public final class C32442ai {

    /* renamed from: a */
    public final C52849z f86913a;

    /* renamed from: b */
    public final C52829f f86914b;

    public C32442ai(C52849z zVar, C52829f fVar) {
        this.f86913a = zVar;
        this.f86914b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32442ai)) {
            return false;
        }
        C32442ai aiVar = (C32442ai) obj;
        return C69664n.m101066l(this.f86913a, aiVar.f86913a) && C69664n.m101066l(this.f86914b, aiVar.f86914b);
    }

    public final int hashCode() {
        C52849z zVar = this.f86913a;
        int i = 0;
        int hashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        C52829f fVar = this.f86914b;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        C52849z zVar = this.f86913a;
        C52829f fVar = this.f86914b;
        return "VoiceResponse(speech=" + zVar + ", appActionsContext=" + fVar + ")";
    }
}
