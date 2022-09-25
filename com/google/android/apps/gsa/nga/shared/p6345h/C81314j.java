package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58800sl;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.j */
/* compiled from: PG */
public final class C81314j implements C90991b {

    /* renamed from: a */
    private final C68214a f222585a;

    public C81314j(C68214a aVar) {
        this.f222585a = aVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NGA PDS Configuration");
        C91006f e = fVar.mo85281e((Object) null);
        C81315k kVar = (C81315k) this.f222585a.mo27525b();
        e.mo85279c("education").mo85277b("HomeImpressions: %d Queries: %d InvocSinceLastSuggest: %d", C90752i.m148230d(Integer.valueOf(kVar.mo74887c())), C90752i.m148230d(Integer.valueOf(kVar.mo74895k())), C90752i.m148230d(Integer.valueOf(kVar.mo74890f())));
        C91006f e2 = e.mo85281e((Object) null);
        e2.mo85291r("Homescreen");
        e2.mo85279c("home").mo85276a(C90752i.m148231e(kVar.mo74898n()));
        C58800sl lA = kVar.mo74903s().entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            e2.mo85279c("app").mo85277b("[%s]: %s", C90752i.m148233g((CharSequence) entry.getKey()), C90752i.m148231e(entry.getValue()));
        }
    }
}
