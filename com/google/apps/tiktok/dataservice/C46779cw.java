package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58514hw;
import com.google.common.p4522b.C58517hz;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.apps.tiktok.dataservice.cw */
/* compiled from: PG */
final class C46779cw implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Object f122132a;

    /* renamed from: b */
    final /* synthetic */ C46782cz f122133b;

    /* renamed from: c */
    final /* synthetic */ C58833ax f122134c;

    /* renamed from: d */
    final /* synthetic */ C46780cx f122135d;

    public C46779cw(C46780cx cxVar, Object obj, C46782cz czVar, C58833ax axVar) {
        this.f122135d = cxVar;
        this.f122132a = obj;
        this.f122133b = czVar;
        this.f122134c = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C58528ij<C46784da> c;
        C46780cx cxVar = this.f122135d;
        Object obj2 = this.f122132a;
        C46782cz czVar = this.f122133b;
        C58833ax axVar = this.f122134c;
        C58838bb.m90866a(obj2, "Cannot notify change for a null key");
        synchronized (cxVar.f122136a) {
            C58514hw hwVar = new C58514hw(4);
            if (obj2 instanceof C46770cn) {
                C58517hz hzVar = (C58517hz) cxVar.f122137b.get(obj2);
                if (hzVar != null) {
                    hwVar.mo55468b(hzVar);
                }
            } else if (obj2 instanceof C46691ai) {
                C58800sl lA = ((C46691ai) obj2).mo50742b().iterator();
                while (lA.hasNext()) {
                    C58517hz hzVar2 = (C58517hz) cxVar.f122137b.get(lA.next());
                    if (hzVar2 != null) {
                        hwVar.mo55468b(hzVar2);
                    }
                }
            } else {
                C58517hz hzVar3 = (C58517hz) cxVar.f122137b.get(obj2);
                if (hzVar3 != null) {
                    hwVar.mo55468b(hzVar3);
                }
            }
            c = hwVar.mo55467a().mo55460c();
        }
        for (C46784da daVar : c) {
            if (axVar.mo56111f() != daVar) {
                daVar.mo50795a(czVar);
            }
        }
    }
}
