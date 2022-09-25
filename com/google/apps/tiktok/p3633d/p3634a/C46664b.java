package com.google.apps.tiktok.p3633d.p3634a;

import com.google.protobuf.C63088z;

/* renamed from: com.google.apps.tiktok.d.a.b */
/* compiled from: PG */
final class C46664b extends C46669g {

    /* renamed from: a */
    private final C63088z f121920a;

    /* renamed from: b */
    private final C46667e f121921b;

    /* renamed from: c */
    private final boolean f121922c;

    public C46664b(C63088z zVar, C46667e eVar, boolean z) {
        this.f121920a = zVar;
        this.f121921b = eVar;
        this.f121922c = z;
    }

    /* renamed from: a */
    public final C46667e mo50687a() {
        return this.f121921b;
    }

    /* renamed from: b */
    public final C63088z mo50688b() {
        return this.f121920a;
    }

    /* renamed from: c */
    public final boolean mo50689c() {
        return this.f121922c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46669g) {
            C46669g gVar = (C46669g) obj;
            return this.f121920a.equals(gVar.mo50688b()) && this.f121921b.equals(gVar.mo50687a()) && this.f121922c == gVar.mo50689c();
        }
    }

    public final int hashCode() {
        return ((((this.f121920a.hashCode() ^ 1000003) * 1000003) ^ this.f121921b.hashCode()) * 1000003) ^ (true != this.f121922c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f121920a.toString();
        String obj2 = this.f121921b.toString();
        boolean z = this.f121922c;
        return "DebugData{data=" + obj + ", type=" + obj2 + ", containsPii=" + z + "}";
    }
}
