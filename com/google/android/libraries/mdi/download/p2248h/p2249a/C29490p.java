package com.google.android.libraries.mdi.download.p2248h.p2249a;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2248h.C29613j;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4535g.C59226t;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.h.a.p */
/* compiled from: PG */
public final class C29490p implements C29613j {

    /* renamed from: a */
    private final C58881cr f79916a;

    /* renamed from: b */
    private final Executor f79917b;

    public C29490p(C58881cr crVar, Executor executor) {
        this.f79916a = crVar;
        this.f79917b = executor;
    }

    /* renamed from: b */
    public static C58833ax m54453b(String str) {
        try {
            C59226t M = C59226t.m91922M(str);
            if (M.mo56664b() < 6 && (Long.lowestOneBit(M.f157334b) & 1537228672809129301L) != 0) {
                return C58833ax.m90834k(M);
            }
            C29045l.m53931c("%s: Invalid S2 cell id from token: %s", "WebrefPersonalizedLocationsGellerSlicingFilter", str);
            return C58836b.f156633a;
        } catch (NumberFormatException unused) {
            C29045l.m53931c("%s: Invalid S2 cell token: %s", "WebrefPersonalizedLocationsGellerSlicingFilter", str);
            return C58836b.f156633a;
        }
    }

    /* renamed from: c */
    public static void m54454c(C28706al alVar, C58480gp gpVar) {
        gpVar.mo55395g(alVar);
        C29045l.m53931c("%s: Added personalized local slice data file via Handbag/Geller: %s", "WebrefPersonalizedLocationsGellerSlicingFilter", alVar.f77979b);
    }

    /* renamed from: a */
    public final C60870cx mo34748a(Account account, List list) {
        C29045l.m53932d("%s: Handbag account for Geller: %s, files: %d", "WebrefPersonalizedLocationsGellerSlicingFilter", account, Integer.valueOf(list.size()));
        return C29670b.m54719g((C60870cx) this.f79916a.mo6453a()).mo34822i(new C29483i(account), this.f79917b).mo34821h(new C29484j(list), this.f79917b);
    }
}
