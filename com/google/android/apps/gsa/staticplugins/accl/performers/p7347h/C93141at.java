package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.databinding.C0118a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.at */
/* compiled from: PG */
public final /* synthetic */ class C93141at implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259787a;

    public /* synthetic */ C93141at(C93150bb bbVar) {
        this.f259787a = bbVar;
    }

    public final Object apply(Object obj) {
        C93150bb bbVar = this.f259787a;
        Exception exc = (Exception) obj;
        C59104x d = C93150bb.f259800a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
        C0118a.m110r(d, "#perform error fetching notification from active cache", 13392, exc, C58979ad.FULL);
        return bbVar.mo87551b("#perform error fetching notification from active cache Error:".concat(String.valueOf(exc.getMessage())));
    }
}
