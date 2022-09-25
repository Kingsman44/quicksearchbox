package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.d */
/* compiled from: PG */
final class C79695d extends C79704m {

    /* renamed from: a */
    public final C58485gu f218553a;

    /* renamed from: b */
    public final C58485gu f218554b;

    public C79695d(C58485gu guVar, C58485gu guVar2) {
        if (guVar != null) {
            this.f218553a = guVar;
            if (guVar2 != null) {
                this.f218554b = guVar2;
                return;
            }
            throw new NullPointerException("Null restoreOps");
        }
        throw new NullPointerException("Null setUpOps");
    }

    /* renamed from: a */
    public final C58485gu mo74200a() {
        return this.f218554b;
    }

    /* renamed from: b */
    public final C58485gu mo74201b() {
        return this.f218553a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79704m) {
            C79704m mVar = (C79704m) obj;
            return C58597ky.m90218i(this.f218553a, mVar.mo74201b()) && C58597ky.m90218i(this.f218554b, mVar.mo74200a());
        }
    }

    public final int hashCode() {
        return ((this.f218553a.hashCode() ^ 1000003) * 1000003) ^ this.f218554b.hashCode();
    }

    public final String toString() {
        String obj = this.f218553a.toString();
        String obj2 = this.f218554b.toString();
        return "VolumeUpdateClientOps{setUpOps=" + obj + ", restoreOps=" + obj2 + "}";
    }
}
