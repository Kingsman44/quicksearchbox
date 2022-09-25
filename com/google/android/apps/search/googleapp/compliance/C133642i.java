package com.google.android.apps.search.googleapp.compliance;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.location.p3029a.C38590aj;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.android.apps.search.googleapp.compliance.i */
/* compiled from: PG */
public final /* synthetic */ class C133642i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133644k f364042a;

    public /* synthetic */ C133642i(C133644k kVar) {
        this.f364042a = kVar;
    }

    public final void onClick(View view) {
        C133644k kVar = this.f364042a;
        C47538ax c = kVar.f364047d.mo51613c("handleAllowForXMinutes");
        try {
            kVar.f364046c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(kVar.mo111312d()));
            kVar.mo111314f(C38590aj.CONSENT_REASON_TEMPORARILY_ALLOWED);
            if (!kVar.mo111315h()) {
                kVar.f364051h.mo526b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            } else {
                C133644k.m216867g(kVar.f364044a);
            }
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
