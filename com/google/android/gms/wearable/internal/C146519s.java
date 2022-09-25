package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.C146408c;
import com.google.android.gms.wearable.C146410e;

/* renamed from: com.google.android.gms.wearable.internal.s */
/* compiled from: PG */
final class C146519s implements C146408c {

    /* renamed from: a */
    final C146408c f395718a;

    /* renamed from: b */
    final String f395719b = "/assistant/client_capability";

    public C146519s(C146408c cVar) {
        this.f395718a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C146519s sVar = (C146519s) obj;
        if (!this.f395718a.equals(sVar.f395718a)) {
            return false;
        }
        return this.f395719b.equals(sVar.f395719b);
    }

    public final int hashCode() {
        return (this.f395718a.hashCode() * 31) + this.f395719b.hashCode();
    }

    /* renamed from: j */
    public final void mo89886j(C146410e eVar) {
        this.f395718a.mo89886j(eVar);
    }
}
