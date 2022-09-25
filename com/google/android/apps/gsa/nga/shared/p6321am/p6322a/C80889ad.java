package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C80889ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f221844a;

    public /* synthetic */ C80889ad(C58485gu guVar) {
        this.f221844a = guVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f221844a;
        List list = (List) obj;
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < guVar.size(); i++) {
            if (((Boolean) list.get(i)).booleanValue()) {
                e.mo55395g(guVar.get(i));
            }
        }
        return e.mo55394f();
    }
}
