package com.google.android.apps.search.googleapp.notifications.feedback;

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
import com.google.apps.tiktok.inject.p3659d.C47237f;
import com.google.apps.tiktok.inject.p3659d.C47241j;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
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
import com.google.p375ai.p378b.C7746ik;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56989y;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56990z;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C63088z;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68314a;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class InvokeSendFeedbackActivity extends C136772b implements C47231d, C47211g {

    /* renamed from: k */
    private C136774d f372301k;

    /* renamed from: l */
    private final C47851k f372302l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f372303m;

    /* renamed from: n */
    private Context f372304n;

    /* renamed from: o */
    private C2393x f372305o;

    /* renamed from: p */
    private boolean f372306p;

    public InvokeSendFeedbackActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m222373x() {
        if (this.f372301k != null) {
            return;
        }
        if (!this.f372303m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f372306p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo113357v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f372301k = ((C136775e) mo113357v().mo17653jN()).mo113359be();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C136773c.m222383a(th, th);
                }
            } catch (Throwable th2) {
                C136773c.m222383a(th, th2);
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
            baseContext = this.f372304n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f372304n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f372304n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f372305o == null) {
            this.f372305o = new C47212h(this);
        }
        return this.f372305o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f372302l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f372302l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f372302l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f372302l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C47573bx s = this.f372302l.mo51692s();
        try {
            this.f372303m = true;
            m222373x();
            ((C47212h) getLifecycle()).mo51120i(this.f372302l);
            ((C47237f) mo113357v().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m222373x();
            this.f372303m = false;
            if (s != null) {
                ((C47818f) s).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f372302l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f372302l.mo51675b();
        try {
            super.onDestroy();
            this.f372306p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f372302l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f372302l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f372302l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f372302l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f372302l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f372302l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
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
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f372302l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f372302l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f372302l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C136774d dVar;
        C47474k g;
        C56990z zVar;
        C47573bx g2 = this.f372302l.mo51680g();
        try {
            super.onStart();
            m222373x();
            dVar = this.f372301k;
            g = C47475l.m84477g();
            ((C47465c) g).f123249a = "com.google.android.googlequicksearchbox.NOTIFICATIONS_AGA";
            g.mo51310d(false);
            String num = Integer.toString(C7746ik.MODULE.f27108J);
            C69664n.m101060f(num, "toString(EntryType.MODULE.getNumber())");
            C63088z E = C63088z.m96143E(num);
            C46663a aVar = new C46663a();
            aVar.mo50686d(dVar.mo113358e(E));
            aVar.f121916a = E;
            aVar.mo50684b(false);
            C46669g a = aVar.mo50683a();
            C69664n.m101060f(a, "builder.build()");
            g.mo51333f("Entry type", a);
            Intent intent = dVar.f372312b.getIntent();
            if (intent.hasExtra("googleapp_notifications_googlefeedback")) {
                zVar = (C56990z) ProtoParsers.m95519b(intent, "googleapp_notifications_googlefeedback", C56990z.f152131b, C62921ba.m95368a());
                if (zVar != null) {
                    for (C56989y yVar : zVar.f152133a) {
                        int i = yVar.f152128a;
                        if (!((i & 1) == 0 || (i & 2) == 0)) {
                            String str = yVar.f152129b;
                            String str2 = yVar.f152130c;
                            C69664n.m101060f(str2, "fd.value");
                            C63088z E2 = C63088z.m96143E(str2);
                            C46663a aVar2 = new C46663a();
                            aVar2.mo50686d(dVar.mo113358e(E2));
                            aVar2.f121916a = E2;
                            aVar2.mo50684b(true);
                            C46669g a2 = aVar2.mo50683a();
                            C69664n.m101060f(a2, "builder.build()");
                            g.mo51333f(str, a2);
                        }
                    }
                }
            }
        } catch (Exception e) {
            C59052c cVar = (C59052c) ((C59052c) C136774d.f372311a.mo56225c()).mo56382g(e);
            cVar.mo56379ah(new C59094n(40825));
            cVar.mo56386p("Unable to parse GoogleFeedback");
            zVar = null;
        } catch (Throwable th) {
            if (g2 != null) {
                try {
                    ((C47818f) g2).f123842a.mo51690q();
                } catch (Throwable th2) {
                    C136773c.m222383a(th, th2);
                }
            }
            throw th;
        }
        dVar.f372313c.mo51336a(g.mo51332e());
        dVar.f372312b.finish();
        if (g2 != null) {
            ((C47818f) g2).f123842a.mo51690q();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f372302l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f372302l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C136773c.m222383a(th, th);
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
    public final /* synthetic */ C68314a mo113356w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C136774d dVar = this.f372301k;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f372306p) {
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
