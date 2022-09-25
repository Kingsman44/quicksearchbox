package com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.assistant.g.c.d.a.d */
/* compiled from: PG */
final class C18130d extends C18146t {

    /* renamed from: a */
    public final Supplier f51613a;

    /* renamed from: b */
    public final C58485gu f51614b;

    /* renamed from: c */
    public final Function f51615c;

    public C18130d(Supplier supplier, C58485gu guVar, Function function) {
        if (supplier != null) {
            this.f51613a = supplier;
            if (guVar != null) {
                this.f51614b = guVar;
                if (function != null) {
                    this.f51615c = function;
                    return;
                }
                throw new NullPointerException("Null builderSealer");
            }
            throw new NullPointerException("Null paramBindings");
        }
        throw new NullPointerException("Null builderFactory");
    }

    /* renamed from: a */
    public final C58485gu mo23625a() {
        return this.f51614b;
    }

    /* renamed from: b */
    public final Function mo23626b() {
        return this.f51615c;
    }

    /* renamed from: c */
    public final Supplier mo23627c() {
        return this.f51613a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18146t) {
            C18146t tVar = (C18146t) obj;
            return this.f51613a.equals(tVar.mo23627c()) && C58597ky.m90218i(this.f51614b, tVar.mo23625a()) && this.f51615c.equals(tVar.mo23626b());
        }
    }

    public final int hashCode() {
        return ((((this.f51613a.hashCode() ^ 1000003) * 1000003) ^ this.f51614b.hashCode()) * 1000003) ^ this.f51615c.hashCode();
    }

    public final String toString() {
        String obj = this.f51613a.toString();
        String obj2 = this.f51614b.toString();
        String obj3 = this.f51615c.toString();
        return "StructSchema{builderFactory=" + obj + ", paramBindings=" + obj2 + ", builderSealer=" + obj3 + "}";
    }
}
