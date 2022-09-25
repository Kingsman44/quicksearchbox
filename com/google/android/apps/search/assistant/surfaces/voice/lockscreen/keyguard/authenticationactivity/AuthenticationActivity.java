package com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.authenticationactivity;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9694b.C128258a;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9695c.C128260b;
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
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class AuthenticationActivity extends C128254f implements C47231d, C47211g {

    /* renamed from: l */
    private C128250b f352766l;

    /* renamed from: m */
    private final C47851k f352767m = new C47851k(this, this);

    /* renamed from: n */
    private boolean f352768n;

    /* renamed from: o */
    private Context f352769o;

    /* renamed from: p */
    private C2393x f352770p;

    /* renamed from: q */
    private boolean f352771q;

    public AuthenticationActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: l */
    private final void m209334l() {
        if (this.f352766l != null) {
            return;
        }
        if (!this.f352768n) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f352771q || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo22340k().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f352766l = ((C128251c) mo22340k().mo17653jN()).mo108388as();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C128249a.m209337a(th, th);
                }
            } catch (Throwable th2) {
                C128249a.m209337a(th, th2);
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
            baseContext = this.f352769o;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f352769o = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f352769o = null;
    }

    public final C2384o getLifecycle() {
        if (this.f352770p == null) {
            this.f352770p = new C47212h(this);
        }
        return this.f352770p;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.invalidateOptionsMenu();
            w.close();
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final /* synthetic */ C68314a mo22285j() {
        return new C47241j(this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f352767m.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f352767m.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f352767m.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f352767m.mo51692s();
        try {
            this.f352768n = true;
            m209334l();
            ((C47212h) getLifecycle()).mo51120i(this.f352767m);
            ((C47237f) mo22340k().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m209334l();
            this.f352766l.f352773b.getWindow().addFlags(524288);
            this.f352768n = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f352767m.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f352767m.mo51675b();
        try {
            super.onDestroy();
            this.f352771q = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C47573bx u = this.f352767m.mo51694u();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            if (u != null) {
                u.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f352767m.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f352767m.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f352767m.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f352767m.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f352767m.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f352767m.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
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
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f352767m.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f352767m.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f352767m.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f352767m.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f352767m.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f352767m.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128249a.m209337a(th, th);
        }
        throw th;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m209334l();
        C128250b bVar = this.f352766l;
        ((C59052c) ((C59052c) C128250b.f352772a.mo56224b()).mo56372aa(37810)).mo56389s("AuthenticationActivity#onWindowFocusChanged, hasFocus: %b", Boolean.valueOf(z));
        if (z) {
            if (bVar.f352775d > 0) {
                ((C59052c) ((C59052c) C128250b.f352772a.mo56224b()).mo56372aa(37814)).mo56387q("AuthenticationActivity#onWindowFocusChanged, AuthenticationActivity has gained window focus for %d times, only request to dismiss keyguard at the first time.", bVar.f352775d);
                return;
            }
            bVar.f352775d = 1;
            Bundle extras = bVar.f352773b.getIntent().getExtras();
            if (extras == null) {
                ((C59052c) ((C59052c) C128250b.f352772a.mo56226d()).mo56372aa(37813)).mo56386p("AuthenticationActivity#onWindowFocusChanged: No extras in intent");
                bVar.f352773b.finish();
                return;
            }
            int i = extras.getInt("keyguard_request_code", -1);
            if (i == -1) {
                ((C59052c) ((C59052c) C128250b.f352772a.mo56226d()).mo56372aa(37812)).mo56386p("AuthenticationActivity#onWindowFocusChanged: No requestCode in intent");
                bVar.f352773b.finish();
                return;
            }
            ((C59052c) ((C59052c) C128250b.f352772a.mo56224b()).mo56372aa(37811)).mo56387q("AuthenticationActivity#onWindowFocusChanged, got the global focus for the first time, handover to keyguard starter with request requestCode: %d", i);
            C128256h hVar = bVar.f352774c;
            AuthenticationActivity authenticationActivity = bVar.f352773b;
            int i2 = authenticationActivity.getWindow().getAttributes().flags;
            C128260b bVar2 = (C128260b) hVar.f352786c.f352797b.get(Integer.valueOf(i));
            if (bVar2 == null) {
                ((C59052c) ((C59052c) C128256h.f352784a.mo56226d()).mo56372aa(37822)).mo56387q("#onCreate: No requestCallback was mapped to given requestCode: %d", i);
                authenticationActivity.finish();
                return;
            }
            KeyguardManager keyguardManager = (KeyguardManager) hVar.f352785b.getSystemService("keyguard");
            if (keyguardManager == null) {
                ((C59052c) ((C59052c) C128256h.f352784a.mo56226d()).mo56372aa(37821)).mo56386p("#handover: KeyguardManager is null");
                bVar2.f352795a.mo5437b(C128258a.ERROR);
                hVar.f352786c.mo108394a(i);
                authenticationActivity.finish();
            } else if (!keyguardManager.isKeyguardLocked()) {
                ((C59052c) ((C59052c) C128256h.f352784a.mo56226d()).mo56372aa(37819)).mo56386p("#handover: Keyguard has already been unlocked.");
                bVar2.f352795a.mo5437b(C128258a.SUCCEEDED);
                hVar.f352786c.mo108394a(i);
                authenticationActivity.finish();
            } else {
                keyguardManager.requestDismissKeyguard(authenticationActivity, new C128255g(hVar, bVar2, i, authenticationActivity));
            }
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C128250b bVar = this.f352766l;
        if (bVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f352771q) {
            return bVar;
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
