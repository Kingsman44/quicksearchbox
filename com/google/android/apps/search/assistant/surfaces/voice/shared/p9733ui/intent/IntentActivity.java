package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.intent;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.baseclasses.C47212h;
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
import dagger.hilt.android.internal.managers.C68314a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.intent.IntentActivity */
/* compiled from: PG */
public final class IntentActivity extends C128631b implements C47231d, C47211g {

    /* renamed from: l */
    private C128634e f353624l;

    /* renamed from: m */
    private final C47851k f353625m = new C47851k(this, this);

    /* renamed from: n */
    private boolean f353626n;

    /* renamed from: o */
    private Context f353627o;

    /* renamed from: p */
    private C2393x f353628p;

    /* renamed from: q */
    private boolean f353629q;

    public IntentActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: l */
    private final void m209927l() {
        if (this.f353624l != null) {
            return;
        }
        if (!this.f353626n) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f353629q || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo22285j().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f353624l = ((C128635f) mo22285j().mo17653jN()).mo108568at();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C128632c.m209934a(th, th);
                }
            } catch (Throwable th2) {
                C128632c.m209934a(th, th2);
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
            baseContext = this.f353627o;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f353627o = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f353627o = null;
    }

    public final C2384o getLifecycle() {
        if (this.f353628p == null) {
            this.f353628p = new C47212h(this);
        }
        return this.f353628p;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.invalidateOptionsMenu();
            w.close();
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* renamed from: k */
    public final /* synthetic */ C68314a mo22340k() {
        return new C47241j(this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f353625m.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f353625m.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f353625m.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            com.google.apps.tiktok.tracing.k r0 = r9.f353625m
            com.google.apps.tiktok.tracing.bx r0 = r0.mo51692s()
            r1 = 1
            r9.f353626n = r1     // Catch:{ all -> 0x0104 }
            r9.m209927l()     // Catch:{ all -> 0x0104 }
            androidx.lifecycle.o r2 = r9.getLifecycle()     // Catch:{ all -> 0x0104 }
            com.google.apps.tiktok.tracing.k r3 = r9.f353625m     // Catch:{ all -> 0x0104 }
            com.google.apps.tiktok.inject.baseclasses.h r2 = (com.google.apps.tiktok.inject.baseclasses.C47212h) r2     // Catch:{ all -> 0x0104 }
            r2.mo51120i(r3)     // Catch:{ all -> 0x0104 }
            dagger.hilt.android.internal.managers.a r2 = r9.mo22285j()     // Catch:{ all -> 0x0104 }
            java.lang.Object r2 = r2.mo17653jN()     // Catch:{ all -> 0x0104 }
            com.google.apps.tiktok.inject.d.f r2 = (com.google.apps.tiktok.inject.p3659d.C47237f) r2     // Catch:{ all -> 0x0104 }
            com.google.apps.tiktok.e.a r2 = r2.mo51141bP()     // Catch:{ all -> 0x0104 }
            r2.mo50899a()     // Catch:{ all -> 0x0104 }
            super.onCreate(r10)     // Catch:{ all -> 0x0104 }
            r9.m209927l()     // Catch:{ all -> 0x0104 }
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.intent.e r10 = r9.f353624l     // Catch:{ all -> 0x0104 }
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.intent.IntentActivity r2 = r10.f353636b     // Catch:{ all -> 0x0104 }
            android.content.Intent r2 = r2.getIntent()     // Catch:{ all -> 0x0104 }
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x003b
            goto L_0x0093
        L_0x003b:
            java.lang.String r5 = "EXTRA_FEATURE"
            java.lang.String r2 = r2.getStringExtra(r5)     // Catch:{ all -> 0x0104 }
            if (r2 != 0) goto L_0x0044
            goto L_0x0093
        L_0x0044:
            int r5 = r2.hashCode()     // Catch:{ IllegalArgumentException -> 0x0074 }
            r6 = 433141802(0x19d1382a, float:2.1632778E-23)
            if (r5 == r6) goto L_0x005d
            r6 = 1397788804(0x53509084, float:8.9577777E11)
            if (r5 == r6) goto L_0x0053
            goto L_0x0067
        L_0x0053:
            java.lang.String r5 = "ASSISTANT_SETTINGS"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0067
            r5 = 1
            goto L_0x0068
        L_0x005d:
            java.lang.String r5 = "UNKNOWN"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0067
            r5 = 0
            goto L_0x0068
        L_0x0067:
            r5 = -1
        L_0x0068:
            if (r5 == 0) goto L_0x0093
            if (r5 != r1) goto L_0x006e
            r1 = 2
            goto L_0x0093
        L_0x006e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0074 }
            r5.<init>()     // Catch:{ IllegalArgumentException -> 0x0074 }
            throw r5     // Catch:{ IllegalArgumentException -> 0x0074 }
        L_0x0074:
            r5 = move-exception
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.intent.C128634e.f353635a     // Catch:{ all -> 0x0104 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x0104 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0104 }
            com.google.common.f.x r5 = r6.mo56382g(r5)     // Catch:{ all -> 0x0104 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = "Could not recognize the enum for string %s"
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x0104 }
            r8 = 37889(0x9401, float:5.3094E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x0104 }
            r5.mo56379ah(r7)     // Catch:{ all -> 0x0104 }
            r5.mo56389s(r6, r2)     // Catch:{ all -> 0x0104 }
        L_0x0093:
            int r1 = r1 + r3
            r2 = 0
            if (r1 == 0) goto L_0x00ab
            com.google.android.libraries.assistant.p.a r3 = com.google.android.libraries.assistant.p1535p.C18522b.m35986c()     // Catch:{ all -> 0x0104 }
            java.lang.String r5 = "main_menu"
            r6 = r3
            com.google.android.libraries.assistant.p.c r6 = (com.google.android.libraries.assistant.p1535p.C18523c) r6     // Catch:{ all -> 0x0104 }
            r6.f52492a = r5     // Catch:{ all -> 0x0104 }
            com.google.android.libraries.assistant.p.b r3 = r3.mo24020b()     // Catch:{ all -> 0x0104 }
            android.content.Intent r3 = r3.mo24031a()     // Catch:{ all -> 0x0104 }
            goto L_0x00ac
        L_0x00ab:
            r3 = r2
        L_0x00ac:
            if (r3 != 0) goto L_0x00c7
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.intent.C128634e.f353635a     // Catch:{ all -> 0x0104 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0104 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0104 }
            java.lang.String r2 = "Unable to launch activity; provided intent is null"
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0104 }
            r5 = 37892(0x9404, float:5.3098E-41)
            r3.<init>(r5)     // Catch:{ all -> 0x0104 }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x0104 }
            r1.mo56386p(r2)     // Catch:{ all -> 0x0104 }
            goto L_0x00f3
        L_0x00c7:
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.intent.IntentActivity r5 = r10.f353636b     // Catch:{ all -> 0x0104 }
            android.content.Intent r5 = r5.getIntent()     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = "EXTRA_DISMISS_KEYGUARD"
            boolean r5 = r5.getBooleanExtra(r6, r4)     // Catch:{ all -> 0x0104 }
            if (r5 == 0) goto L_0x00e6
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.intent.d r5 = r10.f353637c     // Catch:{ all -> 0x0104 }
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.intent.IntentActivity r6 = r10.f353636b     // Catch:{ all -> 0x0104 }
            android.app.KeyguardManager r7 = r5.f353634a     // Catch:{ all -> 0x0104 }
            boolean r7 = r7.isKeyguardLocked()     // Catch:{ all -> 0x0104 }
            if (r7 == 0) goto L_0x00e6
            android.app.KeyguardManager r5 = r5.f353634a     // Catch:{ all -> 0x0104 }
            r5.requestDismissKeyguard(r6, r2)     // Catch:{ all -> 0x0104 }
        L_0x00e6:
            if (r1 == 0) goto L_0x00ee
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.intent.IntentActivity r1 = r10.f353636b     // Catch:{ all -> 0x0104 }
            com.google.apps.tiktok.tracing.C47810es.m84981u(r1, r3, r4)     // Catch:{ all -> 0x0104 }
            goto L_0x00f3
        L_0x00ee:
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.intent.IntentActivity r1 = r10.f353636b     // Catch:{ all -> 0x0104 }
            com.google.apps.tiktok.tracing.C47810es.m84979s(r1, r3)     // Catch:{ all -> 0x0104 }
        L_0x00f3:
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.intent.IntentActivity r10 = r10.f353636b     // Catch:{ all -> 0x0104 }
            r10.finish()     // Catch:{ all -> 0x0104 }
            r9.f353626n = r4     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0103
            com.google.apps.tiktok.tracing.f r0 = (com.google.apps.tiktok.tracing.C47818f) r0
            com.google.apps.tiktok.tracing.k r10 = r0.f123842a
            r10.mo51690q()
        L_0x0103:
            return
        L_0x0104:
            r10 = move-exception
            if (r0 == 0) goto L_0x0113
            com.google.apps.tiktok.tracing.f r0 = (com.google.apps.tiktok.tracing.C47818f) r0     // Catch:{ all -> 0x010f }
            com.google.apps.tiktok.tracing.k r0 = r0.f123842a     // Catch:{ all -> 0x010f }
            r0.mo51690q()     // Catch:{ all -> 0x010f }
            goto L_0x0113
        L_0x010f:
            r0 = move-exception
            com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.intent.C128632c.m209934a(r10, r0)
        L_0x0113:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.intent.IntentActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f353625m.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f353625m.mo51675b();
        try {
            super.onDestroy();
            this.f353629q = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C47573bx u = this.f353625m.mo51694u();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            if (u != null) {
                u.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f353625m.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f353625m.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f353625m.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f353625m.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f353625m.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f353625m.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
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
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f353625m.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f353625m.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f353625m.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f353625m.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f353625m.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f353625m.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128632c.m209934a(th, th);
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
        C128634e eVar = this.f353624l;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f353629q) {
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
