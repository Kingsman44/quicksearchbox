package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91770f;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91771g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91773i;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91872n;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91873o;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91874p;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104335bj;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104337bl;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104443f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104466b;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104844e;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104845f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105039t;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23302r;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7973qv;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.j */
/* compiled from: PG */
public abstract class C104823j extends C22939d implements C91770f, C23302r, C91873o {

    /* renamed from: a */
    protected final C91773i f292071a;

    /* renamed from: b */
    public final C104337bl f292072b;

    /* renamed from: c */
    private final C104466b f292073c;

    /* renamed from: d */
    private final C104443f f292074d;

    /* renamed from: e */
    private final C58833ax f292075e;

    /* renamed from: f */
    private final C58833ax f292076f;

    /* renamed from: g */
    private final C91866h f292077g;

    /* renamed from: h */
    private final boolean f292078h;

    /* renamed from: i */
    private final C104845f f292079i;

    /* renamed from: j */
    private final boolean f292080j;

    /* renamed from: k */
    private View.OnAttachStateChangeListener f292081k;

    /* renamed from: l */
    private boolean f292082l = false;

    public C104823j(C22945j jVar, C104466b bVar, C104443f fVar, C58833ax axVar, C58833ax axVar2, C91866h hVar, C91773i iVar, boolean z, C104337bl blVar, C104845f fVar2, boolean z2) {
        super(jVar);
        this.f292073c = bVar;
        this.f292074d = fVar;
        this.f292075e = axVar;
        this.f292076f = axVar2;
        this.f292077g = hVar;
        this.f292071a = iVar;
        this.f292078h = z;
        this.f292072b = blVar;
        this.f292079i = fVar2;
        this.f292080j = z2;
    }

    /* renamed from: e */
    public final int mo86264e() {
        return this.f292071a.f255919b;
    }

    /* renamed from: f */
    public final int mo86265f() {
        return this.f292071a.f255920c;
    }

    /* renamed from: g */
    public final int mo86266g(int i, List list, int i2) {
        return this.f292071a.mo86267h();
    }

    /* renamed from: h */
    public final int mo86267h() {
        return this.f292071a.mo86267h();
    }

    /* renamed from: iH */
    public final String mo28296iH() {
        return this.f63126Q.mo28342l();
    }

    /* renamed from: iZ */
    public final int mo86269iZ() {
        return this.f292071a.mo86269iZ();
    }

    /* renamed from: im */
    public void mo28298im() {
        if (this.f292075e.mo56113h()) {
            ((C91872n) this.f292075e.mo56107c()).mo86401e(this);
        }
        mo94300k().removeOnLayoutChangeListener(this.f292071a.f255921d);
        if (this.f292080j) {
            View il = mo28297il();
            if (!il.isAttachedToWindow()) {
                mo28806t();
            } else if (this.f292081k == null) {
                C104821h hVar = new C104821h(this);
                this.f292081k = hVar;
                il.addOnAttachStateChangeListener(hVar);
            }
        }
    }

    /* renamed from: iw */
    public void mo28299iw() {
        C104845f fVar = this.f292079i;
        View il = mo28297il();
        C22945j jVar = this.f63126Q;
        C104466b bVar = this.f292073c;
        C104443f fVar2 = this.f292074d;
        C104348l m = mo94301m();
        il.getClass();
        jVar.getClass();
        bVar.getClass();
        fVar2.getClass();
        m.getClass();
        C58833ax axVar = (C58833ax) fVar.f292178a.mo17428b();
        axVar.getClass();
        C58833ax axVar2 = (C58833ax) fVar.f292179b.mo17428b();
        axVar2.getClass();
        C58833ax axVar3 = (C58833ax) fVar.f292180c.mo17428b();
        axVar3.getClass();
        new C104844e(il, jVar, bVar, fVar2, m, axVar, axVar2, axVar3, ((C105039t) fVar.f292181d).mo17428b());
        C104822i iVar = new C104822i();
        ((C23219p) this.f292073c.mo94184b()).mo28685c(iVar);
        ((C23219p) this.f292073c.mo94186d()).mo28685c(iVar);
        ((C23219p) this.f292073c.mo94185c()).mo28685c(iVar);
    }

    /* renamed from: ix */
    public void mo28300ix() {
        this.f292082l = true;
        this.f292071a.mo86283b(mo94300k());
        C104337bl blVar = this.f292072b;
        C7718hj hjVar = mo94302p().f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        long b = blVar.f290279a.mo26870b();
        synchronized (blVar.f290280b) {
            long b2 = C91994m.m150995b(hjVar);
            if (blVar.f290281c.indexOfKey(b2) < 0) {
                blVar.f290281c.put(b2, Long.valueOf(b));
            }
        }
        if (this.f292075e.mo56113h()) {
            ((C91872n) this.f292075e.mo56107c()).mo86400d(this);
        }
    }

    /* renamed from: j */
    public final List mo86270j() {
        return C91773i.f255918a;
    }

    /* renamed from: js */
    public final void mo28301js() {
        if (this.f292080j) {
            mo94361u();
            mo28806t();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract View mo94300k();

    /* renamed from: l */
    public final void mo86402l() {
        C8178yk ykVar;
        C7669fo foVar;
        C7709ha haVar;
        C7709ha haVar2;
        C7669fo foVar2;
        C7973qv qvVar;
        C9278v p = mo94302p();
        if (this.f292076f.mo56113h() && (p.f32192a & LinearLayoutManager.INVALID_OFFSET) != 0) {
            C104348l m = mo94301m();
            C7718hj hjVar = p.f32174H;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            C7973qv qvVar2 = null;
            if (!m.f290312g.isEmpty()) {
                C58800sl lA = C58495hd.m89898l(m.f290312g).entrySet().iterator();
                while (lA.hasNext()) {
                    Map.Entry entry = (Map.Entry) lA.next();
                    C91866h hVar = this.f292077g;
                    C8178yk ykVar2 = (C8178yk) entry.getKey();
                    if ((hjVar.f26955a & 64) != 0) {
                        haVar2 = hjVar.f26972m;
                        if (haVar2 == null) {
                            haVar2 = C7709ha.f26910f;
                        }
                    } else {
                        haVar2 = null;
                    }
                    C8178yk b = hVar.mo86389b(ykVar2, haVar2);
                    if (b != null) {
                        C91874p pVar = (C91874p) this.f292076f.mo56107c();
                        View view = (View) entry.getValue();
                        C57057b d = this.f292077g.mo86391d(hjVar, (C8142xb) ((C58833ax) ((C23249a) this.f292073c.mo94191i()).mo28725a()).mo56109e(C8142xb.UNKNOWN_SURFACE), ((Boolean) ((C23249a) this.f292073c.mo94189g()).mo28725a()).booleanValue());
                        if ((hjVar.f26955a & 4) != 0) {
                            C7669fo foVar3 = hjVar.f26968i;
                            if (foVar3 == null) {
                                foVar3 = C7669fo.f26633e;
                            }
                            foVar2 = foVar3;
                        } else {
                            foVar2 = null;
                        }
                        if ((hjVar.f26955a & 32) != 0) {
                            C7973qv qvVar3 = hjVar.f26971l;
                            if (qvVar3 == null) {
                                qvVar3 = C7973qv.f28001c;
                            }
                            qvVar = qvVar3;
                        } else {
                            qvVar = null;
                        }
                        pVar.mo86404g(b, view, d, foVar2, qvVar);
                    }
                }
            }
            C8178yk ykVar3 = hjVar.f26973n;
            if (ykVar3 == null) {
                ykVar3 = C8178yk.f28736g;
            }
            if (!ykVar3.f28742e) {
                int i = hjVar.f26955a;
                if ((i & 128) != 0) {
                    C91866h hVar2 = this.f292077g;
                    C8178yk ykVar4 = hjVar.f26973n;
                    if (ykVar4 == null) {
                        ykVar4 = C8178yk.f28736g;
                    }
                    if ((i & 64) != 0) {
                        haVar = hjVar.f26972m;
                        if (haVar == null) {
                            haVar = C7709ha.f26910f;
                        }
                    } else {
                        haVar = null;
                    }
                    ykVar = hVar2.mo86389b(ykVar4, haVar);
                } else {
                    ykVar = null;
                }
                if (ykVar != null) {
                    C91874p pVar2 = (C91874p) this.f292076f.mo56107c();
                    View k = mo94300k();
                    C57057b d2 = this.f292077g.mo86391d(hjVar, (C8142xb) ((C58833ax) ((C23249a) this.f292073c.mo94191i()).mo28725a()).mo56109e(C8142xb.UNKNOWN_SURFACE), ((Boolean) ((C23249a) this.f292073c.mo94189g()).mo28725a()).booleanValue());
                    if ((hjVar.f26955a & 4) != 0) {
                        C7669fo foVar4 = hjVar.f26968i;
                        if (foVar4 == null) {
                            foVar4 = C7669fo.f26633e;
                        }
                        foVar = foVar4;
                    } else {
                        foVar = null;
                    }
                    if ((hjVar.f26955a & 32) != 0 && (qvVar2 = hjVar.f26971l) == null) {
                        qvVar2 = C7973qv.f28001c;
                    }
                    pVar2.mo86404g(ykVar, k, d2, foVar, qvVar2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract C104348l mo94301m();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract C9278v mo94302p();

    /* renamed from: q */
    public final void mo94360q(String str) {
        if (!str.isEmpty()) {
            C104348l m = mo94301m();
            if (m.f290326u.containsKey(str)) {
                C104335bj bjVar = (C104335bj) m.f290326u.get(str);
                if (bjVar.f290268d) {
                    bjVar.sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo86278r(C91771g gVar) {
        this.f292071a.mo86278r(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo94303s() {
    }

    /* renamed from: t */
    public final void mo28806t() {
        if (!this.f292080j || this.f292082l) {
            this.f292082l = false;
            this.f292071a.mo86282a();
            mo94303s();
        }
    }

    /* renamed from: u */
    public final void mo94361u() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f292081k;
        if (onAttachStateChangeListener != null) {
            mo28297il().removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f292081k = null;
        }
    }

    /* renamed from: v */
    public final void mo94362v() {
        mo94301m().mo94037t(this.f292078h);
    }
}
