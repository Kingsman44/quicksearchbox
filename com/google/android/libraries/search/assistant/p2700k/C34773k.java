package com.google.android.libraries.search.assistant.p2700k;

import com.google.frameworks.client.data.android.p4632a.C61347h;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.k.k */
/* compiled from: PG */
public final class C34773k {

    /* renamed from: a */
    public final C61347h f92264a;

    /* renamed from: b */
    public final Set f92265b;

    /* renamed from: c */
    public final C34757a f92266c;

    public C34773k(C61347h hVar, Set set, C34757a aVar) {
        C69664n.m101061g(hVar, "token");
        C69664n.m101061g(set, "oAuthScopes");
        C69664n.m101061g(aVar, "profile");
        this.f92264a = hVar;
        this.f92265b = set;
        this.f92266c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34773k)) {
            return false;
        }
        C34773k kVar = (C34773k) obj;
        return C69664n.m101066l(this.f92264a, kVar.f92264a) && C69664n.m101066l(this.f92265b, kVar.f92265b) && this.f92266c == kVar.f92266c;
    }

    public final int hashCode() {
        return (((this.f92264a.hashCode() * 31) + this.f92265b.hashCode()) * 31) + this.f92266c.hashCode();
    }

    public final String toString() {
        C61347h hVar = this.f92264a;
        Set set = this.f92265b;
        C34757a aVar = this.f92266c;
        return "RpcAuthCredential(token=" + hVar + ", oAuthScopes=" + set + ", profile=" + aVar + ")";
    }
}
