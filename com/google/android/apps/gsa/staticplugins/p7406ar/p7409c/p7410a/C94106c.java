package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7410a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C94106c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94109f f262919a;

    public /* synthetic */ C94106c(C94109f fVar) {
        this.f262919a = fVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C94109f fVar = this.f262919a;
        Exception exc = (Exception) obj;
        C59104x c = C94109f.f262922a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ExploreOnContentCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(19492)).mo56386p("Fetching Explore suggestions failed");
        fVar.mo88324f(true != (exc instanceof IOException) ? C89885b.EXPLORE_ON_CONTENT_FETCHING_FAILED_GENERIC_VALUE : C89885b.EXPLORE_ON_CONTENT_FETCHING_FAILED_IO_VALUE);
    }
}
