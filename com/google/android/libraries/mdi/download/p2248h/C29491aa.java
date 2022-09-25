package com.google.android.libraries.mdi.download.p2248h;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.aa */
/* compiled from: PG */
public final /* synthetic */ class C29491aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29494ad f79918a;

    public /* synthetic */ C29491aa(C29494ad adVar) {
        this.f79918a = adVar;
    }

    public final C60870cx apply(Object obj) {
        C29494ad adVar = this.f79918a;
        ArrayList arrayList = new ArrayList();
        C58836b bVar = C58836b.f156633a;
        for (C28708an anVar : (List) obj) {
            if (anVar != null && !anVar.f77997b.isEmpty()) {
                C29343e eVar = new C29343e();
                eVar.f79532a = anVar;
                eVar.f79534c = bVar;
                C60870cx a = adVar.f79922a.mo34712a(eVar.mo34325a());
                C29494ad.m54459b(a, anVar.f77997b, C58836b.f156633a, bVar);
                arrayList.add(a);
                C58801sm G = ((C58485gu) adVar.f79924c).listIterator(0);
                while (G.hasNext()) {
                    Account account = (Account) G.next();
                    C29409fd fdVar = adVar.f79922a;
                    eVar.f79533b = C58833ax.m90834k(account);
                    C60870cx a2 = fdVar.mo34712a(eVar.mo34325a());
                    C29494ad.m54459b(a2, anVar.f77997b, C58833ax.m90834k(account), bVar);
                    arrayList.add(a2);
                }
            }
        }
        return C29672d.m54726a(arrayList).mo34823a(C29492ab.f79919a, C60826bg.f164896a);
    }
}
