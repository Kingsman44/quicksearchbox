package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.graphics.Bitmap;
import android.util.Pair;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.q */
/* compiled from: PG */
public final /* synthetic */ class C110781q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308678a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f308679b;

    /* renamed from: c */
    public final /* synthetic */ C83741am f308680c;

    /* renamed from: d */
    public final /* synthetic */ C83800p f308681d;

    public /* synthetic */ C110781q(C110764bi biVar, C58495hd hdVar, C83741am amVar, C83800p pVar) {
        this.f308678a = biVar;
        this.f308679b = hdVar;
        this.f308680c = amVar;
        this.f308681d = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C92113i[] iVarArr;
        C110764bi biVar = this.f308678a;
        C58495hd hdVar = this.f308679b;
        C83741am amVar = this.f308680c;
        C83800p pVar = this.f308681d;
        Pair pair = (Pair) obj;
        C60870cx cxVar = (C60870cx) pair.second;
        C58833ax axVar = (C58833ax) pair.first;
        if (!biVar.mo98884v()) {
            axVar = biVar.mo98868f(hdVar, axVar);
        }
        Bitmap bitmap = null;
        if (axVar.mo56113h()) {
            iVarArr = new C92113i[2];
            C50818do doVar = ((C83741am) axVar.mo56107c()).f228252c;
            if (doVar == null) {
                doVar = C50818do.f132293H;
            }
            C50818do doVar2 = ((C83741am) axVar.mo56107c()).f228252c;
            if (doVar2 == null) {
                doVar2 = C50818do.f132293H;
            }
            iVarArr[0] = new C92113i(doVar, biVar.mo98865a(doVar2), false);
            C50818do doVar3 = amVar.f228252c;
            if (doVar3 == null) {
                doVar3 = C50818do.f132293H;
            }
            C50818do b = biVar.mo98866b(doVar3);
            if (!pVar.mo77059e().isEmpty()) {
                bitmap = (Bitmap) pVar.mo77059e().get(0);
            }
            iVarArr[1] = new C92113i(b, bitmap, true);
        } else {
            iVarArr = new C92113i[1];
            C50818do doVar4 = amVar.f228252c;
            if (doVar4 == null) {
                doVar4 = C50818do.f132293H;
            }
            C50818do b2 = biVar.mo98866b(doVar4);
            if (!pVar.mo77059e().isEmpty()) {
                bitmap = (Bitmap) pVar.mo77059e().get(0);
            }
            iVarArr[0] = new C92113i(b2, bitmap, true);
        }
        biVar.mo98881s(iVarArr);
        return biVar.mo98876n(iVarArr, cxVar, pVar);
    }
}
