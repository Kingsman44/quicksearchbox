package com.google.common.util.concurrent;

/* renamed from: com.google.common.util.concurrent.ad */
/* compiled from: PG */
final class C60796ad implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C60801ai f164854a;

    /* renamed from: b */
    final /* synthetic */ C60817ay f164855b;

    public C60796ad(C60817ay ayVar, C60801ai aiVar) {
        this.f164855b = ayVar;
        this.f164854a = aiVar;
    }

    public final C60870cx apply(Object obj) {
        C60802aj ajVar = this.f164855b.f164884b;
        C60801ai aiVar = this.f164854a;
        C60802aj ajVar2 = new C60802aj();
        try {
            C60817ay a = aiVar.mo20982a(ajVar2.f164859a, obj);
            a.mo57277i(ajVar2);
            return a.f164885c;
        } finally {
            ajVar.mo57261b(ajVar2, C60826bg.f164896a);
        }
    }

    public final String toString() {
        return this.f164854a.toString();
    }
}
