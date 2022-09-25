package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c;

import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a */
/* compiled from: PG */
public final class C120725a extends C120751c {

    /* renamed from: a */
    public final C58485gu f335775a;

    public C120725a(C58485gu guVar) {
        C69664n.m101061g(guVar, "interactions");
        this.f335775a = guVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C120725a) && C69664n.m101066l(this.f335775a, ((C120725a) obj).f335775a);
    }

    public final int hashCode() {
        return this.f335775a.hashCode();
    }

    public final String toString() {
        C58485gu guVar = this.f335775a;
        return "StructuredInput(interactions=" + guVar + ")";
    }
}
