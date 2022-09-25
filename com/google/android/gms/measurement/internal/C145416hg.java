package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68931y;

/* renamed from: com.google.android.gms.measurement.internal.hg */
/* compiled from: PG */
public final class C145416hg extends C145355f {

    /* renamed from: b */
    protected C145415hf f393141b;

    /* renamed from: c */
    public final Set f393142c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public final AtomicReference f393143d = new AtomicReference();

    /* renamed from: e */
    final C145501q f393144e;

    /* renamed from: f */
    protected boolean f393145f = true;

    /* renamed from: g */
    public final C145494kd f393146g = new C145404gv(this);

    /* renamed from: h */
    private boolean f393147h;

    /* renamed from: i */
    private final Object f393148i = new Object();

    /* renamed from: j */
    private C145224ad f393149j = new C145224ad((Boolean) null, (Boolean) null);

    /* renamed from: k */
    private int f393150k = 100;

    /* renamed from: l */
    private final AtomicLong f393151l = new AtomicLong(0);

    /* renamed from: m */
    private long f393152m = -1;

    /* renamed from: n */
    private int f393153n = 100;

    /* renamed from: o */
    private C145498n f393154o;

    public C145416hg(C145361ff ffVar) {
        super(ffVar);
        this.f393144e = new C145501q(ffVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo121084A(C145224ad adVar) {
        mo120904g();
        boolean z = (adVar.mo120786f(C145223ac.ANALYTICS_STORAGE) && adVar.mo120786f(C145223ac.AD_STORAGE)) || this.f393011w.mo120975m().mo121166v();
        C145361ff ffVar = this.f393011w;
        ffVar.mo120966as().mo120904g();
        if (z != ffVar.f392953w) {
            C145361ff ffVar2 = this.f393011w;
            ffVar2.mo120966as().mo120904g();
            ffVar2.f392953w = z;
            C145339ek g = this.f393011w.mo120971g();
            C145361ff ffVar3 = g.f393011w;
            g.mo120904g();
            Boolean valueOf = g.mo120921a().contains("measurement_enabled_from_api") ? Boolean.valueOf(g.mo120921a().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                mo121085B(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: B */
    public final void mo121085B(Boolean bool, boolean z) {
        mo120904g();
        mo120949a();
        this.f393011w.mo120965ar().f392802j.mo120895b("Setting app measurement enabled (FE)", bool);
        this.f393011w.mo120971g().mo120925f(bool);
        if (z) {
            C145339ek g = this.f393011w.mo120971g();
            C145361ff ffVar = g.f393011w;
            g.mo120904g();
            SharedPreferences.Editor edit = g.mo120921a().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        C145361ff ffVar2 = this.f393011w;
        ffVar2.mo120966as().mo120904g();
        if (ffVar2.f392953w || (bool != null && !bool.booleanValue())) {
            mo121088E();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121087D(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.C143919bh.m233969l(r10)
            com.google.android.gms.common.internal.C143919bh.m233969l(r11)
            r9.mo120904g()
            r9.mo120949a()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            r1 = 1
            if (r0 == 0) goto L_0x0065
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r2 = "_npa"
            if (r0 == 0) goto L_0x0053
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0053
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r3 = 1
            if (r1 == r11) goto L_0x0037
            r5 = 0
            goto L_0x0038
        L_0x0037:
            r5 = r3
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            com.google.android.gms.measurement.internal.ff r0 = r9.f393011w
            com.google.android.gms.measurement.internal.ek r0 = r0.mo120971g()
            com.google.android.gms.measurement.internal.ej r0 = r0.f392859l
            long r5 = r11.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x004e
            java.lang.String r12 = "true"
        L_0x004e:
            r0.mo120920b(r12)
            r7 = r11
            goto L_0x0063
        L_0x0053:
            if (r12 != 0) goto L_0x0065
            com.google.android.gms.measurement.internal.ff r11 = r9.f393011w
            com.google.android.gms.measurement.internal.ek r11 = r11.mo120971g()
            com.google.android.gms.measurement.internal.ej r11 = r11.f392859l
            java.lang.String r0 = "unset"
            r11.mo120920b(r0)
            r7 = r12
        L_0x0063:
            r4 = r2
            goto L_0x0067
        L_0x0065:
            r4 = r11
            r7 = r12
        L_0x0067:
            com.google.android.gms.measurement.internal.ff r11 = r9.f393011w
            boolean r11 = r11.mo120980r()
            if (r11 != 0) goto L_0x007d
            com.google.android.gms.measurement.internal.ff r10 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r10 = r10.mo120965ar()
            com.google.android.gms.measurement.internal.dv r10 = r10.f392803k
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.mo120894a(r11)
            return
        L_0x007d:
            com.google.android.gms.measurement.internal.ff r11 = r9.f393011w
            boolean r11 = r11.mo120981s()
            if (r11 != 0) goto L_0x0086
            return
        L_0x0086:
            com.google.android.gms.measurement.internal.UserAttributeParcel r11 = new com.google.android.gms.measurement.internal.UserAttributeParcel
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.ff r10 = r9.f393011w
            com.google.android.gms.measurement.internal.it r10 = r10.mo120975m()
            r10.mo120904g()
            r10.mo120949a()
            r10.mo121168x()
            com.google.android.gms.measurement.internal.ff r12 = r10.f393011w
            com.google.android.gms.measurement.internal.dr r12 = r12.mo120970e()
            android.os.Parcel r13 = android.os.Parcel.obtain()
            com.google.android.gms.measurement.internal.C145492kb.m236480a(r11, r13)
            byte[] r14 = r13.marshall()
            r13.recycle()
            int r13 = r14.length
            r0 = 131072(0x20000, float:1.83671E-40)
            r2 = 0
            if (r13 <= r0) goto L_0x00c5
            com.google.android.gms.measurement.internal.ff r12 = r12.f393011w
            com.google.android.gms.measurement.internal.dx r12 = r12.mo120965ar()
            com.google.android.gms.measurement.internal.dv r12 = r12.f392796d
            java.lang.String r13 = "User property too long for local database. Sending directly to service"
            r12.mo120894a(r13)
            goto L_0x00cc
        L_0x00c5:
            boolean r12 = r12.mo120885i(r1, r14)
            if (r12 == 0) goto L_0x00cc
            r2 = 1
        L_0x00cc:
            com.google.android.gms.measurement.internal.AppMetadata r12 = r10.mo121152e(r1)
            com.google.android.gms.measurement.internal.hw r13 = new com.google.android.gms.measurement.internal.hw
            r13.<init>(r10, r12, r2, r11)
            r10.mo121159o(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145416hg.mo121087D(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: E */
    public final void mo121088E() {
        mo120904g();
        C145338ej ejVar = this.f393011w.mo120971g().f392859l;
        ejVar.mo120919a();
        String str = ejVar.f392844a;
        if (str != null) {
            if ("unset".equals(str)) {
                C144006f fVar = this.f393011w.f392924A;
                mo121087D("app", "_npa", (Object) null, System.currentTimeMillis());
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(str) ? 0 : 1);
                C144006f fVar2 = this.f393011w.f392924A;
                mo121087D("app", "_npa", valueOf, System.currentTimeMillis());
            }
        }
        if (!this.f393011w.mo120980r() || !this.f393145f) {
            this.f393011w.mo120965ar().f392802j.mo120894a("Updating Scion state (FE)");
            C145456it m = this.f393011w.mo120975m();
            m.mo120904g();
            m.mo120949a();
            m.mo121159o(new C145443ig(m, m.mo121152e(true)));
            return;
        }
        this.f393011w.mo120965ar().f392802j.mo120894a("Recording app launch after enabling measurement for the first time (FE)");
        mo121097k();
        if (C68931y.m99969c() && this.f393011w.f392937g.mo120776m((String) null, C145313dl.f392724ad)) {
            this.f393011w.mo120976n().f393319c.mo121187a();
        }
        this.f393011w.mo120966as().mo120960h(new C145394gl(this));
    }

    /* renamed from: F */
    public final void mo121089F(C145498n nVar) {
        mo120904g();
        mo120949a();
        C145498n nVar2 = this.f393154o;
        if (nVar != nVar2) {
            C143919bh.m233967j(nVar2 == null, "EventInterceptor already set.");
        }
        this.f393154o = nVar;
    }

    /* renamed from: G */
    public final void mo121090G(String str, Bundle bundle, String str2) {
        C145361ff.m236188u();
        C144006f fVar = this.f393011w.f392924A;
        mo121106t("auto", str, System.currentTimeMillis(), bundle, false, true, true, str2);
    }

    /* renamed from: H */
    public final void mo121091H(String str, String str2, Bundle bundle) {
        C144006f fVar = this.f393011w.f392924A;
        long currentTimeMillis = System.currentTimeMillis();
        C143919bh.m233969l(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f393011w.mo120966as().mo120960h(new C145400gr(this, bundle2));
    }

    /* renamed from: J */
    public final void mo121092J(Object obj) {
        C144006f fVar = this.f393011w.f392924A;
        mo121086C("auto", "_ldl", obj, true, System.currentTimeMillis());
    }

    /* renamed from: K */
    public final void mo121093K(String str) {
        C143919bh.m233969l(str);
        C145222ab abVar = this.f393011w.f392937g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo120873d() {
        return false;
    }

    /* renamed from: e */
    public final String mo121094e() {
        return (String) this.f393143d.get();
    }

    /* renamed from: i */
    public final String mo121095i() {
        C145430hu l = this.f393011w.mo120974l();
        C145361ff ffVar = l.f393011w;
        C145423hn hnVar = l.f393185b;
        if (hnVar != null) {
            return hnVar.f393163b;
        }
        return null;
    }

    /* renamed from: j */
    public final String mo121096j() {
        C145430hu l = this.f393011w.mo120974l();
        C145361ff ffVar = l.f393011w;
        C145423hn hnVar = l.f393185b;
        if (hnVar != null) {
            return hnVar.f393162a;
        }
        return null;
    }

    /* renamed from: k */
    public final void mo121097k() {
        mo120904g();
        mo120949a();
        if (this.f393011w.mo120981s()) {
            if (this.f393011w.f392937g.mo120776m((String) null, C145313dl.f392717X)) {
                C145222ab abVar = this.f393011w.f392937g;
                C145508x xVar = abVar.f393011w.f392936f;
                Boolean j = abVar.mo120773j("google_analytics_deferred_deep_link_enabled");
                if (j != null && j.booleanValue()) {
                    this.f393011w.mo120965ar().f392802j.mo120894a("Deferred Deep Link feature enabled.");
                    this.f393011w.mo120966as().mo120960h(new C145393gk(this));
                }
            }
            C145456it m = this.f393011w.mo120975m();
            m.mo120904g();
            m.mo120949a();
            AppMetadata e = m.mo121152e(true);
            m.f393011w.mo120970e().mo120885i(3, new byte[0]);
            m.mo121159o(new C145437ia(m, e));
            this.f393145f = false;
            C145339ek g = this.f393011w.mo120971g();
            g.mo120904g();
            String string = g.mo120921a().getString("previous_os_version", (String) null);
            g.f393011w.mo120968c().mo121002k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = g.mo120921a().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f393011w.mo120968c().mo121002k();
                if (!string.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo121101o("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo121098l() {
        if ((this.f393011w.f392931a.getApplicationContext() instanceof Application) && this.f393141b != null) {
            ((Application) this.f393011w.f392931a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f393141b);
        }
    }

    /* renamed from: m */
    public final void mo121099m(String str, String str2, Bundle bundle) {
        C144006f fVar = this.f393011w.f392924A;
        mo121100n(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r3 > 100) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r6 > 100) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d9, code lost:
        r2 = r1.f393011w.mo120965ar().f392803k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e1, code lost:
        if (r13 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e6, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e7, code lost:
        if (r14 != null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e9, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ec, code lost:
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ed, code lost:
        r2.mo120896c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f4, code lost:
        if (r1.f393185b != null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f6, code lost:
        r2 = r1.f393186c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r2 = r1.f393185b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fb, code lost:
        r12 = new com.google.android.gms.measurement.internal.C145423hn(r13, r14, r1.f393011w.mo120977o().mo121285r(), true, r26);
        r1.f393185b = r12;
        r1.f393186c = r2;
        r1.f393191h = r12;
        r4 = r1.f393011w.f392924A;
        r1.f393011w.mo120966as().mo120960h(new com.google.android.gms.measurement.internal.C145424ho(r1, r0, r12, r2, android.os.SystemClock.elapsedRealtime()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0137, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121100n(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            r20 = this;
            r11 = r20
            if (r21 != 0) goto L_0x0008
            java.lang.String r0 = "app"
            r2 = r0
            goto L_0x000a
        L_0x0008:
            r2 = r21
        L_0x000a:
            if (r23 != 0) goto L_0x0012
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            goto L_0x0014
        L_0x0012:
            r0 = r23
        L_0x0014:
            java.lang.String r1 = "screen_view"
            r3 = r22
            boolean r1 = p3186j$.util.Objects.equals(r3, r1)
            r4 = 0
            if (r1 == 0) goto L_0x013b
            com.google.android.gms.measurement.internal.ff r1 = r11.f393011w
            com.google.android.gms.measurement.internal.hu r1 = r1.mo120974l()
            java.lang.Object r5 = r1.f393194k
            monitor-enter(r5)
            boolean r2 = r1.f393193j     // Catch:{ all -> 0x0138 }
            if (r2 != 0) goto L_0x003b
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392800h     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r0.mo120894a(r1)     // Catch:{ all -> 0x0138 }
            monitor-exit(r5)     // Catch:{ all -> 0x0138 }
            return
        L_0x003b:
            java.lang.String r2 = "screen_name"
            java.lang.String r13 = r0.getString(r2)     // Catch:{ all -> 0x0138 }
            r2 = 100
            if (r13 == 0) goto L_0x006c
            int r3 = r13.length()     // Catch:{ all -> 0x0138 }
            if (r3 <= 0) goto L_0x0055
            int r3 = r13.length()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.ff r6 = r1.f393011w     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.ab r6 = r6.f392937g     // Catch:{ all -> 0x0138 }
            if (r3 <= r2) goto L_0x006c
        L_0x0055:
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392800h     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "Invalid screen name length for screen view. Length"
            int r2 = r13.length()     // Catch:{ all -> 0x0138 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0138 }
            r0.mo120895b(r1, r2)     // Catch:{ all -> 0x0138 }
            monitor-exit(r5)     // Catch:{ all -> 0x0138 }
            return
        L_0x006c:
            java.lang.String r3 = "screen_class"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0138 }
            if (r3 == 0) goto L_0x009b
            int r6 = r3.length()     // Catch:{ all -> 0x0138 }
            if (r6 <= 0) goto L_0x0084
            int r6 = r3.length()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.ff r7 = r1.f393011w     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.ab r7 = r7.f392937g     // Catch:{ all -> 0x0138 }
            if (r6 <= r2) goto L_0x009b
        L_0x0084:
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392800h     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r2 = r3.length()     // Catch:{ all -> 0x0138 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0138 }
            r0.mo120895b(r1, r2)     // Catch:{ all -> 0x0138 }
            monitor-exit(r5)     // Catch:{ all -> 0x0138 }
            return
        L_0x009b:
            if (r3 != 0) goto L_0x00ae
            android.app.Activity r2 = r1.f393189f     // Catch:{ all -> 0x0138 }
            if (r2 == 0) goto L_0x00aa
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = r1.mo121127n(r2)     // Catch:{ all -> 0x0138 }
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r2 = "Activity"
        L_0x00ac:
            r14 = r2
            goto L_0x00af
        L_0x00ae:
            r14 = r3
        L_0x00af:
            com.google.android.gms.measurement.internal.hn r2 = r1.f393185b     // Catch:{ all -> 0x0138 }
            boolean r3 = r1.f393190g     // Catch:{ all -> 0x0138 }
            if (r3 == 0) goto L_0x00d8
            if (r2 == 0) goto L_0x00d8
            r1.f393190g = r4     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = r2.f393163b     // Catch:{ all -> 0x0138 }
            boolean r3 = p3186j$.util.Objects.equals(r3, r14)     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = r2.f393162a     // Catch:{ all -> 0x0138 }
            boolean r2 = p3186j$.util.Objects.equals(r2, r13)     // Catch:{ all -> 0x0138 }
            if (r3 == 0) goto L_0x00d8
            if (r2 == 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392800h     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r0.mo120894a(r1)     // Catch:{ all -> 0x0138 }
            monitor-exit(r5)     // Catch:{ all -> 0x0138 }
            return
        L_0x00d8:
            monitor-exit(r5)     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392803k
            if (r13 != 0) goto L_0x00e6
            java.lang.String r3 = "null"
            goto L_0x00e7
        L_0x00e6:
            r3 = r13
        L_0x00e7:
            if (r14 != 0) goto L_0x00ec
            java.lang.String r4 = "null"
            goto L_0x00ed
        L_0x00ec:
            r4 = r14
        L_0x00ed:
            java.lang.String r5 = "Logging screen view with name, class"
            r2.mo120896c(r5, r3, r4)
            com.google.android.gms.measurement.internal.hn r2 = r1.f393185b
            if (r2 != 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.hn r2 = r1.f393186c
            goto L_0x00fb
        L_0x00f9:
            com.google.android.gms.measurement.internal.hn r2 = r1.f393185b
        L_0x00fb:
            com.google.android.gms.measurement.internal.hn r3 = new com.google.android.gms.measurement.internal.hn
            com.google.android.gms.measurement.internal.ff r4 = r1.f393011w
            com.google.android.gms.measurement.internal.ke r4 = r4.mo120977o()
            long r15 = r4.mo121285r()
            r17 = 1
            r12 = r3
            r18 = r26
            r12.<init>(r13, r14, r15, r17, r18)
            r1.f393185b = r3
            r1.f393186c = r2
            r1.f393191h = r3
            com.google.android.gms.measurement.internal.ff r4 = r1.f393011w
            com.google.android.gms.common.util.f r4 = r4.f392924A
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.measurement.internal.ff r6 = r1.f393011w
            com.google.android.gms.measurement.internal.fc r6 = r6.mo120966as()
            com.google.android.gms.measurement.internal.ho r7 = new com.google.android.gms.measurement.internal.ho
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r3
            r25 = r2
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r6.mo120960h(r7)
            return
        L_0x0138:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0138 }
            throw r0
        L_0x013b:
            r1 = 1
            if (r25 == 0) goto L_0x014b
            com.google.android.gms.measurement.internal.n r5 = r11.f393154o
            if (r5 == 0) goto L_0x014b
            boolean r5 = com.google.android.gms.measurement.internal.C145495ke.m236485ad(r22)
            if (r5 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r8 = 0
            goto L_0x014c
        L_0x014b:
            r8 = 1
        L_0x014c:
            r10 = 0
            r1 = r20
            r3 = r22
            r4 = r26
            r6 = r0
            r7 = r25
            r9 = r24
            r1.mo121106t(r2, r3, r4, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145416hg.mo121100n(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo121101o(String str, String str2, Bundle bundle) {
        mo120904g();
        C144006f fVar = this.f393011w.f392924A;
        mo121102p(str, str2, System.currentTimeMillis(), bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo121102p(String str, String str2, long j, Bundle bundle) {
        mo120904g();
        mo121103q(str, str2, j, bundle, true, this.f393154o == null || C145495ke.m236485ad(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x050c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011e  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121103q(java.lang.String r25, java.lang.String r26, long r27, android.os.Bundle r29, boolean r30, boolean r31, boolean r32, java.lang.String r33) {
        /*
            r24 = this;
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r12 = r29
            com.google.android.gms.common.internal.C143919bh.m233969l(r25)
            com.google.android.gms.common.internal.C143919bh.m233958a(r29)
            r24.mo120904g()
            r24.mo120949a()
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            boolean r0 = r0.mo120980r()
            if (r0 == 0) goto L_0x053e
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.dp r0 = r0.mo120969d()
            java.util.List r0 = r0.f392767h
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x002f
            goto L_0x003d
        L_0x002f:
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392802j
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo120896c(r1, r9, r8)
            return
        L_0x003d:
            boolean r0 = r7.f393147h
            r13 = 0
            r14 = 1
            r15 = 0
            if (r0 != 0) goto L_0x0093
            r7.f393147h = r14
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w     // Catch:{ ClassNotFoundException -> 0x0086 }
            boolean r0 = r0.f392935e     // Catch:{ ClassNotFoundException -> 0x0086 }
            java.lang.String r1 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L_0x005b
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w     // Catch:{ ClassNotFoundException -> 0x0086 }
            android.content.Context r0 = r0.f392931a     // Catch:{ ClassNotFoundException -> 0x0086 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0086 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r14, r0)     // Catch:{ ClassNotFoundException -> 0x0086 }
            goto L_0x005f
        L_0x005b:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0086 }
        L_0x005f:
            java.lang.Class[] r1 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0077 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r15] = r2     // Catch:{ Exception -> 0x0077 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0077 }
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0077 }
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w     // Catch:{ Exception -> 0x0077 }
            android.content.Context r2 = r2.f392931a     // Catch:{ Exception -> 0x0077 }
            r1[r15] = r2     // Catch:{ Exception -> 0x0077 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0093
        L_0x0077:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w     // Catch:{ ClassNotFoundException -> 0x0086 }
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()     // Catch:{ ClassNotFoundException -> 0x0086 }
            com.google.android.gms.measurement.internal.dv r1 = r1.f392798f     // Catch:{ ClassNotFoundException -> 0x0086 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo120895b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0086 }
            goto L_0x0093
        L_0x0086:
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392801i
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo120894a(r1)
        L_0x0093:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00bc
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.x r1 = r1.f392936f
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.common.util.f r0 = r0.f392924A
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            long r5 = java.lang.System.currentTimeMillis()
            r1 = r24
            r1.mo121087D(r2, r3, r4, r5)
        L_0x00bc:
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.x r0 = r0.f392936f
            if (r30 == 0) goto L_0x00e2
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.C145495ke.f393386a
            r0 = r0[r15]
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x00e2
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r0 = r0.mo120977o()
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ek r1 = r1.mo120971g()
            com.google.android.gms.measurement.internal.eg r1 = r1.f392869v
            r1.mo120913a()
            android.os.Bundle r1 = r1.f392830a
            r0.mo121251G(r12, r1)
        L_0x00e2:
            r0 = 40
            r1 = 2
            if (r32 != 0) goto L_0x0164
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w
            com.google.android.gms.measurement.internal.x r2 = r2.f392936f
            java.lang.String r2 = "_iap"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x0164
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r2 = r2.mo120977o()
            java.lang.String r3 = "event"
            boolean r4 = r2.mo121268Y(r3, r9)
            if (r4 != 0) goto L_0x0103
        L_0x0101:
            r2 = 2
            goto L_0x011c
        L_0x0103:
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.C145385gc.f393044a
            java.lang.String[] r5 = com.google.android.gms.measurement.internal.C145385gc.f393045b
            boolean r4 = r2.mo121265V(r3, r4, r5, r9)
            if (r4 != 0) goto L_0x0110
            r2 = 13
            goto L_0x011c
        L_0x0110:
            com.google.android.gms.measurement.internal.ff r4 = r2.f393011w
            com.google.android.gms.measurement.internal.ab r4 = r4.f392937g
            boolean r2 = r2.mo121264U(r3, r0, r9)
            if (r2 != 0) goto L_0x011b
            goto L_0x0101
        L_0x011b:
            r2 = 0
        L_0x011c:
            if (r2 == 0) goto L_0x0164
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392797e
            com.google.android.gms.measurement.internal.ff r3 = r7.f393011w
            com.google.android.gms.measurement.internal.ds r3 = r3.f392942l
            java.lang.String r3 = r3.mo120890c(r9)
            java.lang.String r4 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo120895b(r4, r3)
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r1 = r1.mo120977o()
            com.google.android.gms.measurement.internal.ff r3 = r7.f393011w
            com.google.android.gms.measurement.internal.ab r3 = r3.f392937g
            java.lang.String r0 = r1.mo121293z(r9, r0, r14)
            if (r9 == 0) goto L_0x0147
            int r15 = r26.length()
        L_0x0147:
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r1 = r1.mo120977o()
            com.google.android.gms.measurement.internal.kd r3 = r7.f393146g
            r4 = 0
            java.lang.String r5 = "_ev"
            r25 = r1
            r26 = r3
            r27 = r4
            r28 = r2
            r29 = r5
            r30 = r0
            r31 = r15
            r25.mo121253J(r26, r27, r28, r29, r30, r31)
            return
        L_0x0164:
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w
            com.google.android.gms.measurement.internal.x r2 = r2.f392936f
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w
            com.google.android.gms.measurement.internal.hu r2 = r2.mo120974l()
            com.google.android.gms.measurement.internal.hn r2 = r2.mo121122i(r15)
            java.lang.String r3 = "_sc"
            if (r2 == 0) goto L_0x017e
            boolean r4 = r12.containsKey(r3)
            if (r4 != 0) goto L_0x017e
            r2.f393165d = r14
        L_0x017e:
            if (r30 == 0) goto L_0x0184
            if (r32 != 0) goto L_0x0184
            r4 = 1
            goto L_0x0185
        L_0x0184:
            r4 = 0
        L_0x0185:
            com.google.android.gms.measurement.internal.C145495ke.m236484F(r2, r12, r4)
            java.lang.String r2 = "am"
            boolean r2 = r2.equals(r8)
            boolean r4 = com.google.android.gms.measurement.internal.C145495ke.m236485ad(r26)
            if (r30 == 0) goto L_0x01e4
            com.google.android.gms.measurement.internal.n r5 = r7.f393154o
            if (r5 == 0) goto L_0x01e4
            if (r4 != 0) goto L_0x01e4
            if (r2 != 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392802j
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ds r1 = r1.f392942l
            java.lang.String r1 = r1.mo120890c(r9)
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w
            com.google.android.gms.measurement.internal.ds r2 = r2.f392942l
            java.lang.String r2 = r2.mo120889b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo120896c(r3, r1, r2)
            com.google.android.gms.measurement.internal.n r0 = r7.f393154o
            com.google.android.gms.common.internal.C143919bh.m233958a(r0)
            com.google.android.gms.measurement.internal.n r13 = r7.f393154o
            com.google.android.gms.measurement.api.internal.i r1 = r13.f393398a     // Catch:{ RemoteException -> 0x01ce }
            r2 = r25
            r3 = r26
            r4 = r29
            r5 = r27
            r1.mo120749f(r2, r3, r4, r5)     // Catch:{ RemoteException -> 0x01ce }
            return
        L_0x01ce:
            r0 = move-exception
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1 = r13.f393399b
            com.google.android.gms.measurement.internal.ff r1 = r1.f392498a
            if (r1 == 0) goto L_0x053d
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392798f
            java.lang.String r2 = "Event interceptor threw exception"
            r1.mo120895b(r2, r0)
            return
        L_0x01e1:
            r16 = 1
            goto L_0x01e6
        L_0x01e4:
            r16 = r2
        L_0x01e6:
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w
            boolean r2 = r2.mo120981s()
            if (r2 == 0) goto L_0x053d
            com.google.android.gms.measurement.internal.ff r2 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r2 = r2.mo120977o()
            int r2 = r2.mo121280d(r9)
            if (r2 == 0) goto L_0x023f
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392797e
            com.google.android.gms.measurement.internal.ff r3 = r7.f393011w
            com.google.android.gms.measurement.internal.ds r3 = r3.f392942l
            java.lang.String r3 = r3.mo120890c(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r1.mo120895b(r4, r3)
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r1 = r1.mo120977o()
            com.google.android.gms.measurement.internal.ff r3 = r7.f393011w
            com.google.android.gms.measurement.internal.ab r3 = r3.f392937g
            java.lang.String r0 = r1.mo121293z(r9, r0, r14)
            if (r9 == 0) goto L_0x0223
            int r15 = r26.length()
        L_0x0223:
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r1 = r1.mo120977o()
            com.google.android.gms.measurement.internal.kd r3 = r7.f393146g
            java.lang.String r4 = "_ev"
            r25 = r1
            r26 = r3
            r27 = r33
            r28 = r2
            r29 = r4
            r30 = r0
            r31 = r15
            r25.mo121253J(r26, r27, r28, r29, r30, r31)
            return
        L_0x023f:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r6 = "_o"
            r0[r15] = r6
            java.lang.String r2 = "_sn"
            r0[r14] = r2
            r0[r1] = r3
            r1 = 3
            java.lang.String r2 = "_si"
            r0[r1] = r2
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r1 = r0.mo120977o()
            r2 = r33
            r3 = r26
            r4 = r29
            r12 = r6
            r6 = r32
            android.os.Bundle r0 = r1.mo121289v(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.C143919bh.m233958a(r0)
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.x r1 = r1.f392936f
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.hu r1 = r1.mo120974l()
            com.google.android.gms.measurement.internal.hn r1 = r1.mo121122i(r15)
            r5 = 0
            java.lang.String r4 = "_ae"
            if (r1 == 0) goto L_0x02ae
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x02ae
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.jj r1 = r1.mo120976n()
            com.google.android.gms.measurement.internal.jh r1 = r1.f393320d
            com.google.android.gms.measurement.internal.jj r2 = r1.f393316d
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w
            com.google.android.gms.common.util.f r2 = r2.f392924A
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r14 = r1.f393314b
            long r14 = r2 - r14
            r1.f393314b = r2
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ae
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r1 = r1.mo120977o()
            r1.mo121250E(r0, r14)
        L_0x02ae:
            boolean r1 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68922p.m99945c()
            if (r1 == 0) goto L_0x0339
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ab r1 = r1.f392937g
            com.google.android.gms.measurement.internal.dk r2 = com.google.android.gms.measurement.internal.C145313dl.f392723ac
            boolean r1 = r1.mo120776m(r13, r2)
            if (r1 == 0) goto L_0x0339
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0317
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0317
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r1 = r1.mo120977o()
            java.lang.String r2 = r0.getString(r2)
            boolean r3 = com.google.android.gms.common.util.C144015o.m234195a(r2)
            if (r3 == 0) goto L_0x02e4
            r2 = r13
            goto L_0x02ea
        L_0x02e4:
            if (r2 == 0) goto L_0x02ea
            java.lang.String r2 = r2.trim()
        L_0x02ea:
            com.google.android.gms.measurement.internal.ff r3 = r1.f393011w
            com.google.android.gms.measurement.internal.ek r3 = r3.mo120971g()
            com.google.android.gms.measurement.internal.ej r3 = r3.f392866s
            r3.mo120919a()
            java.lang.String r3 = r3.f392844a
            boolean r3 = p3186j$.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L_0x0309
            com.google.android.gms.measurement.internal.ff r1 = r1.f393011w
            com.google.android.gms.measurement.internal.ek r1 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ej r1 = r1.f392866s
            r1.mo120920b(r2)
            goto L_0x0339
        L_0x0309:
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392802j
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo120894a(r1)
            return
        L_0x0317:
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x0339
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r1 = r1.mo120977o()
            com.google.android.gms.measurement.internal.ff r1 = r1.f393011w
            com.google.android.gms.measurement.internal.ek r1 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ej r1 = r1.f392866s
            r1.mo120919a()
            java.lang.String r1 = r1.f392844a
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0339
            r0.putString(r2, r1)
        L_0x0339:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r0)
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ek r1 = r1.mo120971g()
            com.google.android.gms.measurement.internal.eh r1 = r1.f392861n
            r1.mo120915a()
            long r1 = r1.f392834a
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x03b5
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ek r1 = r1.mo120971g()
            boolean r1 = r1.mo120927i(r10)
            if (r1 == 0) goto L_0x03b5
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ek r1 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ef r1 = r1.f392863p
            r1.mo120911a()
            boolean r1 = r1.f392825a
            if (r1 == 0) goto L_0x03b5
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392803k
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo120894a(r2)
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.common.util.f r1 = r1.f392924A
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r15 = 0
            long r17 = java.lang.System.currentTimeMillis()
            r1 = r24
            r13 = r4
            r4 = r15
            r8 = r5
            r5 = r17
            r1.mo121087D(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.common.util.f r1 = r1.f392924A
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r4 = 0
            long r5 = java.lang.System.currentTimeMillis()
            r1 = r24
            r1.mo121087D(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.common.util.f r1 = r1.f392924A
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            long r5 = java.lang.System.currentTimeMillis()
            r1 = r24
            r1.mo121087D(r2, r3, r4, r5)
            goto L_0x03b7
        L_0x03b5:
            r13 = r4
            r8 = r5
        L_0x03b7:
            java.lang.String r1 = "extend_session"
            long r1 = r0.getLong(r1, r8)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x03dc
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392803k
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo120894a(r2)
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.jj r1 = r1.mo120976n()
            com.google.android.gms.measurement.internal.ji r1 = r1.f393319c
            r2 = 1
            r1.mo121188b(r10, r2)
        L_0x03dc:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r0.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x03ed:
            if (r3 >= r2) goto L_0x043b
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0438
            com.google.android.gms.measurement.internal.ff r5 = r7.f393011w
            r5.mo120977o()
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x040d
            r6 = 1
            android.os.Bundle[] r8 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r8[r6] = r5
            goto L_0x0433
        L_0x040d:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x041e
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r8 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r8)
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0433
        L_0x041e:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x0432
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0433
        L_0x0432:
            r8 = 0
        L_0x0433:
            if (r8 == 0) goto L_0x0438
            r0.putParcelableArray(r4, r8)
        L_0x0438:
            int r3 = r3 + 1
            goto L_0x03ed
        L_0x043b:
            r8 = 0
        L_0x043c:
            int r0 = r14.size()
            if (r8 >= r0) goto L_0x0510
            java.lang.Object r0 = r14.get(r8)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r8 == 0) goto L_0x0450
            java.lang.String r1 = "_ep"
            r9 = r25
            r2 = r1
            goto L_0x0454
        L_0x0450:
            r9 = r25
            r2 = r26
        L_0x0454:
            r0.putString(r12, r9)
            if (r31 == 0) goto L_0x0463
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.ke r1 = r1.mo120977o()
            android.os.Bundle r0 = r1.mo121288u(r0)
        L_0x0463:
            r15 = r0
            com.google.android.gms.measurement.internal.EventParcel r0 = new com.google.android.gms.measurement.internal.EventParcel
            com.google.android.gms.measurement.internal.EventParams r3 = new com.google.android.gms.measurement.internal.EventParams
            r3.<init>(r15)
            r1 = r0
            r4 = r25
            r5 = r27
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.measurement.internal.it r1 = r1.mo120975m()
            r1.mo120904g()
            r1.mo120949a()
            r1.mo121168x()
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w
            com.google.android.gms.measurement.internal.dr r2 = r2.mo120970e()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r4 = 0
            com.google.android.gms.measurement.internal.C145237aq.m235976a(r0, r3, r4)
            byte[] r4 = r3.marshall()
            r3.recycle()
            int r3 = r4.length
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r5) goto L_0x04ad
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392796d
            java.lang.String r3 = "Event is too long for local database. Sending event directly to service"
            r2.mo120894a(r3)
        L_0x04a9:
            r2 = 1
            r21 = 0
            goto L_0x04b7
        L_0x04ad:
            r3 = 0
            boolean r2 = r2.mo120885i(r3, r4)
            if (r2 == 0) goto L_0x04a9
            r2 = 1
            r21 = 1
        L_0x04b7:
            com.google.android.gms.measurement.internal.AppMetadata r20 = r1.mo121152e(r2)
            com.google.android.gms.measurement.internal.ii r2 = new com.google.android.gms.measurement.internal.ii
            r19 = 1
            r17 = r2
            r18 = r1
            r22 = r0
            r23 = r33
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r1.mo121159o(r2)
            if (r16 != 0) goto L_0x050c
            java.util.Set r0 = r7.f393142c
            java.util.Iterator r17 = r0.iterator()
        L_0x04d5:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x050c
            java.lang.Object r0 = r17.next()
            r5 = r0
            com.google.android.gms.measurement.internal.o r5 = (com.google.android.gms.measurement.internal.C145499o) r5
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r15)
            com.google.android.gms.measurement.api.internal.i r1 = r5.f393400a     // Catch:{ RemoteException -> 0x04f6 }
            r2 = r25
            r3 = r26
            r9 = r5
            r5 = r27
            r1.mo120749f(r2, r3, r4, r5)     // Catch:{ RemoteException -> 0x04f4 }
            goto L_0x0509
        L_0x04f4:
            r0 = move-exception
            goto L_0x04f8
        L_0x04f6:
            r0 = move-exception
            r9 = r5
        L_0x04f8:
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1 = r9.f393401b
            com.google.android.gms.measurement.internal.ff r1 = r1.f392498a
            if (r1 == 0) goto L_0x0509
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392798f
            java.lang.String r2 = "Event listener threw exception"
            r1.mo120895b(r2, r0)
        L_0x0509:
            r9 = r25
            goto L_0x04d5
        L_0x050c:
            int r8 = r8 + 1
            goto L_0x043c
        L_0x0510:
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.x r0 = r0.f392936f
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.hu r0 = r0.mo120974l()
            r1 = 0
            com.google.android.gms.measurement.internal.hn r0 = r0.mo121122i(r1)
            if (r0 == 0) goto L_0x053d
            r1 = r26
            boolean r0 = r13.equals(r1)
            if (r0 == 0) goto L_0x053d
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.jj r0 = r0.mo120976n()
            com.google.android.gms.measurement.internal.ff r1 = r7.f393011w
            com.google.android.gms.common.util.f r1 = r1.f392924A
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.measurement.internal.jh r0 = r0.f393320d
            r3 = 1
            r0.mo121186a(r3, r3, r1)
        L_0x053d:
            return
        L_0x053e:
            com.google.android.gms.measurement.internal.ff r0 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392802j
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo120894a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145416hg.mo121103q(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo121104r(long j, boolean z) {
        mo120904g();
        mo120949a();
        this.f393011w.mo120965ar().f392802j.mo120894a("Resetting analytics data (FE)");
        C145473jj n = this.f393011w.mo120976n();
        n.mo120904g();
        C145472ji jiVar = n.f393319c;
        C145471jh jhVar = n.f393320d;
        jhVar.f393315c.mo120829a();
        jhVar.f393313a = 0;
        jhVar.f393314b = 0;
        if (C68893aw.m99823c() && this.f393011w.f392937g.mo120776m((String) null, C145313dl.f392729ai)) {
            this.f393011w.mo120969d().mo120876h();
        }
        boolean r = this.f393011w.mo120980r();
        C145339ek g = this.f393011w.mo120971g();
        g.f392851d.mo120916b(j);
        C145338ej ejVar = g.f393011w.mo120971g().f392866s;
        ejVar.mo120919a();
        if (!TextUtils.isEmpty(ejVar.f392844a)) {
            g.f392866s.mo120920b((String) null);
        }
        if (C68931y.m99969c() && g.f393011w.f392937g.mo120776m((String) null, C145313dl.f392724ad)) {
            g.f392861n.mo120916b(0);
        }
        if (!g.f393011w.f392937g.mo120779p()) {
            g.mo120926h(!r);
        }
        g.f392867t.mo120920b((String) null);
        g.f392868u.mo120916b(0);
        g.f392869v.mo120914b((Bundle) null);
        if (z) {
            C145456it m = this.f393011w.mo120975m();
            m.mo120904g();
            C145361ff ffVar = m.f393011w;
            m.mo120949a();
            AppMetadata e = m.mo121152e(false);
            m.mo121168x();
            m.f393011w.mo120970e().mo120883f();
            m.mo121159o(new C145433hx(m, e));
        }
        if (C68931y.m99969c() && this.f393011w.f392937g.mo120776m((String) null, C145313dl.f392724ad)) {
            this.f393011w.mo120976n().f393319c.mo121187a();
        }
        this.f393145f = !r;
    }

    /* renamed from: s */
    public final void mo121105s(C145224ad adVar, C145224ad adVar2) {
        boolean z;
        C145223ac[] acVarArr = {C145223ac.ANALYTICS_STORAGE, C145223ac.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            C145223ac acVar = acVarArr[i];
            if (!adVar2.mo120786f(acVar) && adVar.mo120786f(acVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean i2 = adVar.mo120789i(adVar2, C145223ac.ANALYTICS_STORAGE, C145223ac.AD_STORAGE);
        if (z || i2) {
            this.f393011w.mo120969d().mo120876h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo121106t(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f393011w.mo120966as().mo120960h(new C145396gn(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo121107u(String str, String str2, long j, Object obj) {
        this.f393011w.mo120966as().mo120960h(new C145397go(this, str, str2, obj, j));
    }

    /* renamed from: v */
    public final void mo121108v(Bundle bundle, long j) {
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f393011w.mo120965ar().f392798f.mo120894a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C145384gb.m236288a(bundle2, "app_id", String.class, (Object) null);
        C145384gb.m236288a(bundle2, "origin", String.class, (Object) null);
        C145384gb.m236288a(bundle2, "name", String.class, (Object) null);
        C145384gb.m236288a(bundle2, "value", Object.class, (Object) null);
        C145384gb.m236288a(bundle2, "trigger_event_name", String.class, (Object) null);
        C145384gb.m236288a(bundle2, "trigger_timeout", Long.class, 0L);
        C145384gb.m236288a(bundle2, "timed_out_event_name", String.class, (Object) null);
        C145384gb.m236288a(bundle2, "timed_out_event_params", Bundle.class, (Object) null);
        C145384gb.m236288a(bundle2, "triggered_event_name", String.class, (Object) null);
        C145384gb.m236288a(bundle2, "triggered_event_params", Bundle.class, (Object) null);
        C145384gb.m236288a(bundle2, "time_to_live", Long.class, 0L);
        C145384gb.m236288a(bundle2, "expired_event_name", String.class, (Object) null);
        C145384gb.m236288a(bundle2, "expired_event_params", Bundle.class, (Object) null);
        C143919bh.m233969l(bundle2.getString("name"));
        C143919bh.m233969l(bundle2.getString("origin"));
        C143919bh.m233958a(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f393011w.mo120977o().mo121283o(string) != 0) {
            this.f393011w.mo120965ar().f392795c.mo120895b("Invalid conditional user property name", this.f393011w.f392942l.mo120892e(string));
        } else if (this.f393011w.mo120977o().mo121279c(string, obj) == 0) {
            Object x = this.f393011w.mo120977o().mo121291x(string, obj);
            if (x == null) {
                this.f393011w.mo120965ar().f392795c.mo120896c("Unable to normalize conditional user property value", this.f393011w.f392942l.mo120892e(string), obj);
                return;
            }
            C145384gb.m236289b(bundle2, x);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                C145361ff ffVar = this.f393011w;
                C145222ab abVar = ffVar.f392937g;
                if (j2 > 15552000000L || j2 < 1) {
                    ffVar.mo120965ar().f392795c.mo120896c("Invalid conditional user property timeout", this.f393011w.f392942l.mo120892e(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            C145361ff ffVar2 = this.f393011w;
            C145222ab abVar2 = ffVar2.f392937g;
            if (j3 > 15552000000L || j3 < 1) {
                ffVar2.mo120965ar().f392795c.mo120896c("Invalid conditional user property time to live", this.f393011w.f392942l.mo120892e(string), Long.valueOf(j3));
            } else {
                ffVar2.mo120966as().mo120960h(new C145399gq(this, bundle2));
            }
        } else {
            this.f393011w.mo120965ar().f392795c.mo120896c("Invalid conditional user property value", this.f393011w.f392942l.mo120892e(string), obj);
        }
    }

    /* renamed from: w */
    public final void mo121109w(Bundle bundle, int i, long j) {
        mo120949a();
        String d = C145224ad.m235921d(bundle);
        if (d != null) {
            this.f393011w.mo120965ar().f392800h.mo120895b("Ignoring invalid consent setting", d);
            this.f393011w.mo120965ar().f392800h.mo120894a("Valid consent values are 'granted', 'denied'");
        }
        mo121110x(C145224ad.m235919a(bundle), i, j);
    }

    /* renamed from: x */
    public final void mo121110x(C145224ad adVar, int i, long j) {
        int i2;
        C145224ad adVar2;
        int i3;
        boolean z;
        boolean z2;
        C145224ad adVar3 = adVar;
        mo120949a();
        int i4 = i;
        if (i4 == -10) {
            i2 = -10;
        } else if (((Boolean) adVar3.f392559b.get(C145223ac.AD_STORAGE)) == null && ((Boolean) adVar3.f392559b.get(C145223ac.ANALYTICS_STORAGE)) == null) {
            this.f393011w.mo120965ar().f392800h.mo120894a("Discarding empty consent settings");
            return;
        } else {
            i2 = i4;
        }
        synchronized (this.f393148i) {
            adVar2 = this.f393149j;
            i3 = 0;
            if (C145224ad.m235922g(i2, this.f393150k)) {
                z2 = adVar3.mo120787h(this.f393149j);
                boolean z3 = adVar3.mo120786f(C145223ac.ANALYTICS_STORAGE) && !this.f393149j.mo120786f(C145223ac.ANALYTICS_STORAGE);
                C145224ad adVar4 = this.f393149j;
                EnumMap enumMap = new EnumMap(C145223ac.class);
                C145223ac[] values = C145223ac.values();
                int length = values.length;
                while (i3 < length) {
                    C145223ac acVar = values[i3];
                    Boolean bool = (Boolean) adVar3.f392559b.get(acVar);
                    if (bool == null) {
                        bool = (Boolean) adVar4.f392559b.get(acVar);
                    }
                    enumMap.put(acVar, bool);
                    i3++;
                }
                adVar3 = new C145224ad(enumMap);
                this.f393149j = adVar3;
                this.f393150k = i2;
                z = z3;
                i3 = 1;
            } else {
                z2 = false;
                z = false;
            }
        }
        if (i3 == 0) {
            this.f393011w.mo120965ar().f392801i.mo120895b("Ignoring lower-priority consent settings, proposed settings", adVar3);
            return;
        }
        long andIncrement = this.f393151l.getAndIncrement();
        if (z2) {
            this.f393143d.set((Object) null);
            this.f393011w.mo120966as().mo120961i(new C145411hb(this, adVar3, j, i2, andIncrement, z, adVar2));
            return;
        }
        C145412hc hcVar = new C145412hc(this, adVar3, i2, andIncrement, z, adVar2);
        if (i2 == 30 || i2 == -10) {
            this.f393011w.mo120966as().mo120961i(hcVar);
        } else {
            this.f393011w.mo120966as().mo120960h(hcVar);
        }
    }

    /* renamed from: y */
    public final void mo121111y(C145224ad adVar, int i, long j, boolean z, boolean z2) {
        mo120904g();
        mo120949a();
        if (j > this.f393152m || !C145224ad.m235922g(this.f393153n, i)) {
            C145339ek g = this.f393011w.mo120971g();
            C145361ff ffVar = g.f393011w;
            g.mo120904g();
            if (g.mo120928j(i)) {
                SharedPreferences.Editor edit = g.mo120921a().edit();
                edit.putString("consent_settings", adVar.mo120784e());
                edit.putInt("consent_source", i);
                edit.apply();
                this.f393152m = j;
                this.f393153n = i;
                C145456it m = this.f393011w.mo120975m();
                m.mo120904g();
                m.mo120949a();
                if (z) {
                    m.mo121168x();
                    m.f393011w.mo120970e().mo120883f();
                }
                if (m.mo121166v()) {
                    m.mo121159o(new C145444ih(m, m.mo121152e(false)));
                }
                if (z2) {
                    this.f393011w.mo120975m().mo121156l(new AtomicReference());
                    return;
                }
                return;
            }
            this.f393011w.mo120965ar().f392801i.mo120895b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        this.f393011w.mo120965ar().f392801i.mo120895b("Dropped out-of-date consent setting, proposed settings", adVar);
    }

    /* renamed from: z */
    public final void mo121112z(Boolean bool) {
        mo120949a();
        this.f393011w.mo120966as().mo120960h(new C145410ha(this, bool));
    }

    /* renamed from: C */
    public final void mo121086C(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int i2;
        String str3 = str2;
        Object obj2 = obj;
        String str4 = str == null ? "app" : str;
        if (z) {
            i = this.f393011w.mo120977o().mo121283o(str3);
        } else {
            C145495ke o = this.f393011w.mo120977o();
            if (o.mo121268Y("user property", str3)) {
                if (!o.mo121265V("user property", C145387ge.f393052a, (String[]) null, str3)) {
                    i = 15;
                } else {
                    C145222ab abVar = o.f393011w.f392937g;
                    if (o.mo121264U("user property", 24, str3)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        if (i != 0) {
            C145495ke o2 = this.f393011w.mo120977o();
            C145222ab abVar2 = this.f393011w.f392937g;
            this.f393011w.mo120977o().mo121253J(this.f393146g, (String) null, i, "_ev", o2.mo121293z(str3, 24, true), str3 != null ? str2.length() : 0);
        } else if (obj2 != null) {
            int c = this.f393011w.mo120977o().mo121279c(str3, obj2);
            if (c != 0) {
                C145495ke o3 = this.f393011w.mo120977o();
                C145222ab abVar3 = this.f393011w.f392937g;
                String z2 = o3.mo121293z(str3, 24, true);
                if ((obj2 instanceof String) || (obj2 instanceof CharSequence)) {
                    i2 = obj.toString().length();
                } else {
                    i2 = 0;
                }
                this.f393011w.mo120977o().mo121253J(this.f393146g, (String) null, c, "_ev", z2, i2);
                return;
            }
            Object x = this.f393011w.mo120977o().mo121291x(str3, obj2);
            if (x != null) {
                mo121107u(str4, str2, j, x);
            }
        } else {
            mo121107u(str4, str2, j, (Object) null);
        }
    }
}
