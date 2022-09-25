package com.google.android.libraries.p2460r.p2469c;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57446dq;
import java.util.List;

/* renamed from: com.google.android.libraries.r.c.ba */
/* compiled from: PG */
final class C32113ba extends C32091av {

    /* renamed from: a */
    private final C57446dq f86230a;

    /* renamed from: b */
    private final List f86231b;

    /* renamed from: c */
    private final List f86232c;

    public C32113ba(C57446dq dqVar, List list, List list2) {
        this.f86230a = dqVar;
        this.f86231b = list;
        this.f86232c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32113ba)) {
            return false;
        }
        C32113ba baVar = (C32113ba) obj;
        if (!C32114bb.m59825c(this.f86230a, baVar.f86230a)) {
            return false;
        }
        boolean z = baVar.f86231b == null;
        List list = this.f86231b;
        if (z ^ (list == null)) {
            return false;
        }
        if ((list != null && (list.size() != baVar.f86231b.size() || this.f86231b.hashCode() != baVar.f86231b.hashCode())) || (baVar.f86232c.isEmpty() ^ this.f86232c.isEmpty())) {
            return false;
        }
        List list2 = this.f86232c;
        return list2 == baVar.f86232c || list2.hashCode() == baVar.f86232c.hashCode();
    }

    public final int hashCode() {
        int hashCode = this.f86230a.hashCode() * 31;
        List list = this.f86231b;
        int i = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f86232c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }
}
