package android.support.p033v7.app;

/* renamed from: android.support.v7.app.w */
/* compiled from: PG */
final class C0402w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0356aq f1366a;

    public C0402w(C0356aq aqVar) {
        this.f1366a = aqVar;
    }

    public final void run() {
        C0356aq aqVar = this.f1366a;
        if ((aqVar.f1185J & 1) != 0) {
            aqVar.mo1160M(0);
        }
        C0356aq aqVar2 = this.f1366a;
        if ((aqVar2.f1185J & 4096) != 0) {
            aqVar2.mo1160M(108);
        }
        C0356aq aqVar3 = this.f1366a;
        aqVar3.f1184I = false;
        aqVar3.f1185J = 0;
    }
}
