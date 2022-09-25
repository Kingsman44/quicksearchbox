package com.google.android.apps.gsa.assist;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction;
import com.google.android.apps.gsa.search.shared.actions.util.C87493o;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.searchplate.p6966d.C88937i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90758bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7891nu;
import com.google.p4152bb.p4153a.C54969b;
import com.google.p4152bb.p4153a.C55405rd;
import com.google.p4152bb.p4153a.C55407rf;
import com.google.p4152bb.p4153a.C55413rl;
import com.google.p4152bb.p4153a.C55415rn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assist.by */
/* compiled from: PG */
final class C9384by extends C88499t {

    /* renamed from: a */
    SearchPlate f32544a;

    /* renamed from: b */
    C90758bb f32545b;

    /* renamed from: c */
    int f32546c;

    /* renamed from: d */
    public boolean f32547d;

    /* renamed from: e */
    final /* synthetic */ C9397cb f32548e;

    public C9384by(C9397cb cbVar) {
        this.f32548e = cbVar;
    }

    /* renamed from: t */
    private final boolean m23825t() {
        boolean z = this.f32548e.f32619p == null;
        if (z) {
            C59104x c = C9397cb.f32567a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(new Error())).mo56372aa('?')).mo56386p("Received UI callback in detached state: ");
        }
        return z;
    }

    /* renamed from: b */
    public final void mo17565b() {
        int i = this.f32546c;
        if (i == 2 || i == 0) {
            C87673aa aaVar = this.f32548e.f32619p;
            if (aaVar != null) {
                aaVar.mo81949u();
            }
            if (this.f32546c == 2) {
                this.f32548e.f32625v.mo17562g();
            } else {
                this.f32548e.f32625v.mo17558c();
            }
            this.f32546c = 5;
            this.f32547d = false;
            return;
        }
        C59104x d = C9397cb.f32567a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
        ((C59052c) ((C59052c) d).mo56372aa(42)).mo56387q("onTtsDone: unexpected type %d", this.f32546c);
    }

    /* renamed from: e */
    public final void mo17566e(int i, int i2, boolean z) {
        if (!m23825t()) {
            C59071e eVar = C9397cb.f32567a;
            C58976aa aaVar = C58975e.f156826a;
            SearchPlate searchPlate = this.f32544a;
            if (searchPlate != null) {
                searchPlate.mo82680m(8, i2, true, true);
            }
        }
    }

    /* renamed from: f */
    public final void mo17567f(ParcelableVoiceAction parcelableVoiceAction) {
        if (!m23825t() && this.f32544a != null) {
            SearchError searchError = (SearchError) parcelableVoiceAction.f236008a;
            int S = searchError != null ? searchError.mo81139S() : 0;
            String string = S != 0 ? this.f32548e.f32606c.getResources().getString(S) : BuildConfig.FLAVOR;
            C59071e eVar = C9397cb.f32567a;
            C58976aa aaVar = C58975e.f156826a;
            SearchPlate searchPlate = this.f32544a;
            searchPlate.f240688H = string;
            searchPlate.mo82674g();
        }
    }

    /* renamed from: g */
    public final void mo17568g(int i) {
        if (!m23825t() && this.f32544a != null) {
            C59071e eVar = C9397cb.f32567a;
            C58976aa aaVar = C58975e.f156826a;
            if (i == 6 || i == 0) {
                i = 5;
            }
            this.f32544a.mo82692s(i, false);
        }
    }

    /* renamed from: h */
    public final void mo17569h(Query query, List list, CardDecision cardDecision, int i) {
        C54969b bVar;
        Object obj;
        Object obj2;
        Object obj3;
        if (!m23825t()) {
            C59071e eVar = C9397cb.f32567a;
            C58976aa aaVar = C58975e.f156826a;
            if (i != -1 && list.get(i) != null) {
                VoiceAction voiceAction = ((ParcelableVoiceAction) list.get(i)).f236008a;
                if (voiceAction instanceof VoiceInteractionAction) {
                    VoiceInteractionAction voiceInteractionAction = (VoiceInteractionAction) voiceAction;
                    if (voiceInteractionAction != null && voiceInteractionAction.mo81142N() != null && !voiceInteractionAction.mo81143O()) {
                        if (voiceInteractionAction.f235985a.mo81115e()) {
                            this.f32544a.mo82680m(0, 0, true, true);
                            C9396ca caVar = this.f32548e.f32625v;
                            if (caVar.mo17592m()) {
                                caVar.f32564a.cancel();
                            }
                            caVar.f32566c.mo17606j();
                        } else if ((voiceInteractionAction.mo81142N().f146003a & 1) != 0) {
                            C87673aa aaVar2 = this.f32548e.f32619p;
                            if (aaVar2 != null) {
                                aaVar2.mo81949u();
                                this.f32548e.f32619p.mo81948t(false);
                            }
                            C55415rn rnVar = voiceInteractionAction.mo81142N().f146004b;
                            if (rnVar == null) {
                                rnVar = C55415rn.f146023d;
                            }
                            if ((rnVar.f146025a & 2) != 0) {
                                bVar = rnVar.f146027c;
                                if (bVar == null) {
                                    bVar = C54969b.f144589b;
                                }
                            } else {
                                bVar = null;
                            }
                            Bundle b = C87493o.m142020b(bVar);
                            int i2 = this.f32546c;
                            if (i2 == 1) {
                                C62940bt r1 = C62942bv.checkIsLite(C55405rd.f145991e);
                                rnVar.mo58887l(r1);
                                if (rnVar.f169962ag.mo58857o(r1.f169971d)) {
                                    C62940bt r6 = C62942bv.checkIsLite(C55405rd.f145991e);
                                    rnVar.mo58887l(r6);
                                    Object l = rnVar.f169962ag.mo58854l(r6.f169971d);
                                    if (l == null) {
                                        obj3 = r6.f169969b;
                                    } else {
                                        obj3 = r6.mo58889c(l);
                                    }
                                    if (((C55405rd) obj3).f145995c) {
                                        this.f32548e.f32625v.mo17561f(b);
                                    } else {
                                        this.f32548e.f32625v.mo17560e(b);
                                    }
                                } else {
                                    C59104x d = C9397cb.f32567a.mo56226d();
                                    d.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                                    ((C59052c) ((C59052c) d).mo56372aa('2')).mo56386p("processResponse(COMMAND): request-response type mismatch");
                                }
                            } else if (i2 == 3) {
                                C62940bt r12 = C62942bv.checkIsLite(C55407rf.f145997c);
                                rnVar.mo58887l(r12);
                                if (rnVar.f169962ag.mo58857o(r12.f169971d)) {
                                    C9396ca caVar2 = this.f32548e.f32625v;
                                    C62940bt r13 = C62942bv.checkIsLite(C55407rf.f145997c);
                                    rnVar.mo58887l(r13);
                                    Object l2 = rnVar.f169962ag.mo58854l(r13.f169971d);
                                    if (l2 == null) {
                                        obj2 = r13.f169969b;
                                    } else {
                                        obj2 = r13.mo58889c(l2);
                                    }
                                    caVar2.mo17563h(((C55407rf) obj2).f145999a, b);
                                } else {
                                    C59104x d2 = C9397cb.f32567a.mo56226d();
                                    d2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                                    ((C59052c) ((C59052c) d2).mo56372aa('0')).mo56386p("processResponse(CONFIRMATION): request-response type mismatch");
                                }
                            } else if (i2 == 4) {
                                C62940bt r14 = C62942bv.checkIsLite(C55413rl.f146016e);
                                rnVar.mo58887l(r14);
                                Object l3 = rnVar.f169962ag.mo58854l(r14.f169971d);
                                if (l3 == null) {
                                    obj = r14.f169969b;
                                } else {
                                    obj = r14.mo58889c(l3);
                                }
                                C55413rl rlVar = (C55413rl) obj;
                                if (rlVar == null) {
                                    C59104x d3 = C9397cb.f32567a.mo56226d();
                                    d3.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                                    ((C59052c) ((C59052c) d3).mo56372aa('-')).mo56386p("processResponse(PICK_OPTION): request-response type mismatch");
                                } else if (rlVar.f146019b) {
                                    this.f32548e.f32625v.mo17576j(C9397cb.m23886c(rlVar.f146020c), b);
                                } else {
                                    this.f32548e.f32625v.mo17575i(C9397cb.m23886c(rlVar.f146020c), b);
                                }
                            } else {
                                C59104x d4 = C9397cb.f32567a.mo56226d();
                                d4.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                                ((C59052c) ((C59052c) d4).mo56372aa(',')).mo56386p("processResponse: unsupported request type");
                            }
                            this.f32544a.mo82680m(0, 0, true, true);
                        }
                    }
                } else if (voiceAction instanceof PuntAction) {
                    PuntAction puntAction = (PuntAction) voiceAction;
                    C59104x d5 = C9397cb.f32567a.mo56226d();
                    d5.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                    ((C59052c) ((C59052c) d5).mo56372aa(59)).mo56359L("showVoiceActions: unexpected PuntAction, message - %s, messageId - %d, actionLabel - %d", puntAction.f236015j, Integer.valueOf(puntAction.f236016k), Integer.valueOf(puntAction.f236017l));
                } else if (voiceAction != null) {
                    C59104x d6 = C9397cb.f32567a.mo56226d();
                    d6.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                    ((C59052c) ((C59052c) d6).mo56372aa(':')).mo56389s("showVoiceActions: unexpected VoiceAction, class - %s", voiceAction.getClass());
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo17570i(String str, String str2, String str3) {
        if (!m23825t() && this.f32544a != null) {
            C59071e eVar = C9397cb.f32567a;
            C58976aa aaVar = C58975e.f156826a;
            this.f32544a.f240734g.mo82732q(str, str2);
        }
    }

    /* renamed from: iJ */
    public final void mo17571iJ(ServiceEventData serviceEventData) {
        if (!m23825t()) {
            C7891nu nuVar = C7891nu.UNKNOWN_OPT_IN_SOURCE;
            C88244um umVar = C88244um.ATTACH_WEBVIEW;
            C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a == null) {
                a = C88244um.ATTACH_WEBVIEW;
            }
            if (a.ordinal() != 22) {
                C59071e eVar = C9397cb.f32567a;
                C58976aa aaVar = C58975e.f156826a;
            } else if (this.f32544a != null) {
                C59071e eVar2 = C9397cb.f32567a;
                C58976aa aaVar2 = C58975e.f156826a;
                this.f32544a.mo82681n(C88937i.m144544a((Query) serviceEventData.mo81912b(Query.class)), true);
            }
        }
    }

    /* renamed from: iK */
    public final void mo17572iK(int i, String str, String str2) {
        if (!m23825t()) {
            C59071e eVar = C9397cb.f32567a;
            C58976aa aaVar = C58975e.f156826a;
            int i2 = this.f32546c;
            if (i2 == 2 || i2 == 0) {
                if (this.f32547d && (i & 16) == 0) {
                    mo17565b();
                    C9397cb.m23887i(this.f32548e.f32608e);
                } else if ((i & 16) != 0) {
                    this.f32547d = true;
                    C9397cb cbVar = this.f32548e;
                    cbVar.f32608e = cbVar.f32609f.mo85137b(new C9383bx(this), 10000);
                }
            }
            SearchPlate searchPlate = this.f32544a;
            if (searchPlate != null) {
                if (str2 == null) {
                    str2 = BuildConfig.FLAVOR;
                }
                searchPlate.mo82679l(i, str, str2, true);
            }
        }
    }

    /* renamed from: iL */
    public final void mo17573iL(String str, String str2) {
        if (!m23825t() && this.f32544a != null) {
            C59071e eVar = C9397cb.f32567a;
            C58976aa aaVar = C58975e.f156826a;
            this.f32544a.f240734g.mo82726k(str);
        }
    }

    /* renamed from: j */
    public final void mo17574j(int i) {
        C90758bb bbVar;
        if (!m23825t() && (bbVar = this.f32545b) != null) {
            bbVar.mo85096c(i);
        }
    }
}
