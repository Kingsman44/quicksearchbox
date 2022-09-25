package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.common.base.C58837ba;
import com.google.common.base.C58890d;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.ba */
/* compiled from: PG */
public final /* synthetic */ class C98073ba implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C98102cc f273841a;

    /* renamed from: b */
    public final /* synthetic */ String f273842b;

    public /* synthetic */ C98073ba(C98102cc ccVar, String str) {
        this.f273841a = ccVar;
        this.f273842b = str;
    }

    public final Object call() {
        Boolean valueOf;
        C98102cc ccVar = this.f273841a;
        String str = this.f273842b;
        synchronized (ccVar.f273894b) {
            valueOf = Boolean.valueOf(C58890d.m90990e(C58837ba.m90858g((String) ccVar.f273910r.f273875a), C58837ba.m90858g(str)));
        }
        return valueOf;
    }
}
