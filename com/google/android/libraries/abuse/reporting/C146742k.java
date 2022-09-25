package com.google.android.libraries.abuse.reporting;

import android.content.DialogInterface;

/* renamed from: com.google.android.libraries.abuse.reporting.k */
/* compiled from: PG */
public final /* synthetic */ class C146742k implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ ReportAbuseActivity f396265a;

    public /* synthetic */ C146742k(ReportAbuseActivity reportAbuseActivity) {
        this.f396265a = reportAbuseActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f396265a.finish();
    }
}
