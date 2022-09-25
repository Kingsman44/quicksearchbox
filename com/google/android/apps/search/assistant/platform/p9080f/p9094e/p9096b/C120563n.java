package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.n */
/* compiled from: PG */
public final class C120563n {

    /* renamed from: a */
    public final C52083ep f335319a;

    /* renamed from: b */
    public final C119908e f335320b;

    public C120563n(C52083ep epVar, C119908e eVar) {
        C69664n.m101061g(epVar, "interaction");
        C69664n.m101061g(eVar, "clientOpPrefetchSession");
        this.f335319a = epVar;
        this.f335320b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C120563n)) {
            return false;
        }
        C120563n nVar = (C120563n) obj;
        return C69664n.m101066l(this.f335319a, nVar.f335319a) && C69664n.m101066l(this.f335320b, nVar.f335320b);
    }

    public final int hashCode() {
        return (this.f335319a.hashCode() * 31) + this.f335320b.hashCode();
    }

    public final String toString() {
        C52083ep epVar = this.f335319a;
        C119908e eVar = this.f335320b;
        return "InteractionPrefetchSession(interaction=" + epVar + ", clientOpPrefetchSession=" + eVar + ")";
    }
}
