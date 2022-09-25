package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import java.util.List;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.x.a.c */
/* compiled from: PG */
final class C36796c {

    /* renamed from: a */
    public final C34053bp f95872a;

    /* renamed from: b */
    public final List f95873b;

    /* renamed from: c */
    public final Duration f95874c;

    public C36796c(C34053bp bpVar, List list, Duration duration) {
        C69664n.m101061g(duration, "timestamp");
        this.f95872a = bpVar;
        this.f95873b = list;
        this.f95874c = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36796c)) {
            return false;
        }
        C36796c cVar = (C36796c) obj;
        return C69664n.m101066l(this.f95872a, cVar.f95872a) && C69664n.m101066l(this.f95873b, cVar.f95873b) && C69664n.m101066l(this.f95874c, cVar.f95874c);
    }

    public final int hashCode() {
        return (((this.f95872a.hashCode() * 31) + this.f95873b.hashCode()) * 31) + this.f95874c.hashCode();
    }

    public final String toString() {
        C34053bp bpVar = this.f95872a;
        List list = this.f95873b;
        Duration duration = this.f95874c;
        return "DebugQuickPhraseEvent(invocationToken=" + bpVar + ", quickPhraseTypes=" + list + ", timestamp=" + duration + ")";
    }
}
