package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.bh */
/* compiled from: PG */
final class C102926bh implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C102927bi f287419a;

    public C102926bh(C102927bi biVar) {
        this.f287419a = biVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C102927bi.f287420a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "NgaLocationAccessChk");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(21370)).mo56386p("Failed to update location consent in prefs");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f287419a.mo93535a(((Boolean) obj).booleanValue());
    }
}
