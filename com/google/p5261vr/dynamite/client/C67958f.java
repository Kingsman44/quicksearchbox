package com.google.p5261vr.dynamite.client;

import p3186j$.util.Objects;

/* renamed from: com.google.vr.dynamite.client.f */
/* compiled from: PG */
final class C67958f {

    /* renamed from: a */
    public final String f184166a;

    /* renamed from: b */
    private final String f184167b;

    public C67958f(String str, String str2) {
        this.f184166a = str;
        this.f184167b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C67958f) {
            C67958f fVar = (C67958f) obj;
            return Objects.equals(this.f184166a, fVar.f184166a) && Objects.equals(this.f184167b, fVar.f184167b);
        }
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f184166a) * 37) + Objects.hashCode(this.f184167b);
    }

    public final String toString() {
        return "[packageName=" + this.f184166a + ",libraryName=" + this.f184167b + "]";
    }
}
