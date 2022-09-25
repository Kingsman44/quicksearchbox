package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.a */
/* compiled from: PG */
final class C15506a extends C15514i {

    /* renamed from: a */
    private final C57981b f46462a;

    /* renamed from: b */
    private final C15519n f46463b;

    public C15506a(C57981b bVar, C15519n nVar) {
        this.f46462a = bVar;
        this.f46463b = nVar;
    }

    /* renamed from: a */
    public final C15519n mo22373a() {
        return this.f46463b;
    }

    /* renamed from: b */
    public final C57981b mo22374b() {
        return this.f46462a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15514i) {
            C15514i iVar = (C15514i) obj;
            return this.f46462a.equals(iVar.mo22374b()) && this.f46463b.equals(iVar.mo22373a());
        }
    }

    public final int hashCode() {
        return ((this.f46462a.hashCode() ^ 1000003) * 1000003) ^ this.f46463b.hashCode();
    }

    public final String toString() {
        String obj = this.f46462a.toString();
        String obj2 = this.f46463b.toString();
        return "S3ConnectionResult{s3ResponseSource=" + obj + ", s3RequestSink=" + obj2 + "}";
    }
}
