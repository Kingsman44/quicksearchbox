package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.C2395z;
import androidx.work.C4380ad;
import androidx.work.impl.utils.p210b.C4595b;
import java.util.UUID;

/* compiled from: PG */
public class SystemForegroundService extends C2395z implements C4544c {

    /* renamed from: b */
    public static final String f14353b = C4380ad.m12561i("SystemFgService");

    /* renamed from: c */
    C4545d f14354c;

    /* renamed from: d */
    NotificationManager f14355d;

    /* renamed from: e */
    private Handler f14356e;

    /* renamed from: f */
    private boolean f14357f;

    /* renamed from: e */
    private final void m12911e() {
        this.f14356e = new Handler(Looper.getMainLooper());
        this.f14355d = (NotificationManager) getApplicationContext().getSystemService("notification");
        C4545d dVar = new C4545d(getApplicationContext());
        this.f14354c = dVar;
        if (dVar.f14368i != null) {
            C4380ad.m12560h().mo9311c(C4545d.f14360a, "A callback already exists.");
        } else {
            dVar.f14368i = this;
        }
    }

    /* renamed from: a */
    public final void mo9499a(int i) {
        this.f14356e.post(new C4548g(this, i));
    }

    /* renamed from: b */
    public final void mo9500b(int i, Notification notification) {
        this.f14356e.post(new C4547f(this, i, notification));
    }

    /* renamed from: c */
    public final void mo9501c(int i, int i2, Notification notification) {
        this.f14356e.post(new C4546e(this, i, notification, i2));
    }

    /* renamed from: d */
    public final void mo9502d() {
        this.f14357f = true;
        C4380ad.m12560h().mo9309a(f14353b, "All commands completed.");
        stopForeground(true);
        stopSelf();
    }

    public final void onCreate() {
        super.onCreate();
        m12911e();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f14354c.mo9506h();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f14357f) {
            C4380ad.m12560h().mo9313e(f14353b, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f14354c.mo9506h();
            m12911e();
            this.f14357f = false;
        }
        if (intent == null) {
            return 3;
        }
        C4545d dVar = this.f14354c;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C4380ad h = C4380ad.m12560h();
            String str = C4545d.f14360a;
            new StringBuilder("Started foreground service ").append(intent);
            h.mo9313e(str, "Started foreground service ".concat(intent.toString()));
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            C4595b bVar = dVar.f14369j;
            bVar.f14486a.execute(new C4543b(dVar, stringExtra));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                C4380ad h2 = C4380ad.m12560h();
                String str2 = C4545d.f14360a;
                new StringBuilder("Stopping foreground work for ").append(intent);
                h2.mo9313e(str2, "Stopping foreground work for ".concat(intent.toString()));
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                    return 3;
                }
                dVar.f14361b.mo9329c(UUID.fromString(stringExtra2));
                return 3;
            } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            } else {
                C4380ad.m12560h().mo9313e(C4545d.f14360a, "Stopping foreground service");
                C4544c cVar = dVar.f14368i;
                if (cVar == null) {
                    return 3;
                }
                cVar.mo9502d();
                return 3;
            }
        }
        dVar.mo9505g(intent);
        return 3;
    }
}
