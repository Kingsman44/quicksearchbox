package com.google.android.apps.gsa.staticplugins.p7554bs.p7560f;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.p097i.C1967b;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.f.j */
/* compiled from: PG */
public final /* synthetic */ class C96736j implements C1967b {

    /* renamed from: a */
    public final /* synthetic */ C96737k f270603a;

    public /* synthetic */ C96736j(C96737k kVar) {
        this.f270603a = kVar;
    }

    /* renamed from: a */
    public final void mo3353a(Object obj) {
        C96737k kVar = this.f270603a;
        PendingIntent activity = PendingIntent.getActivity(kVar.f270606c, 1, kVar.f270610g.mo115337a((Bundle) obj), 1140850688);
        C96733g gVar = kVar.f270608e;
        C87684al alVar = new C87684al(C88244um.LENS_SERVICE_RESPONSE_PENDING_INTENT);
        alVar.mo81966c(activity);
        gVar.mo90332a(alVar.mo81964a());
    }
}
