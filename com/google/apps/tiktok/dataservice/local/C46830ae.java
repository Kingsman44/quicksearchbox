package com.google.apps.tiktok.dataservice.local;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.dataservice.local.ae */
/* compiled from: PG */
public final /* synthetic */ class C46830ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46838am f122247a;

    public /* synthetic */ C46830ae(C46838am amVar) {
        this.f122247a = amVar;
    }

    public final void run() {
        C46838am amVar = this.f122247a;
        C58800sl lA = amVar.f122257a.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C46841ap apVar = (C46841ap) entry.getValue();
            C46831af afVar = new C46831af((C46852f) entry.getKey());
            C46832ag agVar = new C46832ag(amVar, apVar);
            C19559g.m37304c();
            C58838bb.m90866a(apVar.f122265a, "LocalSubscriptionStateReference used after free.");
            C58833ax c = apVar.f122265a.mo50846c();
            if (c.mo56113h()) {
                apVar.f122265a = apVar.f122265a.mo50848e((C46844as) c.mo56107c());
            }
            C58833ax d = apVar.f122265a.mo50847d();
            C58833ax a = apVar.f122265a.mo50844a();
            if (d.mo56113h()) {
                afVar.mo40846a((C46844as) d.mo56107c());
            }
            if (a.mo56113h()) {
                agVar.mo40846a((C60870cx) a.mo56107c());
            }
        }
    }
}
