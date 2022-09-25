package android.support.p033v7.app;

import android.content.IntentFilter;

/* renamed from: android.support.v7.app.am */
/* compiled from: PG */
final class C0352am extends C0351al {

    /* renamed from: a */
    public final C0375bi f1152a;

    /* renamed from: b */
    final /* synthetic */ C0356aq f1153b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0352am(C0356aq aqVar, C0375bi biVar) {
        super(aqVar);
        this.f1153b = aqVar;
        this.f1152a = biVar;
    }

    /* renamed from: a */
    public final IntentFilter mo1140a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    /* renamed from: b */
    public final void mo1141b() {
        this.f1153b.mo1175ac(true, true);
    }
}
