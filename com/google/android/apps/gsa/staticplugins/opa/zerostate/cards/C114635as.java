package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.os.Handler;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.assistant.p3994s.p3995a.C53117c;
import com.google.assistant.p3994s.p3995a.C53198f;
import com.google.assistant.p3994s.p3995a.C53278hz;
import com.google.assistant.p3994s.p3995a.C53280ia;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.assistant.p3994s.p3995a.C53426nl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.as */
/* compiled from: PG */
public final /* synthetic */ class C114635as implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C114640ax f318024a;

    /* renamed from: b */
    public final /* synthetic */ C53287ih f318025b;

    public /* synthetic */ C114635as(C114640ax axVar, C53287ih ihVar) {
        this.f318024a = axVar;
        this.f318025b = ihVar;
    }

    public final void run() {
        C53420nf nfVar;
        C53426nl nlVar;
        C114640ax axVar = this.f318024a;
        C53287ih ihVar = this.f318025b;
        try {
            C53366lf a = axVar.f318032c.mo101573a();
            if (a.f140037b == 4) {
                nfVar = (C53420nf) a.f140038c;
            } else {
                nfVar = C53420nf.f140165o;
            }
            if (nfVar.f140168b == 1) {
                nlVar = (C53426nl) nfVar.f140169c;
            } else {
                nlVar = C53426nl.f140205h;
            }
            String str = ((C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, nlVar.f140208b, C62921ba.m95368a())).f142249e;
            if ((ihVar.f139695a & 2) != 0) {
                C53280ia iaVar = ihVar.f139699e;
                if (iaVar == null) {
                    iaVar = C53280ia.f139686c;
                }
                for (C53198f c : iaVar.f139688a) {
                    axVar.f318036g.mo101686c(c, str);
                }
                for (C53278hz hzVar : iaVar.f139689b) {
                    String str2 = hzVar.f139682a;
                    axVar.f318036g.mo101685a(str + "/" + str2, C59326i.f157517e.mo56836k(hzVar.f139683b));
                }
            } else {
                C53117c cVar = (C53117c) C53198f.f139423d.createBuilder();
                cVar.copyOnWrite();
                C53198f fVar = (C53198f) cVar.instance;
                fVar.f139426b = 1;
                fVar.f139425a = 1 | fVar.f139425a;
                axVar.f318036g.mo101686c((C53198f) cVar.build(), str);
            }
            if (axVar.f318034e.mo79746e(C90080ee.f249807f)) {
                new Handler().postDelayed(new C114638av(axVar), axVar.f318034e.mo79743a(C90080ee.f249808g));
            }
        } catch (C62974ct e) {
            C59104x c2 = C114640ax.f318030a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ZSElementsCard");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(29293)).mo56386p("Failed to parse proto");
        }
    }
}
