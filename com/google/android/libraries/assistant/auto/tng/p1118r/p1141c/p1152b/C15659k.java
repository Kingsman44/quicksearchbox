package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.b.k */
/* compiled from: PG */
final class C15659k extends C15668t {

    /* renamed from: a */
    private final C60870cx f46788a;

    public C15659k(C60870cx cxVar) {
        this.f46788a = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo22492a() {
        return this.f46788a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15668t) {
            return this.f46788a.equals(((C15668t) obj).mo22492a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f46788a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f46788a.toString();
        return "OfflineFulfillmentResponse{assistantResponseFuture=" + obj + "}";
    }
}
