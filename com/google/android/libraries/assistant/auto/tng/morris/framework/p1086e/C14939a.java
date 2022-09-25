package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.a */
/* compiled from: PG */
final class C14939a extends C14945af {

    /* renamed from: a */
    public final C14286dp f44889a;

    /* renamed from: b */
    public final boolean f44890b;

    public C14939a(C14286dp dpVar, boolean z) {
        if (dpVar != null) {
            this.f44889a = dpVar;
            this.f44890b = z;
            return;
        }
        throw new NullPointerException("Null action");
    }

    /* renamed from: a */
    public final C14286dp mo21861a() {
        return this.f44889a;
    }

    /* renamed from: b */
    public final boolean mo21862b() {
        return this.f44890b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14945af) {
            C14945af afVar = (C14945af) obj;
            return this.f44889a.equals(afVar.mo21861a()) && this.f44890b == afVar.mo21862b();
        }
    }

    public final int hashCode() {
        return ((this.f44889a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f44890b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f44889a.toString();
        boolean z = this.f44890b;
        return "CreateMediaActionResult{action=" + obj + ", customActionUsed=" + z + "}";
    }
}
