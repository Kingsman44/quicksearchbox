package com.google.android.apps.search.xblend.xpane;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.xblend.p10708c.C142271a;
import com.google.android.apps.search.xblend.p10708c.C142272b;
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
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68314a;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class XPaneActivity extends C142276b implements C47231d, C47211g {

    /* renamed from: l */
    private C142279e f385984l;

    /* renamed from: m */
    private final C47851k f385985m = new C47851k(this, this);

    /* renamed from: n */
    private boolean f385986n;

    /* renamed from: o */
    private Context f385987o;

    /* renamed from: p */
    private C2393x f385988p;

    /* renamed from: q */
    private boolean f385989q;

    public XPaneActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: l */
    private final void m231005l() {
        if (this.f385984l != null) {
            return;
        }
        if (!this.f385986n) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f385989q || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo22285j().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f385984l = ((C142280f) mo22285j().mo17653jN()).mo117109bD();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C142278d.m231017a(th, th);
                }
            } catch (Throwable th2) {
                C142278d.m231017a(th, th2);
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
            baseContext = this.f385987o;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f385987o = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f385987o = null;
    }

    public final C2384o getLifecycle() {
        if (this.f385988p == null) {
            this.f385988p = new C47212h(this);
        }
        return this.f385988p;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.invalidateOptionsMenu();
            w.close();
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* renamed from: k */
    public final /* synthetic */ C68314a mo22340k() {
        return new C47241j(this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f385985m.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f385985m.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f385985m.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C142272b bVar;
        C47573bx s = this.f385985m.mo51692s();
        try {
            this.f385986n = true;
            m231005l();
            ((C47212h) getLifecycle()).mo51120i(this.f385985m);
            ((C47237f) mo22285j().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m231005l();
            C142279e eVar = this.f385984l;
            eVar.f386000a.setContentView((int) R.layout.xblend_xpane_activity);
            if (bundle != null) {
                C142271a aVar = (C142271a) C142272b.f385977e.createBuilder();
                C69664n.m101060f(aVar, "newBuilder()");
                MessageLite c = ProtoParsers.m95520c(bundle, "xpaneparams", C69664n.m101061g(aVar, "builder").mo117099a(), C62921ba.m95368a());
                C69664n.m101060f(c, "get(\n          savedInst…ratedRegistry()\n        )");
                eVar.f386001b = (C142272b) c;
            } else {
                Intent intent = eVar.f386000a.getIntent();
                C69664n.m101060f(intent, "activity.intent");
                C69664n.m101061g(intent, "intent");
                if (!intent.hasExtra("extra_open_xpane_params")) {
                    C142271a aVar2 = (C142271a) C142272b.f385977e.createBuilder();
                    C69664n.m101060f(aVar2, "newBuilder()");
                    bVar = C69664n.m101061g(aVar2, "builder").mo117099a();
                } else {
                    C142271a aVar3 = (C142271a) C142272b.f385977e.createBuilder();
                    C69664n.m101060f(aVar3, "newBuilder()");
                    MessageLite b = ProtoParsers.m95519b(intent, "extra_open_xpane_params", C69664n.m101061g(aVar3, "builder").mo117099a(), C62921ba.m95368a());
                    C69664n.m101060f(b, "get(\n      intent,\n     …GeneratedRegistry()\n    )");
                    bVar = (C142272b) b;
                }
                eVar.f386001b = bVar;
            }
            this.f385986n = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f385985m.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f385985m.mo51675b();
        try {
            super.onDestroy();
            this.f385989q = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C47573bx u = this.f385985m.mo51694u();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            if (u != null) {
                u.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f385985m.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f385985m.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f385985m.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f385985m.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f385985m.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f385985m.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
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
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f385985m.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f385985m.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f385985m.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            m231005l();
            C142279e eVar = this.f385984l;
            C69664n.m101061g(bundle, "savedInstanceState");
            ProtoParsers.m95532o(bundle, "xpaneparams", eVar.f386001b);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f385985m.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f385985m.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f385985m.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142278d.m231017a(th, th);
        }
        throw th;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m231005l();
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C142279e eVar = this.f385984l;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385989q) {
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
