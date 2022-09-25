package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6205q.p6206a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80761ei;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80762ej;
import com.google.android.apps.gsa.nga.shared.p6417x.C83344ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.q.a.a */
/* compiled from: PG */
public final /* synthetic */ class C78764a implements C83344ae {

    /* renamed from: a */
    public static final /* synthetic */ C78764a f216822a = new C78764a();

    private /* synthetic */ C78764a() {
    }

    /* renamed from: a */
    public final Object mo73140a(Object obj, Object obj2, Object obj3, Object obj4) {
        C88079oj ojVar = (C88079oj) obj2;
        Boolean bool = (Boolean) obj3;
        Boolean bool2 = (Boolean) obj4;
        C80761ei e = C80762ej.m128620e();
        e.mo74559c(((Boolean) obj).booleanValue());
        boolean z = true;
        if (!ojVar.equals(C88079oj.RESUMED) && !ojVar.equals(C88079oj.PAUSED)) {
            z = false;
        }
        e.mo74560d(z);
        e.mo74558b(bool.booleanValue());
        e.mo74561e(bool2.booleanValue());
        return e.mo74557a();
    }
}
