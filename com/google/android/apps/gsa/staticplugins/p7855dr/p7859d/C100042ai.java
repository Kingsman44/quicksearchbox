package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88287wb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88289wd;
import com.google.android.apps.gsa.shared.p7148ui.p7150b.C90655d;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.ai */
/* compiled from: PG */
public final /* synthetic */ class C100042ai implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100053at f279770a;

    public /* synthetic */ C100042ai(C100053at atVar) {
        this.f279770a = atVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        Object obj2;
        C100053at atVar = this.f279770a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            atVar.mo91723g();
            C88246uo uoVar = ((ServiceEventData) axVar.mo56107c()).f236959a;
            C62940bt r1 = C62942bv.checkIsLite(C88287wb.f238779a);
            uoVar.mo58887l(r1);
            Object l = uoVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj2 = r1.f169969b;
            } else {
                obj2 = r1.mo58889c(l);
            }
            C88289wd wdVar = (C88289wd) obj2;
            atVar.f279788C.getClass();
            C90655d dVar = new C90655d(atVar.f279797b, atVar.f279799d);
            dVar.f253531b = wdVar.f238782a;
            dVar.f253532c = wdVar.f238783b;
            dVar.f253533d = wdVar.f238784c;
            dVar.f253535f = C87739bu.m142761a(wdVar.f238785d);
            dVar.f253534e = wdVar.f238786e;
            dVar.f253536g = C87739bu.m142761a(wdVar.f238787f);
            dVar.f253537h = C87739bu.m142761a(wdVar.f238788g);
            dVar.mo84948a();
            atVar.f279786A = dVar;
            C90655d dVar2 = atVar.f279786A;
            if (dVar2.f253538i == null) {
                dVar2.mo84948a();
            }
            C44565p pVar = dVar2.f253538i;
            if (pVar != null) {
                pVar.show();
            }
        }
    }
}
