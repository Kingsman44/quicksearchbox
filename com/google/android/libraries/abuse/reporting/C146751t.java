package com.google.android.libraries.abuse.reporting;

import org.chromium.net.CronetException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.abuse.reporting.t */
/* compiled from: PG */
final class C146751t implements C146733b {

    /* renamed from: a */
    final /* synthetic */ ReportAbuseActivity f396277a;

    public C146751t(ReportAbuseActivity reportAbuseActivity) {
        this.f396277a = reportAbuseActivity;
    }

    /* renamed from: a */
    public final void mo123570a(CronetException cronetException) {
        this.f396277a.mo123512k(cronetException, 1002);
    }

    /* renamed from: b */
    public final void mo123571b(String str) {
        this.f396277a.mo123518p(new C146750s(this));
        ReportAbuseActivity reportAbuseActivity = this.f396277a;
        if (reportAbuseActivity.f396171w) {
            try {
                reportAbuseActivity.f396150B = new JSONObject(str).getString("reportId");
            } catch (JSONException e) {
                this.f396277a.mo123512k(e, 1002);
            }
        } else {
            reportAbuseActivity.f396150B = "no_report_id";
        }
    }
}
