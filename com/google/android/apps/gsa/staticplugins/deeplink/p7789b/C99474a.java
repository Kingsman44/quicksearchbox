package com.google.android.apps.gsa.staticplugins.deeplink.p7789b;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.b.a */
/* compiled from: PG */
public final /* synthetic */ class C99474a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99476c f278358a;

    public /* synthetic */ C99474a(C99476c cVar) {
        this.f278358a = cVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99476c cVar = this.f278358a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            cVar.mo91476a();
            return;
        }
        C87682aj ajVar = cVar.f278361c;
        if (ajVar != null) {
            C87684al alVar = new C87684al(C88244um.START_ACTIVITY_FOR_RESULT);
            alVar.mo81966c((Parcelable) optional.get());
            ((C86771n) ajVar).mo80379b(alVar.mo81964a());
        }
    }
}
