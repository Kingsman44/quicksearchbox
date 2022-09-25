package com.google.android.apps.gsa.staticplugins.opa.p8337bg;

import android.app.Activity;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108242bm;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108390gy;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109245s;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109246t;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28294l;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import java.util.List;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bg.i */
/* compiled from: PG */
final class C108062i implements C108226ax {

    /* renamed from: a */
    final /* synthetic */ C108063j f300620a;

    public C108062i(C108063j jVar) {
        this.f300620a = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96388a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo96389b(Duration duration) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo96390c(long j, C58833ax axVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo96391d(C108242bm bmVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo96392e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo96393f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo96394g() {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo96395h() {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo96396i() {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo96397j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo96398k(List list) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo96399l() {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo96400m(boolean z) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo96401n() {
    }

    /* renamed from: o */
    public final /* synthetic */ void mo96402o() {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo96403p(String str) {
    }

    /* renamed from: q */
    public final /* synthetic */ void mo96404q() {
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo96405r() {
        return false;
    }

    /* renamed from: s */
    public final /* synthetic */ boolean mo96406s() {
        return false;
    }

    /* renamed from: t */
    public final /* synthetic */ boolean mo96407t() {
        return false;
    }

    /* renamed from: u */
    public final /* synthetic */ boolean mo96408u() {
        return false;
    }

    /* renamed from: v */
    public final /* synthetic */ void mo96409v(long j, String str) {
    }

    /* renamed from: w */
    public final /* synthetic */ boolean mo96410w(C108430ik ikVar) {
        return false;
    }

    /* renamed from: x */
    public final void mo96411x(C108430ik ikVar) {
        if (ikVar instanceof C108390gy) {
            C108063j jVar = this.f300620a;
            C87565h hVar = new C87565h();
            hVar.f236560f = 4;
            hVar.f236497A = true;
            hVar.f236572r = QueryTriggerType.OPA_SUGGESTION_CHIP;
            hVar.f236568n = ikVar.mo96708f();
            hVar.f236556b = e.ab;
            C60214n g = C28285c.m52880g(ikVar.f301597d);
            if (g != null) {
                hVar.f236571q = C28294l.m52913c(g);
            }
            jVar.f300624d.mo81688b(jVar.f300622b, hVar.mo81685a());
        } else if (ikVar instanceof C108249bt) {
            C108248bs bsVar = C108248bs.FEEDBACK;
            int ordinal = ((C108249bt) ikVar).f301136a.ordinal();
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                C108063j jVar2 = this.f300620a;
                Activity activity = jVar2.f300622b;
                C109248v vVar = jVar2.f300623c;
                C109245s j = C109246t.m181811j();
                j.mo97671b(true);
                activity.startActivity(vVar.mo97704a(j.mo97670a()));
                return;
            }
            C59104x d = C108063j.f300621a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "szsZeroStateController");
            ((C59052c) ((C59052c) d).mo56372aa(27045)).mo56386p("Unhandled client suggestion type");
        } else {
            C59104x d2 = C108063j.f300621a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "szsZeroStateController");
            ((C59052c) ((C59052c) d2).mo56372aa(27044)).mo56386p("Unhandled suggestion item, need to expand suggestion handling.");
        }
    }

    /* renamed from: y */
    public final /* synthetic */ void mo96412y(int i) {
    }

    /* renamed from: z */
    public final /* synthetic */ void mo96413z() {
    }
}
