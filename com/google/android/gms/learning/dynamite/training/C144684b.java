package com.google.android.gms.learning.dynamite.training;

import com.google.android.libraries.micore.learning.p2258a.C29697g;

/* renamed from: com.google.android.gms.learning.dynamite.training.b */
/* compiled from: PG */
final class C144684b extends C144707c {

    /* renamed from: a */
    private final C29697g f391455a;

    public C144684b(C29697g gVar) {
        this.f391455a = gVar;
    }

    /* renamed from: b */
    public final int mo120140b() {
        return 2;
    }

    /* renamed from: c */
    public final C29697g mo120151c() {
        return this.f391455a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C144706bv) {
            C144706bv bvVar = (C144706bv) obj;
            if (bvVar.mo120140b() != 2 || !this.f391455a.equals(bvVar.mo120151c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f391455a.hashCode();
    }

    public final String toString() {
        String obj = this.f391455a.toString();
        return "TrainingTaskKey{personalizedTrainingOptions=" + obj + "}";
    }
}
