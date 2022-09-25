package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.baseclasses.C47212h;
import com.google.apps.tiktok.inject.p3659d.C47241j;
import com.google.apps.tiktok.p3674l.p3680d.C47401a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47762d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47818f;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.C47849i;
import com.google.apps.tiktok.tracing.C47851k;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class ConfigurationActivity extends C132652o implements C47231d, C47211g {

    /* renamed from: k */
    private C132643g f361793k;

    /* renamed from: l */
    private final C47851k f361794l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f361795m;

    /* renamed from: n */
    private Context f361796n;

    /* renamed from: o */
    private C2393x f361797o;

    /* renamed from: p */
    private boolean f361798p;

    public ConfigurationActivity() {
        SystemClock.elapsedRealtime();
        this.f2705f.mo3343a(new C132615c(this));
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f361796n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f361796n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f361796n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f361797o == null) {
            this.f361797o = new C47212h(this);
        }
        return this.f361797o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f361794l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f361794l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f361794l.mo51674a();
        try {
            this.f2707h.mo3340c();
            a.close();
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f361794l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "WeatherWidgetConfigurationActivity"
            com.google.apps.tiktok.tracing.k r2 = r1.f361794l
            com.google.apps.tiktok.tracing.bx r2 = r2.mo51692s()
            r3 = 1
            r1.f361795m = r3     // Catch:{ all -> 0x01e2 }
            androidx.lifecycle.o r4 = r16.getLifecycle()     // Catch:{ all -> 0x01e2 }
            com.google.apps.tiktok.tracing.k r5 = r1.f361794l     // Catch:{ all -> 0x01e2 }
            com.google.apps.tiktok.inject.baseclasses.h r4 = (com.google.apps.tiktok.inject.baseclasses.C47212h) r4     // Catch:{ all -> 0x01e2 }
            r4.mo51120i(r5)     // Catch:{ all -> 0x01e2 }
            super.onCreate(r17)     // Catch:{ all -> 0x01e2 }
            r16.mo110820w()     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.g r4 = r1.f361793k     // Catch:{ all -> 0x01e2 }
            com.google.common.f.e r5 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132643g.f361980a     // Catch:{ all -> 0x01e2 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x01e2 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e2 }
            r5.mo56378ag(r6, r0)     // Catch:{ all -> 0x01e2 }
            java.lang.String r6 = "#onCreate()"
            r7 = 39691(0x9b0b, float:5.5619E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)     // Catch:{ all -> 0x01e2 }
            int r5 = r4.mo110849a()     // Catch:{ all -> 0x01e2 }
            if (r5 != 0) goto L_0x0050
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132643g.f361980a     // Catch:{ all -> 0x01e2 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x01e2 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e2 }
            r3.mo56378ag(r5, r0)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = "INVALID_APPWIDGET_ID"
            r5 = 39692(0x9b0c, float:5.562E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r0)     // Catch:{ all -> 0x01e2 }
            r4.mo110851c()     // Catch:{ all -> 0x01e2 }
            goto L_0x0060
        L_0x0050:
            r0 = -1
            r4.mo110853e(r0)     // Catch:{ all -> 0x01e2 }
            boolean r5 = r4.mo110855g()     // Catch:{ all -> 0x01e2 }
            if (r5 != 0) goto L_0x0063
            r4.mo110854f()     // Catch:{ all -> 0x01e2 }
        L_0x005d:
            r4.mo110852d()     // Catch:{ all -> 0x01e2 }
        L_0x0060:
            r0 = 0
            goto L_0x01d6
        L_0x0063:
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity r5 = r4.f361981b     // Catch:{ all -> 0x01e2 }
            androidx.activity.result.a.f r7 = new androidx.activity.result.a.f     // Catch:{ all -> 0x01e2 }
            r7.<init>()     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.d r8 = new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.d     // Catch:{ all -> 0x01e2 }
            r8.<init>(r4)     // Catch:{ all -> 0x01e2 }
            androidx.activity.result.ActivityResultRegistry r9 = r5.f2708i     // Catch:{ all -> 0x01e2 }
            androidx.activity.result.c r5 = r5.mo3336s(r7, r9, r8)     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity r7 = r4.f361981b     // Catch:{ all -> 0x01e2 }
            java.lang.String r8 = "location"
            java.lang.Object r7 = r7.getSystemService(r8)     // Catch:{ all -> 0x01e2 }
            android.location.LocationManager r7 = (android.location.LocationManager) r7     // Catch:{ all -> 0x01e2 }
            java.lang.String r8 = r4.mo110850b()     // Catch:{ all -> 0x01e2 }
            if (r8 == 0) goto L_0x01d1
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.b.b r9 = r4.f361983d     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity r10 = r4.f361981b     // Catch:{ all -> 0x01e2 }
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity r11 = r4.f361981b     // Catch:{ all -> 0x01e2 }
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ all -> 0x01e2 }
            int r12 = r4.mo110849a()     // Catch:{ all -> 0x01e2 }
            com.google.assistant.s.a.hf r11 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132582aa.m215547a(r11, r12)     // Catch:{ all -> 0x01e2 }
            int r12 = r8.hashCode()     // Catch:{ all -> 0x01e2 }
            java.lang.String r13 = "ERROR_INTERNET"
            java.lang.String r14 = "ERROR_AADC_OFF"
            java.lang.String r15 = "ERROR_LOCATION_OFF"
            java.lang.String r0 = "ERROR_LOCATION_PERMISSION"
            r6 = 2
            switch(r12) {
                case -829659198: goto L_0x00d8;
                case 2524: goto L_0x00ce;
                case 212153758: goto L_0x00c4;
                case 797767356: goto L_0x00bc;
                case 1001160230: goto L_0x00b4;
                case 1170912184: goto L_0x00ac;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            goto L_0x00e0
        L_0x00ac:
            boolean r12 = r8.equals(r13)
            if (r12 == 0) goto L_0x00e0
            r12 = 4
            goto L_0x00e1
        L_0x00b4:
            boolean r12 = r8.equals(r14)
            if (r12 == 0) goto L_0x00e0
            r12 = 2
            goto L_0x00e1
        L_0x00bc:
            boolean r12 = r8.equals(r15)
            if (r12 == 0) goto L_0x00e0
            r12 = 3
            goto L_0x00e1
        L_0x00c4:
            java.lang.String r12 = "ERROR_SOMETHING_WENT_WRONG"
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 5
            goto L_0x00e1
        L_0x00ce:
            java.lang.String r12 = "OK"
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 0
            goto L_0x00e1
        L_0x00d8:
            boolean r12 = r8.equals(r0)
            if (r12 == 0) goto L_0x00e0
            r12 = 1
            goto L_0x00e1
        L_0x00e0:
            r12 = -1
        L_0x00e1:
            if (r12 == 0) goto L_0x00ff
            if (r12 == r3) goto L_0x00fe
            if (r12 == r6) goto L_0x00fc
            r3 = 3
            if (r12 == r3) goto L_0x00fa
            r3 = 4
            if (r12 == r3) goto L_0x00f8
            r3 = 5
            if (r12 != r3) goto L_0x00f2
            r3 = 6
            goto L_0x00ff
        L_0x00f2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01e2 }
            r0.<init>()     // Catch:{ all -> 0x01e2 }
            throw r0     // Catch:{ all -> 0x01e2 }
        L_0x00f8:
            r3 = 5
            goto L_0x00ff
        L_0x00fa:
            r3 = 4
            goto L_0x00ff
        L_0x00fc:
            r3 = 3
            goto L_0x00ff
        L_0x00fe:
            r3 = 2
        L_0x00ff:
            r9.mo110836c(r10, r11, r3)     // Catch:{ all -> 0x01e2 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x0161
            boolean r0 = r4.mo110856h()     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x0161
            com.google.android.material.c.b r0 = new com.google.android.material.c.b     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity r3 = r4.f361981b     // Catch:{ all -> 0x01e2 }
            r6 = 2132149389(0x7f16048d, float:1.9940783E38)
            r0.<init>(r3, r6)     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity r3 = r4.f361981b     // Catch:{ all -> 0x01e2 }
            r6 = 2132085183(0x7f1509bf, float:1.9810558E38)
            java.lang.String r3 = r3.getString(r6)     // Catch:{ all -> 0x01e2 }
            r0.mo47605x(r3)     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity r3 = r4.f361981b     // Catch:{ all -> 0x01e2 }
            r6 = 2132085182(0x7f1509be, float:1.9810556E38)
            java.lang.String r3 = r3.getString(r6)     // Catch:{ all -> 0x01e2 }
            android.support.v7.app.i r6 = r0.f1347a     // Catch:{ all -> 0x01e2 }
            r6.f1326g = r3     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity r3 = r4.f361981b     // Catch:{ all -> 0x01e2 }
            r6 = 2132085180(0x7f1509bc, float:1.9810552E38)
            java.lang.String r3 = r3.getString(r6)     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.f r6 = new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.f     // Catch:{ all -> 0x01e2 }
            r6.<init>(r4, r5)     // Catch:{ all -> 0x01e2 }
            r0.mo47602u(r3, r6)     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity r3 = r4.f361981b     // Catch:{ all -> 0x01e2 }
            r5 = 2132085181(0x7f1509bd, float:1.9810554E38)
            java.lang.String r3 = r3.getString(r5)     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e r5 = new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e     // Catch:{ all -> 0x01e2 }
            r5.<init>(r4)     // Catch:{ all -> 0x01e2 }
            r0.mo47599r(r3, r5)     // Catch:{ all -> 0x01e2 }
            android.support.v7.app.i r3 = r0.f1347a     // Catch:{ all -> 0x01e2 }
            r4 = 0
            r3.f1333n = r4     // Catch:{ all -> 0x01e2 }
            android.support.v7.app.m r0 = r0.create()     // Catch:{ all -> 0x01e2 }
            r0.show()     // Catch:{ all -> 0x01e2 }
            goto L_0x0060
        L_0x0161:
            boolean r0 = r8.equals(r15)     // Catch:{ all -> 0x01e2 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r6 = 8388608(0x800000, float:1.17549435E-38)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x018a
            java.lang.String r0 = "gps"
            boolean r0 = r7.isProviderEnabled(r0)     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x018a
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x01e2 }
            java.lang.String r4 = "android.settings.LOCATION_SOURCE_SETTINGS"
            r0.<init>(r4)     // Catch:{ all -> 0x01e2 }
            r0.addFlags(r9)     // Catch:{ all -> 0x01e2 }
            r0.addFlags(r6)     // Catch:{ all -> 0x01e2 }
            r0.addFlags(r3)     // Catch:{ all -> 0x01e2 }
            r5.mo526b(r0)     // Catch:{ all -> 0x01e2 }
            goto L_0x0060
        L_0x018a:
            boolean r0 = r8.equals(r13)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01ad
            android.net.ConnectivityManager r0 = r4.f361984e     // Catch:{ all -> 0x01e2 }
            boolean r0 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132582aa.m215548b(r0)     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x01ad
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x01e2 }
            java.lang.String r4 = "android.settings.WIRELESS_SETTINGS"
            r0.<init>(r4)     // Catch:{ all -> 0x01e2 }
            r0.addFlags(r9)     // Catch:{ all -> 0x01e2 }
            r0.addFlags(r6)     // Catch:{ all -> 0x01e2 }
            r0.addFlags(r3)     // Catch:{ all -> 0x01e2 }
            r5.mo526b(r0)     // Catch:{ all -> 0x01e2 }
            goto L_0x0060
        L_0x01ad:
            boolean r0 = r8.equals(r14)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01d1
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.v r0 = r4.f361982c     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity r3 = r4.f361981b     // Catch:{ all -> 0x01e2 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.platform.a.b r5 = r0.f362014b     // Catch:{ all -> 0x01e2 }
            java.lang.Class<com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.v$a> r6 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132659v.C132660a.class
            com.google.common.util.concurrent.cx r5 = r5.mo104411a(r6)     // Catch:{ all -> 0x01e2 }
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.u r6 = new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.u     // Catch:{ all -> 0x01e2 }
            r6.<init>(r0, r3)     // Catch:{ all -> 0x01e2 }
            com.google.common.util.concurrent.da r0 = r0.f362013a     // Catch:{ all -> 0x01e2 }
            com.google.common.base.ah r3 = com.google.apps.tiktok.tracing.C47810es.m84963c(r6)     // Catch:{ all -> 0x01e2 }
            com.google.common.util.concurrent.C60922j.m93044g(r5, r3, r0)     // Catch:{ all -> 0x01e2 }
        L_0x01d1:
            r4.mo110854f()     // Catch:{ all -> 0x01e2 }
            goto L_0x005d
        L_0x01d6:
            r1.f361795m = r0     // Catch:{ all -> 0x01e2 }
            if (r2 == 0) goto L_0x01e1
            com.google.apps.tiktok.tracing.f r2 = (com.google.apps.tiktok.tracing.C47818f) r2
            com.google.apps.tiktok.tracing.k r0 = r2.f123842a
            r0.mo51690q()
        L_0x01e1:
            return
        L_0x01e2:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L_0x01f2
            com.google.apps.tiktok.tracing.f r2 = (com.google.apps.tiktok.tracing.C47818f) r2     // Catch:{ all -> 0x01ee }
            com.google.apps.tiktok.tracing.k r0 = r2.f123842a     // Catch:{ all -> 0x01ee }
            r0.mo51690q()     // Catch:{ all -> 0x01ee }
            goto L_0x01f2
        L_0x01ee:
            r0 = move-exception
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132608b.m215585a(r3, r0)
        L_0x01f2:
            goto L_0x01f4
        L_0x01f3:
            throw r3
        L_0x01f4:
            goto L_0x01f3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f361794l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f361794l.mo51675b();
        try {
            super.onDestroy();
            this.f361798p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f361794l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f361794l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f361794l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f361794l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f361794l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f361794l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        C47573bx w = C47831fm.m85028w();
        try {
            boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            w.close();
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f361794l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f361794l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f361794l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f361794l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f361794l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f361794l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132608b.m215585a(th, th);
        }
        throw th;
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: v */
    public final /* synthetic */ C68314a mo110819v() {
        return new C47241j(this);
    }

    /* renamed from: w */
    public final void mo110820w() {
        if (this.f361793k != null) {
            return;
        }
        if (!this.f361795m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f361798p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo110867x().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f361793k = ((C132644h) mo110867x().mo17653jN()).mo110857aH();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C132608b.m215585a(th, th);
                }
            } catch (Throwable th2) {
                C132608b.m215585a(th, th2);
            }
        } else {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        throw th;
        throw th;
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C132643g gVar = this.f361793k;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f361798p) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
