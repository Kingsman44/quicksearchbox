package com.google.android.libraries.search.assistant.p2803u.p2804a.p2807c;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4120ax.p4121a.p4122a.p4123a.p4124a.C54641a;
import com.google.p4120ax.p4121a.p4122a.p4123a.p4124a.C54642b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.u.a.c.d */
/* compiled from: PG */
public final /* synthetic */ class C36640d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f95488a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f95489b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f95490c;

    public /* synthetic */ C36640d(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f95488a = cxVar;
        this.f95489b = cxVar2;
        this.f95490c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f95488a;
        C60870cx cxVar2 = this.f95489b;
        C60870cx cxVar3 = this.f95490c;
        int intValue = ((Integer) C60856cj.m92909r(cxVar2)).intValue();
        int intValue2 = ((Integer) C60856cj.m92909r(cxVar3)).intValue();
        ((C59052c) ((C59052c) C36642f.f95492a.mo56224b()).mo56372aa(51517)).mo56393w("emailOptInSeenCount %d, emailOptInStatus %d", intValue, intValue2);
        C54641a aVar = (C54641a) C54642b.f143461e.createBuilder();
        aVar.copyOnWrite();
        C54642b bVar = (C54642b) aVar.instance;
        bVar.f143464b = ((C9855w) C60856cj.m92909r(cxVar)).f33882d;
        bVar.f143463a |= 1;
        aVar.copyOnWrite();
        C54642b bVar2 = (C54642b) aVar.instance;
        bVar2.f143463a |= 4;
        bVar2.f143466d = intValue;
        aVar.copyOnWrite();
        C54642b bVar3 = (C54642b) aVar.instance;
        bVar3.f143463a |= 2;
        bVar3.f143465c = intValue2;
        return (C54642b) aVar.build();
    }
}
