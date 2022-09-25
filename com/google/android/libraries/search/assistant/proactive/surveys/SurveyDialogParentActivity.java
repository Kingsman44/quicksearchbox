package com.google.android.libraries.search.assistant.proactive.surveys;

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
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajz;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class SurveyDialogParentActivity extends C36347h implements C47231d, C47211g {

    /* renamed from: k */
    private C36362w f94902k;

    /* renamed from: l */
    private final C47851k f94903l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f94904m;

    /* renamed from: n */
    private Context f94905n;

    /* renamed from: o */
    private C2393x f94906o;

    /* renamed from: p */
    private boolean f94907p;

    public SurveyDialogParentActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m64838x() {
        if (this.f94902k != null) {
            return;
        }
        if (!this.f94904m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f94907p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo40128v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f94902k = ((C36363x) mo40128v().mo17653jN()).mo40139bI();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C36360u.m64880a(th, th);
                }
            } catch (Throwable th2) {
                C36360u.m64880a(th, th2);
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
            baseContext = this.f94905n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f94905n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f94905n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f94906o == null) {
            this.f94906o = new C47212h(this);
        }
        return this.f94906o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f94903l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f94903l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f94903l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f94903l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f94903l.mo51692s();
        try {
            this.f94904m = true;
            m64838x();
            ((C47212h) getLifecycle()).mo51120i(this.f94903l);
            ((C47237f) mo40128v().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m64838x();
            C36362w wVar = this.f94902k;
            C58976aa aaVar = C58975e.f156826a;
            wVar.f94963b.requestWindowFeature(1);
            wVar.f94963b.setContentView((int) R.layout.proactive_survey);
            this.f94904m = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f94903l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f94903l.mo51675b();
        try {
            super.onDestroy();
            this.f94907p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f94903l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f94903l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f94903l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f94903l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f94903l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f94903l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
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
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f94903l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f94903l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f94903l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f94903l.mo51680g();
        try {
            super.onStart();
            m64838x();
            C36362w wVar = this.f94902k;
            Intent intent = wVar.f94963b.getIntent();
            String stringExtra = intent.getStringExtra("survey-trigger-id");
            C58976aa aaVar = C58975e.f156826a;
            if (!C58837ba.m90859h(stringExtra)) {
                String stringExtra2 = intent.getStringExtra("grouping-key");
                String stringExtra3 = intent.getStringExtra("ved");
                ajz ajz = null;
                byte[] byteArrayExtra = intent.getByteArrayExtra("notification-logging-metadata");
                if (byteArrayExtra != null) {
                    ajz = (ajz) C62942bv.parseFrom((C62942bv) ajz.f158928q, byteArrayExtra, C62921ba.m95368a());
                }
                C36344e eVar = (C36344e) C36345f.f94924f.createBuilder();
                eVar.copyOnWrite();
                C36345f fVar = (C36345f) eVar.instance;
                stringExtra.getClass();
                fVar.f94926a |= 1;
                fVar.f94927b = stringExtra;
                if (!C58837ba.m90859h(stringExtra2)) {
                    eVar.copyOnWrite();
                    C36345f fVar2 = (C36345f) eVar.instance;
                    stringExtra2.getClass();
                    fVar2.f94926a |= 2;
                    fVar2.f94928c = stringExtra2;
                }
                if (!C58837ba.m90859h(stringExtra3)) {
                    eVar.copyOnWrite();
                    C36345f fVar3 = (C36345f) eVar.instance;
                    stringExtra3.getClass();
                    fVar3.f94926a |= 4;
                    fVar3.f94929d = stringExtra3;
                }
                if (ajz != null) {
                    eVar.copyOnWrite();
                    C36345f fVar4 = (C36345f) eVar.instance;
                    fVar4.f94930e = ajz;
                    fVar4.f94926a |= 8;
                }
                wVar.f94964c.f94960a = (C36345f) eVar.build();
            }
        } catch (C62974ct e) {
            C59104x c = C36362w.f94962a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotificationHatsSurv");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(52311)).mo56386p("Unable to parse OpaNotification logging metadata from notification intent.");
        } catch (Throwable th) {
            if (g != null) {
                try {
                    ((C47818f) g).f123842a.mo51690q();
                } catch (Throwable th2) {
                    C36360u.m64880a(th, th2);
                }
            }
            throw th;
        }
        if (g != null) {
            ((C47818f) g).f123842a.mo51690q();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f94903l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f94903l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C36360u.m64880a(th, th);
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
    public final /* synthetic */ C68314a mo40125w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C36362w wVar = this.f94902k;
        if (wVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f94907p) {
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
