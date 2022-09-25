package com.google.android.apps.gsa.staticplugins.searchboxroot;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.searchbox.p6944c.C88547ac;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.C60602vz;
import com.google.common.p4552o.amo;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.d */
/* compiled from: PG */
public final class C116849d extends C88547ac implements C89200e {

    /* renamed from: a */
    private final C68214a f324309a;

    /* renamed from: b */
    private C68214a f324310b;

    public C116849d(C68214a aVar) {
        this.f324309a = aVar;
    }

    /* renamed from: a */
    public final Query mo82212a(Query query, String str, Suggestion suggestion, String str2, String str3, int i, C60456qs qsVar) {
        Query query2;
        String str4 = str;
        String str5 = str2;
        int i2 = i;
        C60456qs qsVar2 = qsVar;
        C58976aa aaVar = C58975e.f156826a;
        if (str4 == null || C58832aw.m90831a(str, (Object) null)) {
            query2 = query;
        } else {
            Query query3 = query;
            query2 = query.mo84268aE(str, false);
        }
        Map y = C89235z.m145153y(suggestion);
        if (y != null) {
            query2 = query2.mo84267aD(y);
        }
        if (!BuildConfig.FLAVOR.equals(str2)) {
            query2 = query2.mo84305aq(str2);
        }
        if (qsVar2 != null) {
            query2 = query2.mo84299ak(qsVar2);
        }
        Query aL = query2.mo84277aN().mo84275aL(str3);
        if (!(i2 == 148 || i2 == 775)) {
            int i3 = i;
            ((C88533b) this.f324310b.mo27525b()).mo82172c(aL.f252749G, i3, aL.f252783v, (C89037bh) this.f324309a.mo27525b(), aL.mo84474eb(), (amo) null, (C60602vz) null);
        }
        return aL;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f324310b = ((C88614r) obj).f239537h;
    }
}
