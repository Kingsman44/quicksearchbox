package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a;

import com.google.p4184bj.p4193c.p4197c.C55944ar;

/* renamed from: com.google.android.libraries.af.a.b.c.a.a */
/* compiled from: PG */
final class C147492a extends C147516t {

    /* renamed from: a */
    public final C55944ar f398113a;

    public C147492a(C55944ar arVar) {
        if (arVar != null) {
            this.f398113a = arVar;
            return;
        }
        throw new NullPointerException("Null response");
    }

    /* renamed from: a */
    public final long mo124254a() {
        return -1;
    }

    /* renamed from: b */
    public final C55944ar mo124255b() {
        return this.f398113a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147516t) {
            C147516t tVar = (C147516t) obj;
            return this.f398113a.equals(tVar.mo124255b()) && tVar.mo124254a() == -1;
        }
    }

    public final int hashCode() {
        return ((this.f398113a.hashCode() ^ 1000003) * 1000003) ^ ((int) -4294967296L);
    }

    public final String toString() {
        String obj = this.f398113a.toString();
        return "CachedGetActivityControlsSettingsResponse{response=" + obj + ", timestamp=-1}";
    }
}
