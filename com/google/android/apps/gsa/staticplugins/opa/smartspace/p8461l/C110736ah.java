package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.graphics.Bitmap;
import android.util.Pair;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.ah */
/* compiled from: PG */
public final /* synthetic */ class C110736ah implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308540a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f308541b;

    /* renamed from: c */
    public final /* synthetic */ List f308542c;

    /* renamed from: d */
    public final /* synthetic */ C83800p f308543d;

    public /* synthetic */ C110736ah(C110764bi biVar, C58495hd hdVar, List list, C83800p pVar) {
        this.f308540a = biVar;
        this.f308541b = hdVar;
        this.f308542c = list;
        this.f308543d = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C110764bi biVar = this.f308540a;
        C58495hd hdVar = this.f308541b;
        List list = this.f308542c;
        C83800p pVar = this.f308543d;
        Pair pair = (Pair) obj;
        C60870cx cxVar3 = (C60870cx) pair.second;
        C58833ax axVar = (C58833ax) pair.first;
        if (axVar.mo56113h()) {
            C92113i[] iVarArr = new C92113i[1];
            C50818do doVar = ((C83741am) ((!biVar.f308612c.mo77184w() || !biVar.f308612c.mo77185x()) ? biVar.mo98868f(hdVar, axVar) : axVar).mo56107c()).f228252c;
            if (doVar == null) {
                doVar = C50818do.f132293H;
            }
            C50818do doVar2 = ((C83741am) axVar.mo56107c()).f228252c;
            if (doVar2 == null) {
                doVar2 = C50818do.f132293H;
            }
            iVarArr[0] = new C92113i(doVar, biVar.mo98865a(doVar2), true);
            biVar.mo98881s(iVarArr);
            if (biVar.f308612c.mo77172j()) {
                cxVar2 = biVar.mo98878p(iVarArr, cxVar3);
            } else {
                cxVar2 = biVar.mo98877o(iVarArr);
            }
            list.add(cxVar2);
        }
        C58833ax e = biVar.mo98867e(pVar);
        if (e.mo56113h()) {
            C92113i[] iVarArr2 = new C92113i[1];
            C50818do doVar3 = ((C83741am) e.mo56107c()).f228252c;
            if (doVar3 == null) {
                doVar3 = C50818do.f132293H;
            }
            iVarArr2[0] = new C92113i(doVar3, (Bitmap) null, true);
            biVar.mo98881s(iVarArr2);
            if (biVar.f308612c.mo77172j()) {
                cxVar = biVar.mo98878p(iVarArr2, cxVar3);
            } else {
                cxVar = biVar.mo98877o(iVarArr2);
            }
            list.add(cxVar);
        }
        if (list.isEmpty()) {
            return C118826c.f331423b;
        }
        biVar.mo98882t(pVar);
        return C118826c.m197212b(list);
    }
}
