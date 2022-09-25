package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80701cc;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80744ds;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80767eo;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80772et;
import com.google.android.apps.gsa.nga.shared.p6417x.C83344ae;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.aq */
/* compiled from: PG */
public final /* synthetic */ class C82062aq implements C83344ae {

    /* renamed from: a */
    public static final /* synthetic */ C82062aq f224296a = new C82062aq();

    private /* synthetic */ C82062aq() {
    }

    /* renamed from: a */
    public final Object mo73140a(Object obj, Object obj2, Object obj3, Object obj4) {
        C80744ds dsVar = (C80744ds) obj;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C80701cc ccVar = (C80701cc) obj4;
        int a = C80767eo.m128635a(((C80772et) obj2).f221685b);
        if (a != 0 && a == 3 && dsVar.mo74652f() && !booleanValue) {
            return C82083bk.FULL_SCREEN;
        }
        if (dsVar.mo74654h()) {
            return C82083bk.TRIPLE_CONTENT;
        }
        if (dsVar.mo74651e()) {
            return C82083bk.DOUBLE_CONTENT;
        }
        if (dsVar.mo74653g()) {
            return C82083bk.SINGLE_CONTENT;
        }
        return C82083bk.GONE;
    }
}
