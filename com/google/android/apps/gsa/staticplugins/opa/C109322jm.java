package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.apps.gsa.p8839t.p8847h.C118449y;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88142qs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88144qu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.util.C113854ci;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114890v;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53407mt;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.assistant.p3994s.p3995a.C53430np;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.jm */
/* compiled from: PG */
public final class C109322jm implements C87682aj {

    /* renamed from: a */
    public static final C59071e f304515a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.jm");

    /* renamed from: b */
    public final C68214a f304516b;

    /* renamed from: c */
    public final C68214a f304517c;

    /* renamed from: d */
    public final C68214a f304518d;

    /* renamed from: e */
    public final C22871g f304519e;

    /* renamed from: f */
    public final C86124t f304520f;

    /* renamed from: g */
    public boolean f304521g;

    /* renamed from: h */
    private final C108230ba f304522h;

    /* renamed from: i */
    private final C68214a f304523i;

    /* renamed from: j */
    private final C118426bs f304524j;

    /* renamed from: k */
    private final C118449y f304525k;

    public C109322jm(C108230ba baVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C22871g gVar, C86124t tVar, C118426bs bsVar, C118449y yVar) {
        this.f304522h = baVar;
        this.f304523i = aVar;
        this.f304516b = aVar2;
        this.f304517c = aVar3;
        this.f304518d = aVar4;
        this.f304519e = gVar;
        this.f304520f = tVar;
        this.f304524j = bsVar;
        this.f304525k = yVar;
    }

    /* renamed from: d */
    private final void m181979d(List list, boolean z) {
        int size;
        if (!list.isEmpty()) {
            C108230ba baVar = this.f304522h;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= list.size()) {
                    size = list.size();
                    break;
                }
                if (!((C108430ik) list.get(i)).f301614u) {
                    i2++;
                }
                if (i2 == 7) {
                    size = i + 1;
                    break;
                }
                i++;
            }
            baVar.mo95361C(list.subList(0, size));
            if (z) {
                ((C113854ci) this.f304523i.mo27525b()).mo100700a(8, C89849ae.OPA_ANDROID_STARTUP_CONVERSATION_STARTER_SHOWN_FROM_CACHE);
            } else {
                ((C113854ci) this.f304523i.mo27525b()).mo100700a(8, C89849ae.OPA_ANDROID_STARTUP_CONVERSATION_STARTER_SHOWN);
            }
            this.f304521g = true;
        }
    }

    /* renamed from: a */
    public final void mo97762a(C123746bm bmVar, boolean z) {
        C53430np npVar;
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        for (C123744bk bkVar : bmVar.f341820a) {
            C114890v vVar = (C114890v) this.f304517c.mo27525b();
            if (bkVar.f341808c == 24) {
                npVar = (C53430np) bkVar.f341809d;
            } else {
                npVar = C53430np.f140222e;
            }
            arrayList.addAll(vVar.mo101687a(npVar, e.A));
        }
        m181979d(arrayList, z);
    }

    /* renamed from: b */
    public final void mo97763b(C53422nh nhVar, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C53407mt mtVar = nhVar.f140187d;
        if (mtVar == null) {
            mtVar = C53407mt.f140139d;
        }
        if ((mtVar.f140141a & 1) != 0) {
            m181979d((List) ((C109317jh) this.f304518d.mo27525b()).mo97760c(nhVar).mo56106b(new C109319jj(this)).mo56109e(C58485gu.m89845m()), z);
        }
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C58976aa aaVar = C58975e.f156826a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a != C88244um.OPA_ZERO_STATE_RESPONSE) {
            int i = serviceEventData.f236959a.f238699b;
        } else if (!this.f304521g) {
            C62940bt btVar = C88142qs.f238266a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (uoVar.f169962ag.mo58857o(r0.f169971d)) {
                try {
                    C53422nh nhVar = (C53422nh) C62942bv.parseFrom((C62942bv) C53422nh.f140182m, ((C88144qu) serviceEventData.mo81918e(C88142qs.f238266a)).f238270b, C62921ba.m95368a());
                    if (this.f304520f.mo79746e(C90069du.f249731i)) {
                        C58487gw c = this.f304524j.mo103692c(nhVar);
                        if (c.map.containsKey(24)) {
                            C118364f fVar = (C118364f) C118365g.f328542b.createBuilder();
                            fVar.mo103679a(c.mo55277g(24));
                            this.f304519e.mo28212l("CachedPcp", new C109318ji(this, this.f304525k.mo103703a((C118365g) fVar.build(), C53306j.INPUT_PLATE, C123777f.f341922a)));
                            return;
                        }
                        return;
                    }
                    mo97763b(nhVar, false);
                } catch (C62974ct e) {
                    C59104x d = f304515a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "InputStateChipsCtrl");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(22845)).mo56386p("#onServiceEvent(): failed to parse ZeroStateClientResponse proto with error");
                }
            }
        }
    }
}
