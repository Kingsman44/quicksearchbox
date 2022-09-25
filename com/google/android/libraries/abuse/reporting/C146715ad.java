package com.google.android.libraries.abuse.reporting;

import java.util.ArrayList;

/* renamed from: com.google.android.libraries.abuse.reporting.ad */
/* compiled from: PG */
final class C146715ad implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C146718ag f396207a;

    public C146715ad(C146718ag agVar) {
        this.f396207a = agVar;
    }

    public final void run() {
        C146718ag agVar = this.f396207a;
        C146726ao aoVar = agVar.f396214c;
        ArrayList<ReportAbuseCardConfigParcel> arrayList = agVar.f396215d.f396187b;
        aoVar.f396240i.removeAllViews();
        aoVar.f396242k = 0;
        for (ReportAbuseCardConfigParcel c : arrayList) {
            aoVar.mo123558c(c);
        }
        aoVar.mo123563h();
        aoVar.f396243l.postDelayed(new C146720ai(aoVar, (ReportAbuseCardConfigParcel) arrayList.get(arrayList.size() - 1)), 100);
        this.f396207a.f396214c.mo123561f();
    }
}
