package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.bb */
/* compiled from: PG */
public final /* synthetic */ class C110757bb implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308581a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f308582b;

    /* renamed from: c */
    public final /* synthetic */ boolean f308583c;

    /* renamed from: d */
    public final /* synthetic */ C83800p f308584d;

    public /* synthetic */ C110757bb(C110764bi biVar, C58495hd hdVar, boolean z, C83800p pVar) {
        this.f308581a = biVar;
        this.f308582b = hdVar;
        this.f308583c = z;
        this.f308584d = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58833ax axVar;
        C110764bi biVar = this.f308581a;
        C58495hd hdVar = this.f308582b;
        boolean z = this.f308583c;
        C83800p pVar = this.f308584d;
        Pair pair = (Pair) obj;
        C60870cx cxVar = (C60870cx) pair.second;
        if (biVar.mo98884v()) {
            axVar = (C58833ax) pair.first;
        } else {
            axVar = biVar.mo98868f(hdVar, (C58833ax) pair.first);
        }
        ArrayList arrayList = new ArrayList();
        if (axVar.mo56113h()) {
            C50818do doVar = ((C83741am) axVar.mo56107c()).f228252c;
            if (doVar == null) {
                doVar = C50818do.f132293H;
            }
            C50818do doVar2 = ((C83741am) axVar.mo56107c()).f228252c;
            if (doVar2 == null) {
                doVar2 = C50818do.f132293H;
            }
            arrayList.add(new C92113i(doVar, biVar.mo98865a(doVar2), false));
        }
        if (!z) {
            long b = biVar.f308625p.mo26870b();
            C50818do doVar3 = ((C83741am) pVar.mo77058d().mo56107c()).f228252c;
            if (doVar3 == null) {
                doVar3 = C50818do.f132293H;
            }
            C50790cn cnVar = (C50790cn) doVar3.toBuilder();
            C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
            csVar.copyOnWrite();
            C50796ct ctVar = (C50796ct) csVar.instance;
            ctVar.f132225a |= 1;
            ctVar.f132226b = b - 10000;
            cnVar.copyOnWrite();
            C50818do doVar4 = (C50818do) cnVar.instance;
            C50796ct ctVar2 = (C50796ct) csVar.build();
            ctVar2.getClass();
            doVar4.f132320q = ctVar2;
            doVar4.f132304a |= 32768;
            C50818do doVar5 = (C50818do) cnVar.build();
            C83740al alVar = (C83740al) C83741am.f228248e.createBuilder();
            alVar.copyOnWrite();
            C83741am amVar = (C83741am) alVar.instance;
            doVar5.getClass();
            amVar.f228252c = doVar5;
            amVar.f228250a |= 4;
            C50818do doVar6 = ((C83741am) alVar.build()).f228252c;
            if (doVar6 == null) {
                doVar6 = C50818do.f132293H;
            }
            arrayList.add(new C92113i(doVar6, (Bitmap) null, true));
            C92113i[] iVarArr = new C92113i[arrayList.size()];
            arrayList.toArray(iVarArr);
            biVar.mo98881s(iVarArr);
            return biVar.mo98876n(iVarArr, cxVar, pVar);
        }
        C58833ax e = biVar.mo98867e(pVar);
        if (!e.mo56113h()) {
            return C118826c.f331423b;
        }
        C50818do doVar7 = ((C83741am) e.mo56107c()).f228252c;
        if (doVar7 == null) {
            doVar7 = C50818do.f132293H;
        }
        C50729n nVar = doVar7.f132314k;
        if (nVar == null) {
            nVar = C50729n.f132007g;
        }
        return biVar.f308614e.mo28210j(biVar.f308630u.mo85418e(Uri.parse(nVar.f132011c), 7), BuildConfig.FLAVOR, new C110734af(biVar, arrayList, e, cxVar, pVar));
    }
}
