package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.personalresults;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0813f;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.baseclasses.C47212h;
import com.google.apps.tiktok.inject.p3659d.C47237f;
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
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68314a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.PersonalResultsNotificationActivity */
/* compiled from: PG */
public final class PersonalResultsNotificationActivity extends C124997b implements C47231d, C47211g {

    /* renamed from: k */
    private C125002g f344866k;

    /* renamed from: l */
    private final C47851k f344867l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f344868m;

    /* renamed from: n */
    private Context f344869n;

    /* renamed from: o */
    private C2393x f344870o;

    /* renamed from: p */
    private boolean f344871p;

    public PersonalResultsNotificationActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m204896x() {
        if (this.f344866k != null) {
            return;
        }
        if (!this.f344868m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f344871p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo106771v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f344866k = ((C125003h) mo106771v().mo17653jN()).mo106773ad();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C124998c.m204927a(th, th);
                }
            } catch (Throwable th2) {
                C124998c.m204927a(th, th2);
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
            baseContext = this.f344869n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f344869n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f344869n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f344870o == null) {
            this.f344870o = new C47212h(this);
        }
        return this.f344870o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f344867l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f344867l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f344867l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f344867l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f344867l.mo51692s();
        try {
            this.f344868m = true;
            m204896x();
            ((C47212h) getLifecycle()).mo51120i(this.f344867l);
            ((C47237f) mo106771v().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m204896x();
            C125002g gVar = this.f344866k;
            C58976aa aaVar = C58975e.f156826a;
            gVar.f344908b.setTheme(2132150211);
            Bundle extras = gVar.f344908b.getIntent().getExtras();
            if (extras == null) {
                C59104x c = C125002g.f344907a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "PRNActivity");
                ((C59052c) ((C59052c) c).mo56372aa(36408)).mo56386p("Extras is null.");
            } else {
                String string = extras.getString("extra_notification_type");
                String string2 = extras.getString("extra_action_type");
                String string3 = extras.getString("extra_model_id");
                String string4 = extras.getString("device_id");
                boolean z = extras.getBoolean("extra_is_non_bisto");
                if (string == null || string2 == null) {
                    C59104x c2 = C125002g.f344907a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "PRNActivity");
                    ((C59052c) ((C59052c) c2).mo56372aa(36404)).mo56386p("Missing key notification information.");
                } else if (z) {
                    C59104x b = C125002g.f344907a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "PRNActivity");
                    ((C59052c) ((C59052c) b).mo56372aa(36407)).mo56354G("Action: %s, Notification type: %s for non-Bisto", string2, string);
                    if (string2.equals("action_affirmative") && string.equals("pr_notification")) {
                        PersonalResultsNotificationActivity personalResultsNotificationActivity = gVar.f344908b;
                        C125002g.m204932b(personalResultsNotificationActivity.mo3336s(new C0813f(), personalResultsNotificationActivity.f2708i, C125000e.f344903a), 4);
                    } else if (string2.equals("action_content_click")) {
                        gVar.mo106772a();
                    }
                    gVar.f344908b.finish();
                    ((NotificationManager) gVar.f344908b.getSystemService("notification")).cancel(1);
                } else if (string3 == null) {
                    C59104x c3 = C125002g.f344907a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "PRNActivity");
                    ((C59052c) ((C59052c) c3).mo56372aa(36406)).mo56386p("Missing modelId.");
                } else {
                    C59104x b2 = C125002g.f344907a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "PRNActivity");
                    ((C59052c) ((C59052c) b2).mo56372aa(36405)).mo56354G("Action: %s, Notification type: %s", string2, string);
                    if (string2.equals("action_affirmative") && string.equals("pr_notification")) {
                        PersonalResultsNotificationActivity personalResultsNotificationActivity2 = gVar.f344908b;
                        C0816c s2 = personalResultsNotificationActivity2.mo3336s(new C0813f(), personalResultsNotificationActivity2.f2708i, C124999d.f344902a);
                        if (!gVar.f344908b.getIntent().getBooleanExtra("tng_pr_notification_handling", false) || string4 == null) {
                            C125002g.m204932b(s2, 8);
                        } else {
                            gVar.f344911e.mo37971b(gVar.f344908b, new C125001f(gVar, string4, s2), gVar.f344910d);
                            ((NotificationManager) gVar.f344908b.getSystemService("notification")).cancel(1);
                            ((C39141kp) gVar.f344909c.mo27525b()).mo41700o(string3, string, string2);
                        }
                    } else if (string2.equals("action_content_click")) {
                        gVar.mo106772a();
                    }
                    gVar.f344908b.finish();
                    ((NotificationManager) gVar.f344908b.getSystemService("notification")).cancel(1);
                    ((C39141kp) gVar.f344909c.mo27525b()).mo41700o(string3, string, string2);
                }
            }
            this.f344868m = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f344867l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f344867l.mo51675b();
        try {
            super.onDestroy();
            this.f344871p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f344867l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f344867l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f344867l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f344867l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f344867l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f344867l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
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
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f344867l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f344867l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f344867l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f344867l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f344867l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f344867l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124998c.m204927a(th, th);
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
    public final /* synthetic */ C68314a mo106762w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C125002g gVar = this.f344866k;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f344871p) {
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
