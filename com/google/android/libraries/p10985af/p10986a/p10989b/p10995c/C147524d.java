package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c;

import android.net.Uri;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147485b;

/* renamed from: com.google.android.libraries.af.a.b.c.d */
/* compiled from: PG */
final class C147524d extends C147548v {

    /* renamed from: a */
    private final Uri f398174a;

    /* renamed from: b */
    private final C147485b f398175b;

    public C147524d(Uri uri, C147485b bVar) {
        if (uri != null) {
            this.f398174a = uri;
            this.f398175b = bVar;
            return;
        }
        throw new NullPointerException("Null directoryUri");
    }

    /* renamed from: a */
    public final Uri mo124293a() {
        return this.f398174a;
    }

    /* renamed from: b */
    public final C147485b mo124294b() {
        return this.f398175b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147548v) {
            C147548v vVar = (C147548v) obj;
            return this.f398174a.equals(vVar.mo124293a()) && this.f398175b.equals(vVar.mo124294b());
        }
    }

    public final int hashCode() {
        return ((this.f398174a.hashCode() ^ 1000003) * 1000003) ^ this.f398175b.hashCode();
    }

    public final String toString() {
        String obj = this.f398174a.toString();
        String obj2 = this.f398175b.toString();
        return "PersistentCache{directoryUri=" + obj + ", cache=" + obj2 + "}";
    }
}
