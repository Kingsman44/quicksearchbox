package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.gsa.nga.engine.as.k;
import com.google.android.apps.gsa.nga.engine.b.e;
import com.google.android.apps.gsa.nga.engine.education.pie.C75906g;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.engine.p5978b.C75190c;
import com.google.android.apps.gsa.nga.engine.p5978b.C75214d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76088d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.p1879c.C22867c;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.s */
/* compiled from: PG */
public final class C75852s extends BroadcastReceiver implements C75906g, C75864b, C75214d, k, C76088d {

    /* renamed from: a */
    public static final C58974d f210472a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f210473b;

    /* renamed from: c */
    public final e f210474c;

    /* renamed from: d */
    public final C91142g f210475d;

    /* renamed from: e */
    public final C76092h f210476e;

    /* renamed from: f */
    public final AccessibilityManager f210477f;

    /* renamed from: g */
    public final C83357g f210478g = new C83361k(C80201av.PIE_ELIGIBILITY_UNKNOWN, C22867c.class);

    /* renamed from: h */
    public final AtomicBoolean f210479h = new AtomicBoolean(false);

    /* renamed from: i */
    public final C83363m f210480i = new C83363m();

    /* renamed from: j */
    private final Context f210481j;

    /* renamed from: k */
    private final C60836bq f210482k = new C60836bq();

    public C75852s(Context context, C22871g gVar, e eVar, C91142g gVar2, C76092h hVar, AccessibilityManager accessibilityManager) {
        this.f210481j = context;
        this.f210473b = gVar;
        this.f210474c = eVar;
        this.f210475d = gVar2;
        this.f210476e = hVar;
        this.f210477f = accessibilityManager;
    }

    /* renamed from: Q */
    public final void mo71863Q() {
        this.f210479h.set(true);
        mo71925f();
    }

    /* renamed from: a */
    public final C83358h mo71922a() {
        return this.f210478g;
    }

    /* renamed from: b */
    public final /* synthetic */ C80201av mo71923b() {
        return (C80201av) ((C83361k) this.f210478g).f227199b.get();
    }

    /* renamed from: d */
    public final boolean mo71924d() {
        return this.f210475d.mo85405j(C90126fx.f251377hf);
    }

    /* renamed from: e */
    public final void mo71496e(C75190c cVar) {
        mo71925f();
    }

    /* renamed from: f */
    public final void mo71925f() {
        C90875ai.m148465b(C75848o.f210468a, this.f210482k.mo57305b(new C75847n(this), C60826bg.f164896a), this.f210473b, "[NGA] PieEligibilityCheckerImpl.checkFuture").mo85223a(C75849p.f210469a);
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return ((C83361k) this.f210478g).f227199b.get() == C80201av.PIE_ELIGIBLE;
    }

    /* renamed from: gE */
    public final void mo71926gE(C58528ij ijVar) {
        mo71925f();
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        this.f210481j.registerReceiver(this, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        this.f210477f.addAccessibilityStateChangeListener(new C75845l(this));
        return this.f210473b.mo28201a("[NGA] PieEligibilityCheckerImpl.subscribe", new C75850q(this));
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        this.f210480i.mo76661a();
        this.f210477f.removeAccessibilityStateChangeListener(new C75845l(this));
        this.f210481j.unregisterReceiver(this);
        C83349aj.m132647b(this.f210473b, this.f210478g, C80201av.PIE_INELIGIBLE_UNINITIALIZED, "invalidate");
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "PieEligibilityChecker";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 14;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            mo71925f();
        }
    }
}
