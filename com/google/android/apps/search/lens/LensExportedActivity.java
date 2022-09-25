package com.google.android.apps.search.lens;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.lens.p10548b.C139925a;
import com.google.android.libraries.lens.sdk.intent.C24943e;
import com.google.android.libraries.lens.view.p2051ab.C24968a;
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
import com.google.common.p4552o.C60700zp;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class LensExportedActivity extends C139930f implements C47231d, C47211g {

    /* renamed from: p */
    private C139941q f380339p;

    /* renamed from: q */
    private final C47851k f380340q = new C47851k(this, this);

    /* renamed from: r */
    private boolean f380341r;

    /* renamed from: s */
    private Context f380342s;

    /* renamed from: t */
    private C2393x f380343t;

    /* renamed from: u */
    private boolean f380344u;

    public LensExportedActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: D */
    private final void m227523D() {
        if (this.f380339p != null) {
            return;
        }
        if (!this.f380341r) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f380344u || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo115343B().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f380339p = ((C139943s) mo115343B().mo17653jN()).mo115347bs();
                    a2.close();
                    this.f380339p.f380396c = this;
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C139940p.m227578a(th, th);
                }
            } catch (Throwable th2) {
                C139940p.m227578a(th, th2);
            }
        } else {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        throw th;
        throw th;
    }

    /* renamed from: C */
    public final /* synthetic */ C68314a mo115330C() {
        return new C47241j(this);
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f380342s;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f380342s = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f380342s = null;
    }

    public final C2384o getLifecycle() {
        if (this.f380343t == null) {
            this.f380343t = new C47212h(this);
        }
        return this.f380343t;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f380340q.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f380340q.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f380340q.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f380340q.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f380340q.mo51692s();
        try {
            this.f380341r = true;
            m227523D();
            ((C47212h) getLifecycle()).mo51120i(this.f380340q);
            ((C47237f) mo115343B().mo17653jN()).mo51141bP().mo50899a();
            m227523D();
            C139941q qVar = this.f380339p;
            if (qVar.f380394a.f380370m == C60700zp.DIRECT_INTENT) {
                String callingPackage = qVar.f380394a.getCallingPackage();
                C24943e a = C24968a.m46212a(qVar.f380394a.getIntent());
                if (a != null && a.f68071a.containsKey("caller_package") && callingPackage == null) {
                    callingPackage = a.mo30168d();
                }
                qVar.f380394a.setResult(-1);
                int a2 = ((C139925a) qVar.f380395b.mo27525b()).mo115342a(callingPackage);
                C24968a.m46218g(qVar.f380394a, a2);
                if (a2 != -1) {
                    qVar.f380394a.setResult(0);
                    if (a != null && !TextUtils.isEmpty(a.mo30169e())) {
                        LensExportedActivity lensExportedActivity = qVar.f380394a;
                        String e = a.mo30169e();
                        e.getClass();
                        Toast.makeText(lensExportedActivity, e, 1).show();
                    }
                    qVar.f380394a.finish();
                }
            }
            super.onCreate(bundle);
            this.f380341r = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f380340q.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f380340q.mo51675b();
        try {
            super.onDestroy();
            this.f380344u = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f380340q.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f380340q.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        C47573bx d = this.f380340q.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f380340q.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f380340q.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f380340q.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
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
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f380340q.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx f = this.f380340q.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f380340q.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        C47573bx g = this.f380340q.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        C47573bx h = this.f380340q.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f380340q.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139940p.m227578a(th, th);
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
        C139941q qVar = this.f380339p;
        if (qVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f380344u) {
            return qVar;
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
