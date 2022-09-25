package com.google.apps.tiktok.monitoring.feedback;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.b */
/* compiled from: PG */
final class C47464b extends C47473j {

    /* renamed from: a */
    private final C58833ax f123246a;

    /* renamed from: b */
    private final C58495hd f123247b;

    /* renamed from: c */
    private final C58833ax f123248c;

    public C47464b(C58833ax axVar, C58495hd hdVar, C58833ax axVar2) {
        if (axVar != null) {
            this.f123246a = axVar;
            if (hdVar != null) {
                this.f123247b = hdVar;
                this.f123248c = axVar2;
                return;
            }
            throw new NullPointerException("Null psdList");
        }
        throw new NullPointerException("Null accountName");
    }

    /* renamed from: a */
    public final C58833ax mo51301a() {
        return this.f123246a;
    }

    /* renamed from: b */
    public final C58833ax mo51302b() {
        return this.f123248c;
    }

    /* renamed from: c */
    public final C58495hd mo51303c() {
        return this.f123247b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47473j) {
            C47473j jVar = (C47473j) obj;
            return this.f123246a.equals(jVar.mo51301a()) && this.f123247b.equals(jVar.mo51303c()) && this.f123248c.equals(jVar.mo51302b());
        }
    }

    public final int hashCode() {
        return ((((this.f123246a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f123247b.entrySet())) * 1000003) ^ this.f123248c.hashCode();
    }

    public final String toString() {
        String obj = this.f123246a.toString();
        String obj2 = this.f123247b.toString();
        String obj3 = this.f123248c.toString();
        return "FeedbackContext{accountName=" + obj + ", psdList=" + obj2 + ", screenshot=" + obj3 + "}";
    }
}
