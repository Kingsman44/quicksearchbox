package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.cb */
/* compiled from: PG */
final class C13803cb implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C13811cj f42004a;

    public C13803cb(C13811cj cjVar) {
        this.f42004a = cjVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C60870cx cxVar;
        this.f42004a.f42071o.set(true);
        C13753bf bfVar = this.f42004a.f42080x;
        if (bfVar != null) {
            cxVar = bfVar.mo21249f();
        } else {
            cxVar = C60856cj.m92899h(new RuntimeException());
        }
        C46459k.m82829b(C47633f.m84733g(cxVar).mo51515h(new C13802ca(this), this.f42004a.f42063g), "Offline failed or has a punt response.", new Object[0]);
        this.f42004a.mo21264e();
    }
}
