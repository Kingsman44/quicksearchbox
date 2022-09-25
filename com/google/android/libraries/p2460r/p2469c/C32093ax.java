package com.google.android.libraries.p2460r.p2469c;

import androidx.core.p097i.C1972g;

/* renamed from: com.google.android.libraries.r.c.ax */
/* compiled from: PG */
final class C32093ax implements C32092aw {

    /* renamed from: a */
    private final C32091av f86171a;

    /* renamed from: b */
    private final C1972g f86172b = new C1972g(100);

    public C32093ax(C32091av avVar) {
        this.f86171a = avVar;
    }

    /* renamed from: a */
    public final C32138p mo37856a(C32091av avVar) {
        if (this.f86171a.equals(avVar)) {
            return (C32138p) this.f86172b.mo5126a();
        }
        throw new IllegalArgumentException(String.format("Given key %s does not match singleton key %s", new Object[]{avVar, this.f86171a}));
    }

    /* renamed from: b */
    public final void mo37857b(C32091av avVar, C32138p pVar) {
        if (this.f86171a.equals(avVar)) {
            this.f86172b.mo5127b(pVar);
        } else {
            throw new IllegalArgumentException(String.format("Given key %s does not match singleton key %s", new Object[]{avVar, this.f86171a}));
        }
    }
}
