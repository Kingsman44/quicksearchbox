package com.google.android.apps.search.googleapp.compliance;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.location.p3029a.C38590aj;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.android.apps.search.googleapp.compliance.g */
/* compiled from: PG */
public final /* synthetic */ class C133640g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133644k f364040a;

    public /* synthetic */ C133640g(C133644k kVar) {
        this.f364040a = kVar;
    }

    public final void onClick(View view) {
        C133644k kVar = this.f364040a;
        C47538ax c = kVar.f364047d.mo51613c("handleDenial");
        try {
            kVar.f364046c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(kVar.mo111310b()));
            kVar.mo111314f(C38590aj.CONSENT_REASON_DECLINED);
            C133644k.m216867g(kVar.f364044a);
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
