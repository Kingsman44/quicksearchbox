package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4552o.aea;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C102892aa implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C102909ar f287347a;

    public /* synthetic */ C102892aa(C102909ar arVar) {
        this.f287347a = arVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C60870cx cxVar;
        C102909ar arVar = this.f287347a;
        if (!arVar.mo93530j()) {
            return C60856cj.m92900i(aea.ACCOUNT_CHECKER_DISABLED);
        }
        ArrayList arrayList = new ArrayList();
        for (Account account : ((C86054o) arVar.f287368b.mo27525b()).mo79684r()) {
            C22871g gVar = arVar.f287371e;
            arrayList.add(gVar.mo28205e(gVar.mo28209i(((C86054o) arVar.f287368b.mo27525b()).mo79670c(account, "HOSTED"), "[NGA] NgaAccountChecker.checkSingleAccount", new C102904am(account)), "[NGA] NgaAccountChecker.checkSingleAccountFailed", Throwable.class, new C102905an(account)));
        }
        C60870cx j = arVar.f287371e.mo28210j(C60856cj.m92906o(arrayList), "[NGA] NgaAccountChecker.collectResults", new C102906ao(arVar));
        synchronized (arVar.f287372f) {
            arVar.f287374h = arVar.f287371e.mo28209i(j, "[NGA] NgaAccountChecker.refreshDasherAccountStatus", new C102898ag(arVar));
            cxVar = arVar.f287374h;
        }
        return cxVar;
    }
}
