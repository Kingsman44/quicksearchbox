package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import com.google.android.apps.gsa.sidekick.main.p7200c.C91282g;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91397i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7726hr;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ad */
/* compiled from: PG */
public final /* synthetic */ class C105673ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C105681al f294805a;

    public /* synthetic */ C105673ad(C105681al alVar) {
        this.f294805a = alVar;
    }

    public final void run() {
        C105681al alVar = this.f294805a;
        C105687ar arVar = alVar.f294819e;
        C91397i iVar = arVar.f294832C;
        Iterator it = arVar.f294833D;
        if (iVar == null || it == null) {
            alVar.f294817c = C58570jy.m90169u(new C7726hr[0], 0);
            return;
        }
        C60220t d = iVar.mo85721d();
        int i = d.f162933a;
        if (!((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0)) {
            arVar.f294865d.mo28212l("populate ve parent id", new C105678ai(alVar, d));
        }
        ((C91282g) alVar.f294819e.f294869h.mo27525b()).mo85557b(alVar.f294815a, iVar.mo85718a());
        alVar.f294817c = C58570jy.m90161m(it, new C105679aj(alVar));
        alVar.f294816b = C58485gu.m89842j(iVar.mo85720c());
    }
}
