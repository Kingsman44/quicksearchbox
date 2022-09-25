package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22158aa;
import com.google.common.p4552o.C60338ov;
import com.google.common.p4552o.C60339ow;
import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityThroughputListener;

/* renamed from: com.google.android.libraries.gsa.c.a.af */
/* compiled from: PG */
final class C22207af extends NetworkQualityThroughputListener {

    /* renamed from: a */
    private final C22158aa f61293a;

    public C22207af(Executor executor, C22158aa aaVar) {
        super(executor);
        this.f61293a = aaVar;
    }

    public final void onThroughputObservation(int i, long j, int i2) {
        C22158aa aaVar = this.f61293a;
        long time = new Date().getTime();
        C60338ov ovVar = (C60338ov) C60339ow.f163320e.createBuilder();
        ovVar.copyOnWrite();
        C60339ow owVar = (C60339ow) ovVar.instance;
        owVar.f163322a |= 2;
        owVar.f163324c = i;
        ovVar.copyOnWrite();
        C60339ow owVar2 = (C60339ow) ovVar.instance;
        owVar2.f163322a |= 1;
        owVar2.f163323b = time;
        ovVar.copyOnWrite();
        C60339ow owVar3 = (C60339ow) ovVar.instance;
        owVar3.f163322a |= 4;
        owVar3.f163325d = i2;
        aaVar.f61148a.f61153c.mo27445c((C60339ow) ovVar.build());
    }
}
