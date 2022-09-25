package com.google.android.apps.search.googleapp.stampviewer;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139351g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.baseclasses.C47212h;
import com.google.apps.tiktok.inject.p3659d.C47237f;
import com.google.apps.tiktok.inject.p3659d.C47241j;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
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
public final class StampViewerActivity extends C139318b implements C47231d, C47211g {

    /* renamed from: l */
    private C139381e f378885l;

    /* renamed from: m */
    private final C47851k f378886m = new C47851k(this, this);

    /* renamed from: n */
    private boolean f378887n;

    /* renamed from: o */
    private Context f378888o;

    /* renamed from: p */
    private C2393x f378889p;

    /* renamed from: q */
    private boolean f378890q;

    public StampViewerActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: l */
    private final void m226441l() {
        if (this.f378885l != null) {
            return;
        }
        if (!this.f378887n) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f378890q || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo22285j().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f378885l = ((C139396g) mo22285j().mo17653jN()).mo114945bp();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C139361d.m226496a(th, th);
                }
            } catch (Throwable th2) {
                C139361d.m226496a(th, th2);
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
            baseContext = this.f378888o;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f378888o = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f378888o = null;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        super.dispatchKeyEvent(keyEvent);
        m226441l();
        C139381e eVar = this.f378885l;
        if (keyEvent.getKeyCode() == 25 || keyEvent.getKeyCode() == 24) {
            eVar.f379005c.mo115020a(false);
        }
        return false;
    }

    public final C2384o getLifecycle() {
        if (this.f378889p == null) {
            this.f378889p = new C47212h(this);
        }
        return this.f378889p;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.invalidateOptionsMenu();
            w.close();
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* renamed from: k */
    public final /* synthetic */ C68314a mo22340k() {
        return new C47241j(this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f378886m.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f378886m.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f378886m.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f378886m.mo51692s();
        try {
            this.f378887n = true;
            m226441l();
            ((C47212h) getLifecycle()).mo51120i(this.f378886m);
            ((C47237f) mo22285j().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m226441l();
            C139381e eVar = this.f378885l;
            eVar.f379005c.mo115020a(true);
            if (!eVar.f379004b.isFinishing()) {
                eVar.f379004b.setContentView((int) R.layout.googleapp_stamp_viewer_activity);
                eVar.f379004b.setRequestedOrientation(1);
            }
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C139381e.f379003a.mo56225c()).mo56382g(e)).mo56372aa(41369)).mo56386p("Unable to setRequestedOrientation.");
        } catch (Throwable th) {
            if (s != null) {
                try {
                    ((C47818f) s).f123842a.mo51690q();
                } catch (Throwable th2) {
                    C139361d.m226496a(th, th2);
                }
            }
            throw th;
        }
        C47389c.m84226a(this).f123128b = findViewById(16908290);
        C47393f.m84231b(this, C139351g.class, new C139390f(this.f378885l));
        this.f378887n = false;
        if (s != null) {
            ((C47818f) s).f123842a.mo51690q();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f378886m.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f378886m.mo51675b();
        try {
            super.onDestroy();
            m226441l();
            this.f378885l.f379005c.mo115020a(true);
            this.f378890q = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C47573bx u = this.f378886m.mo51694u();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            if (u != null) {
                u.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f378886m.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f378886m.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f378886m.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f378886m.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f378886m.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f378886m.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
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
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f378886m.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f378886m.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f378886m.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f378886m.mo51680g();
        try {
            super.onStart();
            m226441l();
            C28439i iVar = this.f378885l.f379006d;
            if (iVar != null) {
                iVar.mo33892i(1);
            }
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f378886m.mo51681h();
        try {
            super.onStop();
            m226441l();
            C28439i iVar = this.f378885l.f379006d;
            if (iVar != null) {
                iVar.mo33892i(2);
            }
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f378886m.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139361d.m226496a(th, th);
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
        C139381e eVar = this.f378885l;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378890q) {
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
