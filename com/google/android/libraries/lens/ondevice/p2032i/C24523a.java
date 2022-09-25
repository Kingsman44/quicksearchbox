package com.google.android.libraries.lens.ondevice.p2032i;

import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.lens.p4701g.C62331d;

/* renamed from: com.google.android.libraries.lens.ondevice.i.a */
/* compiled from: PG */
public final class C24523a extends C24527e {

    /* renamed from: a */
    private final C62331d f67181a;

    /* renamed from: b */
    private final C24795f f67182b;

    public C24523a(C62331d dVar, C24795f fVar) {
        if (dVar != null) {
            this.f67181a = dVar;
            if (fVar != null) {
                this.f67182b = fVar;
                return;
            }
            throw new NullPointerException("Null loadConfig");
        }
        throw new NullPointerException("Null cascadeType");
    }

    /* renamed from: a */
    public final C24795f mo29936a() {
        return this.f67182b;
    }

    /* renamed from: b */
    public final C62331d mo29937b() {
        return this.f67181a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24527e) {
            C24527e eVar = (C24527e) obj;
            return this.f67181a.equals(eVar.mo29937b()) && this.f67182b.equals(eVar.mo29936a());
        }
    }

    public final int hashCode() {
        return ((this.f67181a.hashCode() ^ 1000003) * 1000003) ^ this.f67182b.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f67181a.f168273v);
        String obj = this.f67182b.toString();
        return "LoggedCascade{cascadeType=" + num + ", loadConfig=" + obj + "}";
    }
}
