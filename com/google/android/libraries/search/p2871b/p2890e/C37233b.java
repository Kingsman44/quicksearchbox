package com.google.android.libraries.search.p2871b.p2890e;

import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.b.e.b */
/* compiled from: PG */
public final class C37233b {

    /* renamed from: a */
    public final int f98908a;

    /* renamed from: b */
    public final C66419b f98909b;

    public C37233b(int i, C66419b bVar) {
        this.f98908a = i;
        this.f98909b = bVar;
    }

    /* renamed from: a */
    public static C37233b m66076a(int i, C66419b bVar) {
        return new C37233b(i, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37233b)) {
            return false;
        }
        C37233b bVar = (C37233b) obj;
        return this.f98908a == bVar.f98908a && this.f98909b == bVar.f98909b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f98908a), this.f98909b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f98908a != 0) {
            sb.append("app ID: ");
            sb.append(this.f98908a);
        }
        if (this.f98909b != C66419b.UNKNOWN) {
            sb.append("product ID: ");
            sb.append(this.f98909b.name());
            sb.append(" (ID ");
            sb.append(this.f98909b.f180604g);
            sb.append(")");
        }
        return sb.toString();
    }
}
