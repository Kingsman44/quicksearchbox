package com.google.android.gms.learning.dynamite.training;

import com.google.android.libraries.micore.learning.p2258a.C29695e;

/* renamed from: com.google.android.gms.learning.dynamite.training.a */
/* compiled from: PG */
final class C144657a extends C144707c {

    /* renamed from: a */
    private final C29695e f391404a;

    public C144657a(C29695e eVar) {
        this.f391404a = eVar;
    }

    /* renamed from: a */
    public final C29695e mo120139a() {
        return this.f391404a;
    }

    /* renamed from: b */
    public final int mo120140b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C144706bv) {
            C144706bv bvVar = (C144706bv) obj;
            if (bvVar.mo120140b() != 1 || !this.f391404a.equals(bvVar.mo120139a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f391404a.hashCode();
    }

    public final String toString() {
        String obj = this.f391404a.toString();
        return "TrainingTaskKey{federatedTrainingOptions=" + obj + "}";
    }
}
