package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C78200c implements C83343ad {

    /* renamed from: a */
    public static final /* synthetic */ C78200c f215314a = new C78200c();

    private /* synthetic */ C78200c() {
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        C78224b bVar = (C78224b) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        boolean z = false;
        if (!booleanValue && !booleanValue2 && !bVar.mo73148k(C89160q.CLIENT_OP_EXCLUSIVE_STATE)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
