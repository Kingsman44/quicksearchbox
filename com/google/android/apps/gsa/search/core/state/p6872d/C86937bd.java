package com.google.android.apps.gsa.search.core.state.p6872d;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.bd */
/* compiled from: PG */
final class C86937bd {

    /* renamed from: a */
    private static boolean f234769a;

    /* renamed from: b */
    private static C86930ax f234770b;

    /* renamed from: a */
    static void m140237a(C86930ax axVar) {
        if (f234769a) {
            f234770b = axVar;
            return;
        }
        f234769a = true;
        axVar.f234761a.mo80579G();
        f234769a = false;
        C86930ax axVar2 = f234770b;
        if (axVar2 != null) {
            f234770b = null;
            m140237a(axVar2);
        }
    }
}
