package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.q */
/* compiled from: PG */
public final /* synthetic */ class C78762q implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78849w f216821a;

    public /* synthetic */ C78762q(C78849w wVar) {
        this.f216821a = wVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78849w wVar = this.f216821a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((C59052c) ((C59052c) C78849w.f217000a.mo56224b()).mo56372aa(5062)).mo56389s("onIsEnabledChanged, isEnabled: %s", Boolean.valueOf(booleanValue));
        int i = 0;
        if (booleanValue) {
            C58485gu guVar = wVar.f217002c;
            int size = guVar.size();
            while (i < size) {
                ((C78728n) guVar.get(i)).mo73113i();
                i++;
            }
            return;
        }
        C58485gu lD = wVar.f217002c.mo55401lD();
        int size2 = lD.size();
        while (i < size2) {
            ((C78728n) lD.get(i)).mo73112h();
            i++;
        }
    }
}
