package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.libraries.gsa.c.a.a.am */
/* compiled from: PG */
public final class C22170am implements C90991b {

    /* renamed from: a */
    public static final C59071e f61180a = C59071e.m91332i("com.google.android.libraries.gsa.c.a.a.am");

    /* renamed from: b */
    public static final NetworkInfo.State[] f61181b = {NetworkInfo.State.CONNECTED, NetworkInfo.State.CONNECTING, NetworkInfo.State.DISCONNECTED, NetworkInfo.State.DISCONNECTING};

    /* renamed from: c */
    public final BroadcastReceiver f61182c = new C22168ak(this);

    /* renamed from: d */
    final Lock f61183d = new ReentrantLock();

    /* renamed from: e */
    public final Context f61184e;

    /* renamed from: f */
    public final C21370a f61185f;

    /* renamed from: g */
    public final ConnectivityManager f61186g;

    /* renamed from: h */
    public final TelephonyManager f61187h;

    /* renamed from: i */
    public final WifiManager f61188i;

    /* renamed from: j */
    public final Executor f61189j;

    /* renamed from: k */
    public final C58833ax f61190k;

    /* renamed from: l */
    public final C90021c f61191l;

    /* renamed from: m */
    public boolean f61192m;

    /* renamed from: n */
    public boolean f61193n;

    /* renamed from: o */
    public C22196u f61194o = C22196u.f61276a;

    /* renamed from: p */
    public C60870cx f61195p;

    /* renamed from: q */
    public boolean f61196q;

    /* renamed from: r */
    public volatile C22159ab f61197r;

    /* renamed from: s */
    private final C22871g f61198s;

    /* renamed from: t */
    private final C22871g f61199t;

    public C22170am(Context context, C21370a aVar, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, WifiManager wifiManager, C22871g gVar, C22871g gVar2, C58833ax axVar, C90021c cVar) {
        this.f61184e = context;
        this.f61185f = aVar;
        this.f61186g = connectivityManager;
        this.f61187h = telephonyManager;
        this.f61188i = wifiManager;
        this.f61198s = gVar;
        this.f61199t = gVar2;
        this.f61189j = new C60904dr(new C22167aj(gVar2));
        this.f61190k = axVar;
        this.f61191l = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo27392a() {
        if (!mo27396f()) {
            return C60856cj.m92900i(C22196u.f61276a);
        }
        try {
            if (this.f61193n) {
                return C60856cj.m92900i(this.f61194o);
            }
            C60870cx cxVar = this.f61195p;
            if (cxVar == null) {
                cxVar = C60846c.m92879h(C90877ak.m148471e(this.f61198s.mo28201a("Create DetailedConnectivityInfo", new C22162ae(this)), 5000, TimeUnit.MILLISECONDS, this.f61199t), TimeoutException.class, C22163af.f61173a, C60826bg.f164896a);
                this.f61195p = cxVar;
                this.f61199t.mo28211k(cxVar, "Connectivity check complete", new C22169al(this));
            }
            C60870cx j = C60856cj.m92901j(cxVar);
            this.f61183d.unlock();
            return j;
        } finally {
            this.f61183d.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo27393b() {
        if (!mo27396f()) {
            return C60856cj.m92900i(C22196u.f61276a);
        }
        try {
            if (this.f61192m) {
                C89062r c = this.f61194o.mo27407c();
                if (this.f61196q && c.f241370b == 1) {
                    return C60856cj.m92900i(this.f61194o);
                }
            }
            this.f61183d.unlock();
            return mo27392a();
        } finally {
            this.f61183d.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo27394c() {
        return Settings.Global.getInt(this.f61184e.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo27395e() {
        return this.f61186g.getRestrictBackgroundStatus() == 3;
    }

    /* renamed from: f */
    public final boolean mo27396f() {
        boolean z;
        try {
            z = this.f61183d.tryLock(4000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (!z) {
            ((C59052c) ((C59052c) f61180a.mo56226d()).mo56372aa(48545)).mo56387q("Failed to get connectivityLock in %d ms", 4000);
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("PlatformMonitor");
        this.f61183d.lock();
        try {
            fVar.mo85279c("Started").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f61192m)));
            fVar.mo85279c("Connectivity check failed").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f61193n)));
            fVar.mo85286m(this.f61194o);
            fVar.mo85293t("Connectivity status has changed %d ms ago", C90752i.m148230d(Long.valueOf(this.f61185f.mo26871c() - this.f61194o.mo27405a())));
            this.f61183d.unlock();
            fVar.mo85279c("Data saver enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo27395e())));
        } catch (Throwable th) {
            this.f61183d.unlock();
            throw th;
        }
    }
}
