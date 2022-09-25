package com.google.apps.tiktok.tracing;

import androidx.p060c.C0984n;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.tracing.bm */
/* compiled from: PG */
public final class C47562bm extends C47563bn implements C47561bl {

    /* renamed from: a */
    public static final C47563bn f123426a = new C47562bm((C47563bn) null, new C0984n(0)).mo51424e();

    public C47562bm(C47563bn bnVar, C0984n nVar) {
        super(bnVar, nVar);
    }

    /* renamed from: a */
    public final void mo51422a(C47560bk bkVar, Object obj) {
        C58838bb.m90884s(!this.f123429c, "Can't mutate after handing to trace");
        obj.getClass();
        C58838bb.m90884s(!mo51426g(bkVar), "Key already present");
        this.f123428b.put(bkVar, obj);
    }
}
