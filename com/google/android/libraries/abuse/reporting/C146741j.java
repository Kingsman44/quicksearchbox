package com.google.android.libraries.abuse.reporting;

/* renamed from: com.google.android.libraries.abuse.reporting.j */
/* compiled from: PG */
public final /* synthetic */ class C146741j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReportAbuseActivity f396263a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f396264b;

    public /* synthetic */ C146741j(ReportAbuseActivity reportAbuseActivity, Runnable runnable) {
        this.f396263a = reportAbuseActivity;
        this.f396264b = runnable;
    }

    public final void run() {
        ReportAbuseActivity reportAbuseActivity = this.f396263a;
        Runnable runnable = this.f396264b;
        if (!reportAbuseActivity.f396166r) {
            runnable.run();
        }
    }
}
