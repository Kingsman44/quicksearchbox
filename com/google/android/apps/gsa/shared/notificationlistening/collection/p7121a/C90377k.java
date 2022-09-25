package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import com.google.p4741o.p4742a.p4743a.C62855d;
import com.google.p4741o.p4742a.p4743a.C62859h;
import com.google.p4741o.p4742a.p4743a.C62861j;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.k */
/* compiled from: PG */
public final /* synthetic */ class C90377k implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C90377k f252413a = new C90377k();

    private /* synthetic */ C90377k() {
    }

    public final Object apply(Object obj) {
        C62971cq cqVar = ((C62859h) obj).f169745a;
        if (cqVar.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        C62971cq cqVar2 = ((C62855d) cqVar.get(0)).f169739a;
        if (cqVar2.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return ((C62861j) cqVar2.get(0)).f169748a;
    }
}
