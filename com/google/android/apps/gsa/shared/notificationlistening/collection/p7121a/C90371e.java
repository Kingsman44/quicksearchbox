package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.common.base.C58817ah;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.e */
/* compiled from: PG */
public final /* synthetic */ class C90371e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f252400a;

    public /* synthetic */ C90371e(String str) {
        this.f252400a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f252400a;
        for (BundledMessageNotification bundledMessageNotification : (List) obj) {
            if (C58832aw.m90831a(bundledMessageNotification.mo84119i(), str)) {
                return C58833ax.m90834k(bundledMessageNotification);
            }
        }
        return C58836b.f156633a;
    }
}
