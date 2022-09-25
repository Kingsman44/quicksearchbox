package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl;

import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80701cc;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80725d;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80762ej;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80796fq;
import com.google.android.apps.gsa.nga.shared.p6417x.C83347ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.lockscreen.impl.n */
/* compiled from: PG */
public final /* synthetic */ class C81859n implements C83347ah {

    /* renamed from: a */
    public static final /* synthetic */ C81859n f223849a = new C81859n();

    private /* synthetic */ C81859n() {
    }

    /* renamed from: a */
    public final Object mo75215a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        C80701cc ccVar = (C80701cc) obj;
        Boolean bool = (Boolean) obj2;
        C80762ej ejVar = (C80762ej) obj3;
        C80796fq fqVar = (C80796fq) obj4;
        C80725d dVar = (C80725d) obj5;
        Boolean bool2 = (Boolean) obj6;
        C58976aa aaVar = C58975e.f156826a;
        boolean booleanValue = ((Boolean) obj7).booleanValue();
        int i = 0;
        if (!booleanValue || !bool.booleanValue()) {
            return false;
        }
        if ((C1888a.m5150d() && ejVar.mo74563b()) || fqVar.f221718b) {
            return false;
        }
        int i2 = dVar.f221609a;
        if (i2 == 0) {
            i = 2;
        } else if (i2 == 1) {
            i = 3;
        } else if (i2 == 2) {
            i = 4;
        }
        if (i == 0) {
            i = 1;
        }
        int i3 = i - 2;
        if (i3 == -1) {
            throw new IllegalStateException("Unrecognized AmvientVisualSearchState.");
        } else if (i3 == 1) {
            return false;
        } else {
            if (i3 == 2 || (!bool2.booleanValue() && ejVar.mo74563b() && !ejVar.mo74564c())) {
                return true;
            }
            return false;
        }
    }
}
