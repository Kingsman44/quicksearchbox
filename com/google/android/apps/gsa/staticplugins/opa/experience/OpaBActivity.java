package com.google.android.apps.gsa.staticplugins.opa.experience;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0395p;
import android.text.TextUtils;
import android.view.WindowManager;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.p5787e.p5789b.C73652b;
import com.google.android.apps.gsa.assistant.shared.h.a;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73870b;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73872d;
import com.google.android.apps.gsa.binaries.satin.app.adk;
import com.google.android.apps.gsa.binaries.satin.app.adm;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.ars;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7148ui.C90643as;
import com.google.android.apps.gsa.shared.p7148ui.SwipeDismissableFrameLayout;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107071k;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109021i;
import com.google.android.apps.gsa.staticplugins.opa.samson.activity.C110041t;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.AmbientBiometricsUnlockController;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.C110107e;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.lifecycleobservers.C110114a;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.OpaAmbientUiStatus;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110262ab;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110265b;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110331aq;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110332ar;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.ActivityIdleDismissController;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110405b;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110407d;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110410g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.akp;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class OpaBActivity extends C0395p implements C110107e, C73870b, C110407d, C90643as, C110331aq {

    /* renamed from: j */
    public static final C59071e f303125j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.experience.OpaBActivity");

    /* renamed from: A */
    public C68214a f303126A;

    /* renamed from: B */
    BroadcastReceiver f303127B;

    /* renamed from: C */
    PendingIntent f303128C;

    /* renamed from: D */
    AlarmManager f303129D;

    /* renamed from: E */
    public SwipeDismissableFrameLayout f303130E;

    /* renamed from: k */
    public a f303131k;

    /* renamed from: l */
    public C110410g f303132l;

    /* renamed from: m */
    public C110405b f303133m;

    /* renamed from: n */
    public C68214a f303134n;

    /* renamed from: o */
    public AmbientBiometricsUnlockController f303135o;

    /* renamed from: p */
    public C107071k f303136p;

    /* renamed from: q */
    public C69464a f303137q;

    /* renamed from: r */
    public C86124t f303138r;

    /* renamed from: s */
    public C22871g f303139s;

    /* renamed from: t */
    public C22871g f303140t;

    /* renamed from: u */
    public C21370a f303141u;

    /* renamed from: v */
    public boolean f303142v;

    /* renamed from: w */
    public OpaAmbientUiStatus f303143w;

    /* renamed from: x */
    public C110114a f303144x;

    /* renamed from: y */
    public C110265b f303145y;

    /* renamed from: z */
    public C58833ax f303146z;

    /* renamed from: C */
    private final void m181327C(String str) {
        String x = this.f303138r.mo79758x(C90014bt.f247195ca);
        if (!TextUtils.isEmpty(x) && !TextUtils.isEmpty(str)) {
            try {
                getApplicationContext().getContentResolver().call(Uri.parse(x), str, (String) null, (Bundle) null);
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) f303125j.mo56225c()).mo56382g(th)).mo56372aa(24484)).mo56386p("exception while calling provider");
            }
        }
    }

    /* renamed from: D */
    private final void m181328D() {
        this.f303139s.mo28213m("finish activity", (long) ((int) this.f303138r.mo79743a(C90014bt.f247139bX)), new C109016d(this));
    }

    /* renamed from: E */
    private final void m181329E(int i) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
        }
        attributes.layoutInDisplayCutoutMode = i2;
        getWindow().setAttributes(attributes);
    }

    /* renamed from: A */
    public final void mo97369A(boolean z) {
        if (this.f303142v && Boolean.TRUE.equals(Boolean.valueOf(z))) {
            ((C59052c) ((C59052c) f303125j.mo56224b()).mo56372aa(24491)).mo56386p("Activity idled.");
            mo97374x(8);
        }
    }

    /* renamed from: B */
    public final void mo97370B() {
        mo97374x(2);
    }

    /* renamed from: c */
    public final void mo84936c() {
        if (((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked()) {
            this.f303130E.setVisibility(8);
            this.f303136p.mo95770e(new C109020h(this));
            return;
        }
        mo97374x(5);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, true != this.f303142v ? R.anim.photos_fade_out : R.anim.photos_charging_ambient_fade_out);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m181329E(configuration.orientation);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        akp akp;
        C74504a.m120462a(f.aq);
        overridePendingTransition(R.anim.photos_fade_in, 0);
        boolean z = getIntent() != null && getIntent().getBooleanExtra("use_charging", false);
        C109021i iVar = new C109021i(this);
        if (iVar.f303164b == null) {
            ((C109021i.C109022a) C47266f.m84076a(iVar.f303163a, C109021i.C109022a.class)).mo97391qH(iVar);
        }
        adk adk = iVar.f303164b;
        adk.f195522b = this;
        adk.f195523c = this;
        adk.f195524d = Boolean.valueOf(z);
        if (z) {
            akp = akp.PHOTO_SCREEN;
        } else {
            akp = akp.UNKNOWN_AMBIENT_SCREEN;
        }
        akp.getClass();
        adk.f195525e = akp;
        adk.f195526f = this;
        adk.f195527g = this;
        adk.f195528h = this;
        C68225k.m98529a(adk.f195522b, Activity.class);
        C68225k.m98529a(adk.f195523c, C2391v.class);
        C68225k.m98529a(adk.f195524d, Boolean.class);
        C68225k.m98529a(adk.f195525e, akp.class);
        C68225k.m98529a(adk.f195526f, C110407d.class);
        C68225k.m98529a(adk.f195527g, C110107e.class);
        C68225k.m98529a(adk.f195528h, C110331aq.class);
        adm adm = new adm(adk.f195521a, adk.f195522b, adk.f195523c, adk.f195524d, adk.f195525e, adk.f195526f, adk.f195527g, adk.f195528h);
        ars ars = adm.d.b;
        this.f303131k = new a(C58495hd.m89902p(com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.e.a.f.class, ars.f200170eY, C73652b.class, ars.f200171eZ, C110332ar.class, adm.e));
        aqy aqy = adm.d;
        C69464a aVar = aqy.g;
        asp asp = aqy.a;
        this.f303132l = new C110410g(aVar, asp.f202864fC, asp.f202761dF, aqy.ic);
        aqy aqy2 = adm.d;
        this.f303133m = new C110405b(aqy2.g, aqy2.b.f200225fa);
        this.f303134n = C68219e.m98518a(adm.f);
        this.f303135o = new AmbientBiometricsUnlockController((C86124t) adm.d.a.f202006C.mo17428b(), (C22871g) adm.d.aT.mo17428b(), (Activity) ((C68221g) adm.g).f184583a, adm.b);
        this.f303136p = (C107071k) adm.h.mo17428b();
        this.f303137q = adm.i;
        C68219e.m98518a(adm.j);
        this.f303138r = (C86124t) adm.d.a.f202006C.mo17428b();
        this.f303139s = (C22871g) adm.d.aT.mo17428b();
        this.f303140t = (C22871g) adm.d.aU.mo17428b();
        this.f303141u = (C21370a) adm.d.i.mo17428b();
        this.f303142v = ((Boolean) ((C68221g) adm.k).f184583a).booleanValue();
        this.f303143w = (OpaAmbientUiStatus) adm.d.ic.mo17428b();
        this.f303144x = (C110114a) adm.d.a.f202763dH.mo17428b();
        this.f303145y = (C110265b) adm.l.mo17428b();
        this.f303146z = (C58833ax) adm.d.b.f200229fe.mo17428b();
        this.f303126A = C68219e.m98518a(adm.d.a.f202730cb);
        super.onCreate(bundle);
        this.f303145y.mo98510b((C110262ab) new C2368bp(this).mo5770a(C110262ab.class));
        setContentView((int) R.layout.activity_opab);
        SwipeDismissableFrameLayout swipeDismissableFrameLayout = (SwipeDismissableFrameLayout) findViewById(R.id.opa_fragment_container);
        this.f303130E = swipeDismissableFrameLayout;
        boolean z2 = this.f303142v;
        swipeDismissableFrameLayout.f253392g = z2;
        swipeDismissableFrameLayout.f253387b = this;
        this.f303132l.mo98647a(new C109017e(this), z2).mo98645b(this);
        if (this.f303138r.mo79746e(C90014bt.f247164bw)) {
            this.f303133m.mo98646a(new C109018f(this)).mo98643a(this);
        }
        if (this.f303142v) {
            this.f303135o.mo98334b(this);
            getLifecycle().mo5790b(this.f303144x);
            ((ActivityIdleDismissController) this.f303134n.mo27525b()).mo98644a(this);
        }
        this.f303143w.mo98392e(this);
        m181329E(getResources().getConfiguration().orientation);
        this.f303136p.mo95766a();
        getWindow().addFlags(C89885b.S3REQUEST_VALUE);
        if (bundle == null) {
            C69464a aVar2 = this.f303137q;
            C0154a aVar3 = new C0154a(mo545jw());
            aVar3.mo689v(R.id.opa_fragment_container, (Fragment) aVar2.mo17428b(), (String) null);
            aVar3.mo505b(false);
        }
        this.f303129D = (AlarmManager) getApplicationContext().getSystemService("alarm");
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f303136p.mo95768c();
    }

    public final void onStart() {
        super.onStart();
        if (this.f303138r.mo79743a(C90014bt.f247137bV) > 0) {
            new C90873ag(((C89037bh) this.f303126A.mo27525b()).mo27378c(), this.f303140t, "getConnectivityInfoFuture", new C109014b(this)).mo85223a(new C109015c(this));
        }
        int a = (int) this.f303138r.mo79743a(C90014bt.f247138bW);
        if (a > 0) {
            Context applicationContext = getApplicationContext();
            this.f303127B = new C109019g(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.apps.gsa.staticplugins.opa.experience.ACTION_TIME_OUT");
            applicationContext.registerReceiver(this.f303127B, intentFilter);
            this.f303128C = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("com.google.android.apps.gsa.staticplugins.opa.experience.ACTION_TIME_OUT"), 335544320);
            this.f303129D.setWindow(1, this.f303141u.mo26870b() + ((long) a), 100, this.f303128C);
        }
        if (this.f303138r.mo79746e(C90014bt.f247118bC)) {
            m181327C("immersiveStarted");
        }
    }

    public final void onStop() {
        if (this.f303127B != null) {
            getApplicationContext().unregisterReceiver(this.f303127B);
            this.f303127B = null;
        }
        PendingIntent pendingIntent = this.f303128C;
        if (pendingIntent != null) {
            this.f303129D.cancel(pendingIntent);
        }
        super.onStop();
        if (getWindowManager().getDefaultDisplay().getState() == 1) {
            if (this.f303142v) {
                setResult(-1, new Intent().putExtra("PHOTOS_EXTRA_EXIT_REASON", 1));
                if (!this.f303138r.mo79746e(C90014bt.f247069aG)) {
                    this.f303143w.f306843a = true;
                    PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(268435482, "agsa:opa-amb-opa-b");
                    newWakeLock.acquire(200);
                    try {
                        newWakeLock.release();
                    } catch (RuntimeException unused) {
                    }
                    finish();
                } else {
                    this.f303143w.f306844b = true;
                }
            } else {
                m181328D();
            }
        }
        if (this.f303138r.mo79746e(C90014bt.f247118bC)) {
            m181327C("immersiveDone");
        }
    }

    public final void onUserInteraction() {
        super.onUserInteraction();
        if (this.f303142v) {
            ((ActivityIdleDismissController) this.f303134n.mo27525b()).f307715k.mo98404b();
        }
    }

    /* renamed from: v */
    public final void mo97373v() {
        if (this.f303142v) {
            mo97374x(9);
        } else {
            mo97375y();
        }
    }

    /* renamed from: w */
    public final C73872d mo65346w() {
        return this.f303131k;
    }

    /* renamed from: x */
    public final void mo97374x(int i) {
        if (!this.f303142v) {
            if (i == 2 || i == 4 || i == 9) {
                mo97375y();
            } else {
                finishAfterTransition();
            }
        } else if (!isFinishing()) {
            if (getCallingActivity() != null) {
                setResult(-1, new Intent().putExtra("PHOTOS_EXTRA_EXIT_REASON", i));
                finishAfterTransition();
            } else if (this.f303146z.mo56113h()) {
                Bundle bundle = new Bundle();
                bundle.putInt("PHOTOS_EXTRA_EXIT_REASON", i);
                C58833ax a = ((C110041t) this.f303146z.mo56107c()).mo98330a(this, bundle, true);
                if (a.mo56113h()) {
                    startActivity((Intent) a.mo56107c());
                    finishAfterTransition();
                }
            }
            this.f303143w.f306843a = false;
        }
    }

    /* renamed from: y */
    public final void mo97375y() {
        if (getLifecycle().mo5789a() == C2383n.RESUMED) {
            m181327C(this.f303138r.mo79758x(C90014bt.f247141bZ));
        }
        m181328D();
    }

    /* renamed from: z */
    public final void mo97376z() {
        setResult(-1, new Intent().putExtra("PHOTOS_EXTRA_EXIT_REASON", 0));
        super.finish();
    }

    public final void onBackPressed() {
        if (this.f303142v) {
            mo97374x(6);
        } else {
            this.f2707h.mo3340c();
        }
    }
}
