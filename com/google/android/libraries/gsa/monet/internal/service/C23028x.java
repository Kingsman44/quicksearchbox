package com.google.android.libraries.gsa.monet.internal.service;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.x */
/* compiled from: PG */
public final class C23028x {

    /* renamed from: a */
    public final C23029y f63351a;

    /* renamed from: b */
    private final C23015k f63352b;

    public C23028x(C23015k kVar, C23029y yVar) {
        this.f63352b = kVar;
        this.f63351a = yVar;
    }

    /* renamed from: a */
    public final void mo28449a(String str) {
        C23015k kVar = this.f63352b;
        C23029y a = this.f63351a.mo28450a(str);
        if (a != null) {
            kVar.mo28428r(str, a.f63354b, a, true);
            return;
        }
        throw new IllegalArgumentException("No child with the name ".concat(String.valueOf(str)));
    }
}
