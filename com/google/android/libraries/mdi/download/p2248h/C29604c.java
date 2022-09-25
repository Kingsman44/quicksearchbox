package com.google.android.libraries.mdi.download.p2248h;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.c */
/* compiled from: PG */
public final /* synthetic */ class C29604c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29616m f80186a;

    /* renamed from: b */
    public final /* synthetic */ C29409fd f80187b;

    /* renamed from: c */
    public final /* synthetic */ C28708an f80188c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f80189d;

    /* renamed from: e */
    public final /* synthetic */ List f80190e;

    public /* synthetic */ C29604c(C29616m mVar, C29409fd fdVar, C28708an anVar, C58485gu guVar, List list) {
        this.f80186a = mVar;
        this.f80187b = fdVar;
        this.f80188c = anVar;
        this.f80189d = guVar;
        this.f80190e = list;
    }

    public final C60870cx apply(Object obj) {
        Object h;
        C29616m mVar = this.f80186a;
        C29409fd fdVar = this.f80187b;
        C28708an anVar = this.f80188c;
        C58485gu guVar = this.f80189d;
        List list = this.f80190e;
        List<Account> list2 = (List) obj;
        C58480gp e = C58485gu.m89837e();
        if (mVar.f80213e) {
            e.mo55395g(C29670b.m54719g(C29616m.m54585a(anVar, guVar)).mo34822i(new C29474a(fdVar), C60826bg.f164896a).mo34821h(C29517b.f79993a, C60826bg.f164896a));
        }
        for (Account account : list2) {
            C58480gp e2 = C58485gu.m89837e();
            C58485gu guVar2 = mVar.f80210b;
            int i = ((C58724pq) guVar2).f156474d;
            int i2 = 0;
            while (i2 < i) {
                try {
                    e2.mo55395g(((C29613j) guVar2.get(i2)).mo34748a(account, list));
                    i2++;
                } catch (Exception e3) {
                    C29045l.m53938j(e3, "%s: Failed to apply filter", "FilteringPopulator");
                    h = C60856cj.m92899h(e3);
                }
            }
            e2.mo55396h(guVar);
            h = C29670b.m54719g(C29616m.m54585a(anVar, e2.mo55394f())).mo34822i(new C29607d(fdVar, account), C60826bg.f164896a).mo34821h(C29608e.f80197a, C60826bg.f164896a);
            e.mo55395g(h);
        }
        return C29672d.m54728c(e.mo55394f()).mo34823a(C29610g.f80200a, C60826bg.f164896a);
    }
}
