package com.google.android.libraries.logging;

import android.os.SystemClock;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60219s;
import com.google.common.p4552o.p4566l.C60220t;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.logging.b */
/* compiled from: PG */
public final class C28260b {

    /* renamed from: a */
    private static final AtomicInteger f76912a = new AtomicInteger();

    /* renamed from: b */
    private static final long f76913b;

    /* renamed from: c */
    private static final C60220t f76914c;

    static {
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        f76913b = currentTimeMillis;
        SystemClock.elapsedRealtime();
        C60219s sVar = (C60219s) C60220t.f162931e.createBuilder();
        sVar.copyOnWrite();
        C60220t tVar = (C60220t) sVar.instance;
        tVar.f162933a |= 2;
        tVar.f162935c = 0;
        sVar.copyOnWrite();
        C60220t tVar2 = (C60220t) sVar.instance;
        tVar2.f162933a |= 4;
        tVar2.f162936d = 0;
        sVar.copyOnWrite();
        C60220t tVar3 = (C60220t) sVar.instance;
        tVar3.f162933a |= 1;
        tVar3.f162934b = currentTimeMillis;
        f76914c = (C60220t) sVar.build();
    }

    /* renamed from: a */
    public static C60218r m52825a() {
        C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
        int andIncrement = f76912a.getAndIncrement();
        qVar.copyOnWrite();
        C60218r rVar = (C60218r) qVar.instance;
        rVar.f162927a |= 2;
        rVar.f162929c = (long) andIncrement;
        C60220t tVar = f76914c;
        qVar.copyOnWrite();
        C60218r rVar2 = (C60218r) qVar.instance;
        tVar.getClass();
        rVar2.f162928b = tVar;
        rVar2.f162927a |= 1;
        return (C60218r) qVar.build();
    }
}
