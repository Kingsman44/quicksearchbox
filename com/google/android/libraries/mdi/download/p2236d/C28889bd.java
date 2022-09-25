package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29329dm;
import com.google.android.libraries.mdi.download.C29330dn;
import com.google.android.libraries.mdi.download.C29333dq;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.d.bd */
/* compiled from: PG */
public final /* synthetic */ class C28889bd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78460a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78461b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f78462c;

    /* renamed from: d */
    public final /* synthetic */ C29380ed f78463d;

    /* renamed from: e */
    public final /* synthetic */ C60931s f78464e;

    public /* synthetic */ C28889bd(C29117fe feVar, C29392ep epVar, AtomicReference atomicReference, C29380ed edVar, C60931s sVar) {
        this.f78460a = feVar;
        this.f78461b = epVar;
        this.f78462c = atomicReference;
        this.f78463d = edVar;
        this.f78464e = sVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78460a;
        C29392ep epVar = this.f78461b;
        AtomicReference atomicReference = this.f78462c;
        C29380ed edVar = this.f78463d;
        C60931s sVar = this.f78464e;
        C29334dr drVar = (C29334dr) obj;
        if (drVar == null) {
            return C60922j.m93045h(feVar.mo34582e(epVar, true), C47810es.m84966f(new C29060ea(epVar, atomicReference)), feVar.f78980i);
        }
        atomicReference.set(drVar);
        C29330dn dnVar = drVar.f79500b;
        if (dnVar == null) {
            dnVar = C29330dn.f79488g;
        }
        int i = dnVar.f79495f;
        C29333dq dqVar = (C29333dq) drVar.toBuilder();
        C29329dm dmVar = (C29329dm) dnVar.toBuilder();
        dmVar.copyOnWrite();
        C29330dn dnVar2 = (C29330dn) dmVar.instance;
        dnVar2.f79490a |= 16;
        dnVar2.f79495f = i + 1;
        dqVar.copyOnWrite();
        C29334dr drVar2 = (C29334dr) dqVar.instance;
        C29330dn dnVar3 = (C29330dn) dmVar.build();
        dnVar3.getClass();
        drVar2.f79500b = dnVar3;
        drVar2.f79499a |= 1;
        C29334dr drVar3 = (C29334dr) dqVar.build();
        boolean z = !((dnVar.f79490a & 8) != 0);
        if (z) {
            long a = feVar.f78977f.mo34498a();
            C29330dn dnVar4 = drVar3.f79500b;
            if (dnVar4 == null) {
                dnVar4 = C29330dn.f79488g;
            }
            C29329dm dmVar2 = (C29329dm) dnVar4.toBuilder();
            dmVar2.copyOnWrite();
            C29330dn dnVar5 = (C29330dn) dmVar2.instance;
            dnVar5.f79490a |= 8;
            dnVar5.f79494e = a;
            C29330dn dnVar6 = (C29330dn) dmVar2.build();
            C29333dq dqVar2 = (C29333dq) drVar3.toBuilder();
            dqVar2.copyOnWrite();
            C29334dr drVar4 = (C29334dr) dqVar2.instance;
            dnVar6.getClass();
            drVar4.f79500b = dnVar6;
            drVar4.f79499a = 1 | drVar4.f79499a;
            drVar3 = (C29334dr) dqVar2.build();
        }
        C29391eo eoVar = (C29391eo) epVar.toBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        epVar2.f79681a |= 8;
        epVar2.f79685e = false;
        return C29670b.m54719g(C60922j.m93045h(feVar.f78975d.mo34607l((C29392ep) eoVar.build(), drVar3), C47810es.m84966f(new C29067eh(feVar, z, drVar3)), feVar.f78980i)).mo34820f(IOException.class, C29061eb.f78873a, feVar.f78980i).mo34822i(new C29062ec(feVar, edVar, epVar, sVar), feVar.f78980i);
    }
}
