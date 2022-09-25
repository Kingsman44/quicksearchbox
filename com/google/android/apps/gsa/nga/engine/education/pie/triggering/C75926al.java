package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.C75909j;
import com.google.android.apps.gsa.nga.engine.education.pie.C75913n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81380n;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.al */
/* compiled from: PG */
public final /* synthetic */ class C75926al implements C75909j {

    /* renamed from: a */
    public final /* synthetic */ C75928an f210668a;

    public /* synthetic */ C75926al(C75928an anVar) {
        this.f210668a = anVar;
    }

    /* renamed from: c */
    public final void mo71916c(C80203ax axVar) {
        C75928an anVar = this.f210668a;
        if (axVar.f220049a == 7) {
            try {
                Intent parseUri = Intent.parseUri((String) axVar.f220050b, 0);
                int i = true != "NGA_PIE.notification_tap".equals(parseUri.getAction()) ? 6 : 5;
                Bundle extras = parseUri.getExtras();
                if (extras != null) {
                    anVar.f210672b.mo71904b(extras, C75913n.m122414f(i).mo71870a());
                    return;
                }
                C81380n d = C81381o.m129461d();
                d.mo75043b(C80265t.TRIGGER_OPA_PROACTIVE_NOTIFICATION_TAP_FAILED);
                d.mo75045d(i);
                throw d.mo75042a();
            } catch (C81381o e) {
                anVar.f210673c.mo71913b(e, true);
            } catch (Exception e2) {
                ((C58970a) ((C58970a) ((C58970a) C75928an.f210671a.mo56225c()).mo56382g(e2)).mo56372aa(3455)).mo56386p("Error triggering flow from notification");
            }
        }
    }
}
