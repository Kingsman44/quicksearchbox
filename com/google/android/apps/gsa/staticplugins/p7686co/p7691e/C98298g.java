package com.google.android.apps.gsa.staticplugins.p7686co.p7691e;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.e.g */
/* compiled from: PG */
public final /* synthetic */ class C98298g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C98303l f274405a;

    public /* synthetic */ C98298g(C98303l lVar) {
        this.f274405a = lVar;
    }

    public final Object apply(Object obj) {
        C98303l lVar = this.f274405a;
        C98304m mVar = (C98304m) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (((C98305n) mVar.instance).f274420c == 0) {
            ((C118831d) lVar.f274412c.mo6453a()).mo104025g(1);
        }
        int i = ((C98305n) mVar.instance).f274420c;
        mVar.copyOnWrite();
        C98305n nVar = (C98305n) mVar.instance;
        nVar.f274418a |= 2;
        nVar.f274420c = i + 1;
        return mVar;
    }
}
