package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.p094f.C1888a;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupdesign.p3556e.C45304a;
import com.google.android.setupdesign.p3558f.C45315i;
import com.google.android.setupdesign.p3558f.C45316j;
import com.google.android.setupdesign.p3558f.C45317k;
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
public final class SuwActivity extends C126717d implements C47231d, C47211g {

    /* renamed from: k */
    private C126721h f348872k;

    /* renamed from: l */
    private final C47851k f348873l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f348874m;

    /* renamed from: n */
    private Context f348875n;

    /* renamed from: o */
    private C2393x f348876o;

    /* renamed from: p */
    private boolean f348877p;

    public SuwActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m207169x() {
        if (this.f348872k != null) {
            return;
        }
        if (!this.f348874m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f348877p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo107724v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f348872k = ((C126722i) mo107724v().mo17653jN()).mo107728ai();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C126719f.m207260a(th, th);
                }
            } catch (Throwable th2) {
                C126719f.m207260a(th, th2);
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
            baseContext = this.f348875n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f348875n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f348875n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f348876o == null) {
            this.f348876o = new C47212h(this);
        }
        return this.f348876o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f348873l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f348873l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f348873l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f348873l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C126721h hVar;
        int i;
        C47573bx s = this.f348873l.mo51692s();
        try {
            this.f348874m = true;
            m207169x();
            ((C47212h) getLifecycle()).mo51120i(this.f348873l);
            ((C47237f) mo107724v().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m207169x();
            hVar = this.f348872k;
            hVar.f348997b.getWindow().requestFeature(13);
            C45304a.m80750f(hVar.f348997b);
            C45304a.m80749e(hVar.f348997b);
            SuwActivity suwActivity = hVar.f348997b;
            if (C1888a.m5150d()) {
                i = true != C45315i.m80766a(hVar.f348997b) ? 2132150221 : 2132150220;
            } else {
                i = true != C45315i.m80766a(hVar.f348997b) ? 2132150218 : 2132150217;
            }
            C45317k c = C45317k.m80773c();
            int i2 = c.f118379a;
            String str = c.f118380b;
            boolean z = c.f118381c;
            suwActivity.setTheme(C45316j.m80772a(i).mo49239b(hVar.f348997b.getIntent().getStringExtra("theme"), true ^ C45315i.m80766a(hVar.f348997b)));
            ((C59052c) ((C59052c) C126721h.f348996a.mo56224b()).mo56372aa(37106)).mo56389s("set dynamic color %b", Boolean.valueOf(C45315i.m80770e(hVar.f348997b)));
            Bundle extras = hVar.f348997b.getIntent().getExtras();
            if (extras != null) {
                if (!hVar.f348997b.getIntent().hasExtra("intent_extra_orientation_mode")) {
                    ((C59052c) ((C59052c) C126721h.f348996a.mo56224b()).mo56372aa(37108)).mo56386p("No orientation mode set.");
                } else {
                    hVar.f348997b.setRequestedOrientation(extras.getInt("intent_extra_orientation_mode"));
                }
            }
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C126721h.f348996a.mo56226d()).mo56382g(e)).mo56372aa(37107)).mo56386p("Unable to set orientation.");
        } catch (Throwable th) {
            if (s != null) {
                try {
                    ((C47818f) s).f123842a.mo51690q();
                } catch (Throwable th2) {
                    C126719f.m207260a(th, th2);
                }
            }
            throw th;
        }
        hVar.f348997b.setContentView((int) R.layout.assistant_suw_activity);
        this.f348874m = false;
        if (s != null) {
            ((C47818f) s).f123842a.mo51690q();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f348873l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f348873l.mo51675b();
        try {
            super.onDestroy();
            this.f348877p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f348873l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f348873l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f348873l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f348873l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f348873l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f348873l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
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
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f348873l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f348873l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f348873l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f348873l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f348873l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f348873l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126719f.m207260a(th, th);
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
    public final /* synthetic */ C68314a mo107681w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C126721h hVar = this.f348872k;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f348877p) {
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
