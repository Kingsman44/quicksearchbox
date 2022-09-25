package com.google.android.apps.search.transcription.voiceime.permissions;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.app.C1820g;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.transcription.voiceime.C142006i;
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
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class PermissionsActivity extends C142015b implements C47231d, C47211g {

    /* renamed from: l */
    private C142017d f385327l;

    /* renamed from: m */
    private final C47851k f385328m = new C47851k(this, this);

    /* renamed from: n */
    private boolean f385329n;

    /* renamed from: o */
    private Context f385330o;

    /* renamed from: p */
    private C2393x f385331p;

    /* renamed from: q */
    private boolean f385332q;

    public PermissionsActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: l */
    private final void m230552l() {
        if (this.f385327l != null) {
            return;
        }
        if (!this.f385329n) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f385332q || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo22285j().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f385327l = ((C142018e) mo22285j().mo17653jN()).mo116971bz();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C142016c.m230559a(th, th);
                }
            } catch (Throwable th2) {
                C142016c.m230559a(th, th2);
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
            baseContext = this.f385330o;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f385330o = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f385330o = null;
    }

    public final C2384o getLifecycle() {
        if (this.f385331p == null) {
            this.f385331p = new C47212h(this);
        }
        return this.f385331p;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.invalidateOptionsMenu();
            w.close();
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* renamed from: k */
    public final /* synthetic */ C68314a mo22340k() {
        return new C47241j(this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f385328m.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f385328m.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f385328m.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f385328m.mo51692s();
        try {
            this.f385329n = true;
            m230552l();
            ((C47212h) getLifecycle()).mo51120i(this.f385328m);
            ((C47237f) mo22285j().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            this.f385329n = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f385328m.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f385328m.mo51675b();
        try {
            super.onDestroy();
            this.f385332q = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C47573bx u = this.f385328m.mo51694u();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            if (u != null) {
                u.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f385328m.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f385328m.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f385328m.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f385328m.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f385328m.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f385328m.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
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
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f385328m.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            m230552l();
            C142017d dVar = this.f385327l;
            if (i != 1) {
                ((C59052c) ((C59052c) C142017d.f385337a.mo56226d()).mo56372aa(42014)).mo56387q("Unhandled onRequestPermissionsResult. Request code=%d", i);
            } else if (strArr.length == 1 && strArr[0].equals("android.permission.RECORD_AUDIO") && iArr.length == 1 && iArr[0] == 0) {
                ((C59052c) ((C59052c) C142017d.f385337a.mo56224b()).mo56372aa(42016)).mo56386p("RECORD_AUDIO permission was granted.");
            } else {
                ((C59052c) ((C59052c) C142017d.f385337a.mo56226d()).mo56372aa(42015)).mo56386p("Incorrect set of permissions was granted.");
            }
            C142006i iVar = dVar.f385339c;
            ((C59052c) ((C59052c) C142006i.f385318a.mo56224b()).mo56372aa(41969)).mo56386p("#showSoftInputFromInputMethod");
            C58833ax axVar = (C58833ax) iVar.f385320c.mo6453a();
            if (iVar.f385319b != null && axVar.mo56113h()) {
                iVar.f385319b.showSoftInputFromInputMethod((IBinder) axVar.mo56107c(), 0);
            }
            dVar.f385338b.finish();
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f385328m.mo51679f();
        try {
            super.onResume();
            m230552l();
            C142017d dVar = this.f385327l;
            ((C59052c) ((C59052c) C142017d.f385337a.mo56224b()).mo56372aa(42017)).mo56386p("#onResume");
            C1820g.m4991a(dVar.f385338b, new String[]{"android.permission.RECORD_AUDIO"}, 1);
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f385328m.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f385328m.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f385328m.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f385328m.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142016c.m230559a(th, th);
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
        C142017d dVar = this.f385327l;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385332q) {
            return dVar;
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
