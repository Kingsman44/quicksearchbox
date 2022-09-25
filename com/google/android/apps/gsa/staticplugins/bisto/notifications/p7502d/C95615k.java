package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.content.Context;
import android.media.AudioManager;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.android.apps.gsa.shared.bisto.C89622at;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.k */
/* compiled from: PG */
public final class C95615k implements C36599b {

    /* renamed from: k */
    private static final C59071e f267587k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.d.k");

    /* renamed from: a */
    public final Object f267588a = new Object();

    /* renamed from: b */
    public boolean f267589b;

    /* renamed from: c */
    public boolean f267590c;

    /* renamed from: d */
    public C95606b f267591d;

    /* renamed from: e */
    public long f267592e = 0;

    /* renamed from: f */
    public final C89622at f267593f;

    /* renamed from: g */
    public final C95625u f267594g;

    /* renamed from: h */
    public final C21370a f267595h;

    /* renamed from: i */
    public final AtomicBoolean f267596i = new AtomicBoolean();

    /* renamed from: j */
    public final AudioManager f267597j;

    /* renamed from: l */
    private final Executor f267598l;

    /* renamed from: m */
    private final AtomicBoolean f267599m = new AtomicBoolean();

    public C95615k(Context context, C89622at atVar, C21370a aVar, Executor executor) {
        this.f267594g = new C95625u(context);
        this.f267593f = atVar;
        this.f267595h = aVar;
        this.f267598l = executor;
        this.f267597j = (AudioManager) context.getSystemService("audio");
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final void mo21529a() {
        this.f267596i.set(true);
        if (this.f267599m.get()) {
            mo89569i();
        }
    }

    /* renamed from: b */
    public final void mo21530b(boolean z) {
        this.f267598l.execute(new C95614j(this, z));
    }

    /* renamed from: c */
    public final void mo21531c(int i) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: d */
    public final void mo21532d(int i) {
        this.f267598l.execute(new C95613i(this, i));
    }

    /* renamed from: e */
    public final void mo21533e(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.f267598l.execute(new C95610f(this, statusBarNotification, rankingMap));
    }

    /* renamed from: f */
    public final void mo21534f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.f267598l.execute(new C95612h(this, statusBarNotification));
    }

    /* renamed from: g */
    public final void mo21535g(C83390g gVar) {
        this.f267598l.execute(new C95611g(this, gVar));
    }

    /* renamed from: h */
    public final void mo89568h() {
        boolean z;
        synchronized (this.f267588a) {
            if (this.f267590c) {
                C58976aa aaVar = C58975e.f156826a;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f267593f.mo83490e(2, 5);
            this.f267599m.set(true);
        }
    }

    /* renamed from: i */
    public final void mo89569i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f267593f.mo83490e(0, 5);
        this.f267599m.set(false);
    }

    /* renamed from: j */
    public final void mo89570j(C95606b bVar) {
        synchronized (this.f267588a) {
            this.f267590c = true;
            this.f267591d = bVar;
        }
        mo89568h();
    }

    /* renamed from: k */
    public final void mo89571k(StatusBarNotification... statusBarNotificationArr) {
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            synchronized (this.f267588a) {
                C95606b bVar = this.f267591d;
                if (bVar != null) {
                    boolean f = bVar.f267565c.mo89556f(statusBarNotification);
                    if (!bVar.f267566d) {
                        if (bVar.f267565c.mo89555e()) {
                            C58976aa aaVar = C58975e.f156826a;
                            bVar.f267566d = true;
                            bVar.f267564b.mo89560d(bVar);
                        }
                    } else if (!bVar.f267565c.mo89555e()) {
                        bVar.mo89559a();
                    }
                    if (f) {
                        C59104x b = f267587k.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "BistoNotifListener");
                        ((C59052c) ((C59052c) b).mo56372aa(16184)).mo56386p("Handled by AlarmHandler.");
                    }
                }
            }
        }
    }
}
