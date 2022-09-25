package com.google.android.libraries.search.p3047m.p3051c.p3052a;

import com.google.android.gms.clearcut.C143667t;
import com.google.android.libraries.search.integrations.p3018c.C38509h;
import com.google.android.libraries.search.p3047m.p3048a.p3049a.C39219b;
import com.google.android.libraries.search.p3047m.p3048a.p3049a.C39222e;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C59700co;
import com.google.common.p4552o.C59703cr;
import com.google.common.util.concurrent.C60845bz;
import com.google.frameworks.client.p4624a.p4625a.C61284a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;

/* renamed from: com.google.android.libraries.search.m.c.a.e */
/* compiled from: PG */
final class C39235e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C59703cr f103361a;

    /* renamed from: b */
    final /* synthetic */ String f103362b;

    /* renamed from: c */
    final /* synthetic */ String f103363c;

    /* renamed from: d */
    final /* synthetic */ Integer f103364d;

    /* renamed from: e */
    final /* synthetic */ IllegalStateException f103365e;

    /* renamed from: f */
    final /* synthetic */ C39236f f103366f;

    public C39235e(C39236f fVar, C59703cr crVar, String str, String str2, Integer num, IllegalStateException illegalStateException) {
        this.f103366f = fVar;
        this.f103361a = crVar;
        this.f103362b = str;
        this.f103363c = str2;
        this.f103364d = num;
        this.f103365e = illegalStateException;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C39236f.f103367a.mo56226d()).mo56382g(th)).mo56372aa(53202)).mo56386p("#hasSomeoneInteractedWithConsentBeforeAndItIsNowDenied #onFailure");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C39233c cVar = (C39233c) obj;
        if (cVar != null) {
            if (!this.f103361a.equals(C59703cr.ASYNC) || !this.f103366f.f103368b.equals(C59700co.INTERACTOR)) {
                C61301b bVar = new C61301b(C61284a.NON_TEXTUAL_INTERACTION_USER_DATA, this.f103362b);
                C61301b bVar2 = new C61301b(C61284a.NO_USER_DATA, this.f103361a.name());
                C61301b bVar3 = new C61301b(C61284a.NO_USER_DATA, this.f103366f.f103368b.name());
                C61284a aVar = C61284a.NON_TEXTUAL_INTERACTION_USER_DATA;
                C39236f fVar = this.f103366f;
                ((C59052c) ((C59052c) ((C59052c) ((C59052c) C39236f.f103367a.mo56225c()).mo56381f(C38509h.f101868a)).mo56382g(this.f103365e)).mo56372aa(53203)).mo56361N("UNCONSENTED LOCATION USAGE - attributionTag %s\nopType %s\nagsaProcess %s\nmessage %s\nmsSinceConsentDeclined %s", bVar, bVar2, bVar3, new C61301b(aVar, fVar.f103369c.mo41732a(this.f103363c, this.f103364d, fVar.f103368b)), new C61301b(C61284a.NON_TEXTUAL_INTERACTION_USER_DATA, Long.valueOf(cVar.mo41737a().toMillis())));
            }
            C39222e eVar = this.f103366f.f103370d;
            String str = this.f103362b;
            C59703cr crVar = this.f103361a;
            C39226b a = C39227c.m68657a(str);
            C143667t tVar = (C143667t) eVar.f103242e.get(crVar);
            tVar.getClass();
            eVar.f103240c.mo119020d(C39219b.APP_OPS_UNCONSENTED_LOCATION_COUNT.name()).mo119005a((long) a.getNumber(), 1, tVar);
        }
    }
}
