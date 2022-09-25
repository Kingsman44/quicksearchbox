package com.google.android.apps.search.assistant.verticals.recommend.p10072c;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.c.f */
/* compiled from: PG */
public final /* synthetic */ class C132522f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C132523g f361675a;

    public /* synthetic */ C132522f(C132523g gVar) {
        this.f361675a = gVar;
    }

    public final Object apply(Object obj) {
        C132523g gVar = this.f361675a;
        Integer num = (Integer) obj;
        boolean z = false;
        if ((gVar.f361679d.mo110794a("android.permission.ACCESS_COARSE_LOCATION") || gVar.f361679d.mo110794a("android.permission.ACCESS_FINE_LOCATION")) && num.intValue() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
