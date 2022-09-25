package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.BroadcastReceiver;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80208bb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58459fv;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.v */
/* compiled from: PG */
public final /* synthetic */ class C75966v implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C75915aa f210765a;

    /* renamed from: b */
    public final /* synthetic */ C80248co f210766b;

    /* renamed from: c */
    public final /* synthetic */ C80213bg f210767c;

    public /* synthetic */ C75966v(C75915aa aaVar, C80248co coVar, C80213bg bgVar) {
        this.f210765a = aaVar;
        this.f210766b = coVar;
        this.f210767c = bgVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        BroadcastReceiver broadcastReceiver;
        C75915aa aaVar = this.f210765a;
        C80248co coVar = this.f210766b;
        C80213bg bgVar = this.f210767c;
        C80208bb bbVar = (C80208bb) obj;
        synchronized (aaVar) {
            C58459fv fvVar = new C58459fv(aaVar.f210630i.mo71967b());
            fvVar.mo54956I(coVar, bgVar);
            C75932ar a = aaVar.f210630i.mo71966a();
            a.mo71965c(fvVar);
            aaVar.f210630i = a.mo71963a();
            coVar.name();
            if (aaVar.f210630i.mo71967b().mo54954G() && (broadcastReceiver = aaVar.f210629h) != null) {
                aaVar.f210624c.unregisterReceiver(broadcastReceiver);
                aaVar.f210629h = null;
            }
        }
    }
}
