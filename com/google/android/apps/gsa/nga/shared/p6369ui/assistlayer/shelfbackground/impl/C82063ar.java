package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80701cc;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80744ds;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.ar */
/* compiled from: PG */
public final /* synthetic */ class C82063ar implements C83343ad {

    /* renamed from: a */
    public static final /* synthetic */ C82063ar f224297a = new C82063ar();

    private /* synthetic */ C82063ar() {
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        C80744ds dsVar = (C80744ds) obj;
        C80701cc ccVar = (C80701cc) obj2;
        if (((C82083bk) obj3).equals(C82083bk.GONE)) {
            return C82099o.INACTIVE;
        }
        if (ccVar.mo74441d()) {
            return C82099o.ACTIVE_WITH_CARD;
        }
        return C82099o.ACTIVE_WITHOUT_CARD;
    }
}
