package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b;

import com.google.android.libraries.search.p2904c.C37338ac;
import kotlinx.coroutines.C71604be;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.b.a */
/* compiled from: PG */
public final class C121740a {

    /* renamed from: a */
    public final C37338ac f337812a;

    /* renamed from: b */
    public final C71604be f337813b;

    public C121740a(C37338ac acVar, C71604be beVar) {
        C69664n.m101061g(acVar, "acquireStatus");
        C69664n.m101061g(beVar, "focusLostResultDeferred");
        this.f337812a = acVar;
        this.f337813b = beVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121740a)) {
            return false;
        }
        C121740a aVar = (C121740a) obj;
        return C69664n.m101066l(this.f337812a, aVar.f337812a) && C69664n.m101066l(this.f337813b, aVar.f337813b);
    }

    public final int hashCode() {
        return (this.f337812a.hashCode() * 31) + this.f337813b.hashCode();
    }

    public final String toString() {
        C37338ac acVar = this.f337812a;
        C71604be beVar = this.f337813b;
        return "AcquireFocusResult(acquireStatus=" + acVar + ", focusLostResultDeferred=" + beVar + ")";
    }
}
