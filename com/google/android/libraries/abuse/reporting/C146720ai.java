package com.google.android.libraries.abuse.reporting;

/* renamed from: com.google.android.libraries.abuse.reporting.ai */
/* compiled from: PG */
public final /* synthetic */ class C146720ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C146726ao f396218a;

    /* renamed from: b */
    public final /* synthetic */ ReportAbuseCardConfigParcel f396219b;

    public /* synthetic */ C146720ai(C146726ao aoVar, ReportAbuseCardConfigParcel reportAbuseCardConfigParcel) {
        this.f396218a = aoVar;
        this.f396219b = reportAbuseCardConfigParcel;
    }

    public final void run() {
        C146726ao aoVar = this.f396218a;
        ReportAbuseCardConfigParcel reportAbuseCardConfigParcel = this.f396219b;
        aoVar.f396241j.scrollTo(aoVar.f396242k * aoVar.mo123557b(), 0);
        aoVar.mo123564i(reportAbuseCardConfigParcel);
    }
}
