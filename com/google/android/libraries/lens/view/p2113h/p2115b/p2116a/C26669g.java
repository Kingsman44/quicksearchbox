package com.google.android.libraries.lens.view.p2113h.p2115b.p2116a;

import android.graphics.PointF;
import android.hardware.Camera;
import java.util.Timer;

/* renamed from: com.google.android.libraries.lens.view.h.b.a.g */
/* compiled from: PG */
public final /* synthetic */ class C26669g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26679q f72712a;

    /* renamed from: b */
    public final /* synthetic */ PointF f72713b;

    public /* synthetic */ C26669g(C26679q qVar, PointF pointF) {
        this.f72712a = qVar;
        this.f72713b = pointF;
    }

    public final void run() {
        C26679q qVar = this.f72712a;
        PointF pointF = this.f72713b;
        if (qVar.f72737k && qVar.f72738l != null && C26665c.m49278f(qVar.mo31973b())) {
            qVar.mo31976f();
            Camera.Area a = C26665c.m49273a(pointF);
            qVar.mo31986p(a);
            qVar.f72746t = C26665c.m49275c(a);
            qVar.f72747u = new Timer();
            qVar.f72748v = new C26678p(qVar);
            Timer timer = qVar.f72747u;
            timer.getClass();
            timer.schedule(qVar.f72748v, C26679q.f72727b.toMillis());
        }
    }
}
