package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.protobuf.C62917ay;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.m */
/* compiled from: PG */
public final class C34703m {

    /* renamed from: a */
    public final C34043bf f92120a;

    /* renamed from: b */
    public final C62917ay f92121b;

    /* renamed from: c */
    public final C62917ay f92122c;

    /* renamed from: d */
    public final C69626l f92123d;

    /* renamed from: e */
    private final boolean f92124e;

    public /* synthetic */ C34703m(C34043bf bfVar, C62917ay ayVar, C62917ay ayVar2, C69626l lVar, int i) {
        ayVar = (i & 2) != 0 ? null : ayVar;
        ayVar2 = (i & 4) != 0 ? null : ayVar2;
        lVar = (i & 8) != 0 ? new C34702l((C69577g) null) : lVar;
        C69664n.m101061g(bfVar, "id");
        C69664n.m101061g(lVar, "enabled");
        this.f92120a = bfVar;
        this.f92121b = ayVar;
        this.f92122c = ayVar2;
        this.f92123d = lVar;
        this.f92124e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34703m)) {
            return false;
        }
        C34703m mVar = (C34703m) obj;
        if (this.f92120a != mVar.f92120a || !C69664n.m101066l(this.f92121b, mVar.f92121b) || !C69664n.m101066l(this.f92122c, mVar.f92122c) || !C69664n.m101066l(this.f92123d, mVar.f92123d)) {
            return false;
        }
        boolean z = mVar.f92124e;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f92120a.hashCode() * 31;
        C62917ay ayVar = this.f92121b;
        int i = 0;
        int hashCode2 = (hashCode + (ayVar == null ? 0 : ayVar.hashCode())) * 31;
        C62917ay ayVar2 = this.f92122c;
        if (ayVar2 != null) {
            i = ayVar2.hashCode();
        }
        return (((hashCode2 + i) * 31) + this.f92123d.hashCode()) * 31;
    }

    public final String toString() {
        C34043bf bfVar = this.f92120a;
        C62917ay ayVar = this.f92121b;
        C62917ay ayVar2 = this.f92122c;
        C69626l lVar = this.f92123d;
        return "InvocationSourceDefinition(id=" + bfVar + ", stateExtension=" + ayVar + ", configurationExtension=" + ayVar2 + ", enabled=" + lVar + ", awaitStatePropagation=false)";
    }
}
