package com.google.android.apps.search.transcription.p10679ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p031v4.app.C0154a;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.transcription.C141762c;
import com.google.android.apps.search.transcription.p10670f.C141786ae;
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
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.transcription.ui.TranscriptionActivity */
/* compiled from: PG */
public final class TranscriptionActivity extends C141935b implements C47231d, C47211g {

    /* renamed from: k */
    private C141943j f385137k;

    /* renamed from: l */
    private final C47851k f385138l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f385139m;

    /* renamed from: n */
    private Context f385140n;

    /* renamed from: o */
    private C2393x f385141o;

    /* renamed from: p */
    private boolean f385142p;

    public TranscriptionActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m230407x() {
        if (this.f385137k != null) {
            return;
        }
        if (!this.f385139m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f385142p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo116904v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f385137k = ((C141944k) mo116904v().mo17653jN()).mo116916by();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C141941h.m230432a(th, th);
                }
            } catch (Throwable th2) {
                C141941h.m230432a(th, th2);
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
            baseContext = this.f385140n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f385140n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f385140n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f385141o == null) {
            this.f385141o = new C47212h(this);
        }
        return this.f385141o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f385138l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f385138l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f385138l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f385138l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ComponentName a;
        C47573bx s = this.f385138l.mo51692s();
        try {
            this.f385139m = true;
            m230407x();
            ((C47212h) getLifecycle()).mo51120i(this.f385138l);
            ((C47237f) mo116904v().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m230407x();
            C141943j jVar = this.f385137k;
            boolean z = jVar.f385175c;
            if (Build.VERSION.SDK_INT < 31 || !jVar.f385175c || (a = C141762c.m229998a(jVar.f385174b)) == null || !a.getPackageName().equals("com.google.android.tts")) {
                jVar.f385174b.setContentView((int) R.layout.transcription_activity);
                if (bundle == null) {
                    C141955u uVar = new C141955u();
                    C68324h.m98669f(uVar);
                    C0154a aVar = new C0154a(jVar.f385174b.f727a.f739a.f744e);
                    aVar.mo689v(R.id.transcription_fragment_container, uVar, "transcriptionInitFragment");
                    aVar.mo509f();
                }
            } else {
                String d = C141786ae.m230050d(jVar.f385174b);
                ((C59052c) ((C59052c) C141943j.f385173a.mo56224b()).mo56372aa(41955)).mo56386p("Forwarding the request to Speech Services By Google");
                jVar.f385176d.ifPresent(new C141942i(d));
                Intent intent = jVar.f385174b.getIntent();
                intent.setComponent(C141762c.m229998a(jVar.f385174b));
                intent.setFlags(33554432);
                C47810es.m84979s(jVar.f385174b, intent);
                jVar.f385174b.finish();
            }
            this.f385139m = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f385138l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f385138l.mo51675b();
        try {
            super.onDestroy();
            this.f385142p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f385138l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            m230407x();
            ((C59052c) ((C59052c) C141943j.f385173a.mo56226d()).mo56372aa(41957)).mo56386p("Multiple activities started, only one will be kept");
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f385138l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f385138l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f385138l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f385138l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f385138l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
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
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f385138l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f385138l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f385138l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f385138l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f385138l.mo51681h();
        try {
            super.onStop();
            m230407x();
            C141943j jVar = this.f385137k;
            if (!jVar.f385174b.isChangingConfigurations()) {
                jVar.f385174b.finish();
            }
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f385138l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141941h.m230432a(th, th);
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
    public final /* synthetic */ C68314a mo116903w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C141943j jVar = this.f385137k;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385142p) {
            return jVar;
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
