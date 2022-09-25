package com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import com.google.p4744p.C62872b;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.f.a.a */
/* compiled from: PG */
public final class C32023a extends C32024b {

    /* renamed from: a */
    public final C62872b f86047a;

    /* renamed from: b */
    public final C58495hd f86048b;

    /* renamed from: c */
    public final boolean f86049c;

    /* renamed from: d */
    public final int f86050d;

    public C32023a(C62872b bVar, C58495hd hdVar, boolean z, int i) {
        if (bVar != null) {
            this.f86047a = bVar;
            if (hdVar != null) {
                this.f86048b = hdVar;
                this.f86049c = z;
                this.f86050d = i;
                return;
            }
            throw new NullPointerException("Null batchSizes");
        }
        throw new NullPointerException("Null encryptedEnvelope");
    }

    /* renamed from: a */
    public final C62872b mo37797a() {
        return this.f86047a;
    }

    /* renamed from: b */
    public final C58495hd mo37798b() {
        return this.f86048b;
    }

    /* renamed from: c */
    public final boolean mo37799c() {
        return this.f86049c;
    }

    /* renamed from: d */
    public final int mo37800d() {
        return this.f86050d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32024b) {
            C32024b bVar = (C32024b) obj;
            return this.f86047a.equals(bVar.mo37797a()) && this.f86048b.equals(bVar.mo37798b()) && this.f86049c == bVar.mo37799c() && this.f86050d == bVar.mo37800d();
        }
    }

    public final int hashCode() {
        return ((((((this.f86047a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f86048b.entrySet())) * 1000003) ^ (true != this.f86049c ? 1237 : 1231)) * 1000003) ^ this.f86050d;
    }

    public final String toString() {
        String obj = this.f86047a.toString();
        String obj2 = this.f86048b.toString();
        boolean z = this.f86049c;
        int i = this.f86050d;
        String str = i != 1 ? i != 2 ? i != 3 ? "ASSEMBLY_ERROR" : "READING_LOCAL_STORE_ERROR" : "ENCRYPTION_ERROR" : "SUCCESS";
        return "Result{encryptedEnvelope=" + obj + ", batchSizes=" + obj2 + ", envelopeIsEmpty=" + z + ", status=" + str + "}";
    }
}
