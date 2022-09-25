package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.al */
/* compiled from: PG */
public final class C107860al implements C107874az {

    /* renamed from: a */
    private final C84624a f300143a;

    public C107860al(C84624a aVar) {
        this.f300143a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final boolean mo96322b(ClientEventData clientEventData) {
        C58976aa aaVar = C58975e.f156826a;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() != 32) {
            return true;
        }
        C58838bb.m90884s(clientEventData.mo81913d(Intent.class), "BROWSABLE_INTENT_LAUNCHED_IN_CLIENT should have an intent parcelable.");
        Intent intent = (Intent) clientEventData.mo81912b(Intent.class);
        if (intent == null) {
            return true;
        }
        this.f300143a.mo78393m(intent);
        return true;
    }
}
