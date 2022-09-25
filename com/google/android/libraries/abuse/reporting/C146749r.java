package com.google.android.libraries.abuse.reporting;

import android.os.AsyncTask;
import com.google.android.gms.tasks.C146021aq;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.abuse.reporting.r */
/* compiled from: PG */
final class C146749r extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ ReportAbuseActivity f396275a;

    public C146749r(ReportAbuseActivity reportAbuseActivity) {
        this.f396275a = reportAbuseActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            ReportAbuseActivity reportAbuseActivity = this.f396275a;
            if (!reportAbuseActivity.f396154F) {
                reportAbuseActivity.f396172x = (String) C146021aq.m237852f(reportAbuseActivity.f396156H.mo117811b(reportAbuseActivity.f396151C));
            }
            this.f396275a.mo123518p(new C146748q(this));
            return null;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f396275a.mo123512k(e, 1001);
            return null;
        } catch (ExecutionException e2) {
            this.f396275a.mo123512k((Exception) e2.getCause(), 1001);
            return null;
        }
    }
}
