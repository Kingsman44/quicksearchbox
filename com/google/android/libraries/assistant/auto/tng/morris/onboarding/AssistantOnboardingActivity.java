package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.onboarding.p1097a.C15392a;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14069ad;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14070ae;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14071af;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
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
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class AssistantOnboardingActivity extends C15453y implements C47231d, C47211g {

    /* renamed from: l */
    private C15441m f46179l;

    /* renamed from: m */
    private final C47851k f46180m = new C47851k(this, this);

    /* renamed from: n */
    private boolean f46181n;

    /* renamed from: o */
    private Context f46182o;

    /* renamed from: p */
    private C2393x f46183p;

    /* renamed from: q */
    private boolean f46184q;

    public AssistantOnboardingActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: l */
    private final void m32025l() {
        if (this.f46179l != null) {
            return;
        }
        if (!this.f46181n) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f46184q || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo22340k().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f46179l = ((C15443o) mo22340k().mo17653jN()).mo22332bF();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C15439k.m32142a(th, th);
                }
            } catch (Throwable th2) {
                C15439k.m32142a(th, th2);
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
            baseContext = this.f46182o;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f46182o = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f46182o = null;
    }

    public final C2384o getLifecycle() {
        if (this.f46183p == null) {
            this.f46183p = new C47212h(this);
        }
        return this.f46183p;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.invalidateOptionsMenu();
            w.close();
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final /* synthetic */ C68314a mo22285j() {
        return new C47241j(this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f46180m.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            m32025l();
            C15441m mVar = this.f46179l;
            C58976aa aaVar = C58975e.f156826a;
            if (i == 17) {
                mVar.f46308b.finish();
            }
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f46180m.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f46180m.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        C47573bx s = this.f46180m.mo51692s();
        try {
            this.f46181n = true;
            m32025l();
            ((C47212h) getLifecycle()).mo51120i(this.f46180m);
            ((C47237f) mo22340k().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m32025l();
            C15441m mVar = this.f46179l;
            C58976aa aaVar = C58975e.f156826a;
            if (!mVar.f46309c.mo79746e(C90051dc.f248890bs)) {
                mVar.f46308b.finish();
            } else {
                String stringExtra = mVar.f46308b.getIntent().getStringExtra("entry_point");
                String stringExtra2 = mVar.f46308b.getIntent().getStringExtra("source");
                if (stringExtra2 == null || !stringExtra2.equals("morris.oobe.snooze.notif")) {
                    mVar.f46314h = stringExtra2 != null ? C58837ba.m90858g(stringExtra2) : "morris.oobe.gmm.panel";
                    if (stringExtra != null) {
                        str = C58837ba.m90858g(stringExtra);
                    } else {
                        str = "gmm_dialog";
                    }
                    mVar.f46313g = str;
                } else {
                    C14096x xVar = mVar.f46310d;
                    C14069ad adVar = (C14069ad) C14071af.f42714f.createBuilder();
                    adVar.copyOnWrite();
                    C14071af afVar = (C14071af) adVar.instance;
                    afVar.f42717b = C14070ae.m30358a(6);
                    afVar.f42716a = 1 | afVar.f42716a;
                    C63042fg b = C62950b.m95471b(mVar.f46312f);
                    adVar.copyOnWrite();
                    C14071af afVar2 = (C14071af) adVar.instance;
                    b.getClass();
                    afVar2.f42718c = b;
                    afVar2.f42716a |= 2;
                    xVar.mo21404h((C14071af) adVar.build());
                    mVar.f46308b.finish();
                }
                C59104x b2 = C15441m.f46307a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "MorrisOobe.AsstActivity");
                ((C59052c) ((C59052c) b2).mo56372aa(45889)).mo56389s("Morris OOBE entry point is: %s", mVar.f46313g);
                mVar.f46310d.mo21405i(3);
                mVar.f46315i = mVar.f46311e.mo21589b();
            }
            C47389c.m84226a(this).f123128b = findViewById(16908290);
            C47393f.m84231b(this, C15392a.class, new C15442n(this.f46179l));
            this.f46181n = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f46180m.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f46180m.mo51675b();
        try {
            super.onDestroy();
            this.f46184q = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C47573bx u = this.f46180m.mo51694u();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            if (u != null) {
                u.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f46180m.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f46180m.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f46180m.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f46180m.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f46180m.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f46180m.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
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
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f46180m.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f46180m.mo51679f();
        try {
            super.onResume();
            m32025l();
            this.f46179l.mo22329k();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f46180m.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f46180m.mo51680g();
        try {
            super.onStart();
            m32025l();
            this.f46179l.mo22329k();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f46180m.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f46180m.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C15439k.m32142a(th, th);
        }
        throw th;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m32025l();
        C15441m mVar = this.f46179l;
        if (z) {
            mVar.mo22329k();
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
        C15441m mVar = this.f46179l;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f46184q) {
            return mVar;
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
