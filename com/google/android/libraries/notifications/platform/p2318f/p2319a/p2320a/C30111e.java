package com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a;

import java.io.IOException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.platform.f.a.a.e */
/* compiled from: PG */
public final class C30111e extends C30112f {

    /* renamed from: a */
    public final IOException f81458a;

    public C30111e(IOException iOException) {
        this.f81458a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30111e) && C69664n.m101066l(this.f81458a, ((C30111e) obj).f81458a);
    }

    public final int hashCode() {
        return this.f81458a.hashCode();
    }

    public final String toString() {
        IOException iOException = this.f81458a;
        return "TransientFailure(cause=" + iOException + ")";
    }
}
