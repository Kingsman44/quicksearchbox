package com.google.android.libraries.assistant.soda;

import com.google.common.base.C58833ax;
import com.google.speech.p5218j.C66999hh;

/* renamed from: com.google.android.libraries.assistant.soda.d */
/* compiled from: PG */
final class C19262d extends C19240ac {

    /* renamed from: a */
    private final C66999hh f53969a;

    /* renamed from: b */
    private final C58833ax f53970b;

    /* renamed from: c */
    private final C58833ax f53971c;

    public C19262d(C66999hh hhVar, C58833ax axVar, C58833ax axVar2) {
        this.f53969a = hhVar;
        this.f53970b = axVar;
        this.f53971c = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo24392a() {
        return this.f53971c;
    }

    /* renamed from: b */
    public final C58833ax mo24393b() {
        return this.f53970b;
    }

    /* renamed from: c */
    public final C66999hh mo24394c() {
        return this.f53969a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19240ac) {
            C19240ac acVar = (C19240ac) obj;
            return this.f53969a.equals(acVar.mo24394c()) && this.f53970b.equals(acVar.mo24393b()) && this.f53971c.equals(acVar.mo24392a());
        }
    }

    public final int hashCode() {
        return ((((this.f53969a.hashCode() ^ 1000003) * 1000003) ^ this.f53970b.hashCode()) * 1000003) ^ this.f53971c.hashCode();
    }

    public final String toString() {
        String obj = this.f53969a.toString();
        String valueOf = String.valueOf(this.f53970b);
        String valueOf2 = String.valueOf(this.f53971c);
        return "SodaInitParams{sodaCoreConfig=" + obj + ", sodaTransportFactory=" + valueOf + ", sodaDataProvider=" + valueOf2 + "}";
    }
}
