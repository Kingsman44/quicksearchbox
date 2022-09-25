package com.google.android.apps.search.faceviewer;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
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
public final class FaceViewerActivity extends C132691o implements C47231d, C47211g {

    /* renamed from: k */
    private C132682f f362042k;

    /* renamed from: l */
    private final C47851k f362043l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f362044m;

    /* renamed from: n */
    private Context f362045n;

    /* renamed from: o */
    private C2393x f362046o;

    /* renamed from: p */
    private boolean f362047p;

    public FaceViewerActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m215651x() {
        if (this.f362042k != null) {
            return;
        }
        if (!this.f362044m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f362047p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo110880w().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f362042k = ((C132683g) mo110880w().mo17653jN()).mo110874aI();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C132680d.m215676a(th, th);
                }
            } catch (Throwable th2) {
                C132680d.m215676a(th, th2);
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
            baseContext = this.f362045n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f362045n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f362045n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f362046o == null) {
            this.f362046o = new C47212h(this);
        }
        return this.f362046o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f362043l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f362043l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f362043l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f362043l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C132682f fVar;
        C47573bx s = this.f362043l.mo51692s();
        try {
            this.f362044m = true;
            m215651x();
            ((C47212h) getLifecycle()).mo51120i(this.f362043l);
            ((C47237f) mo110880w().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m215651x();
            fVar = this.f362042k;
            fVar.f362065b.setRequestedOrientation(1);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C132682f.f362064a.mo56226d()).mo56382g(e)).mo56372aa(39789)).mo56386p("Unable to setRequestedOrientation to portrait.");
        } catch (Throwable th) {
            if (s != null) {
                try {
                    ((C47818f) s).f123842a.mo51690q();
                } catch (Throwable th2) {
                    C132680d.m215676a(th, th2);
                }
            }
            throw th;
        }
        fVar.f362065b.setContentView((int) R.layout.faceviewer_activity);
        this.f362044m = false;
        if (s != null) {
            ((C47818f) s).f123842a.mo51690q();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f362043l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f362043l.mo51675b();
        try {
            super.onDestroy();
            this.f362047p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        r1 = ((com.google.android.apps.search.faceviewer.C132686j) r1.mo17754z().mo46379a()).mo110876a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNewIntent(android.content.Intent r4) {
        /*
            r3 = this;
            com.google.apps.tiktok.tracing.k r0 = r3.f362043l
            com.google.apps.tiktok.tracing.bx r0 = r0.mo51676c(r4)
            super.onNewIntent(r4)     // Catch:{ all -> 0x004a }
            r3.m215651x()     // Catch:{ all -> 0x004a }
            com.google.android.apps.search.faceviewer.f r1 = r3.f362042k     // Catch:{ all -> 0x004a }
            com.google.android.apps.search.faceviewer.FaceViewerActivity r1 = r1.f362065b     // Catch:{ all -> 0x004a }
            android.support.v4.app.ar r1 = r1.f727a     // Catch:{ all -> 0x004a }
            android.support.v4.app.at r1 = r1.f739a     // Catch:{ all -> 0x004a }
            android.support.v4.app.FragmentManager r1 = r1.f744e     // Catch:{ all -> 0x004a }
            android.support.v4.app.cc r1 = r1.f634a     // Catch:{ all -> 0x004a }
            r2 = 2131430900(0x7f0b0df4, float:1.8483514E38)
            android.support.v4.app.Fragment r1 = r1.mo670b(r2)     // Catch:{ all -> 0x004a }
            com.google.android.libraries.web.base.o r1 = (com.google.android.libraries.web.base.C43264o) r1     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0040
            com.google.android.libraries.web.base.q r1 = r1.mo17754z()     // Catch:{ all -> 0x004a }
            android.support.v4.app.Fragment r1 = r1.mo46379a()     // Catch:{ all -> 0x004a }
            com.google.android.apps.search.faceviewer.j r1 = (com.google.android.apps.search.faceviewer.C132686j) r1     // Catch:{ all -> 0x004a }
            com.google.android.apps.search.faceviewer.m r1 = r1.mo17754z()     // Catch:{ all -> 0x004a }
            com.google.android.libraries.ar.faceviewer.e r2 = r1.f362081i     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0040
            com.google.ad.a.ai r4 = com.google.android.apps.search.faceviewer.C132689m.m215691a(r4)     // Catch:{ all -> 0x004a }
            int r1 = r1.mo110879b()     // Catch:{ all -> 0x004a }
            r2.mo18696b(r4, r1)     // Catch:{ all -> 0x004a }
        L_0x0040:
            if (r0 == 0) goto L_0x0049
            com.google.apps.tiktok.tracing.f r0 = (com.google.apps.tiktok.tracing.C47818f) r0
            com.google.apps.tiktok.tracing.k r4 = r0.f123842a
            r4.mo51690q()
        L_0x0049:
            return
        L_0x004a:
            r4 = move-exception
            if (r0 == 0) goto L_0x0059
            com.google.apps.tiktok.tracing.f r0 = (com.google.apps.tiktok.tracing.C47818f) r0     // Catch:{ all -> 0x0055 }
            com.google.apps.tiktok.tracing.k r0 = r0.f123842a     // Catch:{ all -> 0x0055 }
            r0.mo51690q()     // Catch:{ all -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r0 = move-exception
            com.google.android.apps.search.faceviewer.C132680d.m215676a(r4, r0)
        L_0x0059:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.faceviewer.FaceViewerActivity.onNewIntent(android.content.Intent):void");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f362043l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f362043l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f362043l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f362043l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f362043l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
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
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f362043l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f362043l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f362043l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f362043l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f362043l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f362043l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132680d.m215676a(th, th);
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
    public final /* synthetic */ C68314a mo110872v() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C132682f fVar = this.f362042k;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f362047p) {
            return fVar;
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
