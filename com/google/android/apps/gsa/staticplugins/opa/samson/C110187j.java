package com.google.android.apps.gsa.staticplugins.opa.samson;

import androidx.lifecycle.C2332ag;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88142qs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88144qu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114542a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114545d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114546e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114547f;
import com.google.assistant.p3994s.p3995a.C53365le;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53368lh;
import com.google.assistant.p3994s.p3995a.C53370lj;
import com.google.assistant.p3994s.p3995a.C53376lp;
import com.google.assistant.p3994s.p3995a.C53407mt;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.assistant.p3994s.p3995a.C53430np;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j */
/* compiled from: PG */
public final class C110187j implements C87682aj {

    /* renamed from: a */
    public final C2332ag f307024a = new C2332ag();

    /* renamed from: b */
    private final C110255m f307025b;

    public C110187j(C110255m mVar) {
        this.f307025b = mVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C58833ax axVar;
        C58833ax axVar2;
        C53376lp lpVar;
        C58976aa aaVar = C58975e.f156826a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.OPA_ZERO_STATE_RESPONSE) {
            C62940bt btVar = C88142qs.f238266a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (!uoVar.f169962ag.mo58857o(r0.f169971d)) {
                axVar = C58836b.f156633a;
            } else {
                try {
                    axVar = C58833ax.m90834k((C53422nh) C62942bv.parseFrom((C62942bv) C53422nh.f140182m, ((C88144qu) serviceEventData.mo81918e(C88142qs.f238266a)).f238270b, C62921ba.m95368a()));
                } catch (C62974ct e) {
                    C59104x d = C110255m.f307270a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "ZSRHelper");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(25549)).mo56386p("#getZeroStateResponse(): failed to parse ZeroStateClientResponse proto with error");
                    axVar = C58836b.f156633a;
                }
            }
            if (axVar.mo56113h()) {
                C2332ag agVar = this.f307024a;
                C110255m mVar = this.f307025b;
                C53422nh nhVar = (C53422nh) axVar.mo56107c();
                C53407mt mtVar = nhVar.f140187d;
                if (mtVar == null) {
                    mtVar = C53407mt.f140139d;
                }
                if ((mtVar.f140141a & 1) != 0) {
                    C58485gu m = C58485gu.m89845m();
                    C114547f fVar = mVar.f307271b;
                    C53370lj ljVar = nhVar.f140188e;
                    if (ljVar == null) {
                        ljVar = C53370lj.f140047c;
                    }
                    C114546e a2 = fVar.mo101404a(ljVar, m);
                    C114542a aVar = new C114542a();
                    aVar.f317636a = new C58759qy(C53365le.CONVERSATION_STARTERS);
                    C114545d a3 = aVar.mo101396a();
                    C53407mt mtVar2 = nhVar.f140187d;
                    if (mtVar2 == null) {
                        mtVar2 = C53407mt.f140139d;
                    }
                    C53368lh lhVar = mtVar2.f140142b;
                    if (lhVar == null) {
                        lhVar = C53368lh.f140044b;
                    }
                    C58833ax b = a2.mo101402b(lhVar, a3);
                    if (b.mo56113h()) {
                        C53366lf lfVar = (C53366lf) b.mo56107c();
                        if (lfVar.f140037b == 3) {
                            lpVar = (C53376lp) lfVar.f140038c;
                        } else {
                            lpVar = C53376lp.f140063c;
                        }
                        C53430np npVar = lpVar.f140066b;
                        if (npVar == null) {
                            npVar = C53430np.f140222e;
                        }
                        axVar2 = C58833ax.m90834k(npVar.f140225b);
                        agVar.mo5708l((List) axVar2.mo56111f());
                    }
                }
                axVar2 = C58836b.f156633a;
                agVar.mo5708l((List) axVar2.mo56111f());
            }
        }
    }
}
