package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88278vt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88282vx;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.a */
/* compiled from: PG */
public final class C114513a implements C87682aj {

    /* renamed from: b */
    private static final C59071e f317547b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.x.a");

    /* renamed from: a */
    public C90461c f317548a;

    /* renamed from: c */
    private final ViewGroup f317549c;

    /* renamed from: d */
    private final C86054o f317550d;

    /* renamed from: e */
    private final C90464f f317551e;

    /* renamed from: f */
    private final String f317552f;

    /* renamed from: g */
    private final String f317553g;

    /* renamed from: h */
    private final String f317554h;

    /* renamed from: i */
    private final String f317555i;

    /* renamed from: j */
    private final Context f317556j;

    /* renamed from: k */
    private final C113863cr f317557k;

    /* renamed from: l */
    private final C86124t f317558l;

    /* renamed from: m */
    private final C114527o f317559m;

    /* renamed from: n */
    private final bm f317560n;

    /* renamed from: o */
    private final C58833ax f317561o;

    /* renamed from: p */
    private C107710u f317562p;

    /* renamed from: q */
    private C107698i f317563q;

    /* renamed from: r */
    private final C68214a f317564r;

    public C114513a(ViewGroup viewGroup, String str, String str2, String str3, String str4, C90464f fVar, Context context, C86054o oVar, C113863cr crVar, C86124t tVar, C114527o oVar2, bm bmVar, C58833ax axVar, C68214a aVar) {
        this.f317549c = viewGroup;
        this.f317552f = str;
        this.f317553g = str2;
        this.f317554h = str3;
        this.f317555i = str4;
        this.f317556j = context;
        this.f317550d = oVar;
        this.f317551e = fVar;
        this.f317557k = crVar;
        this.f317558l = tVar;
        this.f317559m = oVar2;
        this.f317560n = bmVar;
        this.f317561o = axVar;
        this.f317564r = aVar;
    }

    /* renamed from: a */
    public final void mo101361a() {
        mo101362b(new C90461c(), C58836b.f156633a);
    }

    /* renamed from: b */
    public final void mo101362b(C90461c cVar, C58833ax axVar) {
        boolean z = false;
        if (this.f317558l.mo79746e(C90014bt.f247412gf) && this.f317562p != null) {
            z = true;
        }
        if (this.f317548a == null) {
            C107698i iVar = this.f317563q;
            if (!z || iVar == null) {
                mo101363d(cVar, 1, axVar);
                return;
            }
            this.f317548a = cVar;
            iVar.mo96219b(new C88489j(C87739bu.OPA_REQUEST_SHERLOG_ENTRIES).mo82013a());
        }
    }

    /* renamed from: d */
    public final void mo101363d(C90461c cVar, int i, C58833ax axVar) {
        cVar.f252689a = this.f317549c;
        if (!axVar.mo56113h() || TextUtils.isEmpty((CharSequence) axVar.mo56107c())) {
            cVar.f252693e = this.f317552f;
        } else {
            cVar.f252693e = (String) axVar.mo56107c();
        }
        cVar.f252690b = this.f317553g;
        cVar.mo84198b(this.f317554h, this.f317555i);
        cVar.f252691c = this.f317550d.mo79668a();
        cVar.f252692d = C87562e.m142218a(this.f317556j, this.f317553g);
        cVar.mo84200d("OPA LatencyId", Long.toString(this.f317557k.f315277a));
        cVar.mo84200d("For OPA Valyrian", Boolean.toString(this.f317558l.mo79746e(C90014bt.f247760nI)));
        C86124t tVar = this.f317558l;
        cVar.mo84200d("For OPA Lockhart", (tVar.mo79746e(C90014bt.f247387gG) || tVar.mo79746e(C90014bt.f247388gH)) ? "V1" : "false");
        cVar.mo84200d("For OPA Standalone Zero State", Boolean.toString(this.f317558l.mo79746e(C90014bt.f247287eM)));
        cVar.mo84200d("Zero State V2 enabled", Boolean.toString(this.f317558l.mo79746e(C90014bt.f247289eO)));
        cVar.mo84200d("For Opa Lang Separation", Boolean.toString(this.f317558l.mo79746e(C90014bt.f247174cF)));
        cVar.mo84200d("For Opa Lang", this.f317560n.b());
        cVar.mo84200d("Tapas Enabled", Boolean.toString(((C113191cv) this.f317564r.mo27525b()).mo99907c()));
        if (this.f317558l.mo79746e(C90126fx.f251683nT)) {
            boolean z = false;
            if (this.f317561o.mo56113h() && ((C74714bo) this.f317561o.mo56107c()).mo71081c()) {
                z = true;
            }
            cVar.f252700l = z;
        }
        this.f317551e.mo84209b(cVar, i);
        this.f317548a = null;
    }

    /* renamed from: e */
    public final void mo101364e(C107710u uVar, C107698i iVar) {
        this.f317562p = uVar;
        this.f317563q = iVar;
        uVar.mo96220c(this, C88244um.OPA_RESPONSE_SHERLOG_ENTRIES);
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a.ordinal() == 84) {
            C62940bt btVar = C88278vt.f238764a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (uoVar.f169962ag.mo58857o(r0.f169971d)) {
                C90461c cVar = this.f317548a;
                if (cVar == null) {
                    ((C59052c) ((C59052c) f317547b.mo56225c()).mo56372aa(24497)).mo56386p("FeedbackData is null");
                    return;
                }
                for (C114526n nVar : this.f317559m.mo101387a((C88282vx) serviceEventData.mo81918e(C88278vt.f238764a))) {
                    cVar.mo84200d(nVar.f317606a, nVar.f317607b);
                }
                mo101363d(this.f317548a, 1, C58836b.f156633a);
            }
        }
    }
}
