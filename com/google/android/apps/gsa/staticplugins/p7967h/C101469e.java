package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.staticplugins.opa.zerostate.C115082t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.e */
/* compiled from: PG */
public final /* synthetic */ class C101469e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f283116a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f283117b;

    public /* synthetic */ C101469e(C60870cx cxVar, C60870cx cxVar2) {
        this.f283116a = cxVar;
        this.f283117b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f283116a;
        C60870cx cxVar2 = this.f283117b;
        ArrayList arrayList = new ArrayList();
        for (C115082t tVar : (List) C60856cj.m92909r(cxVar)) {
            if ((tVar.f319454a & 2) != 0) {
                arrayList.add(tVar.f319456c);
            }
        }
        for (C115082t tVar2 : (List) C60856cj.m92909r(cxVar2)) {
            if ((tVar2.f319454a & 2) != 0) {
                arrayList.add(tVar2.f319456c);
            }
        }
        return arrayList;
    }
}
