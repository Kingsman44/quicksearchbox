package android.support.p033v7.app;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* renamed from: android.support.v7.app.aj */
/* compiled from: PG */
final class C0349aj extends C0351al {

    /* renamed from: a */
    public final PowerManager f1147a;

    /* renamed from: b */
    final /* synthetic */ C0356aq f1148b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0349aj(C0356aq aqVar, Context context) {
        super(aqVar);
        this.f1148b = aqVar;
        this.f1147a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: a */
    public final IntentFilter mo1140a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    /* renamed from: b */
    public final void mo1141b() {
        this.f1148b.mo1175ac(true, true);
    }
}
