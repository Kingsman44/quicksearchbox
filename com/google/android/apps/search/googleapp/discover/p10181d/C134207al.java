package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.al */
/* compiled from: PG */
public final /* synthetic */ class C134207al implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C134208am f365569a;

    public /* synthetic */ C134207al(C134208am amVar) {
        this.f365569a = amVar;
    }

    public final void run() {
        C134208am amVar = this.f365569a;
        ((C59052c) ((C59052c) C134212aq.f365583a.mo56226d()).mo56372aa(40266)).mo56386p("Timed out NOW_FEED_LAUNCH. This should never happen.");
        synchronized (amVar.f365570b.f365586d) {
            C134212aq aqVar = amVar.f365570b;
            if (amVar != aqVar.f365587e) {
                ((C59052c) ((C59052c) C134212aq.f365583a.mo56226d()).mo56372aa(40267)).mo56386p("tryEndFlow - unable to end flow in timeout");
                return;
            }
            aqVar.mo111640a();
            amVar.mo111624c(C89849ae.FEED_LAUNCH_TIMEOUT, amVar.mo111622a());
        }
    }
}
