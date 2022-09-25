package com.google.common.util.concurrent;

/* renamed from: com.google.common.util.concurrent.ab */
/* compiled from: PG */
final class C60794ab implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C60800ah f164850a;

    /* renamed from: b */
    final /* synthetic */ C60817ay f164851b;

    public C60794ab(C60817ay ayVar, C60800ah ahVar) {
        this.f164851b = ayVar;
        this.f164850a = ahVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60802aj ajVar = new C60802aj();
        try {
            C60817ay a = this.f164850a.mo38146a(ajVar.f164859a);
            a.mo57277i(this.f164851b.f164884b);
            return a.f164885c;
        } finally {
            this.f164851b.f164884b.mo57261b(ajVar, C60826bg.f164896a);
        }
    }

    public final String toString() {
        return this.f164850a.toString();
    }
}
