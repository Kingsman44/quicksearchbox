package com.google.android.apps.search.podcasts.show;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import com.google.android.apps.search.podcasts.show.p10618d.C141154b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.x */
/* compiled from: PG */
final class C141176x implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C141175w f383279a;

    public C141176x(C141175w wVar) {
        this.f383279a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C141154b bVar2 = (C141154b) bVar;
        C141175w wVar = this.f383279a;
        C69664n.m101061g(bVar2, "event");
        if (wVar.f383272i.getChildFragmentManager().f634a.mo671c("EpisodeSortDialog") == null) {
            AccountId accountId = wVar.f383275l;
            C141117ab abVar = (C141117ab) C141118ac.f383141c.createBuilder();
            C140646b bVar3 = bVar2.f383235a;
            abVar.copyOnWrite();
            bVar3.getClass();
            ((C141118ac) abVar.instance).f383143a = bVar3;
            C140651c cVar = bVar2.f383236b;
            abVar.copyOnWrite();
            cVar.getClass();
            ((C141118ac) abVar.instance).f383144b = cVar;
            C141133b bVar4 = new C141133b();
            C68324h.m98669f(bVar4);
            C47247a.m84047b(bVar4, accountId);
            C47243l.m84039a(bVar4, (C141118ac) abVar.build());
            bVar4.showNow(wVar.f383272i.getChildFragmentManager(), "EpisodeSortDialog");
        }
        return C47392e.f123115a;
    }
}
