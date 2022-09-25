package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24450e;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;

/* renamed from: com.google.android.libraries.lens.view.q.l */
/* compiled from: PG */
final class C27638l extends C27607ba {

    /* renamed from: a */
    private final C24450e f75495a;

    /* renamed from: b */
    private final C24465t f75496b;

    public C27638l(C24450e eVar, C24465t tVar) {
        this.f75495a = eVar;
        if (tVar != null) {
            this.f75496b = tVar;
            return;
        }
        throw new NullPointerException("Null criteria");
    }

    /* renamed from: e */
    public final C24450e mo33128e() {
        return this.f75495a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27607ba) {
            C27607ba baVar = (C27607ba) obj;
            C24450e eVar = this.f75495a;
            if (eVar != null ? eVar.equals(baVar.mo33128e()) : baVar.mo33128e() == null) {
                if (this.f75496b.equals(baVar.mo33129f())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final C24465t mo33129f() {
        return this.f75496b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f75495a);
        String obj = this.f75496b.toString();
        return "ProgressListener{eventListener=" + valueOf + ", criteria=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        C24450e eVar = this.f75495a;
        if (eVar == null) {
            i = 0;
        } else {
            i = eVar.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f75496b.hashCode();
    }
}
