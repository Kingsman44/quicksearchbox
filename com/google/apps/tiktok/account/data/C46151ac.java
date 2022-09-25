package com.google.apps.tiktok.account.data;

import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.account.data.ac */
/* compiled from: PG */
public final /* synthetic */ class C46151ac implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46155ag f121063a;

    public /* synthetic */ C46151ac(C46155ag agVar) {
        this.f121063a = agVar;
    }

    public final Object apply(Object obj) {
        C46155ag agVar = this.f121063a;
        C46163ao aoVar = (C46163ao) obj;
        boolean z = false;
        if ((aoVar.f121084a & 2) != 0 && aoVar.f121086c == ((long) agVar.f121073g)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
