package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import com.google.android.libraries.search.p2904c.C37402bg;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.n */
/* compiled from: PG */
final class C121798n {

    /* renamed from: a */
    public final C37402bg f338002a;

    /* renamed from: b */
    public final boolean f338003b;

    public C121798n(C37402bg bgVar, boolean z) {
        C69664n.m101061g(bgVar, "session");
        this.f338002a = bgVar;
        this.f338003b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121798n)) {
            return false;
        }
        C121798n nVar = (C121798n) obj;
        return C69664n.m101066l(this.f338002a, nVar.f338002a) && this.f338003b == nVar.f338003b;
    }

    public final int hashCode() {
        return (this.f338002a.hashCode() * 31) + (this.f338003b ? 1 : 0);
    }

    public final String toString() {
        C37402bg bgVar = this.f338002a;
        boolean z = this.f338003b;
        return "InternalStartListeningResult(session=" + bgVar + ", isNewSession=" + z + ")";
    }
}
