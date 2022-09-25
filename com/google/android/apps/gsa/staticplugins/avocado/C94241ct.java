package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4543n.p4546c.C59401i;
import com.google.common.p4543n.p4546c.C59407o;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ct */
/* compiled from: PG */
public final /* synthetic */ class C94241ct implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C94256dh f263348a;

    /* renamed from: b */
    public final /* synthetic */ C83923j f263349b;

    public /* synthetic */ C94241ct(C94256dh dhVar, C83923j jVar) {
        this.f263348a = dhVar;
        this.f263349b = jVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C94256dh dhVar = this.f263348a;
        C83923j jVar = this.f263349b;
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14327)).mo56386p("All images sent successfully");
        if (!dhVar.f263396k.mo77278a().mo56113h()) {
            ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14315)).mo56386p("Should not happen, account not exist!");
        }
        Account account = (Account) dhVar.f263396k.mo77278a().mo56107c();
        return dhVar.f263392g.mo28210j(C90877ak.m148469c(dhVar.f263392g, "fetch cloud validation result", new C94242cu(dhVar, account), new C59401i(C59407o.m92308d(C94256dh.f263379b), (double) ((int) dhVar.f263389d.mo79743a(C90082eg.f249902aR)), (int) dhVar.f263389d.mo79743a(C90082eg.f249901aQ))), "enable avocado bit", new C94239cr(dhVar, jVar, account));
    }
}
