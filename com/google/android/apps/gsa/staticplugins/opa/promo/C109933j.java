package com.google.android.apps.gsa.staticplugins.opa.promo;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60321oe;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.j */
/* compiled from: PG */
public final /* synthetic */ class C109933j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109935l f306304a;

    public /* synthetic */ C109933j(C109935l lVar) {
        this.f306304a = lVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109935l lVar = this.f306304a;
        Integer num = (Integer) obj;
        if (num.intValue() <= 0) {
            C58833ax d = C109935l.m183104d(C109935l.m183103a(), BuildConfig.FLAVOR, BuildConfig.FLAVOR);
            if (d.mo56113h()) {
                C89949q.m146521e((C60321oe) d.mo56107c(), false);
            }
            lVar.f306311f.mo101394d("opa_entry_point_notification_counterfactual", Integer.valueOf(num.intValue() + 1));
        }
    }
}
