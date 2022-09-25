package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.android.libraries.assistant.contexttrigger.C17693f;
import com.google.android.libraries.assistant.contexttrigger.C17737g;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3807b.p3808a.C48923y;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.n */
/* compiled from: PG */
public final /* synthetic */ class C17771n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17774q f51020a;

    /* renamed from: b */
    public final /* synthetic */ C48923y f51021b;

    /* renamed from: c */
    public final /* synthetic */ C17693f f51022c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f51023d;

    public /* synthetic */ C17771n(C17774q qVar, C48923y yVar, C17693f fVar, C58833ax axVar) {
        this.f51020a = qVar;
        this.f51021b = yVar;
        this.f51022c = fVar;
        this.f51023d = axVar;
    }

    public final C60870cx apply(Object obj) {
        C17774q qVar = this.f51020a;
        C48923y yVar = this.f51021b;
        C17693f fVar = this.f51022c;
        C58833ax axVar = this.f51023d;
        Void voidR = (Void) obj;
        C36314g gVar = qVar.f51029a;
        C48919u uVar = yVar.f126603b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        String name = a.name();
        C48919u uVar2 = yVar.f126603b;
        if (uVar2 == null) {
            uVar2 = C48919u.f126586g;
        }
        String str = uVar2.f126593f;
        C48917s sVar = fVar.f50869c;
        if (sVar == null) {
            sVar = C48917s.f126578f;
        }
        C48952az azVar = sVar.f126582c;
        if (azVar == null) {
            azVar = C48952az.f126657c;
        }
        String a2 = C36314g.m64795a(azVar);
        C58976aa aaVar = C58975e.f156826a;
        gVar.mo40100b(name, str, a2, 4);
        ((C17737g) axVar.mo56107c()).mo23454a(yVar);
        return C60866ct.f164955a;
    }
}
