package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122415bg;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122416bh;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9295i.p9296a.C122976b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.z */
/* compiled from: PG */
public final class C123078z implements C123067o, C122976b {

    /* renamed from: a */
    public static final C59071e f340639a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.z");

    /* renamed from: b */
    public static final Duration f340640b = Duration.ofSeconds(5);

    /* renamed from: c */
    public final Object f340641c = new Object();

    /* renamed from: d */
    public C58485gu f340642d = null;

    /* renamed from: e */
    public C60870cx f340643e = C60866ct.f164955a;

    /* renamed from: f */
    private final Context f340644f;

    /* renamed from: g */
    private final List f340645g = new ArrayList();

    /* renamed from: h */
    private final C123001av f340646h;

    /* renamed from: i */
    private final BroadcastReceiver f340647i;

    public C123078z(Context context, C123001av avVar, C60888db dbVar) {
        this.f340644f = context;
        this.f340646h = avVar;
        C123077y yVar = new C123077y(new C123072t(this, dbVar));
        this.f340647i = yVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(yVar, intentFilter);
    }

    /* renamed from: a */
    public final C58485gu mo105855a() {
        C58485gu guVar;
        synchronized (this.f340641c) {
            if (this.f340642d == null) {
                C123001av avVar = this.f340646h;
                long a = avVar.f340547a.mo26884a();
                PackageManager packageManager = this.f340644f.getPackageManager();
                long a2 = avVar.f340547a.mo26884a();
                C122415bg bgVar = (C122415bg) C122416bh.f339381d.createBuilder();
                bgVar.copyOnWrite();
                ((C122416bh) bgVar.instance).f339383a = 30000;
                bgVar.copyOnWrite();
                ((C122416bh) bgVar.instance).f339384b = a;
                bgVar.copyOnWrite();
                ((C122416bh) bgVar.instance).f339385c = a2 - a;
                avVar.mo105819b((C122416bh) bgVar.build());
                this.f340642d = (C58485gu) Collection.EL.stream(packageManager.getInstalledPackages(0)).filter(new C123073u(packageManager)).map(new C123074v(packageManager)).collect(C58370cn.f155946a);
            }
            guVar = this.f340642d;
        }
        return guVar;
    }

    /* renamed from: b */
    public final synchronized void mo105856b(C123066n nVar) {
        this.f340645g.add(nVar);
    }

    /* renamed from: c */
    public final C60870cx mo105714c() {
        this.f340644f.unregisterReceiver(this.f340647i);
        synchronized (this) {
            this.f340645g.clear();
        }
        synchronized (this.f340641c) {
            this.f340643e.cancel(false);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final synchronized void mo105857d(C123066n nVar) {
        this.f340645g.remove(nVar);
    }

    /* renamed from: e */
    public final void mo105863e() {
        C58485gu j;
        synchronized (this) {
            j = C58485gu.m89842j(this.f340645g);
        }
        Collection.EL.forEach(j, C123075w.f340636a);
    }
}
