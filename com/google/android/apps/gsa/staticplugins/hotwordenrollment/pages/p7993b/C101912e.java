package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7993b;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.C101837e;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.b.e */
/* compiled from: PG */
final class C101912e implements C101837e {

    /* renamed from: a */
    final /* synthetic */ C101913f f284272a;

    public C101912e(C101913f fVar) {
        this.f284272a = fVar;
    }

    /* renamed from: a */
    public final void mo92613a() {
        C101913f fVar = this.f284272a;
        if (fVar.f284275c.getView() != null) {
            C22871g gVar = fVar.f284276d;
            C22869e b = C101873d.m168557b(new C101910c(fVar));
            Objects.requireNonNull(b);
            gVar.mo28212l("Move to next screen", new C101911d(b));
            return;
        }
        C59104x c = C101913f.f284273a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DomainDepCheckFrgm");
        C59052c cVar = (C59052c) c;
        cVar.mo56380ai(C58979ad.FULL);
        C101909b bVar = fVar.f284275c;
        ((C59052c) cVar.mo56372aa(20434)).mo56354G("Fragment is: %s, fragment.getView(): %s", bVar, bVar.getView());
    }

    /* renamed from: b */
    public final void mo92614b(Intent intent) {
        C101763c cVar = new C101763c();
        cVar.mo92556b(2);
        C47393f.m84236g(cVar.mo92555a(), this.f284272a.f284275c);
    }
}
