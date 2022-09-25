package com.google.android.libraries.assistant.gallium.framework;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.c */
/* compiled from: PG */
public final class C18229c extends C18206aj {

    /* renamed from: a */
    private final C18204ah f51784a;

    /* renamed from: b */
    private final C18212ap f51785b;

    public C18229c(C18204ah ahVar, C18212ap apVar) {
        if (ahVar != null) {
            this.f51784a = ahVar;
            if (apVar != null) {
                this.f51785b = apVar;
                return;
            }
            throw new NullPointerException("Null provider");
        }
        throw new NullPointerException("Null descriptor");
    }

    /* renamed from: a */
    public final C18204ah mo23688a() {
        return this.f51784a;
    }

    /* renamed from: b */
    public final C18212ap mo23689b() {
        return this.f51785b;
    }

    /* renamed from: c */
    public final String mo23690c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18206aj) {
            C18206aj ajVar = (C18206aj) obj;
            return this.f51784a.equals(ajVar.mo23688a()) && ajVar.mo23690c() == null && this.f51785b.equals(ajVar.mo23689b());
        }
    }

    public final int hashCode() {
        return ((this.f51784a.hashCode() ^ 1000003) * -721379959) ^ this.f51785b.hashCode();
    }

    public final String toString() {
        String obj = this.f51784a.toString();
        String obj2 = this.f51785b.toString();
        return "Entry{descriptor=" + obj + ", qualifier=null, provider=" + obj2 + "}";
    }
}
