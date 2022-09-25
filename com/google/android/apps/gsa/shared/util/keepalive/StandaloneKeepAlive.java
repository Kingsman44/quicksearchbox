package com.google.android.apps.gsa.shared.util.keepalive;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Pair;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class StandaloneKeepAlive implements C91051c {

    /* renamed from: e */
    private static final C59071e f254295e = C59071e.m91332i("com.google.android.apps.gsa.shared.util.keepalive.StandaloneKeepAlive");

    /* renamed from: a */
    public final Object f254296a;

    /* renamed from: b */
    public boolean f254297b;

    /* renamed from: c */
    public ForegroundService f254298c;

    /* renamed from: d */
    public int f254299d = -1;

    /* renamed from: f */
    private final Context f254300f;

    /* renamed from: g */
    private final C68214a f254301g;

    /* renamed from: h */
    private final Intent f254302h;

    /* renamed from: i */
    private final Intent f254303i;

    /* renamed from: j */
    private final List f254304j;

    /* renamed from: k */
    private boolean f254305k;

    /* renamed from: l */
    private boolean f254306l;

    /* compiled from: PG */
    public final class ForegroundService extends C91050b {

        /* renamed from: a */
        public C91051c f254307a;

        /* renamed from: b */
        public int f254308b;

        public final IBinder onBind(Intent intent) {
            return null;
        }

        public final void onCreate() {
            super.onCreate();
            C58838bb.m90883r(this.f254307a instanceof StandaloneKeepAlive);
        }

        public final void onDestroy() {
            StandaloneKeepAlive standaloneKeepAlive = (StandaloneKeepAlive) this.f254307a;
            synchronized (standaloneKeepAlive.f254296a) {
                if (standaloneKeepAlive.f254298c == this) {
                    standaloneKeepAlive.f254298c = null;
                }
            }
        }

        public final int onStartCommand(Intent intent, int i, int i2) {
            StandaloneKeepAlive standaloneKeepAlive = (StandaloneKeepAlive) this.f254307a;
            synchronized (standaloneKeepAlive.f254296a) {
                standaloneKeepAlive.f254297b = false;
                standaloneKeepAlive.f254298c = this;
                standaloneKeepAlive.f254299d = i2;
                standaloneKeepAlive.mo85325f(this);
            }
            return 2;
        }
    }

    /* compiled from: PG */
    public final class KeepAliveService extends C89286c {
        public final IBinder onBind(Intent intent) {
            return null;
        }
    }

    public StandaloneKeepAlive(Context context, C68214a aVar) {
        this.f254300f = context;
        this.f254301g = aVar;
        this.f254302h = new Intent(context, KeepAliveService.class);
        this.f254303i = new Intent(context, ForegroundService.class);
        this.f254296a = new Object();
        this.f254304j = new ArrayList();
    }

    /* renamed from: g */
    private final boolean m148723g(Intent intent, boolean z) {
        if (z) {
            try {
                this.f254300f.startForegroundService(intent);
                return false;
            } catch (IllegalStateException e) {
                ((C59052c) ((C59052c) ((C59052c) f254295e.mo56226d()).mo56382g(e)).mo56372aa(11426)).mo56389s("Attempting to start service when the app is in background is not allowed on Android O+. Intent: %s", intent);
                return false;
            }
        } else if (this.f254300f.startService(intent) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo85320a(int i, Notification notification) {
        ForegroundService foregroundService;
        synchronized (this.f254296a) {
            if (this.f254305k) {
                this.f254304j.add(Pair.create(Integer.valueOf(i), notification));
                if (!(this.f254299d == -1 || (foregroundService = this.f254298c) == null)) {
                    mo85325f(foregroundService);
                }
            } else {
                if (!this.f254304j.isEmpty() && !this.f254306l) {
                    for (Pair pair : this.f254304j) {
                        ((NotificationManager) this.f254301g.mo27525b()).notify(((Integer) pair.first).intValue(), (Notification) pair.second);
                    }
                }
                this.f254304j.clear();
                this.f254304j.add(Pair.create(Integer.valueOf(i), notification));
                this.f254305k = true;
                if (!this.f254297b) {
                    this.f254297b = true;
                    m148723g(this.f254303i, true);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo85321b(boolean z) {
        ForegroundService foregroundService;
        synchronized (this.f254296a) {
            if (this.f254305k) {
                this.f254306l = z;
                this.f254305k = false;
                if (!(this.f254299d == -1 || (foregroundService = this.f254298c) == null)) {
                    mo85325f(foregroundService);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo85322c() {
        this.f254300f.stopService(this.f254302h);
    }

    /* renamed from: d */
    public final boolean mo85323d() {
        return m148723g(this.f254302h, false);
    }

    /* renamed from: e */
    public final void mo85324e() {
        mo85321b(false);
    }

    /* renamed from: f */
    public final void mo85325f(ForegroundService foregroundService) {
        int i = 1;
        C58838bb.m90883r(this.f254299d != -1);
        if (this.f254305k) {
            int size = this.f254304j.size();
            for (int i2 = foregroundService.f254308b; i2 < size; i2++) {
                Pair pair = (Pair) this.f254304j.get(i2);
                ((NotificationManager) this.f254301g.mo27525b()).notify(((Integer) pair.first).intValue(), (Notification) pair.second);
                foregroundService.startForeground(((Integer) pair.first).intValue(), (Notification) pair.second);
            }
            foregroundService.f254308b = size;
            return;
        }
        if (foregroundService.f254308b == 0) {
            if (this.f254304j.isEmpty()) {
                ((C59052c) ((C59052c) f254295e.mo56226d()).mo56372aa(11425)).mo56386p("updateNotifications called but foregroundNotifications is empty. This may result in ANR.");
            } else {
                Pair pair2 = (Pair) this.f254304j.get(0);
                ((NotificationManager) this.f254301g.mo27525b()).notify(((Integer) pair2.first).intValue(), (Notification) pair2.second);
                foregroundService.startForeground(((Integer) pair2.first).intValue(), (Notification) pair2.second);
            }
        }
        this.f254304j.clear();
        foregroundService.f254308b = 0;
        if (true != this.f254306l) {
            i = 2;
        }
        foregroundService.stopForeground(i);
        foregroundService.stopSelf(this.f254299d);
        this.f254299d = -1;
    }
}
