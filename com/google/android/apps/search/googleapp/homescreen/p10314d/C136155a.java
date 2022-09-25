package com.google.android.apps.search.googleapp.homescreen.p10314d;

import android.content.Intent;
import com.google.android.apps.search.googleapp.discover.p10181d.C134208am;
import com.google.android.apps.search.googleapp.discover.p10181d.C134212aq;
import com.google.android.apps.search.googleapp.p10310h.C136123d;
import com.google.android.apps.search.googleapp.p10310h.C136126g;
import com.google.android.apps.search.googleapp.p10516t.p10520d.C139699c;
import com.google.common.p4526f.C59052c;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.d.a */
/* compiled from: PG */
public final class C136155a implements C139699c {

    /* renamed from: a */
    private final C134212aq f370813a;

    public C136155a(C134212aq aqVar) {
        this.f370813a = aqVar;
    }

    /* renamed from: a */
    public final void mo112805a(Instant instant, Intent intent) {
        if ((((C136123d) C136126g.m221187a(intent).orElse(C136123d.f370743d)).f370745a & 1) == 0) {
            C134212aq aqVar = this.f370813a;
            synchronized (aqVar.f365586d) {
                boolean z = aqVar.f365589g;
                if (aqVar.f365588f) {
                    aqVar.f365588f = false;
                    ((C59052c) ((C59052c) C134212aq.f365583a.mo56224b()).mo56372aa(40279)).mo56386p("#onDiscoverLaunchStarted - not logging because it was a configuration change");
                } else if (aqVar.f365587e != null) {
                    aqVar.mo111641b();
                } else {
                    aqVar.mo111644e(new C134208am(aqVar, z));
                    aqVar.f365589g = true;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo112806b(boolean z) {
        this.f370813a.mo111645f(true != z ? 2 : 103);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo112807c() {
    }
}
