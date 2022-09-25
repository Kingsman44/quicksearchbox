package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.assistant.p3781ad.p3789d.p3791b.C48718bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bm */
/* compiled from: PG */
public final /* synthetic */ class C113065bm implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C113071bs f313278a;

    /* renamed from: b */
    public final /* synthetic */ C111248k f313279b;

    public /* synthetic */ C113065bm(C113071bs bsVar, C111248k kVar) {
        this.f313278a = bsVar;
        this.f313279b = kVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C113071bs bsVar = this.f313278a;
        C111248k kVar = this.f313279b;
        C48718bz bzVar = (C48718bz) obj;
        bsVar.f313297l = Integer.valueOf(bzVar.f126053a.size());
        bsVar.f313298m = Integer.valueOf(bzVar.getSerializedSize());
        C111255r rVar = C111255r.USER_PROFILE;
        Integer num = bsVar.f313297l;
        num.getClass();
        Integer num2 = bsVar.f313298m;
        num2.getClass();
        kVar.mo99076a(rVar, String.format("User profile sizes initialized: %d, %d", new Object[]{num, num2}));
    }
}
