package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22158aa;
import com.google.common.p4552o.C60336ot;
import com.google.common.p4552o.C60337ou;
import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityRttListener;

/* renamed from: com.google.android.libraries.gsa.c.a.ae */
/* compiled from: PG */
final class C22206ae extends NetworkQualityRttListener {

    /* renamed from: a */
    private final C22158aa f61292a;

    public C22206ae(Executor executor, C22158aa aaVar) {
        super(executor);
        this.f61292a = aaVar;
    }

    public final void onRttObservation(int i, long j, int i2) {
        C22158aa aaVar = this.f61292a;
        long time = new Date().getTime();
        C60336ot otVar = (C60336ot) C60337ou.f163314e.createBuilder();
        otVar.copyOnWrite();
        C60337ou ouVar = (C60337ou) otVar.instance;
        ouVar.f163316a |= 2;
        ouVar.f163318c = i;
        otVar.copyOnWrite();
        C60337ou ouVar2 = (C60337ou) otVar.instance;
        ouVar2.f163316a |= 1;
        ouVar2.f163317b = time;
        otVar.copyOnWrite();
        C60337ou ouVar3 = (C60337ou) otVar.instance;
        ouVar3.f163316a |= 4;
        ouVar3.f163319d = i2;
        aaVar.f61148a.f61152b.mo27445c((C60337ou) otVar.build());
    }
}
