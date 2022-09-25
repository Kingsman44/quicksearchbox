package com.google.android.apps.search.googleapp.customtabs.p10152d;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.n */
/* compiled from: PG */
public final /* synthetic */ class C133753n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133756q f364299a;

    public /* synthetic */ C133753n(C133756q qVar) {
        this.f364299a = qVar;
    }

    public final Object apply(Object obj) {
        boolean z;
        C133746g gVar = (C133746g) obj;
        Runnable runnable = this.f364299a.f364309h;
        synchronized (gVar.f364286d) {
            z = false;
            if (gVar.f364290h.add(runnable) && gVar.f364289g) {
                z = true;
            }
        }
        if (z) {
            ((C133752m) runnable).f364298a.mo111387b();
        }
        return gVar;
    }
}
