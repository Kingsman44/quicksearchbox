package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3065c;

import android.content.Intent;
import android.databinding.C0118a;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.n.c.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C39451a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39457g f103859a;

    public /* synthetic */ C39451a(C39457g gVar) {
        this.f103859a = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39455e eVar;
        C39457g gVar = this.f103859a;
        C59104x b = C39457g.f103868a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
        ((C59052c) ((C59052c) b).mo56372aa(53663)).mo56386p("#prepareDspModel inside ExecutionSequencer");
        gVar.mo41843b("START_HANDEL_PREPARE_DSPMODEL_REQUEST");
        int i = gVar.f103873f.get();
        C39455e eVar2 = null;
        if (i == -2) {
            C59104x d = C39457g.f103868a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
            ((C59052c) ((C59052c) d).mo56372aa(53660)).mo56386p("AlwaysOnHotwordDetector.STATE_HARDWARE_UNAVAILABLE");
            gVar.mo41843b("VALIDATE_AVAILABILITY_FOR_ENROLL : ".concat(String.valueOf(C39455e.RETRY_REQUIRED.name())));
            eVar = C39455e.RETRY_REQUIRED;
        } else if (i == -1) {
            C59104x d2 = C39457g.f103868a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
            ((C59052c) ((C59052c) d2).mo56372aa(53661)).mo56386p("AlwaysOnHotwordDetector.STATE_HARDWARE_UNAVAILABLE");
            gVar.mo41843b("VALIDATE_AVAILABILITY_FOR_ENROLL : ".concat(String.valueOf(C39455e.MODEL_NOT_SUPPORTED.name())));
            eVar = C39455e.MODEL_NOT_SUPPORTED;
        } else if (i == 1) {
            eVar = null;
        } else if (i != 2) {
            C59104x d3 = C39457g.f103868a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
            ((C59052c) ((C59052c) d3).mo56372aa(53659)).mo56387q("alwaysOnHotwordDetectorAvailability is %d", i);
            gVar.mo41843b("VALIDATE_AVAILABILITY_FOR_ENROLL : ".concat(String.valueOf(C39455e.INVALID_REQUEST.name())));
            eVar = C39455e.INVALID_REQUEST;
        } else {
            gVar.mo41843b("VALIDATE_AVAILABILITY_FOR_ENROLL : ".concat(String.valueOf(C39455e.SUCCESS.name())));
            eVar = C39455e.SUCCESS;
        }
        if (eVar != null) {
            return C60856cj.m92900i(eVar);
        }
        C60870cx a = C2169h.m6027a(new C39452b(gVar));
        int i2 = gVar.f103873f.get();
        C59104x b2 = C39457g.f103868a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
        ((C59052c) ((C59052c) b2).mo56372aa(53654)).mo56387q("enroll for availability %d", i2);
        Intent a2 = gVar.mo41842a();
        gVar.mo41843b("CREATE_ENROLL_INTENT");
        if (a2 == null) {
            gVar.mo41843b("NULL_ENROLL_INTENT");
            eVar2 = C39455e.MODEL_NOT_SUPPORTED;
        } else {
            try {
                if (!gVar.f103870c.getPackageManager().queryBroadcastReceivers(a2, 65536).isEmpty()) {
                    C59104x b3 = C39457g.f103868a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
                    ((C59052c) ((C59052c) b3).mo56372aa(53667)).mo56389s("Firing broadcastreceiver Intent: %s", a2);
                    gVar.f103870c.sendBroadcast(a2);
                } else if (!gVar.f103870c.getPackageManager().queryIntentServices(a2, 65536).isEmpty()) {
                    C59104x b4 = C39457g.f103868a.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
                    ((C59052c) ((C59052c) b4).mo56372aa(53666)).mo56389s("Firing foreground service Intent: %s", a2);
                    gVar.f103870c.startForegroundService(a2);
                } else if (!gVar.f103870c.getPackageManager().queryIntentActivities(a2, 65536).isEmpty()) {
                    a2.addFlags(268435456);
                    C59104x b5 = C39457g.f103868a.mo56224b();
                    b5.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
                    ((C59052c) ((C59052c) b5).mo56372aa(53664)).mo56386p("Firing activity Intent");
                    C47810es.m84979s(gVar.f103870c, a2);
                } else {
                    throw new C39456f();
                }
                gVar.mo41843b("FIRE_ENROLL_INTENT");
            } catch (C39456f | SecurityException e) {
                if (e instanceof SecurityException) {
                    gVar.mo41843b("FAILED_TO_FIRE_ENROLL_INTENT");
                    C59104x c = C39457g.f103868a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(53656)).mo56386p("Failed to fire enroll intent");
                } else {
                    gVar.mo41843b("FAILED_TO_DETEMENT_TYPE_OF_ENROLLMENT_APPLICATION");
                    C59104x c2 = C39457g.f103868a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
                    C0118a.m96d(c2, "Failed to determine type of enrollment application!", 53655, C58979ad.FULL);
                }
                gVar.mo41843b("FIRE_ENROLL_INTET_EXCEPTION");
                eVar2 = C39455e.MODEL_NOT_SUPPORTED;
            }
        }
        if (eVar2 != null) {
            return C60856cj.m92900i(eVar2);
        }
        return C47633f.m84733g(a).mo51517j(C39457g.f103869b.getSeconds(), TimeUnit.SECONDS, gVar.f103875h).mo51515h(new C39453c(gVar), gVar.f103872e).mo51513e(TimeoutException.class, new C39454d(gVar), gVar.f103872e);
    }
}
