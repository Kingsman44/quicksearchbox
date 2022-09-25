package com.google.android.apps.gsa.staticplugins.opa.samson.p8421c.p8423b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6491a.C84367m;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6491a.C84373s;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.util.C113762ae;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.c.b.a */
/* compiled from: PG */
public final class C110048a implements C86686h {

    /* renamed from: a */
    private static final C59071e f306613a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.c.b.a");

    /* renamed from: c */
    private final Context f306614c;

    /* renamed from: d */
    private final C87568k f306615d;

    /* renamed from: e */
    private final C84373s f306616e;

    /* renamed from: f */
    private final C91097g f306617f;

    public C110048a(Context context, C87568k kVar, C84373s sVar, C91097g gVar) {
        this.f306614c = context;
        this.f306615d = kVar;
        this.f306616e = sVar;
        this.f306617f = gVar;
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
        Object obj;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() == 32) {
            C58838bb.m90884s(clientEventData.mo81913d(Intent.class), "BROWSABLE_INTENT_LAUNCHED_IN_CLIENT should have an intent parcelable.");
            Intent intent = (Intent) clientEventData.mo81912b(Intent.class);
            if (intent != null) {
                String stringExtra = intent.getStringExtra("interactive_element");
                if (stringExtra != null) {
                    if (!C59326i.f157517e.mo56829i(stringExtra)) {
                        C58976aa aaVar = C58975e.f156826a;
                    } else {
                        try {
                            C58833ax a2 = C113762ae.m188327a((C51016dg) C62942bv.parseFrom((C62942bv) C51016dg.f132827g, C59326i.f157517e.mo56836k(stringExtra), C62921ba.f169869a));
                            if (a2.mo56113h()) {
                                ClientEventData clientEventData2 = (ClientEventData) a2.mo56107c();
                                C62940bt btVar = C88092ow.f238173a;
                                C87741bw bwVar = clientEventData2.f236955a;
                                C62940bt r7 = C62942bv.checkIsLite(btVar);
                                bwVar.mo58887l(r7);
                                if (!bwVar.f169962ag.mo58857o(r7.f169971d)) {
                                    C59104x d = f306613a.mo56226d();
                                    d.mo56378ag(C58975e.f156826a, "CcgSCtrl");
                                    ((C59052c) ((C59052c) d).mo56372aa(25716)).mo56386p("OpaClientInputEvent extension is missing. Bail out.");
                                    return;
                                }
                                C62940bt btVar2 = C88092ow.f238173a;
                                C87741bw bwVar2 = clientEventData2.f236955a;
                                C62940bt r72 = C62942bv.checkIsLite(btVar2);
                                bwVar2.mo58887l(r72);
                                Object l = bwVar2.f169962ag.mo58854l(r72.f169971d);
                                if (l == null) {
                                    obj = r72.f169969b;
                                } else {
                                    obj = r72.mo58889c(l);
                                }
                                C88094oy oyVar = (C88094oy) obj;
                                if (oyVar == null) {
                                    C59104x d2 = f306613a.mo56226d();
                                    d2.mo56378ag(C58975e.f156826a, "CcgSCtrl");
                                    ((C59052c) ((C59052c) d2).mo56372aa(25715)).mo56386p("OpaClientInputEvent extension is null. Bail out.");
                                    return;
                                } else if ((1 & oyVar.f238176a) == 0 || oyVar.f238177b.mo59031d() == 0) {
                                    C59104x d3 = f306613a.mo56226d();
                                    d3.mo56378ag(C58975e.f156826a, "CcgSCtrl");
                                    ((C59052c) ((C59052c) d3).mo56372aa(25712)).mo56386p("Client input is empty. Bail out.");
                                    return;
                                } else {
                                    C51805du duVar = null;
                                    C84367m mVar = clientEventData2.mo81913d(Query.class) ? new C84367m((Query) clientEventData2.mo81912b(Query.class)) : null;
                                    try {
                                        duVar = (C51805du) C62942bv.parseFrom((C62942bv) C51805du.f135924e, oyVar.f238177b, C62921ba.f169869a);
                                    } catch (C62974ct e) {
                                        C59104x c = f306613a.mo56225c();
                                        c.mo56378ag(C58975e.f156826a, "CcgSCtrl");
                                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25714)).mo56386p("Trying to parse invalid ClientInput.");
                                    }
                                    if (duVar != null) {
                                        if ((oyVar.f238176a & 4) != 0) {
                                            C59104x d4 = f306613a.mo56226d();
                                            d4.mo56378ag(C58975e.f156826a, "CcgSCtrl");
                                            ((C59052c) ((C59052c) d4).mo56372aa(25713)).mo56386p("client has whats next key. unsupported!");
                                            return;
                                        }
                                        C84370p a3 = this.f306616e.mo77931a();
                                        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
                                        ejVar.copyOnWrite();
                                        C52078ek ekVar = (C52078ek) ejVar.instance;
                                        ekVar.f136675c = duVar;
                                        ekVar.f136674b = 5;
                                        a3.mo77920b((C52078ek) ejVar.build(), C58833ax.m90833j(mVar));
                                        return;
                                    }
                                    return;
                                }
                            }
                        } catch (C62974ct unused) {
                            C59104x c2 = f306613a.mo56225c();
                            c2.mo56378ag(C58975e.f156826a, "CcgSCtrl");
                            ((C59052c) ((C59052c) c2).mo56372aa(25717)).mo56389s("Invalid interactive element received %s", stringExtra);
                        }
                    }
                }
                if (intent.hasExtra("com.google.opa.QUERY")) {
                    C87565h hVar = new C87565h();
                    hVar.mo81686b();
                    hVar.f236509M = true;
                    hVar.f236560f = 1;
                    hVar.f236572r = QueryTriggerType.OPA_SUGGESTION_CHIP;
                    hVar.f236556b = e.ab;
                    String stringExtra2 = intent.getStringExtra("com.google.opa.QUERY");
                    if (stringExtra2 != null) {
                        hVar.f236568n = stringExtra2;
                        this.f306615d.mo81689c(this.f306614c, hVar.mo81685a(), 268468224);
                        return;
                    }
                }
                this.f306617f.mo65089a(intent);
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
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
