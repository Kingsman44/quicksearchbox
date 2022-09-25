package com.google.android.apps.search.googleapp.compliance;

import android.net.Uri;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47467e;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47486w;
import com.google.apps.tiktok.monitoring.feedback.C47488y;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.android.apps.search.googleapp.compliance.j */
/* compiled from: PG */
public final /* synthetic */ class C133643j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133644k f364043a;

    public /* synthetic */ C133643j(C133644k kVar) {
        this.f364043a = kVar;
    }

    public final void onClick(View view) {
        C133644k kVar = this.f364043a;
        C47538ax c = kVar.f364047d.mo51613c("launchPlink");
        try {
            kVar.f364046c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(kVar.mo111311c()));
            C47486w d = C47488y.m84500d();
            ((C47467e) d).f123263a = "aga_settings_location";
            d.mo51321b(Uri.parse("https://support.google.com/websearch/?p=aga_settings_location"));
            C47488y a = d.mo51320a();
            C47474k g = C47475l.m84477g();
            ((C47465c) g).f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
            g.mo51310d(false);
            kVar.f364050g.mo51298a(a, g.mo51332e());
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133624d.m216863a(th, th);
        }
        throw th;
    }
}
