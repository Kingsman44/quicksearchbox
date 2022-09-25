package com.google.android.libraries.lens.view.p2178x;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.x.a */
/* compiled from: PG */
public final class C28207a extends C28210d {

    /* renamed from: a */
    public final C58485gu f76816a;

    /* renamed from: b */
    public final C58485gu f76817b;

    public C28207a(C58485gu guVar, C58485gu guVar2) {
        if (guVar != null) {
            this.f76816a = guVar;
            if (guVar2 != null) {
                this.f76817b = guVar2;
                return;
            }
            throw new NullPointerException("Null particlesToRemove");
        }
        throw new NullPointerException("Null particlesToAdd");
    }

    /* renamed from: a */
    public final C58485gu mo33717a() {
        return this.f76816a;
    }

    /* renamed from: b */
    public final C58485gu mo33718b() {
        return this.f76817b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28210d) {
            C28210d dVar = (C28210d) obj;
            return C58597ky.m90218i(this.f76816a, dVar.mo33717a()) && C58597ky.m90218i(this.f76817b, dVar.mo33718b());
        }
    }

    public final int hashCode() {
        return ((this.f76816a.hashCode() ^ 1000003) * 1000003) ^ this.f76817b.hashCode();
    }

    public final String toString() {
        String obj = this.f76816a.toString();
        String obj2 = this.f76817b.toString();
        return "ParticlesToAddRemove{particlesToAdd=" + obj + ", particlesToRemove=" + obj2 + "}";
    }
}
