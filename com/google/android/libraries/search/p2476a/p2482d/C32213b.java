package com.google.android.libraries.search.p2476a.p2482d;

/* renamed from: com.google.android.libraries.search.a.d.b */
/* compiled from: PG */
public final class C32213b extends C32214c {

    /* renamed from: a */
    private final int f86423a;

    public C32213b(int i) {
        this.f86423a = i;
    }

    /* renamed from: a */
    public final int mo37995a() {
        return this.f86423a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C32214c) && this.f86423a == ((C32214c) obj).mo37995a();
    }

    public final int hashCode() {
        return this.f86423a ^ 1000003;
    }

    public final String toString() {
        String num = Integer.toString(this.f86423a - 1);
        return "IncognitoExitedEvent{exitPoint=" + num + "}";
    }
}
