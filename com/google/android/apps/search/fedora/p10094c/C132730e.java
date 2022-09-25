package com.google.android.apps.search.fedora.p10094c;

import com.google.android.libraries.assistant.trainingcache.bindings.IRealtimeLogger;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5228m.C67270aa;
import java.io.File;

/* renamed from: com.google.android.apps.search.fedora.c.e */
/* compiled from: PG */
public final class C132730e {

    /* renamed from: a */
    public static final C59071e f362155a = C59071e.m91332i("com.google.android.apps.search.fedora.c.e");

    /* renamed from: b */
    public final IRealtimeLogger f362156b;

    /* renamed from: c */
    public final C132728c f362157c;

    /* renamed from: d */
    public final C132733h f362158d;

    public C132730e(C132728c cVar, IRealtimeLogger iRealtimeLogger, C132733h hVar) {
        this.f362157c = cVar;
        this.f362156b = iRealtimeLogger;
        this.f362158d = hVar;
    }

    /* renamed from: a */
    public static boolean m215744a(C67270aa aaVar) {
        if (new File(aaVar.f182859b).exists()) {
            return true;
        }
        C59104x d = f362155a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "FedoraEkhoMaintenance");
        ((C59052c) ((C59052c) d).mo56372aa(39807)).mo56386p("Cache directory unavailable.");
        return false;
    }
}
