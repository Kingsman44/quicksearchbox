package com.google.android.libraries.abuse.reporting;

import android.support.p031v4.app.FragmentManager;

/* renamed from: com.google.android.libraries.abuse.reporting.n */
/* compiled from: PG */
public final /* synthetic */ class C146745n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C146746o f396270a;

    public /* synthetic */ C146745n(C146746o oVar) {
        this.f396270a = oVar;
    }

    public final void run() {
        C146746o oVar = this.f396270a;
        ReportAbuseActivity reportAbuseActivity = oVar.f396272b;
        FragmentManager jw = reportAbuseActivity.mo545jw();
        ReportAbuseActivity reportAbuseActivity2 = oVar.f396272b;
        reportAbuseActivity.f396159k = new C146718ag(reportAbuseActivity, jw, new ReportAbuseComponentState(reportAbuseActivity2.f396169u, reportAbuseActivity2.f396152D));
        oVar.f396272b.f396159k.mo123547c();
        oVar.f396271a.set(true);
    }
}
