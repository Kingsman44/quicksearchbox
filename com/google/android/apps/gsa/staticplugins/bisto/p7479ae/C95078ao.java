package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95853d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.p10712d.C142471go;
import com.google.android.p10712d.C142472gp;
import com.google.android.p10712d.C142501hr;
import com.google.android.p10712d.C142502hs;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.ao */
/* compiled from: PG */
public final /* synthetic */ class C95078ao implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95097bg f265985a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f265986b;

    public /* synthetic */ C95078ao(C95097bg bgVar, ServiceEventData serviceEventData) {
        this.f265985a = bgVar;
        this.f265986b = serviceEventData;
    }

    public final void run() {
        C95097bg bgVar = this.f265985a;
        ServiceEventData serviceEventData = this.f265986b;
        C89885b bVar = C89885b.UNKNOWN;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 50) {
            C95853d dVar = bgVar.f266035g;
            Intent intent = (Intent) serviceEventData.mo81912b(Intent.class);
            ResolveInfo resolveActivity = bgVar.f266031c.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null && "com.google.android.apps.translate".equals(resolveActivity.activityInfo.packageName)) {
                C58976aa aaVar = C58975e.f156826a;
                String a2 = bgVar.f266043o.mo89909a(bgVar.f266044p.mo89270k());
                C142501hr hrVar = (C142501hr) C142502hs.f386704b.createBuilder();
                hrVar.copyOnWrite();
                a2.getClass();
                ((C142502hs) hrVar.instance).f386706a = a2;
                C142502hs hsVar = (C142502hs) hrVar.build();
                C142471go goVar = (C142471go) C142472gp.f386640c.createBuilder();
                goVar.copyOnWrite();
                C142472gp gpVar = (C142472gp) goVar.instance;
                hsVar.getClass();
                gpVar.f386643b = hsVar;
                gpVar.f386642a = 2;
                intent.putExtra("bisto_sdk_payload", ((C142472gp) goVar.build()).toByteArray());
            }
            dVar.mo89823a(intent);
        } else if (ordinal == 139) {
            C58976aa aaVar2 = C58975e.f156826a;
            C95288a aVar = bgVar.f266050v;
            if (aVar != null) {
                aVar.mo89205a();
            }
            bgVar.f266045q.mo89127f(bgVar.f266051w);
        } else if (ordinal == 157) {
            C58976aa aaVar3 = C58975e.f156826a;
            bgVar.mo89021i(3);
            String str = ((C88262vd) serviceEventData.mo81918e(C88260vb.f238727a)).f238731b;
            if (bgVar.f266039k.mo83553h("bistoSpeechTestingMode")) {
                C59104x b = C95097bg.f266015a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) b).mo56372aa(18046)).mo56389s("Recognized Text: %s ", str);
            }
            if (bgVar.f266053y) {
                bgVar.f266029M.mo89007e();
            }
        } else if (ordinal != 158) {
            bgVar.f266029M.mo89005it(serviceEventData);
        } else {
            try {
                C88382zp zpVar = (C88382zp) serviceEventData.mo81918e(C88380zn.f238990a);
                C58976aa aaVar4 = C58975e.f156826a;
            } catch (Exception e) {
                C59104x c = C95097bg.f266015a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(18043)).mo56386p("Error getting UpdateRecognizedTextEventData");
            }
        }
    }
}
