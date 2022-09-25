package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.f */
/* compiled from: PG */
public final /* synthetic */ class C90372f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f252401a;

    public /* synthetic */ C90372f(int i) {
        this.f252401a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f252401a;
        List list = (List) obj;
        if (i >= list.size()) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k((BundledMessageNotification) list.get(i));
    }
}
