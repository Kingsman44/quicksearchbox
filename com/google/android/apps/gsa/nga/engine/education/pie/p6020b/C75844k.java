package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import androidx.core.p094f.C1897j;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.k */
/* compiled from: PG */
public final /* synthetic */ class C75844k implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C75852s f210464a;

    public /* synthetic */ C75844k(C75852s sVar) {
        this.f210464a = sVar;
    }

    public final void run() {
        C80201av avVar;
        C75852s sVar = this.f210464a;
        C83357g gVar = sVar.f210478g;
        NgaState a = sVar.f210474c.a();
        if (a == null || !a.b()) {
            avVar = C80201av.PIE_INELIGIBLE_NGA_NOT_ENABLED;
        } else if (!a.a()) {
            avVar = C80201av.PIE_INELIGIBLE_NGA_NOT_ACTIVE;
        } else if (!sVar.mo71924d()) {
            avVar = C80201av.PIE_INELIGIBLE_PIE_NOT_ENABLED;
        } else if (!sVar.f210479h.get()) {
            avVar = C80201av.PIE_INELIGIBLE_CONFIGURATION_NOT_INITIALIZED;
        } else {
            C1897j c = C1897j.m5166c();
            Locale e = sVar.f210476e.mo72021b().mo72039e();
            if (c.f5774b.f5775a.isEmpty() || !c.f5774b.f5775a.get(0).equals(e)) {
                avVar = C80201av.PIE_INELIGIBLE_SYSTEM_AND_ASSISTANT_LOCALE_DIFFER;
            } else if (!((C58528ij) Collection.EL.stream(C89988b.m146551d(sVar.f210475d.mo85403h(C90126fx.f251627mQ))).map(C75846m.f210466a).collect(C58370cn.f155947b)).contains(e)) {
                avVar = C80201av.PIE_INELIGIBLE_UNSUPPORTED_LOCALE;
            } else if (sVar.f210475d.mo85405j(C90126fx.f251356hK) || !sVar.f210477f.isEnabled()) {
                avVar = C80201av.PIE_ELIGIBLE;
            } else {
                avVar = C80201av.PIE_INELIGIBLE_ACCESSIBILITY_ENABLED;
            }
        }
        gVar.mo76660b(avVar);
    }
}
