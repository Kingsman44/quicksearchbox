package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108242bm;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108390gy;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109245s;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109246t;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114754h;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28294l;
import com.google.assistant.p3994s.p3995a.C53282ic;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import java.util.List;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.on */
/* compiled from: PG */
final class C109865on implements C108226ax {

    /* renamed from: a */
    final /* synthetic */ ZeroStateActivity f306123a;

    public C109865on(ZeroStateActivity zeroStateActivity) {
        this.f306123a = zeroStateActivity;
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
    public final void mo96403p(String str) {
        C53287ih d = C87571n.m142340d(str);
        if (d != null) {
            int a = C53282ic.m86805a(d.f139702h);
            if (a != 0 && a == 5) {
                ZeroStateActivity zeroStateActivity = this.f306123a;
                C114754h hVar = zeroStateActivity.f295694l;
                if (hVar != null) {
                    zeroStateActivity.f295703u.f318451d = str;
                    hVar.mo101424n();
                    return;
                }
                C59104x d2 = ZeroStateActivity.f295675j.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ZeroStateActivity");
                ((C59052c) ((C59052c) d2).mo56372aa(23022)).mo56386p("#openZeroState(): zeroStateController is null");
                return;
            }
            ZeroStateActivity zeroStateActivity2 = this.f306123a;
            zeroStateActivity2.f295700r.mo81698j(zeroStateActivity2.f295693k, d);
            return;
        }
        C59104x d3 = ZeroStateActivity.f295675j.mo56226d();
        d3.mo56378ag(C58975e.f156826a, "ZeroStateActivity");
        ((C59052c) ((C59052c) d3).mo56372aa(23021)).mo56386p("#openZeroState(): Failed to parse ZeroStateDeepLinkData.");
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
            ZeroStateActivity zeroStateActivity = this.f306123a;
            C87565h v = zeroStateActivity.mo95174v();
            v.f236568n = ikVar.mo96708f();
            C60214n g = C28285c.m52880g(ikVar.f301597d);
            if (g != null) {
                v.f236571q = C28294l.m52913c(g);
            }
            zeroStateActivity.f295705w.mo81689c(zeroStateActivity, v.mo81685a(), 268468224);
        } else if (ikVar instanceof C108249bt) {
            C108248bs bsVar = C108248bs.FEEDBACK;
            int ordinal = ((C108249bt) ikVar).f301136a.ordinal();
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                ZeroStateActivity zeroStateActivity2 = this.f306123a;
                C109248v vVar = zeroStateActivity2.f295707y;
                C109245s j = C109246t.m181811j();
                j.mo97671b(true);
                zeroStateActivity2.startActivity(vVar.mo97704a(j.mo97670a()));
                return;
            }
        }
        this.f306123a.f295695m.mo96383c(ikVar);
    }

    /* renamed from: y */
    public final /* synthetic */ void mo96412y(int i) {
    }

    /* renamed from: z */
    public final /* synthetic */ void mo96413z() {
    }
}
