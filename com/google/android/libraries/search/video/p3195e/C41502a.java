package com.google.android.libraries.search.video.p3195e;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.e.a */
/* compiled from: PG */
public final class C41502a extends C41506e {

    /* renamed from: a */
    private final Optional f108429a;

    /* renamed from: b */
    private final Optional f108430b;

    public C41502a(Optional optional, Optional optional2) {
        if (optional != null) {
            this.f108429a = optional;
            if (optional2 != null) {
                this.f108430b = optional2;
                return;
            }
            throw new NullPointerException("Null accountName");
        }
        throw new NullPointerException("Null timestamp");
    }

    /* renamed from: a */
    public final Optional mo44026a() {
        return this.f108430b;
    }

    /* renamed from: b */
    public final Optional mo44027b() {
        return this.f108429a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41506e) {
            C41506e eVar = (C41506e) obj;
            return this.f108429a.equals(eVar.mo44027b()) && this.f108430b.equals(eVar.mo44026a());
        }
    }

    public final int hashCode() {
        return ((this.f108429a.hashCode() ^ 1000003) * 1000003) ^ this.f108430b.hashCode();
    }

    public final String toString() {
        String obj = this.f108429a.toString();
        String obj2 = this.f108430b.toString();
        return "TransitionMetadata{timestamp=" + obj + ", accountName=" + obj2 + "}";
    }
}
