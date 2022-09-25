package com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.aistrampolineactivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9509d.C126906a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.performer.p2728a.C35468d;
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
import com.google.common.p4526f.C59094n;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class AisTrampolineActivity extends C126903f implements C47231d, C47211g {

    /* renamed from: k */
    private C126899b f349402k;

    /* renamed from: l */
    private final C47851k f349403l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f349404m;

    /* renamed from: n */
    private Context f349405n;

    /* renamed from: o */
    private C2393x f349406o;

    /* renamed from: p */
    private boolean f349407p;

    public AisTrampolineActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m207583x() {
        if (this.f349402k != null) {
            return;
        }
        if (!this.f349404m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f349407p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo107851w().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f349402k = ((C126900c) mo107851w().mo17653jN()).mo107849an();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C126898a.m207589a(th, th);
                }
            } catch (Throwable th2) {
                C126898a.m207589a(th, th2);
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
            baseContext = this.f349405n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f349405n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f349405n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f349406o == null) {
            this.f349406o = new C47212h(this);
        }
        return this.f349406o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f349403l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f349403l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            m207583x();
            C126899b bVar = this.f349402k;
            C126906a aVar = (C126906a) bVar.f349410c.f349423b.remove(Integer.valueOf(i));
            if (aVar != null) {
                aVar.f349419a.mo5437b(new C35468d(i2, intent));
            } else {
                C59052c cVar = (C59052c) C126899b.f349408a.mo56226d();
                cVar.mo56379ah(new C59094n(37218));
                cVar.mo56386p("No requestCallback was mapped to given requestCode");
            }
            bVar.f349409b.finish();
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f349403l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f349403l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent;
        C47573bx s = this.f349403l.mo51692s();
        try {
            this.f349404m = true;
            m207583x();
            ((C47212h) getLifecycle()).mo51120i(this.f349403l);
            ((C47237f) mo107851w().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m207583x();
            C126899b bVar = this.f349402k;
            bVar.f349409b.setContentView((int) R.layout.assistant_ma_ais_trampoline_activity_layout);
            bVar.f349409b.overridePendingTransition(0, 0);
            Bundle extras = bVar.f349409b.getIntent().getExtras();
            if (extras == null) {
                C59052c cVar = (C59052c) C126899b.f349408a.mo56226d();
                cVar.mo56379ah(new C59094n(37216));
                cVar.mo56386p("bundle is null: no client intent was passed in.");
                intent = null;
            } else {
                intent = (Intent) extras.getParcelable("CLIENT_INTENT");
            }
            if (intent == null) {
                bVar.f349409b.finish();
            } else {
                C47810es.m84981u(bVar.f349409b, intent, bVar.f349409b.getIntent().getIntExtra("requestCode", -1));
                bVar.f349409b.getIntent().replaceExtras(new Bundle());
            }
            this.f349404m = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f349403l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f349403l.mo51675b();
        try {
            super.onDestroy();
            this.f349407p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f349403l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f349403l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f349403l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f349403l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f349403l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f349403l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
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
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f349403l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f349403l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f349403l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f349403l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f349403l.mo51681h();
        try {
            super.onStop();
            m207583x();
            this.f349402k.f349409b.finish();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f349403l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126898a.m207589a(th, th);
        }
        throw th;
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: v */
    public final /* synthetic */ C68314a mo107848v() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C126899b bVar = this.f349402k;
        if (bVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f349407p) {
            return bVar;
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
