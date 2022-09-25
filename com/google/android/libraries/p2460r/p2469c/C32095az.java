package com.google.android.libraries.p2460r.p2469c;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57357ai;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57446dq;

/* renamed from: com.google.android.libraries.r.c.az */
/* compiled from: PG */
final class C32095az {

    /* renamed from: a */
    public final C57446dq f86176a;

    /* renamed from: b */
    public final C57357ai f86177b;

    public C32095az(C57446dq dqVar, C57357ai aiVar) {
        this.f86176a = dqVar;
        this.f86177b = aiVar;
    }

    public C32095az(String str, C32148z zVar, C57357ai aiVar) {
        this.f86176a = zVar.mo37966h(str);
        this.f86177b = aiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32095az)) {
            return false;
        }
        C32095az azVar = (C32095az) obj;
        if (C32114bb.m59825c(this.f86176a, azVar.f86176a)) {
            C57357ai aiVar = this.f86177b;
            if (aiVar == azVar.f86177b) {
                return true;
            }
            if (aiVar.f153231a.size() == azVar.f86177b.f153231a.size() && this.f86177b.hashCode() == azVar.f86177b.hashCode()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f86176a.hashCode() * 31) + this.f86177b.hashCode();
    }
}
