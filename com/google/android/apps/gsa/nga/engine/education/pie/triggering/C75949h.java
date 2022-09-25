package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80208bb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80212bf;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58512hu;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.h */
/* compiled from: PG */
public final /* synthetic */ class C75949h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C75953l f210728a;

    /* renamed from: b */
    public final /* synthetic */ C75933as f210729b;

    /* renamed from: c */
    public final /* synthetic */ C80248co f210730c;

    /* renamed from: d */
    public final /* synthetic */ C80213bg f210731d;

    /* renamed from: e */
    public final /* synthetic */ String f210732e;

    public /* synthetic */ C75949h(C75953l lVar, C75933as asVar, C80248co coVar, C80213bg bgVar, String str) {
        this.f210728a = lVar;
        this.f210729b = asVar;
        this.f210730c = coVar;
        this.f210731d = bgVar;
        this.f210732e = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C75953l lVar = this.f210728a;
        C75933as asVar = this.f210729b;
        C80248co coVar = this.f210730c;
        C80213bg bgVar = this.f210731d;
        String str = this.f210732e;
        C80208bb bbVar = (C80208bb) obj;
        C58459fv fvVar = new C58459fv(asVar.mo71967b());
        fvVar.mo54956I(coVar, bgVar);
        synchronized (lVar) {
            Map map = lVar.f210742d;
            C75932ar d = C75933as.m122459d();
            ((C75959o) d).f210749a = C58512hu.m89942v(fvVar);
            if (Map.EL.replace(map, str, d.mo71963a()) != null) {
                C80212bf.m128095a(bgVar.f220080b).name();
                coVar.name();
            }
        }
    }
}
