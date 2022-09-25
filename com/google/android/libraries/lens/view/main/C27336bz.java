package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.view.p2069am.C25342r;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.main.bz */
/* compiled from: PG */
public final /* synthetic */ class C27336bz implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74827a;

    /* renamed from: b */
    public final /* synthetic */ C25342r f74828b;

    public /* synthetic */ C27336bz(C27384dt dtVar, C25342r rVar) {
        this.f74827a = dtVar;
        this.f74828b = rVar;
    }

    public final Object call() {
        C27384dt dtVar = this.f74827a;
        C25342r rVar = this.f74828b;
        C27327bq bqVar = dtVar.f74881C;
        if (bqVar.f74765K) {
            ((C59052c) ((C59052c) C27327bq.f74753a.mo56224b()).mo56372aa(49729)).mo56389s("Action intent received: %s", rVar.f68973b);
            bqVar.f74816u.mo32832i(rVar);
            return null;
        }
        C59052c cVar = (C59052c) C27327bq.f74753a.mo56225c();
        cVar.mo56380ai(C58979ad.FULL);
        ((C59052c) cVar.mo56372aa(49728)).mo56389s("Action intent received while session inactive: %s", rVar.f68973b);
        return null;
    }
}
