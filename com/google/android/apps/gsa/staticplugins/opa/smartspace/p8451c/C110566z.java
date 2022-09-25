package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.z */
/* compiled from: PG */
public final /* synthetic */ class C110566z implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110538ac f308243a;

    public /* synthetic */ C110566z(C110538ac acVar) {
        this.f308243a = acVar;
    }

    public final C60870cx apply(Object obj) {
        C110538ac acVar = this.f308243a;
        List list = (List) obj;
        if (!((Boolean) list.get(0)).booleanValue()) {
            ((C58970a) ((C58970a) acVar.f308162i.mo56224b()).mo56372aa(26563)).mo56386p("Do not refresh calendar data because Smartspace is not available on device.");
            return C118826c.f331423b;
        } else if (!((Boolean) list.get(1)).booleanValue()) {
            ((C58970a) ((C58970a) acVar.f308162i.mo56224b()).mo56372aa(26562)).mo56386p("Do not refresh calendar data because Personal Response is not allowed.");
            return C118826c.f331423b;
        } else {
            if (acVar.f308159f.mo79746e(C89985ax.f246702aj)) {
                if (acVar.f308164k == 0) {
                    acVar.f308164k = 1;
                    acVar.f308163j = acVar.f308161h.mo26870b();
                } else {
                    long millis = TimeUnit.MINUTES.toMillis(acVar.f308159f.mo79743a(C89985ax.f246703ak));
                    if (acVar.f308161h.mo26870b() - acVar.f308163j >= millis) {
                        acVar.f308164k = 1;
                        acVar.f308163j = acVar.f308161h.mo26870b();
                    } else if (((long) acVar.f308164k) < acVar.f308159f.mo79743a(C89985ax.f246701ai)) {
                        acVar.f308164k++;
                    } else {
                        long b = (acVar.f308163j + millis) - acVar.f308161h.mo26870b();
                        if (acVar.f308158e.mo77159C()) {
                            ((C58970a) ((C58970a) acVar.f308162i.mo56224b()).mo56372aa(26572)).mo56386p("Rescheduling non-exclusive calendar refresh task.");
                            C118561t tVar = acVar.f308157d;
                            C118522by byVar = C118522by.OPA_SMARTSPACE_CALENDAR_REFRESH;
                            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                            afVar.copyOnWrite();
                            C118472ag agVar = (C118472ag) afVar.instance;
                            agVar.f328821a = 1 | agVar.f328821a;
                            agVar.f328822b = b;
                            afVar.copyOnWrite();
                            C118472ag agVar2 = (C118472ag) afVar.instance;
                            agVar2.f328821a |= 2;
                            agVar2.f328823c = 10000;
                            Integer b2 = tVar.mo103751b(byVar, (C118472ag) afVar.build());
                            if (b2 != null) {
                                ((SharedPreferences) acVar.f308160g.mo27525b()).edit().putInt("smartspace_calendar_task_id", b2.intValue()).apply();
                            }
                        } else {
                            ((C58970a) ((C58970a) acVar.f308162i.mo56224b()).mo56372aa(26570)).mo56386p("Rescheduling exclusive calendar refresh task.");
                            if (!acVar.f308158e.mo77160D()) {
                                acVar.f308157d.mo103752c(C118522by.OPA_SMARTSPACE_CALENDAR_REFRESH);
                            }
                            C118561t tVar2 = acVar.f308157d;
                            C118522by byVar2 = C118522by.OPA_SMARTSPACE_CALENDAR_REFRESH;
                            C118471af afVar2 = (C118471af) C118472ag.f328819i.createBuilder();
                            afVar2.copyOnWrite();
                            C118472ag agVar3 = (C118472ag) afVar2.instance;
                            agVar3.f328821a = 1 | agVar3.f328821a;
                            agVar3.f328822b = b;
                            afVar2.copyOnWrite();
                            C118472ag agVar4 = (C118472ag) afVar2.instance;
                            agVar4.f328821a |= 2;
                            agVar4.f328823c = 10000;
                            tVar2.mo103754e(byVar2, (C118472ag) afVar2.build());
                        }
                        C95883aa.m158983d(acVar.f308162i.mo56226d(), "Calendar refresh is throttled on Smartspace.", 26571, C38505d.f101863a, Integer.valueOf(C89885b.SMARTSPACE_CALENDAR_REFRESH_THROTTLED_VALUE));
                        ((C58970a) ((C58970a) acVar.f308162i.mo56224b()).mo56372aa(26561)).mo56386p("Do not refresh calendar data because the task is throttled and rescheduled.");
                        return C118826c.f331423b;
                    }
                }
            }
            if (!acVar.f308158e.mo77159C()) {
                acVar.mo98759b();
            }
            if (!acVar.f308158e.mo77164I()) {
                ((C58970a) ((C58970a) acVar.f308162i.mo56224b()).mo56372aa(26560)).mo56386p("#refreshCalendarData(): Opa Zero State refresh is disabled.");
                return C118826c.f331423b;
            }
            C60870cx i = acVar.f308155b.mo28209i(acVar.f308156c.mo77051c(acVar.f308159f.mo79743a(C90014bt.f247653lH)), "returnDoneIfCalendarDataSuccessfullyWritten", new C110563w(acVar));
            if (!acVar.f308158e.mo77159C()) {
                return i;
            }
            new C90873ag(i, acVar.f308155b, "#getOnDeviceMediaProactiveData()", new C110564x(acVar)).mo85223a(new C110565y(acVar));
            return i;
        }
    }
}
