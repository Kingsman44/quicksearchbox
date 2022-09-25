package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.gsa.search.core.google.C85919cm;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6519al.p6522aa.C84609a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6823b.C86360a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.state.p6872d.C86925as;
import com.google.android.apps.gsa.search.core.state.p6872d.C86948bo;
import com.google.android.apps.gsa.search.core.webview.C87264j;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116734gj;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58844bh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.p4500cm.p4518d.p4519a.C58181d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.d */
/* compiled from: PG */
public final class C116505d implements C87264j {

    /* renamed from: a */
    public static final C59071e f323026a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.a.h.d");

    /* renamed from: b */
    public final C116735gk f323027b;

    /* renamed from: c */
    public final C86360a f323028c;

    /* renamed from: d */
    public final C84609a f323029d;

    /* renamed from: e */
    public final C90931ca f323030e;

    /* renamed from: f */
    private final C86948bo f323031f;

    /* renamed from: g */
    private final C116819jn f323032g;

    /* renamed from: h */
    private final C86610af f323033h;

    /* renamed from: i */
    private final C116502ad f323034i;

    /* renamed from: j */
    private final C91097g f323035j;

    /* renamed from: k */
    private final Context f323036k;

    /* renamed from: l */
    private final C68214a f323037l;

    /* renamed from: m */
    private final C84474e f323038m;

    public C116505d(C116735gk gkVar, C86948bo boVar, C116819jn jnVar, C86360a aVar, C84609a aVar2, C86610af afVar, C116502ad adVar, C91097g gVar, Context context, C68214a aVar3, C90931ca caVar, C84474e eVar) {
        this.f323027b = gkVar;
        this.f323031f = boVar;
        this.f323032g = jnVar;
        this.f323028c = aVar;
        this.f323029d = aVar2;
        this.f323033h = afVar;
        this.f323034i = adVar;
        this.f323035j = gVar;
        this.f323036k = context;
        this.f323037l = aVar3;
        this.f323030e = caVar;
        this.f323038m = eVar;
    }

    /* renamed from: c */
    public final void mo80879c(String str, String str2) {
        byte[] decode = Base64.decode(str, 8);
        C55349pb pbVar = C55349pb.f145830g;
        try {
            C55349pb pbVar2 = (C55349pb) C62942bv.parseFrom((C62942bv) C55349pb.f145830g, decode, C62921ba.m95368a());
            C116735gk gkVar = this.f323027b;
            Query query = gkVar.f323784p;
            if (true == TextUtils.isEmpty(str2)) {
                str2 = null;
            }
            ActionData u = ActionData.m141431u(pbVar2, (C58179b) null, str2, true, this.f323037l, (C52091ex) null);
            C58976aa aaVar = C58975e.f156826a;
            C59081b.m91349a(C58979ad.FULL, "stack size");
            if (gkVar.f323784p.mo84383cP(query)) {
                C116734gj gjVar = gkVar.f323791w;
                if (!gjVar.mo102857h()) {
                    gjVar.mo102862m(u);
                    gkVar.mo80591ar();
                }
            }
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f323026a.mo56225c()).mo56382g(e)).mo56372aa(31841)).mo56386p("Bad web view client discourse context.");
        }
    }

    /* renamed from: d */
    public final void mo80880d(long j) {
        Query query = this.f323032g.f324189y;
        if (j == query.f252749G) {
            C116735gk gkVar = this.f323027b;
            C58976aa aaVar = C58975e.f156826a;
            if (((C116819jn) gkVar.f323776h.mo27525b()).mo102965t(query) && (gkVar.mo102890ah(C58844bh.ALWAYS_FALSE) || gkVar.mo102889af(false))) {
                gkVar.mo80591ar();
            }
        }
    }

    /* renamed from: e */
    public final void mo80881e(String str) {
        int i;
        C22872h.m42743c(C86593a.class);
        if (!TextUtils.isEmpty(str)) {
            C116502ad adVar = this.f323034i;
            C22872h.m42743c(C86593a.class);
            C116819jn jnVar = adVar.f323019j;
            Query query = jnVar.f324189y;
            C22872h.m42743c(C86593a.class);
            if (jnVar.mo102965t(query)) {
                boolean z = jnVar.f324143C;
                jnVar.f324143C = true;
                if (!z) {
                    jnVar.mo80591ar();
                }
            } else {
                jnVar.mo102957j("resultsPagePartialRender", query);
            }
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 475;
            String b = C39191a.m68623b(query.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            CardDecision j = adVar.f323010a.mo103015j();
            C86925as asVar = adVar.f323011b;
            ActionData actionData = adVar.f323010a.f324250j;
            if (actionData == null || !asVar.f234755a.containsKey(actionData)) {
                i = 0;
            } else {
                int intValue = ((Integer) asVar.f234755a.get(actionData)).intValue();
                int i2 = intValue & 4096;
                asVar.mo80576i(actionData, i2 << 16);
                i = (((intValue >>> 16) & 4096) ^ -1) & i2;
            }
            long j2 = j.f236255i ? j.f236257k : -1;
            C85919cm cmVar = (C85919cm) adVar.f323013d.mo27525b();
            VoiceAction f = adVar.f323010a.mo80807f();
            cmVar.mo79545d(i, (C58181d) null, str, (Long) null, (C85929cw) adVar.f323017h.mo27525b(), j2, f != null ? f.mo81066g().f146230cP : -1);
            return;
        }
        ((C59052c) ((C59052c) f323026a.mo56226d()).mo56372aa(31843)).mo56386p("Could not get event id from SRP");
    }

    /* renamed from: f */
    public final void mo80882f(long j) {
        C116735gk gkVar = this.f323027b;
        Query query = gkVar.f323784p;
        if (query.f252749G == j) {
            C58976aa aaVar = C58975e.f156826a;
            Query query2 = gkVar.f323784p;
            if (query2.f252780s == query.f252780s && query2.mo84321bF()) {
                gkVar.mo102873N(gkVar.f323784p.mo84277aN());
                gkVar.mo102887ad();
                gkVar.mo80591ar();
            }
        }
    }

    /* renamed from: g */
    public final void mo80883g() {
        if (this.f323033h.mo80227h()) {
            this.f323033h.mo80228i(new C87684al(C88244um.UNFOCUS_QUERY_AND_HIDE_KEYBOARD).mo81964a());
        }
    }

    /* renamed from: h */
    public final void mo80884h(String str) {
        C86948bo boVar = this.f323031f;
        if (boVar.f234848f.mo85049c(8, 0)) {
            boVar.mo80591ar();
        }
        boolean z = this.f323032g.f324183s;
    }

    /* renamed from: i */
    public final void mo80885i(String str) {
        boolean z = this.f323032g.f324183s;
    }

    /* renamed from: j */
    public final void mo80886j(String str) {
        Intent a = C89429a.m145443a(this.f323036k, this.f323027b.f323784p.mo84355bn());
        a.putExtra("lobby_initial_tab", 1);
        if (str != null && !str.isEmpty()) {
            a.putExtra("extra_kansas_version_info", str);
        }
        this.f323035j.mo65089a(a);
    }

    /* renamed from: k */
    public final void mo80887k(String str) {
        this.f323030e.mo85142g(this.f323038m.mo78117f(), new C116503b(this, str));
    }
}
