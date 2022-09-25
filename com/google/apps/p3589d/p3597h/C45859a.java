package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45703t;

/* renamed from: com.google.apps.d.h.a */
/* compiled from: PG */
final class C45859a extends C45879e {

    /* renamed from: b */
    private final int f120562b;

    /* renamed from: c */
    private final C45703t f120563c;

    public C45859a(int i, C45703t tVar) {
        this.f120562b = i;
        this.f120563c = tVar;
    }

    /* renamed from: a */
    public final int mo49995a() {
        return this.f120562b;
    }

    /* renamed from: b */
    public final C45703t mo49996b() {
        return this.f120563c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45879e) {
            C45879e eVar = (C45879e) obj;
            return this.f120562b == eVar.mo49995a() && this.f120563c.equals(eVar.mo49996b());
        }
    }

    public final int hashCode() {
        return ((this.f120562b ^ 1000003) * 1000003) ^ this.f120563c.hashCode();
    }

    public final String toString() {
        int i = this.f120562b;
        String obj = this.f120563c.toString();
        return "CursorAndSelection{cursorPosition=" + i + ", selection=" + obj + "}";
    }
}
