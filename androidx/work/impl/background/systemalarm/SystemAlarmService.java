package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.C2395z;
import androidx.work.C4380ad;
import androidx.work.impl.utils.C4582ac;

/* compiled from: PG */
public class SystemAlarmService extends C2395z implements C4531k {

    /* renamed from: b */
    private static final String f14294b = C4380ad.m12561i("SystemAlarmService");

    /* renamed from: c */
    private C4533m f14295c;

    /* renamed from: d */
    private boolean f14296d;

    /* renamed from: b */
    private final void m12867b() {
        C4533m mVar = new C4533m(this);
        this.f14295c = mVar;
        if (mVar.f14335i != null) {
            C4380ad.m12560h().mo9311c(C4533m.f14327a, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            mVar.f14335i = this;
        }
    }

    /* renamed from: a */
    public final void mo9480a() {
        this.f14296d = true;
        C4380ad.m12560h().mo9309a(f14294b, "All commands completed in dispatcher");
        C4582ac.m12986b();
        stopSelf();
    }

    public final void onCreate() {
        super.onCreate();
        m12867b();
        this.f14296d = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f14296d = true;
        this.f14295c.mo9490b();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f14296d) {
            C4380ad.m12560h().mo9313e(f14294b, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f14295c.mo9490b();
            m12867b();
            this.f14296d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f14295c.mo9492d(intent, i2);
        return 3;
    }
}
