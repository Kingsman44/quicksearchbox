package android.support.p033v7.app;

import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2058bx;

/* renamed from: android.support.v7.app.aa */
/* compiled from: PG */
final class C0340aa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0356aq f1135a;

    public C0340aa(C0356aq aqVar) {
        this.f1135a = aqVar;
    }

    public final void run() {
        C0356aq aqVar = this.f1135a;
        aqVar.f1220t.showAtLocation(aqVar.f1219s, 55, 0, 0);
        this.f1135a.mo1161N();
        if (this.f1135a.mo1170W()) {
            this.f1135a.f1219s.setAlpha(0.0f);
            C0356aq aqVar2 = this.f1135a;
            C2058bx x = C2043bi.m5595x(aqVar2.f1219s);
            x.mo5201c(1.0f);
            aqVar2.f1222v = x;
            this.f1135a.f1222v.mo5203e(new C0405z(this));
            return;
        }
        this.f1135a.f1219s.setAlpha(1.0f);
        this.f1135a.f1219s.setVisibility(0);
    }
}
