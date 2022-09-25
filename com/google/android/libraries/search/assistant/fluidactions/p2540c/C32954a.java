package com.google.android.libraries.search.assistant.fluidactions.p2540c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.c.a */
/* compiled from: PG */
public final class C32954a extends C32971d {

    /* renamed from: a */
    public final String f88287a;

    /* renamed from: b */
    public final Optional f88288b;

    public C32954a(String str, Optional optional) {
        if (str != null) {
            this.f88287a = str;
            if (optional != null) {
                this.f88288b = optional;
                return;
            }
            throw new NullPointerException("Null sliceUri");
        }
        throw new NullPointerException("Null settingId");
    }

    /* renamed from: a */
    public final Optional mo38399a() {
        return this.f88288b;
    }

    /* renamed from: b */
    public final String mo38400b() {
        return this.f88287a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32971d) {
            C32971d dVar = (C32971d) obj;
            return this.f88287a.equals(dVar.mo38400b()) && this.f88288b.equals(dVar.mo38399a());
        }
    }

    public final int hashCode() {
        return ((this.f88287a.hashCode() ^ 1000003) * 1000003) ^ this.f88288b.hashCode();
    }
}
