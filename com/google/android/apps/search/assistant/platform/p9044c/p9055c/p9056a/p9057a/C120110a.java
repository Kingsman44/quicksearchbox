package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a;

import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.a.a */
/* compiled from: PG */
public final class C120110a {

    /* renamed from: a */
    public final Set f334336a;

    public C120110a(Set set) {
        C69664n.m101061g(set, "sources");
        this.f334336a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C120110a) && C69664n.m101066l(this.f334336a, ((C120110a) obj).f334336a);
    }

    public final int hashCode() {
        return this.f334336a.hashCode();
    }

    public final String toString() {
        Set set = this.f334336a;
        return "ApaFlowRouting(sources=" + set + ")";
    }
}
