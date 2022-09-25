package com.google.android.apps.gsa.staticplugins.p7924eq.p7925a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.apps.gsa.search.core.p6498ab.p6499a.C84395a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86637bd;
import com.google.android.apps.gsa.search.core.service.C86669cg;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.p7066m.C89968ag;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1646ay.C19601c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38350e;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p5269w.p5270a.C67959a;
import com.google.p5269w.p5270a.C67961c;
import com.google.p5269w.p5270a.C67962d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

@C84395a
/* renamed from: com.google.android.apps.gsa.staticplugins.eq.a.b */
/* compiled from: PG */
public final class C100637b implements C86686h {

    /* renamed from: c */
    private static final C59071e f281426c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.eq.a.b");

    /* renamed from: a */
    public final C86669cg f281427a;

    /* renamed from: d */
    private final Context f281428d;

    /* renamed from: e */
    private final C86637bd f281429e;

    /* renamed from: f */
    private final C22871g f281430f;

    /* renamed from: g */
    private final C86124t f281431g;

    public C100637b(Context context, C86637bd bdVar, C86669cg cgVar, C22871g gVar, C86124t tVar) {
        this.f281428d = context;
        this.f281429e = bdVar;
        this.f281427a = cgVar;
        this.f281430f = gVar;
        this.f281431g = tVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        Object obj;
        Intent intent;
        Object obj2;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f281431g.mo79746e(C89968ag.f246513m)) {
            C62940bt r9 = C62942bv.checkIsLite(C38346a.f101532a);
            bbVar.mo58887l(r9);
            if (bbVar.f169962ag.mo58857o(r9.f169971d)) {
                C62940bt r92 = C62942bv.checkIsLite(C38346a.f101532a);
                bbVar.mo58887l(r92);
                Object l = bbVar.f169962ag.mo58854l(r92.f169971d);
                if (l == null) {
                    obj = r92.f169969b;
                } else {
                    obj = r92.mo58889c(l);
                }
                C38348c cVar = (C38348c) obj;
                C62940bt r93 = C62942bv.checkIsLite(C38350e.f101537e);
                cVar.mo58887l(r93);
                if (cVar.f169962ag.mo58857o(r93.f169971d)) {
                    C62940bt r94 = C62942bv.checkIsLite(C38350e.f101537e);
                    cVar.mo58887l(r94);
                    Object l2 = cVar.f169962ag.mo58854l(r94.f169971d);
                    if (l2 == null) {
                        obj2 = r94.f169969b;
                    } else {
                        obj2 = r94.mo58889c(l2);
                    }
                    C38350e eVar = (C38350e) obj2;
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.addFlags(402653184);
                    intent2.putExtra("log_event", "WeatherOsrpInBrowser");
                    if ((eVar.f101539a & 2) != 0) {
                        C67959a aVar = (C67959a) C67962d.f184173g.createBuilder();
                        aVar.copyOnWrite();
                        C67962d dVar = (C67962d) aVar.instance;
                        dVar.f184175a |= 1;
                        dVar.f184176b = " ";
                        C67962d dVar2 = eVar.f101541c;
                        if (dVar2 == null) {
                            dVar2 = C67962d.f184173g;
                        }
                        float f = dVar2.f184177c;
                        aVar.copyOnWrite();
                        C67962d dVar3 = (C67962d) aVar.instance;
                        dVar3.f184175a |= 2;
                        dVar3.f184177c = f;
                        C67962d dVar4 = eVar.f101541c;
                        if (dVar4 == null) {
                            dVar4 = C67962d.f184173g;
                        }
                        float f2 = dVar4.f184178d;
                        aVar.copyOnWrite();
                        C67962d dVar5 = (C67962d) aVar.instance;
                        dVar5.f184175a |= 4;
                        dVar5.f184178d = f2;
                        C67962d dVar6 = eVar.f101541c;
                        if (dVar6 == null) {
                            dVar6 = C67962d.f184173g;
                        }
                        C67961c cVar2 = dVar6.f184179e;
                        if (cVar2 == null) {
                            cVar2 = C67961c.f184168d;
                        }
                        aVar.copyOnWrite();
                        C67962d dVar7 = (C67962d) aVar.instance;
                        cVar2.getClass();
                        dVar7.f184179e = cVar2;
                        dVar7.f184175a |= 8;
                        intent2.putExtra("location_64", Base64.encodeToString(((C67962d) aVar.build()).toByteArray(), 2));
                    }
                    intent2.putExtra("default_tab_index", eVar.f101540b);
                    intent = C19601c.m37400g(intent2, new ComponentName(this.f281428d, "com.google.android.apps.gsa.velour.dynamichosts.VelvetDynamicHostActivity"));
                } else {
                    intent = null;
                }
                if (intent != null) {
                    this.f281429e.mo65089a(intent);
                } else {
                    C59104x d = f281426c.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "WeatherSessController");
                    ((C59052c) ((C59052c) d).mo56372aa(33736)).mo56386p("weatherIntent is null. Something went wrong.");
                }
            }
        }
        this.f281430f.mo28212l("destroy WeatherSessionController", new C100634a(this, j));
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
