package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.C4405bb;
import androidx.work.C4407c;
import androidx.work.C4409e;
import androidx.work.C4637r;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.contrib.work.C46579m;
import com.google.apps.tiktok.contrib.work.C46580n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60888db;
import dagger.p5294a.C68220f;

/* renamed from: com.google.apps.tiktok.contrib.work.b.y */
/* compiled from: PG */
public final class C46567y implements C68220f {
    /* renamed from: a */
    public static C4409e m83007a(C58833ax axVar, C60888db dbVar, C46428ao aoVar, C4405bb bbVar) {
        C4407c cVar = new C4407c();
        cVar.f14053a = dbVar;
        cVar.f14056d = new C46566x(aoVar);
        cVar.f14055c = dbVar;
        cVar.f14054b = bbVar;
        C46580n nVar = (C46580n) ((C58847bk) axVar).f156646a;
        if (nVar.mo50552a().mo56113h()) {
            cVar.f14058f = (String) nVar.mo50552a().mo56107c();
        }
        if (nVar.mo50553b().mo56113h()) {
            cVar.f14057e = (C4637r) nVar.mo50553b().mo56107c();
        }
        if (nVar.mo50556e().mo56113h()) {
            cVar.f14059g = ((Integer) nVar.mo50556e().mo56107c()).intValue();
        }
        if (!nVar.mo50554c().mo56113h()) {
            if (nVar.mo50555d().mo56113h()) {
                int intValue = ((Integer) nVar.mo50555d().mo56107c()).intValue();
                if (intValue >= 20) {
                    cVar.f14060h = Math.min(intValue, 50);
                } else {
                    throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
                }
            }
            return new C4409e(cVar);
        }
        int i = ((C46579m) nVar.mo50554c().mo56107c()).f121774a;
        int i2 = ((C46579m) nVar.mo50554c().mo56107c()).f121775b;
        throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
