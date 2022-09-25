package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
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
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.hilt.android.internal.managers.C68314a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.PieActivity */
/* compiled from: PG */
public final class PieActivity extends C103129as implements C47231d, C47211g {

    /* renamed from: k */
    private C103143bf f287756k;

    /* renamed from: l */
    private final C47851k f287757l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f287758m;

    /* renamed from: n */
    private Context f287759n;

    /* renamed from: o */
    private C2393x f287760o;

    /* renamed from: p */
    private boolean f287761p;

    public PieActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: y */
    private final void m170945y() {
        if (this.f287756k != null) {
            return;
        }
        if (!this.f287758m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f287761p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo93644v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f287756k = ((C103144bg) mo93644v().mo17653jN()).mo93661X();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C103140bc.m171038a(th, th);
                }
            } catch (Throwable th2) {
                C103140bc.m171038a(th, th2);
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
            baseContext = this.f287759n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f287759n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f287759n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f287760o == null) {
            this.f287760o = new C47212h(this);
        }
        return this.f287760o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f287757l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f287757l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f287757l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f287757l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C103143bf bfVar;
        Optional optional;
        C47573bx s = this.f287757l.mo51692s();
        try {
            this.f287758m = true;
            m170945y();
            ((C47212h) getLifecycle()).mo51120i(this.f287757l);
            ((C47237f) mo93644v().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m170945y();
            bfVar = this.f287756k;
            C74504a.m120462a(f.ad);
            Intent intent = bfVar.f287848c.getIntent();
            if (intent != null) {
                if (intent.hasExtra("learning_center_suggested_query")) {
                    C103032a aVar = bfVar.f287849d;
                    String stringExtra = bfVar.f287848c.getIntent().getStringExtra("learning_center_suggested_query");
                    stringExtra.getClass();
                    aVar.mo93574n(stringExtra);
                    bfVar.mo93658c(false);
                }
            }
            bfVar.f287848c.setContentView((int) R.layout.nga_pie_activity);
            Bundle extras = bfVar.f287848c.getIntent().getExtras();
            if (extras == null) {
                optional = Optional.empty();
            } else {
                byte[] byteArray = extras.getByteArray("pie-ui-state");
                if (byteArray != null) {
                    optional = Optional.m71637of((C80244ck) C62942bv.parseFrom((C62942bv) C80244ck.f220137i, byteArray, C62921ba.m95368a()));
                }
                optional = Optional.empty();
            }
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) C103143bf.f287846a.mo56225c()).mo56382g(e)).mo56372aa(21456)).mo56386p("Unable to parse OPA intent");
        } catch (Throwable th) {
            if (s != null) {
                try {
                    ((C47818f) s).f123842a.mo51690q();
                } catch (Throwable th2) {
                    C103140bc.m171038a(th, th2);
                }
            }
            throw th;
        }
        bfVar.f287847b = optional;
        bfVar.f287848c.setRequestedOrientation(1);
        if (bfVar.f287847b.isEmpty()) {
            bfVar.f287849d.mo93565e().mo76658d(bfVar);
        }
        this.f287758m = false;
        if (s != null) {
            ((C47818f) s).f123842a.mo51690q();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f287757l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f287757l.mo51675b();
        try {
            super.onDestroy();
            m170945y();
            C103143bf bfVar = this.f287756k;
            if (bfVar.f287847b.isEmpty()) {
                bfVar.f287849d.mo93565e().mo76659e(bfVar);
            }
            this.f287761p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f287757l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f287757l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f287757l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f287757l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f287757l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f287757l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
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
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f287757l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C80244ck ckVar;
        C47573bx f = this.f287757l.mo51679f();
        try {
            super.onResume();
            m170945y();
            C103143bf bfVar = this.f287756k;
            if (bfVar.f287847b.isPresent()) {
                ckVar = (C80244ck) bfVar.f287847b.get();
            } else {
                ckVar = (C80244ck) bfVar.f287849d.mo93565e().mo76657c();
            }
            bfVar.mo17870a(ckVar);
            C103032a aVar = bfVar.f287849d;
            Optional map = bfVar.f287847b.map(C103141bd.f287844a);
            C80246cm a = C80246cm.m128102a(((C80244ck) bfVar.f287849d.mo93565e().mo76657c()).f220140b);
            if (a == null) {
                a = C80246cm.NO_UI;
            }
            aVar.mo93572l((C80246cm) map.orElse(a));
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f287757l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f287757l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f287757l.mo51681h();
        try {
            super.onStop();
            m170945y();
            C103143bf bfVar = this.f287756k;
            bfVar.f287849d.mo93571k(bfVar.f287850e.getAndSet(false));
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f287757l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C103140bc.m171038a(th, th);
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
    public final /* synthetic */ C68314a mo93617w() {
        return new C47241j(this);
    }

    /* renamed from: x */
    public final C103143bf mo17754z() {
        C103143bf bfVar = this.f287756k;
        if (bfVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f287761p) {
            return bfVar;
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
