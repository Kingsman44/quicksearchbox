package com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a;

import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.worker.a.b */
/* compiled from: PG */
final class C32029b extends C32030c {

    /* renamed from: a */
    private final C58541iw f86082a;

    public C32029b(C58541iw iwVar) {
        this.f86082a = iwVar;
    }

    /* renamed from: a */
    public final int mo37813a() {
        return 1;
    }

    /* renamed from: b */
    public final C58541iw mo37817b() {
        return this.f86082a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32032e) {
            C32032e eVar = (C32032e) obj;
            if (eVar.mo37813a() != 1 || !this.f86082a.equals(eVar.mo37817b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C58758qx.m90643a(this.f86082a);
    }

    public final String toString() {
        String obj = this.f86082a.toString();
        return "ExperimentIdsOrError{experimentIds=" + obj + "}";
    }
}
