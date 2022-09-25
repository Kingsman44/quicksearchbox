package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.p8452a;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.C4632m;
import androidx.work.C4643x;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110538ac;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.a.c */
/* compiled from: PG */
public final class C110528c implements C46575i {

    /* renamed from: a */
    public final C58974d f308135a;

    /* renamed from: b */
    private final Context f308136b;

    /* renamed from: c */
    private final C83794j f308137c;

    /* renamed from: d */
    private final C68214a f308138d;

    /* renamed from: e */
    private final C110538ac f308139e;

    /* renamed from: f */
    private final C39141kp f308140f;

    public C110528c(Context context, C83564a aVar, C83794j jVar, C68214a aVar2, C110538ac acVar, C39141kp kpVar) {
        this.f308136b = context;
        this.f308135a = aVar.mo76900a("CalRefreshTaskCheck");
        this.f308137c = jVar;
        this.f308138d = aVar2;
        this.f308139e = acVar;
        this.f308140f = kpVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        JobScheduler jobScheduler;
        List<JobInfo> list;
        ((C58970a) ((C58970a) this.f308135a.mo56224b()).mo56372aa(26576)).mo56386p("Start to check Smartspace calendar refresh task schedule status.");
        this.f308140f.mo41704s("CLASSIC_SMARTSPACE_CALENDAR_PERIODIC_TASK_TRIGGERED");
        if (this.f308137c.mo77160D() && (jobScheduler = (JobScheduler) this.f308136b.getSystemService("jobscheduler")) != null) {
            int i = this.f308137c.mo77159C() ? ((SharedPreferences) this.f308138d.mo27525b()).getInt("smartspace_calendar_task_id", 0) : -285;
            try {
                list = jobScheduler.getAllPendingJobs();
            } catch (Throwable th) {
                ((C58970a) ((C58970a) ((C58970a) this.f308135a.mo56225c()).mo56382g(th)).mo56372aa(26578)).mo56386p("Exception when calling getAllPendingJobs()");
                list = null;
            }
            if (list == null) {
                return C60856cj.m92900i(new C4643x(C4632m.f14549a));
            }
            boolean z = false;
            for (JobInfo id : list) {
                z |= !(id.getId() != i);
            }
            if (!z || i == 0) {
                this.f308140f.mo41704s("CLASSIC_SMARTSPACE_CALENDAR_REFRESH_TASK_MISSING");
                ((C58970a) ((C58970a) this.f308135a.mo56226d()).mo56372aa(26577)).mo56386p("Missing calendar refresh task on Smartspace!");
                return C47633f.m84733g(this.f308139e.mo98758a()).mo51515h(C110526a.f308133a, C60826bg.f164896a).mo51513e(Throwable.class, new C110527b(this), C60826bg.f164896a);
            }
        }
        return C60856cj.m92900i(new C4645z(C4632m.f14549a));
    }
}
