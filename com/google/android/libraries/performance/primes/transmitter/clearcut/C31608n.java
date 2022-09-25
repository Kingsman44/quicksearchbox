package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.libraries.performance.primes.transmitter.C31616h;
import com.google.android.libraries.performance.primes.transmitter.C31617i;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import com.google.common.base.C58817ah;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.clearcut.n */
/* compiled from: PG */
public final /* synthetic */ class C31608n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C31610p f85075a;

    /* renamed from: b */
    public final /* synthetic */ C71308ej f85076b;

    public /* synthetic */ C31608n(C31610p pVar, C71308ej ejVar) {
        this.f85075a = pVar;
        this.f85076b = ejVar;
    }

    public final Object apply(Object obj) {
        C31610p pVar = this.f85075a;
        C71308ej ejVar = this.f85076b;
        C31616h hVar = (C31616h) ((C31617i) obj).toBuilder();
        hVar.copyOnWrite();
        C31617i iVar = (C31617i) hVar.instance;
        ejVar.getClass();
        iVar.f85089b = ejVar;
        iVar.f85088a |= 1;
        String[] strArr = {pVar.f85078b.getClass().getName()};
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(pVar.f85077a, LifeboatReceiver.class));
        intent.setPackage(pVar.f85077a.getPackageName());
        intent.putExtra("Transmitters", strArr);
        intent.putExtra("MetricSnapshot", ((C31617i) hVar.build()).toByteArray());
        pVar.f85077a.sendBroadcast(intent);
        return null;
    }
}
