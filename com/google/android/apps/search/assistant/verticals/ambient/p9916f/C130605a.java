package com.google.android.apps.search.assistant.verticals.ambient.p9916f;

import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.f.a */
/* compiled from: PG */
public final class C130605a extends C130606b {

    /* renamed from: a */
    private final Object f357706a;

    /* renamed from: b */
    private final C63042fg f357707b;

    public C130605a(Object obj, C63042fg fgVar) {
        if (obj != null) {
            this.f357706a = obj;
            if (fgVar != null) {
                this.f357707b = fgVar;
                return;
            }
            throw new NullPointerException("Null timestamp");
        }
        throw new NullPointerException("Null data");
    }

    /* renamed from: a */
    public final C63042fg mo109741a() {
        return this.f357707b;
    }

    /* renamed from: b */
    public final Object mo109742b() {
        return this.f357706a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130606b) {
            C130606b bVar = (C130606b) obj;
            return this.f357706a.equals(bVar.mo109742b()) && this.f357707b.equals(bVar.mo109741a());
        }
    }

    public final int hashCode() {
        return ((this.f357706a.hashCode() ^ 1000003) * 1000003) ^ this.f357707b.hashCode();
    }

    public final String toString() {
        String obj = this.f357706a.toString();
        String obj2 = this.f357707b.toString();
        return "ProfileWithTimestamp{data=" + obj + ", timestamp=" + obj2 + "}";
    }
}
