package com.google.android.apps.search.googleapp.search.p10411g;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.search.g.d */
/* compiled from: PG */
public final /* synthetic */ class C137455d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137458g f373857a;

    public /* synthetic */ C137455d(C137458g gVar) {
        this.f373857a = gVar;
    }

    public final Object apply(Object obj) {
        C137458g gVar = this.f373857a;
        Integer num = (Integer) obj;
        boolean z = false;
        if ((gVar.mo113748a("android.permission.ACCESS_COARSE_LOCATION") || gVar.mo113748a("android.permission.ACCESS_FINE_LOCATION")) && num.intValue() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
