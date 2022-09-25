package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.g */
/* compiled from: PG */
public final /* synthetic */ class C109930g implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109935l f306300a;

    public /* synthetic */ C109930g(C109935l lVar) {
        this.f306300a = lVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109935l lVar = this.f306300a;
        Integer num = (Integer) obj;
        if (num.intValue() <= 0) {
            C58976aa aaVar = C58975e.f156826a;
            String string = lVar.f306308c.getResources().getString(R.string.opa_entry_point_notification_title);
            String string2 = lVar.f306308c.getResources().getString(R.string.opa_entry_point_notification_content);
            C28292j a = C109935l.m183103a();
            C58833ax d = C109935l.m183104d(a, string, string2);
            if (d.mo56113h()) {
                C89949q.m146521e((C60321oe) d.mo56107c(), false);
            }
            C48980c cVar = C109935l.f306307b;
            C83879am o = C83880an.m133553o();
            C83940g gVar = (C83940g) o;
            gVar.f228605a = "opa_android:entry_point";
            gVar.f228607c = new C83938e(0, (String) null, (String) null);
            C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
            e eVar = e.bi;
            vVar.copyOnWrite();
            C59567w wVar = (C59567w) vVar.instance;
            wVar.f158064e = eVar.ca;
            wVar.f158060a |= 16;
            o.mo77222b((C59567w) vVar.build());
            Intent n = o.mo77221a().mo77240n();
            Intent action = new Intent().setClassName(lVar.f306308c, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED");
            action.putExtra("opa-nga-target-intent", n);
            action.putExtra("notification_channel", cVar.getNumber());
            action.putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 128);
            C60214n g = C28285c.m52880g(a);
            if (g != null) {
                action.putExtra("ved", C28294l.m52913c(g));
            }
            PendingIntent service = PendingIntent.getService(lVar.f306308c, 1, action, 201326592);
            C36334o b = lVar.f306310e.mo40115b(cVar);
            C1839z a2 = C89095d.m144923a(lVar.f306308c, (String) null);
            a2.f5679J.icon = R.drawable.ic_assistant_light;
            a2.f5670A = lVar.f306308c.getResources().getColor(R.color.google_blue);
            a2.f5671B = 1;
            a2.f5685e = C1839z.m5037c(string);
            a2.f5686f = C1839z.m5037c(string2);
            a2.f5687g = service;
            a2.f5675F = b.f94887a;
            a2.f5690j = b.f94889c;
            a2.mo5015d(16, true);
            lVar.f306312g.mo28208h("sendNotification", 30000, new C109932i(lVar, a2.mo5013a()));
            lVar.f306311f.mo101394d("opa_entry_point_notification_count", Integer.valueOf(num.intValue() + 1));
        }
    }
}
