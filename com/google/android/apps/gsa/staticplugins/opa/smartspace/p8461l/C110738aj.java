package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.util.Pair;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.aj */
/* compiled from: PG */
public final /* synthetic */ class C110738aj implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308545a;

    /* renamed from: b */
    public final /* synthetic */ C83800p f308546b;

    /* renamed from: c */
    public final /* synthetic */ C58495hd f308547c;

    public /* synthetic */ C110738aj(C110764bi biVar, C83800p pVar, C58495hd hdVar) {
        this.f308545a = biVar;
        this.f308546b = pVar;
        this.f308547c = hdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110764bi biVar = this.f308545a;
        C83800p pVar = this.f308546b;
        C58495hd hdVar = this.f308547c;
        Pair pair = (Pair) obj;
        C60870cx cxVar = (C60870cx) pair.second;
        C58833ax axVar = (C58833ax) pair.first;
        boolean w = biVar.f308612c.mo77184w();
        if (!axVar.mo56113h()) {
            C50818do f = biVar.f308612c.mo77169f();
            C83740al alVar = (C83740al) C83741am.f228248e.createBuilder();
            alVar.copyOnWrite();
            C83741am amVar = (C83741am) alVar.instance;
            f.getClass();
            amVar.f228252c = f;
            amVar.f228250a |= 4;
            return biVar.mo98876n(biVar.mo98885w(C58833ax.m90834k((C83741am) alVar.build()), biVar.mo98867e(pVar), C58485gu.m89845m(), pVar.mo77062g(), w), cxVar, pVar);
        }
        if (!biVar.mo98884v()) {
            axVar = biVar.mo98868f(hdVar, axVar);
        }
        C92113i[] w2 = biVar.mo98885w(axVar, biVar.mo98867e(pVar), C58485gu.m89845m(), pVar.mo77062g(), w);
        biVar.mo98881s(w2);
        return biVar.mo98876n(w2, cxVar, pVar);
    }
}
