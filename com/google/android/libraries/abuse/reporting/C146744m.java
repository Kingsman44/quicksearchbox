package com.google.android.libraries.abuse.reporting;

import org.chromium.net.CronetEngine;

/* renamed from: com.google.android.libraries.abuse.reporting.m */
/* compiled from: PG */
final class C146744m extends C146740i {

    /* renamed from: a */
    final /* synthetic */ ReportAbuseActivity f396269a;

    public C146744m(ReportAbuseActivity reportAbuseActivity) {
        this.f396269a = reportAbuseActivity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo123574a() {
        return new CronetEngine.Builder(this.f396269a.f396158j).build();
    }
}
