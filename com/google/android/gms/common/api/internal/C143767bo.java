package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143716ai;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143891ag;
import com.google.android.gms.common.internal.C143898an;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143922bk;
import com.google.android.gms.common.internal.C143926bo;
import com.google.android.gms.common.internal.C143927bp;
import com.google.android.gms.common.internal.C143939n;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.p10783a.C143883d;
import com.google.android.gms.common.p10782e.C143871a;
import com.google.android.gms.common.util.C144007g;
import com.google.android.gms.libs.p10835c.C144855c;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146014aj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.api.internal.bo */
/* compiled from: PG */
public final class C143767bo implements Handler.Callback {

    /* renamed from: a */
    public static final Status f389770a = new Status(1, 4, "Sign-out occurred while this API call was in progress.", (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: b */
    public static final Status f389771b = new Status(1, 4, "The user must be signed in to make this API call.", (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: c */
    public static final Object f389772c = new Object();

    /* renamed from: p */
    private static C143767bo f389773p;

    /* renamed from: d */
    public long f389774d = 10000;

    /* renamed from: e */
    public boolean f389775e = false;

    /* renamed from: f */
    public final Context f389776f;

    /* renamed from: g */
    public final C143875g f389777g;

    /* renamed from: h */
    public final C143898an f389778h;

    /* renamed from: i */
    public final AtomicInteger f389779i = new AtomicInteger(1);

    /* renamed from: j */
    public final AtomicInteger f389780j = new AtomicInteger(0);

    /* renamed from: k */
    public final Map f389781k = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: l */
    public C143730ae f389782l = null;

    /* renamed from: m */
    public final Set f389783m = new C0979i(0);

    /* renamed from: n */
    public final Handler f389784n;

    /* renamed from: o */
    public volatile boolean f389785o = true;

    /* renamed from: q */
    private TelemetryData f389786q;

    /* renamed from: r */
    private C143926bo f389787r;

    /* renamed from: s */
    private final Set f389788s = new C0979i(0);

    private C143767bo(Context context, Looper looper, C143875g gVar) {
        this.f389776f = context;
        C144861c cVar = new C144861c(looper, this);
        this.f389784n = cVar;
        this.f389777g = gVar;
        this.f389778h = new C143898an(gVar);
        PackageManager packageManager = context.getPackageManager();
        if (C144007g.f390246b == null) {
            C144007g.f390246b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (C144007g.f390246b.booleanValue()) {
            this.f389785o = false;
        }
        cVar.sendMessage(cVar.obtainMessage(6));
    }

    /* renamed from: a */
    public static Status m233632a(C143820i iVar, ConnectionResult connectionResult) {
        String str = iVar.f389876a.f389918c;
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + str + " is not available on this device. Connection failed with: " + valueOf);
    }

    /* renamed from: c */
    public static C143767bo m233633c(Context context) {
        C143767bo boVar;
        HandlerThread handlerThread;
        synchronized (f389772c) {
            if (f389773p == null) {
                synchronized (C143891ag.f390079a) {
                    handlerThread = C143891ag.f390080b;
                    if (handlerThread == null) {
                        C143891ag.f390080b = new HandlerThread("GoogleApiHandler", 9);
                        C143891ag.f390080b.start();
                        handlerThread = C143891ag.f390080b;
                    }
                }
                f389773p = new C143767bo(context.getApplicationContext(), handlerThread.getLooper(), C143875g.f389987a);
            }
            boVar = f389773p;
        }
        return boVar;
    }

    /* renamed from: k */
    private final C143763bk m233634k(C143847s sVar) {
        C143820i iVar = sVar.f389926A;
        C143763bk bkVar = (C143763bk) this.f389781k.get(iVar);
        if (bkVar == null) {
            bkVar = new C143763bk(this, sVar);
            this.f389781k.put(iVar, bkVar);
        }
        if (bkVar.mo119200o()) {
            this.f389788s.add(iVar);
        }
        bkVar.mo119190b();
        return bkVar;
    }

    /* renamed from: l */
    private final C143926bo m233635l() {
        if (this.f389787r == null) {
            this.f389787r = new C143883d(this.f389776f, C143927bp.f390116a);
        }
        return this.f389787r;
    }

    /* renamed from: m */
    private final void m233636m() {
        TelemetryData telemetryData = this.f389786q;
        if (telemetryData != null) {
            if (telemetryData.f390051a > 0 || mo119214i()) {
                m233635l().mo119388a(telemetryData);
            }
            this.f389786q = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C143763bk mo119207b(C143820i iVar) {
        return (C143763bk) this.f389781k.get(iVar);
    }

    /* renamed from: d */
    public final C146006ab mo119208d(C143847s sVar, C143791cl clVar, C143815di diVar, Runnable runnable) {
        C146010af afVar = new C146010af();
        mo119209e(afVar, clVar.f389824d, sVar);
        C143806d dVar = new C143806d(new C143792cm(clVar, diVar, runnable), afVar);
        Handler handler = this.f389784n;
        handler.sendMessage(handler.obtainMessage(8, new C143790ck(dVar, this.f389780j.get(), sVar)));
        return afVar.f394698a;
    }

    /* renamed from: e */
    public final void mo119209e(C146010af afVar, int i, C143847s sVar) {
        long j;
        if (i != 0) {
            C143820i iVar = sVar.f389926A;
            C143786cg cgVar = null;
            if (mo119214i()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = C143922bk.m233972a().f390115a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.f390047b) {
                        boolean z2 = rootTelemetryConfiguration.f390048c;
                        C143763bk b = mo119207b(iVar);
                        if (b != null) {
                            C143839k kVar = b.f389748b;
                            if (kVar instanceof C143939n) {
                                C143939n nVar = (C143939n) kVar;
                                if (nVar.mo119461S() && !nVar.mo119468x()) {
                                    ConnectionTelemetryConfiguration b2 = C143786cg.m233682b(b, nVar, i);
                                    if (b2 != null) {
                                        b.f389755i++;
                                        z = b2.f390008c;
                                    }
                                }
                            }
                        }
                        z = z2;
                    }
                }
                long currentTimeMillis = z ? System.currentTimeMillis() : 0;
                if (z) {
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = 0;
                }
                cgVar = new C143786cg(this, i, iVar, currentTimeMillis, j);
            }
            if (cgVar != null) {
                C146014aj ajVar = afVar.f394698a;
                Handler handler = this.f389784n;
                Objects.requireNonNull(handler);
                ajVar.mo122493l(new C143757be(handler), cgVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo119210f(ConnectionResult connectionResult, int i) {
        if (!mo119215j(connectionResult, i)) {
            Handler handler = this.f389784n;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: g */
    public final void mo119211g() {
        Handler handler = this.f389784n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: h */
    public final void mo119212h(C143730ae aeVar) {
        synchronized (f389772c) {
            if (this.f389782l != aeVar) {
                this.f389782l = aeVar;
                this.f389783m.clear();
            }
            this.f389783m.addAll(aeVar.f389652e);
        }
    }

    public final boolean handleMessage(Message message) {
        Status status;
        Feature[] b;
        Message message2 = message;
        long j = 300000;
        C143763bk bkVar = null;
        switch (message2.what) {
            case 1:
                if (true == ((Boolean) message2.obj).booleanValue()) {
                    j = 10000;
                }
                this.f389774d = j;
                this.f389784n.removeMessages(12);
                for (C143820i obtainMessage : this.f389781k.keySet()) {
                    Handler handler = this.f389784n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f389774d);
                }
                break;
            case 2:
                C143821j jVar = (C143821j) message2.obj;
                throw null;
            case 3:
                for (C143763bk bkVar2 : this.f389781k.values()) {
                    bkVar2.mo119189a();
                    bkVar2.mo119190b();
                }
                break;
            case 4:
            case 8:
            case 13:
                C143790ck ckVar = (C143790ck) message2.obj;
                C143763bk bkVar3 = (C143763bk) this.f389781k.get(ckVar.f389820c.f389926A);
                if (bkVar3 == null) {
                    bkVar3 = m233634k(ckVar.f389820c);
                }
                if (bkVar3.mo119200o() && this.f389780j.get() != ckVar.f389819b) {
                    ckVar.f389818a.mo119169d(f389770a);
                    bkVar3.mo119198m();
                    break;
                } else {
                    bkVar3.mo119191f(ckVar.f389818a);
                    break;
                }
                break;
            case 5:
                int i = message2.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message2.obj;
                Iterator it = this.f389781k.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C143763bk bkVar4 = (C143763bk) it.next();
                        if (bkVar4.f389752f == i) {
                            bkVar = bkVar4;
                        }
                    }
                }
                if (bkVar != null) {
                    if (connectionResult.f389574c != 13) {
                        bkVar.mo119192g(m233632a(bkVar.f389749c, connectionResult));
                        break;
                    } else {
                        int i2 = C143700ab.f389600d;
                        String str = connectionResult.f389576e;
                        bkVar.mo119192g(new Status(1, 17, "Error resolution was canceled by the user, original error message: " + C143700ab.m233449k() + ": " + str, (PendingIntent) null, (ConnectionResult) null));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f389776f.getApplicationContext() instanceof Application) {
                    C143823l.m233745b((Application) this.f389776f.getApplicationContext());
                    C143823l.f389880a.mo119264a(new C143758bf(this));
                    C143823l lVar = C143823l.f389880a;
                    if (!lVar.f389882c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!lVar.f389882c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            lVar.f389881b.set(true);
                        }
                    }
                    if (!lVar.f389881b.get()) {
                        this.f389774d = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m233634k((C143847s) message2.obj);
                break;
            case 9:
                if (this.f389781k.containsKey(message2.obj)) {
                    C143763bk bkVar5 = (C143763bk) this.f389781k.get(message2.obj);
                    C143919bh.m233962e(bkVar5.f389756j.f389784n);
                    if (bkVar5.f389753g) {
                        bkVar5.mo119190b();
                        break;
                    }
                }
                break;
            case 10:
                C0978h hVar = new C0978h((C0979i) this.f389788s);
                while (hVar.hasNext()) {
                    C143763bk bkVar6 = (C143763bk) this.f389781k.remove((C143820i) hVar.next());
                    if (bkVar6 != null) {
                        bkVar6.mo119198m();
                    }
                }
                this.f389788s.clear();
                break;
            case 11:
                if (this.f389781k.containsKey(message2.obj)) {
                    C143763bk bkVar7 = (C143763bk) this.f389781k.get(message2.obj);
                    C143919bh.m233962e(bkVar7.f389756j.f389784n);
                    if (bkVar7.f389753g) {
                        bkVar7.mo119199n();
                        C143767bo boVar = bkVar7.f389756j;
                        if (boVar.f389777g.mo119362j(boVar.f389776f, C143876h.f389990c) == 18) {
                            status = new Status(1, 21, "Connection timed out waiting for Google Play services update to complete.", (PendingIntent) null, (ConnectionResult) null);
                        } else {
                            status = new Status(1, 22, "API failed to connect while resuming due to an unknown error.", (PendingIntent) null, (ConnectionResult) null);
                        }
                        bkVar7.mo119192g(status);
                        bkVar7.f389748b.mo117783f("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.f389781k.containsKey(message2.obj)) {
                    C143763bk bkVar8 = (C143763bk) this.f389781k.get(message2.obj);
                    C143919bh.m233962e(bkVar8.f389756j.f389784n);
                    if (bkVar8.f389748b.mo119248w() && bkVar8.f389751e.size() == 0) {
                        C143729ad adVar = bkVar8.f389750d;
                        if (adVar.f389650a.isEmpty() && adVar.f389651b.isEmpty()) {
                            bkVar8.f389748b.mo117783f("Timing out service connection.");
                            break;
                        } else {
                            bkVar8.mo119197l();
                            break;
                        }
                    }
                }
                break;
            case 14:
                C143731af afVar = (C143731af) message2.obj;
                throw null;
            case 15:
                C143764bl blVar = (C143764bl) message2.obj;
                if (this.f389781k.containsKey(blVar.f389760a)) {
                    C143763bk bkVar9 = (C143763bk) this.f389781k.get(blVar.f389760a);
                    if (bkVar9.f389754h.contains(blVar) && !bkVar9.f389753g) {
                        if (bkVar9.f389748b.mo119248w()) {
                            bkVar9.mo119193h();
                            break;
                        } else {
                            bkVar9.mo119190b();
                            break;
                        }
                    }
                }
                break;
            case 16:
                C143764bl blVar2 = (C143764bl) message2.obj;
                if (this.f389781k.containsKey(blVar2.f389760a)) {
                    C143763bk bkVar10 = (C143763bk) this.f389781k.get(blVar2.f389760a);
                    if (bkVar10.f389754h.remove(blVar2)) {
                        bkVar10.f389756j.f389784n.removeMessages(15, blVar2);
                        bkVar10.f389756j.f389784n.removeMessages(16, blVar2);
                        Feature feature = blVar2.f389761b;
                        ArrayList arrayList = new ArrayList(bkVar10.f389747a.size());
                        for (C143818g gVar : bkVar10.f389747a) {
                            if ((gVar instanceof C143725a) && (b = ((C143725a) gVar).mo119123b(bkVar10)) != null) {
                                int length = b.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < length) {
                                        if (!C143912ba.m233950b(b[i3], feature)) {
                                            i3++;
                                        } else if (i3 >= 0) {
                                            arrayList.add(gVar);
                                        }
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C143818g gVar2 = (C143818g) arrayList.get(i4);
                            bkVar10.f389747a.remove(gVar2);
                            gVar2.mo119170e(new C143716ai(feature));
                        }
                        break;
                    }
                }
                break;
            case 17:
                m233636m();
                break;
            case 18:
                C143787ch chVar = (C143787ch) message2.obj;
                if (chVar.f389816c != 0) {
                    TelemetryData telemetryData = this.f389786q;
                    if (telemetryData != null) {
                        List list = telemetryData.f390052b;
                        if (telemetryData.f390051a != chVar.f389815b || (list != null && list.size() >= chVar.f389817d)) {
                            this.f389784n.removeMessages(17);
                            m233636m();
                        } else {
                            TelemetryData telemetryData2 = this.f389786q;
                            MethodInvocation methodInvocation = chVar.f389814a;
                            if (telemetryData2.f390052b == null) {
                                telemetryData2.f390052b = new ArrayList();
                            }
                            telemetryData2.f390052b.add(methodInvocation);
                        }
                    }
                    if (this.f389786q == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(chVar.f389814a);
                        this.f389786q = new TelemetryData(chVar.f389815b, arrayList2);
                        Handler handler2 = this.f389784n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), chVar.f389816c);
                        break;
                    }
                } else {
                    m233635l().mo119388a(new TelemetryData(chVar.f389815b, Arrays.asList(new MethodInvocation[]{chVar.f389814a})));
                    break;
                }
                break;
            case 19:
                this.f389775e = false;
                break;
            default:
                int i5 = message2.what;
                Log.w("GoogleApiManager", "Unknown message id: " + i5);
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo119214i() {
        if (this.f389775e) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = C143922bk.m233972a().f390115a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f390047b) {
            return false;
        }
        int b = this.f389778h.mo119415b(203400000);
        if (b == -1 || b == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo119215j(ConnectionResult connectionResult, int i) {
        PendingIntent c;
        C143875g gVar = this.f389777g;
        Context context = this.f389776f;
        if (C143871a.m233880a(context) || (c = gVar.mo119355c(context, connectionResult)) == null) {
            return false;
        }
        gVar.mo119360h(context, connectionResult.f389574c, PendingIntent.getActivity(context, 0, GoogleApiActivity.m233460a(context, c, i, true), C144855c.f391705a | 134217728));
        return true;
    }
}
