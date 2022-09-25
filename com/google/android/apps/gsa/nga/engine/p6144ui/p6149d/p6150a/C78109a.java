package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a;

import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.a.a */
/* compiled from: PG */
public final class C78109a extends C78111c {

    /* renamed from: a */
    private final C75077bo f215115a;

    /* renamed from: b */
    private final C75077bo f215116b;

    public C78109a(C75077bo boVar, C75077bo boVar2) {
        if (boVar != null) {
            this.f215115a = boVar;
            if (boVar2 != null) {
                this.f215116b = boVar2;
                return;
            }
            throw new NullPointerException("Null newState");
        }
        throw new NullPointerException("Null previousState");
    }

    /* renamed from: a */
    public final C75077bo mo73074a() {
        return this.f215116b;
    }

    /* renamed from: b */
    public final C75077bo mo73075b() {
        return this.f215115a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78111c) {
            C78111c cVar = (C78111c) obj;
            return this.f215115a.equals(cVar.mo73075b()) && this.f215116b.equals(cVar.mo73074a());
        }
    }

    public final int hashCode() {
        return ((this.f215115a.hashCode() ^ 1000003) * 1000003) ^ this.f215116b.hashCode();
    }

    public final String toString() {
        String obj = this.f215115a.toString();
        String obj2 = this.f215116b.toString();
        return "StateChange{previousState=" + obj + ", newState=" + obj2 + "}";
    }
}
