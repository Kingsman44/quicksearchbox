package com.google.android.libraries.lens.view;

import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.p1635au.C19569f;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.u */
/* compiled from: PG */
public final /* synthetic */ class C28094u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28138v f76467a;

    /* renamed from: b */
    public final /* synthetic */ long f76468b;

    public /* synthetic */ C28094u(C28138v vVar, long j) {
        this.f76467a = vVar;
        this.f76468b = j;
    }

    public final void run() {
        C28138v vVar = this.f76467a;
        ((C19569f) ((C25043ao) vVar.f76555d.mo27525b()).f68261m.mo6453a()).mo24824b((double) TimeUnit.NANOSECONDS.toSeconds(this.f76468b - vVar.f76552a.mo31463h()), new Object[0]);
    }
}
