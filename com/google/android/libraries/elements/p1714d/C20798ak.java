package com.google.android.libraries.elements.p1714d;

import com.google.android.libraries.elements.internal.C21359t;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68045ah;
import com.youtube.p5283a.p5284a.C68098t;

/* renamed from: com.google.android.libraries.elements.d.ak */
/* compiled from: PG */
final class C20798ak {

    /* renamed from: a */
    public final C68098t f58229a;

    /* renamed from: b */
    private final C68045ah f58230b;

    public C20798ak(C68098t tVar, C68045ah ahVar) {
        this.f58229a = tVar;
        this.f58230b = ahVar;
    }

    /* renamed from: a */
    private static C68044ag m39037a(C68045ah ahVar) {
        C68044ag agVar = new C68044ag();
        for (int i = 0; i < ahVar.mo60108g(); i++) {
            ahVar.mo60110i(agVar, i);
            if (agVar.mo60106i() == 224886694) {
                return agVar;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20798ak)) {
            return false;
        }
        C20798ak akVar = (C20798ak) obj;
        if (C21359t.m40387m(this.f58229a, akVar.f58229a)) {
            if (C21359t.m40387m(m39037a(this.f58230b), m39037a(akVar.f58230b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        C68098t tVar = this.f58229a;
        if (tVar == null) {
            i = 0;
        } else {
            i = tVar.hashCode();
        }
        return i ^ this.f58230b.hashCode();
    }
}
