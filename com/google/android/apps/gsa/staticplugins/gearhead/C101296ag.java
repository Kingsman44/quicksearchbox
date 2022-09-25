package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87868go;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87870gq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87872gs;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.ag */
/* compiled from: PG */
public final /* synthetic */ class C101296ag implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282703a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f282704b;

    public /* synthetic */ C101296ag(C101325be beVar, ServiceEventData serviceEventData) {
        this.f282703a = beVar;
        this.f282704b = serviceEventData;
    }

    public final void run() {
        C101325be beVar = this.f282703a;
        ServiceEventData serviceEventData = this.f282704b;
        C101332bl blVar = beVar.f282780j;
        int a = C87872gs.m142772a(((C87870gq) serviceEventData.mo81918e(C87868go.f237720a)).f237724b);
        if (a == 0) {
            a = 1;
        }
        if (!blVar.f282818a.mo92226a()) {
            blVar.mo92250a(a != 1 ? 3 : 2, (Query) null);
        } else {
            blVar.f282819b.mo103447a(R.string.vanagon_unlock_phone_tts);
        }
    }
}
