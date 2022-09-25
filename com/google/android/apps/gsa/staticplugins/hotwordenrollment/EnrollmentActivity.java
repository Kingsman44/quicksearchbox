package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0401v;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7970b.C101501b;
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
import com.google.common.base.C58894dd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class EnrollmentActivity extends C102240w implements C47231d, C47211g {

    /* renamed from: k */
    private C101859h f283224k;

    /* renamed from: l */
    private final C47851k f283225l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f283226m;

    /* renamed from: n */
    private Context f283227n;

    /* renamed from: o */
    private C2393x f283228o;

    /* renamed from: p */
    private boolean f283229p;

    public EnrollmentActivity() {
        SystemClock.elapsedRealtime();
        this.f2705f.mo3343a(new C101802f(this));
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f283227n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f283227n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f283227n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f283228o == null) {
            this.f283228o = new C47212h(this);
        }
        return this.f283228o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.invalidateOptionsMenu();
            w.close();
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final /* synthetic */ C68314a mo92310j() {
        return new C47241j(this);
    }

    /* renamed from: k */
    public final void mo92311k() {
        if (this.f283224k != null) {
            return;
        }
        if (!this.f283226m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f283229p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo93037l().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f283224k = ((C101863i) mo93037l().mo17653jN()).mo92642Q();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C101799e.m168444a(th, th);
                }
            } catch (Throwable th2) {
                C101799e.m168444a(th, th2);
            }
        } else {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        throw th;
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f283225l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f283225l.mo51674a();
        try {
            this.f2707h.mo3340c();
            mo92311k();
            C101859h hVar = this.f283224k;
            C58976aa aaVar = C58975e.f156826a;
            synchronized (hVar.f284126b) {
                C101892n a2 = hVar.mo92635a();
                if (a2 != null) {
                    C101894p a3 = a2.mo17754z();
                    Fragment a4 = a3.mo92676a();
                    if (a4 == null) {
                        C59104x b = C101894p.f284210a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "EnrollmentRootFragm");
                        ((C59052c) ((C59052c) b).mo56372aa(20238)).mo56386p("Flow controller fragment hasn't installed yet. Exit");
                        a3.f284216g.mo92569b(0, (Intent) null);
                    } else {
                        C59104x b2 = C101894p.f284210a.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "EnrollmentRootFragm");
                        ((C59052c) ((C59052c) b2).mo56372aa(20236)).mo56389s("FlowControllerFragment: %s ", a4);
                        if (a4 instanceof C101501b) {
                            ((C101501b) a4).mo92348a();
                        } else {
                            C59104x c = C101894p.f284210a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "EnrollmentRootFragm");
                            ((C59052c) ((C59052c) c).mo56372aa(20237)).mo56389s("Each fragment/screen has to implement this to log the exit events, etc, current Fragment %s ", a4);
                            throw new C58894dd("Each fragment/screen has to implement this to log the exit events, etc");
                        }
                    }
                } else {
                    C59104x c2 = C101859h.f284125a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "EnrollmentActvt");
                    ((C59052c) ((C59052c) c2).mo56372aa(20224)).mo56386p("Enrollment root fragment is null!");
                }
            }
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                C101799e.m168444a(th, th2);
            }
            throw th;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f283225l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x012e A[Catch:{ all -> 0x015b, all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "EnrollmentActvt"
            com.google.apps.tiktok.tracing.k r1 = r6.f283225l
            com.google.apps.tiktok.tracing.bx r1 = r1.mo51692s()
            r2 = 1
            r6.f283226m = r2     // Catch:{ all -> 0x015b }
            androidx.lifecycle.o r3 = r6.getLifecycle()     // Catch:{ all -> 0x015b }
            com.google.apps.tiktok.tracing.k r4 = r6.f283225l     // Catch:{ all -> 0x015b }
            com.google.apps.tiktok.inject.baseclasses.h r3 = (com.google.apps.tiktok.inject.baseclasses.C47212h) r3     // Catch:{ all -> 0x015b }
            r3.mo51120i(r4)     // Catch:{ all -> 0x015b }
            super.onCreate(r7)     // Catch:{ all -> 0x015b }
            r6.mo92311k()     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h r7 = r6.f283224k     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.e.f r3 = com.google.android.apps.gsa.e.f.Z     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.p5846e.C74504a.m120462a(r3)     // Catch:{ all -> 0x015b }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015b }
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101859h.f284125a     // Catch:{ all -> 0x015b }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x015b }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015b }
            r3.mo56378ag(r4, r0)     // Catch:{ all -> 0x015b }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x015b }
            r4 = 20225(0x4f01, float:2.8341E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x015b }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x015b }
            java.lang.String r4 = "onCreate: enrollmentIntent = %s"
            com.google.android.apps.gsa.h.s.u r5 = r7.f284128d     // Catch:{ all -> 0x015b }
            r3.mo56389s(r4, r5)     // Catch:{ all -> 0x015b }
            android.support.p033v7.app.C0401v.m1321C()     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.EnrollmentActivity r3 = r7.f284126b     // Catch:{ all -> 0x015b }
            java.lang.Integer r4 = r7.f284132h     // Catch:{ all -> 0x015b }
            int r4 = r4.intValue()     // Catch:{ all -> 0x015b }
            r3.setTheme(r4)     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.h.s.u r3 = r7.f284128d     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.h.s.ab r3 = r3.mo70886d()     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.h.s.ac r3 = r3.mo70847a()     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.h.s.ac r4 = com.google.android.apps.gsa.h.s.ac.c     // Catch:{ all -> 0x015b }
            if (r3 != r4) goto L_0x007a
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.EnrollmentActivity r2 = r7.f284126b     // Catch:{ all -> 0x015b }
            boolean r2 = com.google.android.setupdesign.p3558f.C45315i.m80770e(r2)     // Catch:{ all -> 0x015b }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x015b }
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101859h.f284125a     // Catch:{ all -> 0x015b }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x015b }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015b }
            r3.mo56378ag(r4, r0)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "set dynamic color %b"
            r4 = 20228(0x4f04, float:2.8345E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r4)).mo56389s(r0, r2)     // Catch:{ all -> 0x015b }
            goto L_0x0095
        L_0x007a:
            com.google.common.base.ax r0 = r7.f284133i     // Catch:{ all -> 0x015b }
            boolean r3 = r0.mo56113h()     // Catch:{ all -> 0x015b }
            if (r3 == 0) goto L_0x0095
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.EnrollmentActivity r3 = r7.f284126b     // Catch:{ all -> 0x015b }
            android.content.res.Resources$Theme r3 = r3.getTheme()     // Catch:{ all -> 0x015b }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x015b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x015b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x015b }
            r3.applyStyle(r0, r2)     // Catch:{ all -> 0x015b }
        L_0x0095:
            com.google.android.apps.gsa.h.s.u r0 = r7.f284128d     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.h.s.ab r0 = r0.mo70886d()     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.h.s.ac r0 = r0.mo70847a()     // Catch:{ all -> 0x015b }
            int r0 = r0.d()     // Catch:{ all -> 0x015b }
            r2 = 2
            if (r0 != r2) goto L_0x00be
            com.google.android.apps.gsa.h.s.u r0 = r7.f284128d     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.h.s.ae r0 = r0.mo70887e()     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.h.s.ah r0 = r0.mo70855c()     // Catch:{ all -> 0x015b }
            r0.mo70859a()     // Catch:{ all -> 0x015b }
            java.lang.Integer r0 = r7.f284132h     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.EnrollmentActivity r0 = r7.f284126b     // Catch:{ all -> 0x015b }
            r2 = 2131625524(0x7f0e0634, float:1.8878258E38)
            r0.setContentView((int) r2)     // Catch:{ all -> 0x015b }
            goto L_0x00d5
        L_0x00be:
            com.google.android.apps.gsa.h.s.u r0 = r7.f284128d     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.h.s.ae r0 = r0.mo70887e()     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.h.s.ah r0 = r0.mo70855c()     // Catch:{ all -> 0x015b }
            r0.mo70859a()     // Catch:{ all -> 0x015b }
            java.lang.Integer r0 = r7.f284132h     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.EnrollmentActivity r0 = r7.f284126b     // Catch:{ all -> 0x015b }
            r2 = 2131625523(0x7f0e0633, float:1.8878256E38)
            r0.setContentView((int) r2)     // Catch:{ all -> 0x015b }
        L_0x00d5:
            com.google.android.apps.gsa.shared.m.c r0 = r7.f284130f     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249922al     // Catch:{ all -> 0x015b }
            boolean r0 = r0.mo79746e(r2)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x00e6
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.EnrollmentActivity r0 = r7.f284126b     // Catch:{ all -> 0x015b }
            r2 = 14
            com.google.android.apps.gsa.shared.util.C90779c.m148334a(r0, r2)     // Catch:{ all -> 0x015b }
        L_0x00e6:
            android.content.SharedPreferences r0 = r7.f284127c     // Catch:{ all -> 0x015b }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x015b }
            java.lang.String r2 = "hotword_enrollment_account"
            java.lang.String r3 = r7.f284131g     // Catch:{ all -> 0x015b }
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)     // Catch:{ all -> 0x015b }
            r0.apply()     // Catch:{ all -> 0x015b }
            java.lang.String r0 = r7.f284131g     // Catch:{ all -> 0x015b }
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x015b }
            if (r2 != 0) goto L_0x010d
            java.lang.String r2 = "@"
            boolean r2 = r0.contains(r2)     // Catch:{ all -> 0x015b }
            if (r2 != 0) goto L_0x0108
            goto L_0x010d
        L_0x0108:
            com.google.android.libraries.logging.ve.g r0 = com.google.android.libraries.logging.p2185ve.p2186a.C28297a.m52922b(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0111
        L_0x010d:
            com.google.android.libraries.logging.ve.g r0 = com.google.android.libraries.logging.p2185ve.p2186a.C28297a.m52921a()     // Catch:{ all -> 0x015b }
        L_0x0111:
            com.google.android.libraries.logging.ve.af r2 = r7.f284129e     // Catch:{ all -> 0x015b }
            com.google.android.libraries.logging.ve.ab r2 = r2.f76997b     // Catch:{ all -> 0x015b }
            r3 = 111467(0x1b36b, float:1.56199E-40)
            com.google.android.libraries.logging.ve.h r3 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r3)     // Catch:{ all -> 0x015b }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33800a(r3)     // Catch:{ all -> 0x015b }
            r2.mo33859g(r0)     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.EnrollmentActivity r0 = r7.f284126b     // Catch:{ all -> 0x015b }
            r2.mo33810c(r0)     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.n r0 = r7.mo92635a()     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x014e
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.EnrollmentActivity r7 = r7.f284126b     // Catch:{ all -> 0x015b }
            android.support.v4.app.ar r7 = r7.f727a     // Catch:{ all -> 0x015b }
            android.support.v4.app.at r7 = r7.f739a     // Catch:{ all -> 0x015b }
            android.support.v4.app.FragmentManager r7 = r7.f744e     // Catch:{ all -> 0x015b }
            android.support.v4.app.a r0 = new android.support.v4.app.a     // Catch:{ all -> 0x015b }
            r0.<init>((android.support.p031v4.app.FragmentManager) r7)     // Catch:{ all -> 0x015b }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.n r7 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.n     // Catch:{ all -> 0x015b }
            r7.<init>()     // Catch:{ all -> 0x015b }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r7)     // Catch:{ all -> 0x015b }
            java.lang.String r2 = "EnrollmentRootFragment"
            r3 = 2131435402(0x7f0b1f8a, float:1.8492645E38)
            r0.mo689v(r3, r7, r2)     // Catch:{ all -> 0x015b }
            r0.mo509f()     // Catch:{ all -> 0x015b }
        L_0x014e:
            r7 = 0
            r6.f283226m = r7     // Catch:{ all -> 0x015b }
            if (r1 == 0) goto L_0x015a
            com.google.apps.tiktok.tracing.f r1 = (com.google.apps.tiktok.tracing.C47818f) r1
            com.google.apps.tiktok.tracing.k r7 = r1.f123842a
            r7.mo51690q()
        L_0x015a:
            return
        L_0x015b:
            r7 = move-exception
            if (r1 == 0) goto L_0x016a
            com.google.apps.tiktok.tracing.f r1 = (com.google.apps.tiktok.tracing.C47818f) r1     // Catch:{ all -> 0x0166 }
            com.google.apps.tiktok.tracing.k r0 = r1.f123842a     // Catch:{ all -> 0x0166 }
            r0.mo51690q()     // Catch:{ all -> 0x0166 }
            goto L_0x016a
        L_0x0166:
            r0 = move-exception
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101799e.m168444a(r7, r0)
        L_0x016a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.EnrollmentActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f283225l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f283225l.mo51675b();
        try {
            super.onDestroy();
            this.f283229p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C47573bx u = this.f283225l.mo51694u();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            if (u != null) {
                u.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f283225l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f283225l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f283225l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f283225l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f283225l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f283225l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
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
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f283225l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f283225l.mo51679f();
        try {
            super.onResume();
            mo92311k();
            C0401v.m1321C();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f283225l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f283225l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f283225l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f283225l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101799e.m168444a(th, th);
        }
        throw th;
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C101859h hVar = this.f283224k;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283229p) {
            return hVar;
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
