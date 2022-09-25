package com.google.apps.tiktok.concurrent;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import java.util.IdentityHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.concurrent.x */
/* compiled from: PG */
public final class C46472x {

    /* renamed from: a */
    public static final C59071e f121604a = C59071e.m91332i("com.google.apps.tiktok.concurrent.x");

    /* renamed from: b */
    public final Runnable f121605b;

    /* renamed from: c */
    public final Executor f121606c;

    /* renamed from: d */
    public final C46462n f121607d;

    /* renamed from: e */
    public final Object f121608e = new Object();

    /* renamed from: f */
    public final NotificationManager f121609f;

    /* renamed from: g */
    public final IdentityHashMap f121610g = new IdentityHashMap(10);

    /* renamed from: h */
    public Class f121611h;

    /* renamed from: i */
    public Service f121612i;

    /* renamed from: j */
    public C46471w f121613j;

    /* renamed from: k */
    public int f121614k;

    /* renamed from: l */
    public C46470v f121615l;

    /* renamed from: m */
    private final Context f121616m;

    public C46472x(Context context, C46462n nVar, Executor executor, NotificationManager notificationManager) {
        this.f121616m = context;
        this.f121607d = nVar;
        this.f121606c = new C60904dr(executor);
        this.f121613j = C46471w.STOPPED;
        this.f121605b = new C46467s(this, executor);
        this.f121609f = notificationManager;
    }

    /* renamed from: a */
    public final C46470v mo50473a(C46470v vVar) {
        int i;
        C58838bb.m90884s(!this.f121610g.isEmpty(), "Can't select a best notification if thare are none");
        C46470v vVar2 = null;
        for (C46470v vVar3 : this.f121610g.values()) {
            if (vVar2 == null || (i = vVar2.f121598b) < vVar3.f121598b || (vVar == vVar3 && i == vVar.f121598b)) {
                vVar2 = vVar3;
            }
        }
        return vVar2;
    }

    /* renamed from: b */
    public final void mo50474b(Notification notification) {
        C58838bb.m90883r(this.f121613j == C46471w.STOPPED);
        Intent intent = new Intent(this.f121616m, this.f121611h);
        intent.putExtra("fallback_notification", notification);
        this.f121613j = C46471w.STARTING;
        this.f121616m.startForegroundService(intent);
    }

    /* renamed from: c */
    public final void mo50475c() {
        C58838bb.m90887v(this.f121613j == C46471w.STARTED, "Destroyed in wrong state %s", this.f121613j);
        this.f121613j = C46471w.STOPPED;
        this.f121612i.stopForeground(true);
        this.f121615l = null;
        this.f121612i.stopSelf(this.f121614k);
        this.f121612i = null;
    }

    /* renamed from: d */
    public final void mo50476d(C46470v vVar) {
        C46470v vVar2 = this.f121615l;
        C46470v a = mo50473a(vVar);
        this.f121615l = a;
        if (vVar2 != a) {
            this.f121612i.startForeground(174344743, a.f121597a);
        }
    }
}
