package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import android.accounts.Account;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87835fi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87836fj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87838fl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87839fm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88354yo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88356yq;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96466ax;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96467ay;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.assistant.p3739a.p3740a.C48111h;
import com.google.assistant.p3897e.p3899b.p3901b.C50877d;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.k */
/* compiled from: PG */
final class C94993k extends C94991i {

    /* renamed from: a */
    final /* synthetic */ C94995m f265737a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94993k(C94995m mVar) {
        super(mVar, "RUNNING_ACTION");
        this.f265737a = mVar;
    }

    /* renamed from: d */
    public final void mo88898d(ServiceEventData serviceEventData) {
        Notification notification;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 144) {
            C59071e eVar = C94995m.f265738a;
            C58976aa aaVar = C58975e.f156826a;
            C87835fi fiVar = (C87835fi) serviceEventData.mo81918e(C87836fj.f237654a);
            C50877d dVar = fiVar.f237652b;
            if (dVar == null) {
                dVar = C50877d.f132472c;
            }
            C48111h hVar = dVar.f132475b;
            if (hVar == null) {
                hVar = C48111h.f124520a;
            }
            this.f265737a.mo88900d("Response: %s", hVar);
            C95007y yVar = this.f265737a.f265751n;
            yVar.getClass();
            yVar.mo88816g(hVar, (2 & fiVar.f237651a) != 0 ? fiVar.f237653c : null);
            C94995m mVar = this.f265737a;
            mVar.f265757t = true;
            C60870cx cxVar = mVar.f265758u;
            if (cxVar != null) {
                cxVar.cancel(false);
                C94995m mVar2 = this.f265737a;
                mVar2.f265758u = null;
                mVar2.mo88902f("DONE");
            }
        } else if (ordinal == 153) {
            C59071e eVar2 = C94995m.f265738a;
            C58976aa aaVar2 = C58975e.f156826a;
            C94995m mVar3 = this.f265737a;
            if (!mVar3.f265757t) {
                C59104x d = C94995m.f265738a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
                ((C59052c) ((C59052c) d).mo56372aa(17798)).mo56386p("Missing GACS result");
                C94995m mVar4 = this.f265737a;
                mVar4.f265758u = mVar4.f265740c.mo28208h("gacs-timeout", 5000, new C94992j(this));
                return;
            }
            mVar3.mo88902f("DONE");
        } else if (ordinal == 161) {
            C59071e eVar3 = C94995m.f265738a;
            C58976aa aaVar3 = C58975e.f156826a;
            C96467ay ayVar = (C96467ay) this.f265737a.f265747j.mo27525b();
            C94995m mVar5 = this.f265737a;
            C124548d dVar2 = mVar5.f265759v;
            Account account = mVar5.f265746i.f265849b;
            if (dVar2 == null) {
                C59104x b = C96467ay.f269867a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "PRNotifHelper");
                ((C59052c) ((C59052c) b).mo56372aa(17180)).mo56386p("Not posted");
                return;
            }
            boolean ab = dVar2.mo106488ab();
            if (dVar2.mo106484Y()) {
                if (account == null || C58837ba.m90859h(account.name)) {
                    C59104x d2 = C96467ay.f269867a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "PRNotifHelper");
                    ((C59052c) ((C59052c) d2).mo56372aa(17179)).mo56386p("No account");
                } else {
                    ab = dVar2.mo106517o(account).f343766d;
                }
            }
            if (ab) {
                C59104x b2 = C96467ay.f269867a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "PRNotifHelper");
                ((C59052c) ((C59052c) b2).mo56372aa(17178)).mo56386p("Not posted");
                return;
            }
            C59104x b3 = C96467ay.f269867a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "PRNotifHelper");
            ((C59052c) ((C59052c) b3).mo56372aa(17177)).mo56389s("GACS PR %s", dVar2.mo106475P());
            if (ayVar.f269874h.mo83555j(150)) {
                notification = ayVar.mo90153c(dVar2, ayVar.mo90154d(ayVar.mo90157g("pr_notification", dVar2, "action_affirmative").putExtra("device_id", dVar2.mo106475P()).putExtra("tng_pr_notification_handling", true), "action_affirmative"), ayVar.mo90154d(ayVar.mo90157g("pr_notification", dVar2, "action_negative"), "action_negative"), ayVar.mo90154d(ayVar.mo90157g("pr_notification", dVar2, "action_dismiss"), "action_dismiss"));
            } else {
                if (ayVar.f269875i == null) {
                    ayVar.f269875i = new C96466ax(ayVar);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_LAUNCH_SETTINGS");
                    intentFilter.addAction("com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_NEGATIVE");
                    intentFilter.addAction("com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_DISMISS");
                    ayVar.f269869c.registerReceiver(ayVar.f269875i, intentFilter);
                }
                notification = ayVar.mo90153c(dVar2, ayVar.mo90156f(new Intent("com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_LAUNCH_SETTINGS").putExtra("key_device_id", dVar2.mo106475P())), ayVar.mo90156f(new Intent("com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_NEGATIVE")), ayVar.mo90156f(new Intent("com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_DISMISS")));
            }
            ayVar.mo90162l(2);
            ayVar.f269872f.notify(1, notification);
        } else if (ordinal == 189) {
            C59071e eVar4 = C94995m.f265738a;
            C58976aa aaVar4 = C58975e.f156826a;
            C62940bt btVar = C87839fm.f237660a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (!uoVar.f169962ag.mo58857o(r0.f169971d)) {
                C59104x c = C94995m.f265738a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
                ((C59052c) ((C59052c) c).mo56372aa(17796)).mo56386p("getAudioResultUris - Missing audio result data.");
                mo88895a();
                return;
            }
            C87838fl flVar = (C87838fl) serviceEventData.mo81918e(C87839fm.f237660a);
            C94995m mVar6 = this.f265737a;
            C88356yq yqVar = flVar.f237658b;
            if (yqVar == null) {
                yqVar = C88356yq.f238944d;
            }
            mVar6.mo88899b(yqVar, flVar.f237659c);
        } else if (ordinal == 155) {
            C59071e eVar5 = C94995m.f265738a;
            C58976aa aaVar5 = C58975e.f156826a;
            C94995m mVar7 = this.f265737a;
            mVar7.f265753p = true;
            mVar7.mo88902f("DONE");
        } else if (ordinal != 156) {
            C59104x c2 = C94995m.f265738a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
            C59052c cVar = (C59052c) ((C59052c) c2).mo56372aa(17792);
            String str = this.f265734d;
            C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            cVar.mo56352E("In state: %s unknown event: %d", str, a2.f238695cJ);
        } else {
            C59071e eVar6 = C94995m.f265738a;
            C58976aa aaVar6 = C58975e.f156826a;
            C62940bt btVar2 = C88354yo.f238943a;
            C88246uo uoVar2 = serviceEventData.f236959a;
            C62940bt r02 = C62942bv.checkIsLite(btVar2);
            uoVar2.mo58887l(r02);
            if (!uoVar2.f169962ag.mo58857o(r02.f169971d)) {
                C59104x c3 = C94995m.f265738a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
                ((C59052c) ((C59052c) c3).mo56372aa(17794)).mo56386p("getAudioResultUris - Missing audio result data.");
                mo88895a();
                return;
            }
            this.f265737a.mo88899b((C88356yq) serviceEventData.mo81918e(C88354yo.f238943a), (String) null);
        }
    }
}
