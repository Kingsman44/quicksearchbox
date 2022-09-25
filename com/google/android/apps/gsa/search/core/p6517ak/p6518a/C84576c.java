package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import com.google.speech.p5230n.p5232b.C67402ar;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.c */
/* compiled from: PG */
final class C84576c extends C84577d {

    /* renamed from: a */
    private final C67402ar f230164a;

    public C84576c(C67402ar arVar) {
        this.f230164a = arVar;
    }

    /* renamed from: b */
    public final C84573ad mo78324b() {
        return C84573ad.TEXT;
    }

    /* renamed from: d */
    public final C67402ar mo78331d() {
        return this.f230164a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C84574ae) {
            C84574ae aeVar = (C84574ae) obj;
            if (C84573ad.TEXT != aeVar.mo78324b() || !this.f230164a.equals(aeVar.mo78331d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f230164a.hashCode();
    }

    public final String toString() {
        String obj = this.f230164a.toString();
        return "Utterance{text=" + obj + "}";
    }
}
