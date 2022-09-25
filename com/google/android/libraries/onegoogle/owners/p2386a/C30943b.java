package com.google.android.libraries.onegoogle.owners.p2386a;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.b */
/* compiled from: PG */
final class C30943b extends C30955n {

    /* renamed from: a */
    private final C143711ad f83379a;

    /* renamed from: b */
    private final Status f83380b;

    public C30943b(C143711ad adVar, Status status) {
        if (adVar != null) {
            this.f83379a = adVar;
            if (status != null) {
                this.f83380b = status;
                return;
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null result");
    }

    /* renamed from: a */
    public final C143711ad mo36631a() {
        return this.f83379a;
    }

    /* renamed from: b */
    public final Status mo36632b() {
        return this.f83380b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30955n) {
            C30955n nVar = (C30955n) obj;
            return this.f83379a.equals(nVar.mo36631a()) && this.f83380b.equals(nVar.mo36632b());
        }
    }

    public final int hashCode() {
        return ((this.f83379a.hashCode() ^ 1000003) * 1000003) ^ this.f83380b.hashCode();
    }
}
