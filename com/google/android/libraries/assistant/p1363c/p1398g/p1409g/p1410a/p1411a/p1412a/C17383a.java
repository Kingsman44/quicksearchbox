package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a;

import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.a.a */
/* compiled from: PG */
final class C17383a extends C17388f {

    /* renamed from: a */
    private final C57981b f50262a;

    /* renamed from: b */
    private final C17393k f50263b;

    public C17383a(C57981b bVar, C17393k kVar) {
        this.f50262a = bVar;
        this.f50263b = kVar;
    }

    /* renamed from: a */
    public final C17393k mo23329a() {
        return this.f50263b;
    }

    /* renamed from: b */
    public final C57981b mo23330b() {
        return this.f50262a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17388f) {
            C17388f fVar = (C17388f) obj;
            return this.f50262a.equals(fVar.mo23330b()) && this.f50263b.equals(fVar.mo23329a());
        }
    }

    public final int hashCode() {
        return ((this.f50262a.hashCode() ^ 1000003) * 1000003) ^ this.f50263b.hashCode();
    }

    public final String toString() {
        String obj = this.f50262a.toString();
        String obj2 = this.f50263b.toString();
        return "S3ConnectionResult{s3ResponseSource=" + obj + ", s3RequestSink=" + obj2 + "}";
    }
}
