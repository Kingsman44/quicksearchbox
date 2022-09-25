package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.common.p4552o.adk;
import com.google.common.p4552o.adl;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.af.bh */
/* compiled from: PG */
public final /* synthetic */ class C25063bh implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C25068bm f68308a;

    public /* synthetic */ C25063bh(C25068bm bmVar) {
        this.f68308a = bmVar;
    }

    public final Object call() {
        C25068bm bmVar = this.f68308a;
        adk adk = (adk) adl.f158377d.createBuilder();
        boolean f = bmVar.f68320f.mo30536f("android.permission.CAMERA");
        adk.copyOnWrite();
        adl adl = (adl) adk.instance;
        adl.f158379a |= 1;
        adl.f158380b = f;
        C25504aj ajVar = bmVar.f68320f;
        boolean f2 = ajVar.mo30536f(ajVar.mo30532b());
        adk.copyOnWrite();
        adl adl2 = (adl) adk.instance;
        adl2.f158379a |= 2;
        adl2.f158381c = f2;
        return (adl) adk.build();
    }
}
