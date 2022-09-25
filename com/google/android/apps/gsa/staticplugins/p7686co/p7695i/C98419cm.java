package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.cm */
/* compiled from: PG */
public final /* synthetic */ class C98419cm implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C98426ct f274769a;

    public /* synthetic */ C98419cm(C98426ct ctVar) {
        this.f274769a = ctVar;
    }

    public final Object apply(Object obj) {
        C98426ct ctVar = this.f274769a;
        if (!((Boolean) obj).booleanValue()) {
            return C98423cq.NETWORK_UNAVAILABLE;
        }
        if (!ctVar.f274788f) {
            return C98423cq.NETWORK_AVAILABLE;
        }
        ctVar.f274788f = false;
        return C98423cq.NETWORK_RESTORED;
    }
}
