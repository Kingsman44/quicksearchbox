package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143843o;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C143761bi;
import com.google.android.gms.common.api.internal.C143762bj;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.n */
/* compiled from: PG */
public abstract class C143939n {

    /* renamed from: Zr */
    private static final Feature[] f390133Zr = new Feature[0];

    /* renamed from: A */
    public int f390134A = 1;

    /* renamed from: B */
    public final C143929d f390135B;

    /* renamed from: C */
    public final C143930e f390136C;

    /* renamed from: D */
    public final int f390137D;

    /* renamed from: E */
    public volatile String f390138E;

    /* renamed from: F */
    public ConnectionResult f390139F = null;

    /* renamed from: G */
    public boolean f390140G = false;

    /* renamed from: H */
    public volatile ConnectionInfo f390141H = null;

    /* renamed from: I */
    protected final AtomicInteger f390142I = new AtomicInteger(0);

    /* renamed from: J */
    public C143906av f390143J;

    /* renamed from: Zs */
    private int f390144Zs;

    /* renamed from: Zt */
    private long f390145Zt;

    /* renamed from: d */
    private long f390146d;

    /* renamed from: e */
    private int f390147e;

    /* renamed from: f */
    private long f390148f;

    /* renamed from: g */
    private final C143891ag f390149g;

    /* renamed from: h */
    private final C143876h f390150h;

    /* renamed from: i */
    private IInterface f390151i;

    /* renamed from: j */
    private C143935j f390152j;

    /* renamed from: k */
    private final String f390153k;

    /* renamed from: r */
    public volatile String f390154r = null;

    /* renamed from: s */
    C143897am f390155s;

    /* renamed from: t */
    public final Context f390156t;

    /* renamed from: u */
    public final Looper f390157u;

    /* renamed from: v */
    final Handler f390158v;

    /* renamed from: w */
    public final Object f390159w = new Object();

    /* renamed from: x */
    public final Object f390160x = new Object();

    /* renamed from: y */
    protected C143933h f390161y;

    /* renamed from: z */
    public final ArrayList f390162z = new ArrayList();

    protected C143939n(Context context, Looper looper, C143891ag agVar, C143876h hVar, int i, C143929d dVar, C143930e eVar, String str) {
        C143919bh.m233971n(context, "Context must not be null");
        this.f390156t = context;
        C143919bh.m233971n(looper, "Looper must not be null");
        this.f390157u = looper;
        C143919bh.m233971n(agVar, "Supervisor must not be null");
        this.f390149g = agVar;
        C143919bh.m233971n(hVar, "API availability must not be null");
        this.f390150h = hVar;
        this.f390158v = new C143931f(this, looper);
        this.f390137D = i;
        this.f390135B = dVar;
        this.f390136C = eVar;
        this.f390153k = str;
    }

    /* renamed from: A */
    public final Feature[] mo119446A() {
        ConnectionInfo connectionInfo = this.f390141H;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.f390003b;
    }

    /* renamed from: B */
    public final void mo119447B(C143762bj bjVar) {
        bjVar.f389746a.f389756j.f389784n.post(new C143761bi(bjVar));
    }

    /* renamed from: C */
    public final void mo119448C(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        C143906av avVar;
        synchronized (this.f390159w) {
            i = this.f390134A;
            iInterface = this.f390151i;
        }
        synchronized (this.f390160x) {
            avVar = this.f390143J;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo57746c()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (avVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(avVar.f390104a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f390146d > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f390146d;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.f390145Zt > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f390144Zs;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f390145Zt;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.f390148f > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C143843o.m233808a(this.f390147e));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f390148f;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    /* renamed from: D */
    public final void mo119449D() {
        if (!mo119467w() || this.f390155s == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: E */
    public final void mo119450E(C143899ao aoVar, Set set) {
        C143899ao aoVar2 = aoVar;
        Set set2 = set;
        Bundle i = mo117789i();
        int i2 = this.f390137D;
        String str = this.f390138E;
        int i3 = C143876h.f389990c;
        Scope[] scopeArr = GetServiceRequest.f390012a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f390013b;
        GetServiceRequest getServiceRequest = r4;
        GetServiceRequest getServiceRequest2 = new GetServiceRequest(6, i2, i3, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        GetServiceRequest getServiceRequest3 = getServiceRequest;
        getServiceRequest3.f390017f = this.f390156t.getPackageName();
        getServiceRequest3.f390020i = i;
        if (set2 != null) {
            getServiceRequest3.f390019h = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (mo117790j()) {
            Account F = mo119392F();
            if (F == null) {
                F = new Account("<<default account>>", "com.google");
            }
            getServiceRequest3.f390021j = F;
            if (aoVar2 != null) {
                getServiceRequest3.f390018g = aoVar2.f30761a;
            }
        } else if (mo119462T()) {
            getServiceRequest3.f390021j = mo119392F();
        }
        getServiceRequest3.f390022k = mo119395U();
        getServiceRequest3.f390023l = mo117774h();
        if (mo57748ku()) {
            getServiceRequest3.f390026o = true;
        }
        try {
            synchronized (this.f390160x) {
                C143906av avVar = this.f390143J;
                if (avVar != null) {
                    C143934i iVar = new C143934i(this, this.f390142I.get());
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeStrongBinder(iVar);
                        obtain.writeInt(1);
                        C143955z.m234123a(getServiceRequest3, obtain, 0);
                        avVar.f390104a.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo119458P(3);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo118927p(8, (IBinder) null, (Bundle) null, this.f390142I.get());
        }
    }

    /* renamed from: F */
    public Account mo119392F() {
        return null;
    }

    /* renamed from: G */
    public final IInterface mo119451G() {
        IInterface iInterface;
        synchronized (this.f390159w) {
            if (this.f390134A != 5) {
                mo119455M();
                iInterface = this.f390151i;
                C143919bh.m233971n(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final String mo119452H() {
        String str = this.f390153k;
        return str == null ? this.f390156t.getClass().getName() : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public String mo119453I() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public Set mo119393J() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public Executor mo119394K() {
        return null;
    }

    /* renamed from: L */
    public final void mo119454L() {
        int j = this.f390150h.mo119362j(this.f390156t, mo57744a());
        if (j != 0) {
            mo119457O(1, (IInterface) null);
            mo119459Q(new C143936k(this), j, (PendingIntent) null);
            return;
        }
        mo119466v(new C143936k(this));
    }

    /* renamed from: M */
    public final void mo119455M() {
        if (!mo119467w()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo119456N(int i) {
        this.f390144Zs = i;
        this.f390145Zt = System.currentTimeMillis();
    }

    /* renamed from: O */
    public final void mo119457O(int i, IInterface iInterface) {
        C143897am amVar;
        boolean z = false;
        if ((i == 4) == (iInterface != null)) {
            z = true;
        }
        C143919bh.m233959b(z);
        synchronized (this.f390159w) {
            this.f390134A = i;
            this.f390151i = iInterface;
            if (i == 1) {
                C143935j jVar = this.f390152j;
                if (jVar != null) {
                    C143891ag agVar = this.f390149g;
                    String str = this.f390155s.f390098a;
                    C143919bh.m233958a(str);
                    C143897am amVar2 = this.f390155s;
                    String str2 = amVar2.f390099b;
                    int i2 = amVar2.f390100c;
                    mo119452H();
                    agVar.mo119406e(str, str2, i2, jVar, this.f390155s.f390101d);
                    this.f390152j = null;
                }
            } else if (i == 2 || i == 3) {
                C143935j jVar2 = this.f390152j;
                if (!(jVar2 == null || (amVar = this.f390155s) == null)) {
                    String str3 = amVar.f390098a;
                    String str4 = amVar.f390099b;
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + str3 + " on " + str4);
                    C143891ag agVar2 = this.f390149g;
                    String str5 = this.f390155s.f390098a;
                    C143919bh.m233958a(str5);
                    C143897am amVar3 = this.f390155s;
                    String str6 = amVar3.f390099b;
                    int i3 = amVar3.f390100c;
                    mo119452H();
                    agVar2.mo119406e(str5, str6, i3, jVar2, this.f390155s.f390101d);
                    this.f390142I.incrementAndGet();
                }
                C143935j jVar3 = new C143935j(this, this.f390142I.get());
                this.f390152j = jVar3;
                C143897am amVar4 = new C143897am(mo119453I(), mo57747d(), mo118342k(), mo117784kt());
                this.f390155s = amVar4;
                if (amVar4.f390101d) {
                    if (mo57744a() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(amVar4.f390098a)));
                    }
                }
                C143891ag agVar3 = this.f390149g;
                String str7 = amVar4.f390098a;
                C143919bh.m233958a(str7);
                C143897am amVar5 = this.f390155s;
                if (!agVar3.mo119403b(new C143890af(str7, amVar5.f390099b, amVar5.f390100c, this.f390155s.f390101d), jVar3, mo119452H(), mo119394K())) {
                    C143897am amVar6 = this.f390155s;
                    String str8 = amVar6.f390098a;
                    String str9 = amVar6.f390099b;
                    Log.w("GmsClient", "unable to connect to service: " + str8 + " on " + str9);
                    mo119463V(16, this.f390142I.get());
                }
            } else if (i == 4) {
                C143919bh.m233958a(iInterface);
                this.f390146d = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: P */
    public final void mo119458P(int i) {
        Handler handler = this.f390158v;
        handler.sendMessage(handler.obtainMessage(6, this.f390142I.get(), i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final void mo119459Q(C143933h hVar, int i, PendingIntent pendingIntent) {
        C143919bh.m233971n(hVar, "Connection progress callbacks cannot be null.");
        this.f390161y = hVar;
        Handler handler = this.f390158v;
        handler.sendMessage(handler.obtainMessage(3, this.f390142I.get(), i, pendingIntent));
    }

    /* renamed from: R */
    public final boolean mo119460R(int i, int i2, IInterface iInterface) {
        synchronized (this.f390159w) {
            if (this.f390134A != i) {
                return false;
            }
            mo119457O(i2, iInterface);
            return true;
        }
    }

    /* renamed from: S */
    public final boolean mo119461S() {
        return this.f390141H != null;
    }

    /* renamed from: T */
    public boolean mo119462T() {
        return false;
    }

    /* renamed from: U */
    public Feature[] mo119395U() {
        return f390133Zr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo119463V(int i, int i2) {
        Handler handler = this.f390158v;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C143938m(this, i)));
    }

    /* renamed from: a */
    public int mo57744a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract IInterface mo57745b(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo57746c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo57747d();

    /* renamed from: f */
    public void mo117783f(String str) {
        this.f390154r = str;
        mo118925n();
    }

    /* renamed from: h */
    public Feature[] mo117774h() {
        return f390133Zr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Bundle mo117789i() {
        return new Bundle();
    }

    /* renamed from: j */
    public boolean mo117790j() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo118342k() {
        return 4225;
    }

    /* access modifiers changed from: protected */
    /* renamed from: kt */
    public boolean mo117784kt() {
        return mo57744a() >= 211700000;
    }

    /* renamed from: ku */
    public boolean mo57748ku() {
        return false;
    }

    /* renamed from: l */
    public Bundle mo118923l() {
        return null;
    }

    /* renamed from: n */
    public void mo118925n() {
        this.f390142I.incrementAndGet();
        synchronized (this.f390162z) {
            int size = this.f390162z.size();
            for (int i = 0; i < size; i++) {
                ((C143932g) this.f390162z.get(i)).mo119442e();
            }
            this.f390162z.clear();
        }
        synchronized (this.f390160x) {
            this.f390143J = null;
        }
        mo119457O(1, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo118926o(ConnectionResult connectionResult) {
        this.f390147e = connectionResult.f389574c;
        this.f390148f = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo118927p(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f390158v;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C143937l(this, i, iBinder, bundle)));
    }

    /* renamed from: s */
    public final Intent mo119464s() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: t */
    public final String mo119465t() {
        return this.f390154r;
    }

    /* renamed from: v */
    public void mo119466v(C143933h hVar) {
        C143919bh.m233971n(hVar, "Connection progress callbacks cannot be null.");
        this.f390161y = hVar;
        mo119457O(2, (IInterface) null);
    }

    /* renamed from: w */
    public final boolean mo119467w() {
        boolean z;
        synchronized (this.f390159w) {
            z = this.f390134A == 4;
        }
        return z;
    }

    /* renamed from: x */
    public final boolean mo119468x() {
        boolean z;
        synchronized (this.f390159w) {
            int i = this.f390134A;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: y */
    public final boolean mo119469y() {
        return false;
    }

    /* renamed from: z */
    public boolean mo119470z() {
        return true;
    }
}
