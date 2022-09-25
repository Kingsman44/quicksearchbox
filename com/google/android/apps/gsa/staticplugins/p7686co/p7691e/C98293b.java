package com.google.android.apps.gsa.staticplugins.p7686co.p7691e;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.e.b */
/* compiled from: PG */
public final /* synthetic */ class C98293b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C98303l f274398a;

    public /* synthetic */ C98293b(C98303l lVar) {
        this.f274398a = lVar;
    }

    public final Object apply(Object obj) {
        C98303l lVar = this.f274398a;
        C98304m mVar = (C98304m) obj;
        C58976aa aaVar = C58975e.f156826a;
        C98305n nVar = (C98305n) mVar.instance;
        if (nVar.f274422e == 0) {
            if (nVar.f274421d == 0) {
                ((C118831d) lVar.f274413d.mo6453a()).mo104025g(1);
            } else {
                ((C118831d) lVar.f274414e.mo6453a()).mo104025g(1);
                ((C118831d) lVar.f274415f.mo6453a()).mo104025g((long) ((C98305n) mVar.instance).f274421d);
            }
        }
        int i = ((C98305n) mVar.instance).f274422e;
        mVar.copyOnWrite();
        C98305n nVar2 = (C98305n) mVar.instance;
        nVar2.f274418a |= 8;
        nVar2.f274422e = i + 1;
        return mVar;
    }
}
