package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ax */
/* compiled from: PG */
final class C113271ax extends C113365df {

    /* renamed from: a */
    private final C113286bk f313657a;

    /* renamed from: b */
    private final OptionalInt f313658b;

    public C113271ax(C113286bk bkVar, OptionalInt optionalInt) {
        if (bkVar != null) {
            this.f313657a = bkVar;
            if (optionalInt != null) {
                this.f313658b = optionalInt;
                return;
            }
            throw new NullPointerException("Null padding");
        }
        throw new NullPointerException("Null iconSource");
    }

    /* renamed from: a */
    public final C113286bk mo99996a() {
        return this.f313657a;
    }

    /* renamed from: b */
    public final OptionalInt mo99997b() {
        return this.f313658b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113365df) {
            C113365df dfVar = (C113365df) obj;
            return this.f313657a.equals(dfVar.mo99996a()) && this.f313658b.equals(dfVar.mo99997b());
        }
    }

    public final int hashCode() {
        return ((this.f313657a.hashCode() ^ 1000003) * 1000003) ^ this.f313658b.hashCode();
    }

    public final String toString() {
        String obj = this.f313657a.toString();
        String obj2 = this.f313658b.toString();
        return "PaddedIcon{iconSource=" + obj + ", padding=" + obj2 + "}";
    }
}
