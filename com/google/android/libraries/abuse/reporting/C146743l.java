package com.google.android.libraries.abuse.reporting;

import android.widget.Toast;
import com.google.android.gms.auth.C142916p;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.abuse.reporting.l */
/* compiled from: PG */
public final /* synthetic */ class C146743l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReportAbuseActivity f396266a;

    /* renamed from: b */
    public final /* synthetic */ Exception f396267b;

    /* renamed from: c */
    public final /* synthetic */ int f396268c;

    public /* synthetic */ C146743l(ReportAbuseActivity reportAbuseActivity, Exception exc, int i) {
        this.f396266a = reportAbuseActivity;
        this.f396267b = exc;
        this.f396268c = i;
    }

    public final void run() {
        ReportAbuseActivity reportAbuseActivity = this.f396266a;
        Exception exc = this.f396267b;
        int i = this.f396268c;
        if (exc instanceof C142916p) {
            reportAbuseActivity.f396155G.mo119353a(reportAbuseActivity, ((C142916p) exc).f387823a, i, new C146742k(reportAbuseActivity)).show();
        } else if (exc instanceof UserRecoverableAuthException) {
            reportAbuseActivity.startActivityForResult(((UserRecoverableAuthException) exc).mo117772a(), i);
        } else {
            Toast.makeText(reportAbuseActivity, reportAbuseActivity.getString(R.string.uraw_network_error_text), 0).show();
            reportAbuseActivity.finish();
        }
    }
}
