package com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.app.C1839z;
import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.lifecycleobservers.C110114a;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.search.assistant.proactive.C36335p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.c */
/* compiled from: PG */
public final /* synthetic */ class C110406c implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ ActivityIdleDismissController f307734a;

    /* renamed from: b */
    public final /* synthetic */ C110114a f307735b;

    /* renamed from: c */
    public final /* synthetic */ C110407d f307736c;

    public /* synthetic */ C110406c(ActivityIdleDismissController activityIdleDismissController, C110114a aVar, C110407d dVar) {
        this.f307734a = activityIdleDismissController;
        this.f307735b = aVar;
        this.f307736c = dVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        PendingIntent u;
        ActivityIdleDismissController activityIdleDismissController = this.f307734a;
        C110114a aVar = this.f307735b;
        C110407d dVar = this.f307736c;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            if (Boolean.TRUE.equals(bool)) {
                C59104x b = ActivityIdleDismissController.f307705a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ActivityIDC");
                ((C59052c) ((C59052c) b).mo56372aa(25920)).mo56386p("Activity idled.");
                Resources resources = activityIdleDismissController.f307706b.getResources();
                C1839z a = C89095d.m144923a(activityIdleDismissController.f307706b, activityIdleDismissController.f307707c.mo40114a(C36335p.OPA_MISC).f94887a);
                C28292j jVar = new C28292j(85546);
                jVar.mo33795i(5);
                C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
                C89949q.m146521e(C28285c.m52875b(e, 75711), false);
                C28292j jVar2 = ((C28257a) e).f76908a;
                Bundle bundle = new Bundle();
                bundle.putBoolean("launch_ambient_mode_from_assist", true);
                Intent b2 = ((C87573b) activityIdleDismissController.f307708d.mo27525b()).mo81704b(bundle);
                a.f5679J.icon = R.drawable.opa_logo;
                a.f5685e = C1839z.m5037c(resources.getString(R.string.idle_notification_title));
                a.f5686f = C1839z.m5037c(resources.getString(R.string.idle_notification_content));
                if (!(jVar2 == null || (u = activityIdleDismissController.f307713i.u(jVar2)) == null)) {
                    a.f5679J.deleteIntent = u;
                }
                if (b2 == null) {
                    C59104x c = ActivityIdleDismissController.f307705a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ActivityIDC");
                    ((C59052c) ((C59052c) c).mo56372aa(25921)).mo56386p("postRestartNotification(): failed to get a service intent, don't add notification action.");
                } else {
                    PendingIntent service = PendingIntent.getService(activityIdleDismissController.f307706b, 2200, b2, 201326592);
                    if (jVar2 != null) {
                        service = activityIdleDismissController.f307713i.c(service, jVar2);
                    }
                    a.f5687g = service;
                    String string = resources.getString(R.string.idle_notification_action_resume_ambient_mode);
                    service.getClass();
                    a.mo5016e(0, string, service);
                }
                activityIdleDismissController.f307709e.mo5003b("com.google.android.apps.gsa.staticplugins.opa.samson.activity.OpaAmbActivity.RestartActivity", 2200, a.mo5013a());
                activityIdleDismissController.f307711g.mo103752c(C118522by.AMBIENT_MODE_RELAUNCH);
                C118561t tVar = activityIdleDismissController.f307711g;
                C118522by byVar = C118522by.AMBIENT_MODE_RELAUNCH;
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                long a2 = activityIdleDismissController.f307712h.mo79743a(C90014bt.f247064aB);
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328821a |= 1;
                agVar.f328822b = a2;
                tVar.mo103754e(byVar, (C118472ag) afVar.build());
                activityIdleDismissController.f307710f.f306845c = true;
            }
            aVar.mo98391h(bool.booleanValue());
            dVar.mo97369A(bool.booleanValue());
        }
    }
}
