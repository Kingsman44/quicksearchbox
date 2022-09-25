package com.google.android.libraries.assistant.p1363c.p1398g.p1404c;

import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;

/* renamed from: com.google.android.libraries.assistant.c.g.c.a */
/* compiled from: PG */
final class C17363a extends C17364b {

    /* renamed from: a */
    private final C17508k f50217a;

    /* renamed from: b */
    private final C17477am f50218b;

    public C17363a(C17508k kVar, C17477am amVar) {
        if (kVar != null) {
            this.f50217a = kVar;
            if (amVar != null) {
                this.f50218b = amVar;
                return;
            }
            throw new NullPointerException("Null sessionToken");
        }
        throw new NullPointerException("Null clientInfo");
    }

    /* renamed from: a */
    public final C17508k mo23310a() {
        return this.f50217a;
    }

    /* renamed from: b */
    public final C17477am mo23311b() {
        return this.f50218b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17364b) {
            C17364b bVar = (C17364b) obj;
            return this.f50217a.equals(bVar.mo23310a()) && this.f50218b.equals(bVar.mo23311b());
        }
    }

    public final int hashCode() {
        return ((this.f50217a.hashCode() ^ 1000003) * 1000003) ^ this.f50218b.hashCode();
    }

    public final String toString() {
        String obj = this.f50217a.toString();
        String obj2 = this.f50218b.toString();
        return "ClientSessionData{clientInfo=" + obj + ", sessionToken=" + obj2 + "}";
    }
}
