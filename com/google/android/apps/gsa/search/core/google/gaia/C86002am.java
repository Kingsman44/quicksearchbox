package com.google.android.apps.gsa.search.core.google.gaia;

import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.libraries.search.p2476a.p2479c.C32165a;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.am */
/* compiled from: PG */
final class C86002am implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f232524a;

    /* renamed from: b */
    final /* synthetic */ C86013ax f232525b;

    public C86002am(C86013ax axVar, C58872ci ciVar) {
        this.f232525b = axVar;
        this.f232524a = ciVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C86013ax.f232544a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(8031)).mo56386p("#enableTikTokAccount: TikTok account enable failed");
        this.f232525b.mo79662I("#enableTikTokAccount: TikTok account enable failed");
        this.f232525b.f232566n.mo41678L((double) this.f232524a.mo56158a(TimeUnit.MILLISECONDS), "FAILURE");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C32165a aVar = (C32165a) obj;
        this.f232525b.mo79662I("#enableTikTokAccount: TikTok account enable succeeded");
        this.f232525b.f232566n.mo41678L((double) this.f232524a.mo56158a(TimeUnit.MILLISECONDS), "SUCCESS");
        if (((C84486a) this.f232525b.f232564l.mo27525b()).mo78207n()) {
            this.f232525b.f232559g.sendBroadcast(C89257aa.m145193e());
        }
    }
}
