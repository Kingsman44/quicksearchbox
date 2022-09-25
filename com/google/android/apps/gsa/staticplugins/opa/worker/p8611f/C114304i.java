package com.google.android.apps.gsa.staticplugins.opa.worker.p8611f;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58528ij;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.f.i */
/* compiled from: PG */
public final /* synthetic */ class C114304i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114310o f316943a;

    /* renamed from: b */
    public final /* synthetic */ HashMap f316944b;

    public /* synthetic */ C114304i(C114310o oVar, HashMap hashMap) {
        this.f316943a = oVar;
        this.f316944b = hashMap;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114310o oVar = this.f316943a;
        AccountId accountId = (AccountId) obj;
        for (Map.Entry entry : this.f316944b.entrySet()) {
            new C90873ag(oVar.f316952b.mo41418a(accountId, (String) entry.getKey(), C58528ij.m90006F((Collection) entry.getValue()), C65813cq.PUSH_UPDATES), oVar.f316953c, String.format("Syncing TNG corpora from Geller Worker for corpus group %s", new Object[]{entry.getKey()}), new C114296a(entry)).mo85223a(new C114301f(entry));
        }
    }
}
