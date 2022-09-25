package com.google.android.libraries.gcoreclient.p1794s.p1795a;

import java.util.List;
import p3186j$.util.Objects;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.s.a.g */
/* compiled from: PG */
public final class C21642g {

    /* renamed from: a */
    public final List f59995a;

    /* renamed from: b */
    public final C21647l f59996b;

    public C21642g(List list, C21647l lVar) {
        this.f59995a = list;
        this.f59996b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21642g) {
            C21642g gVar = (C21642g) obj;
            return this.f59995a.equals(gVar.f59995a) && this.f59996b.equals(gVar.f59996b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f59995a, this.f59996b);
    }
}
