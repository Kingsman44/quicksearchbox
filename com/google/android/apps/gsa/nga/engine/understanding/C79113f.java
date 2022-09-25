package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f */
/* compiled from: PG */
final class C79113f extends C78983aj {

    /* renamed from: a */
    private final C74757n f217504a;

    /* renamed from: b */
    private final Optional f217505b;

    public C79113f(C74757n nVar, Optional optional) {
        this.f217504a = nVar;
        this.f217505b = optional;
    }

    /* renamed from: a */
    public final C74757n mo73746a() {
        return this.f217504a;
    }

    /* renamed from: b */
    public final Optional mo73747b() {
        return this.f217505b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78983aj) {
            C78983aj ajVar = (C78983aj) obj;
            return this.f217504a.equals(ajVar.mo73746a()) && this.f217505b.equals(ajVar.mo73747b());
        }
    }

    public final int hashCode() {
        return ((this.f217504a.hashCode() ^ 1000003) * 1000003) ^ this.f217505b.hashCode();
    }

    public final String toString() {
        String obj = this.f217504a.toString();
        String valueOf = String.valueOf(this.f217505b);
        return "QueryUnderstandingResult{query=" + obj + ", interpretation=" + valueOf + "}";
    }
}
