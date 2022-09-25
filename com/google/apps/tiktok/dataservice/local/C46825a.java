package com.google.apps.tiktok.dataservice.local;

/* renamed from: com.google.apps.tiktok.dataservice.local.a */
/* compiled from: PG */
final class C46825a extends C46837al {

    /* renamed from: a */
    private final C46852f f122239a;

    /* renamed from: b */
    private final C46844as f122240b;

    public C46825a(C46852f fVar, C46844as asVar) {
        if (fVar != null) {
            this.f122239a = fVar;
            if (asVar != null) {
                this.f122240b = asVar;
                return;
            }
            throw new NullPointerException("Null result");
        }
        throw new NullPointerException("Null callbacks");
    }

    /* renamed from: a */
    public final C46852f mo50830a() {
        return this.f122239a;
    }

    /* renamed from: b */
    public final C46844as mo50831b() {
        return this.f122240b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46837al) {
            C46837al alVar = (C46837al) obj;
            return this.f122239a.equals(alVar.mo50830a()) && this.f122240b.equals(alVar.mo50831b());
        }
    }

    public final int hashCode() {
        return ((this.f122239a.hashCode() ^ 1000003) * 1000003) ^ this.f122240b.hashCode();
    }

    public final String toString() {
        String obj = this.f122239a.toString();
        String obj2 = this.f122240b.toString();
        return "CallbackResult{callbacks=" + obj + ", result=" + obj2 + "}";
    }
}
