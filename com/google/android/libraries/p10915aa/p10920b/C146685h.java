package com.google.android.libraries.p10915aa.p10920b;

import com.google.assistant.p3897e.p3902c.p3903a.p3904a.C50901d;

/* renamed from: com.google.android.libraries.aa.b.h */
/* compiled from: PG */
final class C146685h extends C146688k {

    /* renamed from: a */
    private final C50901d f396117a;

    public C146685h(C50901d dVar) {
        this.f396117a = dVar;
    }

    /* renamed from: a */
    public final C50901d mo123442a() {
        return this.f396117a;
    }

    /* renamed from: b */
    public final int mo123443b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146663ak) {
            C146663ak akVar = (C146663ak) obj;
            if (akVar.mo123443b() != 3 || !this.f396117a.equals(akVar.mo123442a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f396117a.hashCode();
    }

    public final String toString() {
        String obj = this.f396117a.toString();
        return "ProcessedScreenCondition{foregroundAppScreenCondition=" + obj + "}";
    }
}
