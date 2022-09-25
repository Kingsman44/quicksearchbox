package com.google.android.libraries.search.p2871b.p2890e;

import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.b.e.a */
/* compiled from: PG */
public final class C37232a {

    /* renamed from: a */
    public final int f98906a;

    /* renamed from: b */
    public final C37233b f98907b;

    public C37232a(int i, int i2, C66419b bVar) {
        this.f98906a = i;
        this.f98907b = new C37233b(i2, bVar);
    }

    public C37232a(int i, C37233b bVar) {
        this.f98906a = i;
        this.f98907b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37232a)) {
            return false;
        }
        C37232a aVar = (C37232a) obj;
        return this.f98906a == aVar.f98906a && this.f98907b.equals(aVar.f98907b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f98906a), Integer.valueOf(this.f98907b.hashCode()));
    }

    public final String toString() {
        int i = this.f98906a;
        String valueOf = String.valueOf(this.f98907b);
        return "AppFlowEventIdentifier{eventId=" + i + ", clientID=" + valueOf + "}";
    }
}
