package com.google.apps.tiktok.tracing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C2382m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import dagger.hilt.C68286a;

/* renamed from: com.google.apps.tiktok.tracing.k */
/* compiled from: PG */
public final class C47851k {

    /* renamed from: a */
    public C47572bw f123903a;

    /* renamed from: b */
    public boolean f123904b = false;

    /* renamed from: c */
    public C47573bx f123905c;

    /* renamed from: d */
    private final Runnable f123906d = new C47791e(this);

    /* renamed from: e */
    private final Activity f123907e;

    /* renamed from: f */
    private final Context f123908f;

    /* renamed from: g */
    private final C47573bx f123909g = new C47818f(this);

    /* renamed from: h */
    private final C47573bx f123910h = new C47846g(this);

    /* renamed from: i */
    private C47572bw f123911i;

    /* renamed from: j */
    private boolean f123912j = false;

    /* renamed from: k */
    private boolean f123913k = false;

    /* renamed from: l */
    private C47573bx f123914l;

    /* renamed from: m */
    private C47573bx f123915m;

    public C47851k(Activity activity, Context context) {
        this.f123907e = activity;
        this.f123908f = context;
    }

    /* renamed from: A */
    private final String m85049A(String str) {
        String simpleName = this.f123908f.getClass().getSimpleName();
        return str + " " + simpleName;
    }

    /* renamed from: B */
    private final void m85050B(String str, String str2, Intent intent) {
        C47563bn bnVar;
        this.f123911i = C47831fm.m85009d();
        C47572bw x = C47810es.m84984x(intent);
        C47563bn bnVar2 = C47569bt.f123457b;
        C47850j jVar = new C47850j();
        C47561bl b = C47562bm.f123426a.mo51423b();
        b.mo51422a(C47569bt.f123458c, jVar);
        C47563bn e = ((C47563bn) b).mo51424e();
        if (x != null) {
            C47831fm.m85013h(x);
            this.f123903a = x;
            bnVar = m85053z(bnVar2);
        } else {
            this.f123913k = C47831fm.m85029x();
            if (!C47831fm.m85027v()) {
                C47572bw g = C47831fm.m85012g();
                if (g != null) {
                    this.f123914l = g;
                    C47831fm.m85013h(g);
                    this.f123915m = C47831fm.m85025t(m85049A(str), C47563bn.m84654d(e, C47569bt.m84665a(C47568bs.INTENT_TO_ACTIVITY)), true);
                } else {
                    this.f123914l = C47775dm.m84930a(this.f123908f).mo51615e(m85049A(str), C47563bn.m84654d(bnVar2, C47569bt.m84665a(C47568bs.INTENT_TO_ACTIVITY)));
                }
            } else {
                bnVar2 = m85053z(bnVar2);
            }
            this.f123903a = C47831fm.m85009d();
            bnVar = bnVar2;
        }
        this.f123905c = C47831fm.m85025t(m85049A(str2), C47563bn.m84654d(bnVar, C47569bt.m84665a(C47568bs.ACTIVITY_CREATE)), true);
        C19559g.m37302a().post(this.f123906d);
    }

    /* renamed from: C */
    private final void m85051C() {
        if (this.f123912j) {
            this.f123903a = null;
            this.f123912j = false;
        }
    }

    /* renamed from: D */
    private final void m85052D() {
        C47573bx bxVar = this.f123905c;
        if (bxVar != null) {
            throw new IllegalStateException("Expected lifecycleStepSpan to be null but was:".concat(bxVar.toString()));
        }
    }

    /* renamed from: z */
    private final C47563bn m85053z(C47563bn bnVar) {
        return C47563bn.m84654d(bnVar, C47563bn.m84653c(((C47778dn) C68286a.m98629a(this.f123908f, C47778dn.class)).mo51620cW()));
    }

    /* renamed from: a */
    public final C47573bx mo51674a() {
        m85052D();
        return new C47576c(mo51684k("Back pressed"), C47831fm.m85028w());
    }

    /* renamed from: b */
    public final C47573bx mo51675b() {
        mo51689p("onDestroy", C47569bt.m84665a(C47568bs.ACTIVITY_DESTROY));
        return new C47849i(this);
    }

    /* renamed from: c */
    public final C47573bx mo51676c(Intent intent) {
        C58838bb.m90883r(this.f123907e != null);
        m85050B("Reintenting into", "onNewIntent", intent);
        return this.f123909g;
    }

    /* renamed from: d */
    public final C47573bx mo51677d() {
        mo51689p("onPause", C47569bt.m84665a(C47568bs.ACTIVITY_PAUSE));
        return this.f123910h;
    }

    /* renamed from: e */
    public final C47573bx mo51678e() {
        this.f123911i = C47831fm.m85009d();
        C47831fm.m85013h(this.f123903a);
        return new C47762d(this);
    }

    /* renamed from: f */
    public final C47573bx mo51679f() {
        m85051C();
        mo51689p("onResume", C47569bt.m84665a(C47568bs.ACTIVITY_RESUME));
        return this.f123909g;
    }

    /* renamed from: g */
    public final C47573bx mo51680g() {
        m85051C();
        mo51689p("onStart", C47569bt.m84665a(C47568bs.ACTIVITY_START));
        return this.f123909g;
    }

    /* renamed from: h */
    public final C47573bx mo51681h() {
        mo51689p("onStop", C47569bt.m84665a(C47568bs.ACTIVITY_STOP));
        return this.f123910h;
    }

    /* renamed from: i */
    public final C47573bx mo51682i() {
        m85052D();
        return mo51684k("onSupportNavigateUp");
    }

    /* renamed from: j */
    public final C47573bx mo51683j() {
        m85052D();
        return mo51684k("onUserInteraction");
    }

    /* renamed from: k */
    public final C47573bx mo51684k(String str) {
        if (C47831fm.m85027v()) {
            return C47831fm.m85007b(str, m85053z(C47562bm.f123426a));
        }
        return C47775dm.m84930a(this.f123908f).mo51613c(str);
    }

    /* renamed from: l */
    public final /* synthetic */ void mo51685l() {
        mo51690q();
        mo51688o();
        this.f123903a = null;
    }

    /* renamed from: m */
    public final /* synthetic */ void mo51686m() {
        this.f123903a = null;
        C47831fm.m85013h(this.f123911i);
        this.f123911i = null;
    }

    /* renamed from: n */
    public final void mo51687n(C2382m mVar) {
        C2382m mVar2 = C2382m.ON_CREATE;
        int ordinal = mVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
                mo51690q();
                return;
            }
            throw new UnsupportedOperationException("Unknown lifecycle: ".concat(String.valueOf(String.valueOf(mVar))));
        } else if (this.f123904b) {
            mo51690q();
            this.f123904b = false;
        }
    }

    /* renamed from: o */
    public final void mo51688o() {
        this.f123912j = true;
        Activity activity = this.f123907e;
        if (activity != null && !activity.isChangingConfigurations() && !this.f123907e.isFinishing()) {
            this.f123903a = null;
        }
    }

    /* renamed from: p */
    public final void mo51689p(String str, C47563bn bnVar) {
        this.f123911i = C47831fm.m85009d();
        C47563bn d = C47563bn.m84654d(C47569bt.f123457b, bnVar);
        C47572bw bwVar = this.f123903a;
        if (bwVar != null) {
            C47831fm.m85013h(bwVar);
            d = m85053z(d);
        } else {
            this.f123913k = C47831fm.m85029x();
            if (!C47831fm.m85027v()) {
                C47770dh a = C47775dm.m84930a(this.f123908f);
                String simpleName = this.f123908f.getClass().getSimpleName();
                this.f123914l = a.f123762a.mo51621b(simpleName + ": " + str, C47563bn.m84654d(a.f123763b, d), a.f123764c);
            } else {
                d = m85053z(d);
            }
            this.f123903a = C47831fm.m85009d();
        }
        this.f123905c = C47831fm.m85025t(m85049A(str), d, true);
    }

    /* renamed from: q */
    public final void mo51690q() {
        C47573bx bxVar = this.f123905c;
        bxVar.getClass();
        bxVar.close();
        this.f123905c = null;
        if (this.f123913k) {
            this.f123913k = false;
            C47831fm.m85019n();
        }
        C47573bx bxVar2 = this.f123915m;
        if (bxVar2 != null) {
            bxVar2.close();
            this.f123915m = null;
        }
        C47573bx bxVar3 = this.f123914l;
        if (bxVar3 != null) {
            bxVar3.close();
            this.f123914l = null;
        }
        C47831fm.m85013h(this.f123911i);
        this.f123911i = null;
    }

    /* renamed from: r */
    public final C47573bx mo51691r() {
        m85052D();
        return mo51684k("onActivityResult");
    }

    /* renamed from: s */
    public final C47573bx mo51692s() {
        Activity activity = this.f123907e;
        if (activity != null) {
            m85050B("Intenting into", "onCreate", activity.getIntent());
        } else {
            m85051C();
            mo51689p("onCreate", C47569bt.m84665a(C47568bs.ACTIVITY_CREATE));
        }
        return this.f123909g;
    }

    /* renamed from: t */
    public final C47573bx mo51693t() {
        C47831fm.m85023r();
        C47825fg fgVar = C47825fg.f123846a;
        if (C47831fm.m85027v()) {
            return fgVar;
        }
        return new C47848h(C47775dm.m84930a(this.f123908f).mo51612b(this.f123908f.getClass(), "onCreatePanelMenu"));
    }

    /* renamed from: u */
    public final C47573bx mo51694u() {
        m85052D();
        return mo51684k("onMenuItemSelected");
    }

    /* renamed from: v */
    public final C47573bx mo51695v() {
        m85052D();
        return mo51684k("onOptionsItemSelected");
    }

    /* renamed from: w */
    public final C47573bx mo51696w() {
        m85052D();
        return mo51684k("onPictureInPictureModeChanged");
    }

    /* renamed from: x */
    public final C47573bx mo51697x() {
        m85051C();
        mo51689p("onPostCreate", C47562bm.f123426a);
        return this.f123909g;
    }

    /* renamed from: y */
    public final C47573bx mo51698y() {
        mo51689p("onSaveInstanceState", C47562bm.f123426a);
        return this.f123910h;
    }
}
