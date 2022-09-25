package com.google.android.apps.search.assistant.surfaces.roti.home;

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
public final class HomeActivity extends C126788az implements C47231d, C47211g {

    /* renamed from: k */
    private C126791bb f349090k;

    /* renamed from: l */
    private final C47851k f349091l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f349092m;

    /* renamed from: n */
    private Context f349093n;

    /* renamed from: o */
    private C2393x f349094o;

    /* renamed from: p */
    private boolean f349095p;

    public HomeActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m207352x() {
        if (this.f349090k != null) {
            return;
        }
        if (!this.f349092m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f349095p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo107784v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f349090k = ((C126792bc) mo107784v().mo17653jN()).mo107789ak();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C126790ba.m207418a(th, th);
                }
            } catch (Throwable th2) {
                C126790ba.m207418a(th, th2);
            }
        } else {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        throw th;
        throw th;
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f349093n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f349093n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f349093n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f349094o == null) {
            this.f349094o = new C47212h(this);
        }
        return this.f349094o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f349091l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f349091l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f349091l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f349091l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Package '"
            com.google.apps.tiktok.tracing.k r1 = r7.f349091l
            com.google.apps.tiktok.tracing.bx r1 = r1.mo51692s()
            r2 = 1
            r7.f349092m = r2     // Catch:{ all -> 0x016c }
            r7.m207352x()     // Catch:{ all -> 0x016c }
            androidx.lifecycle.o r2 = r7.getLifecycle()     // Catch:{ all -> 0x016c }
            com.google.apps.tiktok.tracing.k r3 = r7.f349091l     // Catch:{ all -> 0x016c }
            com.google.apps.tiktok.inject.baseclasses.h r2 = (com.google.apps.tiktok.inject.baseclasses.C47212h) r2     // Catch:{ all -> 0x016c }
            r2.mo51120i(r3)     // Catch:{ all -> 0x016c }
            dagger.hilt.android.internal.managers.a r2 = r7.mo107784v()     // Catch:{ all -> 0x016c }
            java.lang.Object r2 = r2.mo17653jN()     // Catch:{ all -> 0x016c }
            com.google.apps.tiktok.inject.d.f r2 = (com.google.apps.tiktok.inject.p3659d.C47237f) r2     // Catch:{ all -> 0x016c }
            com.google.apps.tiktok.e.a r2 = r2.mo51141bP()     // Catch:{ all -> 0x016c }
            r2.mo50899a()     // Catch:{ all -> 0x016c }
            super.onCreate(r8)     // Catch:{ all -> 0x016c }
            r7.m207352x()     // Catch:{ all -> 0x016c }
            com.google.android.apps.search.assistant.surfaces.roti.home.bb r8 = r7.f349090k     // Catch:{ all -> 0x016c }
            r8.mo107787e()     // Catch:{ all -> 0x016c }
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r2 = r8.f349169k     // Catch:{ all -> 0x016c }
            com.google.protobuf.ch r2 = r2.f349183e     // Catch:{ all -> 0x016c }
            int r2 = r2.size()     // Catch:{ all -> 0x016c }
            r3 = 0
            if (r2 <= 0) goto L_0x004f
            int r2 = r8.f349168j     // Catch:{ all -> 0x016c }
            r4 = -1
            if (r2 != r4) goto L_0x004f
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r2 = r8.f349169k     // Catch:{ all -> 0x016c }
            com.google.protobuf.ch r2 = r2.f349183e     // Catch:{ all -> 0x016c }
            int r2 = r2.mo58914d(r3)     // Catch:{ all -> 0x016c }
            r8.f349168j = r2     // Catch:{ all -> 0x016c }
        L_0x004f:
            boolean r2 = r8.f349162d     // Catch:{ all -> 0x016c }
            java.lang.String r4 = "HomeActivityPeer"
            if (r2 != 0) goto L_0x00db
            com.google.android.apps.search.assistant.surfaces.roti.home.HomeActivity r2 = r8.f349160b     // Catch:{ all -> 0x016c }
            java.lang.String r2 = r2.getCallingPackage()     // Catch:{ all -> 0x016c }
            if (r2 == 0) goto L_0x00ad
            com.google.common.b.gu r5 = com.google.android.apps.search.assistant.surfaces.roti.home.C126839cs.f349302a     // Catch:{ all -> 0x016c }
            boolean r5 = r5.contains(r2)     // Catch:{ all -> 0x016c }
            if (r5 != 0) goto L_0x0066
            goto L_0x00ad
        L_0x0066:
            com.google.android.gms.common.ac r5 = r8.f349161c     // Catch:{ all -> 0x016c }
            boolean r5 = r5.mo119084c(r2)     // Catch:{ all -> 0x016c }
            if (r5 != 0) goto L_0x0099
            com.google.android.libraries.search.b.b r3 = r8.f349164f     // Catch:{ all -> 0x016c }
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r4 = r8.f349169k     // Catch:{ all -> 0x016c }
            int r5 = r4.f349181c     // Catch:{ all -> 0x016c }
            com.google.protobuf.fg r4 = r4.f349185g     // Catch:{ all -> 0x016c }
            if (r4 != 0) goto L_0x007a
            com.google.protobuf.fg r4 = com.google.protobuf.C63042fg.f170152c     // Catch:{ all -> 0x016c }
        L_0x007a:
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r8 = r8.f349169k     // Catch:{ all -> 0x016c }
            java.lang.String r8 = r8.f349182d     // Catch:{ all -> 0x016c }
            r6 = 7
            com.google.android.apps.search.assistant.surfaces.roti.home.C126838cr.m207505d(r3, r5, r6, r4, r8)     // Catch:{ all -> 0x016c }
            java.lang.SecurityException r8 = new java.lang.SecurityException     // Catch:{ all -> 0x016c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            r3.<init>(r0)     // Catch:{ all -> 0x016c }
            r3.append(r2)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "' is not google signed"
            r3.append(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x016c }
            r8.<init>(r0)     // Catch:{ all -> 0x016c }
            throw r8     // Catch:{ all -> 0x016c }
        L_0x0099:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.roti.home.C126791bb.f349159a     // Catch:{ all -> 0x016c }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x016c }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x016c }
            r0.mo56378ag(r5, r4)     // Catch:{ all -> 0x016c }
            java.lang.String r5 = "Valid package '%s' intenting into Roti"
            r6 = 37173(0x9135, float:5.209E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56389s(r5, r2)     // Catch:{ all -> 0x016c }
            goto L_0x00ee
        L_0x00ad:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.roti.home.C126791bb.f349159a     // Catch:{ all -> 0x016c }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x016c }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x016c }
            r0.mo56378ag(r5, r4)     // Catch:{ all -> 0x016c }
            java.lang.String r4 = "Unauthorized package '%s' intenting into Roti"
            r5 = 37172(0x9134, float:5.2089E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56389s(r4, r2)     // Catch:{ all -> 0x016c }
            com.google.android.libraries.search.b.b r0 = r8.f349164f     // Catch:{ all -> 0x016c }
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r4 = r8.f349169k     // Catch:{ all -> 0x016c }
            int r5 = r4.f349181c     // Catch:{ all -> 0x016c }
            com.google.protobuf.fg r4 = r4.f349185g     // Catch:{ all -> 0x016c }
            if (r4 != 0) goto L_0x00cc
            com.google.protobuf.fg r4 = com.google.protobuf.C63042fg.f170152c     // Catch:{ all -> 0x016c }
        L_0x00cc:
            java.lang.String r2 = com.google.common.base.C58837ba.m90858g(r2)     // Catch:{ all -> 0x016c }
            r6 = 6
            com.google.android.apps.search.assistant.surfaces.roti.home.C126838cr.m207505d(r0, r5, r6, r4, r2)     // Catch:{ all -> 0x016c }
            com.google.android.apps.search.assistant.surfaces.roti.home.HomeActivity r8 = r8.f349160b     // Catch:{ all -> 0x016c }
            r8.finish()     // Catch:{ all -> 0x016c }
            goto L_0x0160
        L_0x00db:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.roti.home.C126791bb.f349159a     // Catch:{ all -> 0x016c }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x016c }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x016c }
            r0.mo56378ag(r2, r4)     // Catch:{ all -> 0x016c }
            java.lang.String r2 = "Skipping package verification"
            r5 = 37170(0x9132, float:5.2086E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r2)     // Catch:{ all -> 0x016c }
        L_0x00ee:
            boolean r0 = r8.f349163e     // Catch:{ all -> 0x016c }
            if (r0 != 0) goto L_0x0129
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.roti.home.C126791bb.f349159a     // Catch:{ all -> 0x016c }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x016c }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x016c }
            r0.mo56378ag(r2, r4)     // Catch:{ all -> 0x016c }
            java.lang.String r2 = "Requested feature is not available yet. Falling back to intent-api"
            r4 = 37171(0x9133, float:5.2088E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r2)     // Catch:{ all -> 0x016c }
            com.google.android.libraries.search.b.b r0 = r8.f349164f     // Catch:{ all -> 0x016c }
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r2 = r8.f349169k     // Catch:{ all -> 0x016c }
            int r4 = r2.f349181c     // Catch:{ all -> 0x016c }
            com.google.protobuf.fg r2 = r2.f349185g     // Catch:{ all -> 0x016c }
            if (r2 != 0) goto L_0x0111
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c     // Catch:{ all -> 0x016c }
        L_0x0111:
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r5 = r8.f349169k     // Catch:{ all -> 0x016c }
            java.lang.String r5 = r5.f349182d     // Catch:{ all -> 0x016c }
            r6 = 9
            com.google.android.apps.search.assistant.surfaces.roti.home.C126838cr.m207505d(r0, r4, r6, r2, r5)     // Catch:{ all -> 0x016c }
            com.google.android.apps.search.assistant.surfaces.roti.home.HomeActivity r0 = r8.f349160b     // Catch:{ all -> 0x016c }
            android.content.Intent r0 = r0.getIntent()     // Catch:{ all -> 0x016c }
            r8.mo107788f(r0)     // Catch:{ all -> 0x016c }
            com.google.android.apps.search.assistant.surfaces.roti.home.HomeActivity r8 = r8.f349160b     // Catch:{ all -> 0x016c }
            r8.finish()     // Catch:{ all -> 0x016c }
            goto L_0x0160
        L_0x0129:
            com.google.android.libraries.phenotype.client.a.g r0 = r8.f349165g     // Catch:{ all -> 0x016c }
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r2 = r8.f349169k     // Catch:{ all -> 0x016c }
            com.google.protobuf.ch r2 = r2.f349183e     // Catch:{ all -> 0x016c }
            int[] r2 = com.google.common.p4575r.C60757n.m92752m(r2)     // Catch:{ all -> 0x016c }
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r4 = r8.f349169k     // Catch:{ all -> 0x016c }
            java.lang.String r4 = r4.f349182d     // Catch:{ all -> 0x016c }
            java.lang.String r5 = "ANDROID_GSA"
            r0.mo37290d(r2, r4, r5)     // Catch:{ all -> 0x016c }
            com.google.protos.m.a.b r0 = r8.f349167i     // Catch:{ all -> 0x016c }
            com.google.protobuf.ch r0 = r0.f178301a     // Catch:{ all -> 0x016c }
            int r2 = r8.f349168j     // Catch:{ all -> 0x016c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x016c }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x016c }
            if (r0 != 0) goto L_0x0150
            boolean r0 = r8.f349166h     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0158
        L_0x0150:
            com.google.android.apps.search.assistant.surfaces.roti.home.HomeActivity r0 = r8.f349160b     // Catch:{ all -> 0x016c }
            r2 = 2132148344(0x7f160078, float:1.9938663E38)
            r0.setTheme(r2)     // Catch:{ all -> 0x016c }
        L_0x0158:
            com.google.android.apps.search.assistant.surfaces.roti.home.HomeActivity r8 = r8.f349160b     // Catch:{ all -> 0x016c }
            r0 = 2131624347(0x7f0e019b, float:1.8875871E38)
            r8.setContentView((int) r0)     // Catch:{ all -> 0x016c }
        L_0x0160:
            r7.f349092m = r3     // Catch:{ all -> 0x016c }
            if (r1 == 0) goto L_0x016b
            com.google.apps.tiktok.tracing.f r1 = (com.google.apps.tiktok.tracing.C47818f) r1
            com.google.apps.tiktok.tracing.k r8 = r1.f123842a
            r8.mo51690q()
        L_0x016b:
            return
        L_0x016c:
            r8 = move-exception
            if (r1 == 0) goto L_0x017b
            com.google.apps.tiktok.tracing.f r1 = (com.google.apps.tiktok.tracing.C47818f) r1     // Catch:{ all -> 0x0177 }
            com.google.apps.tiktok.tracing.k r0 = r1.f123842a     // Catch:{ all -> 0x0177 }
            r0.mo51690q()     // Catch:{ all -> 0x0177 }
            goto L_0x017b
        L_0x0177:
            r0 = move-exception
            com.google.android.apps.search.assistant.surfaces.roti.home.C126790ba.m207418a(r8, r0)
        L_0x017b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.roti.home.HomeActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f349091l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f349091l.mo51675b();
        try {
            super.onDestroy();
            this.f349095p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f349091l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f349091l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f349091l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f349091l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f349091l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f349091l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
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
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f349091l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f349091l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f349091l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f349091l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f349091l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f349091l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126790ba.m207418a(th, th);
        }
        throw th;
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: w */
    public final /* synthetic */ C68314a mo107763w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C126791bb bbVar = this.f349090k;
        if (bbVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f349095p) {
            return bbVar;
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
