package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import android.location.Location;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.sidekick.main.entry.C91321az;
import com.google.android.apps.gsa.sidekick.main.entry.C91324bb;
import com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator;
import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C8142xb;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.q */
/* compiled from: PG */
public final /* synthetic */ class C98135q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98064as f274041a;

    /* renamed from: b */
    public final /* synthetic */ C91953ad f274042b;

    /* renamed from: c */
    public final /* synthetic */ boolean f274043c;

    public /* synthetic */ C98135q(C98064as asVar, C91953ad adVar, boolean z) {
        this.f274041a = asVar;
        this.f274042b = adVar;
        this.f274043c = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C91321az azVar;
        boolean z;
        boolean z2;
        C7744ii iiVar;
        C7744ii iiVar2;
        C7744ii iiVar3;
        C98064as asVar = this.f274041a;
        C91953ad adVar = this.f274042b;
        boolean z3 = this.f274043c;
        Location location = (Location) obj;
        long m = asVar.mo90918m();
        synchronized (asVar.f273819o) {
            C7744ii iiVar4 = (C7744ii) ((C58833ax) C60856cj.m92910s(asVar.f273822r.mo85612a())).mo56111f();
            azVar = null;
            z = false;
            if (iiVar4 != null) {
                if (!z3 || asVar.f273816l.mo79746e(C90010bp.f246923S)) {
                    iiVar = adVar.mo86655l(iiVar4);
                } else {
                    iiVar = adVar.mo86654k(iiVar4);
                }
                C7744ii iiVar5 = iiVar;
                boolean z4 = !iiVar4.equals(iiVar5);
                if (z4) {
                    C91321az azVar2 = r4;
                    C91321az azVar3 = new C91321az(location, m, new TriggerConditionEvaluator.APriori((List) C58485gu.m89845m()), true, asVar.f273815k);
                    asVar.mo90927v(asVar.mo90924s(iiVar5, azVar2));
                    azVar = azVar2;
                }
                if (asVar.f273816l.mo79746e(C90010bp.f246923S) && (iiVar2 = (C7744ii) ((C58833ax) C60856cj.m92910s(asVar.f273822r.mo85614c(false, C8142xb.UNKNOWN_SURFACE))).mo56111f()) != null) {
                    C91324bb bbVar = asVar.f273823s;
                    if (z3) {
                        iiVar3 = adVar.mo86654k(iiVar2);
                    } else {
                        iiVar3 = adVar.mo86655l(iiVar2);
                    }
                    bbVar.mo85635u(iiVar3);
                }
                z = z4;
            }
        }
        if (!z || azVar == null) {
            z2 = z;
        } else {
            asVar.mo90926u(azVar);
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
