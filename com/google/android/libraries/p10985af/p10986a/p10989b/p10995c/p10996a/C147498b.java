package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a;

import com.google.p4184bj.p4193c.p4197c.C55931ae;
import com.google.p4184bj.p4193c.p4197c.C55944ar;

/* renamed from: com.google.android.libraries.af.a.b.c.a.b */
/* compiled from: PG */
final class C147498b extends C147499c {

    /* renamed from: a */
    private final C55944ar f398120a;

    /* renamed from: b */
    private final C55931ae f398121b;

    public C147498b(C55944ar arVar, C55931ae aeVar) {
        if (arVar != null) {
            this.f398120a = arVar;
            if (aeVar != null) {
                this.f398121b = aeVar;
                return;
            }
            throw new NullPointerException("Null origin");
        }
        throw new NullPointerException("Null response");
    }

    /* renamed from: a */
    public final C55931ae mo124261a() {
        return this.f398121b;
    }

    /* renamed from: b */
    public final C55944ar mo124262b() {
        return this.f398120a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147499c) {
            C147499c cVar = (C147499c) obj;
            return this.f398120a.equals(cVar.mo124262b()) && this.f398121b.equals(cVar.mo124261a());
        }
    }

    public final int hashCode() {
        return ((this.f398120a.hashCode() ^ 1000003) * 1000003) ^ this.f398121b.hashCode();
    }

    public final String toString() {
        String obj = this.f398120a.toString();
        String num = Integer.toString(this.f398121b.f148887e);
        return "GetActivityControlsSettingsResponseWithOrigin{response=" + obj + ", origin=" + num + "}";
    }
}
