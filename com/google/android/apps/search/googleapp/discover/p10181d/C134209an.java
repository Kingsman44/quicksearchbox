package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.an */
/* compiled from: PG */
public final /* synthetic */ class C134209an implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C134210ao f365575a;

    public /* synthetic */ C134209an(C134210ao aoVar) {
        this.f365575a = aoVar;
    }

    public final void run() {
        C134210ao aoVar = this.f365575a;
        ((C59052c) ((C59052c) C134212aq.f365583a.mo56226d()).mo56372aa(40270)).mo56386p("Timed out NOW_FEED_LAUNCH_FROM_NOTIFICATION. This should never happen.");
        synchronized (aoVar.f365576b.f365586d) {
            C134212aq aqVar = aoVar.f365576b;
            if (aoVar != aqVar.f365587e) {
                ((C59052c) ((C59052c) C134212aq.f365583a.mo56226d()).mo56372aa(40271)).mo56386p("tryEndFlow - unable to end flow in timeout");
                return;
            }
            aqVar.mo111640a();
            aoVar.mo111624c(C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_TIMEOUT, aoVar.mo111622a());
        }
    }
}
