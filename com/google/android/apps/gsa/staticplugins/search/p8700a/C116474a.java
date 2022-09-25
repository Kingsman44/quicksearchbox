package com.google.android.apps.gsa.staticplugins.search.p8700a;

import com.google.android.apps.gsa.binaries.satin.app.alk;
import com.google.android.apps.gsa.binaries.satin.app.als;
import com.google.android.apps.gsa.binaries.satin.app.amc;
import com.google.android.apps.gsa.binaries.satin.app.ame;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6848e.C86687i;
import com.google.android.apps.gsa.search.core.service.p6848e.C86691m;
import com.google.android.apps.gsa.staticplugins.search.session.C116528b;
import com.google.android.apps.gsa.staticplugins.search.session.p8716f.C116541a;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.a.a */
/* compiled from: PG */
final class C116474a implements C86687i {

    /* renamed from: a */
    final /* synthetic */ amc f322944a;

    /* renamed from: b */
    private C116541a f322945b;

    public C116474a(amc amc) {
        this.f322944a = amc;
    }

    /* renamed from: a */
    public final C86686h mo80300a(C86691m mVar) {
        if (this.f322945b == null) {
            amc amc = this.f322944a;
            this.f322945b = new ame(amc.f197836a, amc.f197837b);
        }
        ame ame = (ame) this.f322945b;
        aqy aqy = ame.f197864a;
        alk alk = ame.f197917b;
        ame ame2 = ame.f197938c;
        C68225k.m98529a(mVar, C86691m.class);
        return (C116528b) new als(aqy, alk, ame2, mVar).f197678r.mo17428b();
    }
}
