package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.ao */
/* compiled from: PG */
final class C131962ao implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C131963ap f360293a;

    public C131962ao(C131963ap apVar) {
        this.f360293a = apVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C131963ap.f360294a.mo56226d()).mo56382g(th)).mo56372aa(39497)).mo56386p("Error while running LocalCalendarSynclet");
        this.f360293a.f360301h.mo19974a(C37176a.f96910bb.mo40805c(C62722b.INTERNAL));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f360293a.f360301h.mo19974a(C37176a.f96910bb.mo40805c(C62722b.OK));
    }
}
