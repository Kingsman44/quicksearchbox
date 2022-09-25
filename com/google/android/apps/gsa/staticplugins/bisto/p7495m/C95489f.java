package com.google.android.apps.gsa.staticplugins.bisto.p7495m;

import android.net.ConnectivityManager;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124547c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.m.f */
/* compiled from: PG */
public final /* synthetic */ class C95489f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95493j f267211a;

    /* renamed from: b */
    public final /* synthetic */ String f267212b;

    public /* synthetic */ C95489f(C95493j jVar, String str) {
        this.f267211a = jVar;
        this.f267212b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95493j jVar = this.f267211a;
        String str = this.f267212b;
        C124547c cVar = (C124547c) obj;
        if (cVar.mo106456b().isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C60870cx cxVar = (C60870cx) jVar.f267226j.get(str);
        if (cxVar == null || cxVar.isDone()) {
            if (!cVar.mo106455a().isEmpty()) {
                Duration between = Duration.between((Instant) cVar.mo106455a().get(), jVar.f267223g.mo57444a());
                if (between.compareTo(C95493j.f267218b) < 0) {
                    C58976aa aaVar2 = C58975e.f156826a;
                } else {
                    ConnectivityManager connectivityManager = (ConnectivityManager) jVar.f267221e.getSystemService("connectivity");
                    if (connectivityManager == null || connectivityManager.isActiveNetworkMetered()) {
                        between.getClass();
                        if (between.compareTo(C95493j.f267219c) < 0) {
                            C58976aa aaVar3 = C58975e.f156826a;
                        }
                    }
                }
                jVar.mo89390c(str, cVar);
                return;
            }
            jVar.mo89389b(str, cVar);
            return;
        }
        C58976aa aaVar4 = C58975e.f156826a;
    }
}
