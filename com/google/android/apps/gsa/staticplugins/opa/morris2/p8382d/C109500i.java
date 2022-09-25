package com.google.android.apps.gsa.staticplugins.opa.morris2.p8382d;

import android.content.Context;
import android.os.IBinder;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.shared.d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8391b.C109614a;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109658ac;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i.C109694g;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13325i;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14987i;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14746p;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14483kx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14485kz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14498ll;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1073a.C14638a;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15111ae;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.d.i */
/* compiled from: PG */
public final class C109500i implements C109492a, C2391v, C14987i {

    /* renamed from: a */
    public static final C59071e f304966a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.d.i");

    /* renamed from: b */
    public final C14986h f304967b;

    /* renamed from: c */
    public final C15111ae f304968c;

    /* renamed from: d */
    public final C109694g f304969d;

    /* renamed from: e */
    public final C14638a f304970e;

    /* renamed from: f */
    public final C86124t f304971f;

    /* renamed from: g */
    public final C13325i f304972g;

    /* renamed from: h */
    public final C21370a f304973h;

    /* renamed from: i */
    public final Context f304974i;

    /* renamed from: j */
    public final C14113an f304975j;

    /* renamed from: k */
    public final C14115ap f304976k;

    /* renamed from: l */
    public final Executor f304977l;

    /* renamed from: m */
    public final C2393x f304978m;

    /* renamed from: n */
    public final C60888db f304979n;

    /* renamed from: o */
    public final Runnable f304980o;

    /* renamed from: p */
    public Optional f304981p = Optional.empty();

    /* renamed from: q */
    List f304982q;

    /* renamed from: r */
    C60870cx f304983r;

    /* renamed from: s */
    String f304984s;

    /* renamed from: t */
    private final Executor f304985t;

    /* renamed from: u */
    private final d f304986u;

    /* renamed from: v */
    private final C109614a f304987v;

    /* renamed from: w */
    private final C109658ac f304988w;

    /* renamed from: x */
    private final AtomicReference f304989x = new AtomicReference();

    /* renamed from: y */
    private OptionalLong f304990y = OptionalLong.empty();

    public C109500i(Executor executor, d dVar, C14986h hVar, C15111ae aeVar, C109694g gVar, C109614a aVar, C14638a aVar2, C86124t tVar, C13325i iVar, C21370a aVar3, Context context, C14113an anVar, C14115ap apVar, C60888db dbVar, C109658ac acVar) {
        C60888db dbVar2 = dbVar;
        this.f304985t = executor;
        this.f304986u = dVar;
        this.f304967b = hVar;
        this.f304968c = aeVar;
        this.f304969d = gVar;
        this.f304987v = aVar;
        this.f304970e = aVar2;
        this.f304979n = dbVar2;
        this.f304980o = new C109495d(this);
        this.f304971f = tVar;
        this.f304972g = iVar;
        this.f304973h = aVar3;
        this.f304974i = context;
        this.f304975j = anVar;
        this.f304976k = apVar;
        this.f304977l = dbVar2;
        this.f304988w = acVar;
        C2393x xVar = new C2393x(this);
        this.f304978m = xVar;
        xVar.mo5794f(C2383n.INITIALIZED);
    }

    /* renamed from: a */
    public final IBinder mo97856a() {
        C58976aa aaVar = C58975e.f156826a;
        IBinder iBinder = (IBinder) this.f304989x.get();
        if (iBinder != null) {
            return iBinder;
        }
        C59104x c = f304966a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.MiniCtrl");
        ((C59052c) ((C59052c) c).mo56372aa(24970)).mo56386p("#getWindowToken(): Token is not present");
        this.f304975j.mo21423a(C37182a.f97988eH.mo40805c(C62722b.ABORTED));
        this.f304976k.mo21431e(C37182a.f98077fr.mo40813g());
        C14986h hVar = this.f304967b;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14483kx kxVar = (C14483kx) C14485kz.f43772d.createBuilder();
        kxVar.copyOnWrite();
        ((C14485kz) kxVar.instance).f43774a = 12;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14485kz kzVar = (C14485kz) kxVar.build();
        kzVar.getClass();
        lfVar.f43799b = kzVar;
        lfVar.f43798a = 1;
        hVar.mo21875g((C14492lf) gtVar.build());
        return null;
    }

    /* renamed from: b */
    public final void mo97857b() {
        this.f304990y = OptionalLong.m71641of(this.f304973h.mo26870b() + 1000);
    }

    /* renamed from: c */
    public final void mo97858c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f304978m.mo5794f(C2383n.CREATED);
        this.f304967b.mo21876h(this);
        if (!this.f304970e.mo21580n()) {
            this.f304986u.a().mo5704e(this, new C109497f(this));
        }
    }

    /* renamed from: d */
    public final void mo97859d() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f304978m.f6612c == C2383n.STARTED || mo97863h()) {
            mo97868j();
        }
        this.f304978m.mo5794f(C2383n.DESTROYED);
    }

    /* renamed from: e */
    public final void mo97860e(C17823i iVar, String str, Optional optional, Optional optional2) {
        C58976aa aaVar = C58975e.f156826a;
        boolean z = false;
        if (optional2.isPresent() && ((Boolean) optional2.get()).booleanValue() && this.f304990y.isPresent() && this.f304973h.mo26870b() <= this.f304990y.getAsLong()) {
            z = true;
        }
        this.f304990y = OptionalLong.empty();
        if (z) {
            this.f304981p = Optional.m71637of(iVar);
            iVar.name();
            return;
        }
        this.f304981p = Optional.empty();
        C17823i iVar2 = C17823i.UNKNOWN;
        int ordinal = iVar.ordinal();
        if (ordinal == 1) {
            if (this.f304967b.mo21879k()) {
                this.f304976k.mo21431e(C37182a.f98082fw.mo40813g());
            }
            this.f304967b.mo21875g(C14746p.m31070c());
            this.f304967b.mo21874f();
        } else if (ordinal == 2) {
            this.f304976k.mo21431e(C37182a.f98081fv.mo40813g());
            C14986h hVar = this.f304967b;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14483kx kxVar = (C14483kx) C14485kz.f43772d.createBuilder();
            kxVar.copyOnWrite();
            ((C14485kz) kxVar.instance).f43774a = 11;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14485kz kzVar = (C14485kz) kxVar.build();
            kzVar.getClass();
            lfVar.f43799b = kzVar;
            lfVar.f43798a = 1;
            hVar.mo21875g((C14492lf) gtVar.build());
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                C59104x d = f304966a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.MiniCtrl");
                ((C59052c) ((C59052c) d).mo56372aa(24977)).mo56387q("#onNavigationStateChanged(). invalid navigationState: %d", iVar.f51144f);
            }
        } else if (optional.isEmpty() || !((Boolean) optional.get()).booleanValue()) {
            C59104x b = f304966a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.MiniCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(24978)).mo56386p("#onNavigationStateChanged(): host app check for Morris eligibility was false.");
        } else if (!this.f304988w.mo97945e()) {
            C59104x d2 = f304966a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.MiniCtrl");
            ((C59052c) ((C59052c) d2).mo56372aa(24979)).mo56386p("Driving mode not eligible, not launching.");
        } else {
            this.f304975j.mo21425c(C37182a.f97992eL.mo40813g());
            this.f304967b.mo21875g(C14746p.m31068a(str));
        }
    }

    /* renamed from: f */
    public final void mo97861f() {
        Executor executor = this.f304985t;
        C15111ae aeVar = this.f304968c;
        Objects.requireNonNull(aeVar);
        executor.execute(C47810es.m84977q(new C109498g(aeVar)));
    }

    /* renamed from: g */
    public final void mo97862g(IBinder iBinder) {
        C58976aa aaVar = C58975e.f156826a;
        this.f304989x.set(iBinder);
    }

    public final C2384o getLifecycle() {
        return this.f304978m;
    }

    /* renamed from: h */
    public final boolean mo97863h() {
        return this.f304978m.f6612c == C2383n.RESUMED;
    }

    /* renamed from: i */
    public final void mo97864i(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo97863h()) {
            C59104x d = f304966a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MiniCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(24975)).mo56386p("#onKeyguardDismissStatusChanged(): Morris is not resumed.");
            return;
        }
        this.f304987v.mo97913b(i);
    }

    /* renamed from: j */
    public final void mo97868j() {
        C58976aa aaVar = C58975e.f156826a;
        this.f304976k.mo21430d(C37182a.f98000eT.mo40813g(), this.f304967b.mo21872d());
        if (mo97863h() && mo97863h()) {
            this.f304978m.mo5794f(C2383n.STARTED);
            mo97869k();
            this.f304981p = Optional.empty();
        }
        this.f304978m.mo5794f(C2383n.CREATED);
    }

    /* renamed from: k */
    public final void mo97869k() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f304983r;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f304983r = null;
        }
    }

    /* renamed from: n */
    public final void mo21881n(C14499lm lmVar) {
        this.f304985t.execute(C47810es.m84977q(new C109496e(this, C14498ll.m30626a(lmVar.f43850a), lmVar)));
    }
}
