package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8739g;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87844fr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87845fs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87848fv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87878gy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87879gz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87881ha;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87882hb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87883hc;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protos.p5146w.p5147a.p5148a.C65925c;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5149b.p5157c.C65952b;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.g.a */
/* compiled from: PG */
public final /* synthetic */ class C116954a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C87848fv f324684a;

    public /* synthetic */ C116954a(C87848fv fvVar) {
        this.f324684a = fvVar;
    }

    public final Object apply(Object obj) {
        C87848fv fvVar = this.f324684a;
        try {
            ByteBuffer c = ((C89057m) obj).mo83034a().mo83032c();
            if (!c.hasRemaining()) {
                return null;
            }
            try {
                C62971cq cqVar = ((C65952b) C62942bv.parseFrom((C62942bv) C65952b.f179381b, c, C62921ba.m95368a())).f179383a;
                C87879gz gzVar = (C87879gz) C87883hc.f237745d.createBuilder();
                C65925c cVar = (C65925c) C65926d.f179289b.createBuilder();
                cVar.mo59439a(cqVar);
                gzVar.copyOnWrite();
                C87883hc hcVar = (C87883hc) gzVar.instance;
                C65926d dVar = (C65926d) cVar.build();
                dVar.getClass();
                hcVar.f237749c = dVar;
                hcVar.f237747a |= 1;
                for (int i = 0; i < Math.min(cqVar.size(), 10); i++) {
                    C65930h hVar = (C65930h) cqVar.get(i);
                    C87881ha haVar = (C87881ha) C87882hb.f237739e.createBuilder();
                    C65928f fVar = hVar.f179304c;
                    if (fVar == null) {
                        fVar = C65928f.f179293f;
                    }
                    String str = fVar.f179296b;
                    haVar.copyOnWrite();
                    C87882hb hbVar = (C87882hb) haVar.instance;
                    str.getClass();
                    hbVar.f237741a |= 1;
                    hbVar.f237742b = str;
                    C65928f fVar2 = hVar.f179304c;
                    if (fVar2 == null) {
                        fVar2 = C65928f.f179293f;
                    }
                    int i2 = fVar2.f179298d;
                    haVar.copyOnWrite();
                    C87882hb hbVar2 = (C87882hb) haVar.instance;
                    hbVar2.f237741a |= 4;
                    hbVar2.f237744d = i2;
                    String str2 = hVar.f179308g;
                    haVar.copyOnWrite();
                    C87882hb hbVar3 = (C87882hb) haVar.instance;
                    str2.getClass();
                    hbVar3.f237741a |= 2;
                    hbVar3.f237743c = str2;
                    gzVar.copyOnWrite();
                    C87883hc hcVar2 = (C87883hc) gzVar.instance;
                    C87882hb hbVar4 = (C87882hb) haVar.build();
                    hbVar4.getClass();
                    C62971cq cqVar2 = hcVar2.f237748b;
                    if (!cqVar2.mo58948c()) {
                        hcVar2.f237748b = C62942bv.mutableCopy(cqVar2);
                    }
                    hcVar2.f237748b.add(hbVar4);
                }
                C87844fr frVar = (C87844fr) C87845fs.f237675c.createBuilder();
                int i3 = fvVar.f237684b;
                frVar.copyOnWrite();
                C87845fs fsVar = (C87845fs) frVar.instance;
                fsVar.f237677a |= 1;
                fsVar.f237678b = i3;
                frVar.mo58885m(C87878gy.f237738a, (C87883hc) gzVar.build());
                return (C87845fs) frVar.build();
            } catch (C62974ct e) {
                C59104x c2 = C116955b.f324685a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "sb.r.ImCarEvtHdlr");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(32526)).mo56386p("Exception while parsing Image Search protos.");
                return null;
            }
        } catch (IOException e2) {
            C59104x c3 = C116955b.f324685a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "sb.r.ImCarEvtHdlr");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(32527)).mo56386p("Exception while fetching Image Search results.");
            return null;
        }
    }
}
