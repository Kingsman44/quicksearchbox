package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.p10781d.C143860a;
import com.google.android.gms.common.p10782e.C143873c;
import com.google.android.gms.common.util.C144006f;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68900bc;

/* renamed from: com.google.android.gms.measurement.internal.it */
/* compiled from: PG */
public final class C145456it extends C145355f {

    /* renamed from: b */
    public final C145455is f393271b = new C145455is(this);

    /* renamed from: c */
    public C145316do f393272c;

    /* renamed from: d */
    public volatile Boolean f393273d;

    /* renamed from: e */
    private final C145231ak f393274e;

    /* renamed from: f */
    private final C145474jk f393275f = new C145474jk();

    /* renamed from: g */
    private final List f393276g = new ArrayList();

    /* renamed from: h */
    private final C145231ak f393277h;

    public C145456it(C145361ff ffVar) {
        super(ffVar);
        this.f393274e = new C145440id(this, ffVar);
        this.f393277h = new C145442if(this, ffVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo120873d() {
        return false;
    }

    /* renamed from: e */
    public final AppMetadata mo121152e(boolean z) {
        long j;
        String str;
        Boolean bool;
        List list;
        String str2;
        boolean z2;
        String str3;
        String str4;
        String str5;
        boolean z3;
        C145508x xVar = this.f393011w.f392936f;
        C145317dp d = this.f393011w.mo120969d();
        String str6 = null;
        String e = z ? this.f393011w.mo120965ar().mo120898e() : null;
        d.mo120904g();
        C145361ff ffVar = d.f393011w;
        String e2 = d.mo120874e();
        String f = d.mo120875f();
        d.mo120949a();
        String str7 = d.f392762c;
        d.mo120949a();
        long j2 = (long) d.f392763d;
        d.mo120949a();
        C143919bh.m233958a(d.f392764e);
        String str8 = d.f392764e;
        d.f393011w.f392937g.mo120770f();
        d.mo120949a();
        d.mo120904g();
        long j3 = d.f392765f;
        if (j3 == 0) {
            C145495ke o = d.f393011w.mo120977o();
            Context context = d.f393011w.f392931a;
            String packageName = context.getPackageName();
            o.mo120904g();
            C143919bh.m233958a(context);
            C143919bh.m233969l(packageName);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest B = C145495ke.m236482B();
            long j4 = -1;
            if (B == null) {
                o.f393011w.mo120965ar().f392795c.mo120894a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (!o.mo121273ac(context, packageName)) {
                            PackageInfo b = C143873c.f389983a.mo119351a(context).mo119348b(o.f393011w.f392931a.getPackageName(), 64);
                            if (b.signatures == null || b.signatures.length <= 0) {
                                o.f393011w.mo120965ar().f392798f.mo120894a("Could not get signatures");
                            } else {
                                j4 = C145495ke.m236494q(B.digest(b.signatures[0].toByteArray()));
                            }
                        } else {
                            j4 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        o.f393011w.mo120965ar().f392795c.mo120895b("Package name not found", e3);
                    }
                }
                j3 = 0;
                d.f392765f = j3;
            }
            j3 = j4;
            d.f392765f = j3;
        }
        long j5 = j3;
        boolean r = d.f393011w.mo120980r();
        boolean z4 = !d.f393011w.mo120971g().f392862o;
        d.mo120904g();
        C145361ff ffVar2 = d.f393011w;
        if (d.f393011w.mo120980r()) {
            if (!C68900bc.f185149a.mo6453a().mo60730a() || !d.f393011w.f392937g.mo120776m((String) null, C145313dl.f392721aa)) {
                try {
                    Class<?> loadClass = d.f393011w.f392931a.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (loadClass != null) {
                        try {
                            Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{d.f393011w.f392931a});
                            if (invoke != null) {
                                try {
                                    str6 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                                } catch (Exception unused) {
                                    d.f393011w.mo120965ar().f392800h.mo120894a("Failed to retrieve Firebase Instance Id");
                                }
                            }
                        } catch (Exception unused2) {
                            d.f393011w.mo120965ar().f392799g.mo120894a("Failed to obtain Firebase Analytics instance");
                        }
                        str6 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } else {
                d.f393011w.mo120965ar().f392803k.mo120894a("Disabled IID for tests.");
            }
        }
        C145361ff ffVar3 = d.f393011w;
        C145336eh ehVar = ffVar3.mo120971g().f392851d;
        ehVar.mo120915a();
        long j6 = ehVar.f392834a;
        if (j6 == 0) {
            str = str6;
            j = ffVar3.f392956z;
        } else {
            str = str6;
            j = Math.min(ffVar3.f392956z, j6);
        }
        d.mo120949a();
        int i = d.f392769j;
        boolean l = d.f393011w.f392937g.mo120775l();
        C145339ek g = d.f393011w.mo120971g();
        g.mo120904g();
        boolean z5 = g.mo120921a().getBoolean("deferred_analytics_collection", false);
        d.mo120949a();
        String str9 = d.f392771l;
        Boolean j7 = d.f393011w.f392937g.mo120773j("google_analytics_default_allow_ad_personalization_signals");
        if (j7 == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(!j7.booleanValue());
        }
        long j8 = d.f392766g;
        List list2 = d.f392767h;
        String e4 = d.f393011w.mo120971g().mo120923c().mo120784e();
        if (d.f392768i == null) {
            str2 = str9;
            list = list2;
            if (d.f393011w.f392937g.mo120776m((String) null, C145313dl.f392731ak)) {
                d.f392768i = d.f393011w.mo120977o().mo121292y();
            } else {
                d.f392768i = BuildConfig.FLAVOR;
            }
        } else {
            str2 = str9;
            list = list2;
        }
        String str10 = d.f392768i;
        if (C68893aw.m99823c()) {
            str4 = str10;
            str5 = null;
            if (d.f393011w.f392937g.mo120776m((String) null, C145313dl.f392729ai)) {
                d.mo120904g();
                if (d.f392773n == 0) {
                    z2 = l;
                } else {
                    C144006f fVar = d.f393011w.f392924A;
                    z2 = l;
                    long currentTimeMillis = System.currentTimeMillis() - d.f392773n;
                    if (d.f392772m != null && currentTimeMillis > 86400000 && d.f392774o == null) {
                        d.mo120876h();
                    }
                }
                if (d.f392772m == null) {
                    d.mo120876h();
                }
                str3 = d.f392772m;
                return new AppMetadata(e2, f, str7, j2, str8, 74009, j5, e, r, z4, str, j, i, z2, z5, str2, bool, j8, list, e4, str4, str3);
            }
            z3 = l;
        } else {
            z3 = l;
            str4 = str10;
            str5 = null;
        }
        str3 = str5;
        return new AppMetadata(e2, f, str7, j2, str8, 74009, j5, e, r, z4, str, j, i, z2, z5, str2, bool, j8, list, e4, str4, str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo121153i() {
        mo120904g();
        mo120949a();
        if (!mo121165u()) {
            if (mo121167w()) {
                C145455is isVar = this.f393271b;
                isVar.f393270c.mo120904g();
                Context context = isVar.f393270c.f393011w.f392931a;
                synchronized (isVar) {
                    if (isVar.f393268a) {
                        isVar.f393270c.f393011w.mo120965ar().f392803k.mo120894a("Connection attempt already in progress");
                    } else if (isVar.f393269b == null || (!isVar.f393269b.mo119468x() && !isVar.f393269b.mo119467w())) {
                        isVar.f393269b = new C145321dt(context, Looper.getMainLooper(), isVar, isVar);
                        isVar.f393270c.f393011w.mo120965ar().f392803k.mo120894a("Connecting to remote service");
                        isVar.f393268a = true;
                        C143919bh.m233958a(isVar.f393269b);
                        isVar.f393269b.mo119454L();
                    } else {
                        isVar.f393270c.f393011w.mo120965ar().f392803k.mo120894a("Already awaiting connection attempt");
                    }
                }
            } else if (!this.f393011w.f392937g.mo120780q()) {
                C145361ff ffVar = this.f393011w;
                C145508x xVar = ffVar.f392936f;
                List<ResolveInfo> queryIntentServices = ffVar.f392931a.getPackageManager().queryIntentServices(new Intent().setClassName(this.f393011w.f392931a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    this.f393011w.mo120965ar().f392795c.mo120894a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                C145361ff ffVar2 = this.f393011w;
                Context context2 = ffVar2.f392931a;
                C145508x xVar2 = ffVar2.f392936f;
                intent.setComponent(new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementService"));
                C145455is isVar2 = this.f393271b;
                isVar2.f393270c.mo120904g();
                Context context3 = isVar2.f393270c.f393011w.f392931a;
                C143860a a = C143860a.m233845a();
                synchronized (isVar2) {
                    if (isVar2.f393268a) {
                        isVar2.f393270c.f393011w.mo120965ar().f392803k.mo120894a("Connection attempt already in progress");
                        return;
                    }
                    isVar2.f393270c.f393011w.mo120965ar().f392803k.mo120894a("Using local app measurement service");
                    isVar2.f393268a = true;
                    a.mo119313d(context3, intent, isVar2.f393270c.f393271b, 129);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo121154j() {
        mo120904g();
        mo120949a();
        C145455is isVar = this.f393271b;
        if (isVar.f393269b != null && (isVar.f393269b.mo119467w() || isVar.f393269b.mo119468x())) {
            isVar.f393269b.mo118925n();
        }
        isVar.f393269b = null;
        try {
            C143860a.m233845a().mo119311b(this.f393011w.f392931a, this.f393271b);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f393272c = null;
    }

    /* renamed from: k */
    public final void mo121155k() {
        mo120904g();
        this.f393011w.mo120965ar().f392803k.mo120895b("Processing queued up service tasks", Integer.valueOf(this.f393276g.size()));
        for (Runnable run : this.f393276g) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f393011w.mo120965ar().f392795c.mo120895b("Task exception while flushing queue", e);
            }
        }
        this.f393276g.clear();
        this.f393277h.mo120829a();
    }

    /* renamed from: l */
    public final void mo121156l(AtomicReference atomicReference) {
        mo120904g();
        mo120949a();
        mo121159o(new C145434hy(this, atomicReference, mo121152e(false)));
    }

    /* renamed from: m */
    public final void mo121157m(ComponentName componentName) {
        mo120904g();
        if (this.f393272c != null) {
            this.f393272c = null;
            this.f393011w.mo120965ar().f392803k.mo120895b("Disconnected from device MeasurementService", componentName);
            mo120904g();
            mo121153i();
        }
    }

    /* renamed from: n */
    public final void mo121158n() {
        mo120904g();
        this.f393275f.f393322a = SystemClock.elapsedRealtime();
        C145231ak akVar = this.f393274e;
        C145222ab abVar = this.f393011w.f392937g;
        akVar.mo120831c(((Long) C145313dl.f392702I.mo120854a((Object) null)).longValue());
    }

    /* renamed from: o */
    public final void mo121159o(Runnable runnable) {
        mo120904g();
        if (mo121165u()) {
            runnable.run();
            return;
        }
        int size = this.f393276g.size();
        C145361ff ffVar = this.f393011w;
        C145222ab abVar = ffVar.f392937g;
        if (((long) size) >= 1000) {
            ffVar.mo120965ar().f392795c.mo120894a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f393276g.add(runnable);
        this.f393277h.mo120831c(60000);
        mo121153i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo121160p(C145316do doVar, AbstractSafeParcelable abstractSafeParcelable, AppMetadata appMetadata) {
        int i;
        mo120904g();
        mo120949a();
        mo121168x();
        C145222ab abVar = this.f393011w.f392937g;
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List j = this.f393011w.mo120970e().mo120886j();
            if (j != null) {
                arrayList.addAll(j);
                i = j.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof EventParcel) {
                    try {
                        doVar.mo120862l((EventParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e) {
                        this.f393011w.mo120965ar().f392795c.mo120895b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof UserAttributeParcel) {
                    try {
                        doVar.mo120871u((UserAttributeParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e2) {
                        this.f393011w.mo120965ar().f392795c.mo120895b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof ConditionalUserPropertyParcel) {
                    try {
                        doVar.mo120865o((ConditionalUserPropertyParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e3) {
                        this.f393011w.mo120965ar().f392795c.mo120895b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f393011w.mo120965ar().f392795c.mo120894a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo121161q(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        mo120904g();
        mo120949a();
        C145508x xVar = this.f393011w.f392936f;
        C145319dr e = this.f393011w.mo120970e();
        byte[] ah = e.f393011w.mo120977o().mo121275ah(conditionalUserPropertyParcel);
        boolean z = false;
        if (ah.length > 131072) {
            e.f393011w.mo120965ar().f392796d.mo120894a("Conditional user property too long for local database. Sending directly to service");
        } else if (e.mo120885i(2, ah)) {
            z = true;
        }
        mo121159o(new C145446ij(this, mo121152e(true), z, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo121162r(C145423hn hnVar) {
        mo120904g();
        mo120949a();
        mo121159o(new C145438ib(this, hnVar));
    }

    /* renamed from: s */
    public final void mo121163s(Bundle bundle) {
        mo120904g();
        mo120949a();
        mo121159o(new C145439ic(this, mo121152e(false), bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo121164t(C145316do doVar) {
        mo120904g();
        C143919bh.m233958a(doVar);
        this.f393272c = doVar;
        mo121158n();
        mo121155k();
    }

    /* renamed from: u */
    public final boolean mo121165u() {
        mo120904g();
        mo120949a();
        return this.f393272c != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo121166v() {
        mo120904g();
        mo120949a();
        if (!mo121167w() || this.f393011w.mo120977o().mo121284p() >= ((Integer) C145313dl.f392725ae.mo120854a((Object) null)).intValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0112  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo121167w() {
        /*
            r6 = this;
            r6.mo120904g()
            r6.mo120949a()
            java.lang.Boolean r0 = r6.f393273d
            if (r0 != 0) goto L_0x0132
            r6.mo120904g()
            r6.mo120949a()
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.ek r0 = r0.mo120971g()
            r0.mo120904g()
            android.content.SharedPreferences r1 = r0.mo120921a()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo120921a()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x012c
        L_0x003f:
            com.google.android.gms.measurement.internal.ff r4 = r6.f393011w
            com.google.android.gms.measurement.internal.x r4 = r4.f392936f
            com.google.android.gms.measurement.internal.ff r4 = r6.f393011w
            com.google.android.gms.measurement.internal.dp r4 = r4.mo120969d()
            r4.mo120949a()
            int r4 = r4.f392769j
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = 1
            goto L_0x00f8
        L_0x0053:
            com.google.android.gms.measurement.internal.ff r4 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()
            com.google.android.gms.measurement.internal.dv r4 = r4.f392803k
            java.lang.String r5 = "Checking service availability"
            r4.mo120894a(r5)
            com.google.android.gms.measurement.internal.ff r4 = r6.f393011w
            com.google.android.gms.measurement.internal.ke r4 = r4.mo120977o()
            int r4 = r4.mo121278al()
            if (r4 == 0) goto L_0x00e9
            if (r4 == r1) goto L_0x00db
            r5 = 2
            if (r4 == r5) goto L_0x00b9
            r0 = 3
            if (r4 == r0) goto L_0x00aa
            r0 = 9
            if (r4 == r0) goto L_0x009c
            r0 = 18
            if (r4 == r0) goto L_0x008e
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f
            java.lang.String r1 = "Unexpected service status"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.mo120895b(r1, r4)
            goto L_0x00b7
        L_0x008e:
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f
            java.lang.String r3 = "Service updating"
            r0.mo120894a(r3)
            goto L_0x0050
        L_0x009c:
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f
            java.lang.String r1 = "Service invalid"
            r0.mo120894a(r1)
            goto L_0x00b7
        L_0x00aa:
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f
            java.lang.String r1 = "Service disabled"
            r0.mo120894a(r1)
        L_0x00b7:
            r1 = 0
            goto L_0x00f8
        L_0x00b9:
            com.google.android.gms.measurement.internal.ff r4 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()
            com.google.android.gms.measurement.internal.dv r4 = r4.f392802j
            java.lang.String r5 = "Service container out of date"
            r4.mo120894a(r5)
            com.google.android.gms.measurement.internal.ff r4 = r6.f393011w
            com.google.android.gms.measurement.internal.ke r4 = r4.mo120977o()
            int r4 = r4.mo121284p()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00d5
            goto L_0x00f8
        L_0x00d5:
            if (r0 != 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            r3 = r1
            goto L_0x00b7
        L_0x00db:
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392803k
            java.lang.String r4 = "Service missing"
            r0.mo120894a(r4)
            goto L_0x00f8
        L_0x00e9:
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392803k
            java.lang.String r3 = "Service available"
            r0.mo120894a(r3)
            goto L_0x0050
        L_0x00f8:
            if (r3 != 0) goto L_0x0112
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.ab r0 = r0.f392937g
            boolean r0 = r0.mo120780q()
            if (r0 == 0) goto L_0x0112
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo120894a(r1)
            goto L_0x012b
        L_0x0112:
            if (r1 == 0) goto L_0x012b
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.ek r0 = r0.mo120971g()
            r0.mo120904g()
            android.content.SharedPreferences r0 = r0.mo120921a()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x012b:
            r1 = r3
        L_0x012c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f393273d = r0
        L_0x0132:
            java.lang.Boolean r0 = r6.f393273d
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145456it.mo121167w():boolean");
    }

    /* renamed from: x */
    public final boolean mo121168x() {
        C145508x xVar = this.f393011w.f392936f;
        return true;
    }
}
