package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6891b.C87298a;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.state.C86843bl;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.core.state.p6875g.C87072g;
import com.google.android.apps.gsa.search.core.state.p6875g.C87073h;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.C90724ah;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.ssb.C45346c;
import com.google.android.ssb.C45347d;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4671b.C61790ai;
import com.google.knowledge.p4671b.C61814g;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ag */
/* compiled from: PG */
public final class C116569ag extends C116780ib implements Observer, C87298a {

    /* renamed from: a */
    public ClientConfig f323267a = ClientConfig.f236948a;

    /* renamed from: b */
    public long f323268b = 0;

    /* renamed from: c */
    public boolean f323269c;

    /* renamed from: d */
    public boolean f323270d;

    /* renamed from: e */
    public Bundle f323271e;

    /* renamed from: f */
    public String f323272f;

    /* renamed from: g */
    public final C68214a f323273g;

    /* renamed from: h */
    public final C68214a f323274h;

    /* renamed from: i */
    public final C68214a f323275i;

    /* renamed from: j */
    public final C68214a f323276j;

    /* renamed from: k */
    private C45347d f323277k;

    /* renamed from: l */
    private final BitFlags f323278l = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: m */
    private List f323279m;

    /* renamed from: n */
    private CardDecision f323280n;

    /* renamed from: o */
    private final C85232a f323281o;

    /* renamed from: p */
    private final C68214a f323282p;

    /* renamed from: q */
    private final C86792g f323283q;

    public C116569ag(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C85232a aVar5, C86792g gVar, C68214a aVar6, C86843bl blVar) {
        super(aVar6, 156);
        this.f323273g = aVar;
        this.f323274h = aVar3;
        this.f323275i = aVar4;
        this.f323276j = aVar2;
        this.f323281o = aVar5;
        this.f323283q = gVar;
        this.f323282p = aVar6;
        blVar.addObserver(this);
    }

    /* renamed from: o */
    private final void m193402o(Bundle bundle) {
        C45347d dVar;
        C58976aa aaVar = C58975e.f156826a;
        if (bundle != this.f323271e) {
            this.f323271e = bundle;
            if (bundle == null) {
                dVar = null;
            } else {
                C61790ai c = C86152a.m138561c(bundle.getString("android.intent.extra.ASSIST_PACKAGE"), bundle.getBundle("android.intent.extra.ASSIST_CONTEXT"), System.currentTimeMillis());
                if (c == null) {
                    dVar = C45347d.f118533e;
                } else {
                    C45346c cVar = (C45346c) C45347d.f118533e.createBuilder();
                    cVar.copyOnWrite();
                    C45347d dVar2 = (C45347d) cVar.instance;
                    dVar2.f118536b = c;
                    dVar2.f118535a |= 2;
                    dVar = (C45347d) cVar.build();
                }
            }
            this.f323277k = dVar;
            this.f323281o.mo78812g(dVar);
            mo102775k();
            mo80591ar();
        }
    }

    /* renamed from: a */
    public final long mo80945a() {
        return this.f323268b;
    }

    /* renamed from: b */
    public final ClientConfig mo80946b() {
        return this.f323267a;
    }

    /* renamed from: e */
    public final String mo102771e() {
        C45347d dVar = this.f323277k;
        if (dVar == null) {
            return null;
        }
        C61790ai aiVar = dVar.f118536b;
        if (aiVar == null) {
            aiVar = C61790ai.f166898o;
        }
        if ((aiVar.f166900a & 16) == 0) {
            return null;
        }
        C61790ai aiVar2 = dVar.f118536b;
        if (aiVar2 == null) {
            aiVar2 = C61790ai.f166898o;
        }
        C61814g gVar = aiVar2.f166903d;
        if (gVar == null) {
            gVar = C61814g.f166984j;
        }
        return gVar.f166987b;
    }

    /* renamed from: g */
    public final void mo102772g(C116836z zVar, boolean z) {
        if (zVar.mo102998ac() && this.f323267a.mo81871A()) {
            List m = zVar.mo103017m();
            VoiceAction f = zVar.mo80807f();
            CardDecision j = zVar.mo103015j();
            if (z || !C90724ah.m148178a(this.f323279m, m) || !C58832aw.m90831a(this.f323280n, j)) {
                this.f323279m = m;
                this.f323280n = j;
                Query query = zVar.f324249i;
                ActionData actionData = zVar.f324250j;
                String str = actionData != null ? actionData.f236000j : null;
                if (str != null) {
                    query = query.mo84306ar(str);
                }
                this.f323281o.mo78815j(query, m, j, m != null ? m.indexOf(f) : -1);
            }
        }
        if (this.f323267a.mo81910z() && zVar.mo103005al()) {
            this.f323281o.mo78818m();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActiveClientState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("currentClientId", Long.valueOf(this.f323268b));
        linkedHashMap.put("clientConfig", this.f323267a);
        linkedHashMap.put("hotwordDetectionEnabled", Boolean.valueOf(this.f323270d));
        linkedHashMap.put("Flags", this.f323278l.mo85048b());
        String e = mo102771e();
        String str = "NULL";
        if (e == null) {
            e = str;
        }
        linkedHashMap.put("Assist Package", e);
        String str2 = this.f323272f;
        if (str2 != null) {
            str = str2;
        }
        linkedHashMap.put("Original assist Package", str);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148228b((Boolean) value));
            } else if (value instanceof Number) {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148230d((Number) value));
            } else {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148233g(String.valueOf(value)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public final void mo80406hn(C88432bc bcVar) {
        C87072g gVar = (C87072g) C87073h.f235271d.createBuilder();
        Bundle bundle = this.f323271e;
        if (bundle != null) {
            C63088z m = C90772bp.m148305m(bundle);
            gVar.copyOnWrite();
            C87073h hVar = (C87073h) gVar.instance;
            m.getClass();
            hVar.f235274a |= 1;
            hVar.f235275b = m;
        }
        String str = this.f323272f;
        if (str != null) {
            gVar.copyOnWrite();
            C87073h hVar2 = (C87073h) gVar.instance;
            hVar2.f235274a |= 2;
            hVar2.f235276c = str;
        }
        bcVar.mo58885m(C87073h.f235272e, (C87073h) gVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: hq */
    public final void mo80407hq(C88433bd bdVar, int i) {
        Object obj;
        Bundle bundle;
        C62940bt r0 = C62942bv.checkIsLite(C87073h.f235272e);
        bdVar.mo58887l(r0);
        Object l = bdVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C87073h hVar = (C87073h) obj;
        String str = null;
        if (i != 1 || (hVar.f235274a & 1) == 0) {
            bundle = null;
        } else {
            bundle = (Bundle) C90772bp.m148301i(hVar.f235275b, Bundle.CREATOR);
            if (bundle != null) {
                bundle.setClassLoader(C116569ag.class.getClassLoader());
            }
        }
        m193402o(bundle);
        if ((hVar.f235274a & 2) != 0) {
            str = hVar.f235276c;
        }
        this.f323272f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        m193402o(bundle);
        this.f323272f = mo102771e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo102773i() {
        return this.f323268b != 0;
    }

    /* renamed from: j */
    public final boolean mo102774j() {
        return mo102773i() && this.f323269c;
    }

    /* renamed from: k */
    public final boolean mo102775k() {
        if (this.f323277k == null || this.f323267a.mo81891i() || !((C116735gk) this.f323275i.mo27525b()).f323735A) {
            return false;
        }
        this.f323271e = null;
        this.f323277k = null;
        this.f323281o.mo78812g((C45347d) null);
        return true;
    }

    /* renamed from: m */
    public final boolean mo102776m(C116836z zVar, C116579aq aqVar, C116735gk gkVar, boolean z) {
        Query query = gkVar.f323784p;
        if (!this.f323267a.mo81902t() || !z || (!aqVar.mo102783g() && (!query.mo84468dv() || (!zVar.mo102985O() && zVar.mo102998ac() && !zVar.mo103000ae() && zVar.mo102986P(query))))) {
            if (!this.f323278l.mo85049c(1, 0)) {
                return false;
            }
            this.f323281o.mo78814i(false);
            return true;
        } else if (!this.f323278l.mo85049c(0, 1)) {
            return false;
        } else {
            this.f323281o.mo78814i(true);
            return true;
        }
    }

    /* renamed from: n */
    public final boolean mo102777n() {
        return BitFlags.m148144f(this.f323278l.f253762b, 1);
    }

    public final void update(Observable observable, Object obj) {
        C22872h.m42743c(C86593a.class);
        String str = this.f323283q.mo80446e().f236953f;
        String b = this.f323283q.mo80447f().mo81992b();
        boolean z = true;
        boolean z2 = this.f323268b != 0 && !str.equals("search");
        if (((C116572aj) this.f323276j.mo27525b()).f323290a == 0 || b.equals("search")) {
            z = false;
        }
        if (z2 || z) {
            try {
                ((C116766ho) this.f323282p.mo27525b()).mo80554c();
            } finally {
                ((C116766ho) this.f323282p.mo27525b()).mo80555e();
            }
        }
    }
}
