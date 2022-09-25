package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87934j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87961k;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87988l;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.C90735as;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108242bm;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108320ei;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.p8336bf.C108050e;
import com.google.android.apps.gsa.staticplugins.opa.p8336bf.C108051f;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.apps.gsa.staticplugins.opa.util.C113793bi;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.libraries.p1635au.C19567d;
import com.google.assistant.p3897e.p3912f.C51211f;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4985f.p5042u.C65342d;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ex */
/* compiled from: PG */
final class C109011ex implements C108226ax {

    /* renamed from: a */
    final /* synthetic */ C109040fj f303124a;

    public C109011ex(C109040fj fjVar) {
        this.f303124a = fjVar;
    }

    /* renamed from: a */
    public final void mo96388a() {
        if (C109040fj.m181378bx(this.f303124a.f303450o)) {
            ((C113989h) ((C113988g) this.f303124a.f303450o).mo100833bf().mo56107c()).mo100865bs();
        }
    }

    /* renamed from: b */
    public final void mo96389b(Duration duration) {
        this.f303124a.f303255aO.mo98057a();
        this.f303124a.f303255aO.mo98058b(duration.toMillis(), duration.toMillis());
    }

    /* renamed from: c */
    public final void mo96390c(long j, C58833ax axVar) {
        C109040fj fjVar = this.f303124a;
        fjVar.f303445j.mo100721a(j, fjVar.f303235U, fjVar.f303450o.mo95427p(axVar));
        this.f303124a.mo97436X(true);
    }

    /* renamed from: d */
    public final void mo96391d(C108242bm bmVar) {
        C58833ax axVar;
        C51211f fVar;
        this.f303124a.f303450o.mo95385aA();
        String i = bmVar.mo96696i();
        C90735as a = bmVar.mo96690a();
        C58833ax c = bmVar.mo96692c();
        C51656n nVar = bmVar.mo96691b().mo56113h() ? (C51656n) bmVar.mo96691b().mo56107c() : null;
        if (i != null) {
            Boolean d = bmVar.mo96693d();
            Boolean e = bmVar.mo96694e();
            Boolean f = bmVar.mo96695f();
            if (e == null || !e.booleanValue()) {
                axVar = (d == null || !d.booleanValue()) ? C58836b.f156633a : C58833ax.m90834k(C51211f.EDIT_HINT);
            } else if (f == null || !f.booleanValue()) {
                axVar = C58833ax.m90834k(C51211f.UNDERLINE);
            } else {
                axVar = C58833ax.m90834k(C51211f.INVISIBLE_UNDERLINE);
            }
            if (bmVar instanceof C108320ei) {
                fVar = C51211f.LONG_TAP;
            } else {
                fVar = C51211f.SHORT_TAP;
            }
            C51211f fVar2 = (C51211f) axVar.mo56109e(fVar);
            if (nVar == null || (!this.f303124a.f303455t.mo79746e(C90029ch.f248255ap) && !this.f303124a.f303455t.mo79746e(C90029ch.f248253an) && !this.f303124a.f303455t.mo79746e(C90029ch.f248254ao))) {
                if (a == null) {
                    this.f303124a.f303238X.mo96118Q(i, fVar2);
                } else {
                    this.f303124a.f303238X.mo96120S(i, a, c, fVar2);
                }
            } else if (a == null) {
                this.f303124a.f303238X.mo96119R(i, fVar2, nVar);
            } else {
                this.f303124a.f303238X.mo96121T(i, a, c, fVar2, nVar);
            }
            this.f303124a.f303450o.mo95411av();
        }
    }

    /* renamed from: e */
    public final void mo96392e() {
        if (this.f303124a.f303238X.mo96134aG()) {
            this.f303124a.f303238X.mo96151ac(false);
        }
    }

    /* renamed from: f */
    public final void mo96393f() {
        this.f303124a.f303459x.mo98098e();
        this.f303124a.f303454s.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        C109040fj fjVar = this.f303124a;
        C87961k kVar = (C87961k) C87988l.f237953e.createBuilder();
        kVar.copyOnWrite();
        C87988l lVar = (C87988l) kVar.instance;
        lVar.f237955a |= 1;
        lVar.f237956b = 2;
        kVar.copyOnWrite();
        C87988l lVar2 = (C87988l) kVar.instance;
        lVar2.f237955a = 2 | lVar2.f237955a;
        lVar2.f237957c = 4;
        C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
        jVar.copyOnWrite();
        C87423k kVar2 = (C87423k) jVar.instance;
        kVar2.f236087b = 7;
        kVar2.f236086a |= 1;
        C87423k kVar3 = (C87423k) jVar.build();
        kVar.copyOnWrite();
        C87988l lVar3 = (C87988l) kVar.instance;
        kVar3.getClass();
        lVar3.f237958d = kVar3;
        lVar3.f237955a |= 4;
        C88489j jVar2 = new C88489j(C87739bu.ACTION_USER_INTERACTION);
        jVar2.mo82014b(C87934j.f237849a, (C87988l) kVar.build());
        fjVar.f303454s.mo96219b(jVar2.mo82013a());
    }

    /* renamed from: g */
    public final void mo96394g() {
        if (C109040fj.m181378bx(this.f303124a.f303450o)) {
            C113989h hVar = (C113989h) ((C113988g) this.f303124a.f303450o).mo100833bf().mo56107c();
            if (!hVar.mo100909dl()) {
                hVar.mo100878cO(true);
                hVar.mo100875cL();
            }
        }
    }

    /* renamed from: h */
    public final void mo96395h() {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        C109040fj fjVar = this.f303124a;
        if ((!fjVar.f303245aE || !fjVar.mo97528bv()) && this.f303124a.mo97528bv() && this.f303124a.f303455t.mo79746e(C90029ch.f248282bp)) {
            C109040fj fjVar2 = this.f303124a;
            fjVar2.f303298bE = true;
            ((C113793bi) fjVar2.f303325bf.mo27525b()).mo100643c(this.f303124a.f303449n, false);
            if (this.f303124a.f303275ai != C109026ey.MODE_HIDDEN && this.f303124a.f303248aH.mo56113h()) {
                ((C108100a) this.f303124a.f303248aH.mo56107c()).mo96445j(true);
            }
        }
    }

    /* renamed from: i */
    public final void mo96396i() {
        C109040fj fjVar = this.f303124a;
        fjVar.mo97422J(fjVar.f303332bm);
    }

    /* renamed from: j */
    public final void mo96397j() {
        ((C109258hw) this.f303124a.f303236V.f303912g.mo6453a()).mo97714d();
        if (this.f303124a.f303248aH.mo56113h()) {
            ((C108100a) this.f303124a.f303248aH.mo56107c()).mo96441f(true);
        }
    }

    /* renamed from: k */
    public final void mo96398k(List list) {
        this.f303124a.mo97482ar(list);
    }

    /* renamed from: l */
    public final void mo96399l() {
        if (this.f303124a.f303267aa.mo82125f()) {
            this.f303124a.f303267aa.mo82121a();
        }
    }

    /* renamed from: m */
    public final void mo96400m(boolean z) {
        if (!z) {
            this.f303124a.f303314bU.mo101383a();
        }
    }

    /* renamed from: n */
    public final void mo96401n() {
        if (this.f303124a.f303455t.mo79746e(C90014bt.f247771nT)) {
            this.f303124a.f303454s.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        }
    }

    /* renamed from: o */
    public final void mo96402o() {
        this.f303124a.mo97483as();
    }

    /* renamed from: p */
    public final void mo96403p(String str) {
        this.f303124a.mo97430R();
    }

    /* renamed from: q */
    public final void mo96404q() {
        if (C109040fj.m181378bx(this.f303124a.f303450o)) {
            C113989h hVar = (C113989h) ((C113988g) this.f303124a.f303450o).mo100833bf().mo56107c();
            if (hVar.mo100909dl()) {
                hVar.mo100881cS();
            }
        }
    }

    /* renamed from: r */
    public final boolean mo96405r() {
        return this.f303124a.f303275ai == C109026ey.MODE_CONVERSATION;
    }

    /* renamed from: s */
    public final boolean mo96406s() {
        return this.f303124a.f303238X.mo96132aE();
    }

    /* renamed from: t */
    public final boolean mo96407t() {
        return this.f303124a.mo97528bv();
    }

    /* renamed from: u */
    public final boolean mo96408u() {
        return this.f303124a.f303238X.mo96136aI();
    }

    /* renamed from: v */
    public final void mo96409v(long j, String str) {
        this.f303124a.mo97469ae(j);
        this.f303124a.f303255aO.mo98059d();
        this.f303124a.f303347cA.mo98270a(str);
    }

    /* renamed from: w */
    public final boolean mo96410w(C108430ik ikVar) {
        C108051f fVar = this.f303124a.f303293b;
        if (!fVar.f300561b.mo79746e(C90014bt.f247317eq) && !fVar.f300561b.mo79746e(C90014bt.f247264dq)) {
            return false;
        }
        if (fVar.f300561b.mo79746e(C90014bt.f247317eq) && ikVar.f301596A != null) {
            ((C19567d) fVar.f300568i.f102798I.mo6453a()).mo24822a(1, new Object[0]);
            Context context = fVar.f300567h;
            Activity activity = fVar.f300566g;
            C65342d dVar = ikVar.f301596A;
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVar);
            C88727aj.m143693W(context, activity, C108051f.m179381a(arrayList), new C108050e(fVar, ikVar));
            return true;
        } else if (!fVar.f300561b.mo79746e(C90014bt.f247264dq)) {
            return false;
        } else {
            C88727aj.m143692V(fVar.f300567h, fVar.f300566g);
            return true;
        }
    }

    /* renamed from: x */
    public final void mo96411x(C108430ik ikVar) {
        C108248bs bsVar;
        this.f303124a.f303314bU.mo101383a();
        boolean z = true;
        if (ikVar.f301616w) {
            ((C108100a) this.f303124a.f303248aH.mo56107c()).mo96441f(true);
        }
        C109040fj fjVar = this.f303124a;
        e eVar = ikVar.f301604k;
        if (!((eVar != e.ab && eVar != e.X) || fjVar.f303266aZ.f318449b == C53306j.DOCK || fjVar.f303266aZ.f318449b == C53306j.MORRIS)) {
            this.f303124a.mo97462aX(1);
        }
        if (!(ikVar instanceof C108249bt) || !((bsVar = ((C108249bt) ikVar).f301136a) == C108248bs.TRAIN_VOICE_MATCH || bsVar == C108248bs.TURN_OFF_HOTWORD)) {
            z = false;
        }
        if (this.f303124a.f303455t.mo79746e(C90014bt.f247206cl) && this.f303124a.mo97521bm() && ((!this.f303124a.mo97529bw() || !z) && C109040fj.m181378bx(this.f303124a.f303450o))) {
            ((C113989h) ((C113988g) this.f303124a.f303450o).mo100833bf().mo56107c()).mo100867bv();
        }
        if (this.f303124a.f303455t.mo79746e(C90014bt.f247206cl) && this.f303124a.f303262aV.mo95240v()) {
            this.f303124a.f303262aV.mo95238t();
        }
        this.f303124a.f303293b.mo96383c(ikVar);
        if (!this.f303124a.f303455t.mo79746e(C90014bt.f247353fZ) && this.f303124a.f303455t.mo79746e(C90014bt.f247407ga) && C109040fj.m181378bx(this.f303124a.f303450o)) {
            ((C113989h) ((C113988g) this.f303124a.f303450o).mo100833bf().mo56107c()).mo100891ci();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96412y(int r3) {
        /*
            r2 = this;
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r2.f303124a
            boolean r0 = r0.mo97529bw()
            if (r0 == 0) goto L_0x0015
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r2.f303124a
            boolean r1 = r0.f303300bG
            if (r1 == 0) goto L_0x0015
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r0 = r0.f303323bd
            r1 = 0
            r0.mo97617i(r1, r3)
            goto L_0x001d
        L_0x0015:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r2.f303124a
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r0 = r0.f303323bd
            r1 = 1
            r0.mo97617i(r1, r3)
        L_0x001d:
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r2.f303124a
            com.google.android.apps.gsa.staticplugins.opa.au.q r3 = r3.f303239Y
            if (r3 == 0) goto L_0x0026
            r3.mo96067b()
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109011ex.mo96412y(int):void");
    }

    /* renamed from: z */
    public final void mo96413z() {
        this.f303124a.f303450o.mo95375Q(true);
    }
}
