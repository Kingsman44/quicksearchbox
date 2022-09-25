package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.android.libraries.assistant.contexttrigger.C17737g;
import com.google.android.libraries.assistant.contexttrigger.p1464h.C17741a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import com.google.assistant.p3803ag.p3807b.p3808a.C48923y;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.u */
/* compiled from: PG */
public final /* synthetic */ class C17731u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17695aa f50947a;

    /* renamed from: b */
    public final /* synthetic */ C48900b f50948b;

    /* renamed from: c */
    public final /* synthetic */ C48923y f50949c;

    public /* synthetic */ C17731u(C17695aa aaVar, C48900b bVar, C48923y yVar) {
        this.f50947a = aaVar;
        this.f50948b = bVar;
        this.f50949c = yVar;
    }

    public final void run() {
        C17695aa aaVar = this.f50947a;
        C48900b bVar = this.f50948b;
        C48923y yVar = this.f50949c;
        ((C17737g) aaVar.f50876b.get(bVar)).mo23454a(yVar);
        C17741a aVar = aaVar.f50879e;
        C48919u uVar = yVar.f126603b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        C48922x a2 = C48922x.m85306a(yVar.f126605d);
        if (a2 == null) {
            a2 = C48922x.UNKNOWN;
        }
        boolean z = a2 == C48922x.ACTIVE;
        ((C19567d) aVar.f50964a.f102817aA.mo6453a()).mo24822a(1, aVar.f50965b, a.name(), Boolean.valueOf(z));
    }
}
