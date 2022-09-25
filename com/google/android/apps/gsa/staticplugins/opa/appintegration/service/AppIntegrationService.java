package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17849l;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17918t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class AppIntegrationService extends C107350a {

    /* renamed from: a */
    public C107359j f298759a;

    public final IBinder onBind(Intent intent) {
        intent.getAction();
        C107359j jVar = this.f298759a;
        C58976aa aaVar = C58975e.f156826a;
        intent.getAction();
        if ("com.google.android.apps.gsa.opa.APP_INTEGRATION_SERVICE".equals(intent.getAction())) {
            return jVar.f298780c;
        }
        if (!"com.google.android.apps.gsa.opa.APP_INTEGRATION_CALLBACK_SERVICE".equals(intent.getAction())) {
            return null;
        }
        return jVar.f298782e;
    }

    public final void onCreate() {
        C74507e.m120466b(33);
        super.onCreate();
        this.f298759a.f298797t = this;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C107359j jVar = this.f298759a;
        if (jVar.f298792o.mo85405j(C90014bt.f247039D)) {
            if (intent.hasExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_DATA")) {
                C107374y yVar = jVar.f298793p;
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_DATA");
                if (yVar.f298844b.mo56113h()) {
                    C107372w wVar = (C107372w) yVar.f298844b.mo56107c();
                    try {
                        if (!wVar.f298838j.contains(C17918t.SUPPORT_ON_VOICE_PLATE_STATE_CHANGED)) {
                            wVar.f298832d.mo23472a(byteArrayExtra);
                        }
                    } catch (RemoteException e) {
                        ((C59052c) ((C59052c) ((C59052c) C107372w.f298829a.mo56225c()).mo56382g(e)).mo56372aa(23769)).mo56386p("Couldn't update the callback.");
                    }
                }
            }
            if (intent.hasExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_EVENT")) {
                C107374y yVar2 = jVar.f298793p;
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_EVENT");
                if (yVar2.f298844b.mo56113h()) {
                    C107372w wVar2 = (C107372w) yVar2.f298844b.mo56107c();
                    try {
                        if (wVar2.f298838j.contains(C17918t.SUPPORT_ON_VOICE_PLATE_STATE_CHANGED)) {
                            wVar2.f298832d.mo23472a(byteArrayExtra2);
                        }
                    } catch (RemoteException e2) {
                        ((C59052c) ((C59052c) ((C59052c) C107372w.f298829a.mo56225c()).mo56382g(e2)).mo56372aa(23772)).mo56386p("Couldn't update the callback.");
                    }
                }
            }
            jVar.f298797t.stopSelf();
            return 2;
        } else if (jVar.f298783f == null) {
            C59104x d = C107359j.f298778a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) d).mo56372aa(23732)).mo56386p("No callback registered.");
            return 2;
        } else if (intent.hasExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_DATA") || intent.hasExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_EVENT")) {
            synchronized (jVar.f298785h) {
                C107357h hVar = jVar.f298781d;
                if (hVar != null && hVar.f298774c.contains(C17918t.SUPPORT_ON_VOICE_PLATE_STATE_CHANGED)) {
                    try {
                        if (intent.hasExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_EVENT")) {
                            C58976aa aaVar = C58975e.f156826a;
                            C17849l lVar = jVar.f298783f;
                            lVar.getClass();
                            lVar.mo23472a(intent.getByteArrayExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_EVENT"));
                        }
                    } catch (RemoteException e3) {
                        C59104x d2 = C107359j.f298778a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
                        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e3)).mo56372aa(23730)).mo56386p("Failed to update AssistantIntegrationClient");
                    }
                } else if (intent.hasExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_DATA")) {
                    C17849l lVar2 = jVar.f298783f;
                    lVar2.getClass();
                    lVar2.mo23472a(intent.getByteArrayExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_DATA"));
                }
            }
            jVar.f298797t.stopSelf();
            return 2;
        } else {
            C59104x d3 = C107359j.f298778a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) d3).mo56372aa(23731)).mo56386p("Missing callback data.");
            return 2;
        }
    }

    public final boolean onUnbind(Intent intent) {
        intent.getAction();
        C107359j jVar = this.f298759a;
        C58976aa aaVar = C58975e.f156826a;
        intent.getAction();
        if ("com.google.android.apps.gsa.opa.APP_INTEGRATION_SERVICE".equals(intent.getAction())) {
            if (jVar.f298792o.mo85405j(C90014bt.f247039D)) {
                C107374y yVar = jVar.f298793p;
                synchronized (yVar.f298846d) {
                    yVar.f298846d.clear();
                    yVar.mo95994b();
                }
            }
            jVar.mo95977f();
        }
        jVar.mo95972a();
        return false;
    }
}
