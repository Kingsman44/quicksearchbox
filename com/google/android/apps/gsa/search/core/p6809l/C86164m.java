package com.google.android.apps.gsa.search.core.p6809l;

import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.common.p4526f.C59071e;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.search.core.l.m */
/* compiled from: PG */
public final class C86164m implements C90991b {

    /* renamed from: a */
    public static final C59071e f232854a = C59071e.m91332i("com.google.android.apps.gsa.search.core.l.m");

    /* renamed from: b */
    public final C86167p f232855b;

    /* renamed from: c */
    public final C90931ca f232856c;

    /* renamed from: d */
    public final C90908be f232857d = new C86162k(this);

    /* renamed from: e */
    public volatile GetRecentContextCall$Response f232858e = null;

    public C86164m(C90931ca caVar, C86167p pVar, C91022f fVar) {
        this.f232856c = caVar;
        this.f232855b = pVar;
        fVar.mo85301a(this);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("RecentContextApiClient");
        GetRecentContextCall$Response getRecentContextCall$Response = this.f232858e;
        if (getRecentContextCall$Response == null) {
            fVar.mo85292s(C90752i.m148229c("No previous GetRecentContext call"));
            return;
        }
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Previous GetRecentContext response");
        e.mo85279c("StatusCode").mo85276a(C90752i.m148230d(Integer.valueOf(getRecentContextCall$Response.f387453a.f389621g)));
        e.mo85279c("StatusMessage").mo85276a(C90752i.m148229c(getRecentContextCall$Response.f387453a.f389622h));
        if (getRecentContextCall$Response.f387453a.mo119097c()) {
            for (UsageInfo usageInfo : getRecentContextCall$Response.f387454b) {
                C91006f e2 = e.mo85281e((Object) null);
                e2.mo85291r("UsageInfo");
                e2.mo85279c("Timestamp").mo85276a(C90752i.m148232f(new Date(usageInfo.f387563b)));
                if (usageInfo.f387562a != null) {
                    e2.mo85279c("URI").mo85276a(C90752i.m148233g(usageInfo.f387562a.f387436c));
                    e2.mo85279c("Pkg").mo85276a(C90752i.m148233g(usageInfo.f387562a.f387434a));
                }
            }
        }
    }
}
