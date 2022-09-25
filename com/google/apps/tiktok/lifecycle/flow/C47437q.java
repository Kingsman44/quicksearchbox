package com.google.apps.tiktok.lifecycle.flow;

/* renamed from: com.google.apps.tiktok.lifecycle.flow.q */
/* compiled from: PG */
final class C47437q {

    /* renamed from: a */
    public boolean f123204a;

    public C47437q() {
        this((byte[]) null);
    }

    public C47437q(byte[] bArr) {
        this.f123204a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47437q) && this.f123204a == ((C47437q) obj).f123204a;
    }

    public final int hashCode() {
        return this.f123204a ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.f123204a;
        return "StreamState(subscribedThisLifecycle=" + z + ")";
    }
}
