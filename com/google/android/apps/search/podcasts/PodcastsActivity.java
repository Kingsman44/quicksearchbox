package com.google.android.apps.search.podcasts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p031v4.app.Fragment;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.p098j.C2069cc;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.p10601r.C140954a;
import com.google.android.apps.search.podcasts.playerpanel.C140913bb;
import com.google.android.apps.search.podcasts.playerpanel.C140918d;
import com.google.android.apps.search.podcasts.playerpanel.C140921g;
import com.google.android.gms.cast.framework.C143429e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.material.p3505b.C44534d;
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
import com.google.p4225bm.p4229c.C56113b;
import dagger.hilt.android.internal.managers.C68314a;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class PodcastsActivity extends C139987b implements C47231d, C47211g {

    /* renamed from: k */
    private C140198e f380414k;

    /* renamed from: l */
    private final C47851k f380415l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f380416m;

    /* renamed from: n */
    private Context f380417n;

    /* renamed from: o */
    private C2393x f380418o;

    /* renamed from: p */
    private boolean f380419p;

    public PodcastsActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m227594x() {
        if (this.f380414k != null) {
            return;
        }
        if (!this.f380416m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f380419p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo115375v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f380414k = ((C140278f) mo115375v().mo17653jN()).mo115547bu();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C140191c.m227857a(th, th);
                }
            } catch (Throwable th2) {
                C140191c.m227857a(th, th2);
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
            baseContext = this.f380417n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f380417n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f380417n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f380418o == null) {
            this.f380418o = new C47212h(this);
        }
        return this.f380418o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f380415l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f380415l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f380415l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f380415l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f380415l.mo51692s();
        try {
            this.f380416m = true;
            m227594x();
            ((C47212h) getLifecycle()).mo51120i(this.f380415l);
            ((C47237f) mo115375v().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m227594x();
            C140198e eVar = this.f380414k;
            C44534d.m78714a(eVar.f380899b);
            C2069cc.m5650a(eVar.f380899b.getWindow(), false);
            eVar.f380899b.setContentView((int) R.layout.podcasts_activity);
            Context applicationContext = eVar.f380899b.getApplicationContext();
            if (C140954a.m228911a(applicationContext)) {
                C143429e.m232798f(applicationContext);
            }
            if (bundle == null) {
                C140749o oVar = eVar.f380904g;
                C56113b a = eVar.mo115495a();
                C69664n.m101061g(a, "entryPointType");
                C39141kp kpVar = oVar.f382198a;
                ((C19567d) kpVar.f102831aO.mo6453a()).mo24822a(1, oVar.mo115852a(), true, a.name());
            }
            this.f380416m = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f380415l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f380415l.mo51675b();
        try {
            super.onDestroy();
            this.f380419p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        super.onKeyUp(i, keyEvent);
        m227594x();
        C140639m mVar = (C140639m) this.f380414k.f380899b.f727a.f739a.f744e.f634a.mo671c("podcasts_main_fragment");
        if (mVar == null) {
            return false;
        }
        C141182w a = mVar.mo17754z();
        if ((i != 62 && i != 85) || keyEvent.getAction() != 1) {
            return false;
        }
        Fragment b = a.f383288b.getChildFragmentManager().f634a.mo670b(R.id.podcasts_collapsed_player_panel_container);
        if (!(b instanceof C140918d)) {
            return false;
        }
        C140921g a2 = ((C140918d) b).mo17754z();
        C140913bb.m228840a(a2.f382656g, a2.f382651b);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f380415l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f380415l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f380415l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f380415l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f380415l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f380415l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
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
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f380415l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f380415l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f380415l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f380415l.mo51680g();
        try {
            super.onStart();
            m227594x();
            this.f380414k.f380903f.f382404e = true;
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f380415l.mo51681h();
        try {
            super.onStop();
            m227594x();
            this.f380414k.f380903f.f382404e = false;
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f380415l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C140191c.m227857a(th, th);
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
    public final /* synthetic */ C68314a mo115359w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C140198e eVar = this.f380414k;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f380419p) {
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
