package com.google.android.apps.gsa.nga.engine.p6056o;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d */
/* compiled from: PG */
public final class C76615d extends C77421o {

    /* renamed from: a */
    private final C77426t f211862a;

    /* renamed from: b */
    private final C83320io f211863b;

    public C76615d(C77426t tVar, C83320io ioVar) {
        if (tVar != null) {
            this.f211862a = tVar;
            if (ioVar != null) {
                this.f211863b = ioVar;
                return;
            }
            throw new NullPointerException("Null utteranceId");
        }
        throw new NullPointerException("Null response");
    }

    /* renamed from: a */
    public final C77426t mo72278a() {
        return this.f211862a;
    }

    /* renamed from: b */
    public final C83320io mo72279b() {
        return this.f211863b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77421o) {
            C77421o oVar = (C77421o) obj;
            return this.f211862a.equals(oVar.mo72278a()) && this.f211863b.equals(oVar.mo72279b());
        }
    }

    public final int hashCode() {
        return ((this.f211862a.hashCode() ^ 1000003) * 1000003) ^ this.f211863b.hashCode();
    }

    public final String toString() {
        String obj = this.f211862a.toString();
        String obj2 = this.f211863b.toString();
        return "ScheduledIntent{response=" + obj + ", utteranceId=" + obj2 + "}";
    }
}
