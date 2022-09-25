package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9684e;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e.b */
/* compiled from: PG */
final class C128196b extends C128203i {

    /* renamed from: a */
    private final String f352666a;

    /* renamed from: b */
    private final int f352667b;

    /* renamed from: c */
    private final Optional f352668c;

    /* renamed from: d */
    private final boolean f352669d;

    public C128196b(String str, int i, Optional optional, boolean z) {
        this.f352666a = str;
        this.f352667b = i;
        this.f352668c = optional;
        this.f352669d = z;
    }

    /* renamed from: a */
    public final int mo108359a() {
        return this.f352667b;
    }

    /* renamed from: b */
    public final Optional mo108360b() {
        return this.f352668c;
    }

    /* renamed from: c */
    public final String mo108361c() {
        return this.f352666a;
    }

    /* renamed from: d */
    public final boolean mo108362d() {
        return this.f352669d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C128203i) {
            C128203i iVar = (C128203i) obj;
            return this.f352666a.equals(iVar.mo108361c()) && this.f352667b == iVar.mo108359a() && this.f352668c.equals(iVar.mo108360b()) && this.f352669d == iVar.mo108362d();
        }
    }

    public final int hashCode() {
        return ((((((this.f352666a.hashCode() ^ 1000003) * 1000003) ^ this.f352667b) * 1000003) ^ this.f352668c.hashCode()) * 1000003) ^ (true != this.f352669d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f352666a;
        int i = this.f352667b;
        String valueOf = String.valueOf(this.f352668c);
        boolean z = this.f352669d;
        return "UnrealizedSuggestion{id=" + str + ", queryResourceId=" + i + ", requiredPackage=" + valueOf + ", showOnLockscreen=" + z + "}";
    }
}
