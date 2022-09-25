package com.google.android.apps.search.lens;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28446p;
import com.google.android.libraries.logging.p2185ve.C28447q;
import com.google.android.libraries.logging.p2185ve.C28448r;
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
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59933co;
import com.google.common.p4552o.p4563i.C59935cq;
import com.google.lens.p4707j.C62433bj;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class LensShareEntryPointActivity extends C139932h implements C47231d, C47211g {

    /* renamed from: k */
    private C139951w f380345k;

    /* renamed from: l */
    private final C47851k f380346l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f380347m;

    /* renamed from: n */
    private Context f380348n;

    /* renamed from: o */
    private C2393x f380349o;

    /* renamed from: p */
    private boolean f380350p;

    public LensShareEntryPointActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m227528x() {
        if (this.f380345k != null) {
            return;
        }
        if (!this.f380347m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f380350p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo115344v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f380345k = ((C139952x) mo115344v().mo17653jN()).mo115354bt();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C139949u.m227589a(th, th);
                }
            } catch (Throwable th2) {
                C139949u.m227589a(th, th2);
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
            baseContext = this.f380348n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f380348n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f380348n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f380349o == null) {
            this.f380349o = new C47212h(this);
        }
        return this.f380349o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f380346l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f380346l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f380346l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f380346l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f380346l.mo51692s();
        try {
            this.f380347m = true;
            m227528x();
            ((C47212h) getLifecycle()).mo51120i(this.f380346l);
            ((C47237f) mo115344v().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m227528x();
            C139951w wVar = this.f380345k;
            try {
                Intent intent = wVar.f380410a.getIntent();
                String action = intent.getAction();
                if (action == null) {
                    throw new C139950v(5);
                } else if ("android.intent.action.SEND".equals(action)) {
                    String type = intent.getType();
                    if (type == null || !type.startsWith("image/")) {
                        throw new C139950v(2);
                    } else if (intent.hasExtra("android.intent.extra.STREAM")) {
                        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                        if (uri != null) {
                            wVar.f380410a.grantUriPermission("com.google.android.googlequicksearchbox", uri, 1);
                            C24970c cVar = new C24970c();
                            cVar.f68102j = wVar.f380410a.getPackageName();
                            cVar.f68096d = uri;
                            cVar.f68105m = C62433bj.GOOGLE_APP_SHARE_SHEET.f168594ao;
                            cVar.f68117y = true;
                            Bundle a = cVar.mo30192a();
                            wVar.f380411b.mo33856b(wVar.f380412c);
                            wVar.f380413d.mo115338b(a);
                            wVar.f380410a.finish();
                            this.f380347m = false;
                            if (s != null) {
                                ((C47818f) s).f123842a.mo51690q();
                                return;
                            }
                            return;
                        }
                        throw new C139950v(6);
                    } else {
                        throw new C139950v(3);
                    }
                } else {
                    throw new C139950v(4);
                }
            } catch (SecurityException e) {
                throw new C139950v((Throwable) e);
            } catch (C139950v e2) {
                C28448r rVar = wVar.f380411b;
                C28446p a2 = C28447q.m53152a(122151);
                C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
                C59933co coVar = (C59933co) C59935cq.f161984c.createBuilder();
                int i = e2.f380409a;
                coVar.copyOnWrite();
                C59935cq cqVar = (C59935cq) coVar.instance;
                int i2 = i - 1;
                if (i != 0) {
                    cqVar.f161987b = i2;
                    cqVar.f161986a |= 1;
                    bhVar.copyOnWrite();
                    C59900bi biVar = (C59900bi) bhVar.instance;
                    C59935cq cqVar2 = (C59935cq) coVar.build();
                    cqVar2.getClass();
                    biVar.f161897e = cqVar2;
                    biVar.f161893a |= 512;
                    a2.f77232a.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
                    a2.mo33898b(wVar.f380412c);
                    rVar.mo33855a(a2.mo33897a());
                    wVar.f380410a.finish();
                } else {
                    throw null;
                }
            }
        } catch (Throwable th) {
            if (s != null) {
                try {
                    ((C47818f) s).f123842a.mo51690q();
                } catch (Throwable th2) {
                    C139949u.m227589a(th, th2);
                }
            }
            throw th;
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f380346l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f380346l.mo51675b();
        try {
            super.onDestroy();
            this.f380350p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f380346l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f380346l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f380346l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f380346l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f380346l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f380346l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
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
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f380346l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f380346l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f380346l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f380346l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f380346l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f380346l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C139949u.m227589a(th, th);
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
    public final /* synthetic */ C68314a mo115334w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C139951w wVar = this.f380345k;
        if (wVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f380350p) {
            return wVar;
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
