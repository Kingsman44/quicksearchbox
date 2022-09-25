package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8266b.C107044a;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.a */
/* compiled from: PG */
final class C106518a extends C106546e {

    /* renamed from: e */
    private final C106526d f297050e;

    /* renamed from: f */
    private final Class f297051f;

    /* renamed from: g */
    private final C63010eb f297052g;

    /* renamed from: h */
    private final C107044a f297053h;

    public C106518a(C106526d dVar, Class cls, C63010eb ebVar, C107044a aVar) {
        if (dVar != null) {
            this.f297050e = dVar;
            this.f297051f = cls;
            if (ebVar != null) {
                this.f297052g = ebVar;
                if (aVar != null) {
                    this.f297053h = aVar;
                    return;
                }
                throw new NullPointerException("Null debugPrinter");
            }
            throw new NullPointerException("Null parser");
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final C106526d mo95556a() {
        return this.f297050e;
    }

    /* renamed from: b */
    public final C107044a mo95557b() {
        return this.f297053h;
    }

    /* renamed from: c */
    public final C63010eb mo95558c() {
        return this.f297052g;
    }

    /* renamed from: d */
    public final Class mo95559d() {
        return this.f297051f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C106546e) {
            C106546e eVar = (C106546e) obj;
            return this.f297050e.equals(eVar.mo95556a()) && this.f297051f.equals(eVar.mo95559d()) && this.f297052g.equals(eVar.mo95558c()) && this.f297053h.equals(eVar.mo95557b());
        }
    }

    public final int hashCode() {
        return ((((((this.f297050e.hashCode() ^ 1000003) * 1000003) ^ this.f297051f.hashCode()) * 1000003) ^ this.f297052g.hashCode()) * 1000003) ^ this.f297053h.hashCode();
    }

    public final String toString() {
        String obj = this.f297050e.toString();
        String obj2 = this.f297051f.toString();
        String obj3 = this.f297052g.toString();
        String obj4 = this.f297053h.toString();
        return "TriggerDescriptor{id=" + obj + ", eventClass=" + obj2 + ", parser=" + obj3 + ", debugPrinter=" + obj4 + "}";
    }
}
