package com.google.android.apps.gsa.staticplugins.smartspace.p8763d;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.gsa.tasks.C118468ac;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.d.d */
/* compiled from: PG */
public final class C117375d {

    /* renamed from: c */
    public static final /* synthetic */ int f325836c = 0;

    /* renamed from: d */
    private static final C58881cr f325837d = C58886cw.m90973a(C117374c.f325835a);

    /* renamed from: a */
    public final C118561t f325838a;

    /* renamed from: b */
    public final C83794j f325839b;

    /* renamed from: e */
    private final C83793i f325840e;

    /* renamed from: f */
    private final C58974d f325841f;

    /* renamed from: g */
    private final C68214a f325842g;

    /* renamed from: h */
    private final Context f325843h;

    public C117375d(C118561t tVar, C83794j jVar, C83793i iVar, C83564a aVar, C68214a aVar2, Context context) {
        this.f325838a = tVar;
        this.f325839b = jVar;
        this.f325840e = iVar;
        this.f325841f = aVar.mo76900a("CalCtrl");
        this.f325842g = aVar2;
        this.f325843h = context;
    }

    /* renamed from: a */
    public final C60870cx mo103280a(boolean z) {
        List<JobInfo> list;
        ((C58970a) ((C58970a) this.f325841f.mo56224b()).mo56372aa(33099)).mo56389s("refreshCalendarData %b", Boolean.valueOf(z));
        if (this.f325839b.mo77185x()) {
            ((C58970a) ((C58970a) this.f325841f.mo56224b()).mo56372aa(33102)).mo56386p("PCP migration is enabled for calendar, skip the refresh.");
            return C118826c.f331423b;
        }
        if (z) {
            this.f325838a.mo103752c(C118522by.SMARTSPACE_CALENDAR_REFRESH);
            ((C58970a) ((C58970a) this.f325841f.mo56224b()).mo56372aa(33103)).mo56386p("Scheduling calendar refresh task.");
            C118561t tVar = this.f325838a;
            C118522by byVar = this.f325839b.mo77164I() ? C118522by.OPA_SMARTSPACE_CALENDAR_REFRESH : C118522by.SMARTSPACE_CALENDAR_REFRESH;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            C118468ac acVar = (C118468ac) f325837d.mo6453a();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            acVar.getClass();
            agVar.f328828h = acVar;
            agVar.f328821a |= 64;
            tVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
        JobScheduler jobScheduler = (JobScheduler) this.f325843h.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            int i = this.f325839b.mo77159C() ? ((SharedPreferences) this.f325842g.mo27525b()).getInt("smartspace_calendar_task_id", 0) : -285;
            if (i != 0) {
                try {
                    list = jobScheduler.getAllPendingJobs();
                } catch (Throwable th) {
                    ((C58970a) ((C58970a) ((C58970a) this.f325841f.mo56225c()).mo56382g(th)).mo56372aa(33101)).mo56386p("Exception when calling getAllPendingJobs()");
                    list = null;
                }
                if (list == null) {
                    return C118826c.f331423b;
                }
                boolean z2 = false;
                for (JobInfo id : list) {
                    z2 |= !(id.getId() != i);
                }
                if (!z2) {
                    this.f325840e.mo77148d();
                    C95883aa.m158983d(this.f325841f.mo56226d(), "Missing calendar refresh task on Smartspace!", 33100, C38505d.f101863a, Integer.valueOf(C89885b.SMARTSPACE_CALENDAR_REFRESH_TASK_NOT_ENQUEUED_VALUE));
                    return C118826c.f331423b;
                }
            } else {
                this.f325840e.mo77148d();
                return C118826c.f331423b;
            }
        }
        this.f325839b.f228395f.mo77149e();
        return C118826c.f331423b;
    }
}
