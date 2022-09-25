package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a;

/* renamed from: com.google.android.apps.h.a.a.a.a.a */
/* compiled from: PG */
public final class C119076a extends C119083h {
    /* renamed from: a */
    public final int mo104123a() {
        return 120;
    }

    /* renamed from: b */
    public final int mo104124b() {
        return 0;
    }

    /* renamed from: c */
    public final int mo104125c() {
        return 10;
    }

    /* renamed from: d */
    public final int mo104126d() {
        return 10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C119083h) {
            C119083h hVar = (C119083h) obj;
            return hVar.mo104125c() == 10 && hVar.mo104124b() == 0 && hVar.mo104123a() == 120 && hVar.mo104126d() == 10;
        }
    }

    public final int hashCode() {
        return 822175601;
    }

    public final String toString() {
        return "Deadlines{handshakeDeadlineSeconds=10, checkUrlDeadlineSeconds=0, audioDeadlineSeconds=120, listVoicesDeadlineSeconds=10}";
    }
}
