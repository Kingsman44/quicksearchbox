package com.google.android.apps.search.googleapp.customtabs.features.partialcct;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
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
public final class PartialCctScrimActivity extends C133909b implements C47231d, C47211g {

    /* renamed from: k */
    private C133912e f364721k;

    /* renamed from: l */
    private final C47851k f364722l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f364723m;

    /* renamed from: n */
    private Context f364724n;

    /* renamed from: o */
    private C2393x f364725o;

    /* renamed from: p */
    private boolean f364726p;

    public PartialCctScrimActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m217186x() {
        if (this.f364721k != null) {
            return;
        }
        if (!this.f364723m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f364726p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo111448v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f364721k = ((C133914g) mo111448v().mo17653jN()).mo111450aT();
                    a2.close();
                    this.f364721k.f364738e = this;
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C133910c.m217196a(th, th);
                }
            } catch (Throwable th2) {
                C133910c.m217196a(th, th2);
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
            baseContext = this.f364724n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f364724n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f364724n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f364725o == null) {
            this.f364725o = new C47212h(this);
        }
        return this.f364725o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f364722l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f364722l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            m217186x();
            this.f364721k.f364735c.finish();
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f364722l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f364722l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f364722l.mo51692s();
        try {
            this.f364723m = true;
            m217186x();
            ((C47212h) getLifecycle()).mo51120i(this.f364722l);
            ((C47237f) mo111448v().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m217186x();
            C133912e eVar = this.f364721k;
            eVar.f364736d.mo110996d(eVar.f364735c, R.layout.googleapp_partial_cct_activity, 2132150664);
            Window window = eVar.f364735c.getWindow();
            window.addFlags(2);
            window.setDimAmount(0.6f);
            Intent b = C133916i.m217204b(eVar.f364735c.getIntent());
            if (b != null) {
                C47810es.m84982v(eVar.f364735c, b, 0, (Bundle) null);
            } else {
                ((C59052c) ((C59052c) C133912e.f364733a.mo56226d()).mo56372aa(40182)).mo56386p("Partial CCT Activity launched without target CCT intent");
                eVar.f364735c.finish();
            }
            this.f364723m = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f364722l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f364722l.mo51675b();
        try {
            super.onDestroy();
            this.f364726p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f364722l.mo51676c(intent);
        try {
            m217186x();
            C133912e eVar = this.f364721k;
            if (C133916i.m217204b(eVar.f364735c.getIntent()) != null) {
                ((C59052c) ((C59052c) C133912e.f364733a.mo56226d()).mo56372aa(40183)).mo56386p("Target intent not expected");
            }
            eVar.f364735c.finish();
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f364722l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f364722l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f364722l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f364722l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f364722l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
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
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f364722l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f364722l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f364722l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f364722l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f364722l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f364722l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133910c.m217196a(th, th);
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
    public final /* synthetic */ C68314a mo111447w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C133912e eVar = this.f364721k;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f364726p) {
            return eVar;
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
